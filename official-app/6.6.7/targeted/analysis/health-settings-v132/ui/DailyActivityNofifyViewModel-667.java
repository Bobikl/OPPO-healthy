package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.model.DailyActivityNotify;
import com.oplus.aiunit.vision.bse;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.jrc;
import com.oplus.aiunit.vision.lki;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.swf;
import com.oplus.aiunit.vision.th7;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/DailyActivityNofifyViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/oplus/aiunit/vision/wq4;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setting", "enable", "v0", "(Lcom/heytap/health/device_settings/health/SportHealthSetting;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DailyActivityNofifyViewModel extends SHSettingBaseViewModel<DailyActivityNotify> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyActivityNofifyViewModel(@NotNull SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "stateHandle");
    }

    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super DailyActivityNotify> continuation) {
        return w0();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE, SportHealthSetting.ACTIVITY_PRAISE_NOTIFY_ENABLE, SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE, SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object v0(@NotNull SportHealthSetting sportHealthSetting, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        DailyActivityNofifyViewModel$changeSetting$1 dailyActivityNofifyViewModel$changeSetting$1;
        if (continuation instanceof DailyActivityNofifyViewModel$changeSetting$1) {
            dailyActivityNofifyViewModel$changeSetting$1 = (DailyActivityNofifyViewModel$changeSetting$1) continuation;
            int i = dailyActivityNofifyViewModel$changeSetting$1.label;
            if ((i & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                dailyActivityNofifyViewModel$changeSetting$1.label = i - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                dailyActivityNofifyViewModel$changeSetting$1 = new DailyActivityNofifyViewModel$changeSetting$1(this, continuation);
            }
        } else {
            dailyActivityNofifyViewModel$changeSetting$1 = new DailyActivityNofifyViewModel$changeSetting$1(this, continuation);
        }
        Object objC = dailyActivityNofifyViewModel$changeSetting$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dailyActivityNofifyViewModel$changeSetting$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (DailyActivityNofifyViewModel) dailyActivityNofifyViewModel$changeSetting$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        if (!jrc.c()) {
            th7.l(R.string.settings_device_network_disconnect);
            return Boxing.boxBoolean(false);
        }
        m8b.f(getTAG(), "Change setting item=" + sportHealthSetting + " enable=" + z);
        MutableLiveData<Integer> mutableLiveDataX = h0().x(sportHealthSetting, z);
        dailyActivityNofifyViewModel$changeSetting$1.L$0 = this;
        dailyActivityNofifyViewModel$changeSetting$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataX, dailyActivityNofifyViewModel$changeSetting$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        dailyActivityNofifyViewModel$changeSetting$1.L$0 = null;
        dailyActivityNofifyViewModel$changeSetting$1.label = 2;
        objC = this.s0((Integer) objC, dailyActivityNofifyViewModel$changeSetting$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }

    public final DailyActivityNotify w0() {
        bse bseVar;
        String strL;
        String strL2;
        com.heytap.health.settings.watch.sporthealthsettings.bean.f activityNotification = h0().B().getActivityNotification();
        boolean zBooleanValue = ((Boolean) gd5.c(g0().deviceMac).a(DailyActivityNofifyViewModel$dailyActivityNotify$isHeisenberg$1.INSTANCE)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) gd5.c(g0().deviceMac).a(DailyActivityNofifyViewModel$dailyActivityNotify$isBandType$1.INSTANCE)).booleanValue();
        bse bseVar2 = new bse(swf.l(zBooleanValue ? R.string.settings_goal_complete_notify_heisenberg : R.string.settings_goal_complete_notify), swf.l(zBooleanValue2 ? R.string.settings_goal_complete_notify_band_desc : R.string.settings_goal_complete_notify_desc), (String) null, activityNotification.getActivityCompleteNotifyEnable(), false, 20, (DefaultConstructorMarker) null);
        if (lki.a(g0().deviceMac).f4()) {
            bseVar = new bse(swf.l(zBooleanValue ? R.string.settings_activity_praise_heisenberg : R.string.settings_activity_praise), swf.l(zBooleanValue2 ? R.string.settings_activity_praise_band_desc : R.string.settings_activity_praise_desc), (String) null, activityNotification.getActivityPraiseNotifyEnable(), false, 20, (DefaultConstructorMarker) null);
        } else {
            bseVar = null;
        }
        boolean zT1 = lki.a(g0().deviceMac).T1();
        String strL3 = swf.l(zT1 ? R.string.settings_health_daily_report_watch4 : R.string.settings_health_daily_report);
        if (zBooleanValue2) {
            strL = swf.l(R.string.settings_health_daily_report_band_desc);
        } else {
            strL = zT1 ? swf.l(R.string.settings_health_daily_report_desc_watch4) : swf.l(R.string.settings_health_daily_report_desc);
        }
        bse bseVar3 = new bse(strL3, strL, (String) null, activityNotification.getHealthDailyReportEnable(), false, 20, (DefaultConstructorMarker) null);
        String strL4 = swf.l(zT1 ? R.string.settings_health_week_report_watch4 : R.string.settings_health_week_report);
        if (zBooleanValue2) {
            strL2 = swf.l(R.string.settings_health_week_report_band_desc);
        } else {
            strL2 = zT1 ? swf.l(R.string.settings_health_week_report_desc_watch4) : swf.l(R.string.settings_health_week_report_desc);
        }
        return new DailyActivityNotify(bseVar2, bseVar, bseVar3, new bse(strL4, strL2, (String) null, activityNotification.getHealthWeekReportEnable(), false, 20, (DefaultConstructorMarker) null));
    }
}