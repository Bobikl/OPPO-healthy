package com.heytap.health.sleep.ai.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.sleep.ai.data.AIHealthRepository", f = "AIHealthRepository.kt", i = {0}, l = {40}, m = "requestHome", n = {"$this$requestHome_u24lambda_u243"}, s = {"L$0"})
public final class AIHealthRepository$requestHome$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AIHealthRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIHealthRepository$requestHome$1(AIHealthRepository aIHealthRepository, Continuation<? super AIHealthRepository$requestHome$1> continuation) {
        super(continuation);
        this.this$0 = aIHealthRepository;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
