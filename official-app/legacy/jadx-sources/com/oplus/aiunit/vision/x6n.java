package com.oplus.aiunit.vision;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes12.dex */
public class x6n {
    public static final ThreadLocal<CharsetDecoder> b = new a();
    public static final ThreadLocal<Charset> a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<CharBuffer> f18515c = new ThreadLocal<>();

    public static class a extends ThreadLocal<CharsetDecoder> {
        public static CharsetDecoder a() {
            return Charset.forName("UTF-8").newDecoder();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ CharsetDecoder initialValue() {
            return a();
        }
    }

    public static class b extends ThreadLocal<Charset> {
        public static Charset a() {
            return Charset.forName("UTF-8");
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Charset initialValue() {
            return a();
        }
    }
}
