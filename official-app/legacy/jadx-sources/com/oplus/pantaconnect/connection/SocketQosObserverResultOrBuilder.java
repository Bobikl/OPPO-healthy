package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface SocketQosObserverResultOrBuilder extends MessageOrBuilder {
    String getDeviceId();

    ByteString getDeviceIdBytes();

    SocketQosObserverEvent getEvent();

    int getEventValue();

    SocketQosResult getSocketQosResult();

    SocketQosResultOrBuilder getSocketQosResultOrBuilder();

    boolean hasSocketQosResult();
}
