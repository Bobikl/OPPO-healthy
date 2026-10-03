package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes12.dex */
public final class xem extends qem {
    public static final PointF C = new PointF();
    public PointF A;
    public PointF B;
    public final a w;
    public boolean x;
    public PointF y;
    public PointF z;

    public interface a {
        void a(xem xemVar);
    }

    public static class b implements a {
    }

    public xem(Context context, a aVar) {
        super(context);
        this.A = new PointF();
        this.B = new PointF();
        this.w = aVar;
    }

    @Override // com.oplus.aiunit.vision.rem
    public final void a() {
        super.a();
        this.x = false;
        PointF pointF = this.A;
        pointF.x = 0.0f;
        PointF pointF2 = this.B;
        pointF2.x = 0.0f;
        pointF.y = 0.0f;
        pointF2.y = 0.0f;
    }

    @Override // com.oplus.aiunit.vision.rem
    public final void c(int i, MotionEvent motionEvent) {
        if (i == 3) {
            a();
        } else {
            if (i != 6) {
                return;
            }
            e(motionEvent);
            if (!this.x) {
                this.w.a(this);
            }
            a();
        }
    }

    @Override // com.oplus.aiunit.vision.rem
    public final void d(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i != 5) {
            return;
        }
        a();
        this.f16178c = MotionEvent.obtain(motionEvent);
        this.g = 0L;
        e(motionEvent);
        boolean zL = l(motionEvent, i2, i3);
        this.x = zL;
        if (zL) {
            return;
        }
        this.b = true;
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

    public final float n() {
        return this.A.x;
    }

    public final float o() {
        return this.A.y;
    }
}
