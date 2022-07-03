package com.zhangcy.zkafka.core.controller;

public enum ControllerStateEnum {
    CONTROLLER_CHANGE((byte) 1),
    CONTROLLER_SHUTDOWN((byte) 2),
    CONTROLLED_SHUTDOWN((byte) 3),
    UPDATE_METADATA_RESPONSE_RECEIVED((byte) 4),
    TOPIC_DELETION((byte) 5),
    BROKER_CHANGE((byte) 6),
    TOPIC_CHANGE((byte) 7),
    ISR_CHANGE((byte) 8),
    LEADER_AND_ISR_RESPONSE_RECEIVED((byte) 3),
    ;

    ControllerStateEnum(Byte value) {
        this.value = value;
    }

    private Byte value;
}
