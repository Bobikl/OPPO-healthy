package com.heytap.health.hrv.viewmodel;

import com.heytap.health.hrv.model.StressDetailRepository;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.hrv.viewmodel.StressDataAnalyzeVM$fetchDayDetailData$1", f = "StressDataAnalyzeVM.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
public final class StressDataAnalyzeVM$fetchDayDetailData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $endTime;
    final /* synthetic */ long $startTime;
    int label;
    final /* synthetic */ StressDataAnalyzeVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressDataAnalyzeVM$fetchDayDetailData$1(StressDataAnalyzeVM stressDataAnalyzeVM, long j2, long j3, Continuation<? super StressDataAnalyzeVM$fetchDayDetailData$1> continuation) {
        super(2, continuation);
        this.this$0 = stressDataAnalyzeVM;
        this.$startTime = j2;
        this.$endTime = j3;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new StressDataAnalyzeVM$fetchDayDetailData$1(this.this$0, this.$startTime, this.$endTime, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StressDetailRepository stressDetailRepository = this.this$0.mRepository;
            String str = this.this$0.ssoid;
            long j2 = this.$startTime;
            long j3 = this.$endTime;
            this.label = 1;
            obj = stressDetailRepository.c(str, 11, j2, j3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.E((List) obj);
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((StressDataAnalyzeVM$fetchDayDetailData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}