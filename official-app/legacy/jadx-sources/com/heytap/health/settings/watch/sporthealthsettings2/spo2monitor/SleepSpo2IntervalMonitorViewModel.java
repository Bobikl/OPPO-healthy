package com.heytap.health.settings.watch.sporthealthsettings2.spo2monitor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.entity.DeviceParam;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.settings.watch.sporthealthsettings.bean.a0;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingViewModel;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.vision.duk;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0014J\u001b\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/spo2monitor/SleepSpo2IntervalMonitorViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/device_settings/entity/DeviceParam;", "w0", "enable", "x0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SleepSpo2IntervalMonitorViewModel extends SHSettingBaseViewModel<Boolean> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepSpo2IntervalMonitorViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(v0());
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt__SetsKt.linkedSetOf(SportHealthSetting.OXIMETRY, SportHealthSetting.OXIMETRY_TYPE);
    }

    public final boolean v0() {
        a0 spo2 = h0().B().getSpo2();
        return spo2.getOximetryEnable() && spo2.getOximetryType() == 1;
    }

    @NotNull
    public final DeviceParam w0() {
        return g0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x0(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        SleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1 sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1;
        if (continuation instanceof SleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1) {
            sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1 = (SleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1) continuation;
            int i = sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1 = new SleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1(this, continuation);
            }
        } else {
            sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1 = new SleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1(this, continuation);
        }
        Object objC = sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (SleepSpo2IntervalMonitorViewModel) sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        SHSettingViewModel sHSettingViewModelH0 = h0();
        SportHealthSetting sportHealthSetting = SportHealthSetting.OXIMETRY;
        MutableLiveData<Integer> mutableLiveDataW = sHSettingViewModelH0.w(sportHealthSetting, MapsKt__MapsKt.mapOf(TuplesKt.to(sportHealthSetting, duk.e(z)), TuplesKt.to(SportHealthSetting.OXIMETRY_TYPE, duk.o(1))));
        sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1.L$0 = this;
        sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataW, sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1.L$0 = null;
        sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1.label = 2;
        objC = this.s0((Integer) objC, sleepSpo2IntervalMonitorViewModel$setSpo2Monitor$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }
}
