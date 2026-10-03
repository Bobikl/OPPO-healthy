package com.heytap.health.devicepair.manager.task;

import android.text.TextUtils;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.devicemanager.DeviceInfoRepository;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.util.DeviceUtilsKt;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.devicepair.manager.a;
import com.heytap.health.devicepair.manager.params.PairParams;
import com.heytap.health.devicepair.manager.task.basetask.BaseTaskGetDeviceInfo;
import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.bg5;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ko4;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.q3d;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.rp5;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.z7b;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/TaskGetDeviceInfo;", "Lcom/heytap/health/devicepair/manager/task/basetask/BaseTaskGetDeviceInfo;", "Lcom/heytap/health/devicepair/manager/ResultData;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", LogFieldKey.PROCESS_NAME_KEY, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskGetDeviceInfo extends BaseTaskGetDeviceInfo {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskGetDeviceInfo(@NotNull PairContext pairContext) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        this.TAG = "TaskGetDeviceInfo";
    }

    @Override // com.heytap.health.devicepair.manager.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x0272  */
    /* JADX WARN: Code duplicated, block: B:54:0x037d  */
    /* JADX WARN: Code duplicated, block: B:57:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00ce, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x03fc, please report this as an issue */
    @Override // com.heytap.health.devicepair.manager.task.basetask.BaseTaskGetDeviceInfo
    @Nullable
    public Object u(@NotNull Continuation<? super ResultData> continuation) {
        TaskGetDeviceInfo$getDeviceInfoByDevice$1 taskGetDeviceInfo$getDeviceInfoByDevice$1;
        Object objM5287constructorimpl;
        Object objM5287constructorimpl2;
        final TaskGetDeviceInfo taskGetDeviceInfo;
        Throwable thM5290exceptionOrNullimpl;
        final DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo;
        String ssoid;
        boolean z;
        if (continuation instanceof TaskGetDeviceInfo$getDeviceInfoByDevice$1) {
            taskGetDeviceInfo$getDeviceInfoByDevice$1 = (TaskGetDeviceInfo$getDeviceInfoByDevice$1) continuation;
            int i = taskGetDeviceInfo$getDeviceInfoByDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                taskGetDeviceInfo$getDeviceInfoByDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                taskGetDeviceInfo$getDeviceInfoByDevice$1 = new TaskGetDeviceInfo$getDeviceInfoByDevice$1(this, continuation);
            }
        } else {
            taskGetDeviceInfo$getDeviceInfoByDevice$1 = new TaskGetDeviceInfo$getDeviceInfoByDevice$1(this, continuation);
        }
        TaskGetDeviceInfo$getDeviceInfoByDevice$1 taskGetDeviceInfo$getDeviceInfoByDevice$2 = taskGetDeviceInfo$getDeviceInfoByDevice$1;
        Object objG = taskGetDeviceInfo$getDeviceInfoByDevice$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = taskGetDeviceInfo$getDeviceInfoByDevice$2.label;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        this = (TaskGetDeviceInfo) taskGetDeviceInfo$getDeviceInfoByDevice$2.L$0;
                        ResultKt.throwOnFailure(objG);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        this = (TaskGetDeviceInfo) taskGetDeviceInfo$getDeviceInfoByDevice$2.L$0;
                        ResultKt.throwOnFailure(objG);
                    }
                    objM5287constructorimpl2 = Result.m5287constructorimpl((DMProto$ConnectDeviceInfo) objG);
                    taskGetDeviceInfo = this;
                    thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl2);
                    if (thM5290exceptionOrNullimpl == null) {
                        return a.c(taskGetDeviceInfo, 0, ResultData.PairFailType.PB, "0107 pb error:" + thM5290exceptionOrNullimpl.getMessage(), 1, null);
                    }
                    dMProto$ConnectDeviceInfo = (DMProto$ConnectDeviceInfo) objM5287constructorimpl2;
                    if (dMProto$ConnectDeviceInfo.getDeviceBtMac() == null) {
                        return a.c(taskGetDeviceInfo, 0, ResultData.PairFailType.PB, "0107 data,deviceBtMac field is null", 1, null);
                    }
                    ml4.a(taskGetDeviceInfo.getTAG(), "update deviceinfo : " + dMProto$ConnectDeviceInfo);
                    String tag = taskGetDeviceInfo.getTAG();
                    ssoid = dMProto$ConnectDeviceInfo.getSsoid();
                    Intrinsics.checkNotNullExpressionValue(ssoid, "deviceInfoRsp.ssoid");
                    if (ssoid.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ml4.d(tag, "deviceinfo " + z + "," + TextUtils.equals(dMProto$ConnectDeviceInfo.getSsoid(), um.c().getSsoid()));
                    z7b.f(taskGetDeviceInfo.getTAG(), "device report " + dMProto$ConnectDeviceInfo.getSsoid());
                    PairParams pairParams = taskGetDeviceInfo.getPairContext().getPairParams();
                    String deviceModel = dMProto$ConnectDeviceInfo.getDeviceModel();
                    Intrinsics.checkNotNullExpressionValue(deviceModel, "deviceInfoRsp.deviceModel");
                    pairParams.setModel(deviceModel);
                    q3d.g(taskGetDeviceInfo.getPairContext().getContext(), taskGetDeviceInfo.getPairContext().getPairParams().getModel());
                    q3d.f(taskGetDeviceInfo.getPairContext().getContext(), taskGetDeviceInfo.getPairContext().getPairParams().getId());
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().F(rp5.a(dMProto$ConnectDeviceInfo.getDeviceSn(), taskGetDeviceInfo.getDEFAULT_VALUE()));
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().G(String.valueOf(dMProto$ConnectDeviceInfo.getDeviceType()));
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().H(taskGetDeviceInfo.getPairContext().getPairParams().getId());
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().I(rp5.a(dMProto$ConnectDeviceInfo.getDeviceSoftVersion(), taskGetDeviceInfo.getDEFAULT_VALUE()));
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().K(rp5.a(dMProto$ConnectDeviceInfo.getDeviceHardVersion(), taskGetDeviceInfo.getDEFAULT_VALUE()));
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().N(taskGetDeviceInfo.getPairContext().getPairParams().getId());
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().y((String) lc5.d(taskGetDeviceInfo.getPairContext().getPairParams().getModel()).a(new Function1<DeviceModel, String>() { // from class: com.heytap.health.devicepair.manager.task.TaskGetDeviceInfo$getDeviceInfoByDevice$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public final String invoke(@NotNull DeviceModel applyMode) {
                            Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                            return applyMode.X8() ? this.this$0.getPairContext().getPairParams().getId() : dMProto$ConnectDeviceInfo.getDeviceBleMac();
                        }
                    }));
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().P(taskGetDeviceInfo.getPairContext().getPairParams().getModel());
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().O(dMProto$ConnectDeviceInfo.getManufacturer());
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().A(dMProto$ConnectDeviceInfo.getBtName());
                    if (!TextUtils.isEmpty(dMProto$ConnectDeviceInfo.getDeviceSku())) {
                        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().T(dMProto$ConnectDeviceInfo.getDeviceSku());
                    }
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().R(dMProto$ConnectDeviceInfo.getProjectId());
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().B(dMProto$ConnectDeviceInfo.getBoardId());
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().V(((Number) lc5.d(taskGetDeviceInfo.getPairContext().getPairParams().getModel()).a(new Function1<DeviceModel, Integer>() { // from class: com.heytap.health.devicepair.manager.task.TaskGetDeviceInfo$getDeviceInfoByDevice$3
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        @NotNull
                        public final Integer invoke(@NotNull DeviceModel applyMode) {
                            Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                            return Integer.valueOf(applyMode.r9(dMProto$ConnectDeviceInfo.getBoardId(), dMProto$ConnectDeviceInfo.getProjectId()));
                        }
                    })).intValue());
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().E(rp5.a(dMProto$ConnectDeviceInfo.getOsVersion(), taskGetDeviceInfo.getDEFAULT_OS_VERSION()));
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().Q(rp5.a(dMProto$ConnectDeviceInfo.getDeviceOtaVersion(), taskGetDeviceInfo.getDEFAULT_VALUE()));
                    PairContext pairContext = taskGetDeviceInfo.getPairContext();
                    String strA = rp5.a(dMProto$ConnectDeviceInfo.getDeviceImei(), taskGetDeviceInfo.getDEFAULT_VALUE());
                    Intrinsics.checkNotNullExpressionValue(strA, "checkAndGetValue(deviceI…eviceImei, DEFAULT_VALUE)");
                    pairContext.t(strA);
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().J(rp5.a(dMProto$ConnectDeviceInfo.getGuid(), taskGetDeviceInfo.getEMPTY_VALUE()));
                    PairContext pairContext2 = taskGetDeviceInfo.getPairContext();
                    String strA2 = rp5.a(dMProto$ConnectDeviceInfo.getDeviceSn(), taskGetDeviceInfo.getDEFAULT_VALUE());
                    Intrinsics.checkNotNullExpressionValue(strA2, "checkAndGetValue(deviceI….deviceSn, DEFAULT_VALUE)");
                    pairContext2.u(strA2);
                    PairContext pairContext3 = taskGetDeviceInfo.getPairContext();
                    String ssoid2 = dMProto$ConnectDeviceInfo.getSsoid();
                    Intrinsics.checkNotNullExpressionValue(ssoid2, "deviceInfoRsp.ssoid");
                    pairContext3.v(ssoid2);
                    taskGetDeviceInfo.getPairContext().getDeviceInfoReq().z(taskGetDeviceInfo.getPairContext().g());
                    if (((Boolean) lc5.d(taskGetDeviceInfo.getPairContext().getPairParams().getModel()).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.devicepair.manager.task.TaskGetDeviceInfo$getDeviceInfoByDevice$4
                        @Override // p010kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(@NotNull DeviceModel applyMode) {
                            Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                            return Boolean.valueOf(!applyMode.Ea());
                        }
                    })).booleanValue()) {
                        gl4.managerApi.z(taskGetDeviceInfo.getPairContext().getPairParams().getId(), dMProto$ConnectDeviceInfo.getDeviceBleMac(), taskGetDeviceInfo.getPairContext().getPairParams().getModel());
                    }
                    bg5.Companion companion = bg5.INSTANCE;
                    companion.B(taskGetDeviceInfo.getPairContext().getDeviceInfoReq().f());
                    companion.x(taskGetDeviceInfo.getPairContext().getDeviceImei());
                    companion.z(taskGetDeviceInfo.getPairContext().getDeviceInfoReq().r());
                    companion.D(taskGetDeviceInfo.getPairContext().getDeviceInfoReq().m());
                    companion.t(taskGetDeviceInfo.getPairContext().getDeviceInfoReq().l());
                    companion.F(taskGetDeviceInfo.getPairContext().getDeviceSn());
                    return ResultData.Companion.d(ResultData.INSTANCE, 0, "get device info by device success", 1, null);
                }
                ResultKt.throwOnFailure(objG);
                Result.Companion companion2 = Result.INSTANCE;
                AsyncResult<MessageEvent> asyncResultA = DeviceInfoRepository.a(getPairContext().getPairParams().getId());
                taskGetDeviceInfo$getDeviceInfoByDevice$2.L$0 = this;
                taskGetDeviceInfo$getDeviceInfoByDevice$2.label = 1;
                objG = asyncResultA.b(taskGetDeviceInfo$getDeviceInfoByDevice$2);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objM5287constructorimpl = Result.m5287constructorimpl((MessageEvent) objG);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5287constructorimpl2 = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5290exceptionOrNullimpl2 = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl2 != null) {
            return a.c(this, 0, ResultData.PairFailType.PB, "0107 deviceInfoMessageEvent error:" + thM5290exceptionOrNullimpl2.getMessage(), 1, null);
        }
        MessageEvent messageEvent = (MessageEvent) objM5287constructorimpl;
        ra5.a aVar = ra5.a.INSTANCE;
        String id = this.getPairContext().getPairParams().getId();
        TaskGetDeviceInfo$getDeviceInfoByDevice$deviceInfoRsp$1$1 taskGetDeviceInfo$getDeviceInfoByDevice$deviceInfoRsp$1$1 = TaskGetDeviceInfo$getDeviceInfoByDevice$deviceInfoRsp$1$1.INSTANCE;
        taskGetDeviceInfo$getDeviceInfoByDevice$2.L$0 = this;
        taskGetDeviceInfo$getDeviceInfoByDevice$2.label = 2;
        objG = DeviceUtilsKt.g(aVar, id, messageEvent, taskGetDeviceInfo$getDeviceInfoByDevice$deviceInfoRsp$1$1, (16 & 16) != 0 ? ko4.c.INSTANCE : null, (16 & 32) != 0 ? 5000L : 15000L, (16 & 64) != 0 ? 0 : 3, taskGetDeviceInfo$getDeviceInfoByDevice$2);
        if (objG == coroutine_suspended) {
            return coroutine_suspended;
        }
        objM5287constructorimpl2 = Result.m5287constructorimpl((DMProto$ConnectDeviceInfo) objG);
        taskGetDeviceInfo = this;
        thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl2);
        if (thM5290exceptionOrNullimpl == null) {
            return a.c(taskGetDeviceInfo, 0, ResultData.PairFailType.PB, "0107 pb error:" + thM5290exceptionOrNullimpl.getMessage(), 1, null);
        }
        dMProto$ConnectDeviceInfo = (DMProto$ConnectDeviceInfo) objM5287constructorimpl2;
        if (dMProto$ConnectDeviceInfo.getDeviceBtMac() == null) {
            return a.c(taskGetDeviceInfo, 0, ResultData.PairFailType.PB, "0107 data,deviceBtMac field is null", 1, null);
        }
        ml4.a(taskGetDeviceInfo.getTAG(), "update deviceinfo : " + dMProto$ConnectDeviceInfo);
        String tag2 = taskGetDeviceInfo.getTAG();
        ssoid = dMProto$ConnectDeviceInfo.getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid, "deviceInfoRsp.ssoid");
        if (ssoid.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        ml4.d(tag2, "deviceinfo " + z + "," + TextUtils.equals(dMProto$ConnectDeviceInfo.getSsoid(), um.c().getSsoid()));
        z7b.f(taskGetDeviceInfo.getTAG(), "device report " + dMProto$ConnectDeviceInfo.getSsoid());
        PairParams pairParams2 = taskGetDeviceInfo.getPairContext().getPairParams();
        String deviceModel2 = dMProto$ConnectDeviceInfo.getDeviceModel();
        Intrinsics.checkNotNullExpressionValue(deviceModel2, "deviceInfoRsp.deviceModel");
        pairParams2.setModel(deviceModel2);
        q3d.g(taskGetDeviceInfo.getPairContext().getContext(), taskGetDeviceInfo.getPairContext().getPairParams().getModel());
        q3d.f(taskGetDeviceInfo.getPairContext().getContext(), taskGetDeviceInfo.getPairContext().getPairParams().getId());
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().F(rp5.a(dMProto$ConnectDeviceInfo.getDeviceSn(), taskGetDeviceInfo.getDEFAULT_VALUE()));
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().G(String.valueOf(dMProto$ConnectDeviceInfo.getDeviceType()));
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().H(taskGetDeviceInfo.getPairContext().getPairParams().getId());
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().I(rp5.a(dMProto$ConnectDeviceInfo.getDeviceSoftVersion(), taskGetDeviceInfo.getDEFAULT_VALUE()));
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().K(rp5.a(dMProto$ConnectDeviceInfo.getDeviceHardVersion(), taskGetDeviceInfo.getDEFAULT_VALUE()));
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().N(taskGetDeviceInfo.getPairContext().getPairParams().getId());
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().y((String) lc5.d(taskGetDeviceInfo.getPairContext().getPairParams().getModel()).a(new Function1<DeviceModel, String>() { // from class: com.heytap.health.devicepair.manager.task.TaskGetDeviceInfo$getDeviceInfoByDevice$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public final String invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                return applyMode.X8() ? this.this$0.getPairContext().getPairParams().getId() : dMProto$ConnectDeviceInfo.getDeviceBleMac();
            }
        }));
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().P(taskGetDeviceInfo.getPairContext().getPairParams().getModel());
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().O(dMProto$ConnectDeviceInfo.getManufacturer());
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().A(dMProto$ConnectDeviceInfo.getBtName());
        if (!TextUtils.isEmpty(dMProto$ConnectDeviceInfo.getDeviceSku())) {
            taskGetDeviceInfo.getPairContext().getDeviceInfoReq().T(dMProto$ConnectDeviceInfo.getDeviceSku());
        }
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().R(dMProto$ConnectDeviceInfo.getProjectId());
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().B(dMProto$ConnectDeviceInfo.getBoardId());
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().V(((Number) lc5.d(taskGetDeviceInfo.getPairContext().getPairParams().getModel()).a(new Function1<DeviceModel, Integer>() { // from class: com.heytap.health.devicepair.manager.task.TaskGetDeviceInfo$getDeviceInfoByDevice$3
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                return Integer.valueOf(applyMode.r9(dMProto$ConnectDeviceInfo.getBoardId(), dMProto$ConnectDeviceInfo.getProjectId()));
            }
        })).intValue());
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().E(rp5.a(dMProto$ConnectDeviceInfo.getOsVersion(), taskGetDeviceInfo.getDEFAULT_OS_VERSION()));
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().Q(rp5.a(dMProto$ConnectDeviceInfo.getDeviceOtaVersion(), taskGetDeviceInfo.getDEFAULT_VALUE()));
        PairContext pairContext4 = taskGetDeviceInfo.getPairContext();
        String strA3 = rp5.a(dMProto$ConnectDeviceInfo.getDeviceImei(), taskGetDeviceInfo.getDEFAULT_VALUE());
        Intrinsics.checkNotNullExpressionValue(strA3, "checkAndGetValue(deviceI…eviceImei, DEFAULT_VALUE)");
        pairContext4.t(strA3);
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().J(rp5.a(dMProto$ConnectDeviceInfo.getGuid(), taskGetDeviceInfo.getEMPTY_VALUE()));
        PairContext pairContext5 = taskGetDeviceInfo.getPairContext();
        String strA4 = rp5.a(dMProto$ConnectDeviceInfo.getDeviceSn(), taskGetDeviceInfo.getDEFAULT_VALUE());
        Intrinsics.checkNotNullExpressionValue(strA4, "checkAndGetValue(deviceI….deviceSn, DEFAULT_VALUE)");
        pairContext5.u(strA4);
        PairContext pairContext6 = taskGetDeviceInfo.getPairContext();
        String ssoid3 = dMProto$ConnectDeviceInfo.getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid3, "deviceInfoRsp.ssoid");
        pairContext6.v(ssoid3);
        taskGetDeviceInfo.getPairContext().getDeviceInfoReq().z(taskGetDeviceInfo.getPairContext().g());
        if (((Boolean) lc5.d(taskGetDeviceInfo.getPairContext().getPairParams().getModel()).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.devicepair.manager.task.TaskGetDeviceInfo$getDeviceInfoByDevice$4
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                return Boolean.valueOf(!applyMode.Ea());
            }
        })).booleanValue()) {
            gl4.managerApi.z(taskGetDeviceInfo.getPairContext().getPairParams().getId(), dMProto$ConnectDeviceInfo.getDeviceBleMac(), taskGetDeviceInfo.getPairContext().getPairParams().getModel());
        }
        bg5.Companion companion5 = bg5.INSTANCE;
        companion5.B(taskGetDeviceInfo.getPairContext().getDeviceInfoReq().f());
        companion5.x(taskGetDeviceInfo.getPairContext().getDeviceImei());
        companion5.z(taskGetDeviceInfo.getPairContext().getDeviceInfoReq().r());
        companion5.D(taskGetDeviceInfo.getPairContext().getDeviceInfoReq().m());
        companion5.t(taskGetDeviceInfo.getPairContext().getDeviceInfoReq().l());
        companion5.F(taskGetDeviceInfo.getPairContext().getDeviceSn());
        return ResultData.Companion.d(ResultData.INSTANCE, 0, "get device info by device success", 1, null);
    }
}
