package com.oplus.aiunit.vision;

import com.xingin.xhssharesdk.XhsSdkInject;
import com.xingin.xhssharesdk.core.XhsShareSdk;

/* JADX INFO: loaded from: classes10.dex */
public final class xym implements tcm {
    @Override // com.oplus.aiunit.vision.tcm
    public final void a(String str) {
        if (XhsSdkInject.isDebugTracker()) {
            XhsShareSdk.b("XhsShare_SdkTrackerLog", str);
        }
    }
}
