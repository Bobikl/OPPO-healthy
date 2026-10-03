package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$ExerciseActionRequestOrBuilder extends MessageLiteOrBuilder {
    Exercise$ExerciseAction getExerciseAction();

    int getExerciseActionValue();

    String getPackageName();

    ByteString getPackageNameBytes();

    Exercise$ExerciseActionResource getResource();

    int getResourceValue();

    int getTimeStamp();
}
