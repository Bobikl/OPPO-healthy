package com.heytap.health.settings.watch.sporthealthsettings2.bloodsugar;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.vision.ct1;
import com.oplus.aiunit.vision.duk;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/bloodsugar/BloodSugarSettingViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/oplus/aiunit/vision/ct1;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "", "value", "", ClickApiEntity.TIME, "v0", "(ZILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class BloodSugarSettingViewModel extends SHSettingBaseViewModel<ct1> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodSugarSettingViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super ct1> continuation) {
        return h0().B().getBloodSugar();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt__SetsKt.linkedSetOf(SportHealthSetting.BLOOD_SUGAR_BEFORE_BED_TIME_VALUE, SportHealthSetting.BLOOD_SUGAR_TIME_VALUE, SportHealthSetting.BLOOD_SUGAR_BEFORE_BED_TIME_ENABLE, SportHealthSetting.BLOOD_SUGAR_BEFORE_EXERCISE_ENABLE, SportHealthSetting.BLOOD_SUGAR_BEFORE_EXERCISE_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object v0(boolean z, int i, @Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        BloodSugarSettingViewModel$setBloodSugarValue$1 bloodSugarSettingViewModel$setBloodSugarValue$1;
        Pair pair;
        if (continuation instanceof BloodSugarSettingViewModel$setBloodSugarValue$1) {
            bloodSugarSettingViewModel$setBloodSugarValue$1 = (BloodSugarSettingViewModel$setBloodSugarValue$1) continuation;
            int i2 = bloodSugarSettingViewModel$setBloodSugarValue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bloodSugarSettingViewModel$setBloodSugarValue$1.label = i2 - Integer.MIN_VALUE;
            } else {
                bloodSugarSettingViewModel$setBloodSugarValue$1 = new BloodSugarSettingViewModel$setBloodSugarValue$1(this, continuation);
            }
        } else {
            bloodSugarSettingViewModel$setBloodSugarValue$1 = new BloodSugarSettingViewModel$setBloodSugarValue$1(this, continuation);
        }
        Object objC = bloodSugarSettingViewModel$setBloodSugarValue$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = bloodSugarSettingViewModel$setBloodSugarValue$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                this = (BloodSugarSettingViewModel) bloodSugarSettingViewModel$setBloodSugarValue$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        if (str == null) {
            SportHealthSetting sportHealthSetting = SportHealthSetting.BLOOD_SUGAR_BEFORE_EXERCISE_VALUE;
            pair = TuplesKt.to(MapsKt__MapsKt.mapOf(TuplesKt.to(SportHealthSetting.BLOOD_SUGAR_BEFORE_EXERCISE_ENABLE, duk.e(z)), TuplesKt.to(sportHealthSetting, duk.o(i))), sportHealthSetting);
        } else {
            SportHealthSetting sportHealthSetting2 = SportHealthSetting.BLOOD_SUGAR_BEFORE_BED_TIME_VALUE;
            pair = TuplesKt.to(MapsKt__MapsKt.mapOf(TuplesKt.to(SportHealthSetting.BLOOD_SUGAR_BEFORE_BED_TIME_ENABLE, duk.e(z)), TuplesKt.to(sportHealthSetting2, duk.o(i)), TuplesKt.to(SportHealthSetting.BLOOD_SUGAR_TIME_VALUE, str)), sportHealthSetting2);
        }
        MutableLiveData<Integer> mutableLiveDataW = h0().w((SportHealthSetting) pair.component2(), (Map) pair.component1());
        bloodSugarSettingViewModel$setBloodSugarValue$1.L$0 = this;
        bloodSugarSettingViewModel$setBloodSugarValue$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataW, bloodSugarSettingViewModel$setBloodSugarValue$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        bloodSugarSettingViewModel$setBloodSugarValue$1.L$0 = null;
        bloodSugarSettingViewModel$setBloodSugarValue$1.label = 2;
        objC = this.s0((Integer) objC, bloodSugarSettingViewModel$setBloodSugarValue$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }
}
