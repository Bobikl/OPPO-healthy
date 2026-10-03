package com.heytap.sports.home.frag.badminton;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.home.frag.badminton.BadmintonHomeRepo", f = "BadmintonHomeRepo.kt", i = {}, l = {78}, m = "getLatestRecord", n = {}, s = {})
public final class BadmintonHomeRepo$getLatestRecord$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BadmintonHomeRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadmintonHomeRepo$getLatestRecord$1(BadmintonHomeRepo badmintonHomeRepo, Continuation<? super BadmintonHomeRepo$getLatestRecord$1> continuation) {
        super(continuation);
        this.this$0 = badmintonHomeRepo;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
