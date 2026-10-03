package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$Spo2ItemDataV2OrBuilder extends MessageLiteOrBuilder {
    int getMinuteOffset();

    ByteString getSpo2Rd();

    ByteString getTypeSecondOffset();
}
