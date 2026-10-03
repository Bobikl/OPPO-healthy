package com.heytap.health.oobe.setups.pair;

import android.text.TextUtils;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.oobe.Variants;
import com.heytap.health.oobe.dto.FailOOBEKt;
import com.heytap.health.oobe.repo.OOBEDevice;
import com.heytap.health.watchpair.R$string;
import com.oplus.aiunit.vision.dm;
import com.oplus.aiunit.vision.g71;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.h6e;
import com.oplus.aiunit.vision.i6e;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.qtf;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/CheckAfterConnect;", "Lcom/oplus/aiunit/vision/g71;", "Lcom/oplus/aiunit/vision/gea$a;", "Lcom/oplus/aiunit/vision/h6e;", "Lcom/oplus/aiunit/vision/i6e;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCheckAfterConnect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckAfterConnect.kt\ncom/heytap/health/oobe/setups/pair/CheckAfterConnect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public final class CheckAfterConnect extends g71 {
    /* JADX WARN: Code duplicated, block: B:68:0x0147  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<h6e, i6e> aVar, @NotNull Continuation<? super i6e> continuation) {
        CheckAfterConnect$intercept$1 checkAfterConnect$intercept$1;
        h6e h6eVar;
        String appTerminalId;
        Object next;
        h6e h6eVar2;
        if (continuation instanceof CheckAfterConnect$intercept$1) {
            checkAfterConnect$intercept$1 = (CheckAfterConnect$intercept$1) continuation;
            int i = checkAfterConnect$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkAfterConnect$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                checkAfterConnect$intercept$1 = new CheckAfterConnect$intercept$1(this, continuation);
            }
        } else {
            checkAfterConnect$intercept$1 = new CheckAfterConnect$intercept$1(this, continuation);
        }
        Object objA = checkAfterConnect$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = checkAfterConnect$intercept$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objA);
            }
            if (i2 == 2) {
                ResultKt.throwOnFailure(objA);
            }
            if (i2 == 3 || i2 == 4) {
                h6eVar2 = (h6e) checkAfterConnect$intercept$1.L$1;
                aVar = (gea.a) checkAfterConnect$intercept$1.L$0;
                ResultKt.throwOnFailure(objA);
                h6eVar = h6eVar2;
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
        }
        ResultKt.throwOnFailure(objA);
        h6eVar = (h6e) aVar.request();
        Variants pairingData = h6eVar.getPairingData();
        if (pairingData.isPairSecond()) {
            if (!((Boolean) lc5.c(pairingData.getAddress()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.oobe.setups.pair.CheckAfterConnect$intercept$2
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                    Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                    return Boolean.valueOf(applyInfo.cb());
                }
            })).booleanValue()) {
                throw FailOOBEKt.d(pairingData, qtf.l(R$string.oobe_pair_default), "not support secondary");
            }
            checkAfterConnect$intercept$1.label = 1;
            objA = aVar.a(h6eVar, checkAfterConnect$intercept$1);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }
        if (pairingData.isPairFamily()) {
            OOBEDevice oOBEDevice = OOBEDevice.INSTANCE;
            if (!oOBEDevice.j(pairingData.getAddress())) {
                if (oOBEDevice.f(pairingData.getAddress())) {
                    throw FailOOBEKt.d(pairingData, qtf.l(R$string.pair_version_not_support_family), "watch version no support family");
                }
                throw FailOOBEKt.d(pairingData, qtf.l(R$string.pair_not_support_family), "watch no support family");
            }
        }
        String deviceSsoid = h6eVar.getDeviceInfo().getDeviceSsoid();
        if (TextUtils.isEmpty(deviceSsoid)) {
            c("CheckDeviceSsoid -> device have no ssoid, ignore");
            checkAfterConnect$intercept$1.label = 2;
            objA = aVar.a(h6eVar, checkAfterConnect$intercept$1);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }
        if (!dm.INSTANCE.b(deviceSsoid)) {
            b("pairType:" + pairingData.getPairType() + " check device state ssoid not equal ");
            return new i6e(false, FailOOBEKt.i(pairingData, deviceSsoid));
        }
        c("CheckDeviceSsoid -> device have same ssoid");
        OOBEDevice oOBEDevice2 = OOBEDevice.INSTANCE;
        if (oOBEDevice2.g(pairingData.getAddress())) {
            String address = pairingData.getAddress();
            checkAfterConnect$intercept$1.L$0 = aVar;
            checkAfterConnect$intercept$1.L$1 = h6eVar;
            checkAfterConnect$intercept$1.label = 3;
            if (oOBEDevice2.v(address, checkAfterConnect$intercept$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            List<UserDeviceInfo> listB = h6eVar.b();
            if (listB != null) {
                Iterator<T> it = listB.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((UserDeviceInfo) next).getMac(), pairingData.getAddress()));
                UserDeviceInfo userDeviceInfo = (UserDeviceInfo) next;
                if (userDeviceInfo != null) {
                    appTerminalId = userDeviceInfo.getAppTerminalId();
                } else {
                    appTerminalId = null;
                }
            } else {
                appTerminalId = null;
            }
            if (!Intrinsics.areEqual(appTerminalId, ilj.e())) {
                OOBEDevice oOBEDevice3 = OOBEDevice.INSTANCE;
                String address2 = pairingData.getAddress();
                checkAfterConnect$intercept$1.L$0 = aVar;
                checkAfterConnect$intercept$1.L$1 = h6eVar;
                checkAfterConnect$intercept$1.label = 4;
                if (oOBEDevice3.x(address2, checkAfterConnect$intercept$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        h6eVar2 = h6eVar;
        h6eVar = h6eVar2;
        checkAfterConnect$intercept$1.L$0 = null;
        checkAfterConnect$intercept$1.L$1 = null;
        checkAfterConnect$intercept$1.label = 5;
        objA = aVar.a(h6eVar, checkAfterConnect$intercept$1);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
