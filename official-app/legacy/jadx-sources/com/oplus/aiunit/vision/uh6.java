package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;

/* JADX INFO: loaded from: classes19.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class uh6 {
    public static final uh6 b = new uh6();
    public final LruCache<String, wg6> a = new LruCache<>(20);

    @VisibleForTesting
    public uh6() {
    }

    public static uh6 b() {
        return b;
    }

    @Nullable
    public wg6 a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.a.get(str);
    }

    public void c(@Nullable String str, wg6 wg6Var) {
        if (str == null) {
            return;
        }
        this.a.put(str, wg6Var);
    }
}
