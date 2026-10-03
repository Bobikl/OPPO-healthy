package com.heytap.health.settings.watch.sporthealthsettings.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.lifesense.device.scale.infrastructure.protocol.UploadDeviceInformationRequest;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.q3;
import com.oplus.aiunit.vision.lki;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mzb;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\"\u0010&\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\"\u0010)\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\u001d¨\u0006,"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/t;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/b;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "c", "item", "", "deviceModel", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m$c;", "j", "k", "settings", "value", "", "modifyTime", "", "i", "Lcom/oplus/aiunit/vision/q3;", "g", "", "d", "Z", "o", "()Z", "setAutoStopAudioFileEnable", "(Z)V", "autoStopAudioFileEnable", "e", "getAutoCleanUpAudioFileEnable", "setAutoCleanUpAudioFileEnable", "autoCleanUpAudioFileEnable", "f", "getAudioFileKeepToCloudEnable", "setAudioFileKeepToCloudEnable", "audioFileKeepToCloudEnable", "getAutomaticSnoringMonitorEnable", "setAutomaticSnoringMonitorEnable", "automaticSnoringMonitorEnable", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class t extends b {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean autoStopAudioFileEnable = true;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean autoCleanUpAudioFileEnable = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean audioFileKeepToCloudEnable = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean automaticSnoringMonitorEnable;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            try {
                iArr[SportHealthSetting.OSA_ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportHealthSetting.SLEEP_APNEA_MONITORING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportHealthSetting.AUTO_STOP_AUDIO_FILE_ENABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportHealthSetting.AUTO_CLEAN_UP_AUDIO_FILE_ENABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportHealthSetting.AUDIO_FILE_KEEP_TO_CLOUD_ENABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportHealthSetting.AUTOMATIC_SNORING_MONITOR_ENABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.oplus.aiunit.model.q3
    @Nullable
    public MessageEvent b(@NotNull SportHealthSetting item, @NotNull String deviceModel) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        m8b.f(getTAG(), "build settings pb msg, setting name=" + k().name() + " value=" + byk.e(getSwitchEnable()));
        return mzb.T(getSwitchEnable(), e(deviceModel));
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.b, com.oplus.aiunit.model.q3
    @NotNull
    public List<SportHealthSetting> c() {
        return CollectionsKt.listOf(new SportHealthSetting[]{SportHealthSetting.OSA_ENABLE, SportHealthSetting.SLEEP_APNEA_MONITORING, SportHealthSetting.AUTO_STOP_AUDIO_FILE_ENABLE, SportHealthSetting.AUTO_CLEAN_UP_AUDIO_FILE_ENABLE, SportHealthSetting.AUDIO_FILE_KEEP_TO_CLOUD_ENABLE, SportHealthSetting.AUTOMATIC_SNORING_MONITOR_ENABLE});
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public q3 g() {
        return new t();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.b, com.oplus.aiunit.model.q3
    public void i(@NotNull SportHealthSetting settings, @NotNull String value, int modifyTime) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (a.$EnumSwitchMapping$0[settings.ordinal()]) {
            case 1:
            case 2:
                if (settings == k()) {
                    n(byk.w(value));
                    m(modifyTime);
                }
                break;
            case 3:
                this.autoStopAudioFileEnable = byk.w(value);
                break;
            case 4:
                this.autoCleanUpAudioFileEnable = byk.w(value);
                break;
            case 5:
                this.audioFileKeepToCloudEnable = byk.w(value);
                break;
            case 6:
                this.automaticSnoringMonitorEnable = byk.w(value);
                break;
            default:
                m8b.f(getTAG(), "unknown setting item = " + settings.name());
                break;
        }
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.b
    @Nullable
    public m.c j(@NotNull m deviceSettings) {
        Intrinsics.checkNotNullParameter(deviceSettings, UploadDeviceInformationRequest.kRequestParam_DeviceSettings);
        return deviceSettings.n();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings.bean.b
    @NotNull
    public SportHealthSetting k() {
        return lki.a(wl4.managerApi.getCurrActiveMac()).B7() ? SportHealthSetting.SLEEP_APNEA_MONITORING : SportHealthSetting.OSA_ENABLE;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getAutoStopAudioFileEnable() {
        return this.autoStopAudioFileEnable;
    }
}