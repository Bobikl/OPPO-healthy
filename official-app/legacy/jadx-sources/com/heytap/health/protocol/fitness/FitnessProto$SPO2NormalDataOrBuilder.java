package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$SPO2NormalDataOrBuilder extends MessageLiteOrBuilder {
    ByteString getReliability();

    int getSecondOffset(int i);

    int getSecondOffsetCount();

    List<Integer> getSecondOffsetList();

    ByteString getSpo2();
}
