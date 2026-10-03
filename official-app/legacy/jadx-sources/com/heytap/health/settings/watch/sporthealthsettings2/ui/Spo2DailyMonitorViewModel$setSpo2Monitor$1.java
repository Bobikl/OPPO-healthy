package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorViewModel", f = "Spo2DailyMonitorViewModel.kt", i = {0, 0, 1}, l = {49, 65, 66}, m = "setSpo2Monitor", n = {"this", "enable", "this"}, s = {"L$0", "Z$0", "L$0"})
public final class Spo2DailyMonitorViewModel$setSpo2Monitor$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Spo2DailyMonitorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2DailyMonitorViewModel$setSpo2Monitor$1(Spo2DailyMonitorViewModel spo2DailyMonitorViewModel, Continuation<? super Spo2DailyMonitorViewModel$setSpo2Monitor$1> continuation) {
        super(continuation);
        this.this$0 = spo2DailyMonitorViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.z0(null, false, this);
    }
}
