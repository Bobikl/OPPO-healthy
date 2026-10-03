package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$ExerciseStatsResponseOrBuilder extends MessageLiteOrBuilder {
    int getCorrectIndex();

    String getPackageName();

    ByteString getPackageNameBytes();

    Exercise$ExerciseStatsResState getState();

    int getStateValue();
}
