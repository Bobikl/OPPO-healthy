package com.oplus.aiunit.vision;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes19.dex */
public class meg {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f14040c = null;
    public Rect d = null;

    public meg a(int i) {
        this.a = i;
        return this;
    }

    public meg b(int i) {
        this.b = i;
        return this;
    }

    public void c(RectF rectF) {
        this.f14040c = rectF;
        this.d = null;
    }

    public meg d(Rect rect) {
        this.d = rect;
        return this;
    }
}
