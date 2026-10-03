package com.oplus.aiunit.vision;

import com.oplus.drs.core.upload.upload.UploadPipelineV2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class x0g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile x0g f18462c;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ExecutorService a = u56.r();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                x0g.this.f();
            } finally {
                x0g.this.b.set(false);
            }
        }
    }

    public x0g() {
        z6b.q("RtUploadWorker", "RtUploadWorker attached to uploadWorkerRt");
    }

    public static x0g c() {
        return f18462c;
    }

    public static void d() {
        if (f18462c == null) {
            synchronized (x0g.class) {
                if (f18462c == null) {
                    f18462c = new x0g();
                }
            }
        }
    }

    public void e() {
        if (this.b.compareAndSet(false, true)) {
            this.a.execute(new a());
        }
    }

    public final void f() {
        try {
            UploadPipelineV2.getInstance(w56.h()).triggerRealtimeFromRtWorker();
        } catch (Throwable th) {
            z6b.p("RtUploadWorker", "triggerRealtimeUploadInternal failed", th);
        }
    }
}
