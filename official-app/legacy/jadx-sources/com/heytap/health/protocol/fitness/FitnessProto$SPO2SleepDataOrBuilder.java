package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$SPO2SleepDataOrBuilder extends MessageLiteOrBuilder {
    int getInterval();

    int getMinuteOffset();

    ByteString getReliability();

    ByteString getSpo2();
}
