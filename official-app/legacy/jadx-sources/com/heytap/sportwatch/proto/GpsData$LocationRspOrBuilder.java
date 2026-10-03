package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface GpsData$LocationRspOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    GpsData$LcaDetail getLocations(int i);

    int getLocationsCount();

    List<GpsData$LcaDetail> getLocationsList();

    String getSessionId();

    ByteString getSessionIdBytes();
}
