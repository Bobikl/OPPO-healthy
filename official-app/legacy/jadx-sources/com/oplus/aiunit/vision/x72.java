package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class x72 {
    public static final int STATUS_APPLY = 0;
    public static final int STATUS_APPLYING = 3;
    public static final int STATUS_CANCEL = 5;
    public static final int STATUS_HAD_APPLY = 4;
    public static final int STATUS_INSTALLING = 2;
    public static final int STATUS_UPDATE = 1;
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18517c;
    public boolean d;

    public x72(int i) {
        this(i, -1);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f18517c;
    }

    public int c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.a == 4;
    }

    public void f(boolean z) {
        this.d = z;
    }

    public void g(int i) {
        this.b = i;
    }

    public void h(int i) {
        this.f18517c = i;
    }

    public void i(int i) {
        this.a = i;
    }

    public String toString() {
        return "BtnStatusBean{status=" + this.a + ", name='" + this.b + "', process=" + this.f18517c + ", enable=" + this.d + '}';
    }

    public x72(int i, int i2) {
        this(i, i2, 0);
    }

    public x72(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.f18517c = i3;
        this.d = !e();
    }
}
