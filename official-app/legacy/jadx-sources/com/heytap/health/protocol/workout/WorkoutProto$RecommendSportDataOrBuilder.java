package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$RecommendSportDataOrBuilder extends MessageLiteOrBuilder {
    int getCurActivity();

    WorkoutProto$RecommendSportArr getSports();

    boolean hasCurActivity();

    boolean hasSports();
}
