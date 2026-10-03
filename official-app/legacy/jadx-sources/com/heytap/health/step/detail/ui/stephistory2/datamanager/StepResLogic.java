package com.heytap.health.step.detail.ui.stephistory2.datamanager;

import android.content.Context;
import android.util.ArrayMap;
import androidx.appcompat.app.AlertDialog;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.step.detail.ui.stephistory2.net.MobileMsgBean;
import com.heytap.health.step.detail.ui.stephistory2.view.StepResItemView;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gti;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.ou6;
import com.oplus.aiunit.vision.pq;
import com.oplus.aiunit.vision.qbm;
import com.oplus.aiunit.vision.t04;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.wq8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\u00020\u0001:\u0002,2B\u0007¢\u0006\u0004\b/\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0016\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J#\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0018J\u001b\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u0004H\u0002J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u000f2\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\b\u0010)\u001a\u00020\u0004H\u0002J\u0016\u0010*\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/datamanager/StepResLogic;", "", "Landroid/content/Context;", "context", "", "o", "", "pw", "data", LogFieldKey.LEVEL_KEY, "dataClient", "r", "", "Lcom/heytap/health/step/detail/ui/stephistory2/net/MobileMsgBean;", "mobileList", "", "n", "deviceList", LogFieldKey.MESSAGE_KEY, "Landroidx/appcompat/app/AlertDialog;", "kotlin.jvm.PlatformType", "A", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", t04.DEVICE_UNIQUE_ID, "w", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/step/detail/ui/stephistory2/view/StepResItemView;", "q", "mobileMsgBean", "s", "(Lcom/heytap/health/step/detail/ui/stephistory2/net/MobileMsgBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "x", "ssoid", "", "t", "(Ljava/lang/String;)Ljava/lang/Long;", "v", "(Ljava/lang/String;)Ljava/lang/Boolean;", "y", LogFieldKey.PROCESS_NAME_KEY, "Lkotlinx/coroutines/CoroutineExceptionHandler;", "a", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler", "<init>", "()V", "Companion", "DeviceType", "step_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepResLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepResLogic.kt\ncom/heytap/health/step/detail/ui/stephistory2/datamanager/StepResLogic\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n48#2,4:341\n766#3:345\n857#3,2:346\n766#3:348\n857#3,2:349\n766#3:351\n857#3,2:352\n1747#3,3:354\n1549#3:357\n1620#3,3:358\n1747#3,3:361\n1549#3:364\n1620#3,3:365\n1747#3,3:368\n*S KotlinDebug\n*F\n+ 1 StepResLogic.kt\ncom/heytap/health/step/detail/ui/stephistory2/datamanager/StepResLogic\n*L\n64#1:341,4\n131#1:345\n131#1:346,2\n138#1:348\n138#1:349,2\n139#1:351\n139#1:352,2\n140#1:354,3\n144#1:357\n144#1:358,3\n146#1:361,3\n149#1:364\n149#1:365,3\n328#1:368,3\n*E\n"})
public final class StepResLogic {

    @NotNull
    public static final ArrayMap<String, String> b = new ArrayMap<>();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineExceptionHandler exceptionHandler = new b(CoroutineExceptionHandler.INSTANCE);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/datamanager/StepResLogic$DeviceType;", "", "deviceType", "", "(Ljava/lang/String;II)V", "getDeviceType", "()I", Const.Callback.NetworkState.NetworkType.NETWORK_MOBILE, "WATCH", "step_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum DeviceType {
        MOBILE(0),
        WATCH(1);

        private final int deviceType;

        DeviceType(int i) {
            this.deviceType = i;
        }

        public final int getDeviceType() {
            return this.deviceType;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 StepResLogic.kt\ncom/heytap/health/step/detail/ui/stephistory2/datamanager/StepResLogic\n*L\n1#1,110:1\n65#2,2:111\n*E\n"})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            a7b.b("StepDetailResLogic", "StepResLogic error:" + exception.getMessage());
        }
    }

    public final Object A(Context context, Continuation<? super AlertDialog> continuation) {
        return BuildersKt.withContext(wq8.INSTANCE.f(), new StepResLogic$showThirdDialog$2(this, context, null), continuation);
    }

