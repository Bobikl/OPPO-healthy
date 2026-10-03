package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class ebb<V> {

    @Nullable
    public final V a;

    @Nullable
    public final Throwable b;

    public ebb(V v) {
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
        if (!(obj instanceof ebb)) {
            return false;
        }
        ebb ebbVar = (ebb) obj;
        if (b() != null && b().equals(ebbVar.b())) {
            return true;
        }
        if (a() == null || ebbVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public ebb(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
