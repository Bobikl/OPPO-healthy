package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$BloodSugarDeviceStateOrBuilder extends MessageLiteOrBuilder {
    int getActivationTimestamp();

    int getIsDeviceAvailable();

    int getTargetRangeHigh();

    int getTargetRangeLow();

    int getTimeStamp();
}
