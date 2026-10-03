package com.heytap.accessory.message;

import com.heytap.accessory.utils.SystemUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public final long a;
    public final long b;
    public boolean c;
    public a d;
    public int e;
    public long f;
    public int g;
    public String h;

    public b(long j, long j2) {
        this.g = 1;
        this.a = j;
        this.b = j2;
        this.e = 0;
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void b(int i) {
        this.e = i;
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
        } catch (Exception e) {
            return e.toString();
        }
    }

    public long e() {
        return this.b;
    }

    public int f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    public String h() {
        return this.h;
    }

    public boolean i() {
        return this.c;
    }

    public void j() {
        this.c = true;
    }

    public long a() {
        return this.a;
    }

    public int b() {
        return this.g;
    }

    public void a(long j) {
        this.f = j;
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
        this.e = bVar.f();
        this.f = bVar.g();
        this.c = bVar.i();
        this.d = new a(bVar.c());
    }
}
