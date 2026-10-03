package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class f8i {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11264c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11265e = 0;
    public long f = -1;
    public long g = -1;
    public String h;

    public f8i() {
    }

    public void a(long j2) {
        long j3 = this.f;
        if (j3 != -1) {
            this.g = j2 - j3;
        }
    }

    public void b(String str) {
        this.f11264c = str;
    }

    public void c(long j2) {
        this.f = j2;
    }

    public void d(String str) {
        this.a = str;
    }

    public void e(String str) {
        this.h = str;
    }

    public void f(int i) {
        this.f11265e = i;
    }

    public void g(long j2) {
        this.g = j2;
    }

    public void h(String str) {
        this.d = str;
    }

    public void i(String str) {
        this.b = str;
    }

    public String j() {
        StringBuilder sb = new StringBuilder(n04.OPEN_BRACE_REGEX);
        if (!TextUtils.isEmpty(this.a)) {
            sb.append("n:");
            sb.append(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(",v:");
            sb.append(this.b);
        }
        if (!TextUtils.isEmpty(this.f11264c)) {
            sb.append(",a:");
            sb.append(this.f11264c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            sb.append(",t:");
            sb.append(this.d);
        }
        sb.append(",r:");
        sb.append(this.f11265e);
        if (this.g >= 0) {
            sb.append(",c:");
            sb.append(this.g);
        }
        if (!TextUtils.isEmpty(this.h)) {
            sb.append(",p:");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }

    public String toString() {
        return "SplitReporterInfo{mName='" + this.a + "', mVersion='" + this.b + "', mAction='" + this.f11264c + "', mType='" + this.d + "', mResultCode=" + this.f11265e + ", mActionStartTime=" + this.f + ", mTimeCost=" + this.g + ", mProcessName='" + this.h + "'}";
    }

    public f8i(String str) {
        this.a = str;
    }

    public f8i(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
