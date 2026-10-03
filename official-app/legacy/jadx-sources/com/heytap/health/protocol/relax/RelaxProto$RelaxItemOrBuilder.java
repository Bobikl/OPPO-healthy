package com.heytap.health.protocol.relax;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface RelaxProto$RelaxItemOrBuilder extends MessageLiteOrBuilder {
    int getDuration();

    int getHeartRateMax();

    int getHeartRateMin();

    int getHeartRateOffset(int i);

    int getHeartRateOffsetCount();

    List<Integer> getHeartRateOffsetList();

    ByteString getHeartRateValues();

    String getId();

    ByteString getIdBytes();

    int getStartTime();

    int getStressAvg();

    int getSubType();

    int getType();
}
