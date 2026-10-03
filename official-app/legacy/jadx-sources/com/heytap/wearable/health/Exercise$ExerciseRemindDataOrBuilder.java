package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$ExerciseRemindDataOrBuilder extends MessageLiteOrBuilder {
    Exercise$ExerciseActionData getActionData();

    String getPackageName();

    ByteString getPackageNameBytes();

    Exercise$ExerciseRemindData.PayloadCase getPayloadCase();

    Exercise$ExerciseRemindType getRemindType();

    int getRemindTypeValue();

    boolean hasActionData();
}
