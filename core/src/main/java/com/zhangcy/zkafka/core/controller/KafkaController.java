package com.zhangcy.zkafka.core.controller;

import com.google.common.collect.Maps;
import com.zhangcy.zkafka.core.controller.handler.*;
import com.zhangcy.zkafka.core.server.KafkaConfig;
import com.zhangcy.zkafka.core.utils.KafkaScheduler;
import com.zhangcy.zkafka.core.zk.KafkaZkClient;

import java.util.Map;

public class KafkaController implements ControllerEventProcessor{
    private ControllerContext controllerContext;
    private ControllerChannelManager controllerChannelManager;
    private KafkaScheduler kafkaScheduler;
    private ControllerEventManager eventManager;
    private ReplicaStateMachine replicaStateMachine;
    private PartitionStateMachine partitionStateMachine;
    private TopicDeletionManager topicDeletionManager;

    private ControllerChangeHandler controllerChangeHandler;
    private BrokerChangeHandler brokerChangeHandler;
    private Map<Integer, BrokerModificationsHandler> brokerModificationsHandlers;
    private TopicChangeHandler topicChangeHandler;
    private TopicDeletionHandler topicDeletionHandler;
    private Map<String, PartitionModificationsHandler> partitionModificationsHandlers;
    private PartitionReassignmentHandler partitionReassignmentHandler;
    private PreferredReplicaElectionHandler preferredReplicaElectionHandler;
    private IsrChangeNotificationHandler isrChangeNotificationHandler;
    private LogDirEventNotificationHandler logDirEventNotificationHandler;


    public KafkaController(KafkaConfig config, KafkaZkClient zkClient, Long initialBrokerEpoch) {
        ControllerEventManager eventManager = new ControllerEventManager();
        ControllerChangeHandler controllerChangeHandler = new ControllerChangeHandler(eventManager);
        BrokerChangeHandler brokerChangeHandler = new BrokerChangeHandler(eventManager);
        Map<Integer, BrokerModificationsHandler> brokerModificationsHandlers = Maps.newHashMap();
        TopicChangeHandler topicChangeHandler = new TopicChangeHandler(eventManager);
        TopicDeletionHandler topicDeletionHandler = new TopicDeletionHandler(eventManager);
        Map<String, PartitionModificationsHandler> partitionModificationsHandlers = Maps.newHashMap();
        PartitionReassignmentHandler partitionReassignmentHandler = new PartitionReassignmentHandler(eventManager);
        PreferredReplicaElectionHandler preferredReplicaElectionHandler = new PreferredReplicaElectionHandler(eventManager);
        IsrChangeNotificationHandler isrChangeNotificationHandler = new IsrChangeNotificationHandler(eventManager);
        LogDirEventNotificationHandler logDirEventNotificationHandler = new LogDirEventNotificationHandler(eventManager);
    }

    @Override
    public void process(ControllerEventEnum event) {

    }
}
