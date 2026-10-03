package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class qt9 {
    public final int a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15934c;
    public final int d = c();

    public qt9(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.f15934c = i2;
    }

    public static qt9 a(int i, String str, int i2) {
        return new qt9(i, str, i2);
    }

    public int b(int i) {
        return "?".equals(this.b) ? i : Integer.parseInt(this.b);
    }

    public final int c() {
        return (this.a * 31) + this.b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt9)) {
            return false;
        }
        qt9 qt9Var = (qt9) obj;
        if (this.a != qt9Var.a) {
            return false;
        }
        return this.b.equals(qt9Var.b);
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        return "olink:" + this.a + "#" + this.b;
    }
}
