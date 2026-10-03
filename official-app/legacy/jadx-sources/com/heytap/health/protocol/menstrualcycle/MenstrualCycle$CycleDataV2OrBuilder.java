package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface MenstrualCycle$CycleDataV2OrBuilder extends MessageLiteOrBuilder {
    MenstrualCycle$CycleV2 getCycleList(int i);

    int getCycleListCount();

    List<MenstrualCycle$CycleV2> getCycleListList();

    MenstrualCycle$PeriodV2 getDelPeriod(int i);

    int getDelPeriodCount();

    List<MenstrualCycle$PeriodV2> getDelPeriodList();
}
