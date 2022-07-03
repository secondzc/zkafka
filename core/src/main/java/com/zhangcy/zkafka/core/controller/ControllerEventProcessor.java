package com.zhangcy.zkafka.core.controller;

public interface ControllerEventProcessor {
    void process(ControllerEventEnum event);
}
