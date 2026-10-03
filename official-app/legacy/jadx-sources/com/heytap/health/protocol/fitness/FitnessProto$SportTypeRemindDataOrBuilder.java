package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$SportTypeRemindDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$IntervalData getIntervalData();

    String getSportName();

    ByteString getSportNameBytes();

    int getSportType();

    boolean hasIntervalData();
}
