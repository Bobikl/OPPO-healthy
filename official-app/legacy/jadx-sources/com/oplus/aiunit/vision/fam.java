package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public class fam {
    public long a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11282c;
    public int d;

    public fam(String str) {
        this.f11282c = str;
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(long j2) {
        this.a = j2;
    }

    public void c(String str) {
        this.b = str;
    }

    public boolean d() {
        return this.a > System.currentTimeMillis();
    }

    public void e() {
        this.a = 0L;
    }
}
