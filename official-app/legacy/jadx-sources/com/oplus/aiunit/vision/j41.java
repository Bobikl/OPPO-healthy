package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessage;

/* JADX INFO: loaded from: classes19.dex */
public abstract class j41 extends r31 {
    public j41(Proto$DeviceInfo proto$DeviceInfo) {
        super(proto$DeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.i11
    public uo9 c() {
        return new ai3();
    }

    @Override // com.oplus.aiunit.vision.i11
    public void v(Proto$WatchFaceMessage proto$WatchFaceMessage) {
    }
}
