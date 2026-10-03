package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import com.oplus.aiunit.vision.b2f;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, b2f<V>> implements Lazy<Map<K, b2f<V>>> {

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, b2f<V>> {
        public MapProviderFactory<K, V> build() {
            return new MapProviderFactory<>(this.map);
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
        public Builder<K, V> putAll(b2f<Map<K, b2f<V>>> b2fVar) {
            super.putAll((b2f) b2fVar);
            return this;
        }
    }

    public static <K, V> Builder<K, V> builder(int i) {
        return new Builder<>(i);
    }

    private MapProviderFactory(Map<K, b2f<V>> map) {
        super(map);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory, com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public Map<K, b2f<V>> get() {
        return contributingMap();
    }
}
