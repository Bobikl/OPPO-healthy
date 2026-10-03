package com.heytap.health.esim.nsc.manager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.esim.nsc.manager.EsimPayManagerNetSource", f = "EsimPayManagerNetSource.kt", i = {}, l = {46}, m = "queryOrder", n = {}, s = {})
public final class EsimPayManagerNetSource$queryOrder$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EsimPayManagerNetSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EsimPayManagerNetSource$queryOrder$1(EsimPayManagerNetSource esimPayManagerNetSource, Continuation<? super EsimPayManagerNetSource$queryOrder$1> continuation) {
        super(continuation);
        this.this$0 = esimPayManagerNetSource;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
