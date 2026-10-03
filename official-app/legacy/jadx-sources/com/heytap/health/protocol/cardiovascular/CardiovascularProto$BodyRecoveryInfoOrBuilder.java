package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$BodyRecoveryInfoOrBuilder extends MessageLiteOrBuilder {
    CardiovascularProto$TimeToIntValueInfo getPercentList(int i);

    int getPercentListCount();

    List<CardiovascularProto$TimeToIntValueInfo> getPercentListList();

    int getState();
}
