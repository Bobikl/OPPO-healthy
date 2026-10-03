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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0001H\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\"\u0010+\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\"\u0010.\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\"\u00101\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"¨\u00064"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/bean/x;", "Lcom/oplus/aiunit/vision/q3;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "c", "item", "", "deviceModel", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "Lcom/oplus/aiunit/vision/oag;", "dbRepository", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SettingMergeResult;", "f", "settings", "value", "", "modifyTime", "", "i", "g", "", "Z", "l", "()Z", "setSedentaryRemindEnable", "(Z)V", "sedentaryRemindEnable", "I", "getSedentaryRemindModifyTime", "()I", "setSedentaryRemindModifyTime", "(I)V", "sedentaryRemindModifyTime", "d", "j", "setDisableInLunchBreak", "disableInLunchBreak", "e", "getDisableInLunchModifyTime", "setDisableInLunchModifyTime", "disableInLunchModifyTime", "k", "setResumeActivityReminderEnable", "resumeActivityReminderEnable", "getActivityReminderModifyTime", "setActivityReminderModifyTime", "activityReminderModifyTime", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class x extends q3 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int sedentaryRemindModifyTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int disableInLunchModifyTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int activityReminderModifyTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean sedentaryRemindEnable = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean disableInLunchBreak = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean resumeActivityReminderEnable = true;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            try {
                iArr[SportHealthSetting.SEDENTARY_REMIND_ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportHealthSetting.DISABLE_IN_LUNCH_BREAK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportHealthSetting.RESUME_ACTIVITY_REMINDER_ENABLE.ordinal()] = 3;
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
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            m8b.f(getTAG(), "build settings pb msg, setting name=RESUME_ACTIVITY_REMINDER_ENABLE value=" + byk.e(this.resumeActivityReminderEnable));
            return mzb.c0(this.resumeActivityReminderEnable, e(deviceModel));
        }
        m8b.f(getTAG(), "build settings pb msg, setting name=SEDENTARY_REMIND_ENABLE value=" + byk.e(this.sedentaryRemindEnable) + " name=DISABLE_IN_LUNCH_BREAK value=" + byk.e(this.disableInLunchBreak));
        return mzb.d0(this.sedentaryRemindEnable, 9, 21, this.disableInLunchBreak, e(deviceModel));
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public List<SportHealthSetting> c() {
        return CollectionsKt.listOf(new SportHealthSetting[]{SportHealthSetting.SEDENTARY_REMIND_ENABLE, SportHealthSetting.DISABLE_IN_LUNCH_BREAK, SportHealthSetting.RESUME_ACTIVITY_REMINDER_ENABLE});
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public SettingMergeResult f(@NotNull m deviceSettings, @NotNull oag dbRepository) {
        Intrinsics.checkNotNullParameter(deviceSettings, UploadDeviceInformationRequest.kRequestParam_DeviceSettings);
        Intrinsics.checkNotNullParameter(dbRepository, "dbRepository");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w wVarQ = deviceSettings.q();
        if (wVarQ != null) {
            w.c cVarC = wVarQ.c();
            if (cVarC != null) {
                int iA = cVarC.a();
                boolean z = cVarC.c() != this.sedentaryRemindEnable;
                if (iA != 0 && iA >= this.sedentaryRemindModifyTime && z) {
                    m8b.f(getTAG(), "Device sedentarySwitch setting modify time is large than local");
                    SportHealthSetting sportHealthSetting = SportHealthSetting.SEDENTARY_REMIND_ENABLE;
                    arrayList2.add(sportHealthSetting);
                    this.sedentaryRemindEnable = cVarC.c();
                    dbRepository.v0(sportHealthSetting, byk.o(cVarC.b()), ((long) iA) * 1000, pag.INSTANCE.c(sportHealthSetting));
                } else if (z) {
                    arrayList.add(SportHealthSetting.SEDENTARY_REMIND_ENABLE);
                }
            }
            w.a aVarA = wVarQ.a();
            if (aVarA != null) {
                int iA2 = aVarA.a();
                boolean z2 = aVarA.c() != this.disableInLunchBreak;
                if (iA2 != 0 && iA2 >= this.disableInLunchModifyTime && z2) {
                    m8b.f(getTAG(), "Device DisableInLunchBreak setting modify time is large than local");
                    this.disableInLunchBreak = aVarA.c();
                    SportHealthSetting sportHealthSetting2 = SportHealthSetting.DISABLE_IN_LUNCH_BREAK;
                    arrayList2.add(sportHealthSetting2);
                    dbRepository.v0(sportHealthSetting2, byk.o(aVarA.b()), ((long) iA2) * 1000, pag.INSTANCE.c(sportHealthSetting2));
                } else if (z2) {
                    arrayList.add(SportHealthSetting.DISABLE_IN_LUNCH_BREAK);
                }
            }
            w.b bVarB = wVarQ.b();
            if (bVarB != null) {
                int iA3 = bVarB.a();
                boolean z3 = bVarB.c() != this.resumeActivityReminderEnable;
                if (iA3 != 0 && iA3 >= this.activityReminderModifyTime && z3) {
                    m8b.f(getTAG(), "Device ResumeActivityReminder setting modify time is large than local");
                    this.resumeActivityReminderEnable = bVarB.c();
                    SportHealthSetting sportHealthSetting3 = SportHealthSetting.RESUME_ACTIVITY_REMINDER_ENABLE;
                    arrayList2.add(sportHealthSetting3);
                    dbRepository.v0(sportHealthSetting3, byk.o(bVarB.b()), ((long) iA3) * 1000, pag.INSTANCE.c(sportHealthSetting3));
                } else if (z3) {
                    arrayList.add(SportHealthSetting.RESUME_ACTIVITY_REMINDER_ENABLE);
                }
            }
        }
        return new SettingMergeResult(arrayList, arrayList2);
    }

    @Override // com.oplus.aiunit.model.q3
    @NotNull
    public q3 g() {
        return new x();
    }

    @Override // com.oplus.aiunit.model.q3
    public void i(@NotNull SportHealthSetting settings, @NotNull String value, int modifyTime) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(value, "value");
        int i = a.$EnumSwitchMapping$0[settings.ordinal()];
        if (i == 1) {
            this.sedentaryRemindEnable = byk.w(value);
            this.sedentaryRemindModifyTime = modifyTime;
            return;
        }
        if (i == 2) {
            this.disableInLunchBreak = byk.w(value);
            this.disableInLunchModifyTime = modifyTime;
        } else {
            if (i == 3) {
                this.resumeActivityReminderEnable = byk.w(value);
                this.activityReminderModifyTime = modifyTime;
                return;
            }
            m8b.f(getTAG(), "unknown setting item = " + settings.name());
        }
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getDisableInLunchBreak() {
        return this.disableInLunchBreak;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getResumeActivityReminderEnable() {
        return this.resumeActivityReminderEnable;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getSedentaryRemindEnable() {
        return this.sedentaryRemindEnable;
    }
}