package com.heytap.wearable.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface AFTransportOrBuilder extends MessageLiteOrBuilder {
    String getIp();

    ByteString getIpBytes();

    String getPort();

    ByteString getPortBytes();

    int getType();
}
