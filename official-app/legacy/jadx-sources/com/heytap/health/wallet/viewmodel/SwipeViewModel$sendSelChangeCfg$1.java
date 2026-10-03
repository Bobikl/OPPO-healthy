package com.heytap.health.wallet.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.wallet.viewmodel.SwipeViewModel", f = "SwipeViewModel.kt", i = {0, 0, 0}, l = {104}, m = "sendSelChangeCfg", n = {"this", "aidsToSend", "isSwitchOn"}, s = {"L$0", "L$1", "Z$0"})
public final class SwipeViewModel$sendSelChangeCfg$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeViewModel$sendSelChangeCfg$1(SwipeViewModel swipeViewModel, Continuation<? super SwipeViewModel$sendSelChangeCfg$1> continuation) {
        super(continuation);
        this.this$0 = swipeViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.T(null, false, this);
    }
}
