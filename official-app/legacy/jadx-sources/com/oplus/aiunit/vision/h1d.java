package com.oplus.aiunit.vision;

import com.heytap.accessory.logging.CommonLog;

/* JADX INFO: loaded from: classes17.dex */
public class h1d implements CommonLog.LogProxy {
    @Override // com.heytap.accessory.logging.CommonLog.LogProxy
    public void println(int i, String str, String str2) {
        if (i != 2) {
            if (i == 4) {
                a7b.f(str, str2);
                return;
            }
            if (i == 5) {
                a7b.m(str, str2);
            } else if (i != 6) {
                a7b.f(str, str2);
            } else {
                a7b.b(str, str2);
            }
        }
    }

    @Override // com.heytap.accessory.logging.CommonLog.LogProxy
    public void println(int i, String str, String str2, Throwable th) {
        println(i, str, str2 + a7b.e(th));
    }
}
