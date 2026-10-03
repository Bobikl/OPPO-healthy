package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface GpsData$GpsSwitchOrBuilder extends MessageLiteOrBuilder {
    int getGpsEnable();

    String getSessionId();

    ByteString getSessionIdBytes();

    int getTimeout();
}
