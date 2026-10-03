package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$RecommendSportArrOrBuilder extends MessageLiteOrBuilder {
    WorkoutProto$RecommendSport getSport(int i);

    int getSportCount();

    List<WorkoutProto$RecommendSport> getSportList();
}
