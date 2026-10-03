package com.health.health_seedlingcard.model;

import android.os.Bundle;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.model.SportDataStat;
import com.oplus.aiunit.vision.ddd;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Pair;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.health.health_seedlingcard.model.StepSecondaryMode$getStepSecondaryData$1$ioResult$1", f = "StepSecondaryMode.kt", i = {0}, l = {59}, m = "invokeSuspend", n = {"bundle"}, s = {"L$0"})
public final class StepSecondaryMode$getStepSecondaryData$1$ioResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Integer, ? extends Integer>>, Object> {
    final /* synthetic */ long $endTime;
    final /* synthetic */ long $startTime;
    Object L$0;
    int label;
    final /* synthetic */ StepSecondaryMode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepSecondaryMode$getStepSecondaryData$1$ioResult$1(StepSecondaryMode stepSecondaryMode, long j, long j2, Continuation<? super StepSecondaryMode$getStepSecondaryData$1$ioResult$1> continuation) {
        super(2, continuation);
        this.this$0 = stepSecondaryMode;
        this.$startTime = j;
        this.$endTime = j2;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new StepSecondaryMode$getStepSecondaryData$1$ioResult$1(this.this$0, this.$startTime, this.$endTime, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Bundle bundle;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Bundle bundleA = this.this$0.c().a();
            ddd<List<SportDataStat>> dddVarB = this.this$0.c().b(this.$startTime, this.$endTime);
            this.L$0 = bundleA;
            this.label = 1;
            Object objC = RxExtendKt.c(dddVarB, this);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            bundle = bundleA;
            obj = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bundle = (Bundle) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "stepDataRepository.getSp…ime, endTime).awaitOnce()");
        return this.this$0.d().a(bundle, (List) obj);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Pair<Integer, Integer>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
