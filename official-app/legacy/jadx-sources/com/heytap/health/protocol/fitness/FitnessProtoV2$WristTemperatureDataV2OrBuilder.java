package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$WristTemperatureDataV2OrBuilder extends MessageLiteOrBuilder {
    int getEndTime();

    boolean getHasMore();

    FitnessProto$WristTemperatureRecord getRecords(int i);

    int getRecordsCount();

    List<FitnessProto$WristTemperatureRecord> getRecordsList();

    int getStartTime();
}
