package com.heytap.health.main.viewmodel;

import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.main.viewmodel.StepGoalRepository", f = "StepGoalRepository.kt", i = {0, 0, 0, 0}, l = {94}, m = "queryDetail", n = {"this", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "queryStartTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
public final class StepGoalRepository$queryDetail$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StepGoalRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepGoalRepository$queryDetail$1(StepGoalRepository stepGoalRepository, Continuation<? super StepGoalRepository$queryDetail$1> continuation) {
        super(continuation);
        this.this$0 = stepGoalRepository;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, this);
    }
}
