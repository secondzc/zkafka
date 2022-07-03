package com.zhangcy.zkafka.core.controller.handler;

import com.zhangcy.zkafka.core.controller.ControllerEventManager;

public class PartitionModificationsHandler {
    private ControllerEventManager eventManager;

    public PartitionModificationsHandler(ControllerEventManager eventManager) {
        this.eventManager = eventManager;
    }
}
