package com.heytap.omas.omkms.data;

/* JADX INFO: loaded from: classes19.dex */
public class b implements g {
    private String a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f7603c;
    private byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7604e;

    /* JADX INFO: renamed from: com.heytap.omas.omkms.data.b$b, reason: collision with other inner class name */
    public static final class C0733b {
        private String a;
        private int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f7605c;
        private byte[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f7606e;

        private C0733b() {
        }

        public C0733b a(int i) {
            this.f7606e = i;
            return this;
        }

        public C0733b a(String str) {
            this.a = str;
            return this;
        }

        public C0733b b(int i) {
            this.b = i;
            return this;
        }

        public C0733b a(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public C0733b b(byte[] bArr) {
            if (bArr.length != 12 || bArr.length != 16) {
                throw new IllegalArgumentException("WB encrypt only support iv 12 or 16");
            }
            this.f7605c = bArr;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    private b(C0733b c0733b) {
        this.f7604e = 0;
        this.a = c0733b.a;
        this.b = c0733b.b;
        this.f7603c = c0733b.f7605c;
        this.d = c0733b.d;
        this.f7604e = c0733b.f7606e;
    }

    public static C0733b f() {
        return new C0733b();
    }

    public byte[] a() {
        return this.d;
    }

    public String b() {
        return this.a;
    }

    public byte[] c() {
        return this.f7603c;
    }

    public int d() {
        return this.f7604e;
    }

    public int e() {
        return this.b;
    }
}
