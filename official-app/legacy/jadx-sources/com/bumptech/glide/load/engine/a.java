package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.oplus.aiunit.vision.cpe;
import com.oplus.aiunit.vision.ona;
import com.oplus.aiunit.vision.usf;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public final boolean a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public final Map<ona, c> f1365c;
    public final ReferenceQueue<h<?>> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h.a f1366e;
    public volatile boolean f;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0178a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC0179a implements Runnable {
            public final /* synthetic */ Runnable i;

            public RunnableC0179a(Runnable runnable) {
                this.i = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.i.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC0179a(runnable), "glide-active-resources");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    @VisibleForTesting
    public static final class c extends WeakReference<h<?>> {
        public final ona a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public usf<?> f1368c;

        public c(@NonNull ona onaVar, @NonNull h<?> hVar, @NonNull ReferenceQueue<? super h<?>> referenceQueue, boolean z) {
            super(hVar, referenceQueue);
            this.a = (ona) cpe.d(onaVar);
            this.f1368c = (hVar.d() && z) ? (usf) cpe.d(hVar.c()) : null;
            this.b = hVar.d();
        }

        public void a() {
            this.f1368c = null;
            clear();
        }
    }

    public a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC0178a()));
    }

    public synchronized void a(ona onaVar, h<?> hVar) {
        c cVarPut = this.f1365c.put(onaVar, new c(onaVar, hVar, this.d, this.a));
        if (cVarPut != null) {
            cVarPut.a();
        }
    }

    public void b() {
        while (!this.f) {
            try {
                c((c) this.d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(@NonNull c cVar) {
        usf<?> usfVar;
        synchronized (this) {
            this.f1365c.remove(cVar.a);
            if (cVar.b && (usfVar = cVar.f1368c) != null) {
                this.f1366e.b(cVar.a, new h<>(usfVar, true, false, cVar.a, this.f1366e));
            }
        }
    }

    public synchronized void d(ona onaVar) {
        c cVarRemove = this.f1365c.remove(onaVar);
        if (cVarRemove != null) {
            cVarRemove.a();
        }
    }

    @Nullable
    public synchronized h<?> e(ona onaVar) {
        c cVar = this.f1365c.get(onaVar);
        if (cVar == null) {
            return null;
        }
        h<?> hVar = cVar.get();
        if (hVar == null) {
            c(cVar);
        }
        return hVar;
    }

    public void f(h.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f1366e = aVar;
            }
        }
    }

    @VisibleForTesting
    public a(boolean z, Executor executor) {
        this.f1365c = new HashMap();
        this.d = new ReferenceQueue<>();
        this.a = z;
        this.b = executor;
        executor.execute(new b());
    }
}
