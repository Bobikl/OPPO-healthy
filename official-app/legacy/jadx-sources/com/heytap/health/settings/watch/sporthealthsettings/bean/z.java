package com.heytap.health.settings.watch.sporthealthsettings.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.log.formatter.LogFieldKey;
import com.lifesense.device.scale.infrastructure.protocol.UploadDeviceInformationRequest;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.duk;
import com.oplus.aiunit.vision.f7g;
import com.oplus.aiunit.vision.g7g;
import com.oplus.aiunit.vision.xxb;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0001H\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\"\u0010,\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\"\u00100\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#¨\u00063"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/z;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/AbsBaseSettingItem;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "d", "item", "", "deviceModel", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "Lcom/oplus/aiunit/vision/f7g;", "dbRepository", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SettingMergeResult;", b2n.g, "settings", "value", "", "modifyTime", "", MapSchema.FIELD_NAME_KEY, "i", "", "c", "Z", "n", "()Z", "setSpo2AllDayMonitorEnable", "(Z)V", "spo2AllDayMonitorEnable", "I", "getDayMonitorModifyTime", "()I", "setDayMonitorModifyTime", "(I)V", "dayMonitorModifyTime", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.LEVEL_KEY, "setLowSpo2WarningEnable", "lowSpo2WarningEnable", "f", "getWarningModifyTime", "setWarningModifyTime", "warningModifyTime", b2n.f, LogFieldKey.MESSAGE_KEY, "setLowSpo2WarningValue", "lowSpo2WarningValue", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class z extends AbsBaseSettingItem {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int dayMonitorModifyTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int warningModifyTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean spo2AllDayMonitorEnable = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean lowSpo2WarningEnable = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
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

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.AbsBaseSettingItem
    @Nullable
    public MessageEvent b(@NotNull SportHealthSetting item, @NotNull String deviceModel) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        int i = a.$EnumSwitchMapping$0[item.ordinal()];
        if (i == 1) {
            a7b.f(getTAG(), "build settings pb msg, setting name=SPO2_ALL_DAY_MONITOR_ENABLE value=" + duk.e(this.spo2AllDayMonitorEnable));
            return xxb.g0(this.spo2AllDayMonitorEnable, g(deviceModel));
        }
        if (i != 2 && i != 3) {
            return null;
        }
        a7b.f(getTAG(), "build settings pb msg, setting name=LOW_SPO2_WARNING_ENABLE value=" + duk.e(this.lowSpo2WarningEnable) + " name=SPO2_WARNING_VALUE value=" + this.lowSpo2WarningValue);
        return xxb.h0(this.lowSpo2WarningEnable, this.lowSpo2WarningValue, g(deviceModel));
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.AbsBaseSettingItem
    @NotNull
    public List<SportHealthSetting> d() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new SportHealthSetting[]{SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE, SportHealthSetting.LOW_SPO2_WARNING_ENABLE, SportHealthSetting.SPO2_WARNING_VALUE});
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.AbsBaseSettingItem
    @NotNull
    public SettingMergeResult h(@NotNull m deviceSettings, @NotNull f7g dbRepository) {
        Intrinsics.checkNotNullParameter(deviceSettings, "deviceSettings");
        Intrinsics.checkNotNullParameter(dbRepository, "dbRepository");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m.a0 a0VarT = deviceSettings.t();
        if (a0VarT != null) {
            int iA = a0VarT.a();
            boolean z = a0VarT.c() != this.spo2AllDayMonitorEnable;
            if (iA != 0 && iA >= this.dayMonitorModifyTime) {
                a7b.f(getTAG(), "Device Spo2AllDayMonitor setting modify time is large than local");
                if (z) {
                    this.spo2AllDayMonitorEnable = a0VarT.c();
                    SportHealthSetting sportHealthSetting = SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE;
                    arrayList2.add(sportHealthSetting);
                    dbRepository.d0(sportHealthSetting, duk.o(a0VarT.b()), ((long) iA) * 1000, g7g.INSTANCE.c(sportHealthSetting));
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
                a7b.f(getTAG(), "Device Spo2LowWarning setting modify time is large than local");
                this.lowSpo2WarningEnable = c0VarU.c();
                SportHealthSetting sportHealthSetting2 = SportHealthSetting.LOW_SPO2_WARNING_ENABLE;
                arrayList2.add(sportHealthSetting2);
                String strO = duk.o(c0VarU.b());
                long j2 = 1000 * ((long) iA2);
                g7g.Companion companion = g7g.INSTANCE;
                dbRepository.d0(sportHealthSetting2, strO, j2, companion.c(sportHealthSetting2));
                if (c0VarU.d() <= 0 || !z3) {
                    a7b.f(getTAG(), "Device Spo2LowWarning from device is " + c0VarU.d());
                } else {
                    this.lowSpo2WarningValue = c0VarU.d();
                    SportHealthSetting sportHealthSetting3 = SportHealthSetting.SPO2_WARNING_VALUE;
                    arrayList2.add(sportHealthSetting3);
                    dbRepository.d0(sportHealthSetting3, duk.o(c0VarU.d()), j2, companion.c(sportHealthSetting3));
                }
            } else if (z2 || z3) {
                arrayList.add(SportHealthSetting.LOW_SPO2_WARNING_ENABLE);
            }
        }
        return new SettingMergeResult(arrayList, arrayList2);
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.AbsBaseSettingItem
    @NotNull
    public AbsBaseSettingItem i() {
        return new z();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.AbsBaseSettingItem
    public void k(@NotNull SportHealthSetting settings, @NotNull String value, int modifyTime) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(value, "value");
        int i = a.$EnumSwitchMapping$0[settings.ordinal()];
        if (i == 1) {
            this.spo2AllDayMonitorEnable = duk.w(value);
            this.dayMonitorModifyTime = modifyTime;
            return;
        }
        if (i == 2) {
            this.lowSpo2WarningEnable = duk.w(value);
            this.warningModifyTime = modifyTime;
        } else {
            if (i == 3) {
                this.lowSpo2WarningValue = duk.u(value);
                return;
            }
            a7b.f(getTAG(), "unknown setting item = " + settings.name());
        }
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getLowSpo2WarningEnable() {
        return this.lowSpo2WarningEnable;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getLowSpo2WarningValue() {
        return this.lowSpo2WarningValue;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getSpo2AllDayMonitorEnable() {
        return this.spo2AllDayMonitorEnable;
    }
}
