package com.heytap.health.settings.watch.sporthealthsettings2.spo2monitor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.spo2monitor.Spo2SettingViewModel", f = "Spo2SettingViewModel.kt", i = {0, 0, 0, 1}, l = {40, 57, 51}, m = "changeSpo2", n = {"this", "enable", "interval", "this"}, s = {"L$0", "Z$0", "Z$1", "L$0"})
public final class Spo2SettingViewModel$changeSpo2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Spo2SettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2SettingViewModel$changeSpo2$1(Spo2SettingViewModel spo2SettingViewModel, Continuation<? super Spo2SettingViewModel$changeSpo2$1> continuation) {
        super(continuation);
        this.this$0 = spo2SettingViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.w0(null, false, false, this);
    }
}
