package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingViewModel", f = "QuietHRSettingViewModel.kt", i = {0}, l = {61, 62}, m = "setQuietRateRemind", n = {"this"}, s = {"L$0"})
public final class QuietHRSettingViewModel$setQuietRateRemind$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuietHRSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuietHRSettingViewModel$setQuietRateRemind$1(QuietHRSettingViewModel quietHRSettingViewModel, Continuation<? super QuietHRSettingViewModel$setQuietRateRemind$1> continuation) {
        super(continuation);
        this.this$0 = quietHRSettingViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.y0(0, false, 0, this);
    }
}
