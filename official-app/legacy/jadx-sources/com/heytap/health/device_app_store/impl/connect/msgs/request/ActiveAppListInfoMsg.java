package com.heytap.health.device_app_store.impl.connect.msgs.request;

import androidx.annotation.Keep;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusListInfo;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;
import com.oplus.aiunit.vision.g5;
import com.oplus.aiunit.vision.ys9;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class ActiveAppListInfoMsg extends g5<WatchAppProto$ActiveAppStatusListInfo> {
    public ActiveAppListInfoMsg(ys9<WatchAppProto$ActiveAppStatusListInfo> ys9Var) {
        super(8, ys9Var);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.oplus.aiunit.vision.g5
    public WatchAppProto$ActiveAppStatusListInfo getWatchAppProtoType(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) {
        return watchAppProto$AppCommandMsg.getBody().getActiveAppListInfo();
    }
}
