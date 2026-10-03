package com.heytap.health.settings.watch.sporthealthsettings.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.lifesense.device.scale.infrastructure.protocol.UploadDeviceInformationRequest;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.oag;
import com.oplus.aiunit.model.pag;
import com.oplus.aiunit.model.q3;
import com.oplus.aiunit.vision.lki;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mzb;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0001H\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"¨\u0006*"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/g;", "Lcom/oplus/aiunit/vision/q3;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "c", "item", "", "deviceModel", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "Lcom/oplus/aiunit/vision/oag;", "dbRepository", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SettingMergeResult;", "f", "settings", "value", "", "modifyTime", "", "i", "g", "", "Z", "j", "()Z", "setAutoMeasureHeartRateEnable", "(Z)V", "autoMeasureHeartRateEnable", "I", "k", "()I", "setHeartRateInterval", "(I)V", "heartRateInterval", "d", "getLocalModifyTime", "setLocalModifyTime", "localModifyTime", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class g extends q3 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean autoMeasureHeartRateEnable = true;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int heartRateInterval;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int localModifyTime;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            try {
                iArr[SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportHealthSetting.HEART_RATE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.oplus.aiunit.model.q3
    @Nullable
    public MessageEvent b(@NotNull SportHealthSetting item, @NotNull String deviceModel) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        m8b.f(getTAG(), "build settings pb msg, setting name=AUTO_MEASURE_HEART_RATE_ENABLE value=" + byk.e(this.autoMeasureHeartRateEnable) + " name=HEART_RATE_TYPE value=" + this.heartRateInterval);
        return mzb.z(this.autoMeasureHeartRateEnable, this.heartRateInterval, e(deviceModel));
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public List<SportHealthSetting> c() {
        return CollectionsKt.listOf(new SportHealthSetting[]{SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE, SportHealthSetting.HEART_RATE_TYPE});
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public SettingMergeResult f(@NotNull m deviceSettings, @NotNull oag dbRepository) {
        int iD;
        Intrinsics.checkNotNullParameter(deviceSettings, UploadDeviceInformationRequest.kRequestParam_DeviceSettings);
        Intrinsics.checkNotNullParameter(dbRepository, "dbRepository");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m.u uVarM = deviceSettings.m();
        if (uVarM != null) {
            int iA = uVarM.a();
            boolean z = uVarM.c() != this.autoMeasureHeartRateEnable;
            boolean z2 = uVarM.d() != this.heartRateInterval;
            if (iA != 0 && iA >= this.localModifyTime) {
                m8b.f(getTAG(), "Device heart rate setting modify time is large than local");
                if (z) {
                    SportHealthSetting sportHealthSetting = SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE;
                    arrayList2.add(sportHealthSetting);
                    this.autoMeasureHeartRateEnable = uVarM.c();
                    dbRepository.v0(sportHealthSetting, byk.o(uVarM.b()), ((long) iA) * 1000, pag.INSTANCE.c(sportHealthSetting));
                }
                if (z2) {
                    UserDeviceInfo userDeviceInfoJ = wl4.managerApi.j();
                    if (lki.a(userDeviceInfoJ != null ? userDeviceInfoJ.getMac() : null).j7()) {
                        iD = byk.u(byk.l(SportHealthSetting.HEART_RATE_TYPE, userDeviceInfoJ != null ? userDeviceInfoJ.getModel() : null));
                    } else {
                        iD = uVarM.d();
                    }
                    this.heartRateInterval = iD;
                    SportHealthSetting sportHealthSetting2 = SportHealthSetting.HEART_RATE_TYPE;
                    arrayList2.add(sportHealthSetting2);
                    dbRepository.v0(sportHealthSetting2, byk.o(this.heartRateInterval), ((long) iA) * 1000, pag.INSTANCE.c(sportHealthSetting2));
                }
            } else if (z || z2) {
                arrayList.add(SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE);
            }
        }
        return new SettingMergeResult(arrayList, arrayList2);
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public q3 g() {
        return new g();
    }

    @Override // com.oplus.aiunit.model.q3
    public void i(@NotNull SportHealthSetting settings, @NotNull String value, int modifyTime) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(value, "value");
        int i = a.$EnumSwitchMapping$0[settings.ordinal()];
        if (i == 1) {
            this.autoMeasureHeartRateEnable = byk.w(value);
        } else if (i != 2) {
            m8b.f(getTAG(), "unknown setting item = " + settings.name());
        } else {
            this.heartRateInterval = byk.u(value);
        }
        this.localModifyTime = modifyTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getAutoMeasureHeartRateEnable() {
        return this.autoMeasureHeartRateEnable;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getHeartRateInterval() {
        return this.heartRateInterval;
    }
}