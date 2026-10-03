package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$Achievement getAchievementData();

    int getAvgHrv();

    int getAvgStressState();

    int getAvgStressValue();

    int getDayStartTime();

    boolean hasAchievementData();
}
