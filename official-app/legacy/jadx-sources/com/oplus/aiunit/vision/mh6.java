package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public final class mh6<V> {

    @Nullable
    public final V a;

    @Nullable
    public final Throwable b;

    public mh6(V v) {
        this.a = v;
        this.b = null;
    }

    @Nullable
    public Throwable a() {
        return this.b;
    }

    @Nullable
    public V b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh6)) {
            return false;
        }
        mh6 mh6Var = (mh6) obj;
        if (b() != null && b().equals(mh6Var.b())) {
            return true;
        }
        if (a() == null || mh6Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public mh6(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
