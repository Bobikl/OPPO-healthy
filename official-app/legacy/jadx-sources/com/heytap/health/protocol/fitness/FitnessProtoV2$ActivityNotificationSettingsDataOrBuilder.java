package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$ActivityNotificationSettingsDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$SettingsEnableData getActivityGoalComplete();

    FitnessProtoV2$SettingsEnableData getHealthDailyReport();

    FitnessProtoV2$SettingsEnableData getHealthWeekReport();

    boolean hasActivityGoalComplete();

    boolean hasHealthDailyReport();

    boolean hasHealthWeekReport();
}
