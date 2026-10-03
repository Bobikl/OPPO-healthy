package com.heytap.health.settings.watch.sporthealthsettings.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.lifesense.device.scale.infrastructure.protocol.UploadDeviceInformationRequest;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.oag;
import com.oplus.aiunit.model.pag;
import com.oplus.aiunit.model.q3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mzb;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0001H\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\"\u0010+\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\"\u0010.\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"¨\u00061"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/z;", "Lcom/oplus/aiunit/vision/q3;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "c", "item", "", "deviceModel", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "Lcom/oplus/aiunit/vision/oag;", "dbRepository", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SettingMergeResult;", "f", "settings", "value", "", "modifyTime", "", "i", "g", "", "Z", "l", "()Z", "setSpo2AllDayMonitorEnable", "(Z)V", "spo2AllDayMonitorEnable", "I", "getDayMonitorModifyTime", "()I", "setDayMonitorModifyTime", "(I)V", "dayMonitorModifyTime", "d", "j", "setLowSpo2WarningEnable", "lowSpo2WarningEnable", "e", "getWarningModifyTime", "setWarningModifyTime", "warningModifyTime", "k", "setLowSpo2WarningValue", "lowSpo2WarningValue", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class z extends q3 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int dayMonitorModifyTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int warningModifyTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean spo2AllDayMonitorEnable = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean lowSpo2WarningEnable = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int lowSpo2WarningValue = 90;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            try {
                iArr[SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportHealthSetting.LOW_SPO2_WARNING_ENABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportHealthSetting.SPO2_WARNING_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.oplus.aiunit.model.q3
    @Nullable
    public MessageEvent b(@NotNull SportHealthSetting item, @NotNull String deviceModel) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        int i = a.$EnumSwitchMapping$0[item.ordinal()];
        if (i == 1) {
            m8b.f(getTAG(), "build settings pb msg, setting name=SPO2_ALL_DAY_MONITOR_ENABLE value=" + byk.e(this.spo2AllDayMonitorEnable));
            return mzb.g0(this.spo2AllDayMonitorEnable, e(deviceModel));
        }
        if (i != 2 && i != 3) {
            return null;
        }
        m8b.f(getTAG(), "build settings pb msg, setting name=LOW_SPO2_WARNING_ENABLE value=" + byk.e(this.lowSpo2WarningEnable) + " name=SPO2_WARNING_VALUE value=" + this.lowSpo2WarningValue);
        return mzb.h0(this.lowSpo2WarningEnable, this.lowSpo2WarningValue, e(deviceModel));
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public List<SportHealthSetting> c() {
        return CollectionsKt.listOf(new SportHealthSetting[]{SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE, SportHealthSetting.LOW_SPO2_WARNING_ENABLE, SportHealthSetting.SPO2_WARNING_VALUE});
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public SettingMergeResult f(@NotNull m deviceSettings, @NotNull oag dbRepository) {
        Intrinsics.checkNotNullParameter(deviceSettings, UploadDeviceInformationRequest.kRequestParam_DeviceSettings);
        Intrinsics.checkNotNullParameter(dbRepository, "dbRepository");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m.a0 a0VarT = deviceSettings.t();
        if (a0VarT != null) {
            int iA = a0VarT.a();
            boolean z = a0VarT.c() != this.spo2AllDayMonitorEnable;
            if (iA != 0 && iA >= this.dayMonitorModifyTime) {
                m8b.f(getTAG(), "Device Spo2AllDayMonitor setting modify time is large than local");
                if (z) {
                    this.spo2AllDayMonitorEnable = a0VarT.c();
                    SportHealthSetting sportHealthSetting = SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE;
                    arrayList2.add(sportHealthSetting);
                    dbRepository.v0(sportHealthSetting, byk.o(a0VarT.b()), ((long) iA) * 1000, pag.INSTANCE.c(sportHealthSetting));
                }
            } else if (z) {
                arrayList.add(SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE);
            }
        }
        m.c0 c0VarU = deviceSettings.u();
        if (c0VarU != null) {
            int iA2 = c0VarU.a();
            boolean z2 = c0VarU.c() != this.lowSpo2WarningEnable;
            boolean z3 = c0VarU.d() != this.lowSpo2WarningValue;
            if (iA2 != 0 && iA2 >= this.warningModifyTime && z2) {
                m8b.f(getTAG(), "Device Spo2LowWarning setting modify time is large than local");
                this.lowSpo2WarningEnable = c0VarU.c();
                SportHealthSetting sportHealthSetting2 = SportHealthSetting.LOW_SPO2_WARNING_ENABLE;
                arrayList2.add(sportHealthSetting2);
                String strO = byk.o(c0VarU.b());
                long j = 1000 * ((long) iA2);
                pag.Companion companion = pag.INSTANCE;
                dbRepository.v0(sportHealthSetting2, strO, j, companion.c(sportHealthSetting2));
                if (c0VarU.d() <= 0 || !z3) {
                    m8b.f(getTAG(), "Device Spo2LowWarning from device is " + c0VarU.d());
                } else {
                    this.lowSpo2WarningValue = c0VarU.d();
                    SportHealthSetting sportHealthSetting3 = SportHealthSetting.SPO2_WARNING_VALUE;
                    arrayList2.add(sportHealthSetting3);
                    dbRepository.v0(sportHealthSetting3, byk.o(c0VarU.d()), j, companion.c(sportHealthSetting3));
                }
            } else if (z2 || z3) {
                arrayList.add(SportHealthSetting.LOW_SPO2_WARNING_ENABLE);
            }
        }
        return new SettingMergeResult(arrayList, arrayList2);
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public q3 g() {
        return new z();
    }

    @Override // com.oplus.aiunit.model.q3
    public void i(@NotNull SportHealthSetting settings, @NotNull String value, int modifyTime) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(value, "value");
        int i = a.$EnumSwitchMapping$0[settings.ordinal()];
        if (i == 1) {
            this.spo2AllDayMonitorEnable = byk.w(value);
            this.dayMonitorModifyTime = modifyTime;
            return;
        }
        if (i == 2) {
            this.lowSpo2WarningEnable = byk.w(value);
            this.warningModifyTime = modifyTime;
        } else {
            if (i == 3) {
                this.lowSpo2WarningValue = byk.u(value);
                return;
            }
            m8b.f(getTAG(), "unknown setting item = " + settings.name());
        }
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getLowSpo2WarningEnable() {
        return this.lowSpo2WarningEnable;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getLowSpo2WarningValue() {
        return this.lowSpo2WarningValue;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getSpo2AllDayMonitorEnable() {
        return this.spo2AllDayMonitorEnable;
    }
}