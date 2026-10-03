package com.oplus.aiunit.vision;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes8.dex */
public class ya3 {
    public a d;
    public Choreographer.FrameCallback b = new Choreographer.FrameCallback() { // from class: com.oplus.aiunit.vision.xa3
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j2) {
            this.i.b(j2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18941c = false;
    public Choreographer a = Choreographer.getInstance();

    public interface a {
        void doFrame(long j2);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(long j2) {
        this.f18941c = false;
        if (this.d != null) {
            if (g25.a()) {
                g25.d(g25.FRAME_LOG_TAG, "doFrame ----------------------- frameTime =:" + j2);
            }
            this.d.doFrame(j2);
        }
    }

    public void d() {
        if (this.f18941c || this.d == null) {
            return;
        }
        this.a.postFrameCallback(this.b);
        if (g25.a()) {
            g25.d(g25.FRAME_LOG_TAG, "scheduleNextFrame ----------------------- ");
        }
        this.f18941c = true;
    }

    public void e(a aVar) {
        this.d = aVar;
    }

    public void f() {
        if (this.f18941c) {
            if (g25.a()) {
                g25.d(g25.FRAME_LOG_TAG, "unScheduleNextFrame ----------------------- ");
            }
            this.a.removeFrameCallback(this.b);
            this.f18941c = false;
        }
    }
}
