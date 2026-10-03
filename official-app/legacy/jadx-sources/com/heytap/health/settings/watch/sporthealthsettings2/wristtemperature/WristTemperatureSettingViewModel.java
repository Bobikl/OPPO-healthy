package com.heytap.health.settings.watch.sporthealthsettings2.wristtemperature;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.base.track.a;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.vision.vik;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0014J\u001b\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/wristtemperature/WristTemperatureSettingViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "v0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WristTemperatureSettingViewModel extends SHSettingBaseViewModel<Boolean> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WristTemperatureSettingViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(w0());
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt__SetsKt.linkedSetOf(SportHealthSetting.WRIST_TEMPERATURE_ENABLE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object v0(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        WristTemperatureSettingViewModel$setWristTemperature$1 wristTemperatureSettingViewModel$setWristTemperature$1;
        if (continuation instanceof WristTemperatureSettingViewModel$setWristTemperature$1) {
            wristTemperatureSettingViewModel$setWristTemperature$1 = (WristTemperatureSettingViewModel$setWristTemperature$1) continuation;
            int i = wristTemperatureSettingViewModel$setWristTemperature$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wristTemperatureSettingViewModel$setWristTemperature$1.label = i - Integer.MIN_VALUE;
            } else {
                wristTemperatureSettingViewModel$setWristTemperature$1 = new WristTemperatureSettingViewModel$setWristTemperature$1(this, continuation);
            }
        } else {
            wristTemperatureSettingViewModel$setWristTemperature$1 = new WristTemperatureSettingViewModel$setWristTemperature$1(this, continuation);
        }
        Object objC = wristTemperatureSettingViewModel$setWristTemperature$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wristTemperatureSettingViewModel$setWristTemperature$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (WristTemperatureSettingViewModel) wristTemperatureSettingViewModel$setWristTemperature$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        a.k().a(vik.TAG_MODULE_ID, Boxing.boxInt(1)).a("element", Boxing.boxInt(!z ? 1 : 0)).b();
        MutableLiveData<Integer> mutableLiveDataX = h0().x(SportHealthSetting.WRIST_TEMPERATURE_ENABLE, z);
        wristTemperatureSettingViewModel$setWristTemperature$1.L$0 = this;
        wristTemperatureSettingViewModel$setWristTemperature$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataX, wristTemperatureSettingViewModel$setWristTemperature$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        wristTemperatureSettingViewModel$setWristTemperature$1.L$0 = null;
        wristTemperatureSettingViewModel$setWristTemperature$1.label = 2;
        objC = this.s0((Integer) objC, wristTemperatureSettingViewModel$setWristTemperature$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }

    public final boolean w0() {
        return h0().B().getWristTemperature().getWristTemperatureEnable();
    }
}
