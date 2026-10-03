package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$DataChangedNotifyOrBuilder extends MessageLiteOrBuilder {
    int getDataChangeTime();

    int getDataType();

    String getExtra();

    ByteString getExtraBytes();
}
