package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface GpsData$HFGpsDataResponseOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    GpsData$HFGpsDataFile getFileList();

    GpsData$HFGpsFileNameList getInvalidFileList();

    boolean hasFileList();

    boolean hasInvalidFileList();
}
