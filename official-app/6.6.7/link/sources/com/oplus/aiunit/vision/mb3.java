package com.oplus.aiunit.vision;

import android.view.Choreographer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class mb3 {
    public a d;
    public Choreographer.FrameCallback b = new Choreographer.FrameCallback() { // from class: com.oplus.aiunit.vision.lb3
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.i.b(j);
        }
    };
    public boolean c = false;
    public Choreographer a = Choreographer.getInstance();

    public interface a {
        void doFrame(long j);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(long j) {
        this.c = false;
        if (this.d != null) {
            if (z25.a()) {
                z25.d(z25.FRAME_LOG_TAG, "doFrame ----------------------- frameTime =:" + j);
            }
            this.d.doFrame(j);
        }
    }

    public void d() {
        if (this.c || this.d == null) {
            return;
        }
        this.a.postFrameCallback(this.b);
        if (z25.a()) {
            z25.d(z25.FRAME_LOG_TAG, "scheduleNextFrame ----------------------- ");
        }
        this.c = true;
    }

    public void e(a aVar) {
        this.d = aVar;
    }

    public void f() {
        if (this.c) {
            if (z25.a()) {
                z25.d(z25.FRAME_LOG_TAG, "unScheduleNextFrame ----------------------- ");
            }
            this.a.removeFrameCallback(this.b);
            this.c = false;
        }
    }
}
