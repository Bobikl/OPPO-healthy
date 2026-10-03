package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class e30 {
    public static final zeg a = e3g.d(new a());

    public static class a implements Callable<zeg> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public zeg call() throws Exception {
            return b.a;
        }
    }

    public static final class b {
        public static final zeg a = new bh8(new Handler(Looper.getMainLooper()), false);
    }

    public static zeg a() {
        return e3g.e(a);
    }
}
