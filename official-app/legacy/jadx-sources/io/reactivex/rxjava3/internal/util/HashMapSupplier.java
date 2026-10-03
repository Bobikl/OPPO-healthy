package io.reactivex.rxjava3.internal.util;

import com.oplus.aiunit.vision.f4j;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public enum HashMapSupplier implements f4j<Map<Object, Object>> {
    INSTANCE;

    public static <K, V> f4j<Map<K, V>> asSupplier() {
        return INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.f4j
    public Map<Object, Object> get() {
        return new HashMap();
    }
}
