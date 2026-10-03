package com.heytap.health.esim.nsc.manager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.esim.nsc.manager.LpaProfileManager", f = "LpaProfileManager.kt", i = {0, 1, 1, 1, 2, 2, 2, 2}, l = {55, 64, 74}, m = "getProfile", n = {"mac", "mac", "$this$getOrPut$iv", "deviceRepo", "mac", "$this$getOrPut$iv", "deviceRepo", "lpaProfile"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
public final class LpaProfileManager$getProfile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LpaProfileManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LpaProfileManager$getProfile$1(LpaProfileManager lpaProfileManager, Continuation<? super LpaProfileManager$getProfile$1> continuation) {
        super(continuation);
        this.this$0 = lpaProfileManager;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
