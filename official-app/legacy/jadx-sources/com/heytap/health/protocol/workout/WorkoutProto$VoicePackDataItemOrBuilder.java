package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$VoicePackDataItemOrBuilder extends MessageLiteOrBuilder {
    int getVersion();

    String getVoicePackName();

    ByteString getVoicePackNameBytes();
}
