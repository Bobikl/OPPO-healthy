package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes19.dex */
public class s9j {
    public static final long TIME_OUT = 10000;
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16514c = 10000;
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16515e;
    public a f;

    public static class a {
        public String a(Intent intent) {
            return "";
        }

        public String b(Context context, String str, String str2) {
            return "com.op.smartwear.public.next";
        }
    }

    public s9j(String str) {
        this.a = str;
        this.b = str.hashCode();
    }

    public int a() {
        return this.f16515e;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public a e() {
        return this.f;
    }

    public long f() {
        return this.f16514c;
    }

    public void g(int i) {
        this.f16515e = i;
    }

    public s9j h(a aVar) {
        this.f = aVar;
        return this;
    }

    public s9j i(long j2) {
        this.f16514c = j2;
        return this;
    }

    public String toString() {
        return "SyncDataBean{syncAction='" + this.a + "', nativeWhat=" + this.b + ", timeOut=" + this.f16514c + ", maxRetryCount=" + this.d + ", currRetryCount=" + this.f16515e + '}';
    }
}
