package com.heytap.health.devicepair.manager.task;

import android.text.TextUtils;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.devicepair.manager.a;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.cc5;
import com.oplus.aiunit.vision.dc5;
import com.oplus.aiunit.vision.epk;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.w83;
import com.oplus.aiunit.vision.z83;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.SafeContinuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/TaskCheckBindStatue;", "Lcom/heytap/health/devicepair/manager/a;", "Lcom/heytap/health/devicepair/manager/ResultData;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Lkotlin/coroutines/Continuation;", "continuation", "", "ssoid", "", "u", "Lcom/oplus/aiunit/vision/w83;", LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/w83;", "checkBindStatueCallback", "n", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "", "o", "I", "ERROR_CODE_BIND_OTHER", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;Lcom/oplus/aiunit/vision/w83;)V", "Companion", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskCheckBindStatue extends a {
    public static final int MSG_QUERY_OTHER_ACCOUNT_NAME = 141;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final w83 checkBindStatueCallback;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int ERROR_CODE_BIND_OTHER;

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0016¨\u0006\u000e"}, d2 = {"com/heytap/health/devicepair/manager/task/TaskCheckBindStatue$b", "Lcom/oplus/aiunit/vision/cc5;", "", "object", "", "c", "", MapSchema.FIELD_NAME_ENTRY, "", "errMsg", "b", "Lcom/heytap/health/network/core/BaseResponse;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "a", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends cc5<Object> {
        public final /* synthetic */ Continuation<ResultData> a;
        public final /* synthetic */ TaskCheckBindStatue b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Continuation<? super ResultData> continuation, TaskCheckBindStatue taskCheckBindStatue) {
            this.a = continuation;
            this.b = taskCheckBindStatue;
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void a(@Nullable BaseResponse<?> response) {
            super.a(response);
            if (response == null) {
                Continuation<ResultData> continuation = this.a;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m5287constructorimpl(a.c(this.b, 0, ResultData.PairFailType.CLOUND, "checkDeviceBindStatus clound response is null", 1, null)));
                return;
            }
            try {
                if (response.getErrorCode() == this.b.ERROR_CODE_BIND_OTHER) {
                    if (response.getBody() != null) {
                        Object body = response.getBody();
                        Intrinsics.checkNotNull(body, "null cannot be cast to non-null type com.heytap.health.devicemanager.processor.cloudaccess.response.CheckBindStatusRsp");
                        TaskCheckBindStatue taskCheckBindStatue = this.b;
                        Continuation<ResultData> continuation2 = this.a;
                        String strA = ((z83) body).a();
                        Intrinsics.checkNotNullExpressionValue(strA, "unbindDeviceRsp.ssoid");
                        taskCheckBindStatue.u(continuation2, strA);
                    } else {
                        Continuation<ResultData> continuation3 = this.a;
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation3.resumeWith(Result.m5287constructorimpl(a.c(this.b, 0, ResultData.PairFailType.CLOUND, "checkDeviceBindStatus clound error " + response.getErrorCode() + " " + response.getMessage(), 1, null)));
                    }
                }
            } catch (Exception e2) {
                Continuation<ResultData> continuation4 = this.a;
                Result.Companion companion3 = Result.INSTANCE;
                continuation4.resumeWith(Result.m5287constructorimpl(a.c(this.b, 0, ResultData.PairFailType.CLOUND, "checkDeviceBindStatus clound exception " + e2.getMessage(), 1, null)));
            }
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void b(@NotNull Throwable e2, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            super.b(e2, errMsg);
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(a.c(this.b, 0, ResultData.PairFailType.CLOUND, "checkDeviceBindStatus clound onFailure,errMsg " + errMsg, 1, null)));
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void c(@Nullable Object object) {
            super.c(object);
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(ResultData.Companion.d(ResultData.INSTANCE, 0, "checkDeviceBindStatus clound not bind,next", 1, null)));
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/heytap/health/devicepair/manager/task/TaskCheckBindStatue$c", "Lcom/oplus/aiunit/vision/cc5;", "", "object", "", "c", "", MapSchema.FIELD_NAME_ENTRY, "", "errMsg", "b", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends cc5<Object> {
        public final /* synthetic */ Continuation<ResultData> a;
        public final /* synthetic */ TaskCheckBindStatue b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f4094c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Continuation<? super ResultData> continuation, TaskCheckBindStatue taskCheckBindStatue, String str) {
            this.a = continuation;
            this.b = taskCheckBindStatue;
            this.f4094c = str;
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void b(@NotNull Throwable e2, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(a.c(this.b, 0, ResultData.PairFailType.CLOUND, "queryOtherAccountMask faile " + errMsg, 1, null)));
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void c(@Nullable Object object) {
            if (object instanceof epk) {
                Continuation<ResultData> continuation = this.a;
                TaskCheckBindStatue taskCheckBindStatue = this.b;
                ResultData resultDataB = taskCheckBindStatue.b(141, ResultData.PairFailType.CLOUND, "checkDeviceBindStatus is bind by " + taskCheckBindStatue.getTAG());
                resultDataB.l(this.f4094c);
                String strA = ((epk) object).a();
                Intrinsics.checkNotNullExpressionValue(strA, "`object`.accountName");
                resultDataB.i(strA);
                continuation.resumeWith(Result.m5287constructorimpl(resultDataB));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskCheckBindStatue(@NotNull PairContext pairContext, @NotNull w83 checkBindStatueCallback) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        Intrinsics.checkNotNullParameter(checkBindStatueCallback, "checkBindStatueCallback");
        this.checkBindStatueCallback = checkBindStatueCallback;
        this.TAG = "TaskCheckBindStatue";
        this.ERROR_CODE_BIND_OTHER = 22200;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.health.devicepair.manager.a
    @Nullable
    public Object a(@NotNull Continuation<? super ResultData> continuation) {
        TaskCheckBindStatue$execute$1 taskCheckBindStatue$execute$1;
        if (continuation instanceof TaskCheckBindStatue$execute$1) {
            taskCheckBindStatue$execute$1 = (TaskCheckBindStatue$execute$1) continuation;
            int i = taskCheckBindStatue$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                taskCheckBindStatue$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                taskCheckBindStatue$execute$1 = new TaskCheckBindStatue$execute$1(this, continuation);
            }
        } else {
            taskCheckBindStatue$execute$1 = new TaskCheckBindStatue$execute$1(this, continuation);
        }
        Object objT = taskCheckBindStatue$execute$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = taskCheckBindStatue$execute$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objT);
            ml4.a(getTAG(), "executor->start check bind statue");
            taskCheckBindStatue$execute$1.L$0 = this;
            taskCheckBindStatue$execute$1.label = 1;
            objT = t(taskCheckBindStatue$execute$1);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (TaskCheckBindStatue) taskCheckBindStatue$execute$1.L$0;
            ResultKt.throwOnFailure(objT);
        }
        final ResultData resultData = (ResultData) objT;
        if (!resultData.b() && resultData.d() == 141) {
            resultData.k(true);
            this.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckBindStatue$execute$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.checkBindStatueCallback.b(resultData);
                }
            });
        }
        return resultData;
    }

    @Override // com.heytap.health.devicepair.manager.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    public final Object t(Continuation<? super ResultData> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        dc5.b(getPairContext().getPairParams().getId(), getPairContext().getPairParams().getModel(), new b(safeContinuation, this));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final void u(Continuation<? super ResultData> continuation, String ssoid) {
        ml4.a(getTAG(), "other account " + ssoid);
        if (TextUtils.isEmpty(ssoid)) {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(a.c(this, 0, ResultData.PairFailType.CLOUND, "queryOtherAccountMask user id is null", 1, null)));
            return;
        }
        if (!i()) {
            dc5.h(ssoid, new c(continuation, this, ssoid));
            return;
        }
        ResultData resultDataB = b(141, ResultData.PairFailType.CLOUND, "checkDeviceBindStatus is bind by " + getTAG());
        resultDataB.l(ssoid);
        resultDataB.i("ssoid:" + ssoid + "(测试环境无法输入密码解绑,需提供设备mac给云端手动解绑)");
        continuation.resumeWith(Result.m5287constructorimpl(resultDataB));
    }
}
