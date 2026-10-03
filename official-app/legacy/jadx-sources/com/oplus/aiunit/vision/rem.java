package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes12.dex */
public abstract class rem {
    public final Context a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MotionEvent f16178c;
    public MotionEvent d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16179e;
    public float f;
    public long g;
    public int h = 0;
    public int i = 0;

    public rem(Context context) {
        this.a = context;
    }

    public static PointF g(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            x += motionEvent.getX(i);
            y += motionEvent.getY(i);
        }
        float f = pointerCount;
        return new PointF(x / f, y / f);
    }

    public void a() {
        MotionEvent motionEvent = this.f16178c;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f16178c = null;
        }
        MotionEvent motionEvent2 = this.d;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.d = null;
        }
        this.b = false;
    }

    public final void b(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    public abstract void c(int i, MotionEvent motionEvent);

    public abstract void d(int i, MotionEvent motionEvent, int i2, int i3);

    public void e(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.f16178c;
        MotionEvent motionEvent3 = this.d;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
            this.d = null;
        }
        this.d = MotionEvent.obtain(motionEvent);
        this.g = motionEvent.getEventTime() - motionEvent2.getEventTime();
        this.f16179e = motionEvent.getPressure(motionEvent.getActionIndex());
        this.f = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }

    public final long f() {
        return this.g;
    }

    public final boolean h(MotionEvent motionEvent, int i, int i2) {
        int action = motionEvent.getAction() & 255;
        if (this.b) {
            c(action, motionEvent);
            return true;
        }
        d(action, motionEvent, i, i2);
        return true;
    }

    public final MotionEvent i() {
        return this.d;
    }
}
