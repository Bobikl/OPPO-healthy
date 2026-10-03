package com.heytap.wallet.business.usecases;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.wallet.business.usecases.ReportCardsUC", f = "ReportCardsUC.kt", i = {}, l = {54}, m = "getTrackingData", n = {}, s = {})
public final class ReportCardsUC$getTrackingData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReportCardsUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportCardsUC$getTrackingData$1(ReportCardsUC reportCardsUC, Continuation<? super ReportCardsUC$getTrackingData$1> continuation) {
        super(continuation);
        this.this$0 = reportCardsUC;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
