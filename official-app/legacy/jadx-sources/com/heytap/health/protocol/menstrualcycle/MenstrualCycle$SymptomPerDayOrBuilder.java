package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface MenstrualCycle$SymptomPerDayOrBuilder extends MessageLiteOrBuilder {
    int getCreateTime();

    MenstrualCycle$Symptom getSymptom(int i);

    int getSymptomCount();

    List<MenstrualCycle$Symptom> getSymptomList();
}
