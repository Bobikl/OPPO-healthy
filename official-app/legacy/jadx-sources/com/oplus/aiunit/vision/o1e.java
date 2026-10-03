package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Lkotlin/Pair;", "pairs", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "([Lkotlin/Pair;)Ljava/util/concurrent/ConcurrentHashMap;", "foundation-internal_release"}, k = 2, mv = {1, 8, 0})
public final class o1e {
    @NotNull
    public static final <K, V> ConcurrentHashMap<K, V> a(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        ConcurrentHashMap<K, V> concurrentHashMap = new ConcurrentHashMap<>();
        for (Pair<? extends K, ? extends V> pair : pairs) {
            K kComponent1 = pair.component1();
            V vComponent2 = pair.component2();
            if (kComponent1 != null && vComponent2 != null) {
                concurrentHashMap.put(kComponent1, vComponent2);
            }
        }
        return concurrentHashMap;
    }
}
