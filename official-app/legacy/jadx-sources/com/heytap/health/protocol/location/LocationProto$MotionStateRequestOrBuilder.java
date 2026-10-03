package com.heytap.health.protocol.location;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface LocationProto$MotionStateRequestOrBuilder extends MessageLiteOrBuilder {
    int getDuration();

    String getRequestId();

    ByteString getRequestIdBytes();
}
