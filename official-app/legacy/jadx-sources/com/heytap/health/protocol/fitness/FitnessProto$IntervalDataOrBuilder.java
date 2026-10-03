package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$IntervalDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$TargetRangeItem getCadence();

    FitnessProto$RangeHeartRate getHr();

    FitnessProto$TargetRangeItem getPace();

    boolean hasCadence();

    boolean hasHr();

    boolean hasPace();
}
