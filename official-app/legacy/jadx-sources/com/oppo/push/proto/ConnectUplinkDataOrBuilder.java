package com.oppo.push.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface ConnectUplinkDataOrBuilder extends MessageOrBuilder {
    String getClientId();

    ByteString getClientIdBytes();

    String getClientIp();

    ByteString getClientIpBytes();

    String getClientPort();

    ByteString getClientPortBytes();

    String getCmd();

    ByteString getCmdBytes();

    String getConnectIp();

    ByteString getConnectIpBytes();

    String getConnectPort();

    ByteString getConnectPortBytes();

    String getDataPayload();

    ByteString getDataPayloadBytes();

    String getMessageId();

    ByteString getMessageIdBytes();

    String getServerName();

    ByteString getServerNameBytes();

    String getSource();

    ByteString getSourceBytes();

    boolean hasClientId();

    boolean hasClientIp();

    boolean hasClientPort();

    boolean hasCmd();

    boolean hasConnectIp();

    boolean hasConnectPort();

    boolean hasDataPayload();

    boolean hasMessageId();

    boolean hasServerName();

    boolean hasSource();
}
