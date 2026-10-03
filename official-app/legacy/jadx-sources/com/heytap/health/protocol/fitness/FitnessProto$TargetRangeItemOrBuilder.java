package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$TargetRangeItemOrBuilder extends MessageLiteOrBuilder {
    int getLower();

    FitnessProto$TARGET_RANGE_SWITCH getSwitchType();

    int getSwitchTypeValue();

    int getUpper();
}
