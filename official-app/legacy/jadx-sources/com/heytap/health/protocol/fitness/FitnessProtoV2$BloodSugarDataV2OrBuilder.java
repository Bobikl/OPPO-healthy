package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$BloodSugarDataV2OrBuilder extends MessageLiteOrBuilder {
    int getEndTime();

    boolean getHasMore();

    FitnessProto$BloodSugarRecord getRecords(int i);

    int getRecordsCount();

    List<FitnessProto$BloodSugarRecord> getRecordsList();

    int getStartTime();
}
