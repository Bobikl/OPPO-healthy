package com.heytap.health.oafwifi.wifip2p.p002native;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.oafwifi.wifip2p.native.GoServerWaitConfig", f = "WifiIntercepts.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 3, 3}, l = {118, 128, 142, 142, 145}, m = "intercept", n = {"chain", "request", "chain", "request", "p2pConfig", "groupInfo", "chain", "request", "chain", "request"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1"})
public final class GoServerWaitConfig$intercept$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GoServerWaitConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoServerWaitConfig$intercept$1(GoServerWaitConfig goServerWaitConfig, Continuation<? super GoServerWaitConfig$intercept$1> continuation) {
        super(continuation);
        this.this$0 = goServerWaitConfig;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
