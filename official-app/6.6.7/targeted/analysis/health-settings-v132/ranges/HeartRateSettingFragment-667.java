package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.coui.appcompat.preference.COUISwitchLoadingPreference;
import com.heytap.health.device_settings.impl.R;
import com.heytap.sporthealth.blib.basic.ui.BasicPreferenceFragment;
import com.heytap.sporthealth.blib.helper.HCOUIMarkPreference;
import com.heytap.sporthealth.blib.helper.HCOUIPreferenceCategory;
import com.heytap.sporthealth.blib.helper.HCOUISwitchLoadingPreference;
import com.heytap.sporthealth.blib.helper.PrefDsl;
import com.oplus.aiunit.model.HeartRateDetect;
import com.oplus.aiunit.model.k79;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/HeartRateSettingFragment;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/HeartRateSettingViewModel;", "Landroidx/preference/PreferenceScreen;", "", "n0", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class HeartRateSettingFragment extends BasicPreferenceFragment<HeartRateSettingViewModel> {
    public static final int $stable = 0;

    public void n0(@NotNull final PreferenceScreen preferenceScreen) {
        Intrinsics.checkNotNullParameter(preferenceScreen, "<this>");
        final HeartRateDetect heartRateDetect = (HeartRateDetect) ((HeartRateSettingViewModel) c0()).T();
        final boolean zB0 = ((HeartRateSettingViewModel) c0()).B0();
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1
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
                final HeartRateSettingFragment heartRateSettingFragment = this.this$0;
                final boolean z = zB0;
                final HeartRateDetect heartRateDetect2 = heartRateDetect;
                PrefDsl.DefaultImpls.G0(heartRateSettingFragment, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$1$2", f = "HeartRateSettingUI.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        final /* synthetic */ HeartRateDetect $data;
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ HeartRateSettingFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(HeartRateSettingFragment heartRateSettingFragment, HeartRateDetect heartRateDetect, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.this$0 = heartRateSettingFragment;
                            this.$data = heartRateDetect;
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
                                HeartRateSettingViewModel heartRateSettingViewModel = (HeartRateSettingViewModel) this.this$0.c0();
                                int iK = this.$data.getAutoSwitch().k();
                                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                this.label = 1;
                                obj = heartRateSettingViewModel.x0(z, iK, fragmentActivityRequireActivity, this);
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
                        hCOUISwitchLoadingPreference.setTitle(R.string.settings_watch_auto_measure_heart_rate);
                        if (z) {
                            hCOUISwitchLoadingPreference.setSummary(R.string.settings_device_auto_measure_heart_rate_watch4_desc);
                        } else {
                            hCOUISwitchLoadingPreference.setSummary(R.string.settings_device_auto_measure_heart_rate_desc);
                        }
                        LiveData liveDataX = heartRateSettingFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$1$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m72invoke(@Nullable Object obj) {
                                if (!(obj instanceof HeartRateDetect)) {
                                    obj = null;
                                }
                                HeartRateDetect heartRateDetect3 = (HeartRateDetect) obj;
                                Intrinsics.checkNotNull(heartRateDetect3);
                                return Boolean.valueOf(heartRateDetect3.getAutoSwitch().j());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new HeartRateSettingFragment$showScreen$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$1$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new AnonymousClass2(heartRateSettingFragment, heartRateDetect2, null));
                    }
                }, 3, (Object) null);
                if (zB0) {
                    return;
                }
                final HeartRateSettingFragment heartRateSettingFragment2 = this.this$0;
                PreferenceScreen preferenceScreen2 = preferenceScreen;
                final HeartRateDetect heartRateDetect3 = heartRateDetect;
                PrefDsl.DefaultImpls.o(heartRateSettingFragment2, preferenceScreen2, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIPreferenceCategory) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory2) {
                        Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory2, "$this$category");
                        List<k79> listB = heartRateDetect3.b();
                        final HeartRateSettingFragment heartRateSettingFragment3 = heartRateSettingFragment2;
                        for (final k79 k79Var : listB) {
                            PrefDsl.DefaultImpls.b0(heartRateSettingFragment3, hCOUIPreferenceCategory2, false, new Function1<HCOUIMarkPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$2$1$1

                                /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$2$1$1$3, reason: invalid class name */
                                @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "to", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$2$1$1$3", f = "HeartRateSettingUI.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
                                public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ k79 $it;
                                    /* synthetic */ boolean Z$0;
                                    int label;
                                    final /* synthetic */ HeartRateSettingFragment this$0;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass3(HeartRateSettingFragment heartRateSettingFragment, k79 k79Var, Continuation<? super AnonymousClass3> continuation) {
                                        super(2, continuation);
                                        this.this$0 = heartRateSettingFragment;
                                        this.$it = k79Var;
                                    }

                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$it, continuation);
                                        anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                                        return anonymousClass3;
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                                    }

                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            if (this.Z$0) {
                                                HeartRateSettingViewModel heartRateSettingViewModel = (HeartRateSettingViewModel) this.this$0.c0();
                                                int iC = this.$it.c();
                                                this.label = 1;
                                                if (heartRateSettingViewModel.y0(iC, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
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
                                    public final Object invoke(boolean z, @Nullable Continuation<? super Unit> continuation) {
                                        return create(Boolean.valueOf(z), continuation).invokeSuspend(Unit.INSTANCE);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((HCOUIMarkPreference) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull final HCOUIMarkPreference hCOUIMarkPreference) {
                                    Intrinsics.checkNotNullParameter(hCOUIMarkPreference, "$this$mark");
                                    hCOUIMarkPreference.setTitle(k79Var.b());
                                    hCOUIMarkPreference.setSummary(k79Var.a());
                                    HeartRateSettingFragment heartRateSettingFragment4 = heartRateSettingFragment3;
                                    final k79 k79Var2 = k79Var;
                                    LiveData liveDataX = heartRateSettingFragment4.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$2$1$1$invoke$$inlined$checkStateBy$1
                                        {
                                            super(1);
                                        }

                                        @Nullable
                                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                        public final Boolean m73invoke(@Nullable Object obj) {
                                            if (!(obj instanceof HeartRateDetect)) {
                                                obj = null;
                                            }
                                            HeartRateDetect heartRateDetect4 = (HeartRateDetect) obj;
                                            Intrinsics.checkNotNull(heartRateDetect4);
                                            return Boolean.valueOf(k79Var2.c() == heartRateDetect4.getAutoSwitch().k());
                                        }
                                    });
                                    LifecycleOwner context = hCOUIMarkPreference.getContext();
                                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                                    liveDataX.observe(context, new HeartRateSettingFragment$showScreen$1$2$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$2$1$1$invoke$$inlined$checkStateBy$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((Boolean) obj);
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Boolean bool) {
                                            TwoStatePreference twoStatePreference = hCOUIMarkPreference;
                                            Intrinsics.checkNotNullExpressionValue(bool, "it");
                                            twoStatePreference.setChecked(bool.booleanValue());
                                        }
                                    }));
                                    LiveData liveDataX2 = heartRateSettingFragment3.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$2$1$1$invoke$$inlined$visibleStateBy$1
                                        @Nullable
                                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                        public final Boolean m74invoke(@Nullable Object obj) {
                                            if (!(obj instanceof HeartRateDetect)) {
                                                obj = null;
                                            }
                                            HeartRateDetect heartRateDetect4 = (HeartRateDetect) obj;
                                            Intrinsics.checkNotNull(heartRateDetect4);
                                            return Boolean.valueOf(heartRateDetect4.getAutoSwitch().j());
                                        }
                                    });
                                    LifecycleOwner context2 = hCOUIMarkPreference.getContext();
                                    Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                                    liveDataX2.observe(context2, new HeartRateSettingFragment$showScreen$1$2$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingFragment$showScreen$1$2$1$1$invoke$$inlined$visibleStateBy$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((Boolean) obj);
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Boolean bool) {
                                            Preference preference = hCOUIMarkPreference;
                                            Intrinsics.checkNotNullExpressionValue(bool, "it");
                                            preference.setVisible(bool.booleanValue());
                                        }
                                    }));
                                    HeartRateSettingFragment heartRateSettingFragment5 = heartRateSettingFragment3;
                                    heartRateSettingFragment5.g0(hCOUIMarkPreference, new AnonymousClass3(heartRateSettingFragment5, k79Var, null));
                                }
                            }, 1, (Object) null);
                        }
                    }
                }, 1, (Object) null);
            }
        }, 1, (Object) null);
    }
}