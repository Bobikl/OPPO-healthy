package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface MenstrualCycle$SymptomBackOrBuilder extends MessageLiteOrBuilder {
    boolean getHasMore();

    int getLastDataEndTime();

    int getPackageId();

    MenstrualCycle$SymptomPerDay getSymptomPerDay(int i);

    int getSymptomPerDayCount();

    List<MenstrualCycle$SymptomPerDay> getSymptomPerDayList();
}
