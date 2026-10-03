package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$ExerciseActionResponseOrBuilder extends MessageLiteOrBuilder {
    String getPackageName();

    ByteString getPackageNameBytes();

    Exercise$ExerciseStatus getStatus();

    int getStatusValue();
}
