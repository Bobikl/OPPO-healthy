package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$BloodSugarDataOrBuilder extends MessageLiteOrBuilder {
    int getIndex();

    FitnessProto$BloodSugarRecord getRecords(int i);

    int getRecordsCount();

    List<FitnessProto$BloodSugarRecord> getRecordsList();
}
