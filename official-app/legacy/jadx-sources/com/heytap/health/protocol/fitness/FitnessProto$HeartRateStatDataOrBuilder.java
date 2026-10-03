package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$HeartRateStatDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$HeartRateStat getData(int i);

    int getDataCount();

    List<FitnessProto$HeartRateStat> getDataList();
}
