package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$WristTemperatureStatisticsDataV2OrBuilder extends MessageLiteOrBuilder {
    int getEndTime();

    boolean getHasMore();

    FitnessProto$WristTemperatureIndex getRecords(int i);

    int getRecordsCount();

    List<FitnessProto$WristTemperatureIndex> getRecordsList();

    int getStartTime();
}
