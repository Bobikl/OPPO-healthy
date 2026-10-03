package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$AFibDataV2OrBuilder extends MessageLiteOrBuilder {
    FitnessProto$AFibItem getData(int i);

    int getDataCount();

    List<FitnessProto$AFibItem> getDataList();

    int getEndTime();

    boolean getHasMore();

    int getStartTime();
}
