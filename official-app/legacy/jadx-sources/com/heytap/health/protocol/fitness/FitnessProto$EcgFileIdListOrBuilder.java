package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$EcgFileIdListOrBuilder extends MessageLiteOrBuilder {
    String getEcgIds(int i);

    ByteString getEcgIdsBytes(int i);

    int getEcgIdsCount();

    List<String> getEcgIdsList();

    int getEndTime();

    int getHasMoreData();

    int getStartTime();
}
