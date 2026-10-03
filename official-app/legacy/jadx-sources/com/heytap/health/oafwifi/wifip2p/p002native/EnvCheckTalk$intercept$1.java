package com.heytap.health.oafwifi.wifip2p.p002native;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.oafwifi.wifip2p.native.EnvCheckTalk", f = "WifiIntercepts.kt", i = {0, 0, 1, 1, 1, 1, 3, 3, 4, 4}, l = {57, 63, 83, 88, 88, 104}, m = "intercept", n = {"chain", "request", "chain", "request", "p2PEnv", "deviceRequest", "chain", "request", "chain", "request"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$0", "L$1"})
public final class EnvCheckTalk$intercept$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EnvCheckTalk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnvCheckTalk$intercept$1(EnvCheckTalk envCheckTalk, Continuation<? super EnvCheckTalk$intercept$1> continuation) {
        super(continuation);
        this.this$0 = envCheckTalk;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
