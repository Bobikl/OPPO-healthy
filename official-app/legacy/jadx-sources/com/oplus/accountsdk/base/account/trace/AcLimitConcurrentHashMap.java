package com.oplus.accountsdk.base.account.trace;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AcLimitConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
    private static final int MAX_TRACE_SIZE = 300;

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NonNull K k, @NonNull V v) {
        if (size() > 300) {
            clear();
        }
        return (V) super.put(k, v);
    }
}
