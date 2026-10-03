package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$EcgDataOrBuilder extends MessageLiteOrBuilder {
    String getEcgIds();

    ByteString getEcgIdsBytes();

    FitnessProto$EcgRecord getRecord();

    boolean hasRecord();
}
