package com.zhangcy.zkafka.core.controller;

import com.zhangcy.zkafka.clients.common.Node;
import lombok.Data;

import java.util.concurrent.BlockingQueue;

@Data
public class ControllerBrokerStateInfo {
    private Node brokerNode;
    private BlockingQueue<QueueItem> messageQueue;
    private RequestSendThread requestSendThread;
}
