package com.heytap.store.platform.htrouter.base;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/platform/htrouter/base/UniqueKeyTreeMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/TreeMap;", "tipText", "", "(Ljava/lang/String;)V", "put", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class UniqueKeyTreeMap<K, V> extends TreeMap<K, V> {
    private String tipText;

    public UniqueKeyTreeMap(@NotNull String tipText) {
        Intrinsics.checkNotNullParameter(tipText, "tipText");
        this.tipText = tipText;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection getValues() {
        return super.values();
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K key, V value) {
        if (containsKey(key)) {
            return null;
        }
        return (V) super.put(key, value);
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
