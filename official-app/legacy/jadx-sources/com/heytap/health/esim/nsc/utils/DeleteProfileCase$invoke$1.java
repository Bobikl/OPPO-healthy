package com.heytap.health.esim.nsc.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.esim.nsc.utils.DeleteProfileCase", f = "DeleteProfileCase.kt", i = {0, 0, 0}, l = {33, 50}, m = "invoke", n = {"mac", "iccid", "apiCancellation"}, s = {"L$0", "L$1", "L$2"})
public final class DeleteProfileCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeleteProfileCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteProfileCase$invoke$1(DeleteProfileCase deleteProfileCase, Continuation<? super DeleteProfileCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = deleteProfileCase;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, null, this);
    }
}
