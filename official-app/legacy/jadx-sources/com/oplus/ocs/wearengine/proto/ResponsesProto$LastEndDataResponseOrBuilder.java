package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface ResponsesProto$LastEndDataResponseOrBuilder extends MessageLiteOrBuilder {
    DataProto$ExerciseUpdate getExerciseUpdates(int i);

    int getExerciseUpdatesCount();

    List<DataProto$ExerciseUpdate> getExerciseUpdatesList();
}
