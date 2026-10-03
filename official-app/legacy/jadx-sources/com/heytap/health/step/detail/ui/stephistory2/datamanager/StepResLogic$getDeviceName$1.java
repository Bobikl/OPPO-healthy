package com.heytap.health.step.detail.ui.stephistory2.datamanager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.step.detail.ui.stephistory2.datamanager.StepResLogic", f = "StepResLogic.kt", i = {}, l = {243}, m = "getDeviceName", n = {}, s = {})
public final class StepResLogic$getDeviceName$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StepResLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepResLogic$getDeviceName$1(StepResLogic stepResLogic, Continuation<? super StepResLogic$getDeviceName$1> continuation) {
        super(continuation);
        this.this$0 = stepResLogic;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(null, this);
    }
}
