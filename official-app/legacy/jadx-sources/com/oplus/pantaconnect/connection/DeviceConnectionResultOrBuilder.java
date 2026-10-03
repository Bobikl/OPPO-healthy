package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface DeviceConnectionResultOrBuilder extends MessageOrBuilder {
    String getAddress();

    ByteString getAddressBytes();

    long getConnectionId();

    String getIp();

    ByteString getIpBytes();
}
