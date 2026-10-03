package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface WatchAppProto$AppListInfoOrBuilder extends MessageLiteOrBuilder {
    WatchAppProto$AppInfo getAppInfo(int i);

    int getAppInfoCount();

    List<WatchAppProto$AppInfo> getAppInfoList();

    int getPage();

    int getPageCount();

    int getTotalCount();
}
