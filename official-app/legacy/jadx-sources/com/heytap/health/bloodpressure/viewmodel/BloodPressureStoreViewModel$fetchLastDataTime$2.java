package com.heytap.health.bloodpressure.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.bloodpressure.viewmodel.BloodPressureStoreViewModel", f = "BloodPressureStoreViewModel.kt", i = {}, l = {50}, m = "fetchLastDataTime", n = {}, s = {})
public final class BloodPressureStoreViewModel$fetchLastDataTime$2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BloodPressureStoreViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodPressureStoreViewModel$fetchLastDataTime$2(BloodPressureStoreViewModel bloodPressureStoreViewModel, Continuation<? super BloodPressureStoreViewModel$fetchLastDataTime$2> continuation) {
        super(continuation);
        this.this$0 = bloodPressureStoreViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(this);
    }
}
