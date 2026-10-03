package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class f07 {
    public final int a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11156c = c();

    public f07(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static f07 a(int i, String str) {
        return new f07(i, str);
    }

    public String b(String str) {
        String str2 = this.b;
        return str2 == null ? str : str2;
    }

    public int c() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f07)) {
            return false;
        }
        f07 f07Var = (f07) obj;
        return this.a == f07Var.a && Objects.equals(this.b, f07Var.b);
    }

    public int hashCode() {
        return this.f11156c;
    }

    public String toString() {
        return "olink:" + this.a + "#" + this.b;
    }
}
