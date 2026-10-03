package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class nwj {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static final class a {
        public static final int a;
        public static final Executor b;

        static {
            int i = nwj.a + 1;
            a = i;
            b = new e75(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new c75("ThreadPool.WorkExecutor"));
        }
    }

    public static void b(@NonNull Runnable runnable) {
        a.b.execute(runnable);
    }
}
