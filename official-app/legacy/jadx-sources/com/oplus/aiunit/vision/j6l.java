package com.oplus.aiunit.vision;

import com.alipay.sdk.app.EnvUtils;

/* JADX INFO: loaded from: classes18.dex */
public class j6l extends qz0 {
    public static String WALLET_MANAGER_DIR = b78.a().getFilesDir().toString() + "/wallet/";

    @Override // com.oplus.aiunit.vision.qz0
    public void a() {
        super.a();
        b();
        c();
        ydc.n().r(qz0.mContext);
    }

    public final void b() {
        t6b.a("initInMainProcess, needAlipaySandbox() = " + j7l.D());
        if (j7l.D()) {
            EnvUtils.d(EnvUtils.EnvEnum.SANDBOX);
        } else {
            EnvUtils.d(EnvUtils.EnvEnum.ONLINE);
        }
        ika.c().d(p77.INSTANCE);
    }

    public final void c() {
        String v1Token = um.c().getV1Token();
        if (e1j.l(v1Token)) {
            v1Token = v9g.w().E("account_v1_token", "");
        }
        j7l.H(v1Token);
    }
}
