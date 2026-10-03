package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.heytap.sporthealth.blib.helper.SimplifyDialogKt;
import com.oplus.aiunit.model.AppInstallBean;
import com.oplus.aiunit.model.Spo2DailyMonitorUiState;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.wbg;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u0012\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/Spo2DailyMonitorViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/oplus/aiunit/vision/eci;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "enable", "z0", "(Landroid/app/Activity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "value", "y0", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onCleared", "Lcom/oplus/aiunit/vision/ob0;", "install", "A0", "Landroidx/lifecycle/Observer;", "w", "Landroidx/lifecycle/Observer;", "appInstallObserver", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class Spo2DailyMonitorViewModel extends SHSettingBaseViewModel<Spo2DailyMonitorUiState> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Observer<AppInstallBean> appInstallObserver;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/ob0;", "bean", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a implements Observer<AppInstallBean> {
        public a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull AppInstallBean appInstallBean) {
            Intrinsics.checkNotNullParameter(appInstallBean, "bean");
            Spo2DailyMonitorViewModel spo2DailyMonitorViewModel = Spo2DailyMonitorViewModel.this;
            spo2DailyMonitorViewModel.S(spo2DailyMonitorViewModel.A0(appInstallBean));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2DailyMonitorViewModel(@NotNull SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "stateHandle");
        this.appInstallObserver = new a();
    }

    public static /* synthetic */ Spo2DailyMonitorUiState B0(Spo2DailyMonitorViewModel spo2DailyMonitorViewModel, AppInstallBean appInstallBean, int i, Object obj) {
        if ((i & 1) != 0 && (appInstallBean = (AppInstallBean) spo2DailyMonitorViewModel.h0().z().getValue()) == null) {
            appInstallBean = new AppInstallBean(false, false, false, false, false, false, false, false, false, 511, null);
        }
        return spo2DailyMonitorViewModel.A0(appInstallBean);
    }

    public final Spo2DailyMonitorUiState A0(AppInstallBean install) {
        return new Spo2DailyMonitorUiState(h0().B().getSpo2AllDayMonitor(), install);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super Spo2DailyMonitorUiState> continuation) {
        Spo2DailyMonitorViewModel$loadData$1 spo2DailyMonitorViewModel$loadData$1;
        if (continuation instanceof Spo2DailyMonitorViewModel$loadData$1) {
            spo2DailyMonitorViewModel$loadData$1 = (Spo2DailyMonitorViewModel$loadData$1) continuation;
            int i = spo2DailyMonitorViewModel$loadData$1.label;
            if ((i & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                spo2DailyMonitorViewModel$loadData$1.label = i - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                spo2DailyMonitorViewModel$loadData$1 = new Spo2DailyMonitorViewModel$loadData$1(this, continuation);
            }
        } else {
            spo2DailyMonitorViewModel$loadData$1 = new Spo2DailyMonitorViewModel$loadData$1(this, continuation);
        }
        Object obj = spo2DailyMonitorViewModel$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = spo2DailyMonitorViewModel$loadData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            Spo2DailyMonitorViewModel$loadData$2 spo2DailyMonitorViewModel$loadData$2 = new Spo2DailyMonitorViewModel$loadData$2(this, null);
            spo2DailyMonitorViewModel$loadData$1.L$0 = this;
            spo2DailyMonitorViewModel$loadData$1.label = 1;
            if (BuildersKt.withContext(main, spo2DailyMonitorViewModel$loadData$2, spo2DailyMonitorViewModel$loadData$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (Spo2DailyMonitorViewModel) spo2DailyMonitorViewModel$loadData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return B0(this, null, 1, null);
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public void onCleared() {
        h0().z().removeObserver(this.appInstallObserver);
        super.onCleared();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE, SportHealthSetting.LOW_SPO2_WARNING_ENABLE, SportHealthSetting.SPO2_WARNING_VALUE});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object y0(boolean z, int i, @NotNull Continuation<? super Boolean> continuation) {
        Spo2DailyMonitorViewModel$setSpo2LowWarning$1 spo2DailyMonitorViewModel$setSpo2LowWarning$1;
        if (continuation instanceof Spo2DailyMonitorViewModel$setSpo2LowWarning$1) {
            spo2DailyMonitorViewModel$setSpo2LowWarning$1 = (Spo2DailyMonitorViewModel$setSpo2LowWarning$1) continuation;
            int i2 = spo2DailyMonitorViewModel$setSpo2LowWarning$1.label;
            if ((i2 & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                spo2DailyMonitorViewModel$setSpo2LowWarning$1.label = i2 - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                spo2DailyMonitorViewModel$setSpo2LowWarning$1 = new Spo2DailyMonitorViewModel$setSpo2LowWarning$1(this, continuation);
            }
        } else {
            spo2DailyMonitorViewModel$setSpo2LowWarning$1 = new Spo2DailyMonitorViewModel$setSpo2LowWarning$1(this, continuation);
        }
        Object objC = spo2DailyMonitorViewModel$setSpo2LowWarning$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = spo2DailyMonitorViewModel$setSpo2LowWarning$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                this = (Spo2DailyMonitorViewModel) spo2DailyMonitorViewModel$setSpo2LowWarning$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        SHSettingViewModel sHSettingViewModelH0 = h0();
        SportHealthSetting sportHealthSetting = SportHealthSetting.LOW_SPO2_WARNING_ENABLE;
        MutableLiveData<Integer> mutableLiveDataW = sHSettingViewModelH0.w(sportHealthSetting, MapsKt.mapOf(new Pair[]{TuplesKt.to(sportHealthSetting, byk.e(z)), TuplesKt.to(SportHealthSetting.SPO2_WARNING_VALUE, byk.o(i))}));
        spo2DailyMonitorViewModel$setSpo2LowWarning$1.L$0 = this;
        spo2DailyMonitorViewModel$setSpo2LowWarning$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataW, spo2DailyMonitorViewModel$setSpo2LowWarning$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        Spo2DailyMonitorViewModel$setSpo2LowWarning$2 spo2DailyMonitorViewModel$setSpo2LowWarning$2 = new Spo2DailyMonitorViewModel$setSpo2LowWarning$2(this, null);
        spo2DailyMonitorViewModel$setSpo2LowWarning$1.L$0 = null;
        spo2DailyMonitorViewModel$setSpo2LowWarning$1.label = 2;
        objC = this.t0((Integer) objC, spo2DailyMonitorViewModel$setSpo2LowWarning$2, spo2DailyMonitorViewModel$setSpo2LowWarning$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6 A[PHI: r14
  0x00b6: PHI (r14v11 java.lang.Object) = (r14v10 java.lang.Object), (r14v1 java.lang.Object) binds: [B:32:0x00b3, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object z0(@NotNull Activity activity, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        Spo2DailyMonitorViewModel$setSpo2Monitor$1 spo2DailyMonitorViewModel$setSpo2Monitor$1;
        if (continuation instanceof Spo2DailyMonitorViewModel$setSpo2Monitor$1) {
            spo2DailyMonitorViewModel$setSpo2Monitor$1 = (Spo2DailyMonitorViewModel$setSpo2Monitor$1) continuation;
            int i = spo2DailyMonitorViewModel$setSpo2Monitor$1.label;
            if ((i & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                spo2DailyMonitorViewModel$setSpo2Monitor$1.label = i - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                spo2DailyMonitorViewModel$setSpo2Monitor$1 = new Spo2DailyMonitorViewModel$setSpo2Monitor$1(this, continuation);
            }
        } else {
            spo2DailyMonitorViewModel$setSpo2Monitor$1 = new Spo2DailyMonitorViewModel$setSpo2Monitor$1(this, continuation);
        }
        Object objO = spo2DailyMonitorViewModel$setSpo2Monitor$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = spo2DailyMonitorViewModel$setSpo2Monitor$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                z = spo2DailyMonitorViewModel$setSpo2Monitor$1.Z$0;
                this = (Spo2DailyMonitorViewModel) spo2DailyMonitorViewModel$setSpo2Monitor$1.L$0;
                ResultKt.throwOnFailure(objO);
            } else if (i2 == 2) {
                this = (Spo2DailyMonitorViewModel) spo2DailyMonitorViewModel$setSpo2Monitor$1.L$0;
                ResultKt.throwOnFailure(objO);
                Spo2DailyMonitorViewModel$setSpo2Monitor$2 spo2DailyMonitorViewModel$setSpo2Monitor$2 = new Spo2DailyMonitorViewModel$setSpo2Monitor$2(this, null);
                spo2DailyMonitorViewModel$setSpo2Monitor$1.L$0 = null;
                spo2DailyMonitorViewModel$setSpo2Monitor$1.label = 3;
                objO = this.t0((Integer) objO, spo2DailyMonitorViewModel$setSpo2Monitor$2, spo2DailyMonitorViewModel$setSpo2Monitor$1);
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objO);
            }
            return objO;
        }
        ResultKt.throwOnFailure(objO);
        if (z) {
            int i3 = R.string.band_spo2_auto_monitor;
            String strL = swf.l(R.string.band_spo2_auto_monitor_desc);
            int i4 = R.string.settings_cancel;
            int i5 = R.string.band_setting_spo2_dialog_sure;
            spo2DailyMonitorViewModel$setSpo2Monitor$1.L$0 = this;
            spo2DailyMonitorViewModel$setSpo2Monitor$1.Z$0 = z;
            spo2DailyMonitorViewModel$setSpo2Monitor$1.label = 1;
            objO = SimplifyDialogKt.O(activity, i3, strL, i4, i5, spo2DailyMonitorViewModel$setSpo2Monitor$1);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        SHSettingViewModel sHSettingViewModelH0 = this.h0();
        SportHealthSetting sportHealthSetting = SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE;
        MutableLiveData<Integer> mutableLiveDataW = sHSettingViewModelH0.w(sportHealthSetting, MapsKt.mapOf(TuplesKt.to(sportHealthSetting, byk.e(z))));
        spo2DailyMonitorViewModel$setSpo2Monitor$1.L$0 = this;
        spo2DailyMonitorViewModel$setSpo2Monitor$1.label = 2;
        objO = ExpandKt.c(mutableLiveDataW, spo2DailyMonitorViewModel$setSpo2Monitor$1);
        if (objO == coroutine_suspended) {
            return coroutine_suspended;
        }
        Spo2DailyMonitorViewModel$setSpo2Monitor$2 spo2DailyMonitorViewModel$setSpo2Monitor$3 = new Spo2DailyMonitorViewModel$setSpo2Monitor$2(this, null);
        spo2DailyMonitorViewModel$setSpo2Monitor$1.L$0 = null;
        spo2DailyMonitorViewModel$setSpo2Monitor$1.label = 3;
        objO = this.t0((Integer) objO, spo2DailyMonitorViewModel$setSpo2Monitor$3, spo2DailyMonitorViewModel$setSpo2Monitor$1);
        if (objO == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objO;
        if (!((Boolean) objO).booleanValue()) {
            wbg.INSTANCE.j0(1);
            return Boxing.boxBoolean(false);
        }
        wbg.INSTANCE.j0(2);
        SHSettingViewModel sHSettingViewModelH1 = this.h0();
        SportHealthSetting sportHealthSetting2 = SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE;
        MutableLiveData<Integer> mutableLiveDataW2 = sHSettingViewModelH1.w(sportHealthSetting2, MapsKt.mapOf(TuplesKt.to(sportHealthSetting2, byk.e(z))));
        spo2DailyMonitorViewModel$setSpo2Monitor$1.L$0 = this;
        spo2DailyMonitorViewModel$setSpo2Monitor$1.label = 2;
        objO = ExpandKt.c(mutableLiveDataW2, spo2DailyMonitorViewModel$setSpo2Monitor$1);
        if (objO == coroutine_suspended) {
            return coroutine_suspended;
        }
        Spo2DailyMonitorViewModel$setSpo2Monitor$2 spo2DailyMonitorViewModel$setSpo2Monitor$4 = new Spo2DailyMonitorViewModel$setSpo2Monitor$2(this, null);
        spo2DailyMonitorViewModel$setSpo2Monitor$1.L$0 = null;
        spo2DailyMonitorViewModel$setSpo2Monitor$1.label = 3;
        objO = this.t0((Integer) objO, spo2DailyMonitorViewModel$setSpo2Monitor$4, spo2DailyMonitorViewModel$setSpo2Monitor$1);
        if (objO == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objO;
    }
}