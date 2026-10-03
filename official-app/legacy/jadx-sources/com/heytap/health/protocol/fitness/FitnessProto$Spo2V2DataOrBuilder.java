package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$Spo2V2DataOrBuilder extends MessageLiteOrBuilder {
    int getIndex();

    int getMinuteOffset(int i);

    int getMinuteOffsetCount();

    List<Integer> getMinuteOffsetList();

    ByteString getSpo2Rd(int i);

    int getSpo2RdCount();

    List<ByteString> getSpo2RdList();

    int getStartTime();

    ByteString getTypeSecondOffset(int i);

    int getTypeSecondOffsetCount();

    List<ByteString> getTypeSecondOffsetList();
}
