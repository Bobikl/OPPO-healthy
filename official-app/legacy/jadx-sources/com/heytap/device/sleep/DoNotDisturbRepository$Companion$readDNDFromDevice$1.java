package com.heytap.device.sleep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.device.sleep.DoNotDisturbRepository$Companion", f = "DoNotDisturbRepository.kt", i = {}, l = {63}, m = "readDNDFromDevice", n = {}, s = {})
public final class DoNotDisturbRepository$Companion$readDNDFromDevice$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DoNotDisturbRepository.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoNotDisturbRepository$Companion$readDNDFromDevice$1(DoNotDisturbRepository.Companion companion, Continuation<? super DoNotDisturbRepository$Companion$readDNDFromDevice$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(this);
    }
}
