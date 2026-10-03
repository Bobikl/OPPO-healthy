package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.vision.DailyActivityNotify;
import com.oplus.aiunit.vision.PrefStruct;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.sgi;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/DailyActivityNofifyViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/oplus/aiunit/vision/gq4;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setting", "enable", "v0", "(Lcom/heytap/health/device_settings/health/SportHealthSetting;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DailyActivityNofifyViewModel extends SHSettingBaseViewModel<DailyActivityNotify> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyActivityNofifyViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
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
        return SetsKt__SetsKt.linkedSetOf(SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE, SportHealthSetting.ACTIVITY_PRAISE_NOTIFY_ENABLE, SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE, SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object v0(@NotNull SportHealthSetting sportHealthSetting, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        DailyActivityNofifyViewModel$changeSetting$1 dailyActivityNofifyViewModel$changeSetting$1;
        if (continuation instanceof DailyActivityNofifyViewModel$changeSetting$1) {
            dailyActivityNofifyViewModel$changeSetting$1 = (DailyActivityNofifyViewModel$changeSetting$1) continuation;
            int i = dailyActivityNofifyViewModel$changeSetting$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dailyActivityNofifyViewModel$changeSetting$1.label = i - Integer.MIN_VALUE;
            } else {
                dailyActivityNofifyViewModel$changeSetting$1 = new DailyActivityNofifyViewModel$changeSetting$1(this, continuation);
            }
        } else {
            dailyActivityNofifyViewModel$changeSetting$1 = new DailyActivityNofifyViewModel$changeSetting$1(this, continuation);
        }
        Object objC = dailyActivityNofifyViewModel$changeSetting$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
        if (!rpc.c()) {
            rg7.l(R$string.settings_device_network_disconnect);
            return Boxing.boxBoolean(false);
        }
        a7b.f(getTAG(), "Change setting item=" + sportHealthSetting + " enable=" + z);
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
        PrefStruct prefStruct;
        String strL;
        String strL2;
        com.heytap.health.settings.watch.sporthealthsettings.bean.f activityNotification = h0().B().getActivityNotification();
        boolean zBooleanValue = ((Boolean) lc5.c(g0().deviceMac).a(DailyActivityNofifyViewModel$dailyActivityNotify$isHeisenberg$1.INSTANCE)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) lc5.c(g0().deviceMac).a(DailyActivityNofifyViewModel$dailyActivityNotify$isBandType$1.INSTANCE)).booleanValue();
        PrefStruct prefStruct2 = new PrefStruct(qtf.l(zBooleanValue ? R$string.settings_goal_complete_notify_heisenberg : R$string.settings_goal_complete_notify), qtf.l(zBooleanValue2 ? R$string.settings_goal_complete_notify_band_desc : R$string.settings_goal_complete_notify_desc), null, activityNotification.getActivityCompleteNotifyEnable(), false, 20, null);
        if (sgi.a(g0().deviceMac).g4()) {
            prefStruct = new PrefStruct(qtf.l(zBooleanValue ? R$string.settings_activity_praise_heisenberg : R$string.settings_activity_praise), qtf.l(zBooleanValue2 ? R$string.settings_activity_praise_band_desc : R$string.settings_activity_praise_desc), null, activityNotification.getActivityPraiseNotifyEnable(), false, 20, null);
        } else {
            prefStruct = null;
        }
        boolean zS1 = sgi.a(g0().deviceMac).S1();
        String strL3 = qtf.l(zS1 ? R$string.settings_health_daily_report_watch4 : R$string.settings_health_daily_report);
        if (zBooleanValue2) {
            strL = qtf.l(R$string.settings_health_daily_report_band_desc);
        } else {
            strL = zS1 ? qtf.l(R$string.settings_health_daily_report_desc_watch4) : qtf.l(R$string.settings_health_daily_report_desc);
        }
        PrefStruct prefStruct3 = new PrefStruct(strL3, strL, null, activityNotification.getHealthDailyReportEnable(), false, 20, null);
        String strL4 = qtf.l(zS1 ? R$string.settings_health_week_report_watch4 : R$string.settings_health_week_report);
        if (zBooleanValue2) {
            strL2 = qtf.l(R$string.settings_health_week_report_band_desc);
        } else {
            strL2 = zS1 ? qtf.l(R$string.settings_health_week_report_desc_watch4) : qtf.l(R$string.settings_health_week_report_desc);
        }
        return new DailyActivityNotify(prefStruct2, prefStruct, prefStruct3, new PrefStruct(strL4, strL2, null, activityNotification.getHealthWeekReportEnable(), false, 20, null));
    }
}
