package com.zhangcy.zkafka.clients.common;

public class Node {
    private final int id;
    private final String idString;
    private final String host;
    private final int port;
    private final String rack;

    public Node(int id, String idString, String host, int port, String rack) {
        this.id = id;
        this.idString = idString;
        this.host = host;
        this.port = port;
        this.rack = rack;
    }
}
