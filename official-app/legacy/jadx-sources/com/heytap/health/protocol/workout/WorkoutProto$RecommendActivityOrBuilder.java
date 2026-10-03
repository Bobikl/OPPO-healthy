package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$RecommendActivityOrBuilder extends MessageLiteOrBuilder {
    int getCurActivity();

    WorkoutProto$ActivityRecommendedZone getIntv();

    WorkoutProto$SportsPurpose getPurpose();

    boolean hasCurActivity();

    boolean hasIntv();

    boolean hasPurpose();
}
