package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$HeartRateZoneOrBuilder extends MessageLiteOrBuilder {
    int getLower();

    FitnessProto$HR_ZONES_TYPE getType();

    int getTypeValue();

    int getUpper();
}
