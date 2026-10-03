package com.oplus.aiunit.vision;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public class amm {
    public byte[] a;

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ boolean f9435c = true;
        public int a;
        public byte[] b;

        public b() {
        }

        public b b(int i) {
            this.a = i;
            return this;
        }

        public b c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        public amm d() {
            if (f9435c || this.a <= 0 || this.b == null) {
                return new amm(this);
            }
            throw new AssertionError();
        }
    }

    public amm(b bVar) {
        int unused = bVar.a;
        this.a = bVar.b;
    }

    public static b b() {
        return new b();
    }

    public String a() {
        return new String(this.a, Charset.defaultCharset());
    }
}
