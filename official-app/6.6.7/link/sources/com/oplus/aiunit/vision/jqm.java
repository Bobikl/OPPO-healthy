package com.oplus.aiunit.vision;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class jqm {
    public byte[] a;

    public static class b {
        public static final /* synthetic */ boolean c = true;
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

        public jqm d() {
            if (c || this.a <= 0 || this.b == null) {
                return new jqm(this);
            }
            throw new AssertionError();
        }
    }

    public jqm(b bVar) {
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
