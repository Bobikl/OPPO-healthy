package com.heytap.health.wallet.transmit;

import com.oplus.smartenginehelper.entity.ViewEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.wallet.transmit.WearMsgProcessorKt", f = "WearMsgProcessor.kt", i = {0, 0}, l = {62}, m = "getNfcEnabled", n = {ViewEntity.ENABLED, "startMil"}, s = {"L$0", "J$0"})
public final class WearMsgProcessorKt$getNfcEnabled$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WearMsgProcessorKt$getNfcEnabled$1(Continuation<? super WearMsgProcessorKt$getNfcEnabled$1> continuation) {
        super(continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WearMsgProcessorKt.f(null, this);
    }
}
