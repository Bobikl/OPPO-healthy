package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$BloodSugarNoticeDataV2OrBuilder extends MessageLiteOrBuilder {
    int getEndTime();

    boolean getHasMore();

    FitnessProto$BloodSugarNoticeRecord getRecords(int i);

    int getRecordsCount();

    List<FitnessProto$BloodSugarNoticeRecord> getRecordsList();

    int getStartTime();
}
