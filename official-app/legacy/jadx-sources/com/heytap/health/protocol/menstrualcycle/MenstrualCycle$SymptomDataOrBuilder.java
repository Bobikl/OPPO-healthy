package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface MenstrualCycle$SymptomDataOrBuilder extends MessageLiteOrBuilder {
    int getCurSyncTime();

    boolean getHasMore();

    MenstrualCycle$SymptomPerDay getSymptom(int i);

    int getSymptomCount();

    List<MenstrualCycle$SymptomPerDay> getSymptomList();
}
