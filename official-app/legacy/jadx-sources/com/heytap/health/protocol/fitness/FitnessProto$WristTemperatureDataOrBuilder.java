package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$WristTemperatureDataOrBuilder extends MessageLiteOrBuilder {
    int getIndex();

    FitnessProto$WristTemperatureRecord getRecords(int i);

    int getRecordsCount();

    List<FitnessProto$WristTemperatureRecord> getRecordsList();

    int getStartTime();
}
