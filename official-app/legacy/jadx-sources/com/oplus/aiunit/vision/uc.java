package com.oplus.aiunit.vision;

import com.oplus.accountsdk.open.core.config.AcOpenCoreConfig;
import com.platform.usercenter.account.ams.ipc.AcBasicInfoBean;

/* JADX INFO: loaded from: classes6.dex */
public class uc {
    public AcOpenCoreConfig a;
    public AcBasicInfoBean b;

    public static class b {
        public static final uc a = new uc();
    }

    public static uc c() {
        return b.a;
    }

    public AcOpenCoreConfig a() {
        return this.a;
    }

    public AcBasicInfoBean b() {
        return this.b;
    }

    public void d(AcOpenCoreConfig acOpenCoreConfig) {
        this.a = acOpenCoreConfig;
    }

    public void e(AcBasicInfoBean acBasicInfoBean) {
        this.b = acBasicInfoBean;
    }

    public uc() {
    }
}
