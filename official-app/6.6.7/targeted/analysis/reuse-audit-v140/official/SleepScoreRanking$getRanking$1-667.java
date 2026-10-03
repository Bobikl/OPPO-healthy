package com.heytap.health.sleep.algorithm;

import com.oplus.aiunit.vision.m8b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.sleep.algorithm.SleepScoreRanking$getRanking$1", f = "SleepScoreRanking.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class SleepScoreRanking$getRanking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $age;
    final /* synthetic */ Function1<Integer, Unit> $resultData;
    final /* synthetic */ int $sleepScore;
    int label;
    final /* synthetic */ SleepScoreRanking this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SleepScoreRanking$getRanking$1(int i, int i2, Function1<? super Integer, Unit> function1, SleepScoreRanking sleepScoreRanking, Continuation<? super SleepScoreRanking$getRanking$1> continuation) {
        super(2, continuation);
        this.$age = i;
        this.$sleepScore = i2;
        this.$resultData = function1;
        this.this$0 = sleepScoreRanking;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SleepScoreRanking$getRanking$1(this.$age, this.$sleepScore, this.$resultData, this.this$0, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            m8b.f(SleepScoreRanking.TAG, "launch :" + this.$age + " ,:" + this.$sleepScore);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            SleepScoreRanking$getRanking$1$result$1 sleepScoreRanking$getRanking$1$result$1 = new SleepScoreRanking$getRanking$1$result$1(this.this$0, this.$age, this.$sleepScore, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, sleepScoreRanking$getRanking$1$result$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        int iIntValue = BigDecimal.valueOf(100.0d * dDoubleValue).setScale(0, RoundingMode.HALF_UP).intValue();
        m8b.f(SleepScoreRanking.TAG, "result:" + dDoubleValue + " ,scale:" + iIntValue);
        this.$resultData.invoke(Boxing.boxInt(iIntValue));
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SleepScoreRanking$getRanking$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}