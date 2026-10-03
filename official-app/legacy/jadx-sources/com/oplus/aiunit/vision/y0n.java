package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class y0n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Handler f18822c;
    public static HandlerThread d;
    public static Object b = new Object();
    public static final Executor a = d();

    public static class a implements Executor {
        public final Queue<Runnable> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Runnable f18823j;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.y0n$a$a, reason: collision with other inner class name */
        public class RunnableC0943a implements Runnable {
            public final /* synthetic */ Runnable i;

            public RunnableC0943a(Runnable runnable) {
                this.i = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.i.run();
                } finally {
                    a.this.a();
                }
            }
        }

        public a() {
            this.i = new LinkedList();
        }

        public synchronized void a() {
            Runnable runnablePoll = this.i.poll();
            this.f18823j = runnablePoll;
            if (runnablePoll != null) {
                y0n.a.execute(runnablePoll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.i.offer(new RunnableC0943a(runnable));
            if (this.f18823j == null) {
                a();
            }
        }
    }

    public static Handler a() {
        if (f18822c == null) {
            synchronized (y0n.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                d = handlerThread;
                handlerThread.start();
                f18822c = new Handler(d.getLooper());
            }
        }
        return f18822c;
    }

    public static void b(Runnable runnable) {
        a().post(runnable);
    }

    public static Executor c() {
        return new a();
    }

    public static Executor d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.setCorePoolSize(3);
        return threadPoolExecutor;
    }
}
