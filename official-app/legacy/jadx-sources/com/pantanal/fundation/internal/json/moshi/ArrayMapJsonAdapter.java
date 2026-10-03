package com.pantanal.fundation.internal.json.moshi;

import android.util.ArrayMap;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0007J(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/pantanal/fundation/internal/json/moshi/ArrayMapJsonAdapter;", "", "()V", "fromJson", "Landroid/util/ArrayMap;", "", "map", "", "toJson", "arrayMap", "foundation-internal_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ArrayMapJsonAdapter {
    @FromJson
    @NotNull
    public final ArrayMap<String, Object> fromJson(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        arrayMap.putAll(map);
        return arrayMap;
    }

    @ToJson
    @NotNull
    public final Map<String, Object> toJson(@NotNull ArrayMap<String, Object> arrayMap) {
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        return new HashMap(arrayMap);
    }
}
