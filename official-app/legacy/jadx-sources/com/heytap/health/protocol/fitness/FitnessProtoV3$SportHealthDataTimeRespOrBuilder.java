package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV3$SportHealthDataTimeRespOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV3$TimeItem getData(int i);

    int getDataCount();

    List<FitnessProtoV3$TimeItem> getDataList();
}
