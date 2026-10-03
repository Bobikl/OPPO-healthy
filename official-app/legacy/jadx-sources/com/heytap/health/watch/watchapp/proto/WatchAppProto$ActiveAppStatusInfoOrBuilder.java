package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface WatchAppProto$ActiveAppStatusInfoOrBuilder extends MessageLiteOrBuilder {
    int getActiveStatus();

    WatchAppProto$AppInfo getAppInfo();

    WatchAppProto$ActiveAppFrom getFrom();

    int getFromValue();

    int getModel();

    int getReason();

    boolean hasAppInfo();
}
