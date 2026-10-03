package com.heytap.health.sunshine.model;

import com.oplus.aiunit.vision.hp6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.sunshine.model.SunshineRepository", f = "SunshineRepository.kt", i = {0}, l = {73}, m = "fetchDayDetailData", n = {hp6.DETAIL_ENTRY}, s = {"L$0"})
public final class SunshineRepository$fetchDayDetailData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SunshineRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SunshineRepository$fetchDayDetailData$1(SunshineRepository sunshineRepository, Continuation<? super SunshineRepository$fetchDayDetailData$1> continuation) {
        super(continuation);
        this.this$0 = sunshineRepository;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(0, 0L, 0L, this);
    }
}
