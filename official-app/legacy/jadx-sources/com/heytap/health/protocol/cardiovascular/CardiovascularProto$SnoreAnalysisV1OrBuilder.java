package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$SnoreAnalysisV1OrBuilder extends MessageLiteOrBuilder {
    CardiovascularProto$SnoreResultV1 getDetails(int i);

    int getDetailsCount();

    List<CardiovascularProto$SnoreResultV1> getDetailsList();

    int getTimestamp();

    int getTotalOsaResult();
}
