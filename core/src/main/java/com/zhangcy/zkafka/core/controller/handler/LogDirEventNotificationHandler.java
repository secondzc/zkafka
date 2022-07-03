package com.zhangcy.zkafka.core.controller.handler;

import com.zhangcy.zkafka.core.controller.ControllerEventManager;

public class LogDirEventNotificationHandler {
    private ControllerEventManager eventManager;

    public LogDirEventNotificationHandler(ControllerEventManager eventManager) {
        this.eventManager = eventManager;
    }
}
