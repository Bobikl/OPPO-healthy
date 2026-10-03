package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingViewModel", f = "HeartRateSettingViewModel.kt", i = {0, 0, 0, 3, 3, 3}, l = {52, 60, 64, 67, 75, 83}, m = "autoDetectSwitch", n = {"this", "open", "type", "this", "open", "type"}, s = {"L$0", "Z$0", "I$0", "L$0", "Z$0", "I$0"})
public final class HeartRateSettingViewModel$autoDetectSwitch$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HeartRateSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartRateSettingViewModel$autoDetectSwitch$1(HeartRateSettingViewModel heartRateSettingViewModel, Continuation<? super HeartRateSettingViewModel$autoDetectSwitch$1> continuation) {
        super(continuation);
        this.this$0 = heartRateSettingViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.x0(false, 0, null, this);
    }
}
