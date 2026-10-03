package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SportStatListV2OrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$SportStatDataV2 getData(int i);

    int getDataCount();

    List<FitnessProtoV2$SportStatDataV2> getDataList();

    int getEndTime();

    boolean getHasMore();

    int getStartTime();
}
