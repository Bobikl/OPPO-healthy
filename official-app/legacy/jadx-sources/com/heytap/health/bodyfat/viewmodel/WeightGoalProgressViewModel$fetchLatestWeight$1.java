package com.heytap.health.bodyfat.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.bodyfat.viewmodel.WeightGoalProgressViewModel", f = "WeightGoalProgressViewModel.kt", i = {}, l = {85}, m = "fetchLatestWeight", n = {}, s = {})
public final class WeightGoalProgressViewModel$fetchLatestWeight$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WeightGoalProgressViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeightGoalProgressViewModel$fetchLatestWeight$1(WeightGoalProgressViewModel weightGoalProgressViewModel, Continuation<? super WeightGoalProgressViewModel$fetchLatestWeight$1> continuation) {
        super(continuation);
        this.this$0 = weightGoalProgressViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.y(null, this);
    }
}
