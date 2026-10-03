package com.oplus.aiunit.vision;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class j7b implements hi6 {
    public static final Set<String> a = new HashSet();

    @Override // com.oplus.aiunit.vision.hi6
    public void a(String str) {
        b(str, null);
    }

    @Override // com.oplus.aiunit.vision.hi6
    public void b(String str, Throwable th) {
        Set<String> set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w(rpa.TAG, str, th);
        set.add(str);
    }

    public void c(String str, Throwable th) {
    }

    @Override // com.oplus.aiunit.vision.hi6
    public void debug(String str) {
        c(str, null);
    }

    @Override // com.oplus.aiunit.vision.hi6
    public void error(String str, Throwable th) {
    }
}
