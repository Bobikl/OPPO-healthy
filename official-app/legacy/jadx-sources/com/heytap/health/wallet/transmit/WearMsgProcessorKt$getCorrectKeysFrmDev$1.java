package com.heytap.health.wallet.transmit;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.wallet.transmit.WearMsgProcessorKt", f = "WearMsgProcessor.kt", i = {0}, l = {205}, m = "getCorrectKeysFrmDev", n = {"smartSecretKeys"}, s = {"L$0"})
public final class WearMsgProcessorKt$getCorrectKeysFrmDev$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WearMsgProcessorKt$getCorrectKeysFrmDev$1(Continuation<? super WearMsgProcessorKt$getCorrectKeysFrmDev$1> continuation) {
        super(continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WearMsgProcessorKt.e(this);
    }
}
