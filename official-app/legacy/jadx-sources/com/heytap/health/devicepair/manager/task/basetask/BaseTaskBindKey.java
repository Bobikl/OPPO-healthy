package com.heytap.health.devicepair.manager.task.basetask;

import android.text.TextUtils;
import com.heytap.health.devicemanager.api.ICloudDeviceProcessorService;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.oplus.aiunit.vision.ao0;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.n58;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.y5e;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.SafeContinuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/basetask/BaseTaskBindKey;", "Lcom/heytap/health/devicepair/manager/a;", "Lcom/heytap/health/devicepair/manager/ResultData;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "r", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class BaseTaskBindKey extends com.heytap.health.devicepair.manager.a {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/devicepair/manager/task/basetask/BaseTaskBindKey$a", "Lcom/oplus/aiunit/vision/ao0;", "Lcom/oplus/aiunit/vision/n58;", "result", "", "c", "", MapSchema.FIELD_NAME_ENTRY, "onError", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ao0<n58> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Continuation<ResultData> f4102j;
        public final /* synthetic */ BaseTaskBindKey k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Continuation<? super ResultData> continuation, BaseTaskBindKey baseTaskBindKey) {
            this.f4102j = continuation;
            this.k = baseTaskBindKey;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull n58 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            String bindKey = result.a();
            if (TextUtils.isEmpty(bindKey)) {
                Continuation<ResultData> continuation = this.f4102j;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m5287constructorimpl(com.heytap.health.devicepair.manager.a.c(this.k, 0, ResultData.PairFailType.CLOUND, "getBindKeyByClound is empty error", 1, null)));
                return;
            }
            ml4.a(this.k.getTAG(), "getBindKeyByClound bindKey: " + bindKey);
            PairContext pairContext = this.k.getPairContext();
            Intrinsics.checkNotNullExpressionValue(bindKey, "bindKey");
            pairContext.r(bindKey);
            Continuation<ResultData> continuation2 = this.f4102j;
            Result.Companion companion2 = Result.INSTANCE;
            continuation2.resumeWith(Result.m5287constructorimpl(ResultData.Companion.d(ResultData.INSTANCE, 0, "getBindKeyByClound success", 1, null)));
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(@NotNull Throwable e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            super.onError(e2);
            Continuation<ResultData> continuation = this.f4102j;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(com.heytap.health.devicepair.manager.a.c(this.k, 0, ResultData.PairFailType.CLOUND, "getBindKeyByClound error " + e2.getMessage(), 1, null)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTaskBindKey(@NotNull PairContext pairContext) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object q(BaseTaskBindKey baseTaskBindKey, Continuation<? super ResultData> continuation) {
        BaseTaskBindKey$execute$1 baseTaskBindKey$execute$1;
        if (continuation instanceof BaseTaskBindKey$execute$1) {
            baseTaskBindKey$execute$1 = (BaseTaskBindKey$execute$1) continuation;
            int i = baseTaskBindKey$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseTaskBindKey$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                baseTaskBindKey$execute$1 = new BaseTaskBindKey$execute$1(baseTaskBindKey, continuation);
            }
        } else {
            baseTaskBindKey$execute$1 = new BaseTaskBindKey$execute$1(baseTaskBindKey, continuation);
        }
        Object objR = baseTaskBindKey$execute$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = baseTaskBindKey$execute$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                baseTaskBindKey = (BaseTaskBindKey) baseTaskBindKey$execute$1.L$0;
                ResultKt.throwOnFailure(objR);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objR);
            }
            return (ResultData) objR;
        }
        ResultKt.throwOnFailure(objR);
        ml4.a(baseTaskBindKey.getTAG(), "executor->bindkey");
        if (!y5e.c(baseTaskBindKey.getPairContext().getPairParams().getModel()).X7()) {
            return ResultData.Companion.d(ResultData.INSTANCE, 0, "curr device not support bindkey,filter", 1, null);
        }
        baseTaskBindKey$execute$1.L$0 = baseTaskBindKey;
        baseTaskBindKey$execute$1.label = 1;
        objR = baseTaskBindKey.r(baseTaskBindKey$execute$1);
        if (objR == coroutine_suspended) {
            return coroutine_suspended;
        }
        ResultData resultData = (ResultData) objR;
        if (!resultData.b()) {
            return resultData;
        }
        baseTaskBindKey$execute$1.L$0 = null;
        baseTaskBindKey$execute$1.label = 2;
        objR = baseTaskBindKey.s(baseTaskBindKey$execute$1);
        if (objR == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (ResultData) objR;
    }

    @Override // com.heytap.health.devicepair.manager.a
    @Nullable
    public Object a(@NotNull Continuation<? super ResultData> continuation) {
        return q(this, continuation);
    }

    public final Object r(Continuation<? super ResultData> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        Object objNavigation = x0.d().b(ICloudDeviceProcessorService.SERVICE_PATH).navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.devicemanager.api.ICloudDeviceProcessorService");
        ((ICloudDeviceProcessorService) objNavigation).x6(getPairContext().getPairParams().getId()).n0(su8.c()).subscribe(new a(safeContinuation, this));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Nullable
    public abstract Object s(@NotNull Continuation<? super ResultData> continuation);
}
