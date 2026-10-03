package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.util.DeviceUtilsKt;
import com.heytap.sporthealth.blib.basic.BasicStateViewModel;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.heytap.sporthealth.blib.helper.SimplifyDialogKt;
import com.oplus.aiunit.vision.HeartRateDetect;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.duk;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.n8g;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.vik;
import java.util.Map;
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
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0003J+\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0002J#\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/HeartRateSettingViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/oplus/aiunit/vision/t49;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c8l.KEY_B0, "open", "", "type", "Landroid/app/Activity;", "activity", "x0", "(ZILandroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y0", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z0", c8l.KEY_A0, "enable", "C0", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "D0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class HeartRateSettingViewModel extends SHSettingBaseViewModel<HeartRateDetect> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartRateSettingViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
    }

    public final boolean A0() {
        return !((Boolean) lc5.c(g0().deviceMac).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingViewModel$isIntervalSupport$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                return Boolean.valueOf(applyInfo.A9());
            }
        })).booleanValue() || DeviceUtilsKt.b(g0().deviceVersion) >= 584;
    }

    public final boolean B0() {
        return b0().h7();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C0(boolean z, int i, Continuation<? super Boolean> continuation) {
        HeartRateSettingViewModel$switchHeartRateDetect$1 heartRateSettingViewModel$switchHeartRateDetect$1;
        if (continuation instanceof HeartRateSettingViewModel$switchHeartRateDetect$1) {
            heartRateSettingViewModel$switchHeartRateDetect$1 = (HeartRateSettingViewModel$switchHeartRateDetect$1) continuation;
            int i2 = heartRateSettingViewModel$switchHeartRateDetect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                heartRateSettingViewModel$switchHeartRateDetect$1.label = i2 - Integer.MIN_VALUE;
            } else {
                heartRateSettingViewModel$switchHeartRateDetect$1 = new HeartRateSettingViewModel$switchHeartRateDetect$1(this, continuation);
            }
        } else {
            heartRateSettingViewModel$switchHeartRateDetect$1 = new HeartRateSettingViewModel$switchHeartRateDetect$1(this, continuation);
        }
        Object objC = heartRateSettingViewModel$switchHeartRateDetect$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = heartRateSettingViewModel$switchHeartRateDetect$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                this = (HeartRateSettingViewModel) heartRateSettingViewModel$switchHeartRateDetect$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        SportHealthSetting sportHealthSetting = SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE;
        Map<SportHealthSetting, String> mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.to(sportHealthSetting, duk.e(z)));
        if (A0()) {
            mapMutableMapOf.put(SportHealthSetting.HEART_RATE_TYPE, duk.o(i));
        }
        MutableLiveData<Integer> mutableLiveDataW = h0().w(sportHealthSetting, mapMutableMapOf);
        heartRateSettingViewModel$switchHeartRateDetect$1.L$0 = this;
        heartRateSettingViewModel$switchHeartRateDetect$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataW, heartRateSettingViewModel$switchHeartRateDetect$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        Intrinsics.checkNotNull(objC);
        Integer numBoxInt = Boxing.boxInt(((Number) objC).intValue());
        heartRateSettingViewModel$switchHeartRateDetect$1.L$0 = null;
        heartRateSettingViewModel$switchHeartRateDetect$1.label = 2;
        objC = this.s0(numBoxInt, heartRateSettingViewModel$switchHeartRateDetect$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D0(boolean z, int i, Continuation<? super Boolean> continuation) {
        HeartRateSettingViewModel$switchHeartRateDetectWithDialog$1 heartRateSettingViewModel$switchHeartRateDetectWithDialog$1;
        if (continuation instanceof HeartRateSettingViewModel$switchHeartRateDetectWithDialog$1) {
            heartRateSettingViewModel$switchHeartRateDetectWithDialog$1 = (HeartRateSettingViewModel$switchHeartRateDetectWithDialog$1) continuation;
            int i2 = heartRateSettingViewModel$switchHeartRateDetectWithDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                heartRateSettingViewModel$switchHeartRateDetectWithDialog$1.label = i2 - Integer.MIN_VALUE;
            } else {
                heartRateSettingViewModel$switchHeartRateDetectWithDialog$1 = new HeartRateSettingViewModel$switchHeartRateDetectWithDialog$1(this, continuation);
            }
        } else {
            heartRateSettingViewModel$switchHeartRateDetectWithDialog$1 = new HeartRateSettingViewModel$switchHeartRateDetectWithDialog$1(this, continuation);
        }
        HeartRateSettingViewModel$switchHeartRateDetectWithDialog$1 heartRateSettingViewModel$switchHeartRateDetectWithDialog$2 = heartRateSettingViewModel$switchHeartRateDetectWithDialog$1;
        Object objB = heartRateSettingViewModel$switchHeartRateDetectWithDialog$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = heartRateSettingViewModel$switchHeartRateDetectWithDialog$2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objB);
            HeartRateSettingViewModel$switchHeartRateDetectWithDialog$2 heartRateSettingViewModel$switchHeartRateDetectWithDialog$3 = new HeartRateSettingViewModel$switchHeartRateDetectWithDialog$2(this, z, i, null);
            heartRateSettingViewModel$switchHeartRateDetectWithDialog$2.label = 1;
            objB = BasicStateViewModel.B(this, null, heartRateSettingViewModel$switchHeartRateDetectWithDialog$3, heartRateSettingViewModel$switchHeartRateDetectWithDialog$2, 1, null);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objB);
        }
        Boolean bool = (Boolean) objB;
        return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super HeartRateDetect> continuation) {
        return z0();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt__SetsKt.linkedSetOf(SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE, SportHealthSetting.HEART_RATE_TYPE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd A[PHI: r3
  0x00bd: PHI (r3v23 java.lang.Object) = (r3v22 java.lang.Object), (r3v1 java.lang.Object) binds: [B:28:0x00ba, B:16:0x0059] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x011a A[PHI: r3
  0x011a: PHI (r3v31 java.lang.Object) = (r3v30 java.lang.Object), (r3v1 java.lang.Object) binds: [B:43:0x0117, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object x0(boolean z, int i, @NotNull Activity activity, @NotNull Continuation<? super Boolean> continuation) {
        HeartRateSettingViewModel$autoDetectSwitch$1 heartRateSettingViewModel$autoDetectSwitch$1;
        int i2;
        HeartRateSettingViewModel heartRateSettingViewModel = this;
        boolean z2 = z;
        int i3 = i;
        if (continuation instanceof HeartRateSettingViewModel$autoDetectSwitch$1) {
            heartRateSettingViewModel$autoDetectSwitch$1 = (HeartRateSettingViewModel$autoDetectSwitch$1) continuation;
            int i4 = heartRateSettingViewModel$autoDetectSwitch$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                heartRateSettingViewModel$autoDetectSwitch$1.label = i4 - Integer.MIN_VALUE;
            } else {
                heartRateSettingViewModel$autoDetectSwitch$1 = new HeartRateSettingViewModel$autoDetectSwitch$1(heartRateSettingViewModel, continuation);
            }
        } else {
            heartRateSettingViewModel$autoDetectSwitch$1 = new HeartRateSettingViewModel$autoDetectSwitch$1(heartRateSettingViewModel, continuation);
        }
        Object objC0 = heartRateSettingViewModel$autoDetectSwitch$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (heartRateSettingViewModel$autoDetectSwitch$1.label) {
            case 0:
                ResultKt.throwOnFailure(objC0);
                if (z2) {
                    if (!b0().X4()) {
                        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, Boxing.boxInt(1)).b();
                        heartRateSettingViewModel$autoDetectSwitch$1.label = 3;
                        objC0 = heartRateSettingViewModel.C0(z2, i3, heartRateSettingViewModel$autoDetectSwitch$1);
                        return objC0 == coroutine_suspended ? coroutine_suspended : objC0;
                    }
                    int i5 = R$string.settings_auto_measure_heart_rate_high_power_title;
                    String strL = qtf.l(R$string.settings_auto_measure_heart_rate_high_power_desc);
                    int i6 = R$string.settings_cancel;
                    int i7 = R$string.band_setting_spo2_dialog_sure;
                    heartRateSettingViewModel$autoDetectSwitch$1.L$0 = heartRateSettingViewModel;
                    heartRateSettingViewModel$autoDetectSwitch$1.Z$0 = z2;
                    heartRateSettingViewModel$autoDetectSwitch$1.I$0 = i3;
                    heartRateSettingViewModel$autoDetectSwitch$1.label = 1;
                    objC0 = SimplifyDialogKt.O(activity, i5, strL, i6, i7, heartRateSettingViewModel$autoDetectSwitch$1);
                    if (objC0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) objC0).booleanValue()) {
                        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, Boxing.boxInt(1)).b();
                        heartRateSettingViewModel$autoDetectSwitch$1.L$0 = null;
                        heartRateSettingViewModel$autoDetectSwitch$1.label = 2;
                        objC0 = heartRateSettingViewModel.C0(z2, i3, heartRateSettingViewModel$autoDetectSwitch$1);
                        if (objC0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return objC0;
                    }
                    return Boxing.boxBoolean(false);
                }
                if (!b0().h1()) {
                    heartRateSettingViewModel$autoDetectSwitch$1.label = 6;
                    objC0 = heartRateSettingViewModel.C0(z2, i3, heartRateSettingViewModel$autoDetectSwitch$1);
                    return objC0 == coroutine_suspended ? coroutine_suspended : objC0;
                }
                int i8 = R$string.settings_watch_auto_measure_heart_rate;
                String strL2 = qtf.l(R$string.settings_dialog_disable_auto_measure_heart_rate);
                int i9 = com.heytap.health.base.R$string.lib_base_not_yet;
                int i10 = R$string.settings_dialog_close_ensure;
                heartRateSettingViewModel$autoDetectSwitch$1.L$0 = heartRateSettingViewModel;
                heartRateSettingViewModel$autoDetectSwitch$1.Z$0 = z2;
                heartRateSettingViewModel$autoDetectSwitch$1.I$0 = i3;
                heartRateSettingViewModel$autoDetectSwitch$1.label = 4;
                objC0 = SimplifyDialogKt.O(activity, i8, strL2, i9, i10, heartRateSettingViewModel$autoDetectSwitch$1);
                if (objC0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objC0).booleanValue()) {
                    n8g.INSTANCE.I(2);
                    if (heartRateSettingViewModel.k0()) {
                        i2 = 23;
                    } else {
                        i2 = 41;
                    }
                    com.heytap.health.base.track.a.B(i2, 1);
                    return Boxing.boxBoolean(false);
                }
                n8g.INSTANCE.I(1);
                heartRateSettingViewModel$autoDetectSwitch$1.L$0 = null;
                heartRateSettingViewModel$autoDetectSwitch$1.label = 5;
                objC0 = heartRateSettingViewModel.C0(z2, i3, heartRateSettingViewModel$autoDetectSwitch$1);
                if (objC0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objC0;
            case 1:
                int i11 = heartRateSettingViewModel$autoDetectSwitch$1.I$0;
                z2 = heartRateSettingViewModel$autoDetectSwitch$1.Z$0;
                HeartRateSettingViewModel heartRateSettingViewModel2 = (HeartRateSettingViewModel) heartRateSettingViewModel$autoDetectSwitch$1.L$0;
                ResultKt.throwOnFailure(objC0);
                i3 = i11;
                heartRateSettingViewModel = heartRateSettingViewModel2;
                if (((Boolean) objC0).booleanValue()) {
                    com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, Boxing.boxInt(1)).b();
                    heartRateSettingViewModel$autoDetectSwitch$1.L$0 = null;
                    heartRateSettingViewModel$autoDetectSwitch$1.label = 2;
                    objC0 = heartRateSettingViewModel.C0(z2, i3, heartRateSettingViewModel$autoDetectSwitch$1);
                    if (objC0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objC0;
                }
                return Boxing.boxBoolean(false);
            case 2:
                ResultKt.throwOnFailure(objC0);
                return objC0;
            case 3:
                ResultKt.throwOnFailure(objC0);
            case 4:
                int i12 = heartRateSettingViewModel$autoDetectSwitch$1.I$0;
                z2 = heartRateSettingViewModel$autoDetectSwitch$1.Z$0;
                HeartRateSettingViewModel heartRateSettingViewModel3 = (HeartRateSettingViewModel) heartRateSettingViewModel$autoDetectSwitch$1.L$0;
                ResultKt.throwOnFailure(objC0);
                i3 = i12;
                heartRateSettingViewModel = heartRateSettingViewModel3;
                if (((Boolean) objC0).booleanValue()) {
                    n8g.INSTANCE.I(2);
                    if (heartRateSettingViewModel.k0()) {
                        i2 = 23;
                    } else {
                        i2 = 41;
                    }
                    com.heytap.health.base.track.a.B(i2, 1);
                    return Boxing.boxBoolean(false);
                }
                n8g.INSTANCE.I(1);
                heartRateSettingViewModel$autoDetectSwitch$1.L$0 = null;
                heartRateSettingViewModel$autoDetectSwitch$1.label = 5;
                objC0 = heartRateSettingViewModel.C0(z2, i3, heartRateSettingViewModel$autoDetectSwitch$1);
                if (objC0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objC0;
            case 5:
                ResultKt.throwOnFailure(objC0);
                return objC0;
            case 6:
                ResultKt.throwOnFailure(objC0);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object y0(int i, @NotNull Continuation<? super Boolean> continuation) {
        HeartRateSettingViewModel$detectTypeChange$1 heartRateSettingViewModel$detectTypeChange$1;
        if (continuation instanceof HeartRateSettingViewModel$detectTypeChange$1) {
            heartRateSettingViewModel$detectTypeChange$1 = (HeartRateSettingViewModel$detectTypeChange$1) continuation;
            int i2 = heartRateSettingViewModel$detectTypeChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                heartRateSettingViewModel$detectTypeChange$1.label = i2 - Integer.MIN_VALUE;
            } else {
                heartRateSettingViewModel$detectTypeChange$1 = new HeartRateSettingViewModel$detectTypeChange$1(this, continuation);
            }
        } else {
            heartRateSettingViewModel$detectTypeChange$1 = new HeartRateSettingViewModel$detectTypeChange$1(this, continuation);
        }
        Object objD0 = heartRateSettingViewModel$detectTypeChange$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = heartRateSettingViewModel$detectTypeChange$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objD0);
            heartRateSettingViewModel$detectTypeChange$1.L$0 = this;
            heartRateSettingViewModel$detectTypeChange$1.I$0 = i;
            heartRateSettingViewModel$detectTypeChange$1.label = 1;
            objD0 = D0(true, i, heartRateSettingViewModel$detectTypeChange$1);
            if (objD0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = heartRateSettingViewModel$detectTypeChange$1.I$0;
            this = (HeartRateSettingViewModel) heartRateSettingViewModel$detectTypeChange$1.L$0;
            ResultKt.throwOnFailure(objD0);
        }
        if (!((Boolean) objD0).booleanValue()) {
            return Boxing.boxBoolean(false);
        }
        if (this.k0()) {
            return Boxing.boxBoolean(true);
        }
        if (i == 1) {
            com.heytap.health.base.track.a.B(42, 2);
        } else if (i == 2) {
            com.heytap.health.base.track.a.B(42, 1);
        } else if (i == 3) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, Boxing.boxInt(4)).a("element", Boxing.boxInt(1)).b();
        } else if (i == 4) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, Boxing.boxInt(5)).a("element", Boxing.boxInt(1)).b();
            com.heytap.health.base.track.a.B(42, 3);
        }
        return Boxing.boxBoolean(true);
    }

    public final HeartRateDetect z0() {
        return new HeartRateDetect(h0().B().getAutoMeasureHeartRate(), b0().X0());
    }
}
