package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$health_single_cellOrBuilder extends MessageLiteOrBuilder {
    RecommendProto$blood_pressure_data getBloodPreData();

    RecommendProto$BASE_CELL_ID getHealthId();

    int getHealthIdValue();

    RecommendProto$HEALTH_CELL_STATUS getHealthLevel();

    int getHealthLevelValue();

    int getHealthValue();

    RecommendProto$NORMAL_STATUS getIsNor();

    int getIsNorValue();

    boolean hasBloodPreData();
}
