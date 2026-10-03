package com.heytap.msp.okipc.client;

/* JADX INFO: loaded from: classes19.dex */
public class e<T> {
    public final com.heytap.msp.okipc.e a;
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7336c;
    public final boolean d;

    public e(com.heytap.msp.okipc.e eVar, T t, byte[] bArr) {
        this.a = eVar;
        this.b = t;
        this.f7336c = bArr;
        this.d = eVar != null && eVar.f();
    }

    public static <T> e<T> a(byte[] bArr, com.heytap.msp.okipc.e eVar) {
        return new e<>(eVar, null, bArr);
    }

    public static <T> e<T> b(T t, com.heytap.msp.okipc.e eVar) {
        return new e<>(eVar, t);
    }

    public e(com.heytap.msp.okipc.e eVar, T t) {
        this(eVar, t, null);
    }
}
