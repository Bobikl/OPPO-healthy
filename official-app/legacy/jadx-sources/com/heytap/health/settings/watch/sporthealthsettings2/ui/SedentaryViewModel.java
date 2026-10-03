package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.vision.duk;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.sgi;
import java.util.HashMap;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0003J#\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SedentaryViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v0", "enable", "isDisableInLunchBreak", "y0", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "x0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SedentaryViewModel extends SHSettingBaseViewModel<DeviceSettings> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SedentaryViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super DeviceSettings> continuation) {
        return w0();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt__SetsKt.linkedSetOf(SportHealthSetting.SEDENTARY_REMIND_ENABLE, SportHealthSetting.DISABLE_IN_LUNCH_BREAK, SportHealthSetting.RESUME_ACTIVITY_REMINDER_ENABLE);
    }

    public final boolean v0() {
        return sgi.a(g0().deviceMac).G2();
    }

    public final DeviceSettings w0() {
        return h0().B();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x0(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        SedentaryViewModel$setSedentaryRemind$2 sedentaryViewModel$setSedentaryRemind$2;
        if (continuation instanceof SedentaryViewModel$setSedentaryRemind$2) {
            sedentaryViewModel$setSedentaryRemind$2 = (SedentaryViewModel$setSedentaryRemind$2) continuation;
            int i = sedentaryViewModel$setSedentaryRemind$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sedentaryViewModel$setSedentaryRemind$2.label = i - Integer.MIN_VALUE;
            } else {
                sedentaryViewModel$setSedentaryRemind$2 = new SedentaryViewModel$setSedentaryRemind$2(this, continuation);
            }
        } else {
            sedentaryViewModel$setSedentaryRemind$2 = new SedentaryViewModel$setSedentaryRemind$2(this, continuation);
        }
        Object objC = sedentaryViewModel$setSedentaryRemind$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sedentaryViewModel$setSedentaryRemind$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (SedentaryViewModel) sedentaryViewModel$setSedentaryRemind$2.L$0;
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
        HashMap map = new HashMap();
        SportHealthSetting sportHealthSetting = SportHealthSetting.RESUME_ACTIVITY_REMINDER_ENABLE;
        String strE = duk.e(z);
        Intrinsics.checkNotNullExpressionValue(strE, "boolToString(enable)");
        map.put(sportHealthSetting, strE);
        MutableLiveData<Integer> mutableLiveDataW = h0().w(sportHealthSetting, map);
        sedentaryViewModel$setSedentaryRemind$2.L$0 = this;
        sedentaryViewModel$setSedentaryRemind$2.label = 1;
        objC = ExpandKt.c(mutableLiveDataW, sedentaryViewModel$setSedentaryRemind$2);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        sedentaryViewModel$setSedentaryRemind$2.L$0 = null;
        sedentaryViewModel$setSedentaryRemind$2.label = 2;
        objC = this.s0((Integer) objC, sedentaryViewModel$setSedentaryRemind$2);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object y0(boolean z, boolean z2, @NotNull Continuation<? super Boolean> continuation) {
        SedentaryViewModel$setSedentaryRemind$1 sedentaryViewModel$setSedentaryRemind$1;
        if (continuation instanceof SedentaryViewModel$setSedentaryRemind$1) {
            sedentaryViewModel$setSedentaryRemind$1 = (SedentaryViewModel$setSedentaryRemind$1) continuation;
            int i = sedentaryViewModel$setSedentaryRemind$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sedentaryViewModel$setSedentaryRemind$1.label = i - Integer.MIN_VALUE;
            } else {
                sedentaryViewModel$setSedentaryRemind$1 = new SedentaryViewModel$setSedentaryRemind$1(this, continuation);
            }
        } else {
            sedentaryViewModel$setSedentaryRemind$1 = new SedentaryViewModel$setSedentaryRemind$1(this, continuation);
        }
        Object objC = sedentaryViewModel$setSedentaryRemind$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sedentaryViewModel$setSedentaryRemind$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (SedentaryViewModel) sedentaryViewModel$setSedentaryRemind$1.L$0;
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
        HashMap map = new HashMap();
        SportHealthSetting sportHealthSetting = SportHealthSetting.SEDENTARY_REMIND_ENABLE;
        String strE = duk.e(z);
        Intrinsics.checkNotNullExpressionValue(strE, "boolToString(enable)");
        map.put(sportHealthSetting, strE);
        SportHealthSetting sportHealthSetting2 = SportHealthSetting.DISABLE_IN_LUNCH_BREAK;
        String strE2 = duk.e(z2);
        Intrinsics.checkNotNullExpressionValue(strE2, "boolToString(isDisableInLunchBreak)");
        map.put(sportHealthSetting2, strE2);
        MutableLiveData<Integer> mutableLiveDataW = h0().w(sportHealthSetting, map);
        sedentaryViewModel$setSedentaryRemind$1.L$0 = this;
        sedentaryViewModel$setSedentaryRemind$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataW, sedentaryViewModel$setSedentaryRemind$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        sedentaryViewModel$setSedentaryRemind$1.L$0 = null;
        sedentaryViewModel$setSedentaryRemind$1.label = 2;
        objC = this.s0((Integer) objC, sedentaryViewModel$setSedentaryRemind$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }
}
