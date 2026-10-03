package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$RemindInMotionOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$SportTypeRemindData getSportRemindData(int i);

    int getSportRemindDataCount();

    List<FitnessProto$SportTypeRemindData> getSportRemindDataList();
}
