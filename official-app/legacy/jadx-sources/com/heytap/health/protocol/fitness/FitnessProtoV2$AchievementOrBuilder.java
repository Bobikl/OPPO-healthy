package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$AchievementOrBuilder extends MessageLiteOrBuilder {
    int getActivityCount();

    int getActivityCountGoal();

    int getDataVersion();

    FitnessProtoV2$AchievementExpand getExpandData();

    int getMedal();

    int getProgress();

    int getRelaxDuration();

    int getRelaxDurationGoal();

    int getSleepDuration();

    int getSleepDurationGoalMax();

    int getSleepDurationGoalMin();

    int getStep();

    int getStepGoal();

    int getVitalityAvg();

    int getVitalityGoal();

    boolean hasExpandData();
}
