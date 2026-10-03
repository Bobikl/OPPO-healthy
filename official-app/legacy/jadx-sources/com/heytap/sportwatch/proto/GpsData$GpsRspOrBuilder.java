package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface GpsData$GpsRspOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    GpsData$Location getLocations(int i);

    int getLocationsCount();

    List<GpsData$Location> getLocationsList();

    String getSessionId();

    ByteString getSessionIdBytes();
}
