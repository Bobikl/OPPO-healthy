package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$BreatheRateDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$BreatheRateDetailData getData(int i);

    int getDataCount();

    List<FitnessProto$BreatheRateDetailData> getDataList();

    int getIndex();

    int getStartTime();
}
