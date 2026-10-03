package com.heytap.health.oobe.setups.pair.legals;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.oobe.setups.pair.legals.NewPhone", f = "NewPhone.kt", i = {0, 1}, l = {142, 145}, m = "getCurrAccountInfo", n = {"this", "this"}, s = {"L$0", "L$0"})
public final class NewPhone$getCurrAccountInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NewPhone this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPhone$getCurrAccountInfo$1(NewPhone newPhone, Continuation<? super NewPhone$getCurrAccountInfo$1> continuation) {
        super(continuation);
        this.this$0 = newPhone;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k(this);
    }
}
