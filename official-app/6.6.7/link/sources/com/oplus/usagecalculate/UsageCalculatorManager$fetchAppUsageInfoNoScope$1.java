package com.oplus.usagecalculate;

import com.oplus.aiunit.vision.e15;
import com.oplus.aiunit.vision.hrk;
import java.util.Map;
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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0001\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "", "Lcom/oplus/aiunit/vision/e15;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "com.oplus.usagecalculate.UsageCalculatorManager$fetchAppUsageInfoNoScope$1", f = "UsageCalculatorManager.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
final class UsageCalculatorManager$fetchAppUsageInfoNoScope$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Map<String, ? extends Map<String, ? extends e15>>>>, Object> {
    final /* synthetic */ long $beginTime;
    final /* synthetic */ long $endTime;
    final /* synthetic */ boolean $mode;
    int label;
    final /* synthetic */ hrk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsageCalculatorManager$fetchAppUsageInfoNoScope$1(hrk hrkVar, long j, long j2, boolean z, Continuation<? super UsageCalculatorManager$fetchAppUsageInfoNoScope$1> continuation) {
        super(2, continuation);
        this.this$0 = hrkVar;
        this.$beginTime = j;
        this.$endTime = j2;
        this.$mode = z;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UsageCalculatorManager$fetchAppUsageInfoNoScope$1(this.this$0, this.$beginTime, this.$endTime, this.$mode, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            hrk hrkVar = this.this$0;
            long j = this.$beginTime;
            long j2 = this.$endTime;
            boolean z = this.$mode;
            this.label = 1;
            obj = hrkVar.d(j, j2, z, this);
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
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Map<String, ? extends Map<String, ? extends Map<String, e15>>>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
