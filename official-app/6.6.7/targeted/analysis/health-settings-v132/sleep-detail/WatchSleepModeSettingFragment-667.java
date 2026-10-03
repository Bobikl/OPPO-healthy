package com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui;

import android.content.Context;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.coui.appcompat.preference.COUISwitchLoadingPreference;
import com.heytap.device.sleep.ISleepDataService;
import com.heytap.health.device_settings.impl.R;
import com.heytap.sporthealth.blib.basic.ui.BasicPreferenceFragment;
import com.heytap.sporthealth.blib.helper.DialogCOUIPreference;
import com.heytap.sporthealth.blib.helper.HCOUIJumpPreference;
import com.heytap.sporthealth.blib.helper.HCOUIPreferenceCategory;
import com.heytap.sporthealth.blib.helper.HCOUISwitchLoadingPreference;
import com.heytap.sporthealth.blib.helper.PrefDsl;
import com.heytap.sporthealth.blib.helper.ViewDsl;
import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.HttpStatus;
import com.oplus.aiunit.model.SleepSettingDataForUI;
import com.oplus.aiunit.model.wbg;
import com.oplus.aiunit.vision.a5k;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.hxc;
import com.oplus.aiunit.vision.jrc;
import com.oplus.aiunit.vision.lyc;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.quh;
import com.oplus.aiunit.vision.swf;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.yod;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0016J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0003H\u0002R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/WatchSleepModeSettingFragment;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAndRemindSettingViewModel;", "", "h0", "()Ljava/lang/Integer;", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "Landroidx/preference/PreferenceScreen;", "", "n0", "A0", "z0", "isBedRemind", "F0", "B0", "time", "", "G0", "H0", "q", "Ljava/lang/String;", "TAG", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WatchSleepModeSettingFragment extends BasicPreferenceFragment<SleepAndRemindSettingViewModel> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "Sleep-Setting";

    public final boolean A0() {
        if (jrc.c()) {
            return true;
        }
        a5k.i(getString(R.string.settings_device_network_disconnect));
        return false;
    }

    public final boolean B0() {
        lyc.a aVar = lyc.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        if (aVar.f(contextRequireContext)) {
            return true;
        }
        g.s(getActivity());
        return false;
    }

    public final boolean F0(boolean isBedRemind) {
        if (!hxc.c(getContext())) {
            g.r(getContext(), isBedRemind ? R.string.settings_sleep_bed_time_notification_dialog_desc : R.string.settings_sleep_stay_up_time_notification_dialog_desc);
            return false;
        }
        Object objNavigation = e1.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
        ISleepDataService iSleepDataService = objNavigation instanceof ISleepDataService ? (ISleepDataService) objNavigation : null;
        if (iSleepDataService != null && iSleepDataService.T9()) {
            return true;
        }
        g.q(getContext(), isBedRemind ? R.string.settings_sleep_bed_time_banner_notification_dialog_desc_v2 : R.string.settings_sleep_stay_up_time_banner_notification_dialog_desc_v2);
        return false;
    }

    public final String G0(int time) {
        int iA = quh.a(time);
        int iB = quh.b(time);
        if (iA > 0 && iB > 0) {
            String string = getString(R.string.settings_sleep_user_habit_sleep_length_desc_v2, new Object[]{Integer.valueOf(iA), Integer.valueOf(iB)});
            Intrinsics.checkNotNullExpressionValue(string, "{\n            getString(…leepGoalMinute)\n        }");
            return string;
        }
        if (iA > 0) {
            String quantityString = getResources().getQuantityString(R.plurals.settings_sleep_user_habit_sleep_length_hour_desc, iA, Integer.valueOf(iA));
            Intrinsics.checkNotNullExpressionValue(quantityString, "{\n            resources.… sleepGoalHour)\n        }");
            return quantityString;
        }
        String string2 = getString(R.string.settings_sleep_user_habit_sleep_length_minute_desc, new Object[]{Integer.valueOf(iB)});
        Intrinsics.checkNotNullExpressionValue(string2, "{\n            getString(…leepGoalMinute)\n        }");
        return string2;
    }

    public final String H0(int time) {
        String strValueOf = String.valueOf(quh.a(time));
        String strValueOf2 = String.valueOf(quh.b(time));
        if (strValueOf.length() < 2) {
            strValueOf = "0" + strValueOf;
        }
        if (strValueOf2.length() < 2) {
            strValueOf2 = "0" + strValueOf2;
        }
        return strValueOf + ":" + strValueOf2;
    }

    @NotNull
    public Integer h0() {
        return Integer.valueOf(R.menu.settings_sleep_setting_desc);
    }

    public void n0(@NotNull PreferenceScreen preferenceScreen) {
        Intrinsics.checkNotNullParameter(preferenceScreen, "<this>");
        final SleepSettingDataForUI sleepSettingDataForUI = (SleepSettingDataForUI) ((SleepAndRemindSettingViewModel) c0()).T();
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment = this.this$0;
                PrefDsl.DefaultImpls.V(watchSleepModeSettingFragment, hCOUIPreferenceCategory, 0, false, false, new Function1<LinearLayout, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$1.1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LinearLayout) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LinearLayout linearLayout) {
                        Intrinsics.checkNotNullParameter(linearLayout, "$this$layoutDsl");
                        watchSleepModeSettingFragment.pading(linearLayout, swf.b(32.0f), swf.b(26.0f));
                        watchSleepModeSettingFragment.icon(linearLayout, new Function1<ImageView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.1.1.1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ImageView) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull ImageView imageView) {
                                Intrinsics.checkNotNullParameter(imageView, "$this$icon");
                                imageView.setImageResource(R.drawable.settings_sleep_setting_icon);
                            }
                        });
                        final WatchSleepModeSettingFragment watchSleepModeSettingFragment2 = watchSleepModeSettingFragment;
                        watchSleepModeSettingFragment2.textView(linearLayout, new Function1<TextView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.1.1.2
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextView) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull TextView textView) {
                                Intrinsics.checkNotNullParameter(textView, "$this$textView");
                                textView.setText(R.string.device_settings_sleep_setting_desc);
                                ViewDsl.DefaultImpls.j0(watchSleepModeSettingFragment2, textView, (Float) null, 1, (Object) null);
                                textView.setTextSize(12.0f);
                                ViewDsl.DefaultImpls.U(watchSleepModeSettingFragment2, textView, 0, 0, new Function1<LinearLayout.LayoutParams, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.1.1.2.1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((LinearLayout.LayoutParams) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull LinearLayout.LayoutParams layoutParams) {
                                        Intrinsics.checkNotNullParameter(layoutParams, "$this$linearParam");
                                        layoutParams.topMargin = swf.b(8.0f);
                                    }
                                }, 3, (Object) null);
                            }
                        });
                    }
                }, 7, (Object) null);
            }
        }, 1, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                hCOUIPreferenceCategory.setTitle(this.this$0.getString(R.string.device_settings_auto_open_sleep_mode));
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment = this.this$0;
                PrefDsl.DefaultImpls.G0(watchSleepModeSettingFragment, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$1$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$1$3", f = "SleepAndRemindSettingUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ WatchSleepModeSettingFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(WatchSleepModeSettingFragment watchSleepModeSettingFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = watchSleepModeSettingFragment;
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
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxBoolean(((SleepAndRemindSettingViewModel) this.this$0.c0()).i0(this.Z$0));
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
                        hCOUISwitchLoadingPreference.setPersistent(false);
                        hCOUISwitchLoadingPreference.setTitle(watchSleepModeSettingFragment.getString(R.string.device_settings_title_ai_recognize));
                        hCOUISwitchLoadingPreference.setSummary(watchSleepModeSettingFragment.getString(R.string.device_settings_ai_recognize_desc));
                        LiveData liveDataX = watchSleepModeSettingFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$1$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m28invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI2 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI2);
                                return Boolean.valueOf(sleepSettingDataForUI2.getIsSupportAutoRecognize());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new WatchSleepModeSettingFragment$showScreen$2$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$1$invoke$$inlined$visibleStateBy$2
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
                                preference.setVisible(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = watchSleepModeSettingFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$1$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m27invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI2 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI2);
                                return Boolean.valueOf(sleepSettingDataForUI2.getAutoRecognizeEnable());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new WatchSleepModeSettingFragment$showScreen$2$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$1$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(watchSleepModeSettingFragment, null));
                    }
                }, 3, (Object) null);
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment2 = this.this$0;
                PrefDsl.DefaultImpls.G0(watchSleepModeSettingFragment2, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2.2

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$2$2, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$2$2", f = "SleepAndRemindSettingUI.kt", i = {}, l = {ATDataProfile.CMD_BLOOD_OXYGEN_RECORD}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C00292 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ WatchSleepModeSettingFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00292(WatchSleepModeSettingFragment watchSleepModeSettingFragment, Continuation<? super C00292> continuation) {
                            super(2, continuation);
                            this.this$0 = watchSleepModeSettingFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            C00292 c00292 = new C00292(this.this$0, continuation);
                            c00292.Z$0 = ((Boolean) obj).booleanValue();
                            return c00292;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            boolean zBooleanValue;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                if (this.this$0.A0() && this.this$0.z0()) {
                                    SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = (SleepAndRemindSettingViewModel) this.this$0.c0();
                                    this.label = 1;
                                    obj = sleepAndRemindSettingViewModel.h0(z, this);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    zBooleanValue = false;
                                }
                                return Boxing.boxBoolean(zBooleanValue);
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            return Boxing.boxBoolean(zBooleanValue);
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
                        hCOUISwitchLoadingPreference.setPersistent(false);
                        hCOUISwitchLoadingPreference.setTitle(watchSleepModeSettingFragment2.getString(R.string.settings_sleep_model_according_habits));
                        hCOUISwitchLoadingPreference.setSummary(watchSleepModeSettingFragment2.getString(R.string.device_settings_accord_rest_desc));
                        LiveData liveDataX = watchSleepModeSettingFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$2$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m29invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI2 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI2);
                                return Boolean.valueOf(sleepSettingDataForUI2.getAccRestEnable());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new WatchSleepModeSettingFragment$showScreen$2$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$2$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new C00292(watchSleepModeSettingFragment2, null));
                    }
                }, 3, (Object) null);
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment3 = this.this$0;
                PrefDsl.DefaultImpls.R(watchSleepModeSettingFragment3, hCOUIPreferenceCategory, false, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2.3

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$2$3$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Integer> {
                        public final /* synthetic */ HCOUIJumpPreference i;
                        public final /* synthetic */ WatchSleepModeSettingFragment j;

                        public a(HCOUIJumpPreference hCOUIJumpPreference, WatchSleepModeSettingFragment watchSleepModeSettingFragment) {
                            this.i = hCOUIJumpPreference;
                            this.j = watchSleepModeSettingFragment;
                        }

                        public final void a(int i) {
                            this.i.setSummary(this.j.getResources().getQuantityString(R.plurals.device_settings_rest_count_v2, i, Integer.valueOf(i)));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Number) obj).intValue());
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
                        hCOUIJumpPreference.setPersistent(false);
                        hCOUIJumpPreference.setTitle(watchSleepModeSettingFragment3.getString(R.string.device_settings_title_accord_rest));
                        WatchSleepModeSettingFragment watchSleepModeSettingFragment4 = watchSleepModeSettingFragment3;
                        watchSleepModeSettingFragment4.d0(((SleepAndRemindSettingViewModel) watchSleepModeSettingFragment4.c0()).x(new Function1<SleepSettingDataForUI, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.2.3.1
                            @Nullable
                            public final Integer invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI2) {
                                Intrinsics.checkNotNullParameter(sleepSettingDataForUI2, "$this$changeBy");
                                return Integer.valueOf(sleepSettingDataForUI2.getRestCount());
                            }
                        }), new a(hCOUIJumpPreference, watchSleepModeSettingFragment3));
                        final WatchSleepModeSettingFragment watchSleepModeSettingFragment5 = watchSleepModeSettingFragment3;
                        watchSleepModeSettingFragment5.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.2.3.3
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
                                SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = (SleepAndRemindSettingViewModel) watchSleepModeSettingFragment5.c0();
                                Context context = hCOUIJumpPreference.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "context");
                                sleepAndRemindSettingViewModel.y0(context);
                            }
                        });
                    }
                }, 1, (Object) null);
            }
        }, 1, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$3
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                hCOUIPreferenceCategory.setTitle(this.this$0.getString(R.string.device_settings_title_link_device_phone));
                LiveData liveDataX = this.this$0.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$3$invoke$$inlined$visibleStateBy$1
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m31invoke(@Nullable Object obj) {
                        if (!(obj instanceof SleepSettingDataForUI)) {
                            obj = null;
                        }
                        SleepSettingDataForUI sleepSettingDataForUI2 = (SleepSettingDataForUI) obj;
                        Intrinsics.checkNotNull(sleepSettingDataForUI2);
                        return Boolean.valueOf(sleepSettingDataForUI2.getIsShowLinkagePhoneZenMode());
                    }
                });
                LifecycleOwner context = hCOUIPreferenceCategory.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                liveDataX.observe(context, new WatchSleepModeSettingFragment$showScreen$3$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$3$invoke$$inlined$visibleStateBy$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Boolean) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Boolean bool) {
                        Preference preference = hCOUIPreferenceCategory;
                        Intrinsics.checkNotNullExpressionValue(bool, "it");
                        preference.setVisible(bool.booleanValue());
                    }
                }));
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment = this.this$0;
                PrefDsl.DefaultImpls.G0(watchSleepModeSettingFragment, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$3.2

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$3$2$2, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$3$2$2", f = "SleepAndRemindSettingUI.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C00312 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ WatchSleepModeSettingFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00312(WatchSleepModeSettingFragment watchSleepModeSettingFragment, Continuation<? super C00312> continuation) {
                            super(2, continuation);
                            this.this$0 = watchSleepModeSettingFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            C00312 c00312 = new C00312(this.this$0, continuation);
                            c00312.Z$0 = ((Boolean) obj).booleanValue();
                            return c00312;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            boolean zBooleanValue;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                if (this.this$0.A0()) {
                                    SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = (SleepAndRemindSettingViewModel) this.this$0.c0();
                                    this.label = 1;
                                    obj = sleepAndRemindSettingViewModel.r0(z, this);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    zBooleanValue = false;
                                }
                                return Boxing.boxBoolean(zBooleanValue);
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            return Boxing.boxBoolean(zBooleanValue);
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
                        hCOUISwitchLoadingPreference.setPersistent(false);
                        hCOUISwitchLoadingPreference.setTitle(watchSleepModeSettingFragment.getString(R.string.health_sleep_guide_zen_mode));
                        hCOUISwitchLoadingPreference.setSummary(watchSleepModeSettingFragment.getString(R.string.device_settings_link_device_phone_desc));
                        LiveData liveDataX2 = watchSleepModeSettingFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$3$2$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m30invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI2 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI2);
                                return Boolean.valueOf(sleepSettingDataForUI2.getLinkagePhoneZenMode());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new WatchSleepModeSettingFragment$showScreen$3$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$3$2$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new C00312(watchSleepModeSettingFragment, null));
                    }
                }, 3, (Object) null);
            }
        }, 1, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4
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
                hCOUIPreferenceCategory.setTitle(this.this$0.getString(R.string.settings_guide_emotion_title));
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment = this.this$0;
                final SleepSettingDataForUI sleepSettingDataForUI2 = sleepSettingDataForUI;
                PrefDsl.DefaultImpls.R(watchSleepModeSettingFragment, hCOUIPreferenceCategory, false, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$1$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/preference/Preference;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    public static final class AnonymousClass3 extends Lambda implements Function1<Preference, Unit> {
                        final /* synthetic */ SleepSettingDataForUI $data;
                        final /* synthetic */ HCOUIJumpPreference $this_jump;
                        final /* synthetic */ WatchSleepModeSettingFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(HCOUIJumpPreference hCOUIJumpPreference, SleepSettingDataForUI sleepSettingDataForUI, WatchSleepModeSettingFragment watchSleepModeSettingFragment) {
                            super(1);
                            this.$this_jump = hCOUIJumpPreference;
                            this.$data = sleepSettingDataForUI;
                            this.this$0 = watchSleepModeSettingFragment;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void invoke$lambda$0(WatchSleepModeSettingFragment watchSleepModeSettingFragment, int i, int i2) {
                            Intrinsics.checkNotNullParameter(watchSleepModeSettingFragment, "this$0");
                            m8b.f(watchSleepModeSettingFragment.TAG, "Sleep goal time change hour=" + i + " minute=" + i2);
                            if (watchSleepModeSettingFragment.A0()) {
                                ((SleepAndRemindSettingViewModel) watchSleepModeSettingFragment.c0()).t0(quh.c(i, i2));
                                wbg.INSTANCE.X(quh.c(i, i2));
                            }
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Preference) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Preference preference) {
                            Intrinsics.checkNotNullParameter(preference, "it");
                            Context context = this.$this_jump.getContext();
                            int sleepGoal = this.$data.getSleepGoal();
                            final WatchSleepModeSettingFragment watchSleepModeSettingFragment = this.this$0;
                            g.t(context, sleepGoal, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: INVOKE 
                                  (r3v2 'context' android.content.Context)
                                  (r0v2 'sleepGoal' int)
                                  (wrap com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.g$a:0x0015: CONSTRUCTOR 
                                  (r2v1 'watchSleepModeSettingFragment' com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment A[DONT_INLINE])
                                 A[MD:(com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment):void (m), WRAPPED] call: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.h.<init>(com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment):void type: CONSTRUCTOR)
                                 STATIC call: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.g.t(android.content.Context, int, com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.g$a):void A[MD:(android.content.Context, int, com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.g$a):void (m)] in method: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.4.1.3.invoke(androidx.preference.Preference):void, file: D:\￩ﾡﾹ￧ﾛﾮ\oppo￩ﾀﾚ￧ﾟﾥ￨ﾽﾬ￥ﾏﾑ\analysis\health667-dex\classes18.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.h, state: NOT_LOADED
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
                                java.lang.String r0 = "it"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                                com.heytap.sporthealth.blib.helper.HCOUIJumpPreference r3 = r2.$this_jump
                                android.content.Context r3 = r3.getContext()
                                com.oplus.aiunit.vision.jrh r0 = r2.$data
                                int r0 = r0.getSleepGoal()
                                com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment r2 = r2.this$0
                                com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.h r1 = new com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.h
                                r1.<init>(r2)
                                com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.g.t(r3, r0, r1)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.AnonymousClass1.AnonymousClass3.invoke(androidx.preference.Preference):void");
                        }
                    }

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$1$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Integer> {
                        public final /* synthetic */ HCOUIJumpPreference i;
                        public final /* synthetic */ WatchSleepModeSettingFragment j;

                        public a(HCOUIJumpPreference hCOUIJumpPreference, WatchSleepModeSettingFragment watchSleepModeSettingFragment) {
                            this.i = hCOUIJumpPreference;
                            this.j = watchSleepModeSettingFragment;
                        }

                        public final void a(int i) {
                            if (i > 0) {
                                this.i.setAssignment(this.j.G0(i));
                            }
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Number) obj).intValue());
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

                    public final void invoke(@NotNull HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setTitle(watchSleepModeSettingFragment.getString(R.string.settings_sleep_goal_title));
                        WatchSleepModeSettingFragment watchSleepModeSettingFragment2 = watchSleepModeSettingFragment;
                        watchSleepModeSettingFragment2.d0(((SleepAndRemindSettingViewModel) watchSleepModeSettingFragment2.c0()).x(new Function1<SleepSettingDataForUI, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.4.1.1
                            @Nullable
                            public final Integer invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI3) {
                                Intrinsics.checkNotNullParameter(sleepSettingDataForUI3, "$this$changeBy");
                                return Integer.valueOf(sleepSettingDataForUI3.getSleepGoal());
                            }
                        }), new a(hCOUIJumpPreference, watchSleepModeSettingFragment));
                        WatchSleepModeSettingFragment watchSleepModeSettingFragment3 = watchSleepModeSettingFragment;
                        watchSleepModeSettingFragment3.f0(hCOUIJumpPreference, new AnonymousClass3(hCOUIJumpPreference, sleepSettingDataForUI2, watchSleepModeSettingFragment3));
                    }
                }, 1, (Object) null);
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment2 = this.this$0;
                PrefDsl.DefaultImpls.G0(watchSleepModeSettingFragment2, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.2

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$2$2, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$2$2", f = "SleepAndRemindSettingUI.kt", i = {}, l = {HttpStatus.SC_MULTI_STATUS}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C00332 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ WatchSleepModeSettingFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00332(WatchSleepModeSettingFragment watchSleepModeSettingFragment, Continuation<? super C00332> continuation) {
                            super(2, continuation);
                            this.this$0 = watchSleepModeSettingFragment;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            C00332 c00332 = new C00332(this.this$0, continuation);
                            c00332.Z$0 = ((Boolean) obj).booleanValue();
                            return c00332;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            boolean zBooleanValue;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                if (this.this$0.A0() && this.this$0.F0(true)) {
                                    SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = (SleepAndRemindSettingViewModel) this.this$0.c0();
                                    this.label = 1;
                                    obj = sleepAndRemindSettingViewModel.j0(z, this);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    zBooleanValue = false;
                                }
                                return Boxing.boxBoolean(zBooleanValue);
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            return Boxing.boxBoolean(zBooleanValue);
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
                        hCOUISwitchLoadingPreference.setPersistent(false);
                        hCOUISwitchLoadingPreference.setTitle(watchSleepModeSettingFragment2.getString(R.string.settings_guide_emotion_title));
                        hCOUISwitchLoadingPreference.setSummary(watchSleepModeSettingFragment2.getString(R.string.device_settings_bed_remind_desc));
                        LiveData liveDataX = watchSleepModeSettingFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$2$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m34invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI3 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI3);
                                return Boolean.valueOf(sleepSettingDataForUI3.getSleepRemindEnable());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new WatchSleepModeSettingFragment$showScreen$4$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$2$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new C00332(watchSleepModeSettingFragment2, null));
                    }
                }, 3, (Object) null);
                WatchSleepModeSettingFragment watchSleepModeSettingFragment3 = this.this$0;
                final SleepSettingDataForUI sleepSettingDataForUI3 = sleepSettingDataForUI;
                Function0<Pair<? extends Integer, ? extends Integer>> function0 = new Function0<Pair<? extends Integer, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.3
                    {
                        super(0);
                    }

                    @NotNull
                    public final Pair<Integer, Integer> invoke() {
                        return TuplesKt.to(Integer.valueOf(quh.a(sleepSettingDataForUI3.getSleepRemindTime())), Integer.valueOf(quh.b(sleepSettingDataForUI3.getSleepRemindTime())));
                    }
                };
                AnonymousClass4 anonymousClass4 = new Function0<Pair<? extends Integer, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.4
                    @NotNull
                    public final Pair<Integer, Integer> invoke() {
                        return TuplesKt.to(3, 15);
                    }
                };
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment4 = this.this$0;
                final SleepSettingDataForUI sleepSettingDataForUI4 = sleepSettingDataForUI;
                PrefDsl.DefaultImpls.Q0(watchSleepModeSettingFragment3, hCOUIPreferenceCategory, (String) null, function0, 15, (Function0) null, anonymousClass4, (Function1) null, false, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.5

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$5$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Integer> {
                        public final /* synthetic */ DialogCOUIPreference i;
                        public final /* synthetic */ WatchSleepModeSettingFragment j;

                        public a(DialogCOUIPreference dialogCOUIPreference, WatchSleepModeSettingFragment watchSleepModeSettingFragment) {
                            this.i = dialogCOUIPreference;
                            this.j = watchSleepModeSettingFragment;
                        }

                        public final void a(int i) {
                            this.i.setAssignment(i == 0 ? this.j.getString(R.string.settings_sleep_point_in_time) : swf.o(R.string.device_settings_remind_before, this.j.G0(i)));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Number) obj).intValue());
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final String invoke$getTips(int i, int i2) {
                        if (i > 0 && i2 > 0) {
                            return swf.n(R.string.settings_sleep_bed_time_des2, i, i2);
                        }
                        if (i > 0) {
                            return swf.m(R.string.settings_sleep_bed_time_des3, i);
                        }
                        return i2 > 0 ? swf.m(R.string.settings_sleep_bed_time_des4, i2) : swf.l(R.string.settings_sleep_point_in_time);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DialogCOUIPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final DialogCOUIPreference dialogCOUIPreference) {
                        Intrinsics.checkNotNullParameter(dialogCOUIPreference, "$this$timeLimitPicker");
                        dialogCOUIPreference.setTitle(R.string.settings_blood_sugar_reminder_time);
                        dialogCOUIPreference.setDialogTitle(R.string.settings_sleep_bed_time_remind_des);
                        LiveData liveDataX = watchSleepModeSettingFragment4.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$5$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m38invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI5 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI5);
                                return Boolean.valueOf(sleepSettingDataForUI5.getSleepRemindEnable());
                            }
                        });
                        LifecycleOwner context = dialogCOUIPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new WatchSleepModeSettingFragment$showScreen$4$5$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$5$invoke$$inlined$visibleStateBy$2
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
                                preference.setVisible(bool.booleanValue());
                            }
                        }));
                        WatchSleepModeSettingFragment watchSleepModeSettingFragment5 = watchSleepModeSettingFragment4;
                        watchSleepModeSettingFragment5.d0(((SleepAndRemindSettingViewModel) watchSleepModeSettingFragment5.c0()).x(new Function1<SleepSettingDataForUI, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.4.5.2
                            @Nullable
                            public final Integer invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI5) {
                                Intrinsics.checkNotNullParameter(sleepSettingDataForUI5, "$this$changeBy");
                                return Integer.valueOf(sleepSettingDataForUI5.getSleepRemindTime());
                            }
                        }), new a(dialogCOUIPreference, watchSleepModeSettingFragment4));
                        dialogCOUIPreference.u(new Function1<Object, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.4.5.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m37invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m37invoke(@NotNull Object obj) {
                                Intrinsics.checkNotNullParameter(obj, "it");
                                Pair pairL = dialogCOUIPreference.l(obj);
                                int iIntValue = ((Number) pairL.component1()).intValue();
                                int iIntValue2 = ((Number) pairL.component2()).intValue();
                                AlertDialog alertDialogN = dialogCOUIPreference.n();
                                if (alertDialogN != null) {
                                    alertDialogN.setMessage(AnonymousClass5.invoke$getTips(iIntValue, iIntValue2));
                                }
                            }
                        });
                        dialogCOUIPreference.setDialogMessage(invoke$getTips(quh.a(sleepSettingDataForUI4.getSleepRemindTime()), quh.b(sleepSettingDataForUI4.getSleepRemindTime())));
                        final WatchSleepModeSettingFragment watchSleepModeSettingFragment6 = watchSleepModeSettingFragment4;
                        dialogCOUIPreference.r(new Function3<Integer, Integer, String, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.4.5.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (String) obj3);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i, int i2, @NotNull String str) {
                                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 2>");
                                m8b.f(watchSleepModeSettingFragment6.TAG, "Remind bedRemindEnable change hour=" + i + " minute=" + i2);
                                if (watchSleepModeSettingFragment6.A0()) {
                                    dialogCOUIPreference.setDialogMessage(AnonymousClass5.invoke$getTips(i, i2));
                                    ((SleepAndRemindSettingViewModel) watchSleepModeSettingFragment6.c0()).k0(quh.c(i, i2));
                                    wbg.INSTANCE.m(quh.c(i, i2));
                                }
                            }
                        });
                    }
                }, 105, (Object) null);
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment5 = this.this$0;
                PrefDsl.DefaultImpls.G0(watchSleepModeSettingFragment5, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.6

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$6$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$6$3", f = "SleepAndRemindSettingUI.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ WatchSleepModeSettingFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(WatchSleepModeSettingFragment watchSleepModeSettingFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = watchSleepModeSettingFragment;
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
                            boolean zBooleanValue;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                zBooleanValue = false;
                                if (this.this$0.A0() && this.this$0.F0(false)) {
                                    SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = (SleepAndRemindSettingViewModel) this.this$0.c0();
                                    this.label = 1;
                                    obj = sleepAndRemindSettingViewModel.u0(z, this);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Boxing.boxBoolean(zBooleanValue);
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            return Boxing.boxBoolean(zBooleanValue);
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
                        hCOUISwitchLoadingPreference.setPersistent(false);
                        hCOUISwitchLoadingPreference.setTitle(watchSleepModeSettingFragment5.getString(R.string.health_sleep_guide_stay_up_bed_time_switch_title));
                        hCOUISwitchLoadingPreference.setSummary(watchSleepModeSettingFragment5.getString(R.string.settings_sleep_stay_up_bed_time_des));
                        LiveData liveDataX = watchSleepModeSettingFragment5.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$6$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m40invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI5 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI5);
                                return Boolean.valueOf(sleepSettingDataForUI5.getIsShowStayUp());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new WatchSleepModeSettingFragment$showScreen$4$6$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$6$invoke$$inlined$visibleStateBy$2
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
                                preference.setVisible(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = watchSleepModeSettingFragment5.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$6$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m39invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI5 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI5);
                                return Boolean.valueOf(sleepSettingDataForUI5.getStayUpRemindEnable());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new WatchSleepModeSettingFragment$showScreen$4$6$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$6$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(watchSleepModeSettingFragment5, null));
                    }
                }, 3, (Object) null);
                WatchSleepModeSettingFragment watchSleepModeSettingFragment6 = this.this$0;
                final SleepSettingDataForUI sleepSettingDataForUI5 = sleepSettingDataForUI;
                Function0<Pair<? extends Integer, ? extends Integer>> function1 = new Function0<Pair<? extends Integer, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.7
                    {
                        super(0);
                    }

                    @NotNull
                    public final Pair<Integer, Integer> invoke() {
                        return TuplesKt.to(Integer.valueOf(quh.a(sleepSettingDataForUI5.getStayUpRemindTime())), Integer.valueOf(quh.b(sleepSettingDataForUI5.getStayUpRemindTime())));
                    }
                };
                AnonymousClass8 anonymousClass8 = new Function0<Pair<? extends Integer, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.8
                    @NotNull
                    public final Pair<Integer, Integer> invoke() {
                        return TuplesKt.to(3, 15);
                    }
                };
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment7 = this.this$0;
                PrefDsl.DefaultImpls.Q0(watchSleepModeSettingFragment6, hCOUIPreferenceCategory, (String) null, function1, 15, (Function0) null, anonymousClass8, (Function1) null, false, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.9

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$9$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Integer> {
                        public final /* synthetic */ DialogCOUIPreference i;
                        public final /* synthetic */ WatchSleepModeSettingFragment j;

                        public a(DialogCOUIPreference dialogCOUIPreference, WatchSleepModeSettingFragment watchSleepModeSettingFragment) {
                            this.i = dialogCOUIPreference;
                            this.j = watchSleepModeSettingFragment;
                        }

                        public final void a(int i) {
                            this.i.setAssignment(this.j.H0(i));
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
                        Intrinsics.checkNotNullParameter(dialogCOUIPreference, "$this$timeLimitPicker");
                        dialogCOUIPreference.setTitle(R.string.settings_sleep_stay_up_bed_time_title);
                        dialogCOUIPreference.setDialogTitle(R.string.settings_sleep_stay_up_bed_time_remind_des);
                        LiveData liveDataX = watchSleepModeSettingFragment7.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$9$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m43invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI6 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI6);
                                return Boolean.valueOf(sleepSettingDataForUI6.getIsShowStayUpRemindTime() && sleepSettingDataForUI6.getStayUpRemindEnable());
                            }
                        });
                        LifecycleOwner context = dialogCOUIPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new WatchSleepModeSettingFragment$showScreen$4$9$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$9$invoke$$inlined$visibleStateBy$2
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
                                preference.setVisible(bool.booleanValue());
                            }
                        }));
                        WatchSleepModeSettingFragment watchSleepModeSettingFragment8 = watchSleepModeSettingFragment7;
                        watchSleepModeSettingFragment8.d0(((SleepAndRemindSettingViewModel) watchSleepModeSettingFragment8.c0()).x(new Function1<SleepSettingDataForUI, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.4.9.2
                            @Nullable
                            public final Integer invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI6) {
                                Intrinsics.checkNotNullParameter(sleepSettingDataForUI6, "$this$changeBy");
                                return Integer.valueOf(sleepSettingDataForUI6.getStayUpRemindTime());
                            }
                        }), new a(dialogCOUIPreference, watchSleepModeSettingFragment7));
                        final WatchSleepModeSettingFragment watchSleepModeSettingFragment9 = watchSleepModeSettingFragment7;
                        dialogCOUIPreference.r(new Function3<Integer, Integer, String, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.4.9.4
                            {
                                super(3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (String) obj3);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i, int i2, @NotNull String str) {
                                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 2>");
                                m8b.f(watchSleepModeSettingFragment9.TAG, "Remind stayUpRemindTime change hour=" + i + " minute=" + i2);
                                if (watchSleepModeSettingFragment9.A0()) {
                                    ((SleepAndRemindSettingViewModel) watchSleepModeSettingFragment9.c0()).v0(quh.c(i, i2));
                                }
                            }
                        });
                    }
                }, 105, (Object) null);
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment8 = this.this$0;
                PrefDsl.DefaultImpls.G0(watchSleepModeSettingFragment8, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4.10

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$10$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$10$3", f = "SleepAndRemindSettingUI.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ WatchSleepModeSettingFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(WatchSleepModeSettingFragment watchSleepModeSettingFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = watchSleepModeSettingFragment;
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
                            boolean zBooleanValue;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                if (this.this$0.A0() && this.this$0.B0()) {
                                    SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = (SleepAndRemindSettingViewModel) this.this$0.c0();
                                    this.label = 1;
                                    obj = sleepAndRemindSettingViewModel.s0(z, this);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    zBooleanValue = false;
                                }
                                return Boxing.boxBoolean(zBooleanValue);
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            return Boxing.boxBoolean(zBooleanValue);
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
                        hCOUISwitchLoadingPreference.setPersistent(false);
                        hCOUISwitchLoadingPreference.setTitle(watchSleepModeSettingFragment8.getString(R.string.settings_guide_sleep_sound_title));
                        hCOUISwitchLoadingPreference.setSummary(watchSleepModeSettingFragment8.getString(R.string.settings_guide_sleep_sound_desc_new));
                        LiveData liveDataX = watchSleepModeSettingFragment8.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$10$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m33invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI6 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI6);
                                return Boolean.valueOf(sleepSettingDataForUI6.getIsShowSleepCloseMusic());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new WatchSleepModeSettingFragment$showScreen$4$10$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$10$invoke$$inlined$visibleStateBy$2
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
                                preference.setVisible(bool.booleanValue());
                            }
                        }));
                        LiveData liveDataX2 = watchSleepModeSettingFragment8.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$10$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m32invoke(@Nullable Object obj) {
                                if (!(obj instanceof SleepSettingDataForUI)) {
                                    obj = null;
                                }
                                SleepSettingDataForUI sleepSettingDataForUI6 = (SleepSettingDataForUI) obj;
                                Intrinsics.checkNotNull(sleepSettingDataForUI6);
                                return Boolean.valueOf(sleepSettingDataForUI6.getSleepCloseMusicEnable());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new WatchSleepModeSettingFragment$showScreen$4$10$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$4$10$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(watchSleepModeSettingFragment8, null));
                    }
                }, 3, (Object) null);
            }
        }, 1, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$5

            @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a implements Observer<Boolean> {
                public final /* synthetic */ HCOUIPreferenceCategory i;

                public a(HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                    this.i = hCOUIPreferenceCategory;
                }

                public final void a(boolean z) {
                    this.i.setVisible(z);
                }

                public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                    a(((Boolean) obj).booleanValue());
                }
            }

            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                WatchSleepModeSettingFragment watchSleepModeSettingFragment = this.this$0;
                watchSleepModeSettingFragment.d0(((SleepAndRemindSettingViewModel) watchSleepModeSettingFragment.c0()).x(new Function1<SleepSettingDataForUI, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$5.1
                    @Nullable
                    public final Boolean invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI2) {
                        Intrinsics.checkNotNullParameter(sleepSettingDataForUI2, "$this$changeBy");
                        return Boolean.valueOf(sleepSettingDataForUI2.getIsShowSilenceNotification());
                    }
                }), new a(hCOUIPreferenceCategory));
                hCOUIPreferenceCategory.setTitle(this.this$0.getString(R.string.settings_sleep_other_tips));
                final WatchSleepModeSettingFragment watchSleepModeSettingFragment2 = this.this$0;
                PrefDsl.DefaultImpls.R(watchSleepModeSettingFragment2, hCOUIPreferenceCategory, false, new Function1<HCOUIJumpPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment$showScreen$5.3
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIJumpPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIJumpPreference hCOUIJumpPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIJumpPreference, "$this$jump");
                        hCOUIJumpPreference.setPersistent(false);
                        hCOUIJumpPreference.setTitle(watchSleepModeSettingFragment2.getString(R.string.device_settings_silence_notifications_during_nap_title));
                        hCOUIJumpPreference.setSummary(watchSleepModeSettingFragment2.getString(R.string.device_settings_silence_notifications_during_nap_desc));
                        final WatchSleepModeSettingFragment watchSleepModeSettingFragment3 = watchSleepModeSettingFragment2;
                        watchSleepModeSettingFragment3.f0(hCOUIJumpPreference, new Function1<Preference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.WatchSleepModeSettingFragment.showScreen.5.3.1
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
                                SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = (SleepAndRemindSettingViewModel) watchSleepModeSettingFragment3.c0();
                                Context context = hCOUIJumpPreference.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "context");
                                sleepAndRemindSettingViewModel.A0(context);
                            }
                        });
                    }
                }, 1, (Object) null);
            }
        }, 1, (Object) null);
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R.id.description) {
            yod.c("simple-page/index.html?page=SleepFunctionDescription");
            wbg.INSTANCE.N();
        }
        return super/*androidx.fragment.app.Fragment*/.onOptionsItemSelected(item);
    }

    public final boolean z0() {
        if (wl4.managerApi.isCurrentConnected()) {
            return true;
        }
        a5k.i(getString(com.heytap.health.base.R.string.lib_base_device_disconnected_retry_later));
        return false;
    }
}