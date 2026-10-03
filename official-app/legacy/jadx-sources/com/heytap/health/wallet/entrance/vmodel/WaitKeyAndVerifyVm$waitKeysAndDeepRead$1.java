package com.heytap.health.wallet.entrance.vmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.wallet.entrance.vmodel.WaitKeyAndVerifyVm", f = "WaitKeyAndVerifyVm.kt", i = {0, 1, 2}, l = {86, 96, 106}, m = "waitKeysAndDeepRead", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
public final class WaitKeyAndVerifyVm$waitKeysAndDeepRead$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WaitKeyAndVerifyVm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitKeyAndVerifyVm$waitKeysAndDeepRead$1(WaitKeyAndVerifyVm waitKeyAndVerifyVm, Continuation<? super WaitKeyAndVerifyVm$waitKeysAndDeepRead$1> continuation) {
        super(continuation);
        this.this$0 = waitKeyAndVerifyVm;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.G(this);
    }
}
