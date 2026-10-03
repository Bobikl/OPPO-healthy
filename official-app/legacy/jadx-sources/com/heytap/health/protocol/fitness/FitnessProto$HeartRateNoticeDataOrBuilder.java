package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$HeartRateNoticeDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$HeartRateContent getData(int i);

    int getDataCount();

    List<FitnessProto$HeartRateContent> getDataList();

    int getIndex();
}
