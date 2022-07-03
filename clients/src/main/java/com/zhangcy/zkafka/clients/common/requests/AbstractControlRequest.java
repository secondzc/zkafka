package com.zhangcy.zkafka.clients.common.requests;

public class AbstractControlRequest {
    protected final int controllerId;
    protected final int controllerEpoch;
    protected final long brokerEpoch;

    public AbstractControlRequest(int controllerId, int controllerEpoch, long brokerEpoch) {
        this.controllerId = controllerId;
        this.controllerEpoch = controllerEpoch;
        this.brokerEpoch = brokerEpoch;
    }
}
