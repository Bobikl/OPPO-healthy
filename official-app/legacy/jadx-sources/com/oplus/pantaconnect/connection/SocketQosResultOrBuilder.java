package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface SocketQosResultOrBuilder extends MessageOrBuilder {
    int getBandWidth();

    int getDelay();

    int getPacketLossRate();

    String getPeerIp();

    ByteString getPeerIpBytes();

    int getRemoteRssi();

    int getRssi();

    SocketState getSocketState();

    int getSocketStateValue();
}
