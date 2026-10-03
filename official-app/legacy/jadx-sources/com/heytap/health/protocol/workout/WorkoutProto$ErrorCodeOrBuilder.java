package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$ErrorCodeOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    String getExtraData();

    ByteString getExtraDataBytes();
}
