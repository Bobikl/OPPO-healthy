package com.oplus.wearable.linkservice.transport.consult.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface PingOrBuilder extends MessageLiteOrBuilder {
    long getEndTime();

    ByteString getPayload();

    long getResponseTime();

    long getSendTime();
}
