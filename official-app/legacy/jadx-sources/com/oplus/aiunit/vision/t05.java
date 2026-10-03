package com.oplus.aiunit.vision;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002(\u0012\u0004\u0012\u00020\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022 \u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003H\u0016J-\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R:\u0010\f\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/t05;", "", "", "", "Lcom/oplus/aiunit/vision/l05;", "dateKey", "value", "", "b", "a", "", "Ljava/util/Map;", "cache", "<init>", "()V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final class t05 {

    @NotNull
    public static final t05 INSTANCE = new t05();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Map<String, Map<String, l05>>> cache;

    static {
        Map<String, Map<String, Map<String, l05>>> mapSynchronizedMap = Collections.synchronizedMap(new ArrayMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(\n        ArrayMap()\n    )");
        cache = mapSynchronizedMap;
    }

    @Nullable
    public Map<String, Map<String, l05>> a(@Nullable String dateKey) {
        Map<String, Map<String, Map<String, l05>>> map = cache;
        if (map.containsKey(dateKey)) {
            return map.get(dateKey);
        }
        return null;
    }

    public void b(@Nullable String dateKey, @Nullable Map<String, ? extends Map<String, l05>> value) {
        if (dateKey == null) {
            return;
        }
        cache.put(dateKey, value);
    }
}
