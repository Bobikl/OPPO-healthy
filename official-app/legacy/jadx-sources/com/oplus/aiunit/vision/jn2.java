package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes13.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class jn2 {
    public static final int TYPE_AUDIO = 1;
    public static final int TYPE_DEFAULT = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static jn2 f12954c;
    public static jn2 d;
    public final HandlerThread a;
    public Handler b;

    public static class b extends jn2 {
        public b() {
            super();
        }

        @Override // com.oplus.aiunit.vision.jn2
        public HandlerThread g() {
            return new HandlerThread("COUIAudioWorkHandler", -16);
        }
    }

    public static class c extends jn2 {
        public c() {
            super();
        }

        @Override // com.oplus.aiunit.vision.jn2
        public HandlerThread g() {
            return new HandlerThread("COUIDefaultWorkHandler", 0);
        }
    }

    public static jn2 e() {
        return f(0);
    }

    public static jn2 f(int i) {
        if (1 == i) {
            if (d == null) {
                d = new b();
            }
            return d;
        }
        if (f12954c == null) {
            f12954c = new c();
        }
        return f12954c;
    }

    public final void a() {
        if (Looper.myLooper() != null && Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("Current thread is not origin thread!");
        }
    }

    public final void b() {
        if (c() != null || d().getLooper() == null) {
            return;
        }
        h(new Handler(d().getLooper()));
    }

    public Handler c() {
        return this.b;
    }

    public HandlerThread d() {
        return this.a;
    }

    public abstract HandlerThread g();

    public void h(Handler handler) {
        this.b = handler;
    }

    @MainThread
    public void i(Runnable runnable) {
        a();
        b();
        c().post(runnable);
    }

    public jn2() {
        HandlerThread handlerThreadG = g();
        this.a = handlerThreadG;
        handlerThreadG.start();
    }
}
