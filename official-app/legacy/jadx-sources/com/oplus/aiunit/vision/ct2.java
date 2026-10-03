package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class ct2 implements Executor {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f10233j = "ct2";
    public Handler i;

    public static class b {
        public static final ct2 a = new ct2();
    }

    public static ct2 b() {
        return b.a;
    }

    public Handler a() {
        return this.i;
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("callback_executor_thread");
        handlerThread.start();
        this.i = new Handler(handlerThread.getLooper());
    }

    public boolean d() {
        Handler handler = this.i;
        return handler != null && handler.getLooper() == Looper.getMainLooper();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Handler handler = this.i;
        if (handler != null) {
            handler.post(runnable);
        } else {
            w7i.c(f10233j, "Executor has not been initialized.", new Object[0]);
        }
    }

    public ct2() {
        this.i = new Handler(Looper.getMainLooper());
    }
}
