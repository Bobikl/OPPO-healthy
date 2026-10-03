package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$HeartRateContentOrBuilder extends MessageLiteOrBuilder {
    int getEndTime();

    int getHeartRateAlarmType();

    int getHeartRateHighest();

    int getHeartRateLowest();

    int getHeartRateType();

    int getHeartRateValueMax();

    int getHeartRateValueMin();

    int getStartTime();
}
