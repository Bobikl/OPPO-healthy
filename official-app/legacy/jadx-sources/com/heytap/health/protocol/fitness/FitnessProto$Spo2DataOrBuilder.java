package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$Spo2DataOrBuilder extends MessageLiteOrBuilder {
    int getIndex();

    FitnessProto$SPO2NormalData getNormalData();

    FitnessProto$SPO2SleepData getSleepData(int i);

    int getSleepDataCount();

    List<FitnessProto$SPO2SleepData> getSleepDataList();

    int getStartTime();

    int getType();

    boolean hasNormalData();
}
