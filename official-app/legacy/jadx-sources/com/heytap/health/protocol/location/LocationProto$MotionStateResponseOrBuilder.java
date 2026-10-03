package com.heytap.health.protocol.location;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface LocationProto$MotionStateResponseOrBuilder extends MessageLiteOrBuilder {
    String getResponseId();

    ByteString getResponseIdBytes();

    int getState();
}
