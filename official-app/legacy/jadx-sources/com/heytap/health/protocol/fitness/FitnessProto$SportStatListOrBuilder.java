package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$SportStatListOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$SportStatData getData(int i);

    int getDataCount();

    List<FitnessProto$SportStatData> getDataList();
}
