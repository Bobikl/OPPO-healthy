package com.alipay.android.phone.mrpc.core;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f557c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f558e;
    public long f;
    public String g;
    public HttpUrlHeader h;

    public p(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.h = httpUrlHeader;
        this.f557c = i;
        this.d = str;
        this.a = bArr;
    }

    public final HttpUrlHeader a() {
        return this.h;
    }

    public final void b(long j2) {
        this.f = j2;
    }

    public final void a(long j2) {
        this.f558e = j2;
    }

    public final void a(String str) {
        this.g = str;
    }
}
