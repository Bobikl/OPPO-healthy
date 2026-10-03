package com.heytap.health.devicepair.manager.task.basetask;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.devicepair.manager.a;
import com.heytap.health.manager.SkuHelper;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wearable.support.watchface.common.Constants;
import com.oplus.aiunit.vision.cc5;
import com.oplus.aiunit.vision.dc5;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.hk5;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.o1h;
import com.oplus.aiunit.vision.r4a;
import com.oplus.aiunit.vision.ypf;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.List;
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
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H¤@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u001a\u0010\u0010\u001a\u00020\u000b8\u0004X\u0084D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0004X\u0084D¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000b8\u0004X\u0084D¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/basetask/BaseTaskGetDeviceInfo;", "Lcom/heytap/health/devicepair/manager/a;", "Lcom/heytap/health/devicepair/manager/ResultData;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "v", "Lcom/oplus/aiunit/vision/hk5$b;", "modelSku", "", "x", "", LogFieldKey.MESSAGE_KEY, "Ljava/lang/String;", "t", "()Ljava/lang/String;", "DEFAULT_VALUE", "n", "w", "EMPTY_VALUE", "o", "s", "DEFAULT_OS_VERSION", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class BaseTaskGetDeviceInfo extends a {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String DEFAULT_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String EMPTY_VALUE;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final String DEFAULT_OS_VERSION;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTaskGetDeviceInfo(@NotNull PairContext pairContext) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        this.DEFAULT_VALUE = "unknown";
        this.EMPTY_VALUE = "";
        this.DEFAULT_OS_VERSION = Constants.HeyBuildVersion.V1_0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object r(BaseTaskGetDeviceInfo baseTaskGetDeviceInfo, Continuation<? super ResultData> continuation) {
        BaseTaskGetDeviceInfo$execute$1 baseTaskGetDeviceInfo$execute$1;
        if (continuation instanceof BaseTaskGetDeviceInfo$execute$1) {
            baseTaskGetDeviceInfo$execute$1 = (BaseTaskGetDeviceInfo$execute$1) continuation;
            int i = baseTaskGetDeviceInfo$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseTaskGetDeviceInfo$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                baseTaskGetDeviceInfo$execute$1 = new BaseTaskGetDeviceInfo$execute$1(baseTaskGetDeviceInfo, continuation);
            }
        } else {
            baseTaskGetDeviceInfo$execute$1 = new BaseTaskGetDeviceInfo$execute$1(baseTaskGetDeviceInfo, continuation);
        }
        Object objU = baseTaskGetDeviceInfo$execute$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = baseTaskGetDeviceInfo$execute$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                baseTaskGetDeviceInfo = (BaseTaskGetDeviceInfo) baseTaskGetDeviceInfo$execute$1.L$0;
                ResultKt.throwOnFailure(objU);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objU);
            }
            return (ResultData) objU;
        }
        ResultKt.throwOnFailure(objU);
        ml4.a(baseTaskGetDeviceInfo.getTAG(), "executor->get deviceinfo");
        baseTaskGetDeviceInfo$execute$1.L$0 = baseTaskGetDeviceInfo;
        baseTaskGetDeviceInfo$execute$1.label = 1;
        objU = baseTaskGetDeviceInfo.u(baseTaskGetDeviceInfo$execute$1);
        if (objU == coroutine_suspended) {
            return coroutine_suspended;
        }
        ResultData resultData = (ResultData) objU;
        if (!resultData.b()) {
            return resultData;
        }
        baseTaskGetDeviceInfo$execute$1.L$0 = null;
        baseTaskGetDeviceInfo$execute$1.label = 2;
        objU = baseTaskGetDeviceInfo.v(baseTaskGetDeviceInfo$execute$1);
        if (objU == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (ResultData) objU;
    }

    @Override // com.heytap.health.devicepair.manager.a
    @Nullable
    public Object a(@NotNull Continuation<? super ResultData> continuation) {
        return r(this, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getDEFAULT_OS_VERSION() {
        return this.DEFAULT_OS_VERSION;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getDEFAULT_VALUE() {
        return this.DEFAULT_VALUE;
    }

    @Nullable
    public abstract Object u(@NotNull Continuation<? super ResultData> continuation);

    public final Object v(Continuation<? super ResultData> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        String model = getPairContext().getPairParams().getModel();
        String strI = getPairContext().getDeviceInfoReq().i();
        Intrinsics.checkNotNullExpressionValue(strI, "pairContext.deviceInfoReq.deviceType");
        dc5.f(model, Integer.parseInt(strI), new cc5<Object>() { // from class: com.heytap.health.devicepair.manager.task.basetask.BaseTaskGetDeviceInfo$getDeviceInfoyByClound$2$1
            @Override // com.oplus.aiunit.vision.cc5
            public void b(@NotNull Throwable e2, @NotNull String errMsg) {
                Intrinsics.checkNotNullParameter(e2, "e");
                Intrinsics.checkNotNullParameter(errMsg, "errMsg");
                super.b(e2, errMsg);
                Continuation<ResultData> continuation2 = safeContinuation;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m5287constructorimpl(a.c(this.a, 0, ResultData.PairFailType.CLOUND, "getBindDeviceInfoFromCloud onFailure " + errMsg, 1, null)));
            }

            @Override // com.oplus.aiunit.vision.cc5
            public void c(@Nullable Object object) {
                String strB;
                super.c(object);
                ml4.d(this.a.getTAG(), "get bind device info success");
                hk5 hk5Var = (hk5) object;
                Intrinsics.checkNotNull(hk5Var);
                List<hk5.b> listD = hk5Var.d();
                if (listD == null || listD.isEmpty()) {
                    Continuation<ResultData> continuation2 = safeContinuation;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m5287constructorimpl(a.c(this.a, 0, ResultData.PairFailType.CLOUND, "getBindDeviceInfoFromCloud: skulist is null", 1, null)));
                    return;
                }
                String strA = hk5Var.a();
                ml4.a(this.a.getTAG(), "[getBindDeviceInfoFromCloud] deviceName: " + strA);
                this.a.getPairContext().getDeviceInfoReq().D(strA);
                int size = listD.size();
                int i = 0;
                hk5.b bVar = null;
                while (true) {
                    if (i >= size) {
                        strB = "";
                        break;
                    }
                    hk5.b modelSku = listD.get(i);
                    if (TextUtils.equals(modelSku.d(), this.a.getPairContext().getDeviceInfoReq().v())) {
                        ml4.a(this.a.getTAG(), "set skuDesc:" + modelSku.e() + ", skuCode:" + modelSku.d());
                        ypf deviceInfoReq = this.a.getPairContext().getDeviceInfoReq();
                        String strE = modelSku.e();
                        if (strE == null) {
                            strE = "";
                        }
                        deviceInfoReq.S(strE);
                        ypf deviceInfoReq2 = this.a.getPairContext().getDeviceInfoReq();
                        String strD = modelSku.d();
                        if (strD == null) {
                            strD = "";
                        }
                        deviceInfoReq2.T(strD);
                        ypf deviceInfoReq3 = this.a.getPairContext().getDeviceInfoReq();
                        String strB2 = modelSku.b();
                        if (strB2 == null) {
                            strB2 = "";
                        }
                        deviceInfoReq3.C(strB2);
                        ypf deviceInfoReq4 = this.a.getPairContext().getDeviceInfoReq();
                        String strF = modelSku.f();
                        if (strF == null) {
                            strF = "";
                        }
                        deviceInfoReq4.U(strF);
                        strB = modelSku.b();
                        if (strB == null) {
                            strB = "";
                        }
                        BaseTaskGetDeviceInfo baseTaskGetDeviceInfo = this.a;
                        Intrinsics.checkNotNullExpressionValue(modelSku, "modelSku");
                        baseTaskGetDeviceInfo.x(modelSku);
                        break;
                    }
                    if (modelSku.a() == 1) {
                        bVar = modelSku;
                    }
                    i++;
                }
                if (bVar != null && TextUtils.isEmpty(this.a.getPairContext().getDeviceInfoReq().u())) {
                    ml4.a(this.a.getTAG(), "set defuelt skuDesc:" + bVar.e() + ", skuCode:" + bVar.d());
                    ypf deviceInfoReq5 = this.a.getPairContext().getDeviceInfoReq();
                    String strE2 = bVar.e();
                    if (strE2 == null) {
                        strE2 = "";
                    }
                    deviceInfoReq5.S(strE2);
                    ypf deviceInfoReq6 = this.a.getPairContext().getDeviceInfoReq();
                    String strD2 = bVar.d();
                    if (strD2 == null) {
                        strD2 = "";
                    }
                    deviceInfoReq6.T(strD2);
                    ypf deviceInfoReq7 = this.a.getPairContext().getDeviceInfoReq();
                    String strB3 = bVar.b();
                    if (strB3 == null) {
                        strB3 = "";
                    }
                    deviceInfoReq7.C(strB3);
                    ypf deviceInfoReq8 = this.a.getPairContext().getDeviceInfoReq();
                    String strF2 = bVar.f();
                    if (strF2 == null) {
                        strF2 = "";
                    }
                    deviceInfoReq8.U(strF2);
                    this.a.x(bVar);
                    strB = bVar.b();
                    if (strB == null) {
                        strB = "";
                    }
                }
                if (((Boolean) lc5.d(this.a.getPairContext().getPairParams().getModel()).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.devicepair.manager.task.basetask.BaseTaskGetDeviceInfo$getDeviceInfoyByClound$2$1$onSuccess$1
                    @Override // p010kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull DeviceModel applyMode) {
                        Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                        return Boolean.valueOf(applyMode.k0());
                    }
                })).booleanValue()) {
                    Node nodeByMac = gl4.managerApi.getNodeByMac(this.a.getPairContext().getPairParams().getId());
                    String displayName = nodeByMac != null ? nodeByMac.getDisplayName() : null;
                    String str = displayName != null ? displayName : "";
                    if (str.length() > 0) {
                        this.a.getPairContext().getDeviceInfoReq().D(str);
                    }
                }
                Context context = this.a.getPairContext().getContext();
                if (!TextUtils.isEmpty(strB)) {
                    strA = strB;
                }
                o1h.g(context, o1h.OOBE_NAME, strA);
                Continuation<ResultData> continuation3 = safeContinuation;
                Result.Companion companion2 = Result.INSTANCE;
                continuation3.resumeWith(Result.m5287constructorimpl(ResultData.Companion.d(ResultData.INSTANCE, 0, "getBindDeviceInfoFromCloud success", 1, null)));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getEMPTY_VALUE() {
        return this.EMPTY_VALUE;
    }

    public final void x(hk5.b modelSku) {
        List<hk5.a> listC = modelSku.c();
        if (listC == null || !(!listC.isEmpty())) {
            return;
        }
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            hk5.a aVar = listC.get(i);
            if (TextUtils.equals(aVar.a(), "picture_id")) {
                SkuHelper.c(getPairContext().getPairParams().getId(), aVar.b());
                SkuHelper.d();
                r4a.b(getPairContext().getContext(), aVar.b(), 3000, null);
            }
        }
    }
}
