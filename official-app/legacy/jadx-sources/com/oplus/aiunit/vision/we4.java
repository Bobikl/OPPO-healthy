package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes19.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class we4 {
    public final PointF a;
    public final PointF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f18228c;

    public we4() {
        this.a = new PointF();
        this.b = new PointF();
        this.f18228c = new PointF();
    }

    public PointF a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public PointF c() {
        return this.f18228c;
    }

    public void d(float f, float f2) {
        this.a.set(f, f2);
    }

    public void e(float f, float f2) {
        this.b.set(f, f2);
    }

    public void f(float f, float f2) {
        this.f18228c.set(f, f2);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f18228c.x), Float.valueOf(this.f18228c.y), Float.valueOf(this.a.x), Float.valueOf(this.a.y), Float.valueOf(this.b.x), Float.valueOf(this.b.y));
    }

    public we4(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.f18228c = pointF3;
    }
}
