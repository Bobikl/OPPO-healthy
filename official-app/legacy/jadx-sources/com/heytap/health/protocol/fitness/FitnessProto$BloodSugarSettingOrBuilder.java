package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$BloodSugarSettingOrBuilder extends MessageLiteOrBuilder {
    int getEnable();

    String getTime();

    ByteString getTimeBytes();

    int getType();

    int getValue();
}
