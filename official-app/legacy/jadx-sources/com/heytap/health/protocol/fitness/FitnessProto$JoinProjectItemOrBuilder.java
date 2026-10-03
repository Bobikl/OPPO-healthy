package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$JoinProjectItemOrBuilder extends MessageLiteOrBuilder {
    String getExtra();

    ByteString getExtraBytes();

    long getModifierTime();

    String getProjectCode();

    ByteString getProjectCodeBytes();

    int getState();
}
