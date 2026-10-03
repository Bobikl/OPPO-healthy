package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$ScienceInfoDetailOrBuilder extends MessageLiteOrBuilder {
    String getContent();

    ByteString getContentBytes();

    int getModifiedTimestamp();

    int getSerialNo();
}
