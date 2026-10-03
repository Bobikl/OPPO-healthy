package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$RelaxDetailDataV2OrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$RelaxItemV2 getData(int i);

    int getDataCount();

    List<FitnessProtoV2$RelaxItemV2> getDataList();

    int getEndTime();

    boolean getHasMore();

    int getStartTime();
}
