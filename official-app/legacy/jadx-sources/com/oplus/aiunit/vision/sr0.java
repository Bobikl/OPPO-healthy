package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes18.dex */
public class sr0 {

    public static final class a {
        public static final ExecutorService a = zq8.a("wallet_bg");
    }

    public static final class b {
        public static final Handler a = new Handler(Looper.getMainLooper());
    }

    public static final class c {
        public static final Handler a = a();

        public static Handler a() {
            HandlerThread handlerThread = new HandlerThread("BackgroundExecutor");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    public static Handler a() {
        return b.a;
    }

    public static Looper b() {
        return b.a.getLooper();
    }

    public static Executor c() {
        return a.a;
    }

    public static boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void e(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            b.a.post(runnable);
        }
    }

    public static void f(Runnable runnable, long j2) {
        b.a.postDelayed(runnable, j2);
    }

    public static void g(Runnable runnable) {
        c.a.post(runnable);
    }

    public static void h(Runnable runnable, long j2) {
        c.a.postDelayed(runnable, j2);
    }

    public static void i(Runnable runnable) {
        a.a.execute(runnable);
    }
}