    public final String l(String pw, String data) {
        try {
            String strI = pq.i(pw, data);
            Intrinsics.checkNotNullExpressionValue(strI, "{\n            AesUtils.d…domIv(pw, data)\n        }");
            return strI;
        } catch (Exception e2) {
            a7b.b("StepDetailResLogic", "aesCtrDecrypt e: " + e2.getMessage());
            return data;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    public final boolean m(List<MobileMsgBean> deviceList) {
        boolean z;
        boolean z2;
        boolean z3;
        List<MobileMsgBean> list = deviceList;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((MobileMsgBean) next).getDeviceType() == DeviceType.MOBILE.getDeviceType()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((MobileMsgBean) obj).getDeviceType() == DeviceType.WATCH.getDeviceType()) {
                arrayList2.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            MobileMsgBean mobileMsgBean = (MobileMsgBean) it2.next();
            String displayName = mobileMsgBean.getDisplayName();
            if (displayName == null || displayName.length() == 0) {
                z = true;
            } else {
                String mobileUniqueId = mobileMsgBean.getMobileUniqueId();
                if (mobileUniqueId == null || mobileUniqueId.length() == 0) {
                    z = true;
                } else {
                    String manufacturer = mobileMsgBean.getManufacturer();
                    if (manufacturer == null || manufacturer.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (z) {
                z2 = true;
                break;
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((MobileMsgBean) it3.next()).getDisplayName());
        }
        a7b.f("StepDetailResLogic", "checkIfMobileMsgError mobile msg error:" + arrayList3);
        if (z2) {
            return true;
        }
        if (arrayList2.isEmpty()) {
            z3 = false;
            break;
        }
        Iterator it4 = arrayList2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z3 = false;
                break;
            }
            String displayName2 = ((MobileMsgBean) it4.next()).getDisplayName();
            if (displayName2 == null || displayName2.length() == 0) {
                z3 = true;
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((MobileMsgBean) it5.next()).getDisplayName());
        }
        a7b.f("StepDetailResLogic", "checkIfMobileMsgError watch msg error:" + arrayList4);
        return z3;
    }

    public final boolean n(List<MobileMsgBean> mobileList) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = mobileList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((MobileMsgBean) next).getDeviceType() == DeviceType.MOBILE.getDeviceType()) {
                arrayList.add(next);
            }
        }
        return arrayList.size() > 1;
    }

    public final void o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f("StepDetailResLogic", "checkIfNeedShowMultiResDialog");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), this.exceptionHandler, null, new StepResLogic$checkIfNeedShowMultiResDialog$1(this, context, null), 2, null);
    }

    public final boolean p(List<MobileMsgBean> mobileList) {
        List<MobileMsgBean> list = mobileList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (MobileMsgBean mobileMsgBean : list) {
            if ((mobileMsgBean.getDeviceType() != DeviceType.MOBILE.getDeviceType() || StringsKt__StringsJVMKt.equals(mobileMsgBean.getManufacturer(), qbm.b, true) || StringsKt__StringsJVMKt.equals(mobileMsgBean.getManufacturer(), "realme", true) || StringsKt__StringsJVMKt.equals(mobileMsgBean.getManufacturer(), "oneplus", true)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public final Object q(Context context, List<MobileMsgBean> list, Continuation<? super List<? extends StepResItemView>> continuation) {
        return BuildersKt.withContext(wq8.INSTANCE.e(), new StepResLogic$decorateDeviceItemView$2(list, context, this, null), continuation);
    }

    public final String r(String dataClient) {
        if (dataClient == null || dataClient.length() == 0) {
            return "";
        }
        ArrayMap<String, String> arrayMap = b;
        String str = arrayMap.get(dataClient);
        if (str == null || str.length() == 0) {
            arrayMap.put(dataClient, l(new ou6(null).l(), dataClient));
        }
        String str2 = arrayMap.get(dataClient);
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(MobileMsgBean mobileMsgBean, Continuation<? super String> continuation) {
        StepResLogic$getDeviceName$1 stepResLogic$getDeviceName$1;
        if (continuation instanceof StepResLogic$getDeviceName$1) {
            stepResLogic$getDeviceName$1 = (StepResLogic$getDeviceName$1) continuation;
            int i = stepResLogic$getDeviceName$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepResLogic$getDeviceName$1.label = i - Integer.MIN_VALUE;
            } else {
                stepResLogic$getDeviceName$1 = new StepResLogic$getDeviceName$1(this, continuation);
            }
        } else {
            stepResLogic$getDeviceName$1 = new StepResLogic$getDeviceName$1(this, continuation);
        }
        Object objW = stepResLogic$getDeviceName$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepResLogic$getDeviceName$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objW);
            if (mobileMsgBean.getDeviceType() == DeviceType.MOBILE.getDeviceType()) {
                String displayName = mobileMsgBean.getDisplayName();
                return displayName == null ? "" : displayName;
            }
            String mobileUniqueId = mobileMsgBean.getMobileUniqueId();
            stepResLogic$getDeviceName$1.label = 1;
            objW = w(mobileUniqueId, stepResLogic$getDeviceName$1);
            if (objW == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objW);
        }
        String str = (String) objW;
        return str == null ? "" : str;
    }

    public final Long t(String ssoid) {
        String strD = gti.d();
        if (strD == null || strD.length() == 0) {
            a7b.f("StepDetailResLogic", "getDialogLastShowTime has no record");
            return null;
        }
        String str = (String) GsonUtil.d(strD, String.class, String.class).get(ssoid);
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public final boolean u() {
        String ssoid = v9g.w().D("user_ssoid");
        Intrinsics.checkNotNullExpressionValue(ssoid, "ssoid");
        Long lT = t(ssoid);
        a7b.f("StepDetailResLogic", "lastShowTime:" + lT);
        if (lT != null) {
            long jLongValue = lT.longValue();
            if (Intrinsics.areEqual(o05.D(jLongValue), LocalDate.now())) {
                a7b.f("StepDetailResLogic", "today has show dialog");
                return false;
            }
            if (Intrinsics.areEqual(v(ssoid), Boolean.TRUE)) {
                LocalDate localDateNow = LocalDate.now();
                Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
                LocalDate localDateD = o05.D(jLongValue);
                LocalDate localDatePlusDays = o05.D(jLongValue).plusDays(30L);
                Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "userLastShowTime.toLocalDate().plusDays(30)");
                return !com.heytap.health.step.detail.ui.stephistory2.datamanager.b.e(localDateNow, localDateD, localDatePlusDays);
            }
        }
        return true;
    }

    public final Boolean v(String ssoid) {
        String strA = gti.a();
        if (!(strA == null || strA.length() == 0)) {
            return (Boolean) GsonUtil.d(strA, String.class, Boolean.TYPE).get(ssoid);
        }
        a7b.f("StepDetailResLogic", "hasUserClickNoRemind has no record");
        return null;
    }

    public final Object w(String str, Continuation<? super String> continuation) {
        return BuildersKt.withContext(wq8.INSTANCE.e(), new StepResLogic$queryDeviceName$2(str, null), continuation);
    }

    public final void x() {
        a7b.f("StepDetailResLogic", "saveDialogShowTime");
        String ssoid = v9g.w().D("user_ssoid");
        Intrinsics.checkNotNullExpressionValue(ssoid, "ssoid");
        if (t(ssoid) == null) {
            HashMap map = new HashMap();
            map.put(ssoid, Long.valueOf(System.currentTimeMillis()));
            gti.i(GsonUtil.e(map));
        } else {
            HashMap oriResMap = GsonUtil.d(gti.d(), String.class, String.class);
            Intrinsics.checkNotNullExpressionValue(oriResMap, "oriResMap");
            oriResMap.put(ssoid, String.valueOf(System.currentTimeMillis()));
            gti.i(GsonUtil.e(oriResMap));
        }
    }

    public final void y() {
        a7b.f("StepDetailResLogic", "saveUserClickNoRemind");
        String ssoid = v9g.w().D("user_ssoid");
        Intrinsics.checkNotNullExpressionValue(ssoid, "ssoid");
        if (v(ssoid) == null) {
            HashMap map = new HashMap();
            map.put(ssoid, Boolean.TRUE);
            gti.g(GsonUtil.e(map));
        } else {
            HashMap oriResMap = GsonUtil.d(gti.a(), String.class, Boolean.TYPE);
            Intrinsics.checkNotNullExpressionValue(oriResMap, "oriResMap");
            oriResMap.put(ssoid, Boolean.TRUE);
            gti.i(GsonUtil.e(oriResMap));
        }
    }

    public final Object z(Context context, List<MobileMsgBean> list, Continuation<? super AlertDialog> continuation) {
        return BuildersKt.withContext(wq8.INSTANCE.f(), new StepResLogic$showResDialog$2(this, context, list, null), continuation);
    }
}
