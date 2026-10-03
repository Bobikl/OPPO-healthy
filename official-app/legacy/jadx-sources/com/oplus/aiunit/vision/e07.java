package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class e07 {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10744c;
    public final int d = c();

    public e07(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.f10744c = str3;
    }

    public static e07 a(String str, String str2, String str3) {
        return new e07(str, str2, str3);
    }

    public String b(String str) {
        String str2 = this.f10744c;
        return str2 == null ? str : str2;
    }

    public final int c() {
        return Objects.hash(this.a, this.b, this.f10744c, Integer.valueOf(this.d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e07)) {
            return false;
        }
        e07 e07Var = (e07) obj;
        return this.d == e07Var.d && Objects.equals(this.a, e07Var.a) && Objects.equals(this.b, e07Var.b) && Objects.equals(this.f10744c, e07Var.f10744c);
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        return "oaf:" + this.a + "#" + this.b + "#" + this.f10744c;
    }
}
