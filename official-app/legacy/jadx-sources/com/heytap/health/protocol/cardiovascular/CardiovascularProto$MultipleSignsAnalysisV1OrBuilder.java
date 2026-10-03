package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$MultipleSignsAnalysisV1OrBuilder extends MessageLiteOrBuilder {
    String getCode();

    ByteString getCodeBytes();

    CardiovascularProto$SignsDataV1 getDetails(int i);

    int getDetailsCount();

    List<CardiovascularProto$SignsDataV1> getDetailsList();

    int getStatus();

    int getTimestamp();

    int getType();
}
