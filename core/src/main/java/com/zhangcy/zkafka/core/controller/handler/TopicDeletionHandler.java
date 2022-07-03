package com.zhangcy.zkafka.core.controller.handler;

import com.zhangcy.zkafka.core.controller.ControllerEventManager;

public class TopicDeletionHandler {
    private ControllerEventManager eventManager;

    public TopicDeletionHandler(ControllerEventManager eventManager) {
        this.eventManager = eventManager;
    }
}
