package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$VoicePackDataOrBuilder extends MessageLiteOrBuilder {
    WorkoutProto$VoicePackDataItem getData(int i);

    int getDataCount();

    List<WorkoutProto$VoicePackDataItem> getDataList();
}
