package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/t9i;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class t9i implements CoroutineScope {
    public final /* synthetic */ CoroutineScope i = CoroutineScopeKt.CoroutineScope(new CoroutineName("Sport").plus(wq8.INSTANCE.e()));

    @NotNull
    public static final t9i INSTANCE = new t9i();
    public static final int $stable = 8;

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.i.getCoroutineContext();
    }
}
