package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface LanConnectionHoldingParamsOrBuilder extends MessageOrBuilder {
    String getDeviceId();

    ByteString getDeviceIdBytes();

    boolean getIsForcedHolding();
}
