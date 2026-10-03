package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.device_settings.setting.IDeviceSettingService;
import com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.heytap.sporthealth.blib.helper.SimplifyDialogKt;
import com.oplus.aiunit.vision.SnoringRisk;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.duk;
import com.oplus.aiunit.vision.n8g;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.sgi;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.xm3;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.SafeContinuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0013\u0010\u0014\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SnoringRiskViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/oplus/aiunit/vision/h1i;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "enable", c8l.KEY_A0, "(Landroid/app/Activity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "C0", "x0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/device_settings/setting/IDeviceSettingService;", "w", "Lcom/heytap/health/device_settings/setting/IDeviceSettingService;", "getDeviceSettingService", "()Lcom/heytap/health/device_settings/setting/IDeviceSettingService;", "deviceSettingService", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SnoringRiskViewModel extends SHSettingBaseViewModel<SnoringRisk> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final IDeviceSettingService deviceSettingService;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "result", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements xm3 {
        public final /* synthetic */ Continuation<Boolean> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Continuation<? super Boolean> continuation) {
            this.a = continuation;
        }

        @Override // com.oplus.aiunit.vision.xm3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(Boolean bool) {
            this.a.resumeWith(Result.m5287constructorimpl(bool));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnoringRiskViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
        Object objNavigation = x0.d().b("/device_settings/DeviceSettingServiceImpl").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.device_settings.setting.IDeviceSettingService");
        this.deviceSettingService = (IDeviceSettingService) objNavigation;
    }

    public static final /* synthetic */ Object B0(SnoringRiskViewModel snoringRiskViewModel, Continuation continuation) {
        return snoringRiskViewModel.C0();
    }

    public static final /* synthetic */ Object z0(SnoringRiskViewModel snoringRiskViewModel, Continuation continuation) {
        return snoringRiskViewModel.C0();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:64:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x019a  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x01af A[PHI: r2
  0x01af: PHI (r2v31 java.lang.Object) = (r2v30 java.lang.Object), (r2v1 java.lang.Object) binds: [B:70:0x01ac, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object A0(@NotNull Activity activity, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        SnoringRiskViewModel$setSnoringRiskAssessment$1 snoringRiskViewModel$setSnoringRiskAssessment$1;
        Activity activity2;
        Activity activity3;
        MutableLiveData<Integer> mutableLiveDataW;
        SnoringRiskViewModel snoringRiskViewModel;
        SportHealthSetting sportHealthSetting;
        SnoringRiskViewModel snoringRiskViewModel2 = this;
        boolean z2 = z;
        if (continuation instanceof SnoringRiskViewModel$setSnoringRiskAssessment$1) {
            snoringRiskViewModel$setSnoringRiskAssessment$1 = (SnoringRiskViewModel$setSnoringRiskAssessment$1) continuation;
            int i = snoringRiskViewModel$setSnoringRiskAssessment$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                snoringRiskViewModel$setSnoringRiskAssessment$1.label = i - Integer.MIN_VALUE;
            } else {
                snoringRiskViewModel$setSnoringRiskAssessment$1 = new SnoringRiskViewModel$setSnoringRiskAssessment$1(snoringRiskViewModel2, continuation);
            }
        } else {
            snoringRiskViewModel$setSnoringRiskAssessment$1 = new SnoringRiskViewModel$setSnoringRiskAssessment$1(snoringRiskViewModel2, continuation);
        }
        Object objO = snoringRiskViewModel$setSnoringRiskAssessment$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = snoringRiskViewModel$setSnoringRiskAssessment$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objO);
            if (!rpc.c()) {
                rg7.l(R$string.settings_device_network_disconnect);
                return Boxing.boxBoolean(false);
            }
            if (z2) {
                snoringRiskViewModel$setSnoringRiskAssessment$1.L$0 = snoringRiskViewModel2;
                snoringRiskViewModel$setSnoringRiskAssessment$1.L$1 = activity;
                snoringRiskViewModel$setSnoringRiskAssessment$1.Z$0 = z2;
                snoringRiskViewModel$setSnoringRiskAssessment$1.label = 1;
                Object objX0 = snoringRiskViewModel2.x0(snoringRiskViewModel$setSnoringRiskAssessment$1);
                if (objX0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                activity2 = activity;
                objO = objX0;
            }
            if (sgi.a(snoringRiskViewModel2.g0().deviceMac).O5()) {
                SHSettingViewModel sHSettingViewModelH0 = snoringRiskViewModel2.h0();
                if (snoringRiskViewModel2.b0().z7()) {
                    sportHealthSetting = SportHealthSetting.SLEEP_APNEA_MONITORING;
                } else {
                    sportHealthSetting = SportHealthSetting.OSA_ENABLE;
                }
                mutableLiveDataW = sHSettingViewModelH0.x(sportHealthSetting, z2);
            } else {
                SHSettingViewModel sHSettingViewModelH1 = snoringRiskViewModel2.h0();
                SportHealthSetting sportHealthSetting2 = SportHealthSetting.OXIMETRY;
                mutableLiveDataW = sHSettingViewModelH1.w(sportHealthSetting2, MapsKt__MapsKt.mapOf(TuplesKt.to(sportHealthSetting2, duk.e(z2)), TuplesKt.to(SportHealthSetting.OXIMETRY_TYPE, duk.o(0))));
            }
            snoringRiskViewModel$setSnoringRiskAssessment$1.L$0 = snoringRiskViewModel2;
            snoringRiskViewModel$setSnoringRiskAssessment$1.L$1 = snoringRiskViewModel2;
            snoringRiskViewModel$setSnoringRiskAssessment$1.label = 4;
            objO = ExpandKt.c(mutableLiveDataW, snoringRiskViewModel$setSnoringRiskAssessment$1);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
            snoringRiskViewModel = snoringRiskViewModel2;
            SnoringRiskViewModel$setSnoringRiskAssessment$2 snoringRiskViewModel$setSnoringRiskAssessment$2 = new SnoringRiskViewModel$setSnoringRiskAssessment$2(snoringRiskViewModel);
            snoringRiskViewModel$setSnoringRiskAssessment$1.L$0 = null;
            snoringRiskViewModel$setSnoringRiskAssessment$1.L$1 = null;
            snoringRiskViewModel$setSnoringRiskAssessment$1.label = 5;
            objO = snoringRiskViewModel2.t0((Integer) objO, snoringRiskViewModel$setSnoringRiskAssessment$2, snoringRiskViewModel$setSnoringRiskAssessment$1);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objO;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                activity3 = (Activity) snoringRiskViewModel$setSnoringRiskAssessment$1.L$0;
                ResultKt.throwOnFailure(objO);
                if (!((Boolean) objO).booleanValue()) {
                    return Boxing.boxBoolean(false);
                }
                x0.d().b("/sleep/SnoreActivationActivity").navigation(activity3);
                return Boxing.boxBoolean(false);
            }
            if (i2 == 3) {
                boolean z3 = snoringRiskViewModel$setSnoringRiskAssessment$1.Z$0;
                SnoringRiskViewModel snoringRiskViewModel3 = (SnoringRiskViewModel) snoringRiskViewModel$setSnoringRiskAssessment$1.L$0;
                ResultKt.throwOnFailure(objO);
                z2 = z3;
                snoringRiskViewModel2 = snoringRiskViewModel3;
                if (!((Boolean) objO).booleanValue()) {
                    n8g.INSTANCE.c0(1);
                    return Boxing.boxBoolean(false);
                }
                n8g.INSTANCE.c0(2);
                if (sgi.a(snoringRiskViewModel2.g0().deviceMac).O5()) {
                    SHSettingViewModel sHSettingViewModelH2 = snoringRiskViewModel2.h0();
                    if (snoringRiskViewModel2.b0().z7()) {
                        sportHealthSetting = SportHealthSetting.SLEEP_APNEA_MONITORING;
                    } else {
                        sportHealthSetting = SportHealthSetting.OSA_ENABLE;
                    }
                    mutableLiveDataW = sHSettingViewModelH2.x(sportHealthSetting, z2);
                } else {
                    SHSettingViewModel sHSettingViewModelH3 = snoringRiskViewModel2.h0();
                    SportHealthSetting sportHealthSetting3 = SportHealthSetting.OXIMETRY;
                    mutableLiveDataW = sHSettingViewModelH3.w(sportHealthSetting3, MapsKt__MapsKt.mapOf(TuplesKt.to(sportHealthSetting3, duk.e(z2)), TuplesKt.to(SportHealthSetting.OXIMETRY_TYPE, duk.o(0))));
                }
                snoringRiskViewModel$setSnoringRiskAssessment$1.L$0 = snoringRiskViewModel2;
                snoringRiskViewModel$setSnoringRiskAssessment$1.L$1 = snoringRiskViewModel2;
                snoringRiskViewModel$setSnoringRiskAssessment$1.label = 4;
                objO = ExpandKt.c(mutableLiveDataW, snoringRiskViewModel$setSnoringRiskAssessment$1);
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                snoringRiskViewModel = snoringRiskViewModel2;
                SnoringRiskViewModel$setSnoringRiskAssessment$2 snoringRiskViewModel$setSnoringRiskAssessment$3 = new SnoringRiskViewModel$setSnoringRiskAssessment$2(snoringRiskViewModel);
                snoringRiskViewModel$setSnoringRiskAssessment$1.L$0 = null;
                snoringRiskViewModel$setSnoringRiskAssessment$1.L$1 = null;
                snoringRiskViewModel$setSnoringRiskAssessment$1.label = 5;
                objO = snoringRiskViewModel2.t0((Integer) objO, snoringRiskViewModel$setSnoringRiskAssessment$3, snoringRiskViewModel$setSnoringRiskAssessment$1);
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 4) {
                snoringRiskViewModel2 = (SnoringRiskViewModel) snoringRiskViewModel$setSnoringRiskAssessment$1.L$1;
                snoringRiskViewModel = (SnoringRiskViewModel) snoringRiskViewModel$setSnoringRiskAssessment$1.L$0;
                ResultKt.throwOnFailure(objO);
                SnoringRiskViewModel$setSnoringRiskAssessment$2 snoringRiskViewModel$setSnoringRiskAssessment$4 = new SnoringRiskViewModel$setSnoringRiskAssessment$2(snoringRiskViewModel);
                snoringRiskViewModel$setSnoringRiskAssessment$1.L$0 = null;
                snoringRiskViewModel$setSnoringRiskAssessment$1.L$1 = null;
                snoringRiskViewModel$setSnoringRiskAssessment$1.label = 5;
                objO = snoringRiskViewModel2.t0((Integer) objO, snoringRiskViewModel$setSnoringRiskAssessment$4, snoringRiskViewModel$setSnoringRiskAssessment$1);
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objO);
            }
            return objO;
        }
        boolean z4 = snoringRiskViewModel$setSnoringRiskAssessment$1.Z$0;
        Activity activity4 = (Activity) snoringRiskViewModel$setSnoringRiskAssessment$1.L$1;
        SnoringRiskViewModel snoringRiskViewModel4 = (SnoringRiskViewModel) snoringRiskViewModel$setSnoringRiskAssessment$1.L$0;
        ResultKt.throwOnFailure(objO);
        activity2 = activity4;
        z2 = z4;
        snoringRiskViewModel2 = snoringRiskViewModel4;
        if (!((Boolean) objO).booleanValue() && snoringRiskViewModel2.b0().z7()) {
            int i3 = R$string.settings_osa_open_activate_title;
            String strL = qtf.l(R$string.settings_osa_activate_desc);
            int i4 = R$string.settings_cancel;
            int i5 = R$string.settings_osa_activate;
            snoringRiskViewModel$setSnoringRiskAssessment$1.L$0 = activity2;
            snoringRiskViewModel$setSnoringRiskAssessment$1.L$1 = null;
            snoringRiskViewModel$setSnoringRiskAssessment$1.label = 2;
            Activity activity5 = activity2;
            Object objO2 = SimplifyDialogKt.O(activity2, i3, strL, i4, i5, snoringRiskViewModel$setSnoringRiskAssessment$1);
            if (objO2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            objO = objO2;
            activity3 = activity5;
            if (!((Boolean) objO).booleanValue()) {
                return Boxing.boxBoolean(false);
            }
            x0.d().b("/sleep/SnoreActivationActivity").navigation(activity3);
            return Boxing.boxBoolean(false);
        }
        Activity activity6 = activity2;
        int i6 = snoringRiskViewModel2.b0().z7() ? R$string.settings_osa_open_title_new : R$string.settings_osa_open_title;
        String strL2 = qtf.l(R$string.settings_osa_open_desc);
        int i7 = R$string.settings_cancel;
        int i8 = R$string.band_setting_spo2_dialog_sure;
        snoringRiskViewModel$setSnoringRiskAssessment$1.L$0 = snoringRiskViewModel2;
        snoringRiskViewModel$setSnoringRiskAssessment$1.L$1 = null;
        snoringRiskViewModel$setSnoringRiskAssessment$1.Z$0 = z2;
        snoringRiskViewModel$setSnoringRiskAssessment$1.label = 3;
        objO = SimplifyDialogKt.O(activity6, i6, strL2, i7, i8, snoringRiskViewModel$setSnoringRiskAssessment$1);
        if (objO == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (!((Boolean) objO).booleanValue()) {
            n8g.INSTANCE.c0(1);
            return Boxing.boxBoolean(false);
        }
        n8g.INSTANCE.c0(2);
        if (sgi.a(snoringRiskViewModel2.g0().deviceMac).O5()) {
            SHSettingViewModel sHSettingViewModelH4 = snoringRiskViewModel2.h0();
            if (snoringRiskViewModel2.b0().z7()) {
                sportHealthSetting = SportHealthSetting.SLEEP_APNEA_MONITORING;
            } else {
                sportHealthSetting = SportHealthSetting.OSA_ENABLE;
            }
            mutableLiveDataW = sHSettingViewModelH4.x(sportHealthSetting, z2);
        } else {
            SHSettingViewModel sHSettingViewModelH5 = snoringRiskViewModel2.h0();
            SportHealthSetting sportHealthSetting4 = SportHealthSetting.OXIMETRY;
            mutableLiveDataW = sHSettingViewModelH5.w(sportHealthSetting4, MapsKt__MapsKt.mapOf(TuplesKt.to(sportHealthSetting4, duk.e(z2)), TuplesKt.to(SportHealthSetting.OXIMETRY_TYPE, duk.o(0))));
        }
        snoringRiskViewModel$setSnoringRiskAssessment$1.L$0 = snoringRiskViewModel2;
        snoringRiskViewModel$setSnoringRiskAssessment$1.L$1 = snoringRiskViewModel2;
        snoringRiskViewModel$setSnoringRiskAssessment$1.label = 4;
        objO = ExpandKt.c(mutableLiveDataW, snoringRiskViewModel$setSnoringRiskAssessment$1);
        if (objO == coroutine_suspended) {
            return coroutine_suspended;
        }
        snoringRiskViewModel = snoringRiskViewModel2;
        SnoringRiskViewModel$setSnoringRiskAssessment$2 snoringRiskViewModel$setSnoringRiskAssessment$5 = new SnoringRiskViewModel$setSnoringRiskAssessment$2(snoringRiskViewModel);
        snoringRiskViewModel$setSnoringRiskAssessment$1.L$0 = null;
        snoringRiskViewModel$setSnoringRiskAssessment$1.L$1 = null;
        snoringRiskViewModel$setSnoringRiskAssessment$1.label = 5;
        objO = snoringRiskViewModel2.t0((Integer) objO, snoringRiskViewModel$setSnoringRiskAssessment$5, snoringRiskViewModel$setSnoringRiskAssessment$1);
        if (objO == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objO;
    }

    public final SnoringRisk C0() {
        Pair pair;
        DeviceSettings deviceSettingsB = h0().B();
        if (sgi.a(g0().deviceMac).O5()) {
            pair = TuplesKt.to(Boolean.valueOf(deviceSettingsB.getOsa().getSwitchEnable()), Boolean.valueOf(deviceSettingsB.getOsa().getAutoStopAudioFileEnable()));
        } else {
            pair = TuplesKt.to(Boolean.valueOf(deviceSettingsB.getSpo2().getOximetryEnable() && deviceSettingsB.getSpo2().getOximetryType() == 0), Boolean.valueOf(deviceSettingsB.getSpo2().getAutoStopAudioFileEnable()));
        }
        return new SnoringRisk(((Boolean) pair.component1()).booleanValue(), ((Boolean) pair.component2()).booleanValue());
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super SnoringRisk> continuation) {
        return C0();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt__SetsKt.linkedSetOf(SportHealthSetting.SLEEP_APNEA_MONITORING, SportHealthSetting.OSA_ENABLE, SportHealthSetting.OXIMETRY, SportHealthSetting.OXIMETRY_TYPE, SportHealthSetting.AUTO_STOP_AUDIO_FILE_ENABLE);
    }

    public final Object x0(Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        this.deviceSettingService.ja(new a(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object y0(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        SnoringRiskViewModel$setAutoStop$1 snoringRiskViewModel$setAutoStop$1;
        SnoringRiskViewModel snoringRiskViewModel;
        if (continuation instanceof SnoringRiskViewModel$setAutoStop$1) {
            snoringRiskViewModel$setAutoStop$1 = (SnoringRiskViewModel$setAutoStop$1) continuation;
            int i = snoringRiskViewModel$setAutoStop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                snoringRiskViewModel$setAutoStop$1.label = i - Integer.MIN_VALUE;
            } else {
                snoringRiskViewModel$setAutoStop$1 = new SnoringRiskViewModel$setAutoStop$1(this, continuation);
            }
        } else {
            snoringRiskViewModel$setAutoStop$1 = new SnoringRiskViewModel$setAutoStop$1(this, continuation);
        }
        Object objC = snoringRiskViewModel$setAutoStop$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = snoringRiskViewModel$setAutoStop$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (SnoringRiskViewModel) snoringRiskViewModel$setAutoStop$1.L$1;
                snoringRiskViewModel = (SnoringRiskViewModel) snoringRiskViewModel$setAutoStop$1.L$0;
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
        MutableLiveData<Integer> mutableLiveDataX = h0().x(SportHealthSetting.AUTO_STOP_AUDIO_FILE_ENABLE, z);
        snoringRiskViewModel$setAutoStop$1.L$0 = this;
        snoringRiskViewModel$setAutoStop$1.L$1 = this;
        snoringRiskViewModel$setAutoStop$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataX, snoringRiskViewModel$setAutoStop$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        snoringRiskViewModel = this;
        SnoringRiskViewModel$setAutoStop$2 snoringRiskViewModel$setAutoStop$2 = new SnoringRiskViewModel$setAutoStop$2(snoringRiskViewModel);
        snoringRiskViewModel$setAutoStop$1.L$0 = null;
        snoringRiskViewModel$setAutoStop$1.L$1 = null;
        snoringRiskViewModel$setAutoStop$1.label = 2;
        objC = this.t0((Integer) objC, snoringRiskViewModel$setAutoStop$2, snoringRiskViewModel$setAutoStop$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }
}
