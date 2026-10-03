package com.heytap.health.device.tab.itemview;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.heytap.health.device.tab.controller.DeviceTabAdapterController;
import com.heytap.health.device.tab.itemview.CouponItem;
import com.heytap.health.device_settings.impl.R$drawable;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.devicemanager.processor.cloudaccess.response.DeviceCouponRsp;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ft6;
import com.oplus.aiunit.vision.kp5;
import com.oplus.aiunit.vision.lp5;
import com.oplus.aiunit.vision.m3k;
import com.oplus.aiunit.vision.mmd;
import com.oplus.aiunit.vision.n61;
import com.oplus.aiunit.vision.skf;
import com.oplus.aiunit.vision.vik;
import com.oplus.aiunit.vision.wq8;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0015J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010J\u0013\u0010\u0013\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/heytap/health/device/tab/itemview/CouponItem;", "Lcom/oplus/aiunit/vision/n61;", "Lcom/heytap/health/devicemanager/processor/cloudaccess/response/DeviceCouponRsp;", "", "H0", "", "G", "Lcom/oplus/aiunit/vision/ft6;", "type", "", "N", "data", "Q0", "b0", "Lcom/oplus/aiunit/vision/skf;", "Z", "", "json", "S0", "T0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dataRsp", "P0", "(Lcom/heytap/health/devicemanager/processor/cloudaccess/response/DeviceCouponRsp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "D", "J", "preCouponCheckTime", "Lcom/heytap/health/device/tab/controller/DeviceTabAdapterController;", "controller", "<init>", "(Lcom/heytap/health/device/tab/controller/DeviceTabAdapterController;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CouponItem extends n61<DeviceCouponRsp> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public long preCouponCheckTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponItem(@NotNull DeviceTabAdapterController controller) {
        super("CouponView", controller);
        Intrinsics.checkNotNullParameter(controller, "controller");
    }

    public static final void R0(DeviceCouponRsp data, Map map) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(map, "map");
        map.put("count", Integer.valueOf(data.getCount()));
    }

    @Override // com.heytap.health.device.flexadapter.a
    public int G() {
        return 13;
    }

    @Override // com.oplus.aiunit.vision.n61
    public void H0() {
        DeviceCouponRsp deviceCouponRspF = F();
        if (deviceCouponRspF != null) {
            vik.e(o0(), 1, "", 5, 1);
            mmd.c().a(Uri.parse(deviceCouponRspF.getDeeplink()), "");
        }
    }

    @Override // com.oplus.aiunit.vision.n61, com.heytap.health.device.tab.itemview.wearable.a, com.heytap.health.device.flexadapter.a
    @SuppressLint({"MissingSuperCall"})
    public boolean N(@NotNull ft6 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return false;
    }

    public final Object P0(DeviceCouponRsp deviceCouponRsp, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(wq8.INSTANCE.f(), new CouponItem$checkCouponData$2(deviceCouponRsp, this, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // com.heytap.health.device.flexadapter.a
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public void L(@NotNull final DeviceCouponRsp data) {
        Intrinsics.checkNotNullParameter(data, "data");
        vik.q(o0(), 1, "", 6, -1, new vik.a() { // from class: com.oplus.aiunit.vision.xa4
            @Override // com.oplus.aiunit.vision.vik.a
            public final void intercept(Map map) {
                CouponItem.R0(data, map);
            }
        });
        E0().setText(R$string.device_settings_item_counpon);
        C0().setImageResource(R$drawable.settings_ic_app_coupon);
    }

    public final void S0(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(p()), wq8.INSTANCE.e(), null, new CouponItem$testCheckCouponData$1(this, json, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T0(Continuation<? super Unit> continuation) {
        CouponItem$updateCouponData$1 couponItem$updateCouponData$1;
        Object objM5287constructorimpl;
        if (continuation instanceof CouponItem$updateCouponData$1) {
            couponItem$updateCouponData$1 = (CouponItem$updateCouponData$1) continuation;
            int i = couponItem$updateCouponData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                couponItem$updateCouponData$1.label = i - Integer.MIN_VALUE;
            } else {
                couponItem$updateCouponData$1 = new CouponItem$updateCouponData$1(this, continuation);
            }
        } else {
            couponItem$updateCouponData$1 = new CouponItem$updateCouponData$1(this, continuation);
        }
        Object objD = couponItem$updateCouponData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = couponItem$updateCouponData$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(objD);
                    return Unit.INSTANCE;
                }
                if (i2 == 2) {
                    this = (CouponItem) couponItem$updateCouponData$1.L$0;
                    ResultKt.throwOnFailure(objD);
                    objM5287constructorimpl = Result.m5287constructorimpl((BaseResponse) objD);
                } else {
                    if (i2 != 3 && i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objD);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objD);
            if (!m3k.f()) {
                CoroutineContext coroutineContextF = wq8.INSTANCE.f();
                CouponItem$updateCouponData$2 couponItem$updateCouponData$2 = new CouponItem$updateCouponData$2(this, null);
                couponItem$updateCouponData$1.label = 1;
                if (BuildersKt.withContext(coroutineContextF, couponItem$updateCouponData$2, couponItem$updateCouponData$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            long jA = lp5.a();
            long jB = lp5.b();
            if (jA != 0 && jB != 0 && System.currentTimeMillis() - jA < jB) {
                getMTag();
                StringBuilder sb = new StringBuilder();
                sb.append("couponCloseTime not met,couponCloseTime:");
                sb.append(jA);
                sb.append(" couponInterval:");
                sb.append(jB);
                return Unit.INSTANCE;
            }
            Result.Companion companion = Result.INSTANCE;
            kp5 kp5Var = (kp5) a.j(kp5.class);
            couponItem$updateCouponData$1.L$0 = this;
            couponItem$updateCouponData$1.label = 2;
            objD = kp5Var.d(couponItem$updateCouponData$1);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            objM5287constructorimpl = Result.m5287constructorimpl((BaseResponse) objD);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            a7b.b(this.getMTag(), "queryUserWearCoupons cloud fail " + thM5290exceptionOrNullimpl.getMessage());
        }
        if (Result.m5294isSuccessimpl(objM5287constructorimpl)) {
            BaseResponse baseResponse = (BaseResponse) objM5287constructorimpl;
            if (!baseResponse.isSuccess() || baseResponse.getBody() == null) {
                a7b.b(this.getMTag(), "queryUserWearCoupons cloud error code:" + baseResponse.getErrorCode());
                couponItem$updateCouponData$1.L$0 = objM5287constructorimpl;
                couponItem$updateCouponData$1.label = 3;
                if (this.P0(null, couponItem$updateCouponData$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                DeviceCouponRsp deviceCouponRsp = (DeviceCouponRsp) baseResponse.getBody();
                couponItem$updateCouponData$1.L$0 = objM5287constructorimpl;
                couponItem$updateCouponData$1.label = 4;
                if (this.P0(deviceCouponRsp, couponItem$updateCouponData$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.heytap.health.device.flexadapter.a
    @NotNull
    public skf Z(@NotNull ft6 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (System.currentTimeMillis() - this.preCouponCheckTime > 300000) {
            getMTag();
            this.preCouponCheckTime = System.currentTimeMillis();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(p()), wq8.INSTANCE.e(), null, new CouponItem$onEvent$1(this, null), 2, null);
        }
        return skf.a.INSTANCE;
    }

    @Override // com.heytap.health.device.flexadapter.a
    public void b0() {
        super.b0();
        com.heytap.health.device.flexadapter.a.o(this, null, 1, null);
    }
}
