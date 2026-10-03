package com.heytap.health.sleep.disturb.util;

import com.oplus.aiunit.vision.lw5;
import io.protostuff.MapSchema;
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
import p010kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", MapSchema.FIELD_NAME_ENTRY, "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.sleep.disturb.util.UsageProcess$calculateStatData2$4", f = "UsageProcess.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsageProcess$calculateStatData2$4 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public UsageProcess$calculateStatData2$4(Continuation<? super UsageProcess$calculateStatData2$4> continuation) {
        super(3, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        lw5.c("UsageProcess", "stat data catch:" + ((Throwable) this.L$0).getMessage());
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
        UsageProcess$calculateStatData2$4 usageProcess$calculateStatData2$4 = new UsageProcess$calculateStatData2$4(continuation);
        usageProcess$calculateStatData2$4.L$0 = th;
        return usageProcess$calculateStatData2$4.invokeSuspend(Unit.INSTANCE);
    }
}
