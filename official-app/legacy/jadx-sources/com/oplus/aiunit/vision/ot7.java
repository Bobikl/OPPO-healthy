package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ot7<T> {
    public static final int PROPERTY_TYPE_ALPHA = 4;
    public static final int PROPERTY_TYPE_CUSTOM = 0;
    public static final int PROPERTY_TYPE_POSITION = 1;
    public static final int PROPERTY_TYPE_ROTATION = 3;
    public static final int PROPERTY_TYPE_SCALE = 2;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15044c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15045e = false;
    public int a = 0;

    public ot7(String str, float f) {
        this.b = str;
        this.f15044c = f;
    }

    public abstract float a(T t);

    public abstract void b(T t, float f);

    public ot7 c(float f) {
        this.d = f;
        this.f15045e = true;
        return this;
    }

    public void d(T t, float f) {
        b(t, f * this.f15044c);
    }

    public void e(T t) {
    }

    public void f(T t) {
        if (this.f15045e) {
            return;
        }
        this.d = a(t);
    }
}
