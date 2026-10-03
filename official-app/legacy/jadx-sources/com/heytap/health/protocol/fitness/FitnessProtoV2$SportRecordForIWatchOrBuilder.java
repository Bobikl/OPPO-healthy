package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SportRecordForIWatchOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$SportRecordDetailData getDetailData();

    FitnessProtoV2$SportRecordGpsData getGpsData();

    FitnessProto$SportRecordReport getReport();

    boolean hasDetailData();

    boolean hasGpsData();

    boolean hasReport();
}
