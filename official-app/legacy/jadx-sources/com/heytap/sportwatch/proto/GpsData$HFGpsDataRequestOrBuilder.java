package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface GpsData$HFGpsDataRequestOrBuilder extends MessageLiteOrBuilder {
    GpsData$HFGpsFileNameList getCacheFileList();

    int getFileVersion();

    GpsData$HFGpsPoint getGpsOpint();

    boolean hasCacheFileList();

    boolean hasGpsOpint();
}
