package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$PacketDataRequestOrBuilder extends MessageLiteOrBuilder {
    int getIndex();

    String getSessionId();

    ByteString getSessionIdBytes();

    int getStartTimestamp();
}
