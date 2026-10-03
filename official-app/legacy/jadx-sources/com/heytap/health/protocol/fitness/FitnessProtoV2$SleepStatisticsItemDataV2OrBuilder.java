package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder extends MessageLiteOrBuilder {
    int getAvgSleepSpo2();

    FitnessProtoV2$SleepStatisticsCommonData getBreatheData();

    int getDateTime();

    FitnessProtoV2$SleepStatisticsCommonData getHeartData();

    String getHeartRateWarningLabel();

    ByteString getHeartRateWarningLabelBytes();

    FitnessProtoV2$SleepStatisticsCommonData getHrvData();

    FitnessProto$SleepBedTimeData getSleepBed(int i);

    int getSleepBedCount();

    List<FitnessProto$SleepBedTimeData> getSleepBedList();

    int getSleepBedTime();

    int getSleepBurden();

    int getSleepDuration();

    int getSleepOutbedTime();

    int getSleepRecoveryDiffValue();

    int getSleepRecoveryRate();

    int getSleepScore();

    int getSnoreRisk();

    boolean hasBreatheData();

    boolean hasHeartData();

    boolean hasHrvData();
}
