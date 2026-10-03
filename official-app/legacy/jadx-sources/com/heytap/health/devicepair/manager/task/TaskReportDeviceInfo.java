package com.heytap.health.devicepair.manager.task;

import com.heytap.health.devicemanager.api.DMLocalDeviceManagerApi;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.cc5;
import com.oplus.aiunit.vision.dc5;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.q3d;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.ypf;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.SafeContinuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\b\u0010\b\u001a\u00020\u0007H\u0002R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/TaskReportDeviceInfo;", "Lcom/heytap/health/devicepair/manager/a;", "Lcom/heytap/health/devicepair/manager/ResultData;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "r", "", "t", "", LogFieldKey.MESSAGE_KEY, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "", "n", "I", "q", "()I", "u", "(I)V", "currReportCount", "o", "REPORT_TIMES", LogFieldKey.PROCESS_NAME_KEY, "PAIR_RESULT_SUCCESS", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskReportDeviceInfo extends com.heytap.health.devicepair.manager.a {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int currReportCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int REPORT_TIMES;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int PAIR_RESULT_SUCCESS;

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\r\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¨\u0006\u000e"}, d2 = {"com/heytap/health/devicepair/manager/task/TaskReportDeviceInfo$a", "Lcom/oplus/aiunit/vision/cc5;", "", "object", "", "c", "", MapSchema.FIELD_NAME_ENTRY, "", "errMsg", "b", "Lcom/heytap/health/network/core/BaseResponse;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "a", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends cc5<Object> {
        public final /* synthetic */ Continuation<ResultData> a;
        public final /* synthetic */ TaskReportDeviceInfo b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Continuation<? super ResultData> continuation, TaskReportDeviceInfo taskReportDeviceInfo) {
            this.a = continuation;
            this.b = taskReportDeviceInfo;
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void a(@NotNull BaseResponse<?> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            super.a(response);
            TaskReportDeviceInfo taskReportDeviceInfo = this.b;
            taskReportDeviceInfo.u(taskReportDeviceInfo.getCurrReportCount() + 1);
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(com.heytap.health.devicepair.manager.a.c(this.b, 0, ResultData.PairFailType.CLOUND, "reportDeviceInfo faile errRsp:" + response.getErrorCode(), 1, null)));
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void b(@NotNull Throwable e2, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            super.b(e2, errMsg);
            TaskReportDeviceInfo taskReportDeviceInfo = this.b;
            taskReportDeviceInfo.u(taskReportDeviceInfo.getCurrReportCount() + 1);
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(com.heytap.health.devicepair.manager.a.c(this.b, 0, ResultData.PairFailType.CLOUND, "reportDeviceInfo faile errmsg:" + errMsg, 1, null)));
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void c(@Nullable Object object) {
            super.c(object);
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(ResultData.INSTANCE.c(this.b.PAIR_RESULT_SUCCESS, "reportDeviceInfo onSuccess")));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskReportDeviceInfo(@NotNull PairContext pairContext) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        this.TAG = "TaskReportDeviceInfo";
        this.REPORT_TIMES = 3;
        this.PAIR_RESULT_SUCCESS = 200;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0099 -> B:31:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.heytap.health.devicepair.manager.a
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super com.heytap.health.devicepair.manager.ResultData> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo$execute$1
            if (r0 == 0) goto L13
            r0 = r8
            com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo$execute$1 r0 = (com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo$execute$1 r0 = new com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo$execute$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            com.heytap.health.devicepair.manager.ResultData r7 = (com.heytap.health.devicepair.manager.ResultData) r7
            java.lang.Object r2 = r0.L$0
            com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo r2 = (com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo) r2
            p010kotlin.ResultKt.throwOnFailure(r8)
            goto L9c
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.L$0
            com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo r7 = (com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo) r7
            p010kotlin.ResultKt.throwOnFailure(r8)
            goto L76
        L44:
            p010kotlin.ResultKt.throwOnFailure(r8)
            com.heytap.health.devicepair.manager.PairContext r8 = r7.getPairContext()
            com.heytap.health.devicepair.manager.params.PairParams r8 = r8.getPairParams()
            boolean r8 = r8.isSecond()
            r2 = 0
            if (r8 == 0) goto L60
            com.heytap.health.devicepair.manager.ResultData$a r7 = com.heytap.health.devicepair.manager.ResultData.INSTANCE
            java.lang.String r8 = "pair second not report deviceinfo"
            r0 = 0
            com.heytap.health.devicepair.manager.ResultData r7 = com.heytap.health.devicepair.manager.ResultData.Companion.d(r7, r2, r8, r4, r0)
            return r7
        L60:
            java.lang.String r8 = r7.getTAG()
            java.lang.String r5 = "executor->report deviceinfo"
            com.oplus.aiunit.vision.ml4.a(r8, r5)
            r7.currReportCount = r2
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r7.s(r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            com.heytap.health.devicepair.manager.ResultData r8 = (com.heytap.health.devicepair.manager.ResultData) r8
            boolean r2 = r8.b()
            if (r2 == 0) goto Lbf
            com.heytap.health.devicepair.manager.ResultData$PairExpandBean r2 = r8.getPairExpandBean()
            java.lang.String r4 = "report deviceinfo default"
            r2.setMsg(r4)
            r2 = r7
            r7 = r8
        L89:
            int r8 = r2.currReportCount
            int r4 = r2.REPORT_TIMES
            if (r8 >= r4) goto Lbe
            r0.L$0 = r2
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r2.r(r0)
            if (r8 != r1) goto L9c
            return r1
        L9c:
            com.heytap.health.devicepair.manager.ResultData r8 = (com.heytap.health.devicepair.manager.ResultData) r8
            boolean r4 = r8.b()
            if (r4 == 0) goto La5
            goto Lbf
        La5:
            java.lang.String r4 = r2.getTAG()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "execute->"
            r5.append(r6)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            com.oplus.aiunit.vision.ml4.a(r4, r8)
            goto L89
        Lbe:
            r8 = r7
        Lbf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.devicepair.manager.task.TaskReportDeviceInfo.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.heytap.health.devicepair.manager.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getCurrReportCount() {
        return this.currReportCount;
    }

    public final Object r(Continuation<? super ResultData> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        dc5.i(getPairContext().getDeviceInfoReq(), new a(safeContinuation, this));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final Object s(Continuation<? super ResultData> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        t();
        q3d.h(getPairContext().getContext(), getPairContext().getPairParams().getId(), 11);
        Result.Companion companion = Result.INSTANCE;
        safeContinuation.resumeWith(Result.m5287constructorimpl(ResultData.Companion.d(ResultData.INSTANCE, 0, "saveDeiceInfo success", 1, null)));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final void t() {
        UserDeviceInfo boundDeviceInfoByMac = gl4.managerApi.getBoundDeviceInfoByMac(getPairContext().getPairParams().getId());
        if (boundDeviceInfoByMac == null) {
            ml4.c(getTAG(), "saveDeviceInfo fail not find " + gdb.a(getPairContext().getPairParams().getId()));
            return;
        }
        ypf deviceInfoReq = getPairContext().getDeviceInfoReq();
        boundDeviceInfoByMac.setDeviceName(deviceInfoReq.f());
        boundDeviceInfoByMac.setDeviceMarketName(deviceInfoReq.e());
        boundDeviceInfoByMac.setBleMac(deviceInfoReq.a());
        boundDeviceInfoByMac.setManufacturer(deviceInfoReq.q());
        boundDeviceInfoByMac.setSku(deviceInfoReq.u());
        boundDeviceInfoByMac.setSkuCode(deviceInfoReq.v());
        boundDeviceInfoByMac.setSkuMarketName(deviceInfoReq.w());
        boundDeviceInfoByMac.setBleSecretMetadata(deviceInfoReq.b());
        boundDeviceInfoByMac.setProjectId(deviceInfoReq.t());
        boundDeviceInfoByMac.setBoardId(deviceInfoReq.d());
        boundDeviceInfoByMac.setAppTerminalId(ilj.e());
        boundDeviceInfoByMac.setDeviceMarketName(deviceInfoReq.e());
        boundDeviceInfoByMac.setSkuMarketName(deviceInfoReq.w());
        boundDeviceInfoByMac.setImei(getPairContext().getDeviceImei());
        Object objNavigation = x0.d().b(DMLocalDeviceManagerApi.SERVICE_DB_DEVICE).navigation();
        DMLocalDeviceManagerApi dMLocalDeviceManagerApi = objNavigation instanceof DMLocalDeviceManagerApi ? (DMLocalDeviceManagerApi) objNavigation : null;
        if (dMLocalDeviceManagerApi != null) {
            dMLocalDeviceManagerApi.d0(boundDeviceInfoByMac);
        }
    }

    public final void u(int i) {
        this.currReportCount = i;
    }
}
