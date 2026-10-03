package com.heytap.omas.omkms.data;

import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private int a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f7615c;

    public static final class b {
        private int a;
        private String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f7616c;

        private b() {
        }

        public b a(int i) {
            this.a = i;
            return this;
        }

        public b a(String str) {
            this.b = str;
            return this;
        }

        public b a(byte[] bArr) {
            this.f7616c = bArr;
            return this;
        }

        public e a() {
            return new e(this);
        }
    }

    private e(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f7615c = bVar.f7616c;
    }

    public static b d() {
        return new b();
    }

    public byte[] a() {
        return this.f7615c;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String toString() {
        return "KmsResponse{code=" + this.a + ", message='" + this.b + "', cipherText=" + Arrays.toString(this.f7615c) + '}';
    }
}
