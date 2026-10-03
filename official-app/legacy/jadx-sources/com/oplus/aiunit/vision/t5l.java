package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusListInfo;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfo;

/* JADX INFO: loaded from: classes16.dex */
public class t5l {
    public WatchAppProto$AppListInfo a;
    public WatchAppProto$ActiveAppStatusListInfo b;

    public t5l(WatchAppProto$AppListInfo watchAppProto$AppListInfo, WatchAppProto$ActiveAppStatusListInfo watchAppProto$ActiveAppStatusListInfo) {
        this.a = watchAppProto$AppListInfo;
        this.b = watchAppProto$ActiveAppStatusListInfo;
    }

    public WatchAppProto$ActiveAppStatusListInfo a() {
        return this.b;
    }

    public WatchAppProto$AppListInfo b() {
        return this.a;
    }
}
