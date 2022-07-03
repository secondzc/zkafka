package com.zhangcy.zkafka.core.controller.handler;

import com.zhangcy.zkafka.core.controller.ControllerEventManager;

public class TopicChangeHandler {
    private ControllerEventManager eventManager;

    public TopicChangeHandler(ControllerEventManager eventManager) {
        this.eventManager = eventManager;
    }
}
