package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateViewModel", f = "SportHeartRateViewModel.kt", i = {0}, l = {43, 44}, m = "setSportHeartRateRemind", n = {"this"}, s = {"L$0"})
public final class SportHeartRateViewModel$setSportHeartRateRemind$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SportHeartRateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportHeartRateViewModel$setSportHeartRateRemind$1(SportHeartRateViewModel sportHeartRateViewModel, Continuation<? super SportHeartRateViewModel$setSportHeartRateRemind$1> continuation) {
        super(continuation);
        this.this$0 = sportHeartRateViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.v0(false, 0, this);
    }
}
