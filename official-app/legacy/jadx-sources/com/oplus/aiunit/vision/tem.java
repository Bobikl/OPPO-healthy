package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes12.dex */
public final class tem extends qem {
    public static final PointF C = new PointF();
    public PointF A;
    public PointF B;
    public final a w;
    public boolean x;
    public PointF y;
    public PointF z;

    public interface a {
        boolean a(tem temVar);

        boolean b(tem temVar);

        void c(tem temVar);
    }

    public tem(Context context, a aVar) {
        super(context);
        this.A = new PointF();
        this.B = new PointF();
        this.w = aVar;
    }

    @Override // com.oplus.aiunit.vision.rem
    public final void a() {
        super.a();
        this.x = false;
    }

    @Override // com.oplus.aiunit.vision.rem
    public final void c(int i, MotionEvent motionEvent) {
        if (i == 2) {
            e(motionEvent);
            if (this.f16179e / this.f <= 0.67f || !this.w.a(this)) {
                return;
            }
            this.f16178c.recycle();
            this.f16178c = MotionEvent.obtain(motionEvent);
            return;
        }
        if (i == 3) {
            if (!this.x) {
                this.w.c(this);
            }
            a();
        } else {
            if (i != 6) {
                return;
            }
            e(motionEvent);
            if (!this.x) {
                this.w.c(this);
            }
            a();
        }
    }

    @Override // com.oplus.aiunit.vision.rem
    public final void d(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i == 2) {
            if (this.x) {
                boolean zL = l(motionEvent, i2, i3);
                this.x = zL;
                if (zL) {
                    return;
                }
                this.b = this.w.b(this);
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        a();
        this.f16178c = MotionEvent.obtain(motionEvent);
        this.g = 0L;
        e(motionEvent);
        boolean zL2 = l(motionEvent, i2, i3);
        this.x = zL2;
        if (zL2) {
            return;
        }
        this.b = this.w.b(this);
    }

    @Override // com.oplus.aiunit.vision.qem, com.oplus.aiunit.vision.rem
    public final void e(MotionEvent motionEvent) {
        PointF pointF;
        super.e(motionEvent);
        MotionEvent motionEvent2 = this.f16178c;
        this.y = rem.g(motionEvent);
        this.z = rem.g(motionEvent2);
        if (this.f16178c.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = C;
        } else {
            PointF pointF2 = this.y;
            float f = pointF2.x;
            PointF pointF3 = this.z;
            pointF = new PointF(f - pointF3.x, pointF2.y - pointF3.y);
        }
        this.B = pointF;
        PointF pointF4 = this.A;
        pointF4.x += pointF.x;
        pointF4.y += pointF.y;
    }

    public final PointF n() {
        return this.B;
    }
}
