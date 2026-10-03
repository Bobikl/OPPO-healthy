package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$ScreenStateDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$ScreenStateItem getData(int i);

    int getDataCount();

    List<FitnessProto$ScreenStateItem> getDataList();

    int getIndex();

    String getRequestId();

    ByteString getRequestIdBytes();
}
