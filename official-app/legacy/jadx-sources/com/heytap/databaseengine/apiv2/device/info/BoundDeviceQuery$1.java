package com.heytap.databaseengine.apiv2.device.info;

import com.heytap.databaseengine.callback.ICommonListener;
import com.oplus.aiunit.vision.me8;
import com.oplus.aiunit.vision.s22;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
class BoundDeviceQuery$1 extends ICommonListener.Stub {
    final /* synthetic */ s22 this$0;

    public BoundDeviceQuery$1(s22 s22Var) {
    }

    @Override // com.heytap.databaseengine.callback.ICommonListener
    public void onFailure(int i, List list) {
        me8.b("BoundDeviceQuery", "getUserBoundDevices onFailure: " + list);
        s22.c(null);
        throw null;
    }

    @Override // com.heytap.databaseengine.callback.ICommonListener
    public void onSuccess(int i, List list) {
        me8.e("BoundDeviceQuery", "getUserBoundDevices onSuccess: endTime = " + System.currentTimeMillis());
        s22.c(null);
        throw null;
    }
}
