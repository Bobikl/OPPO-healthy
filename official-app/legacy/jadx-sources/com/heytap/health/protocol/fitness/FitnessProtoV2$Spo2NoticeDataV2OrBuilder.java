package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$Spo2NoticeDataV2OrBuilder extends MessageLiteOrBuilder {
    FitnessProto$Spo2Content getData(int i);

    int getDataCount();

    List<FitnessProto$Spo2Content> getDataList();

    int getEndTime();

    boolean getHasMore();

    int getStartTime();
}
