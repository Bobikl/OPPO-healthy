package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$StressSettingsDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$SettingsEnableData getStressHighNotify();

    FitnessProtoV2$SettingsEnableData getStressSwitch();

    boolean hasStressHighNotify();

    boolean hasStressSwitch();
}
