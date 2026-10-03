package com.heytap.health.oafwifi.wifip2p.p002native;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.oafwifi.wifip2p.native.OAFConnect", f = "WifiIntercepts.kt", i = {0, 0, 0, 1, 1}, l = {179, 185, 194}, m = "intercept", n = {"this", "chain", "req", "chain", "req"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
public final class OAFConnect$intercept$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OAFConnect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAFConnect$intercept$1(OAFConnect oAFConnect, Continuation<? super OAFConnect$intercept$1> continuation) {
        super(continuation);
        this.this$0 = oAFConnect;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
