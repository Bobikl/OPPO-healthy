package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface MenstrualCycle$CycleDataOrBuilder extends MessageLiteOrBuilder {
    MenstrualCycle$Cycle getCycleList(int i);

    int getCycleListCount();

    List<MenstrualCycle$Cycle> getCycleListList();

    MenstrualCycle$DelCycle getDelCycle(int i);

    int getDelCycleCount();

    List<MenstrualCycle$DelCycle> getDelCycleList();
}
