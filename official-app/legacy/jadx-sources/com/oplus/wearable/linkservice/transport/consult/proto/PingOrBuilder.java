package com.oplus.wearable.linkservice.transport.consult.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface PingOrBuilder extends MessageLiteOrBuilder {
    long getEndTime();

    ByteString getPayload();

    long getResponseTime();

    long getSendTime();
}
