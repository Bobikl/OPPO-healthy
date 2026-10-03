package com.heytap.health.device_app_store.impl.connect.msgs.request;

import androidx.annotation.Keep;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$UpdateAppInfo;
import com.oplus.aiunit.vision.g5;
import com.oplus.aiunit.vision.ys9;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class UpdateAppInfoMsg extends g5<WatchAppProto$UpdateAppInfo> {
    public UpdateAppInfoMsg(ys9<WatchAppProto$UpdateAppInfo> ys9Var) {
        super(4, ys9Var);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.oplus.aiunit.vision.g5
    public WatchAppProto$UpdateAppInfo getWatchAppProtoType(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) {
        return watchAppProto$AppCommandMsg.getBody().getUpdateAppInfo();
    }
}
