package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$SleepStatisticsDetailDataOrBuilder extends MessageLiteOrBuilder {
    int getAvgSleepBreatheRangHight();

    int getAvgSleepBreatheRangLow();

    int getAvgSleepHeartRate();

    int getAvgSleepSpo2();

    int getDateTime();

    String getHeartRateWarningLabel();

    ByteString getHeartRateWarningLabelBytes();

    FitnessProto$SleepBedTimeData getSleepBed(int i);

    int getSleepBedCount();

    List<FitnessProto$SleepBedTimeData> getSleepBedList();

    int getSleepHeartRateRangeHight();

    int getSleepHeartRateRangeLow();
}
