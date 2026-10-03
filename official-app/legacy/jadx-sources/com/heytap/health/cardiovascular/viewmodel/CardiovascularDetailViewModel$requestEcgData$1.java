package com.heytap.health.cardiovascular.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.cardiovascular.viewmodel.CardiovascularDetailViewModel", f = "CardiovascularDetailViewModel.kt", i = {}, l = {37}, m = "requestEcgData", n = {}, s = {})
public final class CardiovascularDetailViewModel$requestEcgData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CardiovascularDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardiovascularDetailViewModel$requestEcgData$1(CardiovascularDetailViewModel cardiovascularDetailViewModel, Continuation<? super CardiovascularDetailViewModel$requestEcgData$1> continuation) {
        super(continuation);
        this.this$0 = cardiovascularDetailViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.x(null, this);
    }
}
