package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$PlanConfigOrBuilder extends MessageLiteOrBuilder {
    String getDietPlanBreakfastTime();

    ByteString getDietPlanBreakfastTimeBytes();

    String getDietPlanDinnerTime();

    ByteString getDietPlanDinnerTimeBytes();

    String getDietPlanLunchTime();

    ByteString getDietPlanLunchTimeBytes();

    int getDietPlanState();

    int getEveryAlarmState();

    String getEveryAlarmTime();

    ByteString getEveryAlarmTimeBytes();

    int getExcitationState();
}
