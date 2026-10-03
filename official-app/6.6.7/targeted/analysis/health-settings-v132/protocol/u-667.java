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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0001H\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010+\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"¨\u0006."}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/u;", "Lcom/oplus/aiunit/vision/q3;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "c", "item", "", "deviceModel", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "Lcom/oplus/aiunit/vision/oag;", "dbRepository", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SettingMergeResult;", "f", "settings", "value", "", "modifyTime", "", "i", "g", "", "Z", "l", "()Z", "setQuietRateNotificationEnable", "(Z)V", "quietRateNotificationEnable", "I", "k", "()I", "setQuietHeartRateValue", "(I)V", "quietHeartRateValue", "d", "j", "setQuietHeartRateLowValue", "quietHeartRateLowValue", "e", "getLocalModifyTime", "setLocalModifyTime", "localModifyTime", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class u extends q3 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean quietRateNotificationEnable = true;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int quietHeartRateValue = 120;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int quietHeartRateLowValue = 45;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int localModifyTime;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            try {
                iArr[SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportHealthSetting.QUIET_RATE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportHealthSetting.QUIET_RATE_LOW_VALUE.ordinal()] = 3;
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
        m8b.f(getTAG(), "build settings pb msg, setting name=QUIET_RATE_NOTIFICATION_ENABLE value=" + byk.e(this.quietRateNotificationEnable) + " name=QUIET_RATE_VALUE value=" + this.quietHeartRateValue + " name=QUIET_RATE_LOW_VALUE value=" + this.quietHeartRateLowValue);
        return mzb.Y(this.quietRateNotificationEnable, this.quietHeartRateValue, this.quietHeartRateLowValue, e(deviceModel));
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public List<SportHealthSetting> c() {
        return CollectionsKt.listOf(new SportHealthSetting[]{SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE, SportHealthSetting.QUIET_RATE_VALUE, SportHealthSetting.QUIET_RATE_LOW_VALUE});
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public SettingMergeResult f(@NotNull m deviceSettings, @NotNull oag dbRepository) {
        Intrinsics.checkNotNullParameter(deviceSettings, UploadDeviceInformationRequest.kRequestParam_DeviceSettings);
        Intrinsics.checkNotNullParameter(dbRepository, "dbRepository");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m.x xVarO = deviceSettings.o();
        if (xVarO != null) {
            int iA = xVarO.a();
            boolean z = xVarO.c() != this.quietRateNotificationEnable;
            boolean z2 = xVarO.d() != this.quietHeartRateValue;
            boolean z3 = xVarO.e() != this.quietHeartRateLowValue;
            if (iA != 0 && iA >= this.localModifyTime) {
                m8b.f(getTAG(), "Device quiet heart rate setting modify time is large than local");
                if (z) {
                    this.quietRateNotificationEnable = xVarO.c();
                    SportHealthSetting sportHealthSetting = SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE;
                    arrayList2.add(sportHealthSetting);
                    dbRepository.v0(sportHealthSetting, byk.o(xVarO.b()), ((long) iA) * 1000, pag.INSTANCE.c(sportHealthSetting));
                }
                if (xVarO.d() <= 0 || !z2) {
                    m8b.f(getTAG(), "Quiet heart rate from device, highValue = " + xVarO.d());
                } else {
                    this.quietHeartRateValue = xVarO.d();
                    SportHealthSetting sportHealthSetting2 = SportHealthSetting.QUIET_RATE_VALUE;
                    arrayList2.add(sportHealthSetting2);
                    dbRepository.v0(sportHealthSetting2, byk.o(xVarO.d()), ((long) iA) * 1000, pag.INSTANCE.c(sportHealthSetting2));
                }
                if (xVarO.e() <= 0 || !z3) {
                    m8b.f(getTAG(), "Quiet heart rate from device, lowValue = " + xVarO.e());
                } else {
                    this.quietHeartRateLowValue = xVarO.e();
                    SportHealthSetting sportHealthSetting3 = SportHealthSetting.QUIET_RATE_LOW_VALUE;
                    arrayList2.add(sportHealthSetting3);
                    dbRepository.v0(sportHealthSetting3, byk.o(xVarO.e()), ((long) iA) * 1000, pag.INSTANCE.c(sportHealthSetting3));
                }
            } else if (z || z2 || z3) {
                arrayList.add(SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE);
            }
        }
        return new SettingMergeResult(arrayList, arrayList2);
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public q3 g() {
        return new u();
    }

    @Override // com.oplus.aiunit.model.q3
    public void i(@NotNull SportHealthSetting settings, @NotNull String value, int modifyTime) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(value, "value");
        int i = a.$EnumSwitchMapping$0[settings.ordinal()];
        if (i == 1) {
            this.quietRateNotificationEnable = byk.w(value);
            this.localModifyTime = modifyTime;
            return;
        }
        if (i == 2) {
            this.quietHeartRateValue = byk.u(value);
            return;
        }
        if (i == 3) {
            this.quietHeartRateLowValue = byk.u(value);
            return;
        }
        m8b.f(getTAG(), "unknown setting item = " + settings.name());
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getQuietHeartRateLowValue() {
        return this.quietHeartRateLowValue;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getQuietHeartRateValue() {
        return this.quietHeartRateValue;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getQuietRateNotificationEnable() {
        return this.quietRateNotificationEnable;
    }
}