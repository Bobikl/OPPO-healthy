package com.heytap.health.device_app_store.impl.connect.msgs.request;

import androidx.annotation.Keep;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfo;
import com.oplus.aiunit.vision.g5;
import com.oplus.aiunit.vision.ys9;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class WatchDeviceInfoMsg extends g5<WatchAppProto$WatchDeviceInfo> {
    public WatchDeviceInfoMsg(ys9<WatchAppProto$WatchDeviceInfo> ys9Var) {
        super(1, ys9Var);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.oplus.aiunit.vision.g5
    public WatchAppProto$WatchDeviceInfo getWatchAppProtoType(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) {
        return watchAppProto$AppCommandMsg.getBody().getWatchDeviceInfo();
    }
}
