package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SunlightListOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$SunlightItem getData(int i);

    int getDataCount();

    List<FitnessProtoV2$SunlightItem> getDataList();

    int getEndTime();

    boolean getHasMore();

    int getStartTime();
}
