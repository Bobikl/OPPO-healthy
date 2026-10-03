package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SportRecordFilePBOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$SportRecordDetailData getDetailData();

    FitnessProtoV2$SportRecordGpsData getGpsData();

    int getOsType();

    FitnessProtoV2$RecoveryHeartRateData getRecoveryHeartRate();

    FitnessProtoV2$SegmentData getSegmentData();

    String getSportId();

    ByteString getSportIdBytes();

    boolean hasDetailData();

    boolean hasGpsData();

    boolean hasRecoveryHeartRate();

    boolean hasSegmentData();
}
