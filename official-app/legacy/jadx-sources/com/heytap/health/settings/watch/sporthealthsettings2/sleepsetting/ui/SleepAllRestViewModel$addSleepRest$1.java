package com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAllRestViewModel", f = "SleepAllRestViewModel.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {199, 153, 153}, m = "addSleepRest", n = {"this", "sleepRest", "$this$withLock_u24default$iv", "this", "sleepRest", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
public final class SleepAllRestViewModel$addSleepRest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepAllRestViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepAllRestViewModel$addSleepRest$1(SleepAllRestViewModel sleepAllRestViewModel, Continuation<? super SleepAllRestViewModel$addSleepRest$1> continuation) {
        super(continuation);
        this.this$0 = sleepAllRestViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.z0(null, this);
    }
}
