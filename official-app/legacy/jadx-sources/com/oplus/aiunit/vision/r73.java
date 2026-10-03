package com.oplus.aiunit.vision;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class r73 {
    public final long[] a = new long[2];
    public final long[] b = new long[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16105c = new AtomicBoolean(false);
    public volatile boolean d = false;

    public void a() {
        this.d = false;
    }

    public long[] b() {
        return this.a;
    }

    public long[] c() {
        return this.b;
    }

    public void d() {
        this.f16105c.set(false);
    }

    public void e() {
        long[] jArr = this.a;
        jArr[0] = 0;
        jArr[1] = 0;
        long[] jArr2 = this.b;
        jArr2[0] = 0;
        jArr2[1] = 0;
    }

    public void f() {
        e();
        this.d = true;
    }

    public String g() {
        return String.format("ChannelState{cursor=[%d,%d], hpCursor=[%d,%d], pending=%s, scanActive=%s}", Long.valueOf(this.a[0]), Long.valueOf(this.a[1]), Long.valueOf(this.b[0]), Long.valueOf(this.b[1]), Boolean.valueOf(this.f16105c.get()), Boolean.valueOf(this.d));
    }

    public boolean h() {
        return !this.f16105c.getAndSet(true);
    }

    public String toString() {
        return g();
    }
}
