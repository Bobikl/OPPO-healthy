package com.oplus.seedling.sdk;

import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SeedlingSdk.kt\ncom/oplus/seedling/sdk/SeedlingSdk\n*L\n1#1,110:1\n95#2,4:111\n*E\n"})
public final class SeedlingSdk$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public SeedlingSdk$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key) {
        super(key);
    }

    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        ht9.a.c(s8e.INSTANCE, "SeedlingSdkInterface", "CoroutineExceptionHandler \ncoroutineContext " + context + "\nmessage： " + exception.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }
}
