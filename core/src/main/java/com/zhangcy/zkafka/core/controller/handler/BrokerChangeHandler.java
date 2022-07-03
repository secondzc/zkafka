package com.zhangcy.zkafka.core.controller.handler;

import com.zhangcy.zkafka.core.controller.ControllerEventManager;

public class BrokerChangeHandler {
    private ControllerEventManager eventManager;

    public BrokerChangeHandler(ControllerEventManager eventManager) {
        this.eventManager = eventManager;
    }
}
