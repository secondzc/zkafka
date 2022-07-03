package com.zhangcy.zkafka.core.controller.handler;

import com.zhangcy.zkafka.core.controller.ControllerEventManager;

public class PreferredReplicaElectionHandler {
    private ControllerEventManager eventManager;

    public PreferredReplicaElectionHandler(ControllerEventManager eventManager) {
        this.eventManager = eventManager;
    }
}
