package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel", f = "SHSettingBaseViewModel.kt", i = {}, l = {139}, m = "updateResultOrNot$suspendImpl", n = {}, s = {})
public final class SHSettingBaseViewModel$updateResultOrNot$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SHSettingBaseViewModel<D> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHSettingBaseViewModel$updateResultOrNot$1(SHSettingBaseViewModel<D> sHSettingBaseViewModel, Continuation<? super SHSettingBaseViewModel$updateResultOrNot$1> continuation) {
        super(continuation);
        this.this$0 = sHSettingBaseViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SHSettingBaseViewModel.u0(this.this$0, null, null, this);
    }
}
