package com.heytap.health.devicepair.manager.task;

import com.heytap.health.base.utils.AsyncResultCoroutine;
import com.heytap.health.devicemanager.UserInfoHelper;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.util.DeviceUtilsKt;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.protocol.iwatch.IWatch$IWatchResetResult;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.health.watchpair.manager.OobeHelper;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.auc;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cc5;
import com.oplus.aiunit.vision.dc5;
import com.oplus.aiunit.vision.de1;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ko4;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.va5;
import com.oplus.aiunit.vision.vik;
import com.oplus.aiunit.vision.xxb;
import com.oplus.aiunit.vision.y0f;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.HashMap;
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
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/TaskBindDevice;", "Lcom/heytap/health/devicepair/manager/a;", "Lcom/heytap/health/devicepair/manager/ResultData;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Lcom/oplus/aiunit/vision/de1;", LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/de1;", "bindDeviceCallback", "", "n", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "", "o", "I", "MSG_REPORT_DEVICE_BIND_INFO_LIMIT_EXCEEDED", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;Lcom/oplus/aiunit/vision/de1;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskBindDevice extends com.heytap.health.devicepair.manager.a {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final de1 bindDeviceCallback;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int MSG_REPORT_DEVICE_BIND_INFO_LIMIT_EXCEEDED;

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0002¨\u0006\u000f"}, d2 = {"com/heytap/health/devicepair/manager/task/TaskBindDevice$a", "Lcom/oplus/aiunit/vision/cc5;", "", "object", "", "c", "", MapSchema.FIELD_NAME_ENTRY, "", "errMsg", "b", "Lcom/heytap/health/network/core/BaseResponse;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "a", "d", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends cc5<Object> {
        public final /* synthetic */ Continuation<ResultData> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Continuation<? super ResultData> continuation) {
            this.b = continuation;
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void a(@Nullable BaseResponse<?> response) {
            super.a(response);
            if (response == null) {
                Continuation<ResultData> continuation = this.b;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m5287constructorimpl(com.heytap.health.devicepair.manager.a.c(TaskBindDevice.this, 0, ResultData.PairFailType.CLOUND, "bind device by clound faile,response is null", 1, null)));
                return;
            }
            try {
                if (response.getErrorCode() == 22204) {
                    Continuation<ResultData> continuation2 = this.b;
                    Result.Companion companion2 = Result.INSTANCE;
                    TaskBindDevice taskBindDevice = TaskBindDevice.this;
                    continuation2.resumeWith(Result.m5287constructorimpl(taskBindDevice.b(taskBindDevice.MSG_REPORT_DEVICE_BIND_INFO_LIMIT_EXCEEDED, ResultData.PairFailType.CLOUND, "bind device by clound faile,response is null")));
                } else {
                    Continuation<ResultData> continuation3 = this.b;
                    Result.Companion companion3 = Result.INSTANCE;
                    continuation3.resumeWith(Result.m5287constructorimpl(com.heytap.health.devicepair.manager.a.c(TaskBindDevice.this, 0, ResultData.PairFailType.CLOUND, "bind device by clound faile,errCode:" + response.getErrorCode() + ", errMsg:" + response.getMessage(), 1, null)));
                }
            } catch (Exception e2) {
                Continuation<ResultData> continuation4 = this.b;
                Result.Companion companion4 = Result.INSTANCE;
                continuation4.resumeWith(Result.m5287constructorimpl(com.heytap.health.devicepair.manager.a.c(TaskBindDevice.this, 0, ResultData.PairFailType.CLOUND, "bind device by clound faile,catch " + e2.getMessage(), 1, null)));
            }
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void b(@NotNull Throwable e2, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            Continuation<ResultData> continuation = this.b;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(com.heytap.health.devicepair.manager.a.c(TaskBindDevice.this, 0, ResultData.PairFailType.CLOUND, "bind device by clound faile,msg:" + errMsg, 1, null)));
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void c(@Nullable Object object) {
            ml4.a(TaskBindDevice.this.getTAG(), "bindDevice onSuccess =" + object);
            d();
            Continuation<ResultData> continuation = this.b;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(ResultData.Companion.d(ResultData.INSTANCE, 0, "bind device by cloud success", 1, null)));
        }

        public final void d() {
            HashMap map = new HashMap();
            map.put(va5.TAG_DEVICE_SN, TaskBindDevice.this.getPairContext().getDeviceSn());
            String strL = TaskBindDevice.this.getPairContext().getDeviceInfoReq().l();
            Intrinsics.checkNotNullExpressionValue(strL, "pairContext.deviceInfoReq.guid");
            map.put("guid", strL);
            vik.l("2012", map);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/heytap/health/devicepair/manager/task/TaskBindDevice$b", "Lcom/heytap/health/watchpair/manager/OobeHelper$a;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", MapSchema.FIELD_NAME_ENTRY, "", "throwable", b2n.f, "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends OobeHelper.a {
        @Override // com.heytap.health.watchpair.manager.OobeHelper.a
        public void e(@NotNull String mac, @NotNull MessageEvent response) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(response, "response");
            if (y0f.j(response.getData()) == 0) {
                OobeHelper.INSTANCE.k(13, true);
            } else {
                OobeHelper.INSTANCE.k(14, false);
            }
        }

        @Override // com.heytap.health.watchpair.manager.OobeHelper.a
        public void g(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            OobeHelper.INSTANCE.k(14, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskBindDevice(@NotNull PairContext pairContext, @NotNull de1 bindDeviceCallback) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        Intrinsics.checkNotNullParameter(bindDeviceCallback, "bindDeviceCallback");
        this.bindDeviceCallback = bindDeviceCallback;
        this.TAG = "TaskBindDevice";
        this.MSG_REPORT_DEVICE_BIND_INFO_LIMIT_EXCEEDED = 11601;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0124, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0176, please report this as an issue */
    @Override // com.heytap.health.devicepair.manager.a
    @Nullable
    public Object a(@NotNull Continuation<? super ResultData> continuation) {
        TaskBindDevice$execute$1 taskBindDevice$execute$1;
        TaskBindDevice taskBindDevice;
        ResultData resultData;
        Throwable th;
        TaskBindDevice taskBindDevice2;
        Throwable th2;
        Object objM5287constructorimpl;
        Throwable thM5290exceptionOrNullimpl;
        Object objM5287constructorimpl2;
        Throwable thM5290exceptionOrNullimpl2;
        if (continuation instanceof TaskBindDevice$execute$1) {
            taskBindDevice$execute$1 = (TaskBindDevice$execute$1) continuation;
            int i = taskBindDevice$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                taskBindDevice$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                taskBindDevice$execute$1 = new TaskBindDevice$execute$1(this, continuation);
            }
        } else {
            taskBindDevice$execute$1 = new TaskBindDevice$execute$1(this, continuation);
        }
        TaskBindDevice$execute$1 taskBindDevice$execute$2 = taskBindDevice$execute$1;
        Object objT = taskBindDevice$execute$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = taskBindDevice$execute$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objT);
            ml4.a(getTAG(), "executor->bind device");
            taskBindDevice$execute$2.L$0 = this;
            taskBindDevice$execute$2.label = 1;
            objT = t(taskBindDevice$execute$2);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    resultData = (ResultData) taskBindDevice$execute$2.L$1;
                    taskBindDevice2 = (TaskBindDevice) taskBindDevice$execute$2.L$0;
                    try {
                        ResultKt.throwOnFailure(objT);
                        objM5287constructorimpl2 = Result.m5287constructorimpl((UserInfoHelper.AccountInfo) objT);
                    } catch (Throwable th3) {
                        th2 = th3;
                        Result.Companion companion = Result.INSTANCE;
                        objM5287constructorimpl2 = Result.m5287constructorimpl(ResultKt.createFailure(th2));
                    }
                    thM5290exceptionOrNullimpl2 = Result.m5290exceptionOrNullimpl(objM5287constructorimpl2);
                    if (thM5290exceptionOrNullimpl2 != null) {
                        ml4.c(taskBindDevice2.getTAG(), "getUserNameAndTicket file:" + thM5290exceptionOrNullimpl2.getMessage());
                        objM5287constructorimpl2 = new UserInfoHelper.AccountInfo("", "");
                    }
                    UserInfoHelper.AccountInfo accountInfo = (UserInfoHelper.AccountInfo) objM5287constructorimpl2;
                    OobeHelper.INSTANCE.f(taskBindDevice2.getPairContext().getPairParams().getId(), accountInfo.getUserName(), accountInfo.getTicket(), new b());
                    return resultData;
                }
                resultData = (ResultData) taskBindDevice$execute$2.L$1;
                taskBindDevice = (TaskBindDevice) taskBindDevice$execute$2.L$0;
                try {
                    ResultKt.throwOnFailure(objT);
                    ml4.d(taskBindDevice.getTAG(), "result:" + ((IWatch$IWatchResetResult) objT).getResultCode());
                    objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
                } catch (Throwable th4) {
                    th = th4;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                }
                thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                if (thM5290exceptionOrNullimpl != null) {
                    ml4.c(taskBindDevice.getTAG(), "sendFail " + thM5290exceptionOrNullimpl.getMessage());
                }
                return resultData;
            }
            this = (TaskBindDevice) taskBindDevice$execute$2.L$0;
            ResultKt.throwOnFailure(objT);
        }
        final ResultData resultData2 = (ResultData) objT;
        if (!resultData2.b()) {
            if (resultData2.d() != this.MSG_REPORT_DEVICE_BIND_INFO_LIMIT_EXCEEDED) {
                return resultData2;
            }
            this.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskBindDevice$execute$7
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
                    this.this$0.bindDeviceCallback.b(resultData2);
                }
            });
            return resultData2;
        }
        ol4 ol4Var = gl4.managerApi;
        Node nodeByMac = ol4Var.getNodeByMac(this.getPairContext().getPairParams().getId());
        if (nodeByMac != null) {
            ol4Var.b("ClouldBound", nodeByMac, auc.b.INSTANCE);
        }
        if (((Boolean) lc5.d(this.getPairContext().getPairParams().getModel()).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.devicepair.manager.task.TaskBindDevice$execute$3
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                return Boolean.valueOf(applyMode.k0());
            }
        })).booleanValue()) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                String id = this.getPairContext().getPairParams().getId();
                MessageEvent messageEventD = xxb.D(true);
                Intrinsics.checkNotNullExpressionValue(messageEventD, "getIWatchCloudBind(true)");
                TaskBindDevice$execute$4$resetResult$1 taskBindDevice$execute$4$resetResult$1 = TaskBindDevice$execute$4$resetResult$1.INSTANCE;
                taskBindDevice$execute$2.L$0 = this;
                taskBindDevice$execute$2.L$1 = resultData2;
                taskBindDevice$execute$2.label = 2;
                Object objD = DeviceUtilsKt.d(id, messageEventD, taskBindDevice$execute$4$resetResult$1, (56 & 8) != 0 ? ko4.c.INSTANCE : null, (56 & 16) != 0 ? 5000L : 0L, (56 & 32) != 0 ? 0 : 0, taskBindDevice$execute$2);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                taskBindDevice = this;
                resultData = resultData2;
                objT = objD;
                ml4.d(taskBindDevice.getTAG(), "result:" + ((IWatch$IWatchResetResult) objT).getResultCode());
                objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
                thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                if (thM5290exceptionOrNullimpl != null) {
                    ml4.c(taskBindDevice.getTAG(), "sendFail " + thM5290exceptionOrNullimpl.getMessage());
                }
                return resultData;
            } catch (Throwable th5) {
                taskBindDevice = this;
                resultData = resultData2;
                th = th5;
                Result.Companion companion4 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                AsyncResultCoroutine<UserInfoHelper.AccountInfo> asyncResultCoroutineE = UserInfoHelper.e();
                taskBindDevice$execute$2.L$0 = this;
                taskBindDevice$execute$2.L$1 = resultData2;
                taskBindDevice$execute$2.label = 3;
                Object objB = asyncResultCoroutineE.b(taskBindDevice$execute$2);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                taskBindDevice2 = this;
                resultData = resultData2;
                objT = objB;
                objM5287constructorimpl2 = Result.m5287constructorimpl((UserInfoHelper.AccountInfo) objT);
                thM5290exceptionOrNullimpl2 = Result.m5290exceptionOrNullimpl(objM5287constructorimpl2);
                if (thM5290exceptionOrNullimpl2 != null) {
                    ml4.c(taskBindDevice2.getTAG(), "getUserNameAndTicket file:" + thM5290exceptionOrNullimpl2.getMessage());
                    objM5287constructorimpl2 = new UserInfoHelper.AccountInfo("", "");
                }
                UserInfoHelper.AccountInfo accountInfo2 = (UserInfoHelper.AccountInfo) objM5287constructorimpl2;
                OobeHelper.INSTANCE.f(taskBindDevice2.getPairContext().getPairParams().getId(), accountInfo2.getUserName(), accountInfo2.getTicket(), new b());
                return resultData;
            } catch (Throwable th6) {
                taskBindDevice2 = this;
                resultData = resultData2;
                th2 = th6;
                Result.Companion companion6 = Result.INSTANCE;
                objM5287constructorimpl2 = Result.m5287constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    @Override // com.heytap.health.devicepair.manager.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    public final Object t(Continuation<? super ResultData> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        a aVar = new a(safeContinuation);
        ml4.a(getTAG(), "enter bindDevice");
        dc5.a(getPairContext().getDeviceInfoReq(), getPairContext().getDeviceImei(), getPairContext().getBindKey(), getPairContext().getSign(), getPairContext().getPairParams().isSecond(), aVar);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
