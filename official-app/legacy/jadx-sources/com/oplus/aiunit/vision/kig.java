package com.oplus.aiunit.vision;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/kig;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class kig implements CoroutineScope {

    @NotNull
    public static final kig INSTANCE = new kig();
    public final /* synthetic */ CoroutineScope i = CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e());

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.i.getCoroutineContext();
    }
}
