package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$WristTemperatureIndexPacketOrBuilder extends MessageLiteOrBuilder {
    int getIndex();

    FitnessProto$WristTemperatureIndex getRecords(int i);

    int getRecordsCount();

    List<FitnessProto$WristTemperatureIndex> getRecordsList();
}
