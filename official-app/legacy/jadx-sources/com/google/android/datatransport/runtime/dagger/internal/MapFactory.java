package com.google.android.datatransport.runtime.dagger.internal;

import com.oplus.aiunit.vision.b2f;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class MapFactory<K, V> extends AbstractMapFactory<K, V, V> {
    private static final b2f<Map<Object, Object>> EMPTY = InstanceFactory.create(Collections.emptyMap());

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, V> {
        public MapFactory<K, V> build() {
            return new MapFactory<>(this.map);
        }

        private Builder(int i) {
            super(i);
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> put(K k, b2f<V> b2fVar) {
            super.put((Object) k, (b2f) b2fVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(b2f<Map<K, V>> b2fVar) {
            super.putAll((b2f) b2fVar);
            return this;
        }
    }

    public static <K, V> Builder<K, V> builder(int i) {
        return new Builder<>(i);
    }

    public static <K, V> b2f<Map<K, V>> emptyMapProvider() {
        return (b2f<Map<K, V>>) EMPTY;
    }

    private MapFactory(Map<K, b2f<V>> map) {
        super(map);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory, com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public Map<K, V> get() {
        LinkedHashMap linkedHashMapNewLinkedHashMapWithExpectedSize = DaggerCollections.newLinkedHashMapWithExpectedSize(contributingMap().size());
        for (Map.Entry<K, b2f<V>> entry : contributingMap().entrySet()) {
            linkedHashMapNewLinkedHashMapWithExpectedSize.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapNewLinkedHashMapWithExpectedSize);
    }
}
