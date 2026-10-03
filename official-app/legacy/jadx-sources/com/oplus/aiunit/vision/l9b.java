package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class l9b {
    public static final l9b b = new l9b();
    public final LruCache<String, k9b> a = new LruCache<>(20);

    @VisibleForTesting
    public l9b() {
    }

    public static l9b b() {
        return b;
    }

    @Nullable
    public k9b a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.a.get(str);
    }

    public void c(@Nullable String str, k9b k9bVar) {
        if (str == null) {
            return;
        }
        this.a.put(str, k9bVar);
    }
}
