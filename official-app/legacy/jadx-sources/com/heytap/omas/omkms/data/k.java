package com.heytap.omas.omkms.data;

import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class k {
    private Omkms3.Pack a;
    private Omkms3.Pack b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7625c;
    private long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7626e;
    private long f;
    private long g;
    private long h;

    public static final class b {
        private Omkms3.Pack a;
        private Omkms3.Pack b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f7627c;
        private long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f7628e;
        private long f;
        private long g;
        private long h;
        private String i;

        private b() {
        }

        public b a(long j2) {
            this.d = j2;
            return this;
        }

        public b b(long j2) {
            this.f7628e = j2;
            return this;
        }

        public b c(long j2) {
            this.f = j2;
            return this;
        }

        public b a(Omkms3.Pack pack) {
            this.a = pack;
            return this;
        }

        public b b(Omkms3.Pack pack) {
            this.b = pack;
            return this;
        }

        public b d(long j2) {
            this.g = j2;
            return this;
        }

        public b e(long j2) {
            this.h = j2;
            return this;
        }

        public b a(String str) {
            this.i = str;
            return this;
        }

        public b b(String str) {
            this.f7627c = str;
            return this;
        }

        public k a() {
            return new k(this);
        }
    }

    private k(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f7625c = bVar.f7627c;
        this.d = bVar.d;
        this.f7626e = bVar.f7628e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
    }

    public static b i() {
        return new b();
    }

    public long a() {
        return this.d;
    }

    public long b() {
        return this.f7626e;
    }

    public long c() {
        return this.f;
    }

    public Omkms3.Pack d() {
        return this.a;
    }

    public long e() {
        return this.g;
    }

    public long f() {
        return this.h;
    }

    public Omkms3.Pack g() {
        return this.b;
    }

    public String h() {
        return this.f7625c;
    }
}
