package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$HeartRateStatOrBuilder extends MessageLiteOrBuilder {
    int getAvgWalkHeartRate();

    int getRestHeartRate();

    int getSleepHeartRate();

    int getTimestamp();
}
