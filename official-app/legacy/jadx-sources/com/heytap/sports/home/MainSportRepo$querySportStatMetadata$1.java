package com.heytap.sports.home;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.home.MainSportRepo", f = "MainSportRepo.kt", i = {}, l = {75}, m = "querySportStatMetadata", n = {}, s = {})
public final class MainSportRepo$querySportStatMetadata$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MainSportRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainSportRepo$querySportStatMetadata$1(MainSportRepo mainSportRepo, Continuation<? super MainSportRepo$querySportStatMetadata$1> continuation) {
        super(continuation);
        this.this$0 = mainSportRepo;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, 0, 0, this);
    }
}
