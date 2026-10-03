package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface GpsData$GpsResultCodeOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    String getSessionId();

    ByteString getSessionIdBytes();

    int getSupportBackgroundLocation();
}
