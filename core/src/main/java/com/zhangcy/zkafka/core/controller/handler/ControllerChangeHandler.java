package com.zhangcy.zkafka.core.controller.handler;

import com.zhangcy.zkafka.core.controller.ControllerEventManager;
import com.zhangcy.zkafka.core.zk.ZNodeChangeHandler;

public class ControllerChangeHandler extends ZNodeChangeHandler {
    private ControllerEventManager eventManager;

    public ControllerChangeHandler(ControllerEventManager eventManager) {
        this.eventManager = eventManager;
    }
}
