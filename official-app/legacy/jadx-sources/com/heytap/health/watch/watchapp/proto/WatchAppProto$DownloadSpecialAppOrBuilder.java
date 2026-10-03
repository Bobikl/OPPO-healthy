package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface WatchAppProto$DownloadSpecialAppOrBuilder extends MessageLiteOrBuilder {
    String getAppName();

    ByteString getAppNameBytes();

    String getAppPackage();

    ByteString getAppPackageBytes();

    String getAppUrl();

    ByteString getAppUrlBytes();

    long getAppVersion();

    int getDataType();

    int getProgress();

    WatchAppProto$SpecialResultCode getResultCode();

    int getResultCodeValue();
}
