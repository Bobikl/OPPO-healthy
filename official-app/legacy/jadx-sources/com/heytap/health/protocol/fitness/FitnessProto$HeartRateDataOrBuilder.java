package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$HeartRateDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$HeartRateItem getData(int i);

    int getDataCount();

    List<FitnessProto$HeartRateItem> getDataList();

    int getIndex();

    int getInterval();

    int getStartTime();
}
