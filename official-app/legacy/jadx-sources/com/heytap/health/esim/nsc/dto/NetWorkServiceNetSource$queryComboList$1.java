package com.heytap.health.esim.nsc.dto;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.esim.nsc.dto.NetWorkServiceNetSource", f = "NetWorkServiceNetSource.kt", i = {}, l = {128}, m = "queryComboList", n = {}, s = {})
public final class NetWorkServiceNetSource$queryComboList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetWorkServiceNetSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetWorkServiceNetSource$queryComboList$1(NetWorkServiceNetSource netWorkServiceNetSource, Continuation<? super NetWorkServiceNetSource$queryComboList$1> continuation) {
        super(continuation);
        this.this$0 = netWorkServiceNetSource;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j(null, null, this);
    }
}
