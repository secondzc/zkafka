package com.zhangcy.zkafka.core.controller.handler;

import com.zhangcy.zkafka.core.controller.ControllerEventManager;

public class BrokerModificationsHandler {
    private ControllerEventManager eventManager;

    public BrokerModificationsHandler(ControllerEventManager eventManager) {
        this.eventManager = eventManager;
    }
}
