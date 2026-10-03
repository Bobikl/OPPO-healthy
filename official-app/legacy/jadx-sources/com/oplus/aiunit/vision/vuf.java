package com.oplus.aiunit.vision;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class vuf<T> {

    @Nullable
    public final ztf<T> a;

    @Nullable
    public final Throwable b;

    public vuf(@Nullable ztf<T> ztfVar, @Nullable Throwable th) {
        this.a = ztfVar;
        this.b = th;
    }

    public static <T> vuf<T> a(Throwable th) {
        if (th != null) {
            return new vuf<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> vuf<T> b(ztf<T> ztfVar) {
        if (ztfVar != null) {
            return new vuf<>(ztfVar, null);
        }
        throw new NullPointerException("response == null");
    }
}
