package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SnoringRiskViewModel", f = "SnoringRiskViewModel.kt", i = {0, 0, 0, 1, 2, 2, 3}, l = {66, 68, 93, 119, 119}, m = "setSnoringRiskAssessment", n = {"this", "activity", "enable", "activity", "this", "enable", "this"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$0", "Z$0", "L$0"})
public final class SnoringRiskViewModel$setSnoringRiskAssessment$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnoringRiskViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnoringRiskViewModel$setSnoringRiskAssessment$1(SnoringRiskViewModel snoringRiskViewModel, Continuation<? super SnoringRiskViewModel$setSnoringRiskAssessment$1> continuation) {
        super(continuation);
        this.this$0 = snoringRiskViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0(null, false, this);
    }
}
