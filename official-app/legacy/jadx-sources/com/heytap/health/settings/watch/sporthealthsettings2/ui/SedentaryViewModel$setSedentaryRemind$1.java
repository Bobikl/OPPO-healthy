package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SedentaryViewModel", f = "SedentaryViewModel.kt", i = {0}, l = {46, 47}, m = "setSedentaryRemind", n = {"this"}, s = {"L$0"})
public final class SedentaryViewModel$setSedentaryRemind$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SedentaryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SedentaryViewModel$setSedentaryRemind$1(SedentaryViewModel sedentaryViewModel, Continuation<? super SedentaryViewModel$setSedentaryRemind$1> continuation) {
        super(continuation);
        this.this$0 = sedentaryViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.y0(false, false, this);
    }
}
