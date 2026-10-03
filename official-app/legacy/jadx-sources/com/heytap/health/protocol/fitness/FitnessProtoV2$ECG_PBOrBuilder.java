package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$ECG_PBOrBuilder extends MessageLiteOrBuilder {
    String getAppVersion();

    ByteString getAppVersionBytes();

    int getData(int i);

    int getDataCount();

    List<Integer> getDataList();

    int getDuration();

    int getEcgHeartRate();

    String getEcgId();

    ByteString getEcgIdBytes();

    int getEcgResultId();

    String getEcgResultName();

    ByteString getEcgResultNameBytes();

    int getFrequency();

    int getHand();

    int getHeartRate(int i);

    int getHeartRateCount();

    List<Integer> getHeartRateList();

    int getSource();

    String getSymptoms();

    ByteString getSymptomsBytes();

    int getTimeBegin();

    int getTimeEnd();
}
