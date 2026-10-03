package com.oplus.aiunit.vision;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes13.dex */
public class v20 {
    public int a = 0;
    public int b = 0;

    public boolean a(MotionEvent motionEvent, r35 r35Var) {
        if ((motionEvent.getSource() & 2) == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        long jNanoTime = System.nanoTime();
        synchronized (r35Var) {
            try {
                if (action == 7) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (x != this.a || y != this.b) {
                        b(r35Var, 4, x, y, 0, 0, jNanoTime);
                        this.a = x;
                        this.b = y;
                    }
                } else if (action == 8) {
                    b(r35Var, 3, 0, 0, (int) (-Math.signum(motionEvent.getAxisValue(10))), (int) (-Math.signum(motionEvent.getAxisValue(9))), jNanoTime);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        x38.app.P().b();
        return true;
    }

    public final void b(r35 r35Var, int i, int i2, int i3, int i4, int i5, long j2) {
        r35.h hVarD = r35Var.o.d();
        hVarD.a = j2;
        hVarD.f16042c = i2;
        hVarD.d = i3;
        hVarD.b = i;
        hVarD.f16043e = i4;
        hVarD.f = i5;
        r35Var.r.add(hVarD);
    }
}
