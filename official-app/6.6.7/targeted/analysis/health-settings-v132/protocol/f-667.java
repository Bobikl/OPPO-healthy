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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b9\u0010:J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0001H\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\"\u0010+\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\"\u0010.\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\"\u00101\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R\"\u00105\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0018\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\"\u00108\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"¨\u0006;"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/f;", "Lcom/oplus/aiunit/vision/q3;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "c", "item", "", "deviceModel", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "Lcom/oplus/aiunit/vision/oag;", "dbRepository", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SettingMergeResult;", "f", "settings", "value", "", "modifyTime", "", "i", "g", "", "Z", "j", "()Z", "setActivityCompleteNotifyEnable", "(Z)V", "activityCompleteNotifyEnable", "I", "getActivityCompleteModifyTime", "()I", "setActivityCompleteModifyTime", "(I)V", "activityCompleteModifyTime", "d", "k", "setActivityPraiseNotifyEnable", "activityPraiseNotifyEnable", "e", "getActivityPraiseModifyTime", "setActivityPraiseModifyTime", "activityPraiseModifyTime", "l", "setHealthDailyReportEnable", "healthDailyReportEnable", "getDailyReportModifyTime", "setDailyReportModifyTime", "dailyReportModifyTime", "h", "m", "setHealthWeekReportEnable", "healthWeekReportEnable", "getWeekReportModifyTime", "setWeekReportModifyTime", "weekReportModifyTime", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class f extends q3 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int activityCompleteModifyTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int activityPraiseModifyTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int dailyReportModifyTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int weekReportModifyTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean activityCompleteNotifyEnable = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean activityPraiseNotifyEnable = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean healthDailyReportEnable = true;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean healthWeekReportEnable = true;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            try {
                iArr[SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportHealthSetting.ACTIVITY_PRAISE_NOTIFY_ENABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.oplus.aiunit.model.q3
    @Nullable
    public MessageEvent b(@NotNull SportHealthSetting item, @NotNull String deviceModel) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        boolean zE = e(deviceModel);
        int i = a.$EnumSwitchMapping$0[item.ordinal()];
        if (i == 1) {
            m8b.f(getTAG(), "build settings pb msg setting, name=ACTIVITY_COMPLETE_NOTIFY_ENABLE value=" + byk.e(this.activityCompleteNotifyEnable));
            return mzb.e(this.activityCompleteNotifyEnable, 1, zE);
        }
        if (i == 2) {
            m8b.f(getTAG(), "build settings pb msg, setting name=ACTIVITY_PRAISE_NOTIFY_ENABLE value=" + byk.e(this.activityPraiseNotifyEnable));
            return mzb.e(this.activityPraiseNotifyEnable, 2, zE);
        }
        if (i == 3) {
            m8b.f(getTAG(), "build settings pb msg, setting name=HEALTH_DAILY_REPORT_ENABLE value=" + byk.e(this.healthDailyReportEnable));
            return mzb.e(this.healthDailyReportEnable, 3, zE);
        }
        if (i != 4) {
            return null;
        }
        m8b.f(getTAG(), "build settings pb msg, setting name=HEALTH_WEEK_REPORT_ENABLE value=" + byk.e(this.healthWeekReportEnable));
        return mzb.e(this.healthWeekReportEnable, 4, zE);
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public List<SportHealthSetting> c() {
        return CollectionsKt.mutableListOf(new SportHealthSetting[]{SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE, SportHealthSetting.ACTIVITY_PRAISE_NOTIFY_ENABLE, SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE, SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE});
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public SettingMergeResult f(@NotNull m deviceSettings, @NotNull oag dbRepository) {
        Intrinsics.checkNotNullParameter(deviceSettings, UploadDeviceInformationRequest.kRequestParam_DeviceSettings);
        Intrinsics.checkNotNullParameter(dbRepository, "dbRepository");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m.i iVarC = deviceSettings.c();
        m.j jVarD = deviceSettings.d();
        m.s sVarK = deviceSettings.k();
        m.t tVarL = deviceSettings.l();
        if (iVarC != null) {
            int iA = iVarC.a();
            boolean z = iVarC.c() != this.activityCompleteNotifyEnable;
            if (iA != 0 && iA >= this.activityCompleteModifyTime) {
                m8b.f(getTAG(), "Device ActivityGoalComplete setting modify time is large than local");
                if (z) {
                    SportHealthSetting sportHealthSetting = SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE;
                    arrayList2.add(sportHealthSetting);
                    this.activityCompleteNotifyEnable = byk.n(iVarC.b());
                    dbRepository.v0(sportHealthSetting, byk.o(iVarC.b()), ((long) iA) * 1000, pag.INSTANCE.c(sportHealthSetting));
                }
            } else if (z) {
                arrayList.add(SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE);
            }
        }
        if (jVarD != null) {
            int iA2 = jVarD.a();
            boolean z2 = jVarD.c() != this.activityPraiseNotifyEnable;
            if (iA2 != 0 && iA2 >= this.activityPraiseModifyTime) {
                m8b.f(getTAG(), "Device ActivityPraise setting modify time is large than local");
                if (z2) {
                    SportHealthSetting sportHealthSetting2 = SportHealthSetting.ACTIVITY_PRAISE_NOTIFY_ENABLE;
                    arrayList2.add(sportHealthSetting2);
                    this.activityPraiseNotifyEnable = byk.n(jVarD.b());
                    dbRepository.v0(sportHealthSetting2, byk.o(jVarD.b()), ((long) iA2) * 1000, pag.INSTANCE.c(sportHealthSetting2));
                }
            } else if (z2) {
                arrayList.add(SportHealthSetting.ACTIVITY_PRAISE_NOTIFY_ENABLE);
            }
        }
        if (sVarK != null) {
            int iA3 = sVarK.a();
            boolean z3 = sVarK.c() != this.healthDailyReportEnable;
            if (iA3 != 0 && iA3 >= this.dailyReportModifyTime) {
                m8b.f(getTAG(), "Device HealthDailyReport setting modify time is large than local");
                if (z3) {
                    SportHealthSetting sportHealthSetting3 = SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE;
                    arrayList2.add(sportHealthSetting3);
                    this.healthDailyReportEnable = byk.n(sVarK.b());
                    dbRepository.v0(sportHealthSetting3, byk.o(sVarK.b()), ((long) iA3) * 1000, pag.INSTANCE.c(sportHealthSetting3));
                }
            } else if (z3) {
                arrayList.add(SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE);
            }
        }
        if (tVarL != null) {
            int iA4 = tVarL.a();
            boolean z4 = tVarL.c() != this.healthWeekReportEnable;
            if (iA4 != 0 && iA4 >= this.weekReportModifyTime) {
                m8b.f(getTAG(), "Device HealthWeekReport setting modify time is large than local");
                if (z4) {
                    SportHealthSetting sportHealthSetting4 = SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE;
                    arrayList2.add(sportHealthSetting4);
                    this.healthWeekReportEnable = byk.n(tVarL.b());
                    dbRepository.v0(sportHealthSetting4, byk.o(tVarL.b()), ((long) iA4) * 1000, pag.INSTANCE.c(sportHealthSetting4));
                }
            } else if (z4) {
                arrayList.add(SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE);
            }
        }
        return new SettingMergeResult(arrayList, arrayList2);
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public q3 g() {
        return new f();
    }

    @Override // com.oplus.aiunit.model.q3
    public void i(@NotNull SportHealthSetting settings, @NotNull String value, int modifyTime) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(value, "value");
        int i = a.$EnumSwitchMapping$0[settings.ordinal()];
        if (i == 1) {
            this.activityCompleteNotifyEnable = byk.w(value);
            this.activityCompleteModifyTime = modifyTime;
            return;
        }
        if (i == 2) {
            this.activityPraiseNotifyEnable = byk.w(value);
            this.activityPraiseModifyTime = modifyTime;
            return;
        }
        if (i == 3) {
            this.healthDailyReportEnable = byk.w(value);
            this.dailyReportModifyTime = modifyTime;
        } else {
            if (i == 4) {
                this.healthWeekReportEnable = byk.w(value);
                this.weekReportModifyTime = modifyTime;
                return;
            }
            m8b.f(getTAG(), "unknown setting item = " + settings.name());
        }
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getActivityCompleteNotifyEnable() {
        return this.activityCompleteNotifyEnable;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getActivityPraiseNotifyEnable() {
        return this.activityPraiseNotifyEnable;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getHealthDailyReportEnable() {
        return this.healthDailyReportEnable;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getHealthWeekReportEnable() {
        return this.healthWeekReportEnable;
    }
}