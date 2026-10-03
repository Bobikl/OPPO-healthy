package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$RealtimeDataItemOrBuilder extends MessageLiteOrBuilder {
    int getDistance();

    int getElevation();

    int getFrequency();

    int getHeartRate();

    int getPace();

    int getStamina();

    int getState();

    int getStride();

    int getTimeStamp();
}
