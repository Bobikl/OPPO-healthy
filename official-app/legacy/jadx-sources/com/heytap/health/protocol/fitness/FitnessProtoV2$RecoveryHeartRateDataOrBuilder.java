package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$RecoveryHeartRateDataOrBuilder extends MessageLiteOrBuilder {
    int getHeartRateValue(int i);

    int getHeartRateValueCount();

    List<Integer> getHeartRateValueList();

    long getTimestamp(int i);

    int getTimestampCount();

    List<Long> getTimestampList();
}
