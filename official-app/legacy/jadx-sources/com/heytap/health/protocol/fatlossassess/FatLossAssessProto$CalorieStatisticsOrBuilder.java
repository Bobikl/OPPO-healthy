package com.heytap.health.protocol.fatlossassess;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FatLossAssessProto$CalorieStatisticsOrBuilder extends MessageLiteOrBuilder {
    int getBasicCalorie();

    int getCalorieTarget();

    String getDate();

    ByteString getDateBytes();

    int getDynamicCalorie();
}
