package com.example.opponotificationrelay;

/** 手表传输抽象；当前由独立 OAF 连接实现。 */
public interface WearTransport {
    boolean isAvailable();

    void send(RelayPayloadEncoder.EventEnvelope event);
}
