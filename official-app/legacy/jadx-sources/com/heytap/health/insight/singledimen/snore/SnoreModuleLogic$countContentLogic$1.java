package com.heytap.health.insight.singledimen.snore;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.insight.singledimen.snore.SnoreModuleLogic", f = "SnoreModuleLogic.kt", i = {0, 0}, l = {55}, m = "countContentLogic", n = {"this", "queryStartTime"}, s = {"L$0", "J$0"})
public final class SnoreModuleLogic$countContentLogic$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnoreModuleLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnoreModuleLogic$countContentLogic$1(SnoreModuleLogic snoreModuleLogic, Continuation<? super SnoreModuleLogic$countContentLogic$1> continuation) {
        super(continuation);
        this.this$0 = snoreModuleLogic;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
