package com.zhangcy.zkafka.core.controller.handler;

import com.zhangcy.zkafka.core.controller.ControllerEventManager;

public class IsrChangeNotificationHandler {
    private ControllerEventManager eventManager;

    public IsrChangeNotificationHandler(ControllerEventManager eventManager) {
        this.eventManager = eventManager;
    }
}
