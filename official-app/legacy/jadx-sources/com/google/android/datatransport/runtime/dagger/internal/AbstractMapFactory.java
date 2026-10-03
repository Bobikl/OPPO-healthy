package com.google.android.datatransport.runtime.dagger.internal;

import com.oplus.aiunit.vision.b2f;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    private final Map<K, b2f<V>> contributingMap;

    public static abstract class Builder<K, V, V2> {
        final LinkedHashMap<K, b2f<V>> map;

        public Builder(int i) {
            this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        public Builder<K, V, V2> put(K k, b2f<V> b2fVar) {
            this.map.put((K) Preconditions.checkNotNull(k, "key"), (b2f<V>) Preconditions.checkNotNull(b2fVar, "provider"));
            return this;
        }

        public Builder<K, V, V2> putAll(b2f<Map<K, V2>> b2fVar) {
            if (b2fVar instanceof DelegateFactory) {
                return putAll(((DelegateFactory) b2fVar).getDelegate());
            }
            this.map.putAll(((AbstractMapFactory) b2fVar).contributingMap);
            return this;
        }
    }

    public AbstractMapFactory(Map<K, b2f<V>> map) {
        this.contributingMap = Collections.unmodifiableMap(map);
    }

    public final Map<K, b2f<V>> contributingMap() {
        return this.contributingMap;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public abstract /* synthetic */ Object get();
}
