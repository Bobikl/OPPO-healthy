package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$health_cellOrBuilder extends MessageLiteOrBuilder {
    RecommendProto$composite_cell getCData();

    RecommendProto$hrv_cell getHData();

    int getHealthData();

    RecommendProto$HEALTH_STATUS_ID getHealthId();

    int getHealthIdValue();

    RecommendProto$HEALTH_CELL_STATUS getHealthLevel();

    int getHealthLevelValue();

    RecommendProto$NORMAL_STATUS getIsNor();

    int getIsNorValue();

    RecommendProto$menstrual_cell getMData();

    RecommendProto$health_cell.PayloadCase getPayloadCase();

    RecommendProto$sleep_cell getSData();

    boolean hasCData();

    boolean hasHData();

    boolean hasHealthData();

    boolean hasMData();

    boolean hasSData();
}
