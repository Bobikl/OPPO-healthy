package com.oplus.usagecalculate;

import com.oplus.aiunit.vision.cnk;
import com.oplus.aiunit.vision.l05;
import java.util.Map;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0001\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "", "Lcom/oplus/aiunit/vision/l05;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "com.oplus.usagecalculate.UsageCalculatorManager$fetchAppUsageInfoNoScope$1", f = "UsageCalculatorManager.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
final class UsageCalculatorManager$fetchAppUsageInfoNoScope$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Map<String, ? extends Map<String, ? extends l05>>>>, Object> {
    final /* synthetic */ long $beginTime;
    final /* synthetic */ long $endTime;
    final /* synthetic */ boolean $mode;
    int label;
    final /* synthetic */ cnk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsageCalculatorManager$fetchAppUsageInfoNoScope$1(cnk cnkVar, long j2, long j3, boolean z, Continuation<? super UsageCalculatorManager$fetchAppUsageInfoNoScope$1> continuation) {
        super(2, continuation);
        this.this$0 = cnkVar;
        this.$beginTime = j2;
        this.$endTime = j3;
        this.$mode = z;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UsageCalculatorManager$fetchAppUsageInfoNoScope$1(this.this$0, this.$beginTime, this.$endTime, this.$mode, continuation);
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends Map<String, ? extends Map<String, ? extends l05>>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Map<String, ? extends Map<String, ? extends Map<String, l05>>>>) continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cnk cnkVar = this.this$0;
            long j2 = this.$beginTime;
            long j3 = this.$endTime;
            boolean z = this.$mode;
            this.label = 1;
            obj = cnkVar.d(j2, j3, z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Map<String, ? extends Map<String, ? extends Map<String, l05>>>> continuation) {
        return ((UsageCalculatorManager$fetchAppUsageInfoNoScope$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
