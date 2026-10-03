package com.oplus.aiunit.vision;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class qig<V> {
    public final Map<Integer, Map<String, V>> a = new ConcurrentHashMap();

    public void a() {
        this.a.clear();
    }

    @Nullable
    public Map<String, V> b(@Nullable Integer num) {
        return this.a.get(num);
    }

    @NonNull
    public Map<String, V> c(int i) {
        Map<String, V> map;
        ArrayMap arrayMap = new ArrayMap();
        if (this.a.keySet().size() > 0) {
            for (Integer num : this.a.keySet()) {
                if (num != null && i >= num.intValue() && (map = this.a.get(num)) != null) {
                    arrayMap.putAll(map);
                }
            }
        }
        return arrayMap;
    }

    @Nullable
    public Map<String, V> d(Integer num, Map<String, V> map) {
        Map<String, V> mapB = b(num);
        if (mapB == null) {
            mapB = new ArrayMap<>();
        }
        if (map != null && map.keySet().size() > 0) {
            mapB.putAll(map);
            this.a.put(num, mapB);
        }
        return mapB;
    }
}
