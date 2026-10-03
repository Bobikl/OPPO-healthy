package com.heytap.health.devicemanager.client.impl.multiple;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicemanager.client.impl.multiple.DMCallMulitipleImpl", f = "DMCallMulitipleImpl.kt", i = {0}, l = {43}, m = "sendMessageWithCoroutine", n = {"this"}, s = {"L$0"})
public final class DMCallMulitipleImpl$sendMessageWithCoroutine$2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DMCallMulitipleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DMCallMulitipleImpl$sendMessageWithCoroutine$2(DMCallMulitipleImpl dMCallMulitipleImpl, Continuation<? super DMCallMulitipleImpl$sendMessageWithCoroutine$2> continuation) {
        super(continuation);
        this.this$0 = dMCallMulitipleImpl;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, null, 0L, 0, this);
    }
}
