package com.heytap.health.esim.nsc.manager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.esim.nsc.manager.EsimPayManager", f = "EsimPayManager.kt", i = {}, l = {53}, m = "pay-bMdYcbs", n = {}, s = {})
public final class EsimPayManager$pay$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EsimPayManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EsimPayManager$pay$1(EsimPayManager esimPayManager, Continuation<? super EsimPayManager$pay$1> continuation) {
        super(continuation);
        this.this$0 = esimPayManager;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objD = this.this$0.d(null, null, null, null, null, 0, this);
        return objD == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Result.m5286boximpl(objD);
    }
}
