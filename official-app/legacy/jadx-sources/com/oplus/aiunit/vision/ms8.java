package com.oplus.aiunit.vision;

import com.heytap.health.base.base.BaseApplication;

/* JADX INFO: loaded from: classes17.dex */
public class ms8 extends vs8 {
    public static final String TAG = "HealthUPSManager";

    @Override // com.oplus.aiunit.vision.vs8
    public void b() {
        a7b.f(TAG, "init push...");
        com.heytap.msp.push.a.b(BaseApplication.a(), !qe0.z());
        com.heytap.msp.push.a.d(BaseApplication.a(), vo6.b(b78.a(), y80.PUSH_APP_KEY_OPPO), vo6.b(b78.a(), y80.PUSH_APP_SECRET_OPPO), new s89());
    }
}
