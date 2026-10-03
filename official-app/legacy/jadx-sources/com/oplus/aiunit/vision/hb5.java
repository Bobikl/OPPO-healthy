package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.devicemanagerimpl.manager.AccountDeviceRequestManager;
import com.heytap.health.devicemanagerimpl.manager.BTStateChangeReceiver;
import com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager;
import com.heytap.health.devicemanagerimpl.processor.DevicePushManager;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import com.tencent.open.utils.HttpUtils;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J4\u0010\u0014\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/hb5;", "", "", "d", "", EngineConstant.REASON, "j", "", "queryCloud", MapSchema.FIELD_NAME_KEY, "fromCache", b2n.f, "f", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "userDeviceInfos", "Lcom/oplus/aiunit/vision/g4j;", "supportedModels", "Lcom/oplus/aiunit/vision/sjk;", "updateType", LogFieldKey.LEVEL_KEY, "reasonLoginSuccess", "Ljava/lang/String;", "a", "Z", "getAlreadyGetDevice", "()Z", "i", "(Z)V", "alreadyGetDevice", "Lcom/heytap/health/oaf/event/a$c;", "b", "Lcom/heytap/health/oaf/event/a$c;", "mObtainDeviceInfo", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceBusinessManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceBusinessManager.kt\ncom/heytap/health/devicemanagerimpl/manager/DeviceBusinessManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"})
public final class hb5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static volatile boolean alreadyGetDevice = false;

    @NotNull
    public static final String reasonLoginSuccess = "account login success";

    @NotNull
    public static final hb5 INSTANCE = new hb5();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final com.heytap.health.oaf.event.a.c mObtainDeviceInfo = new com.heytap.health.oaf.event.a.c() { // from class: com.oplus.aiunit.vision.gb5
        @Override // com.heytap.health.oaf.event.a.c
        public final com.heytap.health.oaf.event.a.b a(String str) {
            return hb5.e(str);
        }
    };

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/hb5$a", "Lcom/heytap/health/devicemanagerimpl/processor/DevicePushManager$b;", "", "refresh", "", "a", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements DevicePushManager.b {
        @Override // com.heytap.health.devicemanagerimpl.processor.DevicePushManager.b
        public void a(boolean refresh) {
            if (refresh) {
                hb5.h(hb5.INSTANCE, "pushRefresh", false, 2, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/bvf;", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "it", "a", "(Lcom/oplus/aiunit/vision/bvf;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements d08 {
        public static final b<T, R> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<UserDeviceInfo> apply(@NotNull bvf<List<UserDeviceInfo>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.a(new ArrayList());
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/oplus/aiunit/vision/hb5$c", "Lcom/oplus/aiunit/vision/ao0;", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "result", "", "c", "", MapSchema.FIELD_NAME_ENTRY, "onError", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends ao0<List<? extends UserDeviceInfo>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f12091j;

        public c(String str) {
            this.f12091j = str;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull List<? extends UserDeviceInfo> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (!result.isEmpty()) {
                hb5 hb5Var = hb5.INSTANCE;
                hb5Var.i(true);
                hb5Var.l(result, CollectionsKt__CollectionsKt.emptyList(), this.f12091j + " and queryDeviceListFromCache", sjk.c.INSTANCE);
                return;
            }
            ml4.d("DeviceBusinessManager", "queryCacheDeviceList empty, return");
            gl4.managerApi.d(CollectionsKt__CollectionsKt.emptyList(), "datebase empty", sjk.c.INSTANCE);
            if (StringsKt__StringsKt.contains$default((CharSequence) this.f12091j, (CharSequence) hb5.reasonLoginSuccess, false, 2, (Object) null)) {
                hb5.INSTANCE.g("datebase empty," + this.f12091j, true);
            }
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(@NotNull Throwable e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            super.onError(e2);
            hb5.INSTANCE.g(this.f12091j + ",database error,query clound", true);
            ml4.c("DeviceBusinessManager", "queryDeviceListFromCache error:" + e2.getMessage());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/oplus/aiunit/vision/g4j;", "strings", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "userDeviceInfos", "Lcom/oplus/aiunit/vision/rh0;", "a", "(Ljava/util/List;Ljava/util/List;)Lcom/oplus/aiunit/vision/rh0;"}, k = 3, mv = {1, 8, 0})
    public static final class d<T1, T2, R> implements md1 {
        public static final d<T1, T2, R> INSTANCE = new d<>();

        @Override // com.oplus.aiunit.vision.md1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rh0 apply(@NotNull List<g4j> strings, @NotNull List<? extends UserDeviceInfo> userDeviceInfos) {
            Intrinsics.checkNotNullParameter(strings, "strings");
            Intrinsics.checkNotNullParameter(userDeviceInfos, "userDeviceInfos");
            rh0 rh0Var = new rh0();
            rh0Var.d(userDeviceInfos);
            rh0Var.c(strings);
            return rh0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/oplus/aiunit/vision/hb5$e", "Lcom/oplus/aiunit/vision/ao0;", "Lcom/oplus/aiunit/vision/rh0;", "result", "", "c", "", MapSchema.FIELD_NAME_ENTRY, "onError", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class e extends ao0<rh0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f12092j;
        public final /* synthetic */ boolean k;

        public e(String str, boolean z) {
            this.f12092j = str;
            this.k = z;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull rh0 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            List<UserDeviceInfo> userDeviceInfos = result.b();
            List<g4j> supportedModels = result.a();
            gl4.businessApi.k(false);
            if (np3.a(userDeviceInfos)) {
                ml4.c("DeviceBusinessManager", "onSuccess, result empty");
                gl4.managerApi.d(CollectionsKt__CollectionsKt.emptyList(), "push,device list is empty", sjk.a.INSTANCE);
                return;
            }
            hb5 hb5Var = hb5.INSTANCE;
            hb5Var.i(true);
            Intrinsics.checkNotNullExpressionValue(userDeviceInfos, "userDeviceInfos");
            Intrinsics.checkNotNullExpressionValue(supportedModels, "supportedModels");
            hb5Var.l(userDeviceInfos, supportedModels, this.f12092j + " and queryDeviceListFromCloud", sjk.a.INSTANCE);
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(@NotNull Throwable e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            super.onError(e2);
            ml4.c("DeviceBusinessManager", "queryDeviceListFromCloud error:" + e2.getMessage() + ",reason:" + this.f12092j);
            if (this.k) {
                return;
            }
            hb5.INSTANCE.f(this.f12092j);
        }
    }

    public static final com.heytap.health.oaf.event.a.b e(String str) {
        UserDeviceInfo boundDeviceInfoByMac = gl4.managerApi.getBoundDeviceInfoByMac(str);
        if (boundDeviceInfoByMac == null) {
            ml4.c("DeviceBusinessManager", "ObtainDeviceInfo error");
            return new com.heytap.health.oaf.event.a.b();
        }
        String deviceSn = boundDeviceInfoByMac.getDeviceSn();
        return new com.heytap.health.oaf.event.a.b(boundDeviceInfoByMac.getModel(), boundDeviceInfoByMac.getFirmwareVersion(), deviceSn);
    }

    public static /* synthetic */ void h(hb5 hb5Var, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hb5Var.g(str, z);
    }

    public final void d() {
        DevicePushManager devicePushManager = DevicePushManager.INSTANCE;
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        devicePushManager.e(contextA);
        devicePushManager.f(new a());
        BTStateChangeReceiver.a(b78.a());
        com.heytap.health.oaf.event.a.p().y(mObtainDeviceInfo);
        com.heytap.health.oaf.event.a.p().n();
    }

    public final void f(String reason) {
        DMLocalDeviceManager.INSTANCE.h().g().j0(b.INSTANCE).subscribe(new c(reason));
    }

    public final void g(@NotNull String reason, boolean fromCache) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        ml4.d("DeviceBusinessManager", " queryDeviceListFromCloud() fromCache:" + fromCache + " reason:" + reason);
        if (rpc.c()) {
            lbd.k1(pq5.n(), AccountDeviceRequestManager.INSTANCE.b(), d.INSTANCE).subscribe(new e(reason, fromCache));
            return;
        }
        ml4.c("DeviceBusinessManager", HttpUtils.NetworkUnavailableException.ERROR_INFO);
        if (fromCache) {
            return;
        }
        f(reason);
    }

    public final void i(boolean z) {
        alreadyGetDevice = z;
    }

    public final void j(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        k(reason, true);
    }

    public final void k(@NotNull String reason, boolean queryCloud) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        boolean zIsPairing = gl4.businessApi.isPairing();
        ml4.d("DeviceBusinessManager", "tryConnectOrGetDeviceList,reason:" + reason + ",alreadyGetDevice:" + alreadyGetDevice + ",pairing:" + zIsPairing);
        if (alreadyGetDevice) {
            gl4.managerApi.l(reason, true);
        } else {
            if (zIsPairing) {
                return;
            }
            if (queryCloud) {
                h(this, reason, false, 2, null);
            } else {
                f(reason);
            }
        }
    }

    public final void l(List<? extends UserDeviceInfo> userDeviceInfos, List<g4j> supportedModels, String reason, sjk updateType) {
        Object next;
        boolean zContains$default = StringsKt__StringsKt.contains$default((CharSequence) reason, (CharSequence) "queryDeviceListFromCache", false, 2, (Object) null);
        for (UserDeviceInfo userDeviceInfo : userDeviceInfos) {
            if (!supportedModels.isEmpty()) {
                Iterator<T> it = supportedModels.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((g4j) next).getModel(), userDeviceInfo.getModel()));
                if (next == null) {
                    ol4 ol4Var = gl4.managerApi;
                    String mac = userDeviceInfo.getMac();
                    Intrinsics.checkNotNullExpressionValue(mac, "info.mac");
                    ol4Var.setInterceptDevice(mac, true, "model " + userDeviceInfo.getModel() + " curr version not support");
                }
            }
            if (y5e.a(userDeviceInfo).B()) {
                if (zContains$default) {
                    ol4 ol4Var2 = gl4.managerApi;
                    String mac2 = userDeviceInfo.getMac();
                    Intrinsics.checkNotNullExpressionValue(mac2, "info.mac");
                    if (ol4Var2.interceptCacheExist(mac2)) {
                    }
                }
                ol4 ol4Var3 = gl4.managerApi;
                String mac3 = userDeviceInfo.getMac();
                Intrinsics.checkNotNullExpressionValue(mac3, "info.mac");
                ol4Var3.setInterceptDevice(mac3, !userDeviceInfo.isCurrTerminal(), "updateInfoAndRetryConnect check terminal");
            }
        }
        ol4 ol4Var4 = gl4.managerApi;
        ol4Var4.d(userDeviceInfos, reason, updateType);
        ol4Var4.c(reason);
    }
}
