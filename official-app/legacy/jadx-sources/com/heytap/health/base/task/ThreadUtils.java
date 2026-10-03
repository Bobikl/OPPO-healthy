package com.heytap.health.base.task;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.apj;
import com.oplus.aiunit.vision.kt3;
import com.oplus.aiunit.vision.pu8;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class ThreadUtils {
    private static final int CORE_POOL_SIZE;
    private static final g DEFAULT_PRINTER;
    private static final ScheduledThreadPoolExecutor EXECUTOR;
    private static final Handler MAIN_LOOPER_HANDLER;
    private static final String TAG = "ThreadUtils";
    private static g sDebuggerPrinter;

    public static abstract class a {
        public abstract String a();

        public abstract void b();

        public abstract void c();
    }

    public static class b implements Runnable {
        public final a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Runnable f3251j;

        @Override // java.lang.Runnable
        public void run() {
            a aVar = this.i;
            if (aVar != null) {
                aVar.c();
            }
            this.f3251j.run();
            a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.b();
            }
        }

        public b(Runnable runnable, a aVar) {
            if (runnable == null) {
                throw new NullPointerException("DebuggerRunnable | Runnable must not be null");
            }
            this.f3251j = runnable;
            this.i = aVar;
        }
    }

    public static class c extends a {
        public final a a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g f3252c;

        @Override // com.heytap.health.base.task.ThreadUtils.a
        public String a() {
            String strA;
            String str = "ThreadName= " + ThreadUtils.getName();
            a aVar = this.a;
            if (aVar == null) {
                return str;
            }
            try {
                strA = aVar.a();
            } catch (Exception unused) {
                strA = "";
            }
            return strA + "  " + str;
        }

        @Override // com.heytap.health.base.task.ThreadUtils.a
        public void b() {
            a aVar = this.a;
            if (aVar != null) {
                aVar.b();
            }
            if (apj.DEBUG) {
                this.f3252c.a(a() + " useTime= " + (System.currentTimeMillis() - this.b) + "ms  currentTime= " + System.currentTimeMillis());
            }
        }

        @Override // com.heytap.health.base.task.ThreadUtils.a
        public void c() {
            this.b = System.currentTimeMillis();
            a aVar = this.a;
            if (aVar != null) {
                aVar.c();
            }
        }

        public c(a aVar) {
            this.a = aVar;
            this.f3252c = ThreadUtils.sDebuggerPrinter == null ? new f() : ThreadUtils.sDebuggerPrinter;
        }
    }

    public static final class d extends ScheduledThreadPoolExecutor {
        public d(int i, ThreadFactory threadFactory) {
            super(i, threadFactory);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th != null) {
                a7b.c(ThreadUtils.TAG, "afterExecute() called with: r = [" + runnable + "], t = [" + th.getMessage() + "]", th);
                if (kt3.THROW_EXCEPTIONS) {
                    throw new RuntimeException(th);
                }
            }
            if (runnable instanceof FutureTask) {
                try {
                    ((FutureTask) runnable).get();
                } catch (InterruptedException e2) {
                    a7b.c(ThreadUtils.TAG, "afterExecute: " + e2.getMessage(), e2);
                } catch (ExecutionException e3) {
                    a7b.c(ThreadUtils.TAG, "afterExecute() called with: r = [" + runnable + "], t = [" + e3.getMessage() + "]", e3);
                    if (kt3.THROW_EXCEPTIONS) {
                        throw new RuntimeException(e3);
                    }
                }
            }
        }
    }

    public static class e implements ThreadFactory {
        public long i;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("TU#");
            long j2 = this.i;
            this.i = 1 + j2;
            sb.append(j2);
            return new Thread(runnable, sb.toString());
        }

        public e() {
            this.i = 0L;
        }
    }

    public static class f implements g {
        public f() {
        }

        @Override // com.heytap.health.base.task.ThreadUtils.g
        public void a(String str) {
        }
    }

    public interface g {
        void a(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        CORE_POOL_SIZE = iAvailableProcessors;
        MAIN_LOOPER_HANDLER = new Handler(Looper.getMainLooper());
        f fVar = new f();
        DEFAULT_PRINTER = fVar;
        sDebuggerPrinter = fVar;
        d dVar = new d(iAvailableProcessors, new e());
        EXECUTOR = dVar;
        dVar.allowCoreThreadTimeOut(true);
        dVar.setKeepAliveTime(30L, TimeUnit.SECONDS);
    }

    @Deprecated
    public static Object doInBackground(Runnable runnable) {
        return doInBackground((String) null, runnable);
    }

    public static Object doInUiThread(Runnable runnable) {
        return doInUiThread(runnable, (a) null);
    }

    public static String getName() {
        return Thread.currentThread().getName();
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void removeTask(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Runnable) {
            MAIN_LOOPER_HANDLER.removeCallbacks((Runnable) obj);
        }
        if (obj instanceof ScheduledFuture) {
            EXECUTOR.getQueue().remove(obj);
        }
    }

    public static final void setPrinter(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("ThreadUtils | printer must not be null");
        }
        sDebuggerPrinter = gVar;
    }

    public static void sleep(long j2) {
        try {
            Thread.sleep(j2);
        } catch (InterruptedException unused) {
        }
    }

    public static Object doInBackground(@Size(max = apj.MAX_CALLER_LENGTH) String str, Runnable runnable) {
        return doInBackground(str, runnable, (a) null);
    }

    public static Object doInUiThread(Runnable runnable, long j2) {
        return j2 <= 0 ? doInUiThread(runnable) : doInUiThread(runnable, j2, null);
    }

    @Deprecated
    public static Object doInBackground(Runnable runnable, long j2) {
        return doInBackground((String) null, runnable, j2);
    }

    public static Object doInBackground(@Size(max = apj.MAX_CALLER_LENGTH) String str, Runnable runnable, long j2) {
        return doInBackground(str, runnable, j2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object doInUiThread(Runnable runnable, a aVar) {
        b bVar = new b(runnable, new c(aVar));
        if (isMainThread()) {
            bVar.run();
        } else {
            MAIN_LOOPER_HANDLER.post(bVar);
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object doInBackground(@Size(max = apj.MAX_CALLER_LENGTH) String str, Runnable runnable, long j2, a aVar) {
        return EXECUTOR.schedule(new b(new pu8(apj.c(apj.Thread_Type_Thread_Utils, str), runnable), new c(aVar)), j2, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object doInUiThread(Runnable runnable, long j2, a aVar) {
        b bVar = new b(runnable, new c(aVar));
        MAIN_LOOPER_HANDLER.postDelayed(bVar, j2);
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Runnable doInBackground(@Size(max = apj.MAX_CALLER_LENGTH) String str, Runnable runnable, a aVar) {
        b bVar = new b(new pu8(apj.c(apj.Thread_Type_Thread_Utils, str), runnable), new c(aVar));
        EXECUTOR.execute(bVar);
        return bVar;
    }
}
