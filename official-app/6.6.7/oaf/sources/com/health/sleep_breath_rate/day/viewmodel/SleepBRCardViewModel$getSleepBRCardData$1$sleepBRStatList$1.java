package com.health.sleep_breath_rate.day.viewmodel;

import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.oplus.aiunit.vision.ddd;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/oplus/aiunit/vision/ddd;", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.health.sleep_breath_rate.day.viewmodel.SleepBRCardViewModel$getSleepBRCardData$1$sleepBRStatList$1", f = "SleepBRCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SleepBRCardViewModel$getSleepBRCardData$1$sleepBRStatList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ddd<List<BreathRateStat>>>, Object> {
    final /* synthetic */ long $endTime;
    final /* synthetic */ long $startTime;
    int label;
    final /* synthetic */ SleepBRCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepBRCardViewModel$getSleepBRCardData$1$sleepBRStatList$1(SleepBRCardViewModel sleepBRCardViewModel, long j, long j2, Continuation<? super SleepBRCardViewModel$getSleepBRCardData$1$sleepBRStatList$1> continuation) {
        super(2, continuation);
        this.this$0 = sleepBRCardViewModel;
        this.$startTime = j;
        this.$endTime = j2;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SleepBRCardViewModel$getSleepBRCardData$1$sleepBRStatList$1(this.this$0, this.$startTime, this.$endTime, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.this$0.j.b(this.$startTime, this.$endTime, 1, 1);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ddd<List<BreathRateStat>>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
