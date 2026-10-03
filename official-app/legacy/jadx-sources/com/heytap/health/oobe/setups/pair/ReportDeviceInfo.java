package com.heytap.health.oobe.setups.pair;

import android.text.TextUtils;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.devicemanager.api.IAccountDeviceRequestService;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.oobe.OOBELogKt;
import com.heytap.health.oobe.Variants;
import com.heytap.health.oobe.dto.DeviceDetailInfo;
import com.heytap.health.oobe.repo.OOBEDevice;
import com.heytap.health.oobe.repo.OOBENetSource;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.g71;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.h6e;
import com.oplus.aiunit.vision.i3d;
import com.oplus.aiunit.vision.i6e;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.x0;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/ReportDeviceInfo;", "Lcom/oplus/aiunit/vision/g71;", "Lcom/oplus/aiunit/vision/gea$a;", "Lcom/oplus/aiunit/vision/h6e;", "Lcom/oplus/aiunit/vision/i6e;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", LogFieldKey.PROCESS_NAME_KEY, "", MapSchema.FIELD_NAME_ENTRY, "(Lcom/oplus/aiunit/vision/h6e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ReportDeviceInfo extends g71 {
    /* JADX WARN: Code duplicated, block: B:33:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<h6e, i6e> aVar, @NotNull Continuation<? super i6e> continuation) {
        ReportDeviceInfo$intercept$1 reportDeviceInfo$intercept$1;
        h6e h6eVar;
        if (continuation instanceof ReportDeviceInfo$intercept$1) {
            reportDeviceInfo$intercept$1 = (ReportDeviceInfo$intercept$1) continuation;
            int i = reportDeviceInfo$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportDeviceInfo$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                reportDeviceInfo$intercept$1 = new ReportDeviceInfo$intercept$1(this, continuation);
            }
        } else {
            reportDeviceInfo$intercept$1 = new ReportDeviceInfo$intercept$1(this, continuation);
        }
        Object obj = reportDeviceInfo$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = reportDeviceInfo$intercept$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            h6eVar = (h6e) aVar.request();
            if (h6eVar.getPairingData().isPairSecond()) {
                reportDeviceInfo$intercept$1.label = 1;
                if (e(h6eVar, reportDeviceInfo$intercept$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new i6e(true, null, 2, null);
            }
            c("ReportDeviceInfo -> start");
            String ksc = v9g.x("preference_device_manager").D("dm_ble_secret_meta_data_" + h6eVar.getPairingData().getAddress());
            c("ReportDeviceInfo -> kfc:" + OOBELogKt.b(ksc));
            if (!TextUtils.isEmpty(ksc)) {
                DeviceDetailInfo deviceInfo = h6eVar.getDeviceInfo();
                Intrinsics.checkNotNullExpressionValue(ksc, "ksc");
                deviceInfo.setBleSecretMetadata(ksc);
            }
            OOBENetSource oOBENetSource = OOBENetSource.INSTANCE;
            DeviceDetailInfo deviceInfo2 = h6eVar.getDeviceInfo();
            reportDeviceInfo$intercept$1.L$0 = this;
            reportDeviceInfo$intercept$1.L$1 = h6eVar;
            reportDeviceInfo$intercept$1.label = 2;
            if (oOBENetSource.m(deviceInfo2, reportDeviceInfo$intercept$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.c("ReportDeviceInfo -> success");
            reportDeviceInfo$intercept$1.L$0 = null;
            reportDeviceInfo$intercept$1.L$1 = null;
            reportDeviceInfo$intercept$1.label = 3;
            if (this.e(h6eVar, reportDeviceInfo$intercept$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return new i6e(true, null, 2, null);
            }
            if (i2 == 2) {
                h6e h6eVar2 = (h6e) reportDeviceInfo$intercept$1.L$1;
                ReportDeviceInfo reportDeviceInfo = (ReportDeviceInfo) reportDeviceInfo$intercept$1.L$0;
                ResultKt.throwOnFailure(obj);
                h6eVar = h6eVar2;
                this = reportDeviceInfo;
                this.c("ReportDeviceInfo -> success");
                reportDeviceInfo$intercept$1.L$0 = null;
                reportDeviceInfo$intercept$1.L$1 = null;
                reportDeviceInfo$intercept$1.label = 3;
                if (this.e(h6eVar, reportDeviceInfo$intercept$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        }
        return new i6e(true, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0140  */
    /* JADX WARN: Code duplicated, block: B:54:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00eb, please report this as an issue */
    public final Object e(h6e h6eVar, Continuation<? super Unit> continuation) {
        ReportDeviceInfo$notifyCloudBound$1 reportDeviceInfo$notifyCloudBound$1;
        Variants pairingData;
        h6e h6eVar2;
        Variants variants;
        ReportDeviceInfo reportDeviceInfo;
        ReportDeviceInfo reportDeviceInfo2;
        Object objM5287constructorimpl;
        Throwable thM5290exceptionOrNullimpl;
        List<? extends UserDeviceInfo> list;
        Iterator<T> it;
        Object next;
        i3d i3dVar;
        ReportDeviceInfo reportDeviceInfo3 = this;
        h6e h6eVar3 = h6eVar;
        if (continuation instanceof ReportDeviceInfo$notifyCloudBound$1) {
            reportDeviceInfo$notifyCloudBound$1 = (ReportDeviceInfo$notifyCloudBound$1) continuation;
            int i = reportDeviceInfo$notifyCloudBound$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportDeviceInfo$notifyCloudBound$1.label = i - Integer.MIN_VALUE;
            } else {
                reportDeviceInfo$notifyCloudBound$1 = new ReportDeviceInfo$notifyCloudBound$1(reportDeviceInfo3, continuation);
            }
        } else {
            reportDeviceInfo$notifyCloudBound$1 = new ReportDeviceInfo$notifyCloudBound$1(reportDeviceInfo3, continuation);
        }
        Object obj = reportDeviceInfo$notifyCloudBound$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = reportDeviceInfo$notifyCloudBound$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    Variants variants2 = (Variants) reportDeviceInfo$notifyCloudBound$1.L$2;
                    h6eVar3 = (h6e) reportDeviceInfo$notifyCloudBound$1.L$1;
                    ReportDeviceInfo reportDeviceInfo4 = (ReportDeviceInfo) reportDeviceInfo$notifyCloudBound$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    pairingData = variants2;
                    reportDeviceInfo3 = reportDeviceInfo4;
                } else if (i2 == 3) {
                    variants = (Variants) reportDeviceInfo$notifyCloudBound$1.L$2;
                    h6eVar2 = (h6e) reportDeviceInfo$notifyCloudBound$1.L$1;
                    reportDeviceInfo2 = (ReportDeviceInfo) reportDeviceInfo$notifyCloudBound$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objM5287constructorimpl = Result.m5287constructorimpl((List) obj);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion = Result.INSTANCE;
                        objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                    }
                    thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                    if (thM5290exceptionOrNullimpl != null) {
                        reportDeviceInfo2.b("queryUserDeviceListForCloud fail:" + thM5290exceptionOrNullimpl.getMessage());
                        objM5287constructorimpl = gl4.managerApi.getBoundDeviceInfos();
                    }
                    list = (List) objM5287constructorimpl;
                    h6eVar2.g(list);
                    List<? extends UserDeviceInfo> list2 = list;
                    reportDeviceInfo2.c("bondedDevices update after BindDevice -> " + CollectionsKt___CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new Function1<UserDeviceInfo, CharSequence>() { // from class: com.heytap.health.oobe.setups.pair.ReportDeviceInfo$notifyCloudBound$2
                        @Override // p010kotlin.jvm.functions.Function1
                        @NotNull
                        public final CharSequence invoke(@NotNull UserDeviceInfo it2) {
                            Intrinsics.checkNotNullParameter(it2, "it");
                            return it2.getDeviceName() + ":" + OOBELogKt.b(it2.getMac()) + "[" + it2.getSecondary() + "]";
                        }
                    }, 31, null));
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((UserDeviceInfo) next).getMac(), variants.getAddress()));
                    Intrinsics.checkNotNull(next);
                    h6eVar2.h(true);
                    variants.setOobeState(11);
                    i3dVar = i3d.INSTANCE;
                    reportDeviceInfo$notifyCloudBound$1.L$0 = null;
                    reportDeviceInfo$notifyCloudBound$1.L$1 = null;
                    reportDeviceInfo$notifyCloudBound$1.L$2 = null;
                    reportDeviceInfo$notifyCloudBound$1.label = 4;
                    if (i3dVar.a(variants, (UserDeviceInfo) next, list, reportDeviceInfo$notifyCloudBound$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            pairingData = h6eVar.getPairingData();
            if (pairingData.isPairIWatch()) {
                OOBEDevice oOBEDevice = OOBEDevice.INSTANCE;
                String address = pairingData.getAddress();
                reportDeviceInfo$notifyCloudBound$1.L$0 = reportDeviceInfo3;
                reportDeviceInfo$notifyCloudBound$1.L$1 = h6eVar3;
                reportDeviceInfo$notifyCloudBound$1.L$2 = pairingData;
                reportDeviceInfo$notifyCloudBound$1.label = 1;
                if (oOBEDevice.t(address, reportDeviceInfo$notifyCloudBound$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                OOBEDevice oOBEDevice2 = OOBEDevice.INSTANCE;
                String address2 = pairingData.getAddress();
                reportDeviceInfo$notifyCloudBound$1.L$0 = reportDeviceInfo3;
                reportDeviceInfo$notifyCloudBound$1.L$1 = h6eVar3;
                reportDeviceInfo$notifyCloudBound$1.L$2 = pairingData;
                reportDeviceInfo$notifyCloudBound$1.label = 2;
                if (oOBEDevice2.q(address2, reportDeviceInfo$notifyCloudBound$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Result.Companion companion2 = Result.INSTANCE;
            Object objNavigation = x0.d().b("/devicemanager/IAccountDeviceRequestService").navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.devicemanager.api.IAccountDeviceRequestService");
            AsyncResult<List<UserDeviceInfo>> asyncResultEa = ((IAccountDeviceRequestService) objNavigation).Ea();
            reportDeviceInfo$notifyCloudBound$1.L$0 = reportDeviceInfo;
            reportDeviceInfo$notifyCloudBound$1.L$1 = h6eVar2;
            reportDeviceInfo$notifyCloudBound$1.L$2 = variants;
            reportDeviceInfo$notifyCloudBound$1.label = 3;
            Object objB = asyncResultEa.b(reportDeviceInfo$notifyCloudBound$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            reportDeviceInfo2 = reportDeviceInfo;
            obj = objB;
            objM5287constructorimpl = Result.m5287constructorimpl((List) obj);
            thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                reportDeviceInfo2.b("queryUserDeviceListForCloud fail:" + thM5290exceptionOrNullimpl.getMessage());
                objM5287constructorimpl = gl4.managerApi.getBoundDeviceInfos();
            }
            list = (List) objM5287constructorimpl;
            h6eVar2.g(list);
            List<? extends UserDeviceInfo> list3 = list;
            reportDeviceInfo2.c("bondedDevices update after BindDevice -> " + CollectionsKt___CollectionsKt.joinToString$default(list3, null, null, null, 0, null, new Function1<UserDeviceInfo, CharSequence>() { // from class: com.heytap.health.oobe.setups.pair.ReportDeviceInfo$notifyCloudBound$2
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull UserDeviceInfo it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return it2.getDeviceName() + ":" + OOBELogKt.b(it2.getMac()) + "[" + it2.getSecondary() + "]";
                }
            }, 31, null));
            it = list3.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((UserDeviceInfo) next).getMac(), variants.getAddress()));
            Intrinsics.checkNotNull(next);
            h6eVar2.h(true);
            variants.setOobeState(11);
            i3dVar = i3d.INSTANCE;
            reportDeviceInfo$notifyCloudBound$1.L$0 = null;
            reportDeviceInfo$notifyCloudBound$1.L$1 = null;
            reportDeviceInfo$notifyCloudBound$1.L$2 = null;
            reportDeviceInfo$notifyCloudBound$1.label = 4;
            if (i3dVar.a(variants, (UserDeviceInfo) next, list, reportDeviceInfo$notifyCloudBound$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            reportDeviceInfo2 = reportDeviceInfo;
            Result.Companion companion3 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        h6eVar2 = h6eVar3;
        variants = pairingData;
        reportDeviceInfo = reportDeviceInfo3;
    }
}
