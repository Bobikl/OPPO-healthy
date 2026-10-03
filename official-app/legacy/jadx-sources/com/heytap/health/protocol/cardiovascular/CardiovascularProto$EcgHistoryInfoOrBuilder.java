package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$EcgHistoryInfoOrBuilder extends MessageLiteOrBuilder {
    int getEcgResult();

    CardiovascularProto$TimeToIntValueInfo getStateList(int i);

    int getStateListCount();

    List<CardiovascularProto$TimeToIntValueInfo> getStateListList();
}
