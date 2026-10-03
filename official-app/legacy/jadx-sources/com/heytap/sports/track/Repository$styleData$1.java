package com.heytap.sports.track;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.track.Repository", f = "Repository.kt", i = {0}, l = {184, 184}, m = "styleData", n = {"trackStyles"}, s = {"L$0"})
public final class Repository$styleData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Repository$styleData$1(Repository repository, Continuation<? super Repository$styleData$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(this);
    }
}
