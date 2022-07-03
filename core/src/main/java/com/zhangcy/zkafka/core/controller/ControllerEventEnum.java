package com.zhangcy.zkafka.core.controller;

public enum ControllerEventEnum {
    CONTROLLER_CHANGE(ControllerStateEnum.CONTROLLER_CHANGE),
    REELECT(ControllerStateEnum.CONTROLLER_CHANGE),
    SHUTDOWN_EVENT_THREAD(ControllerStateEnum.CONTROLLER_SHUTDOWN),
    CONTROLLED_SHUTDOWN(ControllerStateEnum.CONTROLLED_SHUTDOWN),
    LEADER_AND_ISR_RESPONSE_RECEIVED(ControllerStateEnum.LEADER_AND_ISR_RESPONSE_RECEIVED),
    UPDATE_METADATA_RESPONSE_RECEIVED(ControllerStateEnum.UPDATE_METADATA_RESPONSE_RECEIVED),
    TOPIC_DELETION_STOP_REPLICA_RESPONSE_RECEIVED(ControllerStateEnum.TOPIC_DELETION),
    TOPIC_DELETION(ControllerStateEnum.TOPIC_DELETION),
    BROKER_CHANGE(ControllerStateEnum.BROKER_CHANGE),
    BROKER_MODIFICATIONS(ControllerStateEnum.BROKER_CHANGE),
    TOPIC_CHANGE(ControllerStateEnum.TOPIC_CHANGE),
    TOPIC_MODIFICATIONS(ControllerStateEnum.TOPIC_CHANGE),
    ISR_CHANGE_NOTIFICATION(ControllerStateEnum.ISR_CHANGE),
    ;
    private ControllerStateEnum state;

    ControllerEventEnum(ControllerStateEnum state) {
        this.state = state;
    }
}
