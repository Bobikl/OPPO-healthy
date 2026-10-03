package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface WatchAppProto$DownloadNewAppOrBuilder extends MessageLiteOrBuilder {
    String getAppDetailInfo();

    ByteString getAppDetailInfoBytes();

    WatchAppProto$AppInfo getAppInfo();

    int getCode();

    WatchAppProto$DownloadNewAppOp getOp();

    int getOpValue();

    boolean hasAppInfo();
}
