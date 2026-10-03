package com.amap.api.col.p0003sl;

import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.v4n;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class q0 extends v4n {
    public static Thread.UncaughtExceptionHandler d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static q0 f854e = new q0(new o0.b().d(d).c("amap-global-threadPool").h());

    public class a implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            c2n.r(th, "TPool", "ThreadPool");
        }
    }

    public q0(o0 o0Var) {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(o0Var.a(), o0Var.b(), o0Var.d(), TimeUnit.SECONDS, o0Var.c(), o0Var);
            this.a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            c2n.r(th, "TPool", "ThreadPool");
            th.printStackTrace();
        }
    }

    public static q0 h() {
        return f854e;
    }

    public static q0 i(o0 o0Var) {
        return new q0(o0Var);
    }

    @Deprecated
    public static synchronized q0 j() {
        if (f854e == null) {
            f854e = new q0(new o0.b().d(d).h());
        }
        return f854e;
    }

    @Deprecated
    public static q0 k() {
        return new q0(new o0.b().d(d).h());
    }
}
