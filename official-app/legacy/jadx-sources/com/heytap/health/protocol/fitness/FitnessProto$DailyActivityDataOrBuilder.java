package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$DailyActivityDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$DailyActivityItem getData(int i);

    int getDataCount();

    List<FitnessProto$DailyActivityItem> getDataList();
}
