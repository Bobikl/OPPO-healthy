package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class ot9 {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15046c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15047e = d();

    public ot9(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.f15046c = str3;
        this.d = i;
    }

    public static ot9 a(String str, String str2, String str3, int i) {
        return new ot9(str, str2, str3, i);
    }

    public int b(int i) {
        return "?".equals(this.f15046c) ? i : Integer.parseInt(this.f15046c);
    }

    public int c() {
        return this.d;
    }

    public final int d() {
        return Objects.hash(this.a, this.b, this.f15046c, Integer.valueOf(this.f15047e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot9)) {
            return false;
        }
        ot9 ot9Var = (ot9) obj;
        return this.f15047e == ot9Var.f15047e && Objects.equals(this.a, ot9Var.a) && Objects.equals(this.b, ot9Var.b) && Objects.equals(this.f15046c, ot9Var.f15046c);
    }

    public int hashCode() {
        return this.f15047e;
    }

    public String toString() {
        return "oaf:" + this.a + "#" + this.b + "#" + this.f15046c;
    }
}
