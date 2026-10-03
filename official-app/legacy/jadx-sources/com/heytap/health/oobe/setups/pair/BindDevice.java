package com.heytap.health.oobe.setups.pair;

import com.heytap.health.oobe.dto.DeviceDetailInfo;
import com.heytap.health.oobe.dto.FailOOBEKt;
import com.heytap.health.oobe.repo.OOBENetSource;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cqf;
import com.oplus.aiunit.vision.g71;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.h6e;
import com.oplus.aiunit.vision.i6e;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.old;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/BindDevice;", "Lcom/oplus/aiunit/vision/g71;", "Lcom/oplus/aiunit/vision/gea$a;", "Lcom/oplus/aiunit/vision/h6e;", "Lcom/oplus/aiunit/vision/i6e;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class BindDevice extends g71 {
    /* JADX WARN: Code duplicated, block: B:33:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<h6e, i6e> aVar, @NotNull Continuation<? super i6e> continuation) {
        BindDevice$intercept$1 bindDevice$intercept$1;
        h6e h6eVar;
        String message;
        if (continuation instanceof BindDevice$intercept$1) {
            bindDevice$intercept$1 = (BindDevice$intercept$1) continuation;
            int i = bindDevice$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bindDevice$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                bindDevice$intercept$1 = new BindDevice$intercept$1(this, continuation);
            }
        } else {
            bindDevice$intercept$1 = new BindDevice$intercept$1(this, continuation);
        }
        Object objA = bindDevice$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bindDevice$intercept$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            c("BindDevice -> start");
            h6eVar = (h6e) aVar.request();
            try {
                DeviceDetailInfo deviceInfo = h6eVar.getDeviceInfo();
                String strI = old.i();
                Intrinsics.checkNotNullExpressionValue(strI, "getVaid()");
                deviceInfo.setVaid(strI);
                DeviceDetailInfo deviceInfo2 = h6eVar.getDeviceInfo();
                String strE = ilj.e();
                Intrinsics.checkNotNullExpressionValue(strE, "getAndroidId()");
                deviceInfo2.setAppTerminalId(strE);
                if (h6eVar.getPairingData().isPairSecond()) {
                    OOBENetSource oOBENetSource = OOBENetSource.INSTANCE;
                    DeviceDetailInfo deviceInfo3 = h6eVar.getDeviceInfo();
                    bindDevice$intercept$1.L$0 = this;
                    bindDevice$intercept$1.L$1 = aVar;
                    bindDevice$intercept$1.L$2 = h6eVar;
                    bindDevice$intercept$1.label = 1;
                    if (oOBENetSource.b(deviceInfo3, bindDevice$intercept$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    OOBENetSource oOBENetSource2 = OOBENetSource.INSTANCE;
                    DeviceDetailInfo deviceInfo4 = h6eVar.getDeviceInfo();
                    bindDevice$intercept$1.L$0 = this;
                    bindDevice$intercept$1.L$1 = aVar;
                    bindDevice$intercept$1.L$2 = h6eVar;
                    bindDevice$intercept$1.label = 2;
                    if (oOBENetSource2.a(deviceInfo4, bindDevice$intercept$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.c("BindDevice -> success : " + h6eVar.getDeviceInfo());
                cqf cqfVarRequest = aVar.request();
                bindDevice$intercept$1.L$0 = null;
                bindDevice$intercept$1.L$1 = null;
                bindDevice$intercept$1.L$2 = null;
                bindDevice$intercept$1.label = 3;
                objA = aVar.a(cqfVarRequest, bindDevice$intercept$1);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                message = th.getMessage();
                if (message == null) {
                    message = th.toString();
                }
                this.b("BindDevice error:" + a7b.e(th));
                throw FailOOBEKt.f(h6eVar.getPairingData(), null, message, 2, null);
            }
        } else if (i2 == 1 || i2 == 2) {
            h6e h6eVar2 = (h6e) bindDevice$intercept$1.L$2;
            aVar = (gea.a) bindDevice$intercept$1.L$1;
            BindDevice bindDevice = (BindDevice) bindDevice$intercept$1.L$0;
            try {
                ResultKt.throwOnFailure(objA);
                h6eVar = h6eVar2;
                this = bindDevice;
                this.c("BindDevice -> success : " + h6eVar.getDeviceInfo());
                cqf cqfVarRequest2 = aVar.request();
                bindDevice$intercept$1.L$0 = null;
                bindDevice$intercept$1.L$1 = null;
                bindDevice$intercept$1.L$2 = null;
                bindDevice$intercept$1.label = 3;
                objA = aVar.a(cqfVarRequest2, bindDevice$intercept$1);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                h6eVar = h6eVar2;
                this = bindDevice;
                message = th.getMessage();
                if (message == null) {
                    message = th.toString();
                }
                this.b("BindDevice error:" + a7b.e(th));
                throw FailOOBEKt.f(h6eVar.getPairingData(), null, message, 2, null);
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        return objA;
    }
}
