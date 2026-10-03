package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$Spo2NoticeDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$Spo2Content getData(int i);

    int getDataCount();

    List<FitnessProto$Spo2Content> getDataList();

    int getIndex();
}
