package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$SettingsEnableData getDisableInLunchBreak();

    FitnessProtoV2$SettingsEnableData getResumeActivityReminder();

    FitnessProtoV2$SettingsEnableData getSedentarySwitch();

    boolean hasDisableInLunchBreak();

    boolean hasResumeActivityReminder();

    boolean hasSedentarySwitch();
}
