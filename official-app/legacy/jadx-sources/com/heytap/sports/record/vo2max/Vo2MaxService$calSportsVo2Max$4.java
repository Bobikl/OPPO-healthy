package com.heytap.sports.record.vo2max;

import com.oplus.aiunit.vision.e3l;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.sports.record.vo2max.Vo2MaxService$calSportsVo2Max$4", f = "Vo2MaxService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Vo2MaxService$calSportsVo2Max$4 extends SuspendLambda implements Function3<FlowCollector<? super Unit>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $finishCal;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vo2MaxService$calSportsVo2Max$4(Function0<Unit> function0, Continuation<? super Vo2MaxService$calSportsVo2Max$4> continuation) {
        super(3, continuation);
        this.$finishCal = function0;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Throwable th = (Throwable) this.L$0;
        e3l.INSTANCE.b("Vo2MaxService", "calSportsVo2Max error:" + th.getMessage());
        this.$finishCal.invoke();
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super Unit> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
        Vo2MaxService$calSportsVo2Max$4 vo2MaxService$calSportsVo2Max$4 = new Vo2MaxService$calSportsVo2Max$4(this.$finishCal, continuation);
        vo2MaxService$calSportsVo2Max$4.L$0 = th;
        return vo2MaxService$calSportsVo2Max$4.invokeSuspend(Unit.INSTANCE);
    }
}
