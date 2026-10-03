package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$AchievementExpandOrBuilder extends MessageLiteOrBuilder {
    int getCalorie();

    int getCalorieGoal();

    int getExerciseDuration();

    int getExerciseDurationGoal();

    int getIsSkipToday();

    int getRegularBedtime();

    int getRegularBedtimeGoal();

    int getSkipTodayReason();

    int getSunshineDuration();

    int getSunshineDurationGoal();

    FitnessProtoV2$AchievementType getTargetDisplayConfig(int i);

    int getTargetDisplayConfigCount();

    List<FitnessProtoV2$AchievementType> getTargetDisplayConfigList();

    int getTargetDisplayConfigValue(int i);

    List<Integer> getTargetDisplayConfigValueList();
}
