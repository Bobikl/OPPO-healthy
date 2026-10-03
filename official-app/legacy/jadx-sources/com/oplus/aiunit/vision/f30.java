package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class f30 {
    public static final cfg a = d3g.d(new Callable() { // from class: com.oplus.aiunit.vision.d30
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return f30.a.a;
        }
    });

    public static final class a {
        public static final cfg a = new ch8(new Handler(Looper.getMainLooper()), true);
    }

    public static cfg c() {
        return d3g.e(a);
    }
}
