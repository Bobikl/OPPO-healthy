package com.oplus.aiunit.vision;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class k7b implements zab {
    public static final Set<String> a = new HashSet();

    @Override // com.oplus.aiunit.vision.zab
    public void a(String str) {
        b(str, null);
    }

    @Override // com.oplus.aiunit.vision.zab
    public void b(String str, Throwable th) {
        Set<String> set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w(gqa.TAG, str, th);
        set.add(str);
    }

    public void c(String str, Throwable th) {
        if (gqa.DBG) {
            Log.d(gqa.TAG, str, th);
        }
    }

    @Override // com.oplus.aiunit.vision.zab
    public void debug(String str) {
        c(str, null);
    }

    @Override // com.oplus.aiunit.vision.zab
    public void error(String str, Throwable th) {
        if (gqa.DBG) {
            Log.d(gqa.TAG, str, th);
        }
    }
}
