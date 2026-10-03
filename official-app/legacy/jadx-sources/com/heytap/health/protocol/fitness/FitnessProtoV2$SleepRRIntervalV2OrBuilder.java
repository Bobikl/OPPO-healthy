package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SleepRRIntervalV2OrBuilder extends MessageLiteOrBuilder {
    FitnessProto$SleepRRIntervalItem getData(int i);

    int getDataCount();

    List<FitnessProto$SleepRRIntervalItem> getDataList();

    int getEndTime();

    boolean getHasMore();

    int getStartTime();
}
