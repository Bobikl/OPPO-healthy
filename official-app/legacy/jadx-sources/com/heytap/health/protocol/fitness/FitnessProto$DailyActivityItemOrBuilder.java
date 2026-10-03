package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$DailyActivityItemOrBuilder extends MessageLiteOrBuilder {
    int getActivityCount();

    int getCalories();

    int getDate();

    int getExerciseTime();

    int getStepCount();

    String getUserId();

    ByteString getUserIdBytes();

    String getUserNickname();

    ByteString getUserNicknameBytes();
}
