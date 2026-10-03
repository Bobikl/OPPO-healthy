package com.heytap.health.oobe.setups.pair;

import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.devicemanager.api.IAccountDeviceRequestService;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import com.heytap.health.oobe.Variants;
import com.oplus.aiunit.vision.g71;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.h6e;
import com.oplus.aiunit.vision.i6e;
import com.oplus.aiunit.vision.x0;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/RefreshBondedDevices;", "Lcom/oplus/aiunit/vision/g71;", "Lcom/oplus/aiunit/vision/gea$a;", "Lcom/oplus/aiunit/vision/h6e;", "Lcom/oplus/aiunit/vision/i6e;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RefreshBondedDevices extends g71 {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<h6e, i6e> aVar, @NotNull Continuation<? super i6e> continuation) {
        RefreshBondedDevices$intercept$1 refreshBondedDevices$intercept$1;
        gea.a aVar2;
        Object next;
        VirtualAccountData virtualAccountData;
        RefreshBondedDevices refreshBondedDevices = this;
        if (continuation instanceof RefreshBondedDevices$intercept$1) {
            refreshBondedDevices$intercept$1 = (RefreshBondedDevices$intercept$1) continuation;
            int i = refreshBondedDevices$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                refreshBondedDevices$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                refreshBondedDevices$intercept$1 = new RefreshBondedDevices$intercept$1(refreshBondedDevices, continuation);
            }
        } else {
            refreshBondedDevices$intercept$1 = new RefreshBondedDevices$intercept$1(refreshBondedDevices, continuation);
        }
        Object objB = refreshBondedDevices$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = refreshBondedDevices$intercept$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                gea.a aVar3 = (gea.a) refreshBondedDevices$intercept$1.L$1;
                RefreshBondedDevices refreshBondedDevices2 = (RefreshBondedDevices) refreshBondedDevices$intercept$1.L$0;
                ResultKt.throwOnFailure(objB);
                aVar2 = aVar3;
                refreshBondedDevices = refreshBondedDevices2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objB);
            }
        }
        ResultKt.throwOnFailure(objB);
        Object objNavigation = x0.d().b("/devicemanager/IAccountDeviceRequestService").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.devicemanager.api.IAccountDeviceRequestService");
        AsyncResult<List<UserDeviceInfo>> asyncResultEa = ((IAccountDeviceRequestService) objNavigation).Ea();
        refreshBondedDevices$intercept$1.L$0 = refreshBondedDevices;
        aVar2 = aVar;
        refreshBondedDevices$intercept$1.L$1 = aVar2;
        refreshBondedDevices$intercept$1.label = 1;
        objB = asyncResultEa.b(refreshBondedDevices$intercept$1);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        List<? extends UserDeviceInfo> list = (List) objB;
        h6e h6eVar = (h6e) aVar2.request();
        Variants pairingData = h6eVar.getPairingData();
        h6eVar.g(list);
        if (pairingData.isPairNormal()) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                virtualAccountData = ((UserDeviceInfo) next).getVirtualAccountData();
            } while (!Intrinsics.areEqual(virtualAccountData != null ? virtualAccountData.getDeviceUniqueId() : null, pairingData.getAddress()));
            pairingData.setFamily(next != null);
        }
        refreshBondedDevices.c("bondedDevices ->  " + CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1<UserDeviceInfo, CharSequence>() { // from class: com.heytap.health.oobe.setups.pair.RefreshBondedDevices$intercept$3
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull UserDeviceInfo it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.getVirtualAccountData() == null) {
                    return String.valueOf(it2.getDeviceName());
                }
                String deviceName = it2.getDeviceName();
                VirtualAccountData virtualAccountData2 = it2.getVirtualAccountData();
                Intrinsics.checkNotNull(virtualAccountData2);
                return deviceName + "," + virtualAccountData2.getNikcName();
            }
        }, 31, null));
        refreshBondedDevices$intercept$1.L$0 = null;
        refreshBondedDevices$intercept$1.L$1 = null;
        refreshBondedDevices$intercept$1.label = 2;
        objB = aVar2.a(h6eVar, refreshBondedDevices$intercept$1);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }
}
