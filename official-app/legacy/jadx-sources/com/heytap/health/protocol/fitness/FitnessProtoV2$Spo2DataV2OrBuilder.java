package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$Spo2DataV2OrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$Spo2ItemDataV2 getData(int i);

    int getDataCount();

    List<FitnessProtoV2$Spo2ItemDataV2> getDataList();

    int getEndTime();

    boolean getHasMore();

    int getStartTime();
}
