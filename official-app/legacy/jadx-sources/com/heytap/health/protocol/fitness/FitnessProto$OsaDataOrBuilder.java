package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$OsaDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$OsaResultWeek getDetails(int i);

    int getDetailsCount();

    List<FitnessProto$OsaResultWeek> getDetailsList();

    int getTimestamp();

    int getTodayLevel();

    int getTotalOsaResult();
}
