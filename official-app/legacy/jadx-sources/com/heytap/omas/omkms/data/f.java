package com.heytap.omas.omkms.data;

import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class f implements g {
    private byte[] a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7617c;

    public static final class b {
        private byte[] a;
        private String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7618c;

        private b() {
        }

        public b a(int i) {
            this.f7618c = i;
            return this;
        }

        public b a(String str) {
            this.b = str;
            return this;
        }

        public b a(byte[] bArr) {
            this.a = bArr;
            return this;
        }

        public f a() {
            return new f(this);
        }
    }

    private f(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f7617c = bVar.f7618c;
    }

    public static b d() {
        return new b();
    }

    public String a() {
        return this.b;
    }

    public byte[] b() {
        return this.a;
    }

    public int c() {
        return this.f7617c;
    }

    public String toString() {
        return "OtherParam{iv=" + Arrays.toString(this.a) + ", alg='" + this.b + "', paddingMode=" + this.f7617c + '}';
    }
}
