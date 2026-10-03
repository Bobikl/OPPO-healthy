package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface GpsData$NmeaRspOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    GpsData$NmeaData getData(int i);

    int getDataCount();

    List<GpsData$NmeaData> getDataList();

    String getSessionId();

    ByteString getSessionIdBytes();
}
