package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.device_settings.entity.DeviceParam;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.devicemanager.processor.bean.AppListBean;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings;
import com.heytap.health.settings.watch.sporthealthsettings2.SHSettingManager;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import com.oplus.aiunit.model.AppInstallBean;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.m4b;
import com.oplus.aiunit.model.m73;
import com.oplus.aiunit.model.v0h;
import com.oplus.aiunit.vision.cp5;
import com.oplus.aiunit.vision.eb5;
import com.oplus.aiunit.vision.lki;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mp5;
import com.oplus.aiunit.vision.nl4;
import com.oplus.aiunit.vision.wl4;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\bN\u0010OJ\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0014\u0010\u0012\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0013J\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001a\u001a\u00020\tH\u0016J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0010J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\tJ\u001e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00132\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!J\u001e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00132\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\tJ,\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00132\u0006\u0010\u001b\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020'0&H\u0016J\u0006\u0010*\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020!2\u0006\u0010+\u001a\u00020!J\b\u0010-\u001a\u00020\u0007H\u0014J\u0010\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.H\u0016J \u00104\u001a\u00020\u00072\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020!01j\b\u0012\u0004\u0012\u00020!`2H\u0016J\u0010\u00105\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.H\u0003J\u0012\u00106\u001a\u0004\u0018\u00010\u00152\u0006\u0010/\u001a\u00020.H\u0002R\u0014\u00109\u001a\u00020'8\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R$\u0010I\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010?R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "Lcom/oplus/aiunit/vision/v0h;", "Lcom/oplus/aiunit/vision/m4b;", "Lcom/oplus/aiunit/vision/eb5;", "Lcom/heytap/health/device_settings/entity/DeviceParam;", "param", "", "F", "", "onlyStepAndCalorie", "", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainAdapter$d;", "D", "K", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "items", "L", "Landroidx/lifecycle/MutableLiveData;", "E", "Lcom/oplus/aiunit/vision/ob0;", "z", "C", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;", "B", "G", "item", "I", "q", "r", "J", "H", "", "value", "v", "enable", "x", "", "", JsonResponse.PROTOCOL_JSON_KEY_DATA, "w", "N", "errorCode", "A", "onCleared", "Lcom/heytap/health/devicemanager/processor/bean/AppListBean;", "appListBean", "appListChange", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "set", "E3", "y", "M", "j", "Ljava/lang/String;", "TAG", "Lcom/heytap/health/settings/watch/sporthealthsettings2/SHSettingManager;", "k", "Lcom/heytap/health/settings/watch/sporthealthsettings2/SHSettingManager;", "settingManager", "l", "Landroidx/lifecycle/MutableLiveData;", "loadSettingResult", "m", "loadAllState", "n", "Lcom/heytap/health/device_settings/entity/DeviceParam;", "getDeviceParam", "()Lcom/heytap/health/device_settings/entity/DeviceParam;", "setDeviceParam", "(Lcom/heytap/health/device_settings/entity/DeviceParam;)V", "deviceParam", "o", "appInstallBean", "p", "Z", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSHSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SHSettingViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public class SHSettingViewModel extends BaseViewModel implements v0h, m4b, eb5 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public SHSettingManager settingManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public DeviceParam deviceParam;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean onlyStepAndCalorie;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "SHS-SHSettingViewModel";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<SportHealthSetting> loadSettingResult = new MutableLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> loadAllState = new MutableLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<AppInstallBean> appInstallBean = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingViewModel$a", "Lcom/oplus/aiunit/vision/m73;", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "settingType", "", "resultCode", "", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements m73 {
        public final /* synthetic */ MutableLiveData<Integer> a;

        public a(MutableLiveData<Integer> mutableLiveData) {
            this.a = mutableLiveData;
        }

        @Override // com.oplus.aiunit.model.m73
        public void a(@NotNull SportHealthSetting settingType, int resultCode) {
            Intrinsics.checkNotNullParameter(settingType, "settingType");
            this.a.postValue(Integer.valueOf(resultCode));
        }
    }

    public final int A(int errorCode) {
        int iY;
        if (errorCode == 2) {
            return R.string.settings_device_network_disconnect;
        }
        DeviceParam deviceParam = this.deviceParam;
        return (lki.a(deviceParam != null ? deviceParam.deviceMac : null).f() || (iY = mp5.a(wl4.managerApi.getCurrentConnectId()).Y(true)) == -1) ? com.heytap.health.base.R.string.lib_base_device_disconnected_retry_later : iY;
    }

    @NotNull
    public final DeviceSettings B() {
        SHSettingManager sHSettingManager = this.settingManager;
        if (sHSettingManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingManager");
            sHSettingManager = null;
        }
        return sHSettingManager.getDeviceSettings();
    }

    @NotNull
    public final MutableLiveData<Boolean> C() {
        return this.loadAllState;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @NotNull
    public final List<SHSettingMainAdapter.d> D(boolean onlyStepAndCalorie) {
        UserDeviceInfo userDeviceInfoJ;
        String mac;
        this.onlyStepAndCalorie = onlyStepAndCalorie;
        DeviceParam deviceParam = this.deviceParam;
        if (deviceParam != null) {
            Intrinsics.checkNotNull(deviceParam);
            if (TextUtils.isEmpty(deviceParam.deviceMac)) {
                userDeviceInfoJ = wl4.managerApi.j();
                if (userDeviceInfoJ != null) {
                    mac = userDeviceInfoJ.getMac();
                } else {
                    mac = null;
                }
            } else {
                DeviceParam deviceParam2 = this.deviceParam;
                Intrinsics.checkNotNull(deviceParam2);
                mac = deviceParam2.deviceMac;
            }
        } else {
            userDeviceInfoJ = wl4.managerApi.j();
            if (userDeviceInfoJ != null) {
                mac = userDeviceInfoJ.getMac();
            } else {
                mac = null;
            }
        }
        return lki.a(mac).n5(onlyStepAndCalorie);
    }

    @NotNull
    public final MutableLiveData<SportHealthSetting> E() {
        return this.loadSettingResult;
    }

    public void E3(@NotNull HashSet<Integer> set) {
        Intrinsics.checkNotNullParameter(set, "set");
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(16);
        set.add(17);
        set.add(19);
        set.add(28);
        set.add(24);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    public final void F(@Nullable DeviceParam param) {
        UserDeviceInfo userDeviceInfoJ;
        String str;
        String str2;
        AppInstallBean appInstallBeanM;
        this.deviceParam = param;
        if (param != null) {
            Intrinsics.checkNotNull(param);
            if (TextUtils.isEmpty(param.deviceMac)) {
                userDeviceInfoJ = wl4.managerApi.j();
                if (userDeviceInfoJ != null) {
                    String mac = userDeviceInfoJ.getMac();
                    Intrinsics.checkNotNullExpressionValue(mac, "deviceInfo.mac");
                    String model = userDeviceInfoJ.getModel();
                    Intrinsics.checkNotNullExpressionValue(model, "deviceInfo.model");
                    str2 = model;
                    str = mac;
                } else {
                    str = "";
                    str2 = "";
                }
            } else {
                DeviceParam deviceParam = this.deviceParam;
                Intrinsics.checkNotNull(deviceParam);
                str = deviceParam.deviceMac;
                Intrinsics.checkNotNullExpressionValue(str, "deviceParam!!.deviceMac");
                DeviceParam deviceParam2 = this.deviceParam;
                Intrinsics.checkNotNull(deviceParam2);
                str2 = deviceParam2.deviceModel;
                Intrinsics.checkNotNullExpressionValue(str2, "deviceParam!!.deviceModel");
            }
        } else {
            userDeviceInfoJ = wl4.managerApi.j();
            if (userDeviceInfoJ != null) {
                String mac2 = userDeviceInfoJ.getMac();
                Intrinsics.checkNotNullExpressionValue(mac2, "deviceInfo.mac");
                String model2 = userDeviceInfoJ.getModel();
                Intrinsics.checkNotNullExpressionValue(model2, "deviceInfo.model");
                str2 = model2;
                str = mac2;
            } else {
                str = "";
                str2 = "";
            }
        }
        SHSettingManager sHSettingManagerB = SHSettingManager.INSTANCE.b(str, str2);
        this.settingManager = sHSettingManagerB;
        SHSettingManager sHSettingManager = null;
        if (sHSettingManagerB == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingManager");
            sHSettingManagerB = null;
        }
        sHSettingManagerB.r(this);
        SHSettingManager sHSettingManager2 = this.settingManager;
        if (sHSettingManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingManager");
        } else {
            sHSettingManager = sHSettingManager2;
        }
        sHSettingManager.s(this);
        nl4 nl4Var = wl4.businessApi;
        nl4Var.f(this);
        AppListBean appListBeanFindDeviceAppListByMac = nl4Var.findDeviceAppListByMac(str);
        if (appListBeanFindDeviceAppListByMac == null || (appInstallBeanM = M(appListBeanFindDeviceAppListByMac)) == null) {
            return;
        }
        this.appInstallBean.postValue(appInstallBeanM);
    }

    public boolean G() {
        SHSettingManager sHSettingManager = this.settingManager;
        if (sHSettingManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingManager");
            sHSettingManager = null;
        }
        return sHSettingManager.F();
    }

    public final boolean H() {
        DeviceParam deviceParam = this.deviceParam;
        return cp5.b(deviceParam != null ? deviceParam.deviceModel : null).F3();
    }

    public final boolean I(@NotNull SportHealthSetting item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return (!J() || item == SportHealthSetting.ACTIVITY_PRAISE_NOTIFY_ENABLE || SHSettingManager.INSTANCE.c(item) || H()) ? false : true;
    }

    public final boolean J() {
        return wl4.managerApi.isStubModule();
    }

    public void K() {
        SHSettingManager sHSettingManager = this.settingManager;
        if (sHSettingManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingManager");
            sHSettingManager = null;
        }
        sHSettingManager.H();
    }

    public final void L(@NotNull Collection<? extends SportHealthSetting> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.isEmpty()) {
            return;
        }
        SHSettingManager sHSettingManager = this.settingManager;
        SHSettingManager sHSettingManager2 = null;
        if (sHSettingManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingManager");
            sHSettingManager = null;
        }
        sHSettingManager.s(this);
        SHSettingManager sHSettingManager3 = this.settingManager;
        if (sHSettingManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingManager");
        } else {
            sHSettingManager2 = sHSettingManager3;
        }
        sHSettingManager2.L(items);
    }

    public final AppInstallBean M(AppListBean appListBean) {
        DeviceParam deviceParam = this.deviceParam;
        String str = deviceParam != null ? deviceParam.deviceMac : null;
        if (str == null || !Intrinsics.areEqual(str, appListBean.getMac())) {
            return null;
        }
        HashSet installAppSet = appListBean.getInstallAppSet();
        return new AppInstallBean(installAppSet.contains(10), installAppSet.contains(11), installAppSet.contains(12), installAppSet.contains(16), installAppSet.contains(17), installAppSet.contains(19), installAppSet.contains(23), installAppSet.contains(24), installAppSet.contains(28));
    }

    public final void N() {
        SHSettingManager.INSTANCE.d();
    }

    public void appListChange(@NotNull AppListBean appListBean) {
        Intrinsics.checkNotNullParameter(appListBean, "appListBean");
        y(appListBean);
    }

    public void onCleared() {
        super.onCleared();
        SHSettingManager sHSettingManager = this.settingManager;
        SHSettingManager sHSettingManager2 = null;
        if (sHSettingManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingManager");
            sHSettingManager = null;
        }
        sHSettingManager.U(this);
        SHSettingManager sHSettingManager3 = this.settingManager;
        if (sHSettingManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingManager");
        } else {
            sHSettingManager2 = sHSettingManager3;
        }
        sHSettingManager2.T(this);
        wl4.businessApi.b(this);
    }

    @Override // com.oplus.aiunit.model.m4b
    public void q() {
        m8b.f(this.TAG, "onAllSettingLoadComplete");
        this.loadAllState.postValue(Boolean.TRUE);
    }

    @Override // com.oplus.aiunit.model.v0h
    public void r(@NotNull SportHealthSetting item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.loadSettingResult.postValue(item);
    }

    @NotNull
    public final MutableLiveData<Integer> v(@NotNull SportHealthSetting item, int value) {
        Intrinsics.checkNotNullParameter(item, "item");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strO = byk.o(value);
        Intrinsics.checkNotNullExpressionValue(strO, "intToString(value)");
        linkedHashMap.put(item, strO);
        return w(item, linkedHashMap);
    }

    @NotNull
    public MutableLiveData<Integer> w(@NotNull SportHealthSetting item, @NotNull Map<SportHealthSetting, String> data) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(data, JsonResponse.PROTOCOL_JSON_KEY_DATA);
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        if (I(item)) {
            m8b.b(this.TAG, "Device in power save mode, change setting fail");
            mutableLiveData.postValue(3);
            return mutableLiveData;
        }
        SHSettingManager sHSettingManager = this.settingManager;
        if (sHSettingManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingManager");
            sHSettingManager = null;
        }
        sHSettingManager.v(item, data, new a(mutableLiveData));
        return mutableLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> x(@NotNull SportHealthSetting item, boolean enable) {
        Intrinsics.checkNotNullParameter(item, "item");
        HashMap map = new HashMap();
        String strE = byk.e(enable);
        Intrinsics.checkNotNullExpressionValue(strE, "boolToString(enable)");
        map.put(item, strE);
        return w(item, map);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void y(AppListBean appListBean) {
        m8b.f(this.TAG, "app install list = " + appListBean);
        AppInstallBean appInstallBeanM = M(appListBean);
        if (appInstallBeanM != null) {
            this.appInstallBean.postValue(appInstallBeanM);
        }
    }

    @NotNull
    public final MutableLiveData<AppInstallBean> z() {
        return this.appInstallBean;
    }
}