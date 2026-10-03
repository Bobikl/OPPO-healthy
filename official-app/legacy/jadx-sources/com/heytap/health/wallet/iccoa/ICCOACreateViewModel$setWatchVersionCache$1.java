package com.heytap.health.wallet.iccoa;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.wallet.iccoa.ICCOACreateViewModel", f = "ICCOACreateViewModel.kt", i = {0, 0}, l = {246}, m = "setWatchVersionCache", n = {"this", "version"}, s = {"L$0", "L$1"})
public final class ICCOACreateViewModel$setWatchVersionCache$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ICCOACreateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICCOACreateViewModel$setWatchVersionCache$1(ICCOACreateViewModel iCCOACreateViewModel, Continuation<? super ICCOACreateViewModel$setWatchVersionCache$1> continuation) {
        super(continuation);
        this.this$0 = iCCOACreateViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.O(this);
    }
}
