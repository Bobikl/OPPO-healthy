package com.heytap.health.settings.watch.sporthealthsettings2.spo2monitor;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.settings.watch.sporthealthsettings.bean.a0;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingViewModel;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.heytap.sporthealth.blib.helper.SimplifyDialogKt;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.vision.swf;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/spo2monitor/Spo2SettingViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a0;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "enable", "interval", "w0", "(Landroid/app/Activity;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class Spo2SettingViewModel extends SHSettingBaseViewModel<a0> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2SettingViewModel(@NotNull SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "stateHandle");
    }

    public static final /* synthetic */ Object x0(Spo2SettingViewModel spo2SettingViewModel, Continuation continuation) {
        return spo2SettingViewModel.y0();
    }

    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super a0> continuation) {
        return y0();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.OXIMETRY, SportHealthSetting.OXIMETRY_TYPE, SportHealthSetting.AUTO_STOP_AUDIO_FILE_ENABLE, SportHealthSetting.AUTO_CLEAN_UP_AUDIO_FILE_ENABLE, SportHealthSetting.AUDIO_FILE_KEEP_TO_CLOUD_ENABLE, SportHealthSetting.AUTOMATIC_SNORING_MONITOR_ENABLE});
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4 A[PHI: r2
  0x00f4: PHI (r2v14 java.lang.Object) = (r2v13 java.lang.Object), (r2v1 java.lang.Object) binds: [B:38:0x00f1, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object w0(@Nullable Activity activity, boolean z, boolean z2, @NotNull Continuation<? super Boolean> continuation) {
        Spo2SettingViewModel$changeSpo2$1 spo2SettingViewModel$changeSpo2$1;
        boolean z3;
        Object obj;
        Spo2SettingViewModel spo2SettingViewModel;
        Spo2SettingViewModel spo2SettingViewModel2 = this;
        boolean z4 = z;
        if (continuation instanceof Spo2SettingViewModel$changeSpo2$1) {
            spo2SettingViewModel$changeSpo2$1 = (Spo2SettingViewModel$changeSpo2$1) continuation;
            int i = spo2SettingViewModel$changeSpo2$1.label;
            if ((i & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                spo2SettingViewModel$changeSpo2$1.label = i - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                spo2SettingViewModel$changeSpo2$1 = new Spo2SettingViewModel$changeSpo2$1(spo2SettingViewModel2, continuation);
            }
        } else {
            spo2SettingViewModel$changeSpo2$1 = new Spo2SettingViewModel$changeSpo2$1(spo2SettingViewModel2, continuation);
        }
        Object objC = spo2SettingViewModel$changeSpo2$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = spo2SettingViewModel$changeSpo2$1.label;
        char c = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z5 = spo2SettingViewModel$changeSpo2$1.Z$1;
                z4 = spo2SettingViewModel$changeSpo2$1.Z$0;
                Spo2SettingViewModel spo2SettingViewModel3 = (Spo2SettingViewModel) spo2SettingViewModel$changeSpo2$1.L$0;
                ResultKt.throwOnFailure(objC);
                z3 = z5;
                spo2SettingViewModel2 = spo2SettingViewModel3;
                obj = objC;
            } else if (i2 == 2) {
                spo2SettingViewModel2 = (Spo2SettingViewModel) spo2SettingViewModel$changeSpo2$1.L$1;
                spo2SettingViewModel = (Spo2SettingViewModel) spo2SettingViewModel$changeSpo2$1.L$0;
                ResultKt.throwOnFailure(objC);
                Spo2SettingViewModel$changeSpo2$2 spo2SettingViewModel$changeSpo2$2 = new Spo2SettingViewModel$changeSpo2$2(spo2SettingViewModel);
                spo2SettingViewModel$changeSpo2$1.L$0 = null;
                spo2SettingViewModel$changeSpo2$1.L$1 = null;
                spo2SettingViewModel$changeSpo2$1.label = 3;
                objC = spo2SettingViewModel2.t0((Integer) objC, spo2SettingViewModel$changeSpo2$2, spo2SettingViewModel$changeSpo2$1);
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
        if (!z4 || activity == null) {
            c = 1;
            z3 = z2;
        } else {
            int i3 = R.string.band_open_spo2;
            String strL = swf.l(R.string.band_open_spo2_notice);
            int i4 = R.string.band_setting_spo2_dialog_sure;
            spo2SettingViewModel$changeSpo2$1.L$0 = spo2SettingViewModel2;
            spo2SettingViewModel$changeSpo2$1.Z$0 = z4;
            spo2SettingViewModel$changeSpo2$1.Z$1 = z2;
            spo2SettingViewModel$changeSpo2$1.label = 1;
            Object objP = SimplifyDialogKt.P(activity, i3, strL, 0, i4, spo2SettingViewModel$changeSpo2$1, 4, (Object) null);
            if (objP == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objP;
            z3 = z2;
        }
        SHSettingViewModel sHSettingViewModelH0 = spo2SettingViewModel2.h0();
        SportHealthSetting sportHealthSetting = SportHealthSetting.OXIMETRY;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to(sportHealthSetting, byk.e(z4));
        pairArr[c] = TuplesKt.to(SportHealthSetting.OXIMETRY_TYPE, byk.e(z3));
        MutableLiveData<Integer> mutableLiveDataW = sHSettingViewModelH0.w(sportHealthSetting, MapsKt.mapOf(pairArr));
        spo2SettingViewModel$changeSpo2$1.L$0 = spo2SettingViewModel2;
        spo2SettingViewModel$changeSpo2$1.L$1 = spo2SettingViewModel2;
        spo2SettingViewModel$changeSpo2$1.label = 2;
        objC = ExpandKt.c(mutableLiveDataW, spo2SettingViewModel$changeSpo2$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        spo2SettingViewModel = spo2SettingViewModel2;
        Spo2SettingViewModel$changeSpo2$2 spo2SettingViewModel$changeSpo2$3 = new Spo2SettingViewModel$changeSpo2$2(spo2SettingViewModel);
        spo2SettingViewModel$changeSpo2$1.L$0 = null;
        spo2SettingViewModel$changeSpo2$1.L$1 = null;
        spo2SettingViewModel$changeSpo2$1.label = 3;
        objC = spo2SettingViewModel2.t0((Integer) objC, spo2SettingViewModel$changeSpo2$3, spo2SettingViewModel$changeSpo2$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objC;
        if (!((Boolean) obj).booleanValue()) {
            return Boxing.boxBoolean(false);
        }
        if (spo2SettingViewModel2.k0()) {
            com.heytap.health.base.track.a.B(25, 0);
        }
        SHSettingViewModel sHSettingViewModelH1 = spo2SettingViewModel2.h0();
        SportHealthSetting sportHealthSetting2 = SportHealthSetting.OXIMETRY;
        Pair[] pairArr2 = new Pair[2];
        pairArr2[0] = TuplesKt.to(sportHealthSetting2, byk.e(z4));
        pairArr2[c] = TuplesKt.to(SportHealthSetting.OXIMETRY_TYPE, byk.e(z3));
        MutableLiveData<Integer> mutableLiveDataW2 = sHSettingViewModelH1.w(sportHealthSetting2, MapsKt.mapOf(pairArr2));
        spo2SettingViewModel$changeSpo2$1.L$0 = spo2SettingViewModel2;
        spo2SettingViewModel$changeSpo2$1.L$1 = spo2SettingViewModel2;
        spo2SettingViewModel$changeSpo2$1.label = 2;
        objC = ExpandKt.c(mutableLiveDataW2, spo2SettingViewModel$changeSpo2$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        spo2SettingViewModel = spo2SettingViewModel2;
        Spo2SettingViewModel$changeSpo2$2 spo2SettingViewModel$changeSpo2$4 = new Spo2SettingViewModel$changeSpo2$2(spo2SettingViewModel);
        spo2SettingViewModel$changeSpo2$1.L$0 = null;
        spo2SettingViewModel$changeSpo2$1.L$1 = null;
        spo2SettingViewModel$changeSpo2$1.label = 3;
        objC = spo2SettingViewModel2.t0((Integer) objC, spo2SettingViewModel$changeSpo2$4, spo2SettingViewModel$changeSpo2$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objC;
    }

    public final a0 y0() {
        return h0().B().getSpo2();
    }
}