package com.zhangcy.zkafka.core.controller.handler;

import com.zhangcy.zkafka.core.controller.ControllerEventManager;

public class PartitionReassignmentHandler {
    private ControllerEventManager eventManager;

    public PartitionReassignmentHandler(ControllerEventManager eventManager) {
        this.eventManager = eventManager;
    }
}
