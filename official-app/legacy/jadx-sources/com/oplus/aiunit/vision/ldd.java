package com.oplus.aiunit.vision;

import java.util.Observable;

/* JADX INFO: loaded from: classes13.dex */
public class ldd extends Observable {
    public static final int MAX_VALUE = 9999;
    public static final int MIN_VALUE = -999;
    public int a;
    public int b = 9999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13641c = -999;

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f13641c;
    }

    public int c() {
        return this.a;
    }

    public void d(int i) {
        if (i < this.f13641c) {
            throw new IllegalArgumentException("maximum cannot be smaller than mMini");
        }
        if (i > 9999) {
            throw new IllegalArgumentException("maximum cannot be bigger than '9999'");
        }
        this.b = i;
        if (this.a > i) {
            f(i);
        }
    }

    public void e(int i) {
        if (i > this.b) {
            throw new IllegalArgumentException("minimum cannot be bigger than mMini");
        }
        if (i < -999) {
            throw new IllegalArgumentException("minimum cannot be smaller than '-999'");
        }
        this.f13641c = i;
        if (this.a < i) {
            f(i);
        }
    }

    public void f(int i) {
        int iMin = Math.min(Math.max(i, b()), a());
        int i2 = this.a;
        this.a = iMin;
        setChanged();
        notifyObservers(Integer.valueOf(i2));
    }
}
