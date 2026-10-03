package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$WeightDataOrBuilder extends MessageLiteOrBuilder {
    int getErrorCode();

    FitnessProto$WeightRecord getRecord(int i);

    int getRecordCount();

    List<FitnessProto$WeightRecord> getRecordList();
}
