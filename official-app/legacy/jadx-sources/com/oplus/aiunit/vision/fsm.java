package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public class fsm {
    public static int a() {
        int iB = com.tencent.open.utils.a.d(uum.a(), null).b("Common_HttpRetryCount");
        if (iB == 0) {
            return 2;
        }
        return iB;
    }

    public static int b(String str) {
        int iB;
        if (uum.a() == null || (iB = com.tencent.open.utils.a.d(uum.a(), str).b("Common_BusinessReportFrequency")) == 0) {
            return 100;
        }
        return iB;
    }
}
