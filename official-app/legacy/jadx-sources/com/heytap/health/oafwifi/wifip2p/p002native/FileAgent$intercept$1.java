package com.heytap.health.oafwifi.wifip2p.p002native;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.oafwifi.wifip2p.native.FileAgent", f = "WifiIntercepts.kt", i = {}, l = {248}, m = "intercept", n = {}, s = {})
public final class FileAgent$intercept$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileAgent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAgent$intercept$1(FileAgent fileAgent, Continuation<? super FileAgent$intercept$1> continuation) {
        super(continuation);
        this.this$0 = fileAgent;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
