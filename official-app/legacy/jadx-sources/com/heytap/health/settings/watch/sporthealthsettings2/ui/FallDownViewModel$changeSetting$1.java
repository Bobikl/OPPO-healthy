package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.FallDownViewModel", f = "FallDownViewModel.kt", i = {0, 0, 0}, l = {43, 47, 47}, m = "changeSetting", n = {"this", "item", "enable"}, s = {"L$0", "L$1", "Z$0"})
public final class FallDownViewModel$changeSetting$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FallDownViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallDownViewModel$changeSetting$1(FallDownViewModel fallDownViewModel, Continuation<? super FallDownViewModel$changeSetting$1> continuation) {
        super(continuation);
        this.this$0 = fallDownViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.v0(null, null, false, this);
    }
}
