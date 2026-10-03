package com.heytap.health.health_archives.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.health_archives.viewmodel.IndicatorFragmentViewModel", f = "IndicatorFragmentViewModel.kt", i = {0, 0}, l = {78}, m = "getIndicatorStat", n = {"this", "isOwnerChanged"}, s = {"L$0", "Z$0"})
public final class IndicatorFragmentViewModel$getIndicatorStat$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IndicatorFragmentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorFragmentViewModel$getIndicatorStat$1(IndicatorFragmentViewModel indicatorFragmentViewModel, Continuation<? super IndicatorFragmentViewModel$getIndicatorStat$1> continuation) {
        super(continuation);
        this.this$0 = indicatorFragmentViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A(false, this);
    }
}
