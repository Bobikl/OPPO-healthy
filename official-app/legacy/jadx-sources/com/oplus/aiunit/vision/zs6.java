package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class zs6 {
    public String a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19535c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19536e;
    public int f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19537j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f19538l;

    public static zs6 a(@NonNull String str, @NonNull String str2, @NonNull String str3, long j2) {
        if (j2 == 0) {
            throw new IllegalArgumentException("eventKeyLong cannot be 0");
        }
        zs6 zs6Var = new zs6();
        Objects.requireNonNull(str, "appId cannot be null");
        zs6Var.a = str;
        Objects.requireNonNull(str2, "eventGroup cannot be null");
        zs6Var.f19535c = str2;
        Objects.requireNonNull(str3, "eventId cannot be null");
        zs6Var.d = str3;
        zs6Var.b = j2;
        return zs6Var;
    }

    public int b() {
        return this.f19536e;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.f19535c;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zs6 zs6Var = (zs6) obj;
        if (this.b == zs6Var.b && this.f19536e == zs6Var.f19536e && this.f == zs6Var.f && this.g == zs6Var.g && this.h == zs6Var.h && this.i == zs6Var.i && this.f19537j == zs6Var.f19537j && this.k == zs6Var.k && this.a.equals(zs6Var.a) && this.f19535c.equals(zs6Var.f19535c)) {
            return this.d.equals(zs6Var.d);
        }
        return false;
    }

    public long f() {
        return this.b;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.f;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j2 = this.b;
        return ((((((((((((((((((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f19535c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f19536e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.f19537j) * 31) + this.k;
    }

    public int i() {
        return this.i;
    }

    public int j() {
        return this.h;
    }

    @NonNull
    public String toString() {
        return "EventRule{appId='" + this.a + "', eventKeyLong=" + this.b + ", eventGroup='" + this.f19535c + "', eventId='" + this.d + "', acceptNetType=" + this.f19536e + ", headSwitch=" + this.f + ", eventLevel=" + this.g + ", uploadType=" + this.h + ", status=" + this.i + ", sampleRate=" + this.f19537j + ", v=" + this.k + ", updatedAt=" + this.f19538l + '}';
    }
}
