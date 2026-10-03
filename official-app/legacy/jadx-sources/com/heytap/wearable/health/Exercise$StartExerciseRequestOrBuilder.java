package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$StartExerciseRequestOrBuilder extends MessageLiteOrBuilder {
    Exercise$ExerciseSetting getExerciseSetting();

    Exercise$ExerciseType getExerciseType();

    int getExerciseTypeValue();

    String getPackageName();

    ByteString getPackageNameBytes();

    Exercise$SampleConfig getSampleConfig();

    Exercise$DataTypeArray getSampleDataTypes();

    Exercise$StartExerciseType getStartExerciseType();

    int getStartExerciseTypeValue();

    Exercise$DataTypeArray getStatsDataTypes();

    int getTimeStamp();

    boolean hasExerciseSetting();

    boolean hasSampleConfig();

    boolean hasSampleDataTypes();

    boolean hasStatsDataTypes();
}
