package com.zhangcy.zkafka.core.utils;

import com.zhangcy.zkafka.clients.common.FatalExitError;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ShutdownableThread extends Thread {
    private CountDownLatch shutdownInitiated = new CountDownLatch(1);
    private CountDownLatch shutdownComplete = new CountDownLatch(1);
    private volatile Boolean isStarted = false;

    private String name;
    private Boolean isInterruptible;

    public ShutdownableThread(String name, Boolean isInterruptible) {
        this.name = name;
        this.isInterruptible = isInterruptible;
    }

    public void shutdown() throws InterruptedException {
        initiateShutdown();
        awaitShutdown();
    }

    private Boolean isShutdownInitiated() {
        return shutdownInitiated.getCount() == 0;
    }

    private Boolean isShutdownComplete() {
        return shutdownComplete.getCount() == 0;
    }

    public Boolean isThreadFailed() {
        return isShutdownComplete() && !isShutdownInitiated();
    }

    public Boolean initiateShutdown() {
        synchronized(this) {
            if (!isShutdownInitiated()) {
                log.info("Shutting down");
                shutdownInitiated.countDown();
                if (isInterruptible) {
                    interrupt();
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * After calling initiateShutdown(), use this API to wait until the shutdown is complete
     */
    public void awaitShutdown() throws InterruptedException {
        if (!isShutdownInitiated())
            throw new IllegalStateException("initiateShutdown() was not called before awaitShutdown()");
        else {
            if (isStarted) {
                shutdownComplete.await();
                log.info("Shutdown completed");
            }
        }
    }

    /**
     *  Causes the current thread to wait until the shutdown is initiated,
     *  or the specified waiting time elapses.
     *
     * @param timeout
     * @param unit
     */
    private void pause(Long timeout, TimeUnit unit) throws InterruptedException {
        shutdownInitiated.await(timeout, unit);
    }

    /**
     * This method is repeatedly invoked until the thread shuts down or this method throws an exception
     */
    protected void doWork() {}

    @Override
    public void run() {
        isStarted = true;
        try {
            while (!isShutdownInitiated()) {
                doWork();
            }
        } catch (Exception e) {
            log.error(ExceptionUtil.getStackTrace(e));
        } catch (FatalExitError e) {
            log.error(ExceptionUtil.getStackTrace(e));
            System.exit(0);
        } catch (Throwable e) {
            log.error(ExceptionUtil.getStackTrace(e));
            System.exit(0);
        } finally {
            shutdownComplete.countDown();
        }
        log.info("Stopped");
    }
}
