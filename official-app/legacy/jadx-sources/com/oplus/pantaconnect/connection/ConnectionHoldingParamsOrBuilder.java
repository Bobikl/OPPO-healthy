package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ConnectionHoldingParamsOrBuilder extends MessageOrBuilder {
    int getConnectType();

    String getDeviceId();

    ByteString getDeviceIdBytes();

    boolean getIsForcedHolding();

    int getPid();
}
