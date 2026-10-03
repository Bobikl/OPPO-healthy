package com.heytap.health.stress.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.stress.viewmodel.StressStoreViewModel", f = "StressStoreViewModel.kt", i = {}, l = {90}, m = "fetchFirstDataTime", n = {}, s = {})
public final class StressStoreViewModel$fetchFirstDataTime$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StressStoreViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressStoreViewModel$fetchFirstDataTime$1(StressStoreViewModel stressStoreViewModel, Continuation<? super StressStoreViewModel$fetchFirstDataTime$1> continuation) {
        super(continuation);
        this.this$0 = stressStoreViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(this);
    }
}
