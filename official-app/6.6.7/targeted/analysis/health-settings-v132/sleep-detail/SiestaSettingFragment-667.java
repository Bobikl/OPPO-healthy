package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.coui.appcompat.preference.COUISwitchLoadingPreference;
import com.heytap.health.device_settings.impl.R;
import com.heytap.sporthealth.blib.basic.ui.BasicPreferenceFragment;
import com.heytap.sporthealth.blib.helper.DialogCOUIPreference;
import com.heytap.sporthealth.blib.helper.HCOUIPreferenceCategory;
import com.heytap.sporthealth.blib.helper.HCOUISwitchLoadingPreference;
import com.heytap.sporthealth.blib.helper.PrefDsl;
import com.oplus.aiunit.model.e6h;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SiestaSettingFragment;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SiestaSettingViewModel;", "Landroidx/preference/PreferenceScreen;", "", "n0", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SiestaSettingFragment extends BasicPreferenceFragment<SiestaSettingViewModel> {
    public static final int $stable = 0;

    public void n0(@NotNull PreferenceScreen preferenceScreen) {
        Intrinsics.checkNotNullParameter(preferenceScreen, "<this>");
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                final SiestaSettingFragment siestaSettingFragment = this.this$0;
                PrefDsl.DefaultImpls.G0(siestaSettingFragment, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$1.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$1$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$1$1$2", f = "SiestaSettingUI.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        final /* synthetic */ HCOUISwitchLoadingPreference $this_switchLoading;
                        int label;
                        final /* synthetic */ SiestaSettingFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(SiestaSettingFragment siestaSettingFragment, HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.this$0 = siestaSettingFragment;
                            this.$this_switchLoading = hCOUISwitchLoadingPreference;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass2(this.this$0, this.$this_switchLoading, continuation);
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
                                SiestaSettingViewModel siestaSettingViewModel = (SiestaSettingViewModel) this.this$0.c0();
                                boolean z = !this.$this_switchLoading.isChecked();
                                this.label = 1;
                                obj = siestaSettingViewModel.x0(z, this);
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
                        hCOUISwitchLoadingPreference.setTitle(R.string.device_settings_silence_notifications_during_nap_title);
                        hCOUISwitchLoadingPreference.setSummary(R.string.device_settings_silence_notifications_during_nap_desc);
                        LiveData liveDataX = siestaSettingFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$1$1$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m144invoke(@Nullable Object obj) {
                                if (!(obj instanceof e6h)) {
                                    obj = null;
                                }
                                e6h e6hVar = (e6h) obj;
                                Intrinsics.checkNotNull(e6hVar);
                                return Boolean.valueOf(e6hVar.a());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new SiestaSettingFragment$showScreen$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$1$1$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new AnonymousClass2(siestaSettingFragment, hCOUISwitchLoadingPreference, null));
                    }
                }, 3, (Object) null);
            }
        }, 1, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                LiveData liveDataX = this.this$0.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2$invoke$$inlined$visibleStateBy$1
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m149invoke(@Nullable Object obj) {
                        if (!(obj instanceof e6h)) {
                            obj = null;
                        }
                        e6h e6hVar = (e6h) obj;
                        Intrinsics.checkNotNull(e6hVar);
                        return Boolean.valueOf(e6hVar.a());
                    }
                });
                LifecycleOwner context = hCOUIPreferenceCategory.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                liveDataX.observe(context, new SiestaSettingFragment$showScreen$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2$invoke$$inlined$visibleStateBy$2
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
                hCOUIPreferenceCategory.setTitle(R.string.device_settings_nap_time_title);
                final SiestaSettingFragment siestaSettingFragment = this.this$0;
                Function0<Pair<? extends Integer, ? extends Integer>> function0 = new Function0<Pair<? extends Integer, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2.2
                    {
                        super(0);
                    }

                    @NotNull
                    public final Pair<Integer, Integer> invoke() {
                        return ((e6h) ((SiestaSettingViewModel) siestaSettingFragment.c0()).T()).c();
                    }
                };
                final SiestaSettingFragment siestaSettingFragment2 = this.this$0;
                Function0<Pair<? extends Integer, ? extends Integer>> function1 = new Function0<Pair<? extends Integer, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2.3
                    {
                        super(0);
                    }

                    @NotNull
                    public final Pair<Integer, Integer> invoke() {
                        return ((e6h) ((SiestaSettingViewModel) siestaSettingFragment2.c0()).T()).b();
                    }
                };
                final SiestaSettingFragment siestaSettingFragment3 = this.this$0;
                PrefDsl.DefaultImpls.Q0(siestaSettingFragment, hCOUIPreferenceCategory, (String) null, function0, 5, (Function0) null, function1, (Function1) null, false, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2.4

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2$4$a */
                    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Pair<? extends Integer, ? extends Integer>> {
                        public final /* synthetic */ DialogCOUIPreference i;

                        public a(DialogCOUIPreference dialogCOUIPreference) {
                            this.i = dialogCOUIPreference;
                        }

                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final void onChanged(@NotNull Pair<Integer, Integer> pair) {
                            Intrinsics.checkNotNullParameter(pair, "it");
                            DialogCOUIPreference dialogCOUIPreference = this.i;
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{pair.getFirst(), pair.getSecond()}, 2));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            dialogCOUIPreference.setAssignment(str);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DialogCOUIPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull DialogCOUIPreference dialogCOUIPreference) {
                        Intrinsics.checkNotNullParameter(dialogCOUIPreference, "$this$timeLimitPicker");
                        dialogCOUIPreference.setTitle(R.string.device_settings_nap_start_time_title2);
                        dialogCOUIPreference.setDialogTitle(R.string.device_settings_nap_start_time_dialog_title);
                        SiestaSettingFragment siestaSettingFragment4 = siestaSettingFragment3;
                        siestaSettingFragment4.d0(((SiestaSettingViewModel) siestaSettingFragment4.c0()).x(new Function1<e6h, Pair<? extends Integer, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment.showScreen.2.4.1
                            @Nullable
                            public final Pair<Integer, Integer> invoke(@NotNull e6h e6hVar) {
                                Intrinsics.checkNotNullParameter(e6hVar, "$this$changeBy");
                                return e6hVar.c();
                            }
                        }), new a(dialogCOUIPreference));
                        final SiestaSettingFragment siestaSettingFragment5 = siestaSettingFragment3;
                        dialogCOUIPreference.r(new Function3<Integer, Integer, String, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment.showScreen.2.4.3

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2$4$3$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2$4$3$1", f = "SiestaSettingUI.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ String $selectedTime;
                                int label;
                                final /* synthetic */ SiestaSettingFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SiestaSettingFragment siestaSettingFragment, String str, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = siestaSettingFragment;
                                    this.$selectedTime = str;
                                }

                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.this$0, this.$selectedTime, continuation);
                                }

                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        e6h e6hVar = (e6h) ((SiestaSettingViewModel) this.this$0.c0()).T();
                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{e6hVar.b().getFirst(), e6hVar.b().getSecond()}, 2));
                                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                        SiestaSettingViewModel siestaSettingViewModel = (SiestaSettingViewModel) this.this$0.c0();
                                        String str2 = this.$selectedTime;
                                        this.label = 1;
                                        if (siestaSettingViewModel.y0(str2, str, this) == coroutine_suspended) {
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
                                super(3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (String) obj3);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i, int i2, @NotNull String str) {
                                Intrinsics.checkNotNullParameter(str, "selectedTime");
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(siestaSettingFragment5), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(siestaSettingFragment5, str, null), 3, (Object) null);
                            }
                        });
                    }
                }, 105, (Object) null);
                final SiestaSettingFragment siestaSettingFragment4 = this.this$0;
                Function0<Pair<? extends Integer, ? extends Integer>> function2 = new Function0<Pair<? extends Integer, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2.5
                    {
                        super(0);
                    }

                    @NotNull
                    public final Pair<Integer, Integer> invoke() {
                        return ((e6h) ((SiestaSettingViewModel) siestaSettingFragment4.c0()).T()).b();
                    }
                };
                final SiestaSettingFragment siestaSettingFragment5 = this.this$0;
                Function0<Pair<? extends Integer, ? extends Integer>> function3 = new Function0<Pair<? extends Integer, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2.6
                    {
                        super(0);
                    }

                    @NotNull
                    public final Pair<Integer, Integer> invoke() {
                        return ((e6h) ((SiestaSettingViewModel) siestaSettingFragment5.c0()).T()).c();
                    }
                };
                final SiestaSettingFragment siestaSettingFragment6 = this.this$0;
                PrefDsl.DefaultImpls.Q0(siestaSettingFragment4, hCOUIPreferenceCategory, (String) null, function2, 5, function3, (Function0) null, (Function1) null, false, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2.7

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2$7$a */
                    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Pair<? extends Integer, ? extends Integer>> {
                        public final /* synthetic */ DialogCOUIPreference i;

                        public a(DialogCOUIPreference dialogCOUIPreference) {
                            this.i = dialogCOUIPreference;
                        }

                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final void onChanged(@NotNull Pair<Integer, Integer> pair) {
                            Intrinsics.checkNotNullParameter(pair, "it");
                            DialogCOUIPreference dialogCOUIPreference = this.i;
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{pair.getFirst(), pair.getSecond()}, 2));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            dialogCOUIPreference.setAssignment(str);
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DialogCOUIPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull DialogCOUIPreference dialogCOUIPreference) {
                        Intrinsics.checkNotNullParameter(dialogCOUIPreference, "$this$timeLimitPicker");
                        dialogCOUIPreference.setTitle(R.string.device_settings_nap_end_time_title);
                        dialogCOUIPreference.setDialogTitle(R.string.device_settings_nap_end_time_dialog_title);
                        SiestaSettingFragment siestaSettingFragment7 = siestaSettingFragment6;
                        siestaSettingFragment7.d0(((SiestaSettingViewModel) siestaSettingFragment7.c0()).x(new Function1<e6h, Pair<? extends Integer, ? extends Integer>>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment.showScreen.2.7.1
                            @Nullable
                            public final Pair<Integer, Integer> invoke(@NotNull e6h e6hVar) {
                                Intrinsics.checkNotNullParameter(e6hVar, "$this$changeBy");
                                return e6hVar.b();
                            }
                        }), new a(dialogCOUIPreference));
                        final SiestaSettingFragment siestaSettingFragment8 = siestaSettingFragment6;
                        dialogCOUIPreference.r(new Function3<Integer, Integer, String, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment.showScreen.2.7.3

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2$7$3$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingFragment$showScreen$2$7$3$1", f = "SiestaSettingUI.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ String $selectedTime;
                                int label;
                                final /* synthetic */ SiestaSettingFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SiestaSettingFragment siestaSettingFragment, String str, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = siestaSettingFragment;
                                    this.$selectedTime = str;
                                }

                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.this$0, this.$selectedTime, continuation);
                                }

                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        e6h e6hVar = (e6h) ((SiestaSettingViewModel) this.this$0.c0()).T();
                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{e6hVar.c().getFirst(), e6hVar.c().getSecond()}, 2));
                                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                        SiestaSettingViewModel siestaSettingViewModel = (SiestaSettingViewModel) this.this$0.c0();
                                        String str2 = this.$selectedTime;
                                        this.label = 1;
                                        if (siestaSettingViewModel.y0(str, str2, this) == coroutine_suspended) {
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
                                super(3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (String) obj3);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i, int i2, @NotNull String str) {
                                Intrinsics.checkNotNullParameter(str, "selectedTime");
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(siestaSettingFragment8), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(siestaSettingFragment8, str, null), 3, (Object) null);
                            }
                        });
                    }
                }, 113, (Object) null);
            }
        }, 1, (Object) null);
    }
}