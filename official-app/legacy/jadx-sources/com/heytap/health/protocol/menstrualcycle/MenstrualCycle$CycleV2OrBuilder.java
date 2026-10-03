package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface MenstrualCycle$CycleV2OrBuilder extends MessageLiteOrBuilder {
    int getCycleEndDate();

    MenstrualCycle$PeriodV2 getCyclePeriod(int i);

    int getCyclePeriodCount();

    List<MenstrualCycle$PeriodV2> getCyclePeriodList();

    int getCycleStartDate();

    MenstrualCycle$OvulationDataV2 getOvulation();

    boolean hasOvulation();
}
