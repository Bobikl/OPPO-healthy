package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$HrvInfoOrBuilder extends MessageLiteOrBuilder {
    CardiovascularProto$HrvFocusBehaviorItem getHrvFocusBehaviorList(int i);

    int getHrvFocusBehaviorListCount();

    List<CardiovascularProto$HrvFocusBehaviorItem> getHrvFocusBehaviorListList();

    int getHrvLatestValue();

    int getHrvState();

    CardiovascularProto$TimeToIntValueInfo getHrvValueList(int i);

    int getHrvValueListCount();

    List<CardiovascularProto$TimeToIntValueInfo> getHrvValueListList();

    int getHrvWeekState();
}
