package com.heytap.health.band.data;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes15.dex */
public interface PressTestProto$PressRequestOrBuilder extends MessageLiteOrBuilder {
    ByteString getData();

    PressTestProto$DataType getDataType();

    int getDataTypeValue();

    PressTestProto$DIRECTION getDirection();

    int getDirectionValue();

    int getIndex();

    long getSendTime();
}
