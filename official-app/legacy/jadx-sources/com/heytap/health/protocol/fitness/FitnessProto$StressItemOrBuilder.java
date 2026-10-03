package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$StressItemOrBuilder extends MessageLiteOrBuilder {
    int getMinuteOffset();

    int getReliability();

    int getRmssd();

    int getSdnn();

    int getStress();

    int getType();
}
