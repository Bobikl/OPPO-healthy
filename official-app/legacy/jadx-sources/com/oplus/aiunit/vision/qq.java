package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class qq implements Cloneable {
    public final qq i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Canvas f15901j;
    public int k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f15902l = 1.0d;
    public double m = 1.0d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15903n;
    public float o;

    public qq(@Nullable qq qqVar, @NonNull Canvas canvas) {
        this.i = qqVar;
        this.f15901j = canvas;
    }

    public static qq b(Canvas canvas) {
        return new qq(null, canvas);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qq clone() {
        qq qqVar = new qq(this, this.f15901j);
        qqVar.k(this.f15902l, this.m);
        qqVar.m(this.f15903n, this.o);
        qqVar.k = this.f15901j.save();
        return qqVar;
    }

    public Canvas c() {
        return this.f15901j;
    }

    public double d() {
        return this.f15902l;
    }

    public double e() {
        return this.m;
    }

    public qq f() {
        int i = this.k;
        if (i != -1) {
            this.f15901j.restoreToCount(i);
            this.k = -1;
        }
        qq qqVar = this.i;
        if (qqVar != null) {
            return qqVar;
        }
        throw new IllegalStateException("Cannot restore root transform instance");
    }

    public qq i() {
        qq qqVar = new qq(this, this.f15901j);
        qqVar.k(this.f15902l, this.m);
        qqVar.m(this.f15903n, this.o);
        qqVar.k = this.f15901j.save();
        return qqVar;
    }

    public void j(double d, double d2) {
        k(d, d2);
        this.f15901j.scale((float) d, (float) d2);
    }

    public void k(double d, double d2) {
        this.f15902l = d;
        this.m = d2;
    }

    public void m(float f, float f2) {
        this.f15903n = f;
        this.o = f2;
    }

    public void q(float f, float f2) {
        this.f15901j.translate(f, f2);
        m(f, f2);
    }
}
