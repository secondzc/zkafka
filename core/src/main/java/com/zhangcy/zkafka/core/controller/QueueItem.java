package com.zhangcy.zkafka.core.controller;

import com.zhangcy.zkafka.clients.common.requests.AbstractResponse;
import com.zhangcy.zkafka.clients.common.requests.AbstractControlRequest;

public class QueueItem {
    private AbstractControlRequest request;
    private AbstractResponse callback;
}
