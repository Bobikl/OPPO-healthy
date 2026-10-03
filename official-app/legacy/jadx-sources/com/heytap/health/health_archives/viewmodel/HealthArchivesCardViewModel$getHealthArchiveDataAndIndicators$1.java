package com.heytap.health.health_archives.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.health_archives.viewmodel.HealthArchivesCardViewModel", f = "HealthArchivesCardViewModel.kt", i = {0, 0, 1, 1, 1, 1, 1}, l = {56, 62}, m = "getHealthArchiveDataAndIndicators", n = {"this", "storeOwner", "this", "storeOwner", "recordList", "owners", "currentTime"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class HealthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthArchivesCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1(HealthArchivesCardViewModel healthArchivesCardViewModel, Continuation<? super HealthArchivesCardViewModel$getHealthArchiveDataAndIndicators$1> continuation) {
        super(continuation);
        this.this$0 = healthArchivesCardViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.v(this);
    }
}
