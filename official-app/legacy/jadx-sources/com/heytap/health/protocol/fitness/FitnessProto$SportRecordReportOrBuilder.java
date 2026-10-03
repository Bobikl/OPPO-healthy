package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$SportRecordReportOrBuilder extends MessageLiteOrBuilder {
    int getAchievePercent();

    int getAvgFrequency();

    int getAvgHeartRate();

    int getAvgSpeed();

    int getEndTime();

    String getExtra();

    ByteString getExtraBytes();

    int getMaxSpeed();

    String getSportId();

    ByteString getSportIdBytes();

    String getSportName();

    ByteString getSportNameBytes();

    int getSportType();

    int getStartTime();

    String getTimeZone();

    ByteString getTimeZoneBytes();

    int getTotalCalories();

    int getTotalDistance();

    int getTotalHeight();

    int getTotalSteps();

    int getTotalTime();
}
