package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.icu.util.Calendar;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepSettingViewModel;
import com.heytap.health.sleep.day.SleepEnvNoiseActivity;
import com.heytap.health.watch.notification.INotificationBooleanCallback;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.model.SiestaSetting;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.vision.m8b;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SiestaSettingViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/oplus/aiunit/vision/e6h;", "", "p0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "x0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", SleepEnvNoiseActivity.START_TIME, SleepEnvNoiseActivity.END_TIME, "y0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "A0", "", "z0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SiestaSettingViewModel extends SHSettingBaseViewModel<SiestaSetting> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiestaSettingViewModel(@NotNull SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "stateHandle");
    }

    public final SiestaSetting A0() {
        SleepSettingBean sleepSettingBeanC0 = i0().c0();
        String strC = sleepSettingBeanC0.c();
        Intrinsics.checkNotNullExpressionValue(strC, "sleepSettingBean.napStartTime");
        List listSplit$default = StringsKt.split$default(strC, new String[]{":"}, false, 0, 6, (Object) null);
        int iB = sleepSettingBeanC0.b();
        int i = Integer.parseInt((String) listSplit$default.get(0));
        int i2 = Integer.parseInt((String) listSplit$default.get(1));
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.add(12, iB);
        return new SiestaSetting(sleepSettingBeanC0.j(), TuplesKt.to(Integer.valueOf(i), Integer.valueOf(i2)), TuplesKt.to(Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))));
    }

    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super SiestaSetting> continuation) {
        return A0();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean p0() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x0(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        SiestaSettingViewModel$changeSiestaSetting$1 siestaSettingViewModel$changeSiestaSetting$1;
        SiestaSettingViewModel siestaSettingViewModel;
        if (continuation instanceof SiestaSettingViewModel$changeSiestaSetting$1) {
            siestaSettingViewModel$changeSiestaSetting$1 = (SiestaSettingViewModel$changeSiestaSetting$1) continuation;
            int i = siestaSettingViewModel$changeSiestaSetting$1.label;
            if ((i & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                siestaSettingViewModel$changeSiestaSetting$1.label = i - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                siestaSettingViewModel$changeSiestaSetting$1 = new SiestaSettingViewModel$changeSiestaSetting$1(this, continuation);
            }
        } else {
            siestaSettingViewModel$changeSiestaSetting$1 = new SiestaSettingViewModel$changeSiestaSetting$1(this, continuation);
        }
        Object objC = siestaSettingViewModel$changeSiestaSetting$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = siestaSettingViewModel$changeSiestaSetting$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (SiestaSettingViewModel) siestaSettingViewModel$changeSiestaSetting$1.L$1;
                siestaSettingViewModel = (SiestaSettingViewModel) siestaSettingViewModel$changeSiestaSetting$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        SleepSettingViewModel sleepSettingViewModelI0 = i0();
        SportHealthSetting sportHealthSetting = SportHealthSetting.SILENCE_NOTIFICATIONS_DURING_NAP_SWITCH;
        MutableLiveData<Integer> mutableLiveDataW = sleepSettingViewModelI0.w(sportHealthSetting, MapsKt.mapOf(TuplesKt.to(sportHealthSetting, byk.e(z))));
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataW, "sleepSettingViewModel.ch…)\n            )\n        )");
        siestaSettingViewModel$changeSiestaSetting$1.L$0 = this;
        siestaSettingViewModel$changeSiestaSetting$1.L$1 = this;
        siestaSettingViewModel$changeSiestaSetting$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataW, siestaSettingViewModel$changeSiestaSetting$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        siestaSettingViewModel = this;
        SiestaSettingViewModel$changeSiestaSetting$2 siestaSettingViewModel$changeSiestaSetting$2 = new SiestaSettingViewModel$changeSiestaSetting$2(siestaSettingViewModel, null);
        siestaSettingViewModel$changeSiestaSetting$1.L$0 = null;
        siestaSettingViewModel$changeSiestaSetting$1.L$1 = null;
        siestaSettingViewModel$changeSiestaSetting$1.label = 2;
        objC = this.t0((Integer) objC, siestaSettingViewModel$changeSiestaSetting$2, siestaSettingViewModel$changeSiestaSetting$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }

    @Nullable
    public final Object y0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        return e0(new SiestaSettingViewModel$saveNapTime$2(str, str2, this, null), continuation);
    }

    public final void z0() {
        com.heytap.health.watch.notification.b bVar = com.heytap.health.watch.notification.b.INSTANCE;
        Bundle bundle = new Bundle();
        SleepSettingBean sleepSettingBeanC0 = i0().c0();
        boolean zJ = sleepSettingBeanC0.j();
        String str = sleepSettingBeanC0.c() + ":00";
        long jB = ((long) sleepSettingBeanC0.b()) * 60;
        bundle.putString("notification_event_key", "event_dnd");
        bundle.putBoolean("key_is_open_dnd", zJ);
        bundle.putString("key_dnd_start_time", str);
        bundle.putLong("key_dnd_duration", jB);
        m8b.f(getTAG(), "nap data: switch:" + zJ + " startTime:" + str + " duration:" + jB);
        bVar.d(bundle, (INotificationBooleanCallback) null);
    }
}