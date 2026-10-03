package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppChangeEvent;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;

/* JADX INFO: loaded from: classes16.dex */
public class p80 extends d5<WatchAppProto$AppChangeEvent> {
    public p80(ws9<WatchAppProto$AppChangeEvent> ws9Var) {
        super(6, ws9Var);
    }

    @Override // com.oplus.aiunit.vision.d5
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public WatchAppProto$AppChangeEvent getWatchAppProtoType(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) {
        return watchAppProto$AppCommandMsg.getBody().getAppChangeEvent();
    }
}
