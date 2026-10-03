package com.health.health_seedlingcard.model;

import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.zr8;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.health.health_seedlingcard.model.StepSecondaryMode$getStepSecondaryData$1", f = "StepSecondaryMode.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
public final class StepSecondaryMode$getStepSecondaryData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<JSONObject, Unit> $queryData;
    final /* synthetic */ long $upkVersionCode;
    int label;
    final /* synthetic */ StepSecondaryMode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StepSecondaryMode$getStepSecondaryData$1(Function1<? super JSONObject, Unit> function1, StepSecondaryMode stepSecondaryMode, long j, Continuation<? super StepSecondaryMode$getStepSecondaryData$1> continuation) {
        super(2, continuation);
        this.$queryData = function1;
        this.this$0 = stepSecondaryMode;
        this.$upkVersionCode = j;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new StepSecondaryMode$getStepSecondaryData$1(this.$queryData, this.this$0, this.$upkVersionCode, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pr8 pr8Var = pr8.INSTANCE;
            long jC = pr8Var.c(System.currentTimeMillis());
            long jB = pr8Var.b(System.currentTimeMillis());
            CoroutineContext coroutineContextB = zr8.INSTANCE.b("StepMode");
            StepSecondaryMode$getStepSecondaryData$1$ioResult$1 stepSecondaryMode$getStepSecondaryData$1$ioResult$1 = new StepSecondaryMode$getStepSecondaryData$1$ioResult$1(this.this$0, jC, jB, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineContextB, stepSecondaryMode$getStepSecondaryData$1$ioResult$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Pair pair = (Pair) obj;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        double dDoubleValue = new BigDecimal(new BigDecimal(iIntValue).divide(new BigDecimal(((Number) pair.getSecond()).intValue()), 4, 1).doubleValue()).multiply(new BigDecimal(100)).doubleValue();
        JSONObject jSONObject = new JSONObject();
        long j = this.$upkVersionCode;
        jSONObject.put("todaystepstotalSteps", String.valueOf(iIntValue));
        jSONObject.put("todaystepspercent", dDoubleValue);
        if (j >= 1000004) {
            jSONObject.put("url", "assets/images/step.svg");
        }
        this.$queryData.invoke(jSONObject);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
