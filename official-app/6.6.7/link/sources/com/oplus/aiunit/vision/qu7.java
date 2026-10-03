package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class qu7<T> {
    public static final int PROPERTY_TYPE_ALPHA = 4;
    public static final int PROPERTY_TYPE_CUSTOM = 0;
    public static final int PROPERTY_TYPE_POSITION = 1;
    public static final int PROPERTY_TYPE_ROTATION = 3;
    public static final int PROPERTY_TYPE_SCALE = 2;
    public String b;
    public float c;
    public float d;
    public boolean e = false;
    public int a = 0;

    public qu7(String str, float f) {
        this.b = str;
        this.c = f;
    }

    public abstract float a(T t);

    public abstract void b(T t, float f);

    public qu7 c(float f) {
        this.d = f;
        this.e = true;
        return this;
    }

    public void d(T t, float f) {
        b(t, f * this.c);
    }

    public void e(T t) {
    }

    public void f(T t) {
        if (this.e) {
            return;
        }
        this.d = a(t);
    }
}
