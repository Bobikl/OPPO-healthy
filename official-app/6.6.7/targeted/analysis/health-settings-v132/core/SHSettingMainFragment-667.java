package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.coui.appcompat.picker.COUINumberPicker;
import com.coui.appcompat.preference.COUIPagerFooterPreference;
import com.coui.appcompat.preference.COUIPreferenceCategory;
import com.coui.appcompat.preference.COUISwitchLoadingPreference;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.settings.DeviceSettings;
import com.heytap.health.settings.watch.sporthealthsettings.bean.e0;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.remindSporting.RemindSportingActivity;
import com.heytap.sporthealth.blib.basic.ui.BasicPreferenceFragment;
import com.heytap.sporthealth.blib.helper.DialogCOUIPreference;
import com.heytap.sporthealth.blib.helper.HCOUIJumpPreference;
import com.heytap.sporthealth.blib.helper.HCOUIPreferenceCategory;
import com.heytap.sporthealth.blib.helper.HCOUISwitchLoadingPreference;
import com.heytap.sporthealth.blib.helper.PrefDsl;
import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.HttpStatus;
import com.oplus.aiunit.model.SHSettingHomeData;
import com.oplus.aiunit.model.ob0;
import com.oplus.aiunit.model.wbg;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.b9i;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.swf;
import com.oplus.aiunit.vision.th7;
import com.oplus.aiunit.vision.wl4;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\f\u0010\f\u001a\u00020\u0006*\u00020\tH\u0002J&\u0010\u0011\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0002J&\u0010\u0012\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0002J&\u0010\u0013\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0002J-\u0010\u0019\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u0017H\u0002J-\u0010\u001a\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u0017H\u0002J-\u0010\u001b\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u0017H\u0002J&\u0010\u001c\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0002J\u001e\u0010\u001d\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0002J\u001e\u0010\u001e\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0002J\u001e\u0010\u001f\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0002J\u001e\u0010 \u001a\u00020\u0004*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0002¨\u0006#"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainFragment;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainVm;", "Landroidx/preference/PreferenceScreen;", "", "n0", "", "Landroid/text/SpannedString;", "L0", "", "R0", "F0", "G0", "show", "Lcom/heytap/health/settings/DeviceSettings$SettingAbility;", "deviceSettingAbility", "showGroupTitle", "Q0", "N0", "J0", "Lcom/coui/appcompat/preference/COUIPreferenceCategory;", "Lkotlin/Function1;", "Lcom/oplus/aiunit/vision/qag;", "Lkotlin/ExtensionFunctionType;", "visibleWhen", "A0", "M0", "O0", "B0", "K0", "P0", "H0", "z0", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SHSettingMainFragment extends BasicPreferenceFragment<SHSettingMainVm> {
    public static final int $stable = 0;

    public final void A0(COUIPreferenceCategory cOUIPreferenceCategory, DeviceSettings.SettingAbility settingAbility, final Function1<? super SHSettingHomeData, Boolean> function1) {
        h1(cOUIPreferenceCategory, G0(settingAbility.getExerciseHeartRateWarning()), new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$exerciseHeartRateWarningSlot$1

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a implements Observer<Pair<? extends Boolean, ? extends Integer>> {
                public final /* synthetic */ HCOUIJumpPreference i;
                public final /* synthetic */ SHSettingMainFragment j;

                public a(HCOUIJumpPreference hCOUIJumpPreference, SHSettingMainFragment sHSettingMainFragment) {
                    this.i = hCOUIJumpPreference;
                    this.j = sHSettingMainFragment;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void onChanged(@NotNull Pair<Boolean, Integer> pair) {
                    Intrinsics.checkNotNullParameter(pair, "it");
                    if (!((Boolean) pair.getFirst()).booleanValue()) {
                        this.i.setSummary(this.j.L0(((Boolean) pair.getFirst()).booleanValue()));
                        return;
                    }
                    HCOUIJumpPreference hCOUIJumpPreference = this.i;
                    String strM = swf.m(R.string.settings_watch_high_rate_value, ((Number) pair.getSecond()).intValue());
                    SHSettingMainFragment sHSettingMainFragment = this.j;
                    Context contextRequireContext = sHSettingMainFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                    hCOUIJumpPreference.setSummary(b9i.f(strM, sHSettingMainFragment.themeColor(contextRequireContext)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIJumpPreference) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                hCOUIJumpPreference.setTitle(R.string.settings_watch_high_rate_notification_01);
                SHSettingMainFragment sHSettingMainFragment = this.this$0;
                final Function1<SHSettingHomeData, Boolean> function2 = function1;
                LiveData liveDataX = sHSettingMainFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$exerciseHeartRateWarningSlot$1$invoke$$inlined$visibleStateBy$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m95invoke(@Nullable Object obj) {
                        Function1 function3 = function2;
                        if (!(obj instanceof SHSettingHomeData)) {
                            obj = null;
                        }
                        SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                        Intrinsics.checkNotNull(sHSettingHomeData);
                        return (Boolean) function3.invoke(sHSettingHomeData);
                    }
                });
                LifecycleOwner context = hCOUIJumpPreference.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                liveDataX.observe(context, new SHSettingMainFragment$exerciseHeartRateWarningSlot$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$exerciseHeartRateWarningSlot$1$invoke$$inlined$visibleStateBy$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Boolean) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Boolean bool) {
                        Preference preference = hCOUIJumpPreference;
                        Intrinsics.checkNotNullExpressionValue(bool, "it");
                        preference.setVisible(bool.booleanValue());
                    }
                }));
                SHSettingMainFragment sHSettingMainFragment2 = this.this$0;
                sHSettingMainFragment2.d0(((SHSettingMainVm) sHSettingMainFragment2.c0()).x(new Function1<SHSettingHomeData, Pair<? extends Boolean, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$exerciseHeartRateWarningSlot$1.1
                    @Nullable
                    public final Pair<Boolean, Integer> invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                        e0 sportsHeartRate = sHSettingHomeData.getSettings().getSportsHeartRate();
                        return TuplesKt.to(Boolean.valueOf(sportsHeartRate.getHighRateNotificationEnable()), Integer.valueOf(sportsHeartRate.getHighHeartRateValue()));
                    }
                }), new a(hCOUIJumpPreference, this.this$0));
                final SHSettingMainFragment sHSettingMainFragment3 = this.this$0;
                sHSettingMainFragment3.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$exerciseHeartRateWarningSlot$1.3
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Preference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Preference preference) {
                        Intrinsics.checkNotNullParameter(preference, "it");
                        SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment3.c0();
                        FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment3.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                        sHSettingMainVm.f1(fragmentActivityRequireActivity);
                    }
                });
            }
        });
    }

    public final void B0(final PreferenceScreen preferenceScreen, boolean z, final DeviceSettings.SettingAbility settingAbility, final boolean z2) {
        T4(preferenceScreen, z, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                if (z2) {
                    hCOUIPreferenceCategory.setTitle(R.string.device_settings_heart_rate);
                }
                final SHSettingMainFragment sHSettingMainFragment = this;
                sHSettingMainFragment.A0(hCOUIPreferenceCategory, settingAbility, new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1.1
                    {
                        super(1);
                    }

                    @NotNull
                    public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$exerciseHeartRateWarningSlot");
                        return Boolean.valueOf((sHSettingHomeData.getAppInstallBean().b() || ((SHSettingMainVm) sHSettingMainFragment.c0()).m0()) ? false : true);
                    }
                });
                SHSettingMainFragment sHSettingMainFragment2 = this;
                boolean zG0 = sHSettingMainFragment2.G0(settingAbility.getHeartRateAutoMonitoring());
                final SHSettingMainFragment sHSettingMainFragment3 = this;
                sHSettingMainFragment2.h1(hCOUIPreferenceCategory, zG0, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1.2
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.settings_watch_auto_measure_heart_rate);
                        final SHSettingMainFragment sHSettingMainFragment4 = sHSettingMainFragment3;
                        LiveData liveDataX = sHSettingMainFragment4.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1$2$invoke$$inlined$enableStateBy$1
                            {
                                super(1);
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m96invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return ((SHSettingMainVm) sHSettingMainFragment4.c0()).m0() ? Boolean.TRUE : Boolean.valueOf(sHSettingHomeData.getAppInstallBean().b());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$heartRateGuardGroup$1$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1$2$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        SHSettingMainFragment sHSettingMainFragment5 = sHSettingMainFragment3;
                        LiveData liveDataX2 = ((SHSettingMainVm) sHSettingMainFragment5.c0()).x(new Function1<SHSettingHomeData, Pair<? extends Boolean, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.heartRateGuardGroup.1.2.2
                            @Nullable
                            public final Pair<Boolean, Integer> invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                com.heytap.health.settings.watch.sporthealthsettings.bean.g autoMeasureHeartRate = sHSettingHomeData.getSettings().getAutoMeasureHeartRate();
                                return TuplesKt.to(Boolean.valueOf(autoMeasureHeartRate.getAutoMeasureHeartRateEnable()), Integer.valueOf(autoMeasureHeartRate.getHeartRateInterval()));
                            }
                        });
                        final SHSettingMainFragment sHSettingMainFragment6 = sHSettingMainFragment3;
                        sHSettingMainFragment5.d0(liveDataX2, new Observer<Pair<? extends Boolean, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.heartRateGuardGroup.1.2.3
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final void onChanged(@NotNull Pair<Boolean, Integer> pair) {
                                Intrinsics.checkNotNullParameter(pair, "it");
                                if (!((Boolean) pair.getFirst()).booleanValue()) {
                                    hCOUIJumpPreference.setSummary(sHSettingMainFragment6.L0(((Boolean) pair.getFirst()).booleanValue()));
                                    return;
                                }
                                if (!sHSettingMainFragment6.F0()) {
                                    hCOUIJumpPreference.setSummary(sHSettingMainFragment6.L0(((Boolean) pair.getFirst()).booleanValue()));
                                    return;
                                }
                                int iIntValue = ((Number) pair.getSecond()).intValue();
                                if (iIntValue != 0) {
                                    if (iIntValue == 1) {
                                        if (((Boolean) gd5.c(((SHSettingMainVm) sHSettingMainFragment6.c0()).getMac()).a(SHSettingMainFragment$heartRateGuardGroup$1$2$3$onChanged$1.INSTANCE)).booleanValue()) {
                                            HCOUIJumpPreference hCOUIJumpPreference2 = hCOUIJumpPreference;
                                            String strL = swf.l(R.string.settings_interval_monitor_title);
                                            SHSettingMainFragment sHSettingMainFragment7 = sHSettingMainFragment6;
                                            Context context2 = hCOUIJumpPreference.getContext();
                                            Intrinsics.checkNotNullExpressionValue(context2, "context");
                                            hCOUIJumpPreference2.setSummary(b9i.f(strL, sHSettingMainFragment7.themeColor(context2)));
                                            return;
                                        }
                                        HCOUIJumpPreference hCOUIJumpPreference3 = hCOUIJumpPreference;
                                        String strL2 = swf.l(R.string.settings_heart_rate_detech_per_two_minute);
                                        SHSettingMainFragment sHSettingMainFragment8 = sHSettingMainFragment6;
                                        Context context3 = hCOUIJumpPreference.getContext();
                                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                                        hCOUIJumpPreference3.setSummary(b9i.f(strL2, sHSettingMainFragment8.themeColor(context3)));
                                        return;
                                    }
                                    if (iIntValue == 2) {
                                        HCOUIJumpPreference hCOUIJumpPreference4 = hCOUIJumpPreference;
                                        String strL3 = swf.l(R.string.settings_heart_rate_detech_per_six_minute);
                                        SHSettingMainFragment sHSettingMainFragment9 = sHSettingMainFragment6;
                                        Context context4 = hCOUIJumpPreference.getContext();
                                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                                        hCOUIJumpPreference4.setSummary(b9i.f(strL3, sHSettingMainFragment9.themeColor(context4)));
                                        return;
                                    }
                                    if (iIntValue == 3) {
                                        HCOUIJumpPreference hCOUIJumpPreference5 = hCOUIJumpPreference;
                                        String strL4 = swf.l(R.string.settings_monitor_ai);
                                        SHSettingMainFragment sHSettingMainFragment10 = sHSettingMainFragment6;
                                        Context context5 = hCOUIJumpPreference.getContext();
                                        Intrinsics.checkNotNullExpressionValue(context5, "context");
                                        hCOUIJumpPreference5.setSummary(b9i.f(strL4, sHSettingMainFragment10.themeColor(context5)));
                                        return;
                                    }
                                    if (iIntValue != 4) {
                                        return;
                                    }
                                }
                                HCOUIJumpPreference hCOUIJumpPreference6 = hCOUIJumpPreference;
                                String strL5 = swf.l(R.string.settings_real_time_monitor_title);
                                SHSettingMainFragment sHSettingMainFragment11 = sHSettingMainFragment6;
                                Context context6 = hCOUIJumpPreference.getContext();
                                Intrinsics.checkNotNullExpressionValue(context6, "context");
                                hCOUIJumpPreference6.setSummary(b9i.f(strL5, sHSettingMainFragment11.themeColor(context6)));
                            }
                        });
                        final SHSettingMainFragment sHSettingMainFragment7 = sHSettingMainFragment3;
                        sHSettingMainFragment7.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.heartRateGuardGroup.1.2.4
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment7.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment7.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.S0(fragmentActivityRequireActivity);
                            }
                        });
                    }
                });
                final SHSettingMainFragment sHSettingMainFragment4 = this;
                sHSettingMainFragment4.A0(hCOUIPreferenceCategory, settingAbility, new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1.3
                    {
                        super(1);
                    }

                    @NotNull
                    public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$exerciseHeartRateWarningSlot");
                        return Boolean.valueOf(!sHSettingHomeData.getAppInstallBean().b() && ((SHSettingMainVm) sHSettingMainFragment4.c0()).m0());
                    }
                });
                SHSettingMainFragment sHSettingMainFragment5 = this;
                boolean zG1 = sHSettingMainFragment5.G0(settingAbility.getRestingHeartRateWarning());
                final SHSettingMainFragment sHSettingMainFragment6 = this;
                sHSettingMainFragment5.h1(hCOUIPreferenceCategory, zG1, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1.4

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1$4$a */
                    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Pair<? extends Boolean, ? extends Boolean>> {
                        public final /* synthetic */ HCOUIJumpPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(HCOUIJumpPreference hCOUIJumpPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = hCOUIJumpPreference;
                            this.j = sHSettingMainFragment;
                        }

                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final void onChanged(@NotNull Pair<Boolean, Boolean> pair) {
                            CharSequence charSequenceL;
                            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                            boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) pair.component2()).booleanValue();
                            HCOUIJumpPreference hCOUIJumpPreference = this.i;
                            if (zBooleanValue) {
                                charSequenceL = this.j.L0(zBooleanValue2);
                            } else {
                                charSequenceL = zBooleanValue2 ? swf.l(R.string.settings_state_on) : swf.l(R.string.settings_state_off);
                            }
                            hCOUIJumpPreference.setSummary(charSequenceL);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.settings_quite_heart_rate_warning);
                        LiveData liveDataX = sHSettingMainFragment6.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1$4$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m97invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                com.heytap.health.settings.watch.sporthealthsettings.bean.g autoMeasureHeartRate = sHSettingHomeData.getSettings().getAutoMeasureHeartRate();
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().b() && autoMeasureHeartRate.getAutoMeasureHeartRateEnable() && autoMeasureHeartRate.getHeartRateInterval() != 2);
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$heartRateGuardGroup$1$4$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1$4$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        SHSettingMainFragment sHSettingMainFragment7 = sHSettingMainFragment6;
                        sHSettingMainFragment7.d0(((SHSettingMainVm) sHSettingMainFragment7.c0()).x(new Function1<SHSettingHomeData, Pair<? extends Boolean, ? extends Boolean>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.heartRateGuardGroup.1.4.2
                            @Nullable
                            public final Pair<Boolean, Boolean> invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                com.heytap.health.settings.watch.sporthealthsettings.bean.g autoMeasureHeartRate = sHSettingHomeData.getSettings().getAutoMeasureHeartRate();
                                return TuplesKt.to(Boolean.valueOf(autoMeasureHeartRate.getAutoMeasureHeartRateEnable() && autoMeasureHeartRate.getHeartRateInterval() != 2), Boolean.valueOf(sHSettingHomeData.getSettings().getQuietHeartRate().getQuietRateNotificationEnable()));
                            }
                        }), new a(hCOUIJumpPreference, sHSettingMainFragment6));
                        final SHSettingMainFragment sHSettingMainFragment8 = sHSettingMainFragment6;
                        sHSettingMainFragment8.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.heartRateGuardGroup.1.4.4
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment8.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment8.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.W0(fragmentActivityRequireActivity);
                            }
                        });
                    }
                });
                this.A0(hCOUIPreferenceCategory, settingAbility, new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1.5
                    @NotNull
                    public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$exerciseHeartRateWarningSlot");
                        return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().b());
                    }
                });
                SHSettingMainFragment sHSettingMainFragment7 = this;
                boolean zG2 = sHSettingMainFragment7.G0(settingAbility.getIrregularHeartRateWarning());
                final SHSettingMainFragment sHSettingMainFragment8 = this;
                sHSettingMainFragment7.h1(hCOUIPreferenceCategory, zG2, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1.6

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1$6$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Boolean> {
                        public final /* synthetic */ HCOUIJumpPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(HCOUIJumpPreference hCOUIJumpPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = hCOUIJumpPreference;
                            this.j = sHSettingMainFragment;
                        }

                        public final void a(boolean z) {
                            this.i.setSummary(this.j.L0(z));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Boolean) obj).booleanValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.settings_afib_heart_rhythm_abnormal_warn);
                        SHSettingMainFragment sHSettingMainFragment9 = sHSettingMainFragment8;
                        sHSettingMainFragment9.d0(((SHSettingMainVm) sHSettingMainFragment9.c0()).x(new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.heartRateGuardGroup.1.6.1
                            @Nullable
                            public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getAfib().l());
                            }
                        }), new a(hCOUIJumpPreference, sHSettingMainFragment8));
                        LiveData liveDataX = sHSettingMainFragment8.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1$6$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m98invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().b());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$heartRateGuardGroup$1$6$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1$6$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment10 = sHSettingMainFragment8;
                        sHSettingMainFragment10.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.heartRateGuardGroup.1.6.4
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment10.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment10.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.L0(fragmentActivityRequireActivity);
                            }
                        });
                    }
                });
                SHSettingMainFragment sHSettingMainFragment9 = this;
                PreferenceScreen preferenceScreen2 = preferenceScreen;
                String strL = swf.l(((SHSettingMainVm) sHSettingMainFragment9.c0()).m0() ? R.string.device_settings_heart_rate_uninstall_desc_v3 : R.string.device_settings_heart_rate_uninstall_desc_v2);
                final SHSettingMainFragment sHSettingMainFragment10 = this;
                sHSettingMainFragment9.b0(preferenceScreen2, strL, new Function1<COUIPagerFooterPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1.7
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((COUIPagerFooterPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final COUIPagerFooterPreference cOUIPagerFooterPreference) {
                        Intrinsics.checkNotNullParameter(cOUIPagerFooterPreference, "$this$footerPreference");
                        LiveData liveDataX = sHSettingMainFragment10.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1$7$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m99invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(!sHSettingHomeData.getAppInstallBean().b());
                            }
                        });
                        LifecycleOwner context = cOUIPagerFooterPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$heartRateGuardGroup$1$7$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$heartRateGuardGroup$1$7$invoke$$inlined$visibleStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = cOUIPagerFooterPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setVisible(bool.booleanValue());
                            }
                        }));
                    }
                });
            }
        });
    }

    public final boolean F0() {
        return ((SHSettingMainVm) c0()).b0().O6();
    }

    public final boolean G0(int i) {
        return i > 0;
    }

    public final void H0(final PreferenceScreen preferenceScreen, DeviceSettings.SettingAbility settingAbility, final boolean z) {
        T4(preferenceScreen, G0(settingAbility.getMenstrualCycleReminder()) || ((SHSettingMainVm) c0()).b0().C7(), new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                if (z) {
                    hCOUIPreferenceCategory.setTitle(R.string.settings_menstrual_cycle);
                }
                final SHSettingMainFragment sHSettingMainFragment = this;
                PrefDsl.DefaultImpls.G0(sHSettingMainFragment, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1$1$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1$1$3", f = "SHSettingMainUI.kt", i = {}, l = {816}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SHSettingMainFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(SHSettingMainFragment sHSettingMainFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = sHSettingMainFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass3;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                wbg.Companion.p(this.this$0.R0(z));
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                SportHealthSetting sportHealthSetting = SportHealthSetting.MENSTRUAL_CYCLE_ENABLE;
                                this.label = 1;
                                obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }

                        @Nullable
                        public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                            return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchLoadingPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                        hCOUISwitchLoadingPreference.setTitle(R.string.settings_menstrual_cycle_title);
                        LiveData liveDataX = sHSettingMainFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1$1$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m100invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getMenstrualCycleSettings().l());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$menstrualCycleGroup$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1$1$invoke$$inlined$checkStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                hCOUISwitchLoadingPreference.stopLoading();
                                COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = sHSettingMainFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1$1$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m101invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().c());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new SHSettingMainFragment$menstrualCycleGroup$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1$1$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(sHSettingMainFragment, null));
                    }
                }, 3, (Object) null);
                SHSettingMainFragment sHSettingMainFragment2 = this;
                PreferenceScreen preferenceScreen2 = preferenceScreen;
                String strL = swf.l(((SHSettingMainVm) sHSettingMainFragment2.c0()).m0() ? R.string.device_settings_menstrual_cycle_uninstall_desc_v3 : R.string.device_settings_menstrual_cycle_uninstall_desc_v2);
                final SHSettingMainFragment sHSettingMainFragment3 = this;
                sHSettingMainFragment2.b0(preferenceScreen2, strL, new Function1<COUIPagerFooterPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1.2
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((COUIPagerFooterPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final COUIPagerFooterPreference cOUIPagerFooterPreference) {
                        Intrinsics.checkNotNullParameter(cOUIPagerFooterPreference, "$this$footerPreference");
                        LiveData liveDataX = sHSettingMainFragment3.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1$2$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m102invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(!sHSettingHomeData.getAppInstallBean().c());
                            }
                        });
                        LifecycleOwner context = cOUIPagerFooterPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$menstrualCycleGroup$1$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$menstrualCycleGroup$1$2$invoke$$inlined$visibleStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = cOUIPagerFooterPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setVisible(bool.booleanValue());
                            }
                        }));
                    }
                });
            }
        });
    }

    public final void J0(final PreferenceScreen preferenceScreen, boolean z, final DeviceSettings.SettingAbility settingAbility, final boolean z2) {
        T4(preferenceScreen, z, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                final boolean zE = ((SHSettingMainVm) this.this$0.c0()).b0().e();
                if (z2) {
                    if (zE) {
                        hCOUIPreferenceCategory.setTitle(R.string.settings_physical_mental_health_auto_monitor);
                    } else {
                        hCOUIPreferenceCategory.setTitle(R.string.settings_stress);
                    }
                }
                SHSettingMainFragment sHSettingMainFragment = this.this$0;
                boolean zG0 = sHSettingMainFragment.G0(settingAbility.getMentalPhysicalState() + settingAbility.getStressAutoMonitoring());
                final SHSettingMainFragment sHSettingMainFragment2 = this.this$0;
                PrefDsl.DefaultImpls.G0(sHSettingMainFragment, hCOUIPreferenceCategory, (String) null, zG0, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$1$4, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$1$4", f = "SHSettingMainUI.kt", i = {}, l = {512}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SHSettingMainFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass4(SHSettingMainFragment sHSettingMainFragment, Continuation<? super AnonymousClass4> continuation) {
                            super(2, continuation);
                            this.this$0 = sHSettingMainFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass4;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                if (((SHSettingMainVm) this.this$0.c0()).b0().e()) {
                                    wbg.Companion.s0(this.this$0.R0(z));
                                } else {
                                    wbg.Companion.o0(this.this$0.R0(z));
                                }
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                SportHealthSetting sportHealthSetting = SportHealthSetting.STRESS_AUTO_MEASURE_ENABLE;
                                this.label = 1;
                                obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }

                        @Nullable
                        public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                            return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchLoadingPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                        if (zE) {
                            hCOUISwitchLoadingPreference.setTitle(R.string.settings_physical_mental_health_auto_monitor);
                        } else {
                            hCOUISwitchLoadingPreference.setTitle(R.string.settings_stress_auto_measure);
                        }
                        if (((Boolean) gd5.c(((SHSettingMainVm) sHSettingMainFragment2.c0()).getMac()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.physicalMentalHealthGroup.1.1.1
                            @NotNull
                            public final Boolean invoke(@NotNull DeviceInfo deviceInfo) {
                                Intrinsics.checkNotNullParameter(deviceInfo, "$this$applyInfo");
                                return Boolean.valueOf(deviceInfo.O9() || deviceInfo.Q9() || deviceInfo.C9() || deviceInfo.H9() || deviceInfo.ha());
                            }
                        })).booleanValue()) {
                            hCOUISwitchLoadingPreference.setSummary(R.string.settings_stress_auto_measure_desc);
                        } else if (zE) {
                            hCOUISwitchLoadingPreference.setSummary(R.string.settings_physical_mental_health_auto_monitor_desc);
                        } else {
                            hCOUISwitchLoadingPreference.setSummary(R.string.settings_stress_auto_measure_desc_heisenberg);
                        }
                        LiveData liveDataX = sHSettingMainFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$1$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m103invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getStressAutoMeasure().l());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$physicalMentalHealthGroup$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$1$invoke$$inlined$checkStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                hCOUISwitchLoadingPreference.stopLoading();
                                COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment3 = sHSettingMainFragment2;
                        LiveData liveDataX2 = sHSettingMainFragment3.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$1$invoke$$inlined$enableStateBy$1
                            {
                                super(1);
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m104invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return ((SHSettingMainVm) sHSettingMainFragment3.c0()).m0() ? Boolean.TRUE : Boolean.valueOf(sHSettingHomeData.getAppInstallBean().e());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new SHSettingMainFragment$physicalMentalHealthGroup$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$1$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        hCOUISwitchLoadingPreference.h(new AnonymousClass4(sHSettingMainFragment2, null));
                    }
                }, 1, (Object) null);
                SHSettingMainFragment sHSettingMainFragment3 = this.this$0;
                DeviceSettings.SettingAbility settingAbility2 = settingAbility;
                boolean zG1 = sHSettingMainFragment3.G0(settingAbility2.getMentalPhysicalStateReminder() + settingAbility2.getBreathingRelaxationReminder());
                final SHSettingMainFragment sHSettingMainFragment4 = this.this$0;
                PrefDsl.DefaultImpls.G0(sHSettingMainFragment3, hCOUIPreferenceCategory, (String) null, zG1, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1.3

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$3$3, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$3$3", f = "SHSettingMainUI.kt", i = {}, l = {533}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C00433 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SHSettingMainFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00433(SHSettingMainFragment sHSettingMainFragment, Continuation<? super C00433> continuation) {
                            super(2, continuation);
                            this.this$0 = sHSettingMainFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            C00433 c00433 = new C00433(this.this$0, continuation);
                            c00433.Z$0 = ((Boolean) obj).booleanValue();
                            return c00433;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                if (((SHSettingMainVm) this.this$0.c0()).b0().e()) {
                                    wbg.Companion.r0(this.this$0.R0(z));
                                } else {
                                    wbg.Companion.p0(this.this$0.R0(z));
                                }
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                SportHealthSetting sportHealthSetting = SportHealthSetting.STRESS_HIGH_NOTIFY_ENABLE;
                                this.label = 1;
                                obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }

                        @Nullable
                        public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                            return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchLoadingPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                        if (((SHSettingMainVm) sHSettingMainFragment4.c0()).b0().e()) {
                            hCOUISwitchLoadingPreference.setTitle(R.string.settings_physical_mental_health_remind);
                        } else {
                            hCOUISwitchLoadingPreference.setTitle(R.string.settings_breath_relax_remind);
                        }
                        LiveData liveDataX = sHSettingMainFragment4.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$3$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m106invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().e() && sHSettingHomeData.getSettings().getStressAutoMeasure().l());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$physicalMentalHealthGroup$1$3$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$3$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = sHSettingMainFragment4.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$3$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m105invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getBreatheRelax().l());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new SHSettingMainFragment$physicalMentalHealthGroup$1$3$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$3$invoke$$inlined$checkStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                hCOUISwitchLoadingPreference.stopLoading();
                                COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                            }
                        }));
                        hCOUISwitchLoadingPreference.h(new C00433(sHSettingMainFragment4, null));
                    }
                }, 1, (Object) null);
                SHSettingMainFragment sHSettingMainFragment5 = this.this$0;
                boolean zG2 = sHSettingMainFragment5.G0(settingAbility.getAchievementReminder());
                final SHSettingMainFragment sHSettingMainFragment6 = this.this$0;
                PrefDsl.DefaultImpls.G0(sHSettingMainFragment5, hCOUIPreferenceCategory, (String) null, zG2, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1.4

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$4$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$4$3", f = "SHSettingMainUI.kt", i = {}, l = {544}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SHSettingMainFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(SHSettingMainFragment sHSettingMainFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = sHSettingMainFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass3;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                wbg.Companion.q0(this.this$0.R0(z));
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                SportHealthSetting sportHealthSetting = SportHealthSetting.ACHIEVEMENT_REMINDER_ENABLE;
                                this.label = 1;
                                obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }

                        @Nullable
                        public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                            return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchLoadingPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                        hCOUISwitchLoadingPreference.setTitle(R.string.settings_physical_mental_health_achievement_reminder);
                        LiveData liveDataX = sHSettingMainFragment6.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$4$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m107invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getAchievementReminderSettings().l());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$physicalMentalHealthGroup$1$4$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$4$invoke$$inlined$checkStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                hCOUISwitchLoadingPreference.stopLoading();
                                COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = sHSettingMainFragment6.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$4$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m108invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().e());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new SHSettingMainFragment$physicalMentalHealthGroup$1$4$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$4$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(sHSettingMainFragment6, null));
                    }
                }, 1, (Object) null);
                SHSettingMainFragment sHSettingMainFragment7 = this.this$0;
                boolean zG3 = sHSettingMainFragment7.G0(settingAbility.getGoalSetting());
                final SHSettingMainFragment sHSettingMainFragment8 = this.this$0;
                sHSettingMainFragment7.h1(hCOUIPreferenceCategory, zG3, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1.5
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.settings_physical_mental_health_goal_settings);
                        LiveData liveDataX = sHSettingMainFragment8.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$5$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m109invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().e());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$physicalMentalHealthGroup$1$5$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$5$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment9 = sHSettingMainFragment8;
                        sHSettingMainFragment9.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.physicalMentalHealthGroup.1.5.2
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment9.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment9.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.V0(fragmentActivityRequireActivity);
                            }
                        });
                    }
                });
                SHSettingMainFragment sHSettingMainFragment9 = this.this$0;
                PreferenceScreen preferenceScreen2 = preferenceScreen;
                String strL = swf.l(((SHSettingMainVm) sHSettingMainFragment9.c0()).m0() ? R.string.device_settings_physical_mental_uninstall_desc_v3 : R.string.device_settings_physical_mental_uninstall_desc_v2);
                final SHSettingMainFragment sHSettingMainFragment10 = this.this$0;
                sHSettingMainFragment9.b0(preferenceScreen2, strL, new Function1<COUIPagerFooterPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1.6
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((COUIPagerFooterPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final COUIPagerFooterPreference cOUIPagerFooterPreference) {
                        Intrinsics.checkNotNullParameter(cOUIPagerFooterPreference, "$this$footerPreference");
                        LiveData liveDataX = sHSettingMainFragment10.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$6$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m110invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(!sHSettingHomeData.getAppInstallBean().e());
                            }
                        });
                        LifecycleOwner context = cOUIPagerFooterPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$physicalMentalHealthGroup$1$6$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$physicalMentalHealthGroup$1$6$invoke$$inlined$visibleStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = cOUIPagerFooterPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setVisible(bool.booleanValue());
                            }
                        }));
                    }
                });
            }
        });
    }

    public final void K0(PreferenceScreen preferenceScreen, DeviceSettings.SettingAbility settingAbility, final boolean z) {
        T4(preferenceScreen, G0(settingAbility.getFallDetection()), new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$securityGuardGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                if (z) {
                    hCOUIPreferenceCategory.setTitle(R.string.settings_security_guard);
                }
                final SHSettingMainFragment sHSettingMainFragment = this;
                PrefDsl.DefaultImpls.R(sHSettingMainFragment, hCOUIPreferenceCategory, false, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$securityGuardGroup$1.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$securityGuardGroup$1$1$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Boolean> {
                        public final /* synthetic */ HCOUIJumpPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(HCOUIJumpPreference hCOUIJumpPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = hCOUIJumpPreference;
                            this.j = sHSettingMainFragment;
                        }

                        public final void a(boolean z) {
                            this.i.setSummary(this.j.L0(z));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Boolean) obj).booleanValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(com.heytap.wearable.emergency.api.R.string.settings_fall_down);
                        SHSettingMainFragment sHSettingMainFragment2 = sHSettingMainFragment;
                        sHSettingMainFragment2.d0(((SHSettingMainVm) sHSettingMainFragment2.c0()).x(new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.securityGuardGroup.1.1.1
                            @Nullable
                            public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getFallDown().l());
                            }
                        }), new a(hCOUIJumpPreference, sHSettingMainFragment));
                        final SHSettingMainFragment sHSettingMainFragment3 = sHSettingMainFragment;
                        sHSettingMainFragment3.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.securityGuardGroup.1.1.3
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment3.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment3.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.R0(fragmentActivityRequireActivity);
                            }
                        });
                    }
                }, 1, (Object) null);
            }
        });
    }

    public final SpannedString L0(boolean z) {
        String strL = swf.l(z ? R.string.settings_state_on : R.string.settings_state_off);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        return b9i.f(strL, themeColor(contextRequireContext));
    }

    public final void M0(COUIPreferenceCategory cOUIPreferenceCategory, DeviceSettings.SettingAbility settingAbility, final Function1<? super SHSettingHomeData, Boolean> function1) {
        h1(cOUIPreferenceCategory, G0(settingAbility.getSleepScheduleReminder()), new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepScheduleReminderSlot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIJumpPreference) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                hCOUIJumpPreference.setTitle(R.string.device_settings_title_rest);
                SHSettingMainFragment sHSettingMainFragment = this.this$0;
                final Function1<SHSettingHomeData, Boolean> function2 = function1;
                LiveData liveDataX = sHSettingMainFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepScheduleReminderSlot$1$invoke$$inlined$visibleStateBy$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m112invoke(@Nullable Object obj) {
                        Function1 function3 = function2;
                        if (!(obj instanceof SHSettingHomeData)) {
                            obj = null;
                        }
                        SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                        Intrinsics.checkNotNull(sHSettingHomeData);
                        return (Boolean) function3.invoke(sHSettingHomeData);
                    }
                });
                LifecycleOwner context = hCOUIJumpPreference.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                liveDataX.observe(context, new SHSettingMainFragment$sleepScheduleReminderSlot$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepScheduleReminderSlot$1$invoke$$inlined$visibleStateBy$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Boolean) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Boolean bool) {
                        Preference preference = hCOUIJumpPreference;
                        Intrinsics.checkNotNullExpressionValue(bool, "it");
                        preference.setVisible(bool.booleanValue());
                    }
                }));
                final SHSettingMainFragment sHSettingMainFragment2 = this.this$0;
                LiveData liveDataX2 = sHSettingMainFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepScheduleReminderSlot$1$invoke$$inlined$enableStateBy$1
                    {
                        super(1);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m111invoke(@Nullable Object obj) {
                        if (!(obj instanceof SHSettingHomeData)) {
                            obj = null;
                        }
                        SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                        Intrinsics.checkNotNull(sHSettingHomeData);
                        return ((SHSettingMainVm) sHSettingMainFragment2.c0()).m0() ? Boolean.TRUE : Boolean.valueOf(sHSettingHomeData.getAppInstallBean().f());
                    }
                });
                LifecycleOwner context2 = hCOUIJumpPreference.getContext();
                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                liveDataX2.observe(context2, new SHSettingMainFragment$sleepScheduleReminderSlot$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepScheduleReminderSlot$1$invoke$$inlined$enableStateBy$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Boolean) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Boolean bool) {
                        Preference preference = hCOUIJumpPreference;
                        Intrinsics.checkNotNullExpressionValue(bool, "it");
                        preference.setEnabled(bool.booleanValue());
                    }
                }));
                final SHSettingMainFragment sHSettingMainFragment3 = this.this$0;
                sHSettingMainFragment3.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepScheduleReminderSlot$1.2
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Preference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Preference preference) {
                        Intrinsics.checkNotNullParameter(preference, "it");
                        SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment3.c0();
                        FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment3.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                        sHSettingMainVm.Y0(fragmentActivityRequireActivity);
                    }
                });
            }
        });
    }

    public final void N0(final PreferenceScreen preferenceScreen, boolean z, final DeviceSettings.SettingAbility settingAbility, final boolean z2) {
        T4(preferenceScreen, z, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                if (z2) {
                    hCOUIPreferenceCategory.setTitle(R.string.settings_sleep);
                }
                final SHSettingMainFragment sHSettingMainFragment = this;
                sHSettingMainFragment.O0(hCOUIPreferenceCategory, settingAbility, new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1.1
                    {
                        super(1);
                    }

                    @NotNull
                    public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$snoringRiskAssessmentSlot");
                        boolean z3 = false;
                        if (((SHSettingMainVm) sHSettingMainFragment.c0()).b0().B7() && ((SHSettingMainVm) sHSettingMainFragment.c0()).m0() && sHSettingHomeData.getAppInstallBean().d() && !sHSettingHomeData.getAppInstallBean().f()) {
                            z3 = true;
                        }
                        return Boolean.valueOf(z3);
                    }
                });
                final SHSettingMainFragment sHSettingMainFragment2 = this;
                sHSettingMainFragment2.M0(hCOUIPreferenceCategory, settingAbility, new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1.2
                    {
                        super(1);
                    }

                    @NotNull
                    public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$sleepScheduleReminderSlot");
                        return Boolean.valueOf(((SHSettingMainVm) sHSettingMainFragment2.c0()).m0() && !sHSettingHomeData.getAppInstallBean().f());
                    }
                });
                final SHSettingMainFragment sHSettingMainFragment3 = this;
                sHSettingMainFragment3.O0(hCOUIPreferenceCategory, settingAbility, new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1.3
                    {
                        super(1);
                    }

                    @NotNull
                    public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$snoringRiskAssessmentSlot");
                        boolean z3 = true;
                        if (((SHSettingMainVm) sHSettingMainFragment3.c0()).b0().B7() && !sHSettingHomeData.getAppInstallBean().d() && sHSettingHomeData.getAppInstallBean().f()) {
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                    }
                });
                SHSettingMainFragment sHSettingMainFragment4 = this;
                boolean zG0 = sHSettingMainFragment4.G0(settingAbility.getSleepRespiratoryRateMonitoring());
                final SHSettingMainFragment sHSettingMainFragment5 = this;
                sHSettingMainFragment4.h1(hCOUIPreferenceCategory, zG0, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1.4

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$4$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Boolean> {
                        public final /* synthetic */ HCOUIJumpPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(HCOUIJumpPreference hCOUIJumpPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = hCOUIJumpPreference;
                            this.j = sHSettingMainFragment;
                        }

                        public final void a(boolean z) {
                            this.i.setSummary(this.j.L0(z));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Boolean) obj).booleanValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.settings_health_sleep_breathing_rate_monitor);
                        SHSettingMainFragment sHSettingMainFragment6 = sHSettingMainFragment5;
                        sHSettingMainFragment6.d0(((SHSettingMainVm) sHSettingMainFragment6.c0()).x(new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sleepSettingGroup.1.4.1
                            @Nullable
                            public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getBreatheRate().l());
                            }
                        }), new a(hCOUIJumpPreference, sHSettingMainFragment5));
                        LiveData liveDataX = sHSettingMainFragment5.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$4$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m113invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().f());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sleepSettingGroup$1$4$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$4$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment7 = sHSettingMainFragment5;
                        sHSettingMainFragment7.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sleepSettingGroup.1.4.4
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment7.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment7.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.Z0(fragmentActivityRequireActivity);
                            }
                        });
                    }
                });
                SHSettingMainFragment sHSettingMainFragment6 = this;
                boolean zG1 = sHSettingMainFragment6.G0(settingAbility.getSleepIntervalBloodOxygen());
                final SHSettingMainFragment sHSettingMainFragment7 = this;
                sHSettingMainFragment6.h1(hCOUIPreferenceCategory, zG1, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1.5

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$5$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Boolean> {
                        public final /* synthetic */ HCOUIJumpPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(HCOUIJumpPreference hCOUIJumpPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = hCOUIJumpPreference;
                            this.j = sHSettingMainFragment;
                        }

                        public final void a(boolean z) {
                            this.i.setSummary(this.j.L0(z));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Boolean) obj).booleanValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        if (((Boolean) gd5.c(((SHSettingMainVm) sHSettingMainFragment7.c0()).getMac()).a(SHSettingMainFragment$sleepSettingGroup$1$5$onePlusWatch1$1.INSTANCE)).booleanValue()) {
                            hCOUIJumpPreference.setTitle(R.string.band_sleep_blood_oxygen_monitor);
                        } else {
                            hCOUIJumpPreference.setTitle(R.string.band_sleep_spo2_interval_monitor);
                        }
                        hCOUIJumpPreference.setTitle(R.string.band_sleep_spo2_interval_monitor);
                        SHSettingMainFragment sHSettingMainFragment8 = sHSettingMainFragment7;
                        sHSettingMainFragment8.d0(((SHSettingMainVm) sHSettingMainFragment8.c0()).x(new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sleepSettingGroup.1.5.1
                            @Nullable
                            public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getSpo2().getOximetryEnable());
                            }
                        }), new a(hCOUIJumpPreference, sHSettingMainFragment7));
                        LiveData liveDataX = sHSettingMainFragment7.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$5$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m114invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().f());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sleepSettingGroup$1$5$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$5$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment9 = sHSettingMainFragment7;
                        sHSettingMainFragment9.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sleepSettingGroup.1.5.4
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment9.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment9.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.N0(fragmentActivityRequireActivity);
                            }
                        });
                    }
                });
                SHSettingMainFragment sHSettingMainFragment8 = this;
                boolean zG2 = sHSettingMainFragment8.G0(settingAbility.getRemSleepMonitoring());
                final SHSettingMainFragment sHSettingMainFragment9 = this;
                sHSettingMainFragment8.h1(hCOUIPreferenceCategory, zG2, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1.6

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$6$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Boolean> {
                        public final /* synthetic */ HCOUIJumpPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(HCOUIJumpPreference hCOUIJumpPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = hCOUIJumpPreference;
                            this.j = sHSettingMainFragment;
                        }

                        public final void a(boolean z) {
                            this.i.setSummary(this.j.L0(z));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Boolean) obj).booleanValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.settings_sleep_rapid_eye_movement_monitor);
                        SHSettingMainFragment sHSettingMainFragment10 = sHSettingMainFragment9;
                        sHSettingMainFragment10.d0(((SHSettingMainVm) sHSettingMainFragment10.c0()).x(new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sleepSettingGroup.1.6.1
                            @Nullable
                            public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getSleepRem().l());
                            }
                        }), new a(hCOUIJumpPreference, sHSettingMainFragment9));
                        LiveData liveDataX = sHSettingMainFragment9.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$6$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m115invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().f());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sleepSettingGroup$1$6$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$6$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment11 = sHSettingMainFragment9;
                        sHSettingMainFragment11.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sleepSettingGroup.1.6.4
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment11.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment11.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.a1(fragmentActivityRequireActivity);
                            }
                        });
                    }
                });
                final SHSettingMainFragment sHSettingMainFragment10 = this;
                sHSettingMainFragment10.M0(hCOUIPreferenceCategory, settingAbility, new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1.7
                    {
                        super(1);
                    }

                    @NotNull
                    public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$sleepScheduleReminderSlot");
                        return Boolean.valueOf(!((SHSettingMainVm) sHSettingMainFragment10.c0()).m0() || (((SHSettingMainVm) sHSettingMainFragment10.c0()).m0() && sHSettingHomeData.getAppInstallBean().f()));
                    }
                });
                SHSettingMainFragment sHSettingMainFragment11 = this;
                boolean zG3 = sHSettingMainFragment11.G0(settingAbility.getSleepDataCalibration());
                final SHSettingMainFragment sHSettingMainFragment12 = this;
                sHSettingMainFragment11.h1(hCOUIPreferenceCategory, zG3, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1.8
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.device_settings_title_sleep_calibration);
                        LiveData liveDataX = sHSettingMainFragment12.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$8$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m116invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().f());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sleepSettingGroup$1$8$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$8$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment13 = sHSettingMainFragment12;
                        sHSettingMainFragment13.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sleepSettingGroup.1.8.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                try {
                                    Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
                                    intent.setFlags(268435456);
                                    intent.setData(Uri.fromParts("package", hCOUIJumpPreference.getContext().getPackageName(), null));
                                    sHSettingMainFragment13.startActivity(intent);
                                } catch (Exception unused) {
                                }
                            }
                        });
                    }
                });
                final SHSettingMainFragment sHSettingMainFragment13 = this;
                sHSettingMainFragment13.O0(hCOUIPreferenceCategory, settingAbility, new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1.9
                    {
                        super(1);
                    }

                    @NotNull
                    public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$snoringRiskAssessmentSlot");
                        boolean z3 = false;
                        if (((SHSettingMainVm) sHSettingMainFragment13.c0()).b0().B7() && !((SHSettingMainVm) sHSettingMainFragment13.c0()).m0() && !sHSettingHomeData.getAppInstallBean().d() && sHSettingHomeData.getAppInstallBean().f()) {
                            z3 = true;
                        }
                        return Boolean.valueOf(z3);
                    }
                });
                final SHSettingMainFragment sHSettingMainFragment14 = this;
                sHSettingMainFragment14.b0(preferenceScreen, "", new Function1<COUIPagerFooterPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1.10

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sleepSettingGroup$1$10$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/ob0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<ob0> {
                        public final /* synthetic */ SHSettingMainFragment i;
                        public final /* synthetic */ COUIPagerFooterPreference j;

                        public a(SHSettingMainFragment sHSettingMainFragment, COUIPagerFooterPreference cOUIPagerFooterPreference) {
                            this.i = sHSettingMainFragment;
                            this.j = cOUIPagerFooterPreference;
                        }

                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final void onChanged(@NotNull ob0 ob0Var) {
                            Intrinsics.checkNotNullParameter(ob0Var, "it");
                            boolean z = ((SHSettingMainVm) this.i.c0()).b0().B7() && !ob0Var.d();
                            boolean z2 = !ob0Var.f();
                            this.j.setVisible(z || z2);
                            if (z || z2) {
                                SHSettingMainFragment sHSettingMainFragment = this.i;
                                List listCreateListBuilder = CollectionsKt.createListBuilder();
                                if (z) {
                                    listCreateListBuilder.add(swf.l(R.string.device_settings_osa_uninstall_desc_v2));
                                }
                                if (z2) {
                                    listCreateListBuilder.add(((SHSettingMainVm) sHSettingMainFragment.c0()).m0() ? swf.l(R.string.device_settings_sleep_uninstall_desc_v3) : swf.l(R.string.device_settings_sleep_uninstall_desc_v2));
                                }
                                this.j.setSummary(CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                            }
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((COUIPagerFooterPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull COUIPagerFooterPreference cOUIPagerFooterPreference) {
                        Intrinsics.checkNotNullParameter(cOUIPagerFooterPreference, "$this$footerPreference");
                        SHSettingMainFragment sHSettingMainFragment15 = sHSettingMainFragment14;
                        sHSettingMainFragment15.d0(((SHSettingMainVm) sHSettingMainFragment15.c0()).x(new Function1<SHSettingHomeData, ob0>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sleepSettingGroup.1.10.1
                            @Nullable
                            public final ob0 invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return sHSettingHomeData.getAppInstallBean();
                            }
                        }), new a(sHSettingMainFragment14, cOUIPagerFooterPreference));
                    }
                });
            }
        });
    }

    public final void O0(COUIPreferenceCategory cOUIPreferenceCategory, DeviceSettings.SettingAbility settingAbility, final Function1<? super SHSettingHomeData, Boolean> function1) {
        h1(cOUIPreferenceCategory, G0(settingAbility.getSnoringRiskAssessment()), new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$snoringRiskAssessmentSlot$1

            @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a implements Observer<Boolean> {
                public final /* synthetic */ HCOUIJumpPreference i;
                public final /* synthetic */ SHSettingMainFragment j;

                public a(HCOUIJumpPreference hCOUIJumpPreference, SHSettingMainFragment sHSettingMainFragment) {
                    this.i = hCOUIJumpPreference;
                    this.j = sHSettingMainFragment;
                }

                public final void a(boolean z) {
                    this.i.setSummary(this.j.L0(z));
                }

                public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                    a(((Boolean) obj).booleanValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIJumpPreference) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                if (((SHSettingMainVm) this.this$0.c0()).b0().B7()) {
                    hCOUIJumpPreference.setTitle(R.string.settings_health_snoring_risk_new);
                } else {
                    hCOUIJumpPreference.setTitle(R.string.settings_health_snoring_risk);
                }
                SHSettingMainFragment sHSettingMainFragment = this.this$0;
                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment.c0();
                final SHSettingMainFragment sHSettingMainFragment2 = this.this$0;
                sHSettingMainFragment.d0(sHSettingMainVm.x(new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$snoringRiskAssessmentSlot$1.1
                    {
                        super(1);
                    }

                    @Nullable
                    public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                        boolean zL;
                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                        if (((SHSettingMainVm) sHSettingMainFragment2.c0()).b0().O5()) {
                            zL = sHSettingHomeData.getSettings().getOsa().l();
                        } else {
                            zL = sHSettingHomeData.getSettings().getOsa().l() && sHSettingHomeData.getSettings().getSpo2().getOximetryType() == 0;
                        }
                        return Boolean.valueOf(zL);
                    }
                }), new a(hCOUIJumpPreference, this.this$0));
                SHSettingMainFragment sHSettingMainFragment3 = this.this$0;
                final Function1<SHSettingHomeData, Boolean> function2 = function1;
                LiveData liveDataX = sHSettingMainFragment3.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$snoringRiskAssessmentSlot$1$invoke$$inlined$visibleStateBy$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m118invoke(@Nullable Object obj) {
                        Function1 function3 = function2;
                        if (!(obj instanceof SHSettingHomeData)) {
                            obj = null;
                        }
                        SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                        Intrinsics.checkNotNull(sHSettingHomeData);
                        return (Boolean) function3.invoke(sHSettingHomeData);
                    }
                });
                LifecycleOwner context = hCOUIJumpPreference.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                liveDataX.observe(context, new SHSettingMainFragment$snoringRiskAssessmentSlot$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$snoringRiskAssessmentSlot$1$invoke$$inlined$visibleStateBy$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Boolean) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Boolean bool) {
                        Preference preference = hCOUIJumpPreference;
                        Intrinsics.checkNotNullExpressionValue(bool, "it");
                        preference.setVisible(bool.booleanValue());
                    }
                }));
                final SHSettingMainFragment sHSettingMainFragment4 = this.this$0;
                LiveData liveDataX2 = sHSettingMainFragment4.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$snoringRiskAssessmentSlot$1$invoke$$inlined$enableStateBy$1
                    {
                        super(1);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m117invoke(@Nullable Object obj) {
                        if (!(obj instanceof SHSettingHomeData)) {
                            obj = null;
                        }
                        SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                        Intrinsics.checkNotNull(sHSettingHomeData);
                        return Boolean.valueOf(((SHSettingMainVm) sHSettingMainFragment4.c0()).b0().B7() ? sHSettingHomeData.getAppInstallBean().d() : sHSettingHomeData.getAppInstallBean().f());
                    }
                });
                LifecycleOwner context2 = hCOUIJumpPreference.getContext();
                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                liveDataX2.observe(context2, new SHSettingMainFragment$snoringRiskAssessmentSlot$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$snoringRiskAssessmentSlot$1$invoke$$inlined$enableStateBy$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Boolean) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Boolean bool) {
                        Preference preference = hCOUIJumpPreference;
                        Intrinsics.checkNotNullExpressionValue(bool, "it");
                        preference.setEnabled(bool.booleanValue());
                    }
                }));
                final SHSettingMainFragment sHSettingMainFragment5 = this.this$0;
                sHSettingMainFragment5.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$snoringRiskAssessmentSlot$1.4
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Preference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Preference preference) {
                        Intrinsics.checkNotNullParameter(preference, "it");
                        SHSettingMainVm sHSettingMainVm2 = (SHSettingMainVm) sHSettingMainFragment5.c0();
                        FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment5.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                        sHSettingMainVm2.d1(fragmentActivityRequireActivity);
                    }
                });
            }
        });
    }

    public final void P0(PreferenceScreen preferenceScreen, DeviceSettings.SettingAbility settingAbility, final boolean z) {
        T4(preferenceScreen, G0(settingAbility.getBloodOxygenSetting()), new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$spo2Group$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                if (z) {
                    hCOUIPreferenceCategory.setTitle(R.string.settings_spo2);
                }
                final SHSettingMainFragment sHSettingMainFragment = this;
                PrefDsl.DefaultImpls.R(sHSettingMainFragment, hCOUIPreferenceCategory, false, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$spo2Group$1.1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.band_blood_oxygen_monitor);
                        final SHSettingMainFragment sHSettingMainFragment2 = sHSettingMainFragment;
                        sHSettingMainFragment2.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.spo2Group.1.1.1
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment2.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment2.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.e1(fragmentActivityRequireActivity);
                            }
                        });
                    }
                }, 1, (Object) null);
            }
        });
    }

    public final void Q0(final PreferenceScreen preferenceScreen, boolean z, final DeviceSettings.SettingAbility settingAbility, final boolean z2) {
        T4(preferenceScreen, z, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                if (z2) {
                    hCOUIPreferenceCategory.setTitle(R.string.settings_sports);
                }
                SHSettingMainFragment sHSettingMainFragment = this;
                boolean zG0 = sHSettingMainFragment.G0(settingAbility.getAutoPauseDuringExercise());
                final SHSettingMainFragment sHSettingMainFragment2 = this;
                PrefDsl.DefaultImpls.G0(sHSettingMainFragment, hCOUIPreferenceCategory, (String) null, zG0, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$1$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$1$3", f = "SHSettingMainUI.kt", i = {}, l = {ATDataProfile.CMD_DIAL_INFO}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SHSettingMainFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(SHSettingMainFragment sHSettingMainFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = sHSettingMainFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass3;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                wbg.Companion.i(this.this$0.R0(z));
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                SportHealthSetting sportHealthSetting = SportHealthSetting.AUTO_PAUSE_SPORT_ENABLE;
                                this.label = 1;
                                obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }

                        @Nullable
                        public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                            return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchLoadingPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                        hCOUISwitchLoadingPreference.setTitle(R.string.settings_watch_auto_pause);
                        hCOUISwitchLoadingPreference.setSummary(R.string.settings_watch_auto_pause_des_watch3);
                        LiveData liveDataX = sHSettingMainFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$1$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m119invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getSportsAutoPause().l());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$1$invoke$$inlined$checkStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                hCOUISwitchLoadingPreference.stopLoading();
                                COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = sHSettingMainFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$1$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m120invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new SHSettingMainFragment$sportSettingGroup$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$1$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(sHSettingMainFragment2, null));
                    }
                }, 1, (Object) null);
                if (this.G0(settingAbility.getAutoExerciseRecognition() + settingAbility.getExerciseStartReminder())) {
                    if (((SHSettingMainVm) this.c0()).b0().N2() || this.G0(settingAbility.getExerciseStartReminder())) {
                        final SHSettingMainFragment sHSettingMainFragment3 = this;
                        final DeviceSettings.SettingAbility settingAbility2 = settingAbility;
                        PrefDsl.DefaultImpls.R(sHSettingMainFragment3, hCOUIPreferenceCategory, false, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.2

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$2$a */
                            @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            public static final class a implements Observer<Boolean> {
                                public final /* synthetic */ HCOUIJumpPreference i;
                                public final /* synthetic */ SHSettingMainFragment j;

                                public a(HCOUIJumpPreference hCOUIJumpPreference, SHSettingMainFragment sHSettingMainFragment) {
                                    this.i = hCOUIJumpPreference;
                                    this.j = sHSettingMainFragment;
                                }

                                public final void a(boolean z) {
                                    this.i.setSummary(this.j.L0(z));
                                }

                                public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                                    a(((Boolean) obj).booleanValue());
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((HCOUIJumpPreference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                                Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                                final int i = sHSettingMainFragment3.G0(settingAbility2.getExerciseStartReminder()) ? R.string.settings_health_auto_recognize_sport_new : R.string.settings_health_auto_recognize_sport;
                                hCOUIJumpPreference.setTitle(i);
                                SHSettingMainFragment sHSettingMainFragment4 = sHSettingMainFragment3;
                                sHSettingMainFragment4.d0(((SHSettingMainVm) sHSettingMainFragment4.c0()).x(new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sportSettingGroup.1.2.1
                                    @Nullable
                                    public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                        Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                        return Boolean.valueOf(sHSettingHomeData.getSettings().getSportsAutoRecognize().getAutoRecognizeSportEnable());
                                    }
                                }), new a(hCOUIJumpPreference, sHSettingMainFragment3));
                                LiveData liveDataX = sHSettingMainFragment3.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$2$invoke$$inlined$enableStateBy$1
                                    @Nullable
                                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                    public final Boolean m124invoke(@Nullable Object obj) {
                                        if (!(obj instanceof SHSettingHomeData)) {
                                            obj = null;
                                        }
                                        SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                        Intrinsics.checkNotNull(sHSettingHomeData);
                                        return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h());
                                    }
                                });
                                LifecycleOwner context = hCOUIJumpPreference.getContext();
                                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                                liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$2$invoke$$inlined$enableStateBy$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Boolean) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Boolean bool) {
                                        Preference preference = hCOUIJumpPreference;
                                        Intrinsics.checkNotNullExpressionValue(bool, "it");
                                        preference.setEnabled(bool.booleanValue());
                                    }
                                }));
                                final SHSettingMainFragment sHSettingMainFragment5 = sHSettingMainFragment3;
                                sHSettingMainFragment5.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sportSettingGroup.1.2.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Preference) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull Preference preference) {
                                        Intrinsics.checkNotNullParameter(preference, "it");
                                        SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment5.c0();
                                        int i2 = i;
                                        FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment5.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                        sHSettingMainVm.M0(i2, fragmentActivityRequireActivity);
                                    }
                                });
                            }
                        }, 1, (Object) null);
                    } else {
                        final SHSettingMainFragment sHSettingMainFragment4 = this;
                        PrefDsl.DefaultImpls.G0(sHSettingMainFragment4, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.3

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$3$3, reason: invalid class name and collision with other inner class name */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            public /* synthetic */ class C00473 extends FunctionReferenceImpl implements Function1<DeviceModel, Boolean> {
                                public static final C00473 INSTANCE = new C00473();

                                public C00473() {
                                    super(1, DeviceModel.class, "isWatch2", "isWatch2()Z", 0);
                                }

                                @NotNull
                                public final Boolean invoke(@NotNull DeviceModel deviceModel) {
                                    Intrinsics.checkNotNullParameter(deviceModel, "p0");
                                    return Boolean.valueOf(deviceModel.Q9());
                                }
                            }

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$3$4, reason: invalid class name */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<DeviceModel, Boolean> {
                                public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

                                public AnonymousClass4() {
                                    super(1, DeviceModel.class, "isHeisenberg", "isHeisenberg()Z", 0);
                                }

                                @NotNull
                                public final Boolean invoke(@NotNull DeviceModel deviceModel) {
                                    Intrinsics.checkNotNullParameter(deviceModel, "p0");
                                    return Boolean.valueOf(deviceModel.G9());
                                }
                            }

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$3$5, reason: invalid class name */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<DeviceModel, Boolean> {
                                public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

                                public AnonymousClass5() {
                                    super(1, DeviceModel.class, "isWatchFree", "isWatchFree()Z", 0);
                                }

                                @NotNull
                                public final Boolean invoke(@NotNull DeviceModel deviceModel) {
                                    Intrinsics.checkNotNullParameter(deviceModel, "p0");
                                    return Boolean.valueOf(deviceModel.ha());
                                }
                            }

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$3$6, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$3$6", f = "SHSettingMainUI.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass6 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                                /* synthetic */ boolean Z$0;
                                int label;
                                final /* synthetic */ SHSettingMainFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass6(SHSettingMainFragment sHSettingMainFragment, Continuation<? super AnonymousClass6> continuation) {
                                    super(2, continuation);
                                    this.this$0 = sHSettingMainFragment;
                                }

                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0, continuation);
                                    anonymousClass6.Z$0 = ((Boolean) obj).booleanValue();
                                    return anonymousClass6;
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                                }

                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        boolean z = this.Z$0;
                                        SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                        SportHealthSetting sportHealthSetting = SportHealthSetting.AUTO_RECOGNIZE_SPORT_ENABLE;
                                        this.label = 1;
                                        obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return obj;
                                }

                                @Nullable
                                public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                                    return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((HCOUISwitchLoadingPreference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                                Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                                LiveData liveDataX = sHSettingMainFragment4.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$3$invoke$$inlined$checkStateBy$1
                                    @Nullable
                                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                    public final Boolean m125invoke(@Nullable Object obj) {
                                        if (!(obj instanceof SHSettingHomeData)) {
                                            obj = null;
                                        }
                                        SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                        Intrinsics.checkNotNull(sHSettingHomeData);
                                        return Boolean.valueOf(sHSettingHomeData.getSettings().getSportsAutoRecognize().getAutoRecognizeSportEnable());
                                    }
                                });
                                LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                                liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$3$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$3$invoke$$inlined$checkStateBy$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Boolean) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Boolean bool) {
                                        hCOUISwitchLoadingPreference.stopLoading();
                                        COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                        Intrinsics.checkNotNullExpressionValue(bool, "it");
                                        cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                                    }
                                }));
                                LiveData liveDataX2 = sHSettingMainFragment4.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$3$invoke$$inlined$enableStateBy$1
                                    @Nullable
                                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                    public final Boolean m126invoke(@Nullable Object obj) {
                                        if (!(obj instanceof SHSettingHomeData)) {
                                            obj = null;
                                        }
                                        SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                        Intrinsics.checkNotNull(sHSettingHomeData);
                                        return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h());
                                    }
                                });
                                LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                                liveDataX2.observe(context2, new SHSettingMainFragment$sportSettingGroup$1$3$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$3$invoke$$inlined$enableStateBy$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Boolean) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Boolean bool) {
                                        Preference preference = hCOUISwitchLoadingPreference;
                                        Intrinsics.checkNotNullExpressionValue(bool, "it");
                                        preference.setEnabled(bool.booleanValue());
                                    }
                                }));
                                hCOUISwitchLoadingPreference.setTitle(R.string.settings_health_auto_recognize_sport);
                                as3 as3VarD = gd5.d(((SHSettingMainVm) sHSettingMainFragment4.c0()).getMac());
                                if (((Boolean) as3VarD.a(C00473.INSTANCE)).booleanValue()) {
                                    hCOUISwitchLoadingPreference.setSummary(R.string.settings_health_auto_recognize_sport_des_watch2);
                                } else if (((Boolean) as3VarD.a(AnonymousClass4.INSTANCE)).booleanValue()) {
                                    hCOUISwitchLoadingPreference.setSummary(R.string.settings_health_auto_recognize_sport_des_heisenberg);
                                } else if (((Boolean) as3VarD.a(AnonymousClass5.INSTANCE)).booleanValue()) {
                                    hCOUISwitchLoadingPreference.setSummary(R.string.settings_health_auto_recognize_sport_des_watch_free);
                                } else {
                                    hCOUISwitchLoadingPreference.setSummary(R.string.settings_health_auto_recognize_sport_des);
                                }
                                hCOUISwitchLoadingPreference.h(new AnonymousClass6(sHSettingMainFragment4, null));
                            }
                        }, 3, (Object) null);
                    }
                }
                SHSettingMainFragment sHSettingMainFragment5 = this;
                boolean zG1 = sHSettingMainFragment5.G0(settingAbility.getExerciseContinueReminder());
                final SHSettingMainFragment sHSettingMainFragment6 = this;
                PrefDsl.DefaultImpls.G0(sHSettingMainFragment5, hCOUIPreferenceCategory, (String) null, zG1, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.4

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$4$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$4$3", f = "SHSettingMainUI.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SHSettingMainFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(SHSettingMainFragment sHSettingMainFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = sHSettingMainFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass3;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                SportHealthSetting sportHealthSetting = SportHealthSetting.CONTINUE_SPORT_REMINDER_ENABLE;
                                this.label = 1;
                                obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }

                        @Nullable
                        public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                            return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchLoadingPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                        hCOUISwitchLoadingPreference.setTitle(R.string.settings_health_auto_recognize_sport_continue);
                        hCOUISwitchLoadingPreference.setSummary(R.string.settings_health_auto_recognize_sport_continue_desc);
                        LiveData liveDataX = sHSettingMainFragment6.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$4$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m127invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getContinueSportRemindSettings().l());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$4$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$4$invoke$$inlined$checkStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                hCOUISwitchLoadingPreference.stopLoading();
                                COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = sHSettingMainFragment6.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$4$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m128invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new SHSettingMainFragment$sportSettingGroup$1$4$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$4$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(sHSettingMainFragment6, null));
                    }
                }, 1, (Object) null);
                SHSettingMainFragment sHSettingMainFragment7 = this;
                boolean zG2 = sHSettingMainFragment7.G0(settingAbility.getExerciseEndReminder());
                final SHSettingMainFragment sHSettingMainFragment8 = this;
                PrefDsl.DefaultImpls.G0(sHSettingMainFragment7, hCOUIPreferenceCategory, (String) null, zG2, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.5

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$5$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$5$3", f = "SHSettingMainUI.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SHSettingMainFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(SHSettingMainFragment sHSettingMainFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = sHSettingMainFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass3;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                SportHealthSetting sportHealthSetting = SportHealthSetting.END_SPORT_REMINDER_ENABLE;
                                this.label = 1;
                                obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }

                        @Nullable
                        public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                            return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchLoadingPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                        hCOUISwitchLoadingPreference.setTitle(R.string.settings_health_auto_recognize_sport_finish);
                        hCOUISwitchLoadingPreference.setSummary(R.string.settings_health_auto_recognize_sport_finish_desc);
                        LiveData liveDataX = sHSettingMainFragment8.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$5$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m129invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getEndSportRemindSettings().l());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$5$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$5$invoke$$inlined$checkStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                hCOUISwitchLoadingPreference.stopLoading();
                                COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = sHSettingMainFragment8.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$5$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m130invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new SHSettingMainFragment$sportSettingGroup$1$5$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$5$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(sHSettingMainFragment8, null));
                    }
                }, 1, (Object) null);
                SHSettingMainFragment sHSettingMainFragment9 = this;
                boolean zG3 = sHSettingMainFragment9.G0(settingAbility.getReminderDuringExercise());
                final SHSettingMainFragment sHSettingMainFragment10 = this;
                sHSettingMainFragment9.h1(hCOUIPreferenceCategory, zG3, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.6
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.title_activity_remind_sporting);
                        hCOUIJumpPreference.setSummary(R.string.device_settings_remind_item_desc);
                        LiveData liveDataX = sHSettingMainFragment10.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$6$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m131invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$6$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$6$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment11 = sHSettingMainFragment10;
                        sHSettingMainFragment11.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sportSettingGroup.1.6.2
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                if (!wl4.managerApi.isCurrentConnected()) {
                                    th7.l(com.heytap.health.base.R.string.lib_base_device_disconnected_retry_later);
                                    return;
                                }
                                RemindSportingActivity.a aVar = RemindSportingActivity.Companion;
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment11.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                aVar.a(fragmentActivityRequireActivity);
                            }
                        });
                    }
                });
                SHSettingMainFragment sHSettingMainFragment11 = this;
                boolean zG4 = sHSettingMainFragment11.G0(settingAbility.getAutoVoiceBroadcast());
                final SHSettingMainFragment sHSettingMainFragment12 = this;
                PrefDsl.DefaultImpls.G0(sHSettingMainFragment11, hCOUIPreferenceCategory, (String) null, zG4, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.7

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$7$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$7$3", f = "SHSettingMainUI.kt", i = {}, l = {276}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SHSettingMainFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(SHSettingMainFragment sHSettingMainFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = sHSettingMainFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass3;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                wbg.Companion.l0(this.this$0.R0(z));
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                SportHealthSetting sportHealthSetting = SportHealthSetting.SPORTS_VOICE_BROADCAST_ENABLE;
                                this.label = 1;
                                obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }

                        @Nullable
                        public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                            return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchLoadingPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                        hCOUISwitchLoadingPreference.setTitle(R.string.settings_health_sports_voice_broadcast);
                        hCOUISwitchLoadingPreference.setSummary(R.string.settings_health_sports_voice_broadcast_des);
                        LiveData liveDataX = sHSettingMainFragment12.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$7$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m132invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getSportsVoiceBroadcast().l());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$7$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$7$invoke$$inlined$checkStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                hCOUISwitchLoadingPreference.stopLoading();
                                COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = sHSettingMainFragment12.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$7$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m133invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new SHSettingMainFragment$sportSettingGroup$1$7$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$7$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(sHSettingMainFragment12, null));
                    }
                }, 1, (Object) null);
                SHSettingMainFragment sHSettingMainFragment13 = this;
                boolean zG5 = sHSettingMainFragment13.G0(settingAbility.getDoubleTapVoiceBroadcast());
                final SHSettingMainFragment sHSettingMainFragment14 = this;
                PrefDsl.DefaultImpls.G0(sHSettingMainFragment13, hCOUIPreferenceCategory, (String) null, zG5, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.8

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$8$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$8$3", f = "SHSettingMainUI.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SHSettingMainFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(SHSettingMainFragment sHSettingMainFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = sHSettingMainFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass3;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                wbg.Companion.l0(this.this$0.R0(z));
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                SportHealthSetting sportHealthSetting = SportHealthSetting.DOUBLE_CLICK_SCREEN_VOICE_BROADCAST_ENABLE;
                                this.label = 1;
                                obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }

                        @Nullable
                        public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                            return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchLoadingPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                        hCOUISwitchLoadingPreference.setTitle(R.string.device_settings_double_click_screen_voice_broadcast_title);
                        hCOUISwitchLoadingPreference.setSummary(R.string.device_settings_double_click_screen_voice_broadcast_desc);
                        LiveData liveDataX = sHSettingMainFragment14.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$8$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m134invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getDoubleClickVoiceBroadcast().l());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$8$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$8$invoke$$inlined$checkStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                hCOUISwitchLoadingPreference.stopLoading();
                                COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = sHSettingMainFragment14.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$8$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m135invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h() && sHSettingHomeData.getSettings().getSportsVoiceBroadcast().l());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new SHSettingMainFragment$sportSettingGroup$1$8$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$8$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(sHSettingMainFragment14, null));
                    }
                }, 1, (Object) null);
                SHSettingMainFragment sHSettingMainFragment15 = this;
                boolean zG6 = sHSettingMainFragment15.G0(settingAbility.getButtonPauseContinue());
                final SHSettingMainFragment sHSettingMainFragment16 = this;
                PrefDsl.DefaultImpls.G0(sHSettingMainFragment15, hCOUIPreferenceCategory, (String) null, zG6, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.9

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$9$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$9$3", f = "SHSettingMainUI.kt", i = {}, l = {HttpStatus.SC_USE_PROXY}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SHSettingMainFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(SHSettingMainFragment sHSettingMainFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = sHSettingMainFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass3;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                wbg.Companion.q(!z ? 1 : 0);
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                SportHealthSetting sportHealthSetting = SportHealthSetting.BUTTON_TO_PAUSE_OR_RESUME_ENABLE;
                                this.label = 1;
                                obj = sHSettingMainVm.F0(sportHealthSetting, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }

                        @Nullable
                        public final Object invoke(boolean z, @Nullable Continuation<? super Boolean> continuation) {
                            return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchLoadingPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchLoadingPreference, "$this$switchLoading");
                        hCOUISwitchLoadingPreference.setTitle(R.string.settings_health_button_to_pause_or_resume);
                        hCOUISwitchLoadingPreference.setSummary(R.string.settings_health_button_to_pause_or_resume_des);
                        LiveData liveDataX = sHSettingMainFragment16.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$9$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m136invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getButtonToPauseOrResume().l());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$9$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$9$invoke$$inlined$checkStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                hCOUISwitchLoadingPreference.stopLoading();
                                COUISwitchLoadingPreference cOUISwitchLoadingPreference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                cOUISwitchLoadingPreference.setChecked(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = sHSettingMainFragment16.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$9$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m137invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new SHSettingMainFragment$sportSettingGroup$1$9$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$9$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUISwitchLoadingPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(sHSettingMainFragment16, null));
                    }
                }, 1, (Object) null);
                SHSettingMainFragment sHSettingMainFragment17 = this;
                boolean zG7 = sHSettingMainFragment17.G0(settingAbility.getExerciseDataDisplay());
                final SHSettingMainFragment sHSettingMainFragment18 = this;
                sHSettingMainFragment17.h1(hCOUIPreferenceCategory, zG7, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.10
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.settings_sports_data_item_set_new);
                        hCOUIJumpPreference.setSummary(R.string.settings_sports_data_item_set_desc_new);
                        LiveData liveDataX = sHSettingMainFragment18.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$10$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m121invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$10$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$10$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment19 = sHSettingMainFragment18;
                        sHSettingMainFragment19.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sportSettingGroup.1.10.2
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                wbg.Companion.k0();
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment19.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment19.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.O0(fragmentActivityRequireActivity, "data_from_watch");
                            }
                        });
                    }
                });
                SHSettingMainFragment sHSettingMainFragment19 = this;
                boolean zG8 = sHSettingMainFragment19.G0(settingAbility.getCustomExercise());
                final SHSettingMainFragment sHSettingMainFragment20 = this;
                sHSettingMainFragment19.h1(hCOUIPreferenceCategory, zG8, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.11
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.settings_custom_sports);
                        hCOUIJumpPreference.setSummary(R.string.settings_custom_sports_desc);
                        LiveData liveDataX = sHSettingMainFragment20.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$11$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m122invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().h());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$11$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$11$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment21 = sHSettingMainFragment20;
                        sHSettingMainFragment21.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.sportSettingGroup.1.11.2
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                wbg.Companion.t();
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment21.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment21.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                SHSettingMainVm.P0(sHSettingMainVm, fragmentActivityRequireActivity, null, 2, null);
                            }
                        });
                    }
                });
                SHSettingMainFragment sHSettingMainFragment21 = this;
                PreferenceScreen preferenceScreen2 = preferenceScreen;
                String strL = swf.l(((SHSettingMainVm) sHSettingMainFragment21.c0()).m0() ? R.string.device_settings_sport_uninstall_desc_v3 : R.string.device_settings_sport_uninstall_desc_v2);
                final SHSettingMainFragment sHSettingMainFragment22 = this;
                sHSettingMainFragment21.b0(preferenceScreen2, strL, new Function1<COUIPagerFooterPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1.12
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((COUIPagerFooterPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final COUIPagerFooterPreference cOUIPagerFooterPreference) {
                        Intrinsics.checkNotNullParameter(cOUIPagerFooterPreference, "$this$footerPreference");
                        LiveData liveDataX = sHSettingMainFragment22.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$12$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m123invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(!sHSettingHomeData.getAppInstallBean().h());
                            }
                        });
                        LifecycleOwner context = cOUIPagerFooterPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$sportSettingGroup$1$12$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$sportSettingGroup$1$12$invoke$$inlined$visibleStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = cOUIPagerFooterPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setVisible(bool.booleanValue());
                            }
                        }));
                    }
                });
            }
        });
    }

    public final int R0(boolean z) {
        return !z ? 1 : 0;
    }

    public void n0(@NotNull PreferenceScreen preferenceScreen) {
        Intrinsics.checkNotNullParameter(preferenceScreen, "<this>");
        DeviceSettings.SettingAbility deviceSettingAbility = ((SHSettingMainVm) c0()).getDeviceSettingAbility();
        if (deviceSettingAbility == null) {
            return;
        }
        SHSettingMainUI sHSettingMainUIRequireActivity = requireActivity();
        SHSettingMainUI sHSettingMainUI = sHSettingMainUIRequireActivity instanceof SHSettingMainUI ? sHSettingMainUIRequireActivity : null;
        int page_type = sHSettingMainUI != null ? sHSettingMainUI.getPage_type() : 0;
        boolean z = page_type == 0;
        if (page_type == 0 || page_type == 1) {
            z0(preferenceScreen, deviceSettingAbility, z);
        }
        if (page_type == 0 || page_type == 2) {
            K0(preferenceScreen, deviceSettingAbility, z);
        }
        if (page_type == 0 || page_type == 3) {
            B0(preferenceScreen, G0(deviceSettingAbility.getHeartRateAutoMonitoring() + deviceSettingAbility.getRestingHeartRateWarning() + deviceSettingAbility.getExerciseHeartRateWarning() + deviceSettingAbility.getIrregularHeartRateWarning()), deviceSettingAbility, z);
        }
        if (page_type == 0 || page_type == 4) {
            J0(preferenceScreen, G0(deviceSettingAbility.getStressAutoMonitoring() + deviceSettingAbility.getBreathingRelaxationReminder() + deviceSettingAbility.getMentalPhysicalState() + deviceSettingAbility.getMentalPhysicalStateReminder() + deviceSettingAbility.getAchievementReminder() + deviceSettingAbility.getGoalSetting()), deviceSettingAbility, z);
        }
        if (page_type == 0 || page_type == 5) {
            P0(preferenceScreen, deviceSettingAbility, z);
        }
        if (page_type == 0 || page_type == 6) {
            H0(preferenceScreen, deviceSettingAbility, z);
        }
        if (page_type == 0 || page_type == 7) {
            N0(preferenceScreen, G0(deviceSettingAbility.getSnoringRiskAssessment() + deviceSettingAbility.getSleepRespiratoryRateMonitoring() + deviceSettingAbility.getSleepIntervalBloodOxygen() + deviceSettingAbility.getRemSleepMonitoring() + deviceSettingAbility.getSleepScheduleReminder() + deviceSettingAbility.getSleepDataCalibration()), deviceSettingAbility, z);
        }
        if (page_type == 0 || page_type == 8) {
            Q0(preferenceScreen, G0(deviceSettingAbility.getAutoPauseDuringExercise() + deviceSettingAbility.getAutoPauseDuringExercise() + deviceSettingAbility.getAutoExerciseRecognition() + deviceSettingAbility.getExerciseStartReminder() + deviceSettingAbility.getExerciseEndReminder() + deviceSettingAbility.getAutoVoiceBroadcast() + deviceSettingAbility.getDoubleTapVoiceBroadcast() + deviceSettingAbility.getButtonPauseContinue() + deviceSettingAbility.getExerciseDataDisplay() + deviceSettingAbility.getCustomExercise()), deviceSettingAbility, z);
        }
    }

    public final void z0(final PreferenceScreen preferenceScreen, final DeviceSettings.SettingAbility settingAbility, final boolean z) {
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1

            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/coui/appcompat/picker/COUINumberPicker;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends Lambda implements Function1<COUINumberPicker, Unit> {
                final /* synthetic */ SHSettingMainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SHSettingMainFragment sHSettingMainFragment) {
                    super(1);
                    this.this$0 = sHSettingMainFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String invoke$lambda$0(int i) {
                    return swf.m(R.string.settings_watch_step_goal_value, i * 1000);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((COUINumberPicker) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull COUINumberPicker cOUINumberPicker) {
                    Intrinsics.checkNotNullParameter(cOUINumberPicker, "$this$valuePicker");
                    cOUINumberPicker.setMinValue(2);
                    cOUINumberPicker.setMaxValue(20);
                    cOUINumberPicker.setValue(((SHSettingHomeData) ((SHSettingMainVm) this.this$0.c0()).T()).getSettings().getStepGoal().getSettingValue() / 1000);
                    cOUINumberPicker.setFormatter(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: INVOKE 
                          (r2v0 'cOUINumberPicker' com.coui.appcompat.picker.COUINumberPicker)
                          (wrap com.coui.appcompat.picker.COUINumberPicker$c:0x002f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:5) call: com.heytap.health.settings.watch.sporthealthsettings2.ui.g.<init>():void type: CONSTRUCTOR)
                         VIRTUAL call: com.coui.appcompat.picker.COUINumberPicker.setFormatter(com.coui.appcompat.picker.COUINumberPicker$c):void (LINE:5) in method: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.1.invoke(com.coui.appcompat.picker.COUINumberPicker):void, file: D:\￩ﾡﾹ￧ﾛﾮ\oppo￩ﾀﾚ￧ﾟﾥ￨ﾽﾬ￥ﾏﾑ\analysis\health667-dex\classes18.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.heytap.health.settings.watch.sporthealthsettings2.ui.g, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$valuePicker"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        r0 = 2
                        r2.setMinValue(r0)
                        r0 = 20
                        r2.setMaxValue(r0)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment r1 = r1.this$0
                        com.heytap.sporthealth.blib.basic.BasicStateViewModel r1 = r1.c0()
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainVm r1 = (com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainVm) r1
                        java.lang.Object r1 = r1.T()
                        com.oplus.aiunit.vision.qag r1 = (com.oplus.aiunit.model.SHSettingHomeData) r1
                        com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings r1 = r1.getSettings()
                        com.heytap.health.settings.watch.sporthealthsettings.bean.g0 r1 = r1.getStepGoal()
                        int r1 = r1.getSettingValue()
                        int r1 = r1 / 1000
                        r2.setValue(r1)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.g r1 = new com.heytap.health.settings.watch.sporthealthsettings2.ui.g
                        r1.<init>()
                        r2.setFormatter(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.AnonymousClass1.invoke(com.coui.appcompat.picker.COUINumberPicker):void");
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/coui/appcompat/picker/COUINumberPicker;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass3 extends Lambda implements Function1<COUINumberPicker, Unit> {
                final /* synthetic */ SHSettingMainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(SHSettingMainFragment sHSettingMainFragment) {
                    super(1);
                    this.this$0 = sHSettingMainFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String invoke$lambda$0(int i) {
                    return swf.m(R.string.settings_watch_calorie_goal_value, i * 100);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((COUINumberPicker) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull COUINumberPicker cOUINumberPicker) {
                    Intrinsics.checkNotNullParameter(cOUINumberPicker, "$this$valuePicker");
                    cOUINumberPicker.setMinValue(1);
                    cOUINumberPicker.setMaxValue(20);
                    cOUINumberPicker.setValue(((SHSettingHomeData) ((SHSettingMainVm) this.this$0.c0()).T()).getSettings().getCalorieGoal().getSettingValue() / 100);
                    cOUINumberPicker.setFormatter(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: INVOKE 
                          (r2v0 'cOUINumberPicker' com.coui.appcompat.picker.COUINumberPicker)
                          (wrap com.coui.appcompat.picker.COUINumberPicker$c:0x002f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:5) call: com.heytap.health.settings.watch.sporthealthsettings2.ui.h.<init>():void type: CONSTRUCTOR)
                         VIRTUAL call: com.coui.appcompat.picker.COUINumberPicker.setFormatter(com.coui.appcompat.picker.COUINumberPicker$c):void (LINE:5) in method: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.3.invoke(com.coui.appcompat.picker.COUINumberPicker):void, file: D:\￩ﾡﾹ￧ﾛﾮ\oppo￩ﾀﾚ￧ﾟﾥ￨ﾽﾬ￥ﾏﾑ\analysis\health667-dex\classes18.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.heytap.health.settings.watch.sporthealthsettings2.ui.h, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$valuePicker"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        r0 = 1
                        r2.setMinValue(r0)
                        r0 = 20
                        r2.setMaxValue(r0)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment r1 = r1.this$0
                        com.heytap.sporthealth.blib.basic.BasicStateViewModel r1 = r1.c0()
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainVm r1 = (com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainVm) r1
                        java.lang.Object r1 = r1.T()
                        com.oplus.aiunit.vision.qag r1 = (com.oplus.aiunit.model.SHSettingHomeData) r1
                        com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings r1 = r1.getSettings()
                        com.heytap.health.settings.watch.sporthealthsettings.bean.k r1 = r1.getCalorieGoal()
                        int r1 = r1.getSettingValue()
                        int r1 = r1 / 100
                        r2.setValue(r1)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.h r1 = new com.heytap.health.settings.watch.sporthealthsettings2.ui.h
                        r1.<init>()
                        r2.setFormatter(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.AnonymousClass3.invoke(com.coui.appcompat.picker.COUINumberPicker):void");
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/coui/appcompat/picker/COUINumberPicker;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass5 extends Lambda implements Function1<COUINumberPicker, Unit> {
                final /* synthetic */ SHSettingMainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(SHSettingMainFragment sHSettingMainFragment) {
                    super(1);
                    this.this$0 = sHSettingMainFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String invoke$lambda$0(int i) {
                    return swf.m(R.string.settings_watch_exercise_time_goal_value, i * 5);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((COUINumberPicker) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull COUINumberPicker cOUINumberPicker) {
                    Intrinsics.checkNotNullParameter(cOUINumberPicker, "$this$valuePicker");
                    cOUINumberPicker.setMinValue(1);
                    cOUINumberPicker.setMaxValue(12);
                    cOUINumberPicker.setValue(((SHSettingHomeData) ((SHSettingMainVm) this.this$0.c0()).T()).getSettings().getExerciseTimeGoal().getSettingValue() / 5);
                    cOUINumberPicker.setFormatter(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: INVOKE 
                          (r2v0 'cOUINumberPicker' com.coui.appcompat.picker.COUINumberPicker)
                          (wrap com.coui.appcompat.picker.COUINumberPicker$c:0x002f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:5) call: com.heytap.health.settings.watch.sporthealthsettings2.ui.i.<init>():void type: CONSTRUCTOR)
                         VIRTUAL call: com.coui.appcompat.picker.COUINumberPicker.setFormatter(com.coui.appcompat.picker.COUINumberPicker$c):void (LINE:5) in method: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.5.invoke(com.coui.appcompat.picker.COUINumberPicker):void, file: D:\￩ﾡﾹ￧ﾛﾮ\oppo￩ﾀﾚ￧ﾟﾥ￨ﾽﾬ￥ﾏﾑ\analysis\health667-dex\classes18.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.heytap.health.settings.watch.sporthealthsettings2.ui.i, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$valuePicker"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        r0 = 1
                        r2.setMinValue(r0)
                        r0 = 12
                        r2.setMaxValue(r0)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment r1 = r1.this$0
                        com.heytap.sporthealth.blib.basic.BasicStateViewModel r1 = r1.c0()
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainVm r1 = (com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainVm) r1
                        java.lang.Object r1 = r1.T()
                        com.oplus.aiunit.vision.qag r1 = (com.oplus.aiunit.model.SHSettingHomeData) r1
                        com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings r1 = r1.getSettings()
                        com.heytap.health.settings.watch.sporthealthsettings.bean.p r1 = r1.getExerciseTimeGoal()
                        int r1 = r1.getSettingValue()
                        int r1 = r1 / 5
                        r2.setValue(r1)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.i r1 = new com.heytap.health.settings.watch.sporthealthsettings2.ui.i
                        r1.<init>()
                        r2.setFormatter(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.AnonymousClass5.invoke(com.coui.appcompat.picker.COUINumberPicker):void");
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$7, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/coui/appcompat/picker/COUINumberPicker;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass7 extends Lambda implements Function1<COUINumberPicker, Unit> {
                final /* synthetic */ SHSettingMainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(SHSettingMainFragment sHSettingMainFragment) {
                    super(1);
                    this.this$0 = sHSettingMainFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String invoke$lambda$0(int i) {
                    return swf.i(R.plurals.settings_watch_activity_goal_value, i);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((COUINumberPicker) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull COUINumberPicker cOUINumberPicker) {
                    Intrinsics.checkNotNullParameter(cOUINumberPicker, "$this$valuePicker");
                    cOUINumberPicker.setMinValue(3);
                    cOUINumberPicker.setMaxValue(12);
                    cOUINumberPicker.setValue(((SHSettingHomeData) ((SHSettingMainVm) this.this$0.c0()).T()).getSettings().getActivityGoal().getSettingValue());
                    cOUINumberPicker.setFormatter(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: INVOKE 
                          (r2v0 'cOUINumberPicker' com.coui.appcompat.picker.COUINumberPicker)
                          (wrap com.coui.appcompat.picker.COUINumberPicker$c:0x002d: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:5) call: com.heytap.health.settings.watch.sporthealthsettings2.ui.j.<init>():void type: CONSTRUCTOR)
                         VIRTUAL call: com.coui.appcompat.picker.COUINumberPicker.setFormatter(com.coui.appcompat.picker.COUINumberPicker$c):void (LINE:5) in method: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.7.invoke(com.coui.appcompat.picker.COUINumberPicker):void, file: D:\￩ﾡﾹ￧ﾛﾮ\oppo￩ﾀﾚ￧ﾟﾥ￨ﾽﾬ￥ﾏﾑ\analysis\health667-dex\classes18.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.heytap.health.settings.watch.sporthealthsettings2.ui.j, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$valuePicker"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        r0 = 3
                        r2.setMinValue(r0)
                        r0 = 12
                        r2.setMaxValue(r0)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment r1 = r1.this$0
                        com.heytap.sporthealth.blib.basic.BasicStateViewModel r1 = r1.c0()
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainVm r1 = (com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainVm) r1
                        java.lang.Object r1 = r1.T()
                        com.oplus.aiunit.vision.qag r1 = (com.oplus.aiunit.model.SHSettingHomeData) r1
                        com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings r1 = r1.getSettings()
                        com.heytap.health.settings.watch.sporthealthsettings.bean.e r1 = r1.getActivityGoal()
                        int r1 = r1.getSettingValue()
                        r2.setValue(r1)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.j r1 = new com.heytap.health.settings.watch.sporthealthsettings2.ui.j
                        r1.<init>()
                        r2.setFormatter(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.AnonymousClass7.invoke(com.coui.appcompat.picker.COUINumberPicker):void");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                if (z) {
                    hCOUIPreferenceCategory.setTitle(R.string.settings_activity);
                }
                SHSettingMainFragment sHSettingMainFragment = this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(sHSettingMainFragment);
                final SHSettingMainFragment sHSettingMainFragment2 = this;
                PrefDsl.DefaultImpls.Y0(sHSettingMainFragment, hCOUIPreferenceCategory, "settings_activity", anonymousClass1, false, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.2

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$2$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Integer> {
                        public final /* synthetic */ DialogCOUIPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(DialogCOUIPreference dialogCOUIPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = dialogCOUIPreference;
                            this.j = sHSettingMainFragment;
                        }

                        public final void a(int i) {
                            DialogCOUIPreference dialogCOUIPreference = this.i;
                            String strM = swf.m(R.string.settings_watch_step_goal_value, i);
                            SHSettingMainFragment sHSettingMainFragment = this.j;
                            Context context = this.i.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "context");
                            dialogCOUIPreference.setSummary(b9i.f(strM, sHSettingMainFragment.themeColor(context)));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Number) obj).intValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DialogCOUIPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final DialogCOUIPreference dialogCOUIPreference) {
                        Intrinsics.checkNotNullParameter(dialogCOUIPreference, "$this$valuePicker");
                        int i = R.string.settings_watch_step_goal;
                        dialogCOUIPreference.setDialogTitle(i);
                        dialogCOUIPreference.setTitle(i);
                        SHSettingMainFragment sHSettingMainFragment3 = sHSettingMainFragment2;
                        sHSettingMainFragment3.d0(((SHSettingMainVm) sHSettingMainFragment3.c0()).x(new Function1<SHSettingHomeData, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.2.1
                            @Nullable
                            public final Integer invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return Integer.valueOf(sHSettingHomeData.getSettings().getStepGoal().getSettingValue());
                            }
                        }), new a(dialogCOUIPreference, sHSettingMainFragment2));
                        final SHSettingMainFragment sHSettingMainFragment4 = sHSettingMainFragment2;
                        LiveData liveDataX = sHSettingMainFragment4.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$2$invoke$$inlined$enableStateBy$1
                            {
                                super(1);
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m87invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return ((SHSettingMainVm) sHSettingMainFragment4.c0()).m0() ? Boolean.TRUE : Boolean.valueOf(sHSettingHomeData.getAppInstallBean().a());
                            }
                        });
                        LifecycleOwner context = dialogCOUIPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$dailyActivityGroup$1$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$2$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = dialogCOUIPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment5 = sHSettingMainFragment2;
                        sHSettingMainFragment5.e0(dialogCOUIPreference, new Function1<Object, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.2.4

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$2$4$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$2$4$1", f = "SHSettingMainUI.kt", i = {}, l = {857}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Object $it;
                                int label;
                                final /* synthetic */ SHSettingMainFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SHSettingMainFragment sHSettingMainFragment, Object obj, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = sHSettingMainFragment;
                                    this.$it = obj;
                                }

                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.this$0, this.$it, continuation);
                                }

                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                        int iP0 = this.this$0.p0(this.$it) * 1000;
                                        this.label = 1;
                                        if (sHSettingMainVm.D0(iP0, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m86invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m86invoke(@NotNull Object obj) {
                                Intrinsics.checkNotNullParameter(obj, "it");
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(sHSettingMainFragment5), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(sHSettingMainFragment5, obj, null), 3, (Object) null);
                            }
                        });
                    }
                }, 4, (Object) null);
                SHSettingMainFragment sHSettingMainFragment3 = this;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(sHSettingMainFragment3);
                final SHSettingMainFragment sHSettingMainFragment4 = this;
                PrefDsl.DefaultImpls.Y0(sHSettingMainFragment3, hCOUIPreferenceCategory, "settings_calorie", anonymousClass3, false, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.4

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$4$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Integer> {
                        public final /* synthetic */ DialogCOUIPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(DialogCOUIPreference dialogCOUIPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = dialogCOUIPreference;
                            this.j = sHSettingMainFragment;
                        }

                        public final void a(int i) {
                            DialogCOUIPreference dialogCOUIPreference = this.i;
                            String strM = swf.m(R.string.settings_watch_calorie_goal_value, i);
                            SHSettingMainFragment sHSettingMainFragment = this.j;
                            Context context = this.i.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "context");
                            dialogCOUIPreference.setSummary(b9i.f(strM, sHSettingMainFragment.themeColor(context)));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Number) obj).intValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DialogCOUIPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final DialogCOUIPreference dialogCOUIPreference) {
                        Intrinsics.checkNotNullParameter(dialogCOUIPreference, "$this$valuePicker");
                        int i = R.string.settings_watch_calorie_goal;
                        dialogCOUIPreference.setDialogTitle(i);
                        dialogCOUIPreference.setTitle(i);
                        SHSettingMainFragment sHSettingMainFragment5 = sHSettingMainFragment4;
                        sHSettingMainFragment5.d0(((SHSettingMainVm) sHSettingMainFragment5.c0()).x(new Function1<SHSettingHomeData, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.4.1
                            @Nullable
                            public final Integer invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return Integer.valueOf(sHSettingHomeData.getSettings().getCalorieGoal().getSettingValue());
                            }
                        }), new a(dialogCOUIPreference, sHSettingMainFragment4));
                        final SHSettingMainFragment sHSettingMainFragment6 = sHSettingMainFragment4;
                        LiveData liveDataX = sHSettingMainFragment6.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$4$invoke$$inlined$enableStateBy$1
                            {
                                super(1);
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m89invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return ((SHSettingMainVm) sHSettingMainFragment6.c0()).m0() ? Boolean.TRUE : Boolean.valueOf(sHSettingHomeData.getAppInstallBean().a());
                            }
                        });
                        LifecycleOwner context = dialogCOUIPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$dailyActivityGroup$1$4$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$4$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = dialogCOUIPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment7 = sHSettingMainFragment4;
                        sHSettingMainFragment7.e0(dialogCOUIPreference, new Function1<Object, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.4.4

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$4$4$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$4$4$1", f = "SHSettingMainUI.kt", i = {}, l = {884}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Object $it;
                                int label;
                                final /* synthetic */ SHSettingMainFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SHSettingMainFragment sHSettingMainFragment, Object obj, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = sHSettingMainFragment;
                                    this.$it = obj;
                                }

                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.this$0, this.$it, continuation);
                                }

                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                        int iP0 = this.this$0.p0(this.$it) * 100;
                                        this.label = 1;
                                        if (sHSettingMainVm.B0(iP0, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m88invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m88invoke(@NotNull Object obj) {
                                Intrinsics.checkNotNullParameter(obj, "it");
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(sHSettingMainFragment7), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(sHSettingMainFragment7, obj, null), 3, (Object) null);
                            }
                        });
                    }
                }, 4, (Object) null);
                boolean zG0 = this.G0(settingAbility.getExerciseDurationGoal());
                SHSettingMainFragment sHSettingMainFragment5 = this;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(sHSettingMainFragment5);
                final SHSettingMainFragment sHSettingMainFragment6 = this;
                sHSettingMainFragment5.v5(hCOUIPreferenceCategory, "settings_exercise", anonymousClass5, zG0, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.6

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$6$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Integer> {
                        public final /* synthetic */ DialogCOUIPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(DialogCOUIPreference dialogCOUIPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = dialogCOUIPreference;
                            this.j = sHSettingMainFragment;
                        }

                        public final void a(int i) {
                            DialogCOUIPreference dialogCOUIPreference = this.i;
                            String strM = swf.m(R.string.settings_watch_exercise_time_goal_value, i);
                            SHSettingMainFragment sHSettingMainFragment = this.j;
                            Context context = this.i.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "context");
                            dialogCOUIPreference.setSummary(b9i.f(strM, sHSettingMainFragment.themeColor(context)));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Number) obj).intValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DialogCOUIPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final DialogCOUIPreference dialogCOUIPreference) {
                        Intrinsics.checkNotNullParameter(dialogCOUIPreference, "$this$valuePicker");
                        int i = R.string.settings_watch_exercise_time_goal;
                        dialogCOUIPreference.setDialogTitle(i);
                        dialogCOUIPreference.setTitle(i);
                        SHSettingMainFragment sHSettingMainFragment7 = sHSettingMainFragment6;
                        sHSettingMainFragment7.d0(((SHSettingMainVm) sHSettingMainFragment7.c0()).x(new Function1<SHSettingHomeData, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.6.1
                            @Nullable
                            public final Integer invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return Integer.valueOf(sHSettingHomeData.getSettings().getExerciseTimeGoal().getSettingValue());
                            }
                        }), new a(dialogCOUIPreference, sHSettingMainFragment6));
                        final SHSettingMainFragment sHSettingMainFragment8 = sHSettingMainFragment6;
                        LiveData liveDataX = sHSettingMainFragment8.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$6$invoke$$inlined$enableStateBy$1
                            {
                                super(1);
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m91invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return ((SHSettingMainVm) sHSettingMainFragment8.c0()).m0() ? Boolean.TRUE : Boolean.valueOf(sHSettingHomeData.getAppInstallBean().a());
                            }
                        });
                        LifecycleOwner context = dialogCOUIPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$dailyActivityGroup$1$6$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$6$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = dialogCOUIPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment9 = sHSettingMainFragment6;
                        sHSettingMainFragment9.e0(dialogCOUIPreference, new Function1<Object, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.6.4

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$6$4$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$6$4$1", f = "SHSettingMainUI.kt", i = {}, l = {914}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Object $it;
                                int label;
                                final /* synthetic */ SHSettingMainFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SHSettingMainFragment sHSettingMainFragment, Object obj, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = sHSettingMainFragment;
                                    this.$it = obj;
                                }

                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.this$0, this.$it, continuation);
                                }

                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                        int iP0 = this.this$0.p0(this.$it) * 5;
                                        this.label = 1;
                                        if (sHSettingMainVm.C0(iP0, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m90invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m90invoke(@NotNull Object obj) {
                                Intrinsics.checkNotNullParameter(obj, "it");
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(sHSettingMainFragment9), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(sHSettingMainFragment9, obj, null), 3, (Object) null);
                            }
                        });
                    }
                });
                boolean zG1 = this.G0(settingAbility.getActivityCountGoal());
                SHSettingMainFragment sHSettingMainFragment7 = this;
                AnonymousClass7 anonymousClass7 = new AnonymousClass7(sHSettingMainFragment7);
                final SHSettingMainFragment sHSettingMainFragment8 = this;
                sHSettingMainFragment7.v5(hCOUIPreferenceCategory, "settings_act", anonymousClass7, zG1, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.8

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$8$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Integer> {
                        public final /* synthetic */ DialogCOUIPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(DialogCOUIPreference dialogCOUIPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = dialogCOUIPreference;
                            this.j = sHSettingMainFragment;
                        }

                        public final void a(int i) {
                            DialogCOUIPreference dialogCOUIPreference = this.i;
                            String strI = swf.i(R.plurals.settings_watch_activity_goal_value, i);
                            SHSettingMainFragment sHSettingMainFragment = this.j;
                            Context context = this.i.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "context");
                            dialogCOUIPreference.setSummary(b9i.f(strI, sHSettingMainFragment.themeColor(context)));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Number) obj).intValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DialogCOUIPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final DialogCOUIPreference dialogCOUIPreference) {
                        Intrinsics.checkNotNullParameter(dialogCOUIPreference, "$this$valuePicker");
                        int i = R.string.settings_watch_activity_goal;
                        dialogCOUIPreference.setDialogTitle(i);
                        dialogCOUIPreference.setTitle(i);
                        SHSettingMainFragment sHSettingMainFragment9 = sHSettingMainFragment8;
                        sHSettingMainFragment9.d0(((SHSettingMainVm) sHSettingMainFragment9.c0()).x(new Function1<SHSettingHomeData, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.8.1
                            @Nullable
                            public final Integer invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return Integer.valueOf(sHSettingHomeData.getSettings().getActivityGoal().getSettingValue());
                            }
                        }), new a(dialogCOUIPreference, sHSettingMainFragment8));
                        final SHSettingMainFragment sHSettingMainFragment10 = sHSettingMainFragment8;
                        LiveData liveDataX = sHSettingMainFragment10.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$8$invoke$$inlined$enableStateBy$1
                            {
                                super(1);
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m93invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return ((SHSettingMainVm) sHSettingMainFragment10.c0()).m0() ? Boolean.TRUE : Boolean.valueOf(sHSettingHomeData.getAppInstallBean().a());
                            }
                        });
                        LifecycleOwner context = dialogCOUIPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$dailyActivityGroup$1$8$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$8$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = dialogCOUIPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment11 = sHSettingMainFragment8;
                        sHSettingMainFragment11.e0(dialogCOUIPreference, new Function1<Object, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.8.4

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$8$4$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$8$4$1", f = "SHSettingMainUI.kt", i = {}, l = {944}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Object $it;
                                int label;
                                final /* synthetic */ SHSettingMainFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SHSettingMainFragment sHSettingMainFragment, Object obj, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = sHSettingMainFragment;
                                    this.$it = obj;
                                }

                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.this$0, this.$it, continuation);
                                }

                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) this.this$0.c0();
                                        int iP0 = this.this$0.p0(this.$it);
                                        this.label = 1;
                                        if (sHSettingMainVm.A0(iP0, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m92invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m92invoke(@NotNull Object obj) {
                                Intrinsics.checkNotNullParameter(obj, "it");
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(sHSettingMainFragment11), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(sHSettingMainFragment11, obj, null), 3, (Object) null);
                            }
                        });
                    }
                });
                final SHSettingMainFragment sHSettingMainFragment9 = this;
                PrefDsl.DefaultImpls.R(sHSettingMainFragment9, hCOUIPreferenceCategory, false, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.9

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$9$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Boolean> {
                        public final /* synthetic */ HCOUIJumpPreference i;
                        public final /* synthetic */ SHSettingMainFragment j;

                        public a(HCOUIJumpPreference hCOUIJumpPreference, SHSettingMainFragment sHSettingMainFragment) {
                            this.i = hCOUIJumpPreference;
                            this.j = sHSettingMainFragment;
                        }

                        public final void a(boolean z) {
                            this.i.setSummary(this.j.L0(z));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Boolean) obj).booleanValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.settings_watch_sedentary_remind);
                        SHSettingMainFragment sHSettingMainFragment10 = sHSettingMainFragment9;
                        sHSettingMainFragment10.d0(((SHSettingMainVm) sHSettingMainFragment10.c0()).x(new Function1<SHSettingHomeData, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.9.1
                            @Nullable
                            public final Boolean invoke(@NotNull SHSettingHomeData sHSettingHomeData) {
                                Intrinsics.checkNotNullParameter(sHSettingHomeData, "$this$changeBy");
                                return Boolean.valueOf(sHSettingHomeData.getSettings().getSedentary().getSedentaryRemindEnable());
                            }
                        }), new a(hCOUIJumpPreference, sHSettingMainFragment9));
                        LiveData liveDataX = sHSettingMainFragment9.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$9$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m94invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().a());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$dailyActivityGroup$1$9$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$9$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment11 = sHSettingMainFragment9;
                        sHSettingMainFragment11.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.9.4
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment11.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment11.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.X0(fragmentActivityRequireActivity);
                            }
                        });
                    }
                }, 1, (Object) null);
                SHSettingMainFragment sHSettingMainFragment10 = this;
                boolean zG2 = sHSettingMainFragment10.G0(settingAbility.getDailyActivityNotification());
                final SHSettingMainFragment sHSettingMainFragment11 = this;
                sHSettingMainFragment10.h1(hCOUIPreferenceCategory, zG2, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.10
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(R.string.settings_daily_activity_notification);
                        hCOUIJumpPreference.setSummary(R.string.settings_daily_activity_notification_desc);
                        LiveData liveDataX = sHSettingMainFragment11.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$10$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m84invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(sHSettingHomeData.getAppInstallBean().a());
                            }
                        });
                        LifecycleOwner context = hCOUIJumpPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$dailyActivityGroup$1$10$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$10$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIJumpPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        final SHSettingMainFragment sHSettingMainFragment12 = sHSettingMainFragment11;
                        sHSettingMainFragment12.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment.dailyActivityGroup.1.10.2
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Preference) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Preference preference) {
                                Intrinsics.checkNotNullParameter(preference, "it");
                                SHSettingMainVm sHSettingMainVm = (SHSettingMainVm) sHSettingMainFragment12.c0();
                                FragmentActivity fragmentActivityRequireActivity = sHSettingMainFragment12.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                sHSettingMainVm.Q0(fragmentActivityRequireActivity);
                            }
                        });
                    }
                });
                SHSettingMainFragment sHSettingMainFragment12 = this;
                PreferenceScreen preferenceScreen2 = preferenceScreen;
                String strL = swf.l(((SHSettingMainVm) sHSettingMainFragment12.c0()).m0() ? R.string.device_settings_daily_activities_uninstall_desc_v3 : R.string.device_settings_daily_activities_uninstall_desc_v2);
                final SHSettingMainFragment sHSettingMainFragment13 = this;
                sHSettingMainFragment12.b0(preferenceScreen2, strL, new Function1<COUIPagerFooterPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1.11
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((COUIPagerFooterPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final COUIPagerFooterPreference cOUIPagerFooterPreference) {
                        Intrinsics.checkNotNullParameter(cOUIPagerFooterPreference, "$this$footerPreference");
                        LiveData liveDataX = sHSettingMainFragment13.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$11$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m85invoke(@Nullable Object obj) {
                                if (!(obj instanceof SHSettingHomeData)) {
                                    obj = null;
                                }
                                SHSettingHomeData sHSettingHomeData = (SHSettingHomeData) obj;
                                Intrinsics.checkNotNull(sHSettingHomeData);
                                return Boolean.valueOf(!sHSettingHomeData.getAppInstallBean().a());
                            }
                        });
                        LifecycleOwner context = cOUIPagerFooterPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SHSettingMainFragment$dailyActivityGroup$1$11$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainFragment$dailyActivityGroup$1$11$invoke$$inlined$visibleStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = cOUIPagerFooterPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setVisible(bool.booleanValue());
                            }
                        }));
                    }
                });
            }
        }, 1, (Object) null);
    }
}