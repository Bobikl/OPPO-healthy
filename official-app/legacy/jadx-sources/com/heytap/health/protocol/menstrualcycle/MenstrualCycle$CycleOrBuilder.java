package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface MenstrualCycle$CycleOrBuilder extends MessageLiteOrBuilder {
    int getCycleDurationDays();

    MenstrualCycle$Period getCyclePeriod(int i);

    int getCyclePeriodCount();

    List<MenstrualCycle$Period> getCyclePeriodList();

    int getCycleStartDate();
}
