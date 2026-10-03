package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface GetConnectionListParamsOrBuilder extends MessageOrBuilder {
    int getConnectorType();

    String getDeviceId();

    ByteString getDeviceIdBytes();
}
