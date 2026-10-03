package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfo;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;

/* JADX INFO: loaded from: classes16.dex */
public class fb0 extends d5<WatchAppProto$ActiveAppStatusInfo> {
    public fb0(ws9<WatchAppProto$ActiveAppStatusInfo> ws9Var) {
        super(5, ws9Var);
    }

    @Override // com.oplus.aiunit.vision.d5
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public WatchAppProto$ActiveAppStatusInfo getWatchAppProtoType(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) {
        return watchAppProto$AppCommandMsg.getBody().getAppInstallStatusInfo();
    }
}
