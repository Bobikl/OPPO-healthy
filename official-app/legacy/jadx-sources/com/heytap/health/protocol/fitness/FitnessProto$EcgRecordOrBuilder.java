package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$EcgRecordOrBuilder extends MessageLiteOrBuilder {
    int getAvgHeartRate();

    int getDuration();

    int getEcg(int i);

    int getEcgCount();

    String getEcgId();

    ByteString getEcgIdBytes();

    List<Integer> getEcgList();

    int getFrequency();

    int getTimeBegin();

    int getTimeEnd();
}
