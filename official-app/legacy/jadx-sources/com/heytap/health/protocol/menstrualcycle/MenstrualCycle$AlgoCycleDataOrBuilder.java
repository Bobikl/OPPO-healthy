package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface MenstrualCycle$AlgoCycleDataOrBuilder extends MessageLiteOrBuilder {
    int getAlgorCycleDur();

    int getAlgorPeriodDur();

    int getModifiedTime();

    int getOvulaBeginDate();

    int getOvulaDate();

    int getOvulaEndDate();

    int getOvulationPreType();

    MenstrualCycle$PredictCycleData getPredictCycleList(int i);

    int getPredictCycleListCount();

    List<MenstrualCycle$PredictCycleData> getPredictCycleListList();
}
