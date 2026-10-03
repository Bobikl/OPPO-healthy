package com.oplus.aiunit.vision;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class wuf<T> {

    @Nullable
    public final ztf<T> a;

    @Nullable
    public final Throwable b;

    public wuf(@Nullable ztf<T> ztfVar, @Nullable Throwable th) {
        this.a = ztfVar;
        this.b = th;
    }

    public static <T> wuf<T> a(Throwable th) {
        if (th != null) {
            return new wuf<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> wuf<T> b(ztf<T> ztfVar) {
        if (ztfVar != null) {
            return new wuf<>(ztfVar, null);
        }
        throw new NullPointerException("response == null");
    }
}
