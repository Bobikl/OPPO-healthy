package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes3.dex */
public class tvg {
    public static tvg d = new tvg();
    public String a = null;
    public final long b = 7200000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17177c = System.currentTimeMillis();

    public static tvg c() {
        return d;
    }

    public long a() {
        return 7200000L;
    }

    public long b() {
        return this.f17177c;
    }

    public String d() {
        return this.a;
    }

    public Boolean e() {
        return System.currentTimeMillis() - this.f17177c > 7200000 ? Boolean.TRUE : Boolean.FALSE;
    }

    public Boolean f() {
        String str = this.a;
        return (str == null || str.length() == 0) ? Boolean.TRUE : Boolean.FALSE;
    }

    public void g(long j2) {
        this.f17177c = j2;
    }

    public void h(String str) {
        this.a = str;
    }
}
