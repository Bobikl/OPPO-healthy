package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.heytap.sporthealth.blib.helper.SimplifyDialogKt;
import com.oplus.aiunit.vision.n8g;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.vm5;
import com.oplus.aiunit.vision.x0;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0003J+\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0014\u001a\u00020\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/FallDownViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/q;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w0", "Landroid/app/Activity;", "activity", "item", "enable", "v0", "(Landroid/app/Activity;Lcom/heytap/health/device_settings/health/SportHealthSetting;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "x0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFallDownViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FallDownViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/FallDownViewModel\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,63:1\n30#2,5:64\n*S KotlinDebug\n*F\n+ 1 FallDownViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/FallDownViewModel\n*L\n39#1:64,5\n*E\n"})
public final class FallDownViewModel extends SHSettingBaseViewModel<com.heytap.health.settings.watch.sporthealthsettings.bean.q> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallDownViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super com.heytap.health.settings.watch.sporthealthsettings.bean.q> continuation) {
        return h0().B().getFallDown();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt__SetsKt.linkedSetOf(SportHealthSetting.FALL_DOWN_ENABLE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[PHI: r11
  0x009e: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v1 java.lang.Object) binds: [B:28:0x009b, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object v0(@NotNull Activity activity, @NotNull SportHealthSetting sportHealthSetting, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        FallDownViewModel$changeSetting$1 fallDownViewModel$changeSetting$1;
        if (continuation instanceof FallDownViewModel$changeSetting$1) {
            fallDownViewModel$changeSetting$1 = (FallDownViewModel$changeSetting$1) continuation;
            int i = fallDownViewModel$changeSetting$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fallDownViewModel$changeSetting$1.label = i - Integer.MIN_VALUE;
            } else {
                fallDownViewModel$changeSetting$1 = new FallDownViewModel$changeSetting$1(this, continuation);
            }
        } else {
            fallDownViewModel$changeSetting$1 = new FallDownViewModel$changeSetting$1(this, continuation);
        }
        Object objC = fallDownViewModel$changeSetting$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = fallDownViewModel$changeSetting$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z2 = fallDownViewModel$changeSetting$1.Z$0;
                SportHealthSetting sportHealthSetting2 = (SportHealthSetting) fallDownViewModel$changeSetting$1.L$1;
                FallDownViewModel fallDownViewModel = (FallDownViewModel) fallDownViewModel$changeSetting$1.L$0;
                ResultKt.throwOnFailure(objC);
                z = z2;
                this = fallDownViewModel;
                sportHealthSetting = sportHealthSetting2;
            } else if (i2 == 2) {
                this = (FallDownViewModel) fallDownViewModel$changeSetting$1.L$0;
                ResultKt.throwOnFailure(objC);
                fallDownViewModel$changeSetting$1.L$0 = null;
                fallDownViewModel$changeSetting$1.label = 3;
                objC = this.s0((Integer) objC, fallDownViewModel$changeSetting$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            return objC;
        }
        ResultKt.throwOnFailure(objC);
        if (z) {
            String strL = qtf.l(R$string.settings_tips);
            String strL2 = qtf.l(R$string.settings_enable_fall_down_tips);
            fallDownViewModel$changeSetting$1.L$0 = this;
            fallDownViewModel$changeSetting$1.L$1 = sportHealthSetting;
            fallDownViewModel$changeSetting$1.Z$0 = z;
            fallDownViewModel$changeSetting$1.label = 1;
            if (SimplifyDialogKt.F(activity, strL, strL2, fallDownViewModel$changeSetting$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        n8g.INSTANCE.F(1);
        MutableLiveData<Integer> mutableLiveDataX = this.h0().x(sportHealthSetting, z);
        fallDownViewModel$changeSetting$1.L$0 = this;
        fallDownViewModel$changeSetting$1.L$1 = null;
        fallDownViewModel$changeSetting$1.label = 2;
        objC = ExpandKt.c(mutableLiveDataX, fallDownViewModel$changeSetting$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        fallDownViewModel$changeSetting$1.L$0 = null;
        fallDownViewModel$changeSetting$1.label = 3;
        objC = this.s0((Integer) objC, fallDownViewModel$changeSetting$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objC;
        n8g.INSTANCE.F(0);
        n8g.INSTANCE.F(1);
        MutableLiveData<Integer> mutableLiveDataX2 = this.h0().x(sportHealthSetting, z);
        fallDownViewModel$changeSetting$1.L$0 = this;
        fallDownViewModel$changeSetting$1.L$1 = null;
        fallDownViewModel$changeSetting$1.label = 2;
        objC = ExpandKt.c(mutableLiveDataX2, fallDownViewModel$changeSetting$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        fallDownViewModel$changeSetting$1.L$0 = null;
        fallDownViewModel$changeSetting$1.label = 3;
        objC = this.s0((Integer) objC, fallDownViewModel$changeSetting$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objC;
    }

    public final boolean w0() {
        Object objB = vm5.b(g0().deviceModel);
        if (objB instanceof DeviceModel) {
            return ((DeviceModel) objB).Q9();
        }
        throw new RuntimeException(objB + " not is " + DeviceModel.class.getCanonicalName());
    }

    public final void x0() {
        n8g.INSTANCE.e0();
        x0.d().b("/emergency_impl/EmergencyCallActivity").withBundle("settingsDeviceMacBundle", BundleKt.bundleOf(TuplesKt.to("settingsDeviceMac", g0().deviceMac), TuplesKt.to("settingsDeviceBleMac", g0().deviceBleMac), TuplesKt.to("settingsDeviceMacType", g0().deviceModel), TuplesKt.to("settingsDeviceMacVersion", g0().deviceVersion))).navigation();
    }
}
