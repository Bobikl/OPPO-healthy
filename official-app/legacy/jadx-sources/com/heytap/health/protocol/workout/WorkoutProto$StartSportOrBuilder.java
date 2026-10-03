package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$StartSportOrBuilder extends MessageLiteOrBuilder {
    int getGoalType();

    int getGoalValue();

    int getSportType();

    WorkoutProto$sportStrength getStrength();

    int getTime();

    boolean hasStrength();
}
