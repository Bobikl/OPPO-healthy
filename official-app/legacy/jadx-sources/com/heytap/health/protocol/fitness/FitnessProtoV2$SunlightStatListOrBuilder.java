package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SunlightStatListOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$SunlightStat getData(int i);

    int getDataCount();

    List<FitnessProtoV2$SunlightStat> getDataList();

    int getEndTime();

    boolean getHasMore();

    int getStartTime();
}
