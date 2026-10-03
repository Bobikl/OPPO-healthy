package com.heytap.retry;

import com.oplus.aiunit.vision.vvf;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/lang/ref/WeakReference;", "Lcom/oplus/aiunit/vision/vvf;", "invoke", "()Ljava/util/concurrent/ConcurrentHashMap;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
final class RetryLogicCache$cache$2 extends Lambda implements Function0<ConcurrentHashMap<String, WeakReference<vvf>>> {
    public static final RetryLogicCache$cache$2 INSTANCE = new RetryLogicCache$cache$2();

    public RetryLogicCache$cache$2() {
        super(0);
    }

    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final ConcurrentHashMap<String, WeakReference<vvf>> invoke() {
        return new ConcurrentHashMap<>();
    }
}
