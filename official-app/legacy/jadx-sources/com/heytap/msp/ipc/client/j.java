package com.heytap.msp.ipc.client;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class j {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7318c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7319e;

    public j() {
    }

    public static j a(String str, String str2) {
        return b(str, null, str2, null);
    }

    public static j b(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        j jVar = new j();
        jVar.b = str;
        jVar.d = str3;
        jVar.f7319e = str2;
        jVar.a = str4;
        return jVar;
    }

    public static j c(String str, String str2) {
        return d(str, null, str2, null);
    }

    public static j d(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        j jVar = new j();
        jVar.b = str;
        jVar.f7318c = str3;
        jVar.f7319e = str2;
        jVar.a = str4;
        return jVar;
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
        j jVar = (j) obj;
        return Objects.equals(this.a, jVar.a) && Objects.equals(this.b, jVar.b) && Objects.equals(this.f7318c, jVar.f7318c) && Objects.equals(this.d, jVar.d);
    }

    public String f() {
        return this.f7318c;
    }

    public String g() {
        return this.b;
    }

    public boolean h() {
        return (TextUtils.isEmpty(this.b) || (TextUtils.isEmpty(this.d) && TextUtils.isEmpty(this.f7318c))) ? false : true;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.f7318c, this.d);
    }

    public String toString() {
        return "TargetInfo{name='" + this.a + "', packageName='" + this.b + "', authorities='" + this.f7318c + "', action='" + this.d + "'}";
    }

    public j(j jVar) {
        this.a = jVar.a;
        this.b = jVar.b;
        this.f7318c = jVar.f7318c;
        this.d = jVar.d;
    }
}
