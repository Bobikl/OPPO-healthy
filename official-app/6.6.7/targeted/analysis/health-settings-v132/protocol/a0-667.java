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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0001H\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010+\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\"\u0010.\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\"\u00101\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\"\u00105\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0018\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001c¨\u00068"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a0;", "Lcom/oplus/aiunit/vision/q3;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "c", "item", "", "deviceModel", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "Lcom/oplus/aiunit/vision/oag;", "dbRepository", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SettingMergeResult;", "f", "settings", "value", "", "modifyTime", "", "i", "g", "", "Z", "k", "()Z", "setOximetryEnable", "(Z)V", "oximetryEnable", "I", "l", "()I", "setOximetryType", "(I)V", "oximetryType", "d", "getLocalModifyTime", "setLocalModifyTime", "localModifyTime", "e", "j", "setAutoStopAudioFileEnable", "autoStopAudioFileEnable", "getAutoCleanUpAudioFileEnable", "setAutoCleanUpAudioFileEnable", "autoCleanUpAudioFileEnable", "getAudioFileKeepToCloudEnable", "setAudioFileKeepToCloudEnable", "audioFileKeepToCloudEnable", "h", "getAutomaticSnoringMonitorEnable", "setAutomaticSnoringMonitorEnable", "automaticSnoringMonitorEnable", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class a0 extends q3 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean oximetryEnable = true;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int oximetryType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int localModifyTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean autoStopAudioFileEnable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean autoCleanUpAudioFileEnable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean audioFileKeepToCloudEnable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean automaticSnoringMonitorEnable;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            try {
                iArr[SportHealthSetting.OXIMETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportHealthSetting.OXIMETRY_TYPE.ordinal()] = 2;
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
        m8b.f(getTAG(), "build settings pb msg, setting name=OXIMETRY value=" + byk.e(this.oximetryEnable) + " name=OXIMETRY_TYPE value=" + this.oximetryType);
        return mzb.U(this.oximetryEnable, this.oximetryType);
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public List<SportHealthSetting> c() {
        return CollectionsKt.listOf(new SportHealthSetting[]{SportHealthSetting.OXIMETRY, SportHealthSetting.OXIMETRY_TYPE, SportHealthSetting.AUTO_STOP_AUDIO_FILE_ENABLE, SportHealthSetting.AUTO_CLEAN_UP_AUDIO_FILE_ENABLE, SportHealthSetting.AUDIO_FILE_KEEP_TO_CLOUD_ENABLE, SportHealthSetting.AUTOMATIC_SNORING_MONITOR_ENABLE});
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public SettingMergeResult f(@NotNull m deviceSettings, @NotNull oag dbRepository) {
        Intrinsics.checkNotNullParameter(deviceSettings, UploadDeviceInformationRequest.kRequestParam_DeviceSettings);
        Intrinsics.checkNotNullParameter(dbRepository, "dbRepository");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m.b0 b0VarS = deviceSettings.s();
        if (b0VarS != null) {
            int iA = b0VarS.a();
            boolean z = b0VarS.c() != this.oximetryEnable;
            boolean z2 = b0VarS.d() != this.oximetryType;
            if (iA != 0 && iA >= this.localModifyTime) {
                m8b.f(getTAG(), "Device Spo2 setting modify time is large than local");
                if (z) {
                    this.oximetryEnable = b0VarS.c();
                    SportHealthSetting sportHealthSetting = SportHealthSetting.OXIMETRY;
                    arrayList2.add(sportHealthSetting);
                    dbRepository.v0(sportHealthSetting, byk.o(b0VarS.b()), ((long) iA) * 1000, pag.INSTANCE.c(sportHealthSetting));
                }
                if (z2) {
                    this.oximetryType = b0VarS.d();
                    SportHealthSetting sportHealthSetting2 = SportHealthSetting.OXIMETRY_TYPE;
                    arrayList2.add(sportHealthSetting2);
                    dbRepository.v0(sportHealthSetting2, byk.o(b0VarS.d()), ((long) iA) * 1000, pag.INSTANCE.c(sportHealthSetting2));
                }
            } else if (z || z2) {
                arrayList.add(SportHealthSetting.OXIMETRY);
            }
        }
        return new SettingMergeResult(arrayList, arrayList2);
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public q3 g() {
        return new a0();
    }

    @Override // com.oplus.aiunit.model.q3
    public void i(@NotNull SportHealthSetting settings, @NotNull String value, int modifyTime) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (a.$EnumSwitchMapping$0[settings.ordinal()]) {
            case 1:
                this.oximetryEnable = byk.w(value);
                this.localModifyTime = modifyTime;
                break;
            case 2:
                this.oximetryType = byk.u(value);
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

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getAutoStopAudioFileEnable() {
        return this.autoStopAudioFileEnable;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getOximetryEnable() {
        return this.oximetryEnable;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getOximetryType() {
        return this.oximetryType;
    }
}