package com.heytap.okhttp.extension.retry;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R-\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/heytap/okhttp/extension/retry/RetryLogicCache;", "", "", Fields.PRODUCT_ID, "Lcom/heytap/okhttp/extension/retry/RetryLogic;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/ref/WeakReference;", "Lkotlin/Lazy;", "b", "()Ljava/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class RetryLogicCache {
    public static final RetryLogicCache INSTANCE = new RetryLogicCache();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Lazy cache = LazyKt__LazyJVMKt.lazy(new Function0<ConcurrentHashMap<String, WeakReference<RetryLogic>>>() { // from class: com.heytap.okhttp.extension.retry.RetryLogicCache$cache$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ConcurrentHashMap<String, WeakReference<RetryLogic>> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    @NotNull
    public final RetryLogic a(@NotNull String productId) {
        RetryLogic retryLogic;
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (!(!StringsKt__StringsJVMKt.isBlank(productId))) {
            throw new IllegalArgumentException("productId can not be blank!".toString());
        }
        WeakReference<RetryLogic> weakReference = b().get(productId);
        if (weakReference != null && (retryLogic = weakReference.get()) != null) {
            return retryLogic;
        }
        RetryLogic retryLogic2 = new RetryLogic();
        INSTANCE.b().put(productId, new WeakReference<>(retryLogic2));
        return retryLogic2;
    }

    public final ConcurrentHashMap<String, WeakReference<RetryLogic>> b() {
        return (ConcurrentHashMap) cache.getValue();
    }
}
