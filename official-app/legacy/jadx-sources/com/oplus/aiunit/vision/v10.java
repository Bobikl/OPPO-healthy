package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public class v10 implements bf0 {
    @Override // com.oplus.aiunit.vision.bf0
    public void b(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    @Override // com.oplus.aiunit.vision.bf0
    public void c(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.oplus.aiunit.vision.bf0
    public void debug(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // com.oplus.aiunit.vision.bf0
    public void error(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.oplus.aiunit.vision.bf0
    public void error(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
