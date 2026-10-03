package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface RawConnectParamsOrBuilder extends MessageOrBuilder {
    String getAddress();

    ByteString getAddressBytes();

    ConnectType getConnectType();

    int getConnectTypeValue();

    int getDeviceType();

    int getPort();

    long getTimeout();
}
