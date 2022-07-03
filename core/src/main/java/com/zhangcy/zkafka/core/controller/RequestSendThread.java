package com.zhangcy.zkafka.core.controller;

import com.zhangcy.zkafka.core.utils.ShutdownableThread;

public class RequestSendThread extends ShutdownableThread {
    public RequestSendThread(String name, Boolean isInterruptible) {
        super(name, isInterruptible);
    }
}
