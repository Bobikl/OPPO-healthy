package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: classes19.dex */
public abstract class iw2 extends OrientationEventListener {
    public int a;

    public iw2(Context context) {
        super(context);
    }

    public final int a(int i, int i2) {
        boolean z = true;
        if (i2 != -1) {
            int iAbs = Math.abs(i - i2);
            if (Math.min(iAbs, 360 - iAbs) < 65) {
                z = false;
            }
        }
        return z ? (((i + 30) / 90) * 90) % 360 : i2;
    }

    public abstract void b(int i);

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i) {
        int iA;
        if (i == -1 || this.a == (iA = a(i, this.a))) {
            return;
        }
        this.a = iA;
        b(iA);
    }
}
