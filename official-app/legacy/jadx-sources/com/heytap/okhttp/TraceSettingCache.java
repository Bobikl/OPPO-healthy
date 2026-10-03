package com.heytap.okhttp;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.okhttp.trace.TraceSettingStore;
import com.oplus.aiunit.vision.r7b;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R-\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/okhttp/TraceSettingCache;", "", "", Fields.PRODUCT_ID, "Lcom/oplus/aiunit/vision/r7b;", "logger", "Lcom/heytap/okhttp/trace/TraceSettingStore;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/ref/WeakReference;", "Lkotlin/Lazy;", "b", "()Ljava/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class TraceSettingCache {
    public static final TraceSettingCache INSTANCE = new TraceSettingCache();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Lazy cache = LazyKt__LazyJVMKt.lazy(new Function0<ConcurrentHashMap<String, WeakReference<TraceSettingStore>>>() { // from class: com.heytap.okhttp.TraceSettingCache$cache$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ConcurrentHashMap<String, WeakReference<TraceSettingStore>> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    @NotNull
    public final TraceSettingStore a(@NotNull String productId, @Nullable r7b logger) {
        TraceSettingStore traceSettingStore;
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (!(!StringsKt__StringsJVMKt.isBlank(productId))) {
            throw new IllegalArgumentException("productId can not be blank!".toString());
        }
        WeakReference<TraceSettingStore> weakReference = b().get(productId);
        if (weakReference != null && (traceSettingStore = weakReference.get()) != null) {
            return traceSettingStore;
        }
        TraceSettingStore traceSettingStore2 = new TraceSettingStore(logger);
        INSTANCE.b().put(productId, new WeakReference<>(traceSettingStore2));
        return traceSettingStore2;
    }

    public final ConcurrentHashMap<String, WeakReference<TraceSettingStore>> b() {
        return (ConcurrentHashMap) cache.getValue();
    }
}
