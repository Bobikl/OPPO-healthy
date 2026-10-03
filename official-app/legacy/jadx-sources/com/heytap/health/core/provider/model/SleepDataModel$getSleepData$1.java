package com.heytap.health.core.provider.model;

import com.heytap.health.core.provider.adapter.open.SleepDataAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.core.provider.model.SleepDataModel", f = "SleepDataModel.kt", i = {}, l = {31}, m = SleepDataAdapter.GET_SLEEP_DATA_ITEM, n = {}, s = {})
public final class SleepDataModel$getSleepData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepDataModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepDataModel$getSleepData$1(SleepDataModel sleepDataModel, Continuation<? super SleepDataModel$getSleepData$1> continuation) {
        super(continuation);
        this.this$0 = sleepDataModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(this);
    }
}
