package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.coui.appcompat.picker.COUINumberPicker;
import com.coui.appcompat.preference.COUISwitchLoadingPreference;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.settings.watch.sporthealthsettings.bean.e0;
import com.heytap.sporthealth.blib.basic.ui.BasicPreferenceFragment;
import com.heytap.sporthealth.blib.helper.DialogCOUIPreference;
import com.heytap.sporthealth.blib.helper.HCOUIPreferenceCategory;
import com.heytap.sporthealth.blib.helper.HCOUISwitchLoadingPreference;
import com.heytap.sporthealth.blib.helper.PrefDsl;
import com.oplus.aiunit.model.kr8;
import com.oplus.aiunit.vision.swf;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SportHeartRateFragment;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SportHeartRateViewModel;", "Landroidx/preference/PreferenceScreen;", "", "n0", "Lkotlin/Pair;", "", "q", "Lkotlin/Pair;", "s0", "()Lkotlin/Pair;", "SPORT_HEART_LIMIT", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SportHeartRateFragment extends BasicPreferenceFragment<SportHeartRateViewModel> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Pair<Integer, Integer> SPORT_HEART_LIMIT = TuplesKt.to(100, Integer.valueOf(kr8.MAX_HEARTRATE));

    public void n0(@NotNull PreferenceScreen preferenceScreen) {
        Intrinsics.checkNotNullParameter(preferenceScreen, "<this>");
        final e0 e0Var = (e0) ((SportHeartRateViewModel) c0()).T();
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$1
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
                final SportHeartRateFragment sportHeartRateFragment = this.this$0;
                final e0 e0Var2 = e0Var;
                PrefDsl.DefaultImpls.G0(sportHeartRateFragment, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$1.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$1$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$1$1$2", f = "SportHeartRateUI.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        final /* synthetic */ e0 $data;
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ SportHeartRateFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(SportHeartRateFragment sportHeartRateFragment, e0 e0Var, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.this$0 = sportHeartRateFragment;
                            this.$data = e0Var;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$data, continuation);
                            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass2;
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
                                SportHeartRateViewModel sportHeartRateViewModel = (SportHeartRateViewModel) this.this$0.c0();
                                int highHeartRateValue = this.$data.getHighHeartRateValue();
                                this.label = 1;
                                obj = sportHeartRateViewModel.v0(z, highHeartRateValue, this);
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
                        hCOUISwitchLoadingPreference.setTitle(R.string.settings_watch_high_rate_notification_01);
                        hCOUISwitchLoadingPreference.setSummary(R.string.settings_sports_heart_rate_warning_desc);
                        hCOUISwitchLoadingPreference.setChecked(e0Var2.getHighRateNotificationEnable());
                        LiveData liveDataX = sportHeartRateFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$1$1$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m162invoke(@Nullable Object obj) {
                                if (!(obj instanceof e0)) {
                                    obj = null;
                                }
                                e0 e0Var3 = (e0) obj;
                                Intrinsics.checkNotNull(e0Var3);
                                return Boolean.valueOf(e0Var3.getHighRateNotificationEnable());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SportHeartRateFragment$showScreen$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$1$1$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new AnonymousClass2(sportHeartRateFragment, e0Var2, null));
                    }
                }, 3, (Object) null);
            }
        }, 1, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$2
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
                final SportHeartRateFragment sportHeartRateFragment = this.this$0;
                final e0 e0Var2 = e0Var;
                Function1<COUINumberPicker, Unit> function1 = new Function1<COUINumberPicker, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((COUINumberPicker) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull COUINumberPicker cOUINumberPicker) {
                        Intrinsics.checkNotNullParameter(cOUINumberPicker, "$this$valuePicker");
                        cOUINumberPicker.setMinValue(((Number) sportHeartRateFragment.s0().getFirst()).intValue());
                        cOUINumberPicker.setMaxValue(((Number) sportHeartRateFragment.s0().getSecond()).intValue());
                        cOUINumberPicker.setValue(e0Var2.getHighHeartRateValue());
                        cOUINumberPicker.setSelectedValueWidth(swf.b(26.0f));
                        cOUINumberPicker.setUnitText(swf.l(R.string.settings_times_per_minute));
                    }
                };
                final SportHeartRateFragment sportHeartRateFragment2 = this.this$0;
                PrefDsl.DefaultImpls.Y0(sportHeartRateFragment, hCOUIPreferenceCategory, "sport_heartrate", function1, false, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$2.2

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$2$2$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Integer> {
                        public final /* synthetic */ DialogCOUIPreference i;

                        public a(DialogCOUIPreference dialogCOUIPreference) {
                            this.i = dialogCOUIPreference;
                        }

                        public final void a(int i) {
                            this.i.setAssignment(swf.m(R.string.settings_watch_high_rate_value, i));
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
                        dialogCOUIPreference.m();
                        dialogCOUIPreference.setDialogTitle(R.string.settings_watch_quiet_rate_value_str);
                        dialogCOUIPreference.setTitle(R.string.settings_watch_high_rate_value_str);
                        dialogCOUIPreference.setSummary(R.string.settings_high_heart_rate_hint_msg);
                        SportHeartRateFragment sportHeartRateFragment3 = sportHeartRateFragment2;
                        sportHeartRateFragment3.d0(((SportHeartRateViewModel) sportHeartRateFragment3.c0()).x(new Function1<e0, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment.showScreen.2.2.1
                            @Nullable
                            public final Integer invoke(@NotNull e0 e0Var3) {
                                Intrinsics.checkNotNullParameter(e0Var3, "$this$changeBy");
                                return Integer.valueOf(e0Var3.getHighHeartRateValue());
                            }
                        }), new a(dialogCOUIPreference));
                        LiveData liveDataX = sportHeartRateFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$2$2$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m164invoke(@Nullable Object obj) {
                                if (!(obj instanceof e0)) {
                                    obj = null;
                                }
                                e0 e0Var3 = (e0) obj;
                                Intrinsics.checkNotNull(e0Var3);
                                return Boolean.valueOf(e0Var3.getHighRateNotificationEnable());
                            }
                        });
                        LifecycleOwner context = dialogCOUIPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SportHeartRateFragment$showScreen$2$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$2$2$invoke$$inlined$visibleStateBy$2
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
                        final SportHeartRateFragment sportHeartRateFragment4 = sportHeartRateFragment2;
                        sportHeartRateFragment4.e0(dialogCOUIPreference, new Function1<Object, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment.showScreen.2.2.4

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$2$2$4$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SportHeartRateFragment$showScreen$2$2$4$1", f = "SportHeartRateUI.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Object $it;
                                int label;
                                final /* synthetic */ SportHeartRateFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SportHeartRateFragment sportHeartRateFragment, Object obj, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = sportHeartRateFragment;
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
                                        SportHeartRateViewModel sportHeartRateViewModel = (SportHeartRateViewModel) this.this$0.c0();
                                        int i2 = Integer.parseInt(this.$it.toString());
                                        this.label = 1;
                                        if (sportHeartRateViewModel.v0(true, i2, this) == coroutine_suspended) {
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
                                m163invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m163invoke(@NotNull Object obj) {
                                Intrinsics.checkNotNullParameter(obj, "it");
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(sportHeartRateFragment4), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(sportHeartRateFragment4, obj, null), 3, (Object) null);
                            }
                        });
                    }
                }, 4, (Object) null);
            }
        }, 1, (Object) null);
    }

    @NotNull
    public final Pair<Integer, Integer> s0() {
        return this.SPORT_HEART_LIMIT;
    }
}