package com.heytap.health.protocol.behavior;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface BehaviorProto$BehaviorAnnotationOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    String getName();

    ByteString getNameBytes();

    String getSampleFrequency();

    ByteString getSampleFrequencyBytes();

    String getSensors();

    ByteString getSensorsBytes();

    String getSid();

    ByteString getSidBytes();

    int getStatus();
}
