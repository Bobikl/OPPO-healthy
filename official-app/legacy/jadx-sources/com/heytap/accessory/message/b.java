package com.heytap.accessory.message;

import com.heytap.accessory.utils.SystemUtils;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public final long a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2600c;
    public a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2601e;
    public long f;
    public int g;
    public String h;

    public b(long j2, long j3) {
        this.g = 1;
        this.a = j2;
        this.b = j3;
        this.f2601e = 0;
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void b(int i) {
        this.f2601e = i;
    }

    public a c() {
        return this.d;
    }

    public String d() {
        try {
            a aVarC = c();
            int iMin = Math.min(20, aVarC.f().getBuffer().length);
            SystemUtils.arraycopy(aVarC.f().getBuffer(), 0, new byte[iMin], 0, iMin);
            return aVarC.h() + ", uniqueId:" + h();
        } catch (Exception e2) {
            return e2.toString();
        }
    }

    public long e() {
        return this.b;
    }

    public int f() {
        return this.f2601e;
    }

    public long g() {
        return this.f;
    }

    public String h() {
        return this.h;
    }

    public boolean i() {
        return this.f2600c;
    }

    public void j() {
        this.f2600c = true;
    }

    public long a() {
        return this.a;
    }

    public int b() {
        return this.g;
    }

    public void a(long j2) {
        this.f = j2;
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(String str) {
        this.h = str;
    }

    public b(b bVar) {
        this.g = 1;
        this.a = bVar.a();
        this.b = bVar.e();
        this.f2601e = bVar.f();
        this.f = bVar.g();
        this.f2600c = bVar.i();
        this.d = new a(bVar.c());
    }
}
