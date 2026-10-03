package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class n97 {
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14404c = -1;
    public int d = -1;

    public n97(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static n97 a(int i, int i2) {
        return new n97(i, i2);
    }

    public static n97 b(int i, int i2, int i3, int i4) {
        n97 n97Var = new n97(i, i4);
        n97Var.f(i2);
        n97Var.e(i3);
        return n97Var;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.f14404c;
    }

    public void e(int i) {
        this.d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n97 n97Var = (n97) obj;
        return this.a == n97Var.a && this.f14404c == n97Var.f14404c && this.d == n97Var.d;
    }

    public void f(int i) {
        this.f14404c = i;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.f14404c), Integer.valueOf(this.d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FetchRequest{dataType=");
        sb.append(vdi.a(this.a));
        sb.append(", startTime=");
        int i = this.f14404c;
        sb.append(i == -1 ? "UNSET" : mzj.a(((long) i) * 1000));
        sb.append(", endTime=");
        int i2 = this.d;
        sb.append(i2 != -1 ? mzj.a(((long) i2) * 1000) : "UNSET");
        sb.append('}');
        return sb.toString();
    }
}
