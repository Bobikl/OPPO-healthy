package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h30 {

    @TargetApi(16)
    public static class a extends qki {
        public final Choreographer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f11982c = new ChoreographerFrameCallbackC0882a();
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f11983e;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.h30$a$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0882a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0882a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j2) {
                if (!a.this.d || a.this.a == null) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                aVar.a.e(jUptimeMillis - aVar.f11983e);
                a.this.f11983e = jUptimeMillis;
                a.this.b.postFrameCallback(a.this.f11982c);
            }
        }

        public a(Choreographer choreographer) {
            this.b = choreographer;
        }

        public static a i() {
            return new a(Choreographer.getInstance());
        }

        @Override // com.oplus.aiunit.vision.qki
        public void b() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.f11983e = SystemClock.uptimeMillis();
            this.b.removeFrameCallback(this.f11982c);
            this.b.postFrameCallback(this.f11982c);
        }

        @Override // com.oplus.aiunit.vision.qki
        public void c() {
            this.d = false;
            this.b.removeFrameCallback(this.f11982c);
        }
    }

    public static qki a() {
        return a.i();
    }
}
