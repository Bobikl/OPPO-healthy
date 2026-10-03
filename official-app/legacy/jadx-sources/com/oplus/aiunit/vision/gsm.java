package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public final class gsm extends a4k {
    public static final gsm a = new gsm();

    @Override // com.oplus.aiunit.vision.a4k
    public void f(int i, Thread thread, long j2, String str, String str2, Throwable th) {
        if (i == 1) {
            Log.v(str, str2, th);
            return;
        }
        if (i == 2) {
            Log.d(str, str2, th);
            return;
        }
        if (i == 4) {
            Log.i(str, str2, th);
            return;
        }
        if (i == 8) {
            Log.w(str, str2, th);
        } else if (i == 16) {
            Log.e(str, str2, th);
        } else {
            if (i != 32) {
                return;
            }
            Log.e(str, str2, th);
        }
    }
}
