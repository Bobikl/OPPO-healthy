package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$ActivityDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$ActivityItem getData(int i);

    int getDataCount();

    List<FitnessProto$ActivityItem> getDataList();

    int getIndex();

    int getStartTime();
}
