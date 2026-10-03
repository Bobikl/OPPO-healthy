package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface MenstrualCycle$DelCycleOrBuilder extends MessageLiteOrBuilder {
    int getCycleStartDate();

    MenstrualCycle$Period getPeriod(int i);

    int getPeriodCount();

    List<MenstrualCycle$Period> getPeriodList();
}
