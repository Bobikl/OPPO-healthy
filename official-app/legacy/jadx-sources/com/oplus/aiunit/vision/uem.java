package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes12.dex */
public final class uem extends rem {
    public static final PointF o = new PointF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f17443j;
    public PointF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f17444l;
    public PointF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PointF f17445n;

    public interface a {
        boolean a(uem uemVar);

        boolean b(uem uemVar);

        void c(uem uemVar);
    }

    public uem(Context context, a aVar) {
        super(context);
        this.m = new PointF();
        this.f17445n = new PointF();
        this.f17443j = aVar;
    }

    @Override // com.oplus.aiunit.vision.rem
    public final void c(int i, MotionEvent motionEvent) {
        if (i != 1) {
            if (i == 2) {
                e(motionEvent);
                if (this.f16179e / this.f <= 0.67f || motionEvent.getPointerCount() > 1 || !this.f17443j.a(this)) {
                    return;
                }
                this.f16178c.recycle();
                this.f16178c = MotionEvent.obtain(motionEvent);
                return;
            }
            if (i != 3) {
                return;
            }
        }
        this.f17443j.c(this);
        a();
    }

    @Override // com.oplus.aiunit.vision.rem
    public final void d(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i == 0) {
            a();
            this.f16178c = MotionEvent.obtain(motionEvent);
            this.g = 0L;
            e(motionEvent);
            return;
        }
        if (i == 2) {
            this.b = this.f17443j.b(this);
            return;
        }
        if (i != 5) {
            return;
        }
        MotionEvent motionEvent2 = this.f16178c;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f16178c = MotionEvent.obtain(motionEvent);
        e(motionEvent);
    }

    @Override // com.oplus.aiunit.vision.rem
    public final void e(MotionEvent motionEvent) {
        PointF pointF;
        super.e(motionEvent);
        MotionEvent motionEvent2 = this.f16178c;
        this.k = rem.g(motionEvent);
        this.f17444l = rem.g(motionEvent2);
        boolean z = this.f16178c.getPointerCount() != motionEvent.getPointerCount();
        if (z) {
            pointF = o;
        } else {
            PointF pointF2 = this.k;
            float f = pointF2.x;
            PointF pointF3 = this.f17444l;
            pointF = new PointF(f - pointF3.x, pointF2.y - pointF3.y);
        }
        this.f17445n = pointF;
        if (z) {
            this.f16178c.recycle();
            this.f16178c = MotionEvent.obtain(motionEvent);
        }
        PointF pointF4 = this.m;
        float f2 = pointF4.x;
        PointF pointF5 = this.f17445n;
        pointF4.x = f2 + pointF5.x;
        pointF4.y += pointF5.y;
    }

    public final PointF j() {
        return this.f17445n;
    }
}
