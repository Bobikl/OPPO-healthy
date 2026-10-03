package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.settings.DeviceSettings;
import com.heytap.health.settings.watch.sporthealthsettings.activity.customize.CustomizeListActivity;
import com.heytap.health.settings.watch.sporthealthsettings2.autorecognizesport.AutoRecognizeSportActivity;
import com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingActivity;
import com.heytap.health.settings.watch.sporthealthsettings2.spo2monitor.SleepSpo2IntervalMonitorSettingActivity;
import com.heytap.health.settings.watch.sporthealthsettings2.spo2monitor.Spo2SettingActivity;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.model.AppInstallBean;
import com.oplus.aiunit.model.SHSettingHomeData;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.wbg;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.mp5;
import com.oplus.aiunit.vision.th7;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u00106\u001a\u00020\b¢\u0006\u0004\bH\u0010IJ\u0012\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0014J#\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0016J\u001b\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0016J\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0018\u0010#\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020!J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0016\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010+\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010,\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010/\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u00100\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u00101\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u00102\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ\b\u00103\u001a\u00020\u001fH\u0014R\u0014\u00106\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00030D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainVm;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/oplus/aiunit/vision/qag;", "Lcom/oplus/aiunit/vision/ob0;", "install", "J0", "", "f0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "settingItem", "newStatus", "F0", "(Lcom/heytap/health/device_settings/health/SportHealthSetting;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "stepGoal", "D0", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "caloriesGoal", "B0", "exerciseTimeGoal", "C0", "activityGoal", "A0", "Landroid/app/Activity;", "activity", "", "Y0", "", "dataFrom", "O0", "a1", "Z0", "N0", "title", "M0", "d1", "e1", "V0", "W0", "S0", "X0", "Q0", "L0", "R0", "f1", "onCleared", "w", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/heytap/health/settings/DeviceSettings$SettingAbility;", "x", "Lcom/heytap/health/settings/DeviceSettings$SettingAbility;", "G0", "()Lcom/heytap/health/settings/DeviceSettings$SettingAbility;", "setDeviceSettingAbility", "(Lcom/heytap/health/settings/DeviceSettings$SettingAbility;)V", "deviceSettingAbility", "y", "Lkotlin/Lazy;", "H0", "()I", "pageType", "Landroidx/lifecycle/Observer;", "z", "Landroidx/lifecycle/Observer;", "appInstallObserver", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSHSettingMainVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SHSettingMainVm.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainVm\n+ 2 SHSettingMainVm.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainVm$goTo$1\n*L\n1#1,304:1\n194#1,7:305\n201#1,2:313\n194#1,7:315\n201#1,2:323\n194#1,7:325\n201#1,2:333\n194#1,7:335\n201#1,2:343\n194#1,7:345\n201#1,2:353\n195#1,8:355\n194#1,7:363\n201#1,2:371\n194#1,7:373\n201#1,2:381\n194#1,7:383\n201#1,2:391\n194#1,7:393\n201#1,2:401\n194#1,7:403\n201#1,2:411\n194#1,7:413\n201#1,2:421\n194#1,7:423\n201#1,2:431\n194#1,7:433\n201#1,2:441\n194#1,7:443\n201#1,2:451\n194#1,7:453\n201#1,2:461\n194#2:312\n194#2:322\n194#2:332\n194#2:342\n194#2:352\n194#2:370\n194#2:380\n194#2:390\n194#2:400\n194#2:410\n194#2:420\n194#2:430\n194#2:440\n194#2:450\n194#2:460\n*S KotlinDebug\n*F\n+ 1 SHSettingMainVm.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainVm\n*L\n206#1:305,7\n206#1:313,2\n224#1:315,7\n224#1:323,2\n230#1:325,7\n230#1:333,2\n236#1:335,7\n236#1:343,2\n238#1:345,7\n238#1:353,2\n244#1:355,8\n252#1:363,7\n252#1:371,2\n258#1:373,7\n258#1:381,2\n263#1:383,7\n263#1:391,2\n268#1:393,7\n268#1:401,2\n273#1:403,7\n273#1:411,2\n277#1:413,7\n277#1:421,2\n282#1:423,7\n282#1:431,2\n287#1:433,7\n287#1:441,2\n292#1:443,7\n292#1:451,2\n297#1:453,7\n297#1:461,2\n206#1:312\n224#1:322\n230#1:332\n236#1:342\n238#1:352\n252#1:370\n258#1:380\n263#1:390\n268#1:400\n273#1:410\n277#1:420\n282#1:430\n287#1:440\n292#1:450\n297#1:460\n*E\n"})
public final class SHSettingMainVm extends SHSettingBaseViewModel<SHSettingHomeData> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final SavedStateHandle savedStateHandle;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public DeviceSettings.SettingAbility deviceSettingAbility;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageType;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Observer<AppInstallBean> appInstallObserver;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/ob0;", "bean", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a implements Observer<AppInstallBean> {
        public a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull AppInstallBean ob0Var) {
            Intrinsics.checkNotNullParameter(ob0Var, "bean");
            SHSettingMainVm sHSettingMainVm = SHSettingMainVm.this;
            sHSettingMainVm.S(sHSettingMainVm.J0(ob0Var));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHSettingMainVm(@NotNull SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.pageType = LazyKt.lazy(new Function0<Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainVm$pageType$2
            {
                super(0);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m138invoke() {
                Integer num = (Integer) this.this$0.savedStateHandle.get(SHSettingMainUI.PAGE_TYPE);
                return Integer.valueOf(num != null ? num.intValue() : 0);
            }
        });
        this.appInstallObserver = new a();
    }

    public static /* synthetic */ SHSettingHomeData K0(SHSettingMainVm sHSettingMainVm, AppInstallBean ob0Var, int i, Object obj) {
        if ((i & 1) != 0 && (ob0Var = (AppInstallBean) sHSettingMainVm.h0().z().getValue()) == null) {
            ob0Var = new AppInstallBean(false, false, false, false, false, false, false, false, false, 511, null);
        }
        return sHSettingMainVm.J0(ob0Var);
    }

    public static /* synthetic */ void P0(SHSettingMainVm sHSettingMainVm, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "data_from_phone";
        }
        sHSettingMainVm.O0(activity, str);
    }

    @Nullable
    public final Object A0(int i, @NotNull Continuation<? super Boolean> continuation) {
        return e0(new SHSettingMainVm$changeActivityGoal$2(this, i, null), continuation);
    }

    @Nullable
    public final Object B0(int i, @NotNull Continuation<? super Boolean> continuation) {
        return e0(new SHSettingMainVm$changeCaloriesGoal$2(this, i, null), continuation);
    }

    @Nullable
    public final Object C0(int i, @NotNull Continuation<? super Boolean> continuation) {
        return e0(new SHSettingMainVm$changeExerciseTimeGoal$2(this, i, null), continuation);
    }

    @Nullable
    public final Object D0(int i, @NotNull Continuation<? super Boolean> continuation) {
        return e0(new SHSettingMainVm$changeStepGoal$2(this, i, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object F0(@NotNull SportHealthSetting sportHealthSetting, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        SHSettingMainVm$changeSwitch$1 sHSettingMainVm$changeSwitch$1;
        SHSettingMainVm sHSettingMainVm;
        if (continuation instanceof SHSettingMainVm$changeSwitch$1) {
            sHSettingMainVm$changeSwitch$1 = (SHSettingMainVm$changeSwitch$1) continuation;
            int i = sHSettingMainVm$changeSwitch$1.label;
            if ((i & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                sHSettingMainVm$changeSwitch$1.label = i - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                sHSettingMainVm$changeSwitch$1 = new SHSettingMainVm$changeSwitch$1(this, continuation);
            }
        } else {
            sHSettingMainVm$changeSwitch$1 = new SHSettingMainVm$changeSwitch$1(this, continuation);
        }
        Object objC = sHSettingMainVm$changeSwitch$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sHSettingMainVm$changeSwitch$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (SHSettingMainVm) sHSettingMainVm$changeSwitch$1.L$1;
                sHSettingMainVm = (SHSettingMainVm) sHSettingMainVm$changeSwitch$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        MutableLiveData<Integer> mutableLiveDataW = h0().w(sportHealthSetting, MapsKt.mapOf(TuplesKt.to(sportHealthSetting, byk.e(z))));
        sHSettingMainVm$changeSwitch$1.L$0 = this;
        sHSettingMainVm$changeSwitch$1.L$1 = this;
        sHSettingMainVm$changeSwitch$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataW, sHSettingMainVm$changeSwitch$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        sHSettingMainVm = this;
        SHSettingMainVm$changeSwitch$2 sHSettingMainVm$changeSwitch$2 = new SHSettingMainVm$changeSwitch$2(sHSettingMainVm, null);
        sHSettingMainVm$changeSwitch$1.L$0 = null;
        sHSettingMainVm$changeSwitch$1.L$1 = null;
        sHSettingMainVm$changeSwitch$1.label = 2;
        objC = this.t0((Integer) objC, sHSettingMainVm$changeSwitch$2, sHSettingMainVm$changeSwitch$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }

    @Nullable
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final DeviceSettings.SettingAbility getDeviceSettingAbility() {
        return this.deviceSettingAbility;
    }

    public final int H0() {
        return ((Number) this.pageType.getValue()).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super SHSettingHomeData> continuation) {
        SHSettingMainVm$loadData$1 sHSettingMainVm$loadData$1;
        if (continuation instanceof SHSettingMainVm$loadData$1) {
            sHSettingMainVm$loadData$1 = (SHSettingMainVm$loadData$1) continuation;
            int i = sHSettingMainVm$loadData$1.label;
            if ((i & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                sHSettingMainVm$loadData$1.label = i - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                sHSettingMainVm$loadData$1 = new SHSettingMainVm$loadData$1(this, continuation);
            }
        } else {
            sHSettingMainVm$loadData$1 = new SHSettingMainVm$loadData$1(this, continuation);
        }
        Object obj = sHSettingMainVm$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sHSettingMainVm$loadData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.deviceSettingAbility = b0().o5();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            SHSettingMainVm$loadData$2 sHSettingMainVm$loadData$2 = new SHSettingMainVm$loadData$2(this, null);
            sHSettingMainVm$loadData$1.L$0 = this;
            sHSettingMainVm$loadData$1.label = 1;
            if (BuildersKt.withContext(main, sHSettingMainVm$loadData$2, sHSettingMainVm$loadData$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (SHSettingMainVm) sHSettingMainVm$loadData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return K0(this, null, 1, null);
    }

    public final SHSettingHomeData J0(AppInstallBean install) {
        return new SHSettingHomeData(h0().B(), install);
    }

    public final void L0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.d();
        Intent intent = new Intent(activity, (Class<?>) AFibSettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void M0(int title, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.j();
        Intent intent = new Intent(activity, (Class<?>) AutoRecognizeSportActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        intent.putExtra("title", title);
        activity.startActivity(intent);
    }

    public final void N0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (((Boolean) gd5.c(g0().deviceMac).a(SHSettingMainVm$toBloodOxygenMonitorActivity$1.INSTANCE)).booleanValue()) {
            Intent intent = new Intent(activity, (Class<?>) Spo2SettingActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("setting_device_params", g0());
            intent.putExtra("sleep_setting_bundle_key", bundle);
            intent.putExtra("setting_device_params", (Parcelable) g0());
            activity.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(activity, (Class<?>) SleepSpo2IntervalMonitorSettingActivity.class);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("setting_device_params", g0());
        intent2.putExtra("sleep_setting_bundle_key", bundle2);
        intent2.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent2);
    }

    public final void O0(@NotNull Activity activity, @NotNull String dataFrom) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dataFrom, "dataFrom");
        if (mp5.a(getMac()).I6()) {
            CustomizeListActivity.F7(activity, dataFrom, getMac(), g0().deviceModel);
            return;
        }
        int iY = mp5.a(getMac()).Y(true);
        if (iY != -1) {
            th7.l(iY);
        } else {
            CustomizeListActivity.F7(activity, dataFrom, getMac(), g0().deviceModel);
        }
    }

    public final void Q0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.d();
        Intent intent = new Intent(activity, (Class<?>) DailyActivityNotificationSettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void R0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.t0();
        Intent intent = new Intent(activity, (Class<?>) FallDownSettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void S0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.h();
        Intent intent = new Intent(activity, (Class<?>) HeartRateSettingActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void V0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.O();
        Intent intent = new Intent(activity, (Class<?>) PhysicalMentalHealthGoalSettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void W0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.O();
        Intent intent = new Intent(activity, (Class<?>) QuietHeartRateSettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void X0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(activity, (Class<?>) SedentarySettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void Y0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.Y();
        Intent intent = new Intent(activity, (Class<?>) SleepAndRemindSettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void Z0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.V();
        Intent intent = new Intent(activity, (Class<?>) SleepBreathingRateActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void a1(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.b0();
        Intent intent = new Intent(activity, (Class<?>) SleepRapidEyeMonitorSettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void d1(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.d0();
        Intent intent = new Intent(activity, (Class<?>) SnoringRiskAssessmentActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    public final void e1(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.f0();
        Intent intent = new Intent(activity, (Class<?>) Spo2DailyMonitorSettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    public final void f1(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        wbg.INSTANCE.J();
        Intent intent = new Intent(activity, (Class<?>) SportHeartRateSettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("setting_device_params", g0());
        intent.putExtra("sleep_setting_bundle_key", bundle);
        intent.putExtra("setting_device_params", (Parcelable) g0());
        activity.startActivity(intent);
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public void onCleared() {
        h0().z().removeObserver(this.appInstallObserver);
        super.onCleared();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        switch (H0()) {
            case 1:
                return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.STEP_GOAL_VALUE, SportHealthSetting.CALORIE_GOAL_VALUE, SportHealthSetting.EXERCISE_TIME_GOAL_VALUE, SportHealthSetting.ACTIVITY_GOAL_VALUE, SportHealthSetting.SEDENTARY_REMIND_ENABLE, SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE, SportHealthSetting.ACTIVITY_PRAISE_NOTIFY_ENABLE, SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE, SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE});
            case 2:
                return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.FALL_DOWN_ENABLE});
            case 3:
                return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE, SportHealthSetting.HEART_RATE_TYPE, SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE, SportHealthSetting.QUIET_RATE_VALUE, SportHealthSetting.QUIET_RATE_LOW_VALUE, SportHealthSetting.HIGH_RATE_NOTIFICATION_ENABLE, SportHealthSetting.HIGH_RATE_VALUE, SportHealthSetting.AFIB_ENABLE});
            case 4:
                return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.STRESS_AUTO_MEASURE_ENABLE, SportHealthSetting.STRESS_HIGH_NOTIFY_ENABLE, SportHealthSetting.ACHIEVEMENT_REMINDER_ENABLE});
            case 5:
                return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE, SportHealthSetting.LOW_SPO2_WARNING_ENABLE, SportHealthSetting.SPO2_WARNING_VALUE});
            case 6:
                return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.MENSTRUAL_CYCLE_ENABLE});
            case 7:
                return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.SLEEP_APNEA_MONITORING, SportHealthSetting.OSA_ENABLE, SportHealthSetting.SLEEP_BREATHING_RATE_ENABLE, SportHealthSetting.OXIMETRY, SportHealthSetting.OXIMETRY_TYPE, SportHealthSetting.SLEEP_REM_ENABLE});
            case 8:
                return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.AUTO_PAUSE_SPORT_ENABLE, SportHealthSetting.AUTO_RECOGNIZE_SPORT_ENABLE, SportHealthSetting.CONTINUE_SPORT_REMINDER_ENABLE, SportHealthSetting.END_SPORT_REMINDER_ENABLE, SportHealthSetting.SPORTS_VOICE_BROADCAST_ENABLE, SportHealthSetting.DOUBLE_CLICK_SCREEN_VOICE_BROADCAST_ENABLE, SportHealthSetting.BUTTON_TO_PAUSE_OR_RESUME_ENABLE});
            default:
                return new LinkedHashSet();
        }
    }
}