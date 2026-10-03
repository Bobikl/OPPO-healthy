package com.heytap.health.sunshine.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.sunshine.model.SunshineDataProcess", f = "SunshineDataProcess.kt", i = {0, 0, 0, 0, 0}, l = {44}, m = "insertStatEmptyData", n = {"this", "dataList", "startTime", "endTime", "type"}, s = {"L$0", "L$1", "J$0", "J$1", "I$0"})
public final class SunshineDataProcess$insertStatEmptyData$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SunshineDataProcess this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SunshineDataProcess$insertStatEmptyData$1(SunshineDataProcess sunshineDataProcess, Continuation<? super SunshineDataProcess$insertStatEmptyData$1> continuation) {
        super(continuation);
        this.this$0 = sunshineDataProcess;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(0L, 0L, null, 0, this);
    }
}
