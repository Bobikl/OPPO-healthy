package p010kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public interface CacheWithNotNullValues<K, V> {
    @NotNull
    V computeIfAbsent(K k, @NotNull Function0<? extends V> function0);
}
