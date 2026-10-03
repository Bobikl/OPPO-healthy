package com.heytap.health.devicepair.manager.task.iwatch;

import com.heytap.health.devicemanager.util.DeviceUtilsKt;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.devicepair.manager.params.PairParams;
import com.heytap.health.devicepair.manager.task.basetask.BaseTaskGetDeviceInfo;
import com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponse;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a1e;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ko4;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.q3d;
import com.oplus.aiunit.vision.rp5;
import com.oplus.aiunit.vision.xxb;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/iwatch/TaskIWatchGetDeviceInfo;", "Lcom/heytap/health/devicepair/manager/task/basetask/BaseTaskGetDeviceInfo;", "Lcom/heytap/health/devicepair/manager/ResultData;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", LogFieldKey.PROCESS_NAME_KEY, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskIWatchGetDeviceInfo extends BaseTaskGetDeviceInfo {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskIWatchGetDeviceInfo(@NotNull PairContext pairContext) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        this.TAG = "TaskIWatchGetDeviceInfo";
    }

    @Override // com.heytap.health.devicepair.manager.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.health.devicepair.manager.task.basetask.BaseTaskGetDeviceInfo
    @Nullable
    public Object u(@NotNull Continuation<? super ResultData> continuation) {
        TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$1 taskIWatchGetDeviceInfo$getDeviceInfoByDevice$1;
        Object objM5287constructorimpl;
        if (continuation instanceof TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$1) {
            taskIWatchGetDeviceInfo$getDeviceInfoByDevice$1 = (TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$1) continuation;
            int i = taskIWatchGetDeviceInfo$getDeviceInfoByDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                taskIWatchGetDeviceInfo$getDeviceInfoByDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                taskIWatchGetDeviceInfo$getDeviceInfoByDevice$1 = new TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$1(this, continuation);
            }
        } else {
            taskIWatchGetDeviceInfo$getDeviceInfoByDevice$1 = new TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$1(this, continuation);
        }
        TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$1 taskIWatchGetDeviceInfo$getDeviceInfoByDevice$2 = taskIWatchGetDeviceInfo$getDeviceInfoByDevice$1;
        Object objD = taskIWatchGetDeviceInfo$getDeviceInfoByDevice$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = taskIWatchGetDeviceInfo$getDeviceInfoByDevice$2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objD);
                Result.Companion companion = Result.INSTANCE;
                String id = getPairContext().getPairParams().getId();
                MessageEvent messageEventE = xxb.E();
                Intrinsics.checkNotNullExpressionValue(messageEventE, "getIWatchDeviceInfo()");
                TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$2$deviceInfoRsp$1 taskIWatchGetDeviceInfo$getDeviceInfoByDevice$2$deviceInfoRsp$1 = TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$2$deviceInfoRsp$1.INSTANCE;
                taskIWatchGetDeviceInfo$getDeviceInfoByDevice$2.L$0 = this;
                taskIWatchGetDeviceInfo$getDeviceInfoByDevice$2.label = 1;
                objD = DeviceUtilsKt.d(id, messageEventE, taskIWatchGetDeviceInfo$getDeviceInfoByDevice$2$deviceInfoRsp$1, (56 & 8) != 0 ? ko4.c.INSTANCE : null, (56 & 16) != 0 ? 5000L : 0L, (56 & 32) != 0 ? 0 : 0, taskIWatchGetDeviceInfo$getDeviceInfoByDevice$2);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (TaskIWatchGetDeviceInfo) taskIWatchGetDeviceInfo$getDeviceInfoByDevice$2.L$0;
                ResultKt.throwOnFailure(objD);
            }
            IWatch$IWatchDeviceInfoResponse iWatch$IWatchDeviceInfoResponse = (IWatch$IWatchDeviceInfoResponse) objD;
            Node nodeByMac = gl4.managerApi.getNodeByMac(this.getPairContext().getPairParams().getId());
            String address = nodeByMac != null ? nodeByMac.getAddress() : null;
            ml4.a(this.getTAG(), "info:" + a1e.b(iWatch$IWatchDeviceInfoResponse) + "\nmac:" + gdb.a(address));
            PairParams pairParams = this.getPairContext().getPairParams();
            String deviceModel = iWatch$IWatchDeviceInfoResponse.getDeviceModel();
            Intrinsics.checkNotNullExpressionValue(deviceModel, "deviceInfoRsp.deviceModel");
            pairParams.setModel(deviceModel);
            q3d.g(this.getPairContext().getContext(), this.getPairContext().getPairParams().getModel());
            q3d.f(this.getPairContext().getContext(), this.getPairContext().getPairParams().getId());
            this.getPairContext().getDeviceInfoReq().F(this.getPairContext().getPairParams().getId());
            this.getPairContext().getDeviceInfoReq().L(this.getPairContext().getPairParams().getKey());
            this.getPairContext().getDeviceInfoReq().M(this.getPairContext().getPairParams().getR1());
            this.getPairContext().getDeviceInfoReq().G(String.valueOf(iWatch$IWatchDeviceInfoResponse.getDeviceType()));
            this.getPairContext().getDeviceInfoReq().H(this.getPairContext().getPairParams().getId());
            this.getPairContext().getDeviceInfoReq().I(rp5.a(iWatch$IWatchDeviceInfoResponse.getDeviceSoftVersion(), this.getDEFAULT_VALUE()));
            this.getPairContext().getDeviceInfoReq().K(rp5.a(iWatch$IWatchDeviceInfoResponse.getDeviceOsVersion(), this.getDEFAULT_OS_VERSION()));
            this.getPairContext().getDeviceInfoReq().N(this.getPairContext().getPairParams().getId());
            this.getPairContext().getDeviceInfoReq().y(address);
            this.getPairContext().getDeviceInfoReq().P(this.getPairContext().getPairParams().getModel());
            this.getPairContext().getDeviceInfoReq().O(this.getDEFAULT_VALUE());
            this.getPairContext().getDeviceInfoReq().A(this.getDEFAULT_VALUE());
            this.getPairContext().getDeviceInfoReq().T(iWatch$IWatchDeviceInfoResponse.getDeviceSku());
            this.getPairContext().getDeviceInfoReq().R(this.getDEFAULT_VALUE());
            this.getPairContext().getDeviceInfoReq().B(this.getDEFAULT_VALUE());
            this.getPairContext().getDeviceInfoReq().E(rp5.a(iWatch$IWatchDeviceInfoResponse.getDeviceOsVersion(), this.getDEFAULT_OS_VERSION()));
            this.getPairContext().getDeviceInfoReq().Q(rp5.a(iWatch$IWatchDeviceInfoResponse.getDeviceSoftVersion(), this.getDEFAULT_VALUE()));
            this.getPairContext().t(this.getDEFAULT_VALUE());
            this.getPairContext().getDeviceInfoReq().J(this.getEMPTY_VALUE());
            this.getPairContext().u(this.getPairContext().getPairParams().getId());
            this.getPairContext().v(this.getEMPTY_VALUE());
            this.getPairContext().getDeviceInfoReq().z(this.getEMPTY_VALUE());
            objM5287constructorimpl = Result.m5287constructorimpl(ResultData.Companion.d(ResultData.INSTANCE, 0, "connect success", 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return objM5287constructorimpl;
        }
        ResultData.Companion companion3 = ResultData.INSTANCE;
        ResultData.PairFailType pairFailType = ResultData.PairFailType.PB;
        String message = thM5290exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = "";
        }
        return ResultData.Companion.b(companion3, 0, new ResultData.PairExpandBean(pairFailType, message), 1, null);
    }
}
