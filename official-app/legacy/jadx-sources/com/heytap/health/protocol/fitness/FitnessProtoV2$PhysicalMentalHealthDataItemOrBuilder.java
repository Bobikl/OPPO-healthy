package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder extends MessageLiteOrBuilder {
    int getHrv();

    int getMinuteOffset();

    int getStressState();

    int getStressValue();

    int getType();
}
