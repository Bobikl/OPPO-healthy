package com.heytap.health.devicepair.manager.task.basetask;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicepair.manager.task.basetask.BaseTaskBindKey", f = "BaseTaskBindKey.kt", i = {0}, l = {36, 38}, m = "execute$suspendImpl", n = {"$this"}, s = {"L$0"})
public final class BaseTaskBindKey$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseTaskBindKey this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTaskBindKey$execute$1(BaseTaskBindKey baseTaskBindKey, Continuation<? super BaseTaskBindKey$execute$1> continuation) {
        super(continuation);
        this.this$0 = baseTaskBindKey;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseTaskBindKey.q(this.this$0, this);
    }
}
