package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface WStaminaParm$StaminaParmOrBuilder extends MessageLiteOrBuilder {
    float getAerobicPtc();

    float getAnaerobicPtc();

    String getCheckSum();

    ByteString getCheckSumBytes();

    int getLastWorkoutTime();

    float getMaxHeartrate();

    WRunPlan$RunPlan getPlan(int i);

    int getPlanCount();

    List<WRunPlan$RunPlan> getPlanList();

    int getRestHr();

    float getStaminaLevel();

    float getVo2Max();
}
