package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.coui.appcompat.preference.COUIPagerFooterPreference;
import com.coui.appcompat.preference.COUISwitchLoadingPreference;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.settings.watch.sporthealthsettings.bean.z;
import com.heytap.health.ui.R$layout;
import com.heytap.sporthealth.blib.basic.ui.BasicPreferenceFragment;
import com.heytap.sporthealth.blib.helper.HCOUIListPreference;
import com.heytap.sporthealth.blib.helper.HCOUIPreferenceCategory;
import com.heytap.sporthealth.blib.helper.HCOUISwitchLoadingPreference;
import com.heytap.sporthealth.blib.helper.PrefDsl;
import com.heytap.sporthealth.blib.helper.ViewDsl;
import com.oplus.aiunit.model.Spo2DailyMonitorUiState;
import com.oplus.aiunit.model.wbg;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.swf;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/Spo2DailyMonitorFragment;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/Spo2DailyMonitorViewModel;", "Landroidx/preference/PreferenceScreen;", "", "n0", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class Spo2DailyMonitorFragment extends BasicPreferenceFragment<Spo2DailyMonitorViewModel> {
    public static final int $stable = 0;

    public void n0(@NotNull final PreferenceScreen preferenceScreen) {
        Intrinsics.checkNotNullParameter(preferenceScreen, "<this>");
        final z spo2 = ((Spo2DailyMonitorUiState) ((Spo2DailyMonitorViewModel) c0()).T()).getSpo2();
        int i = R$layout.lib_ui_layout_linearlayout_preference;
        PrefDsl.DefaultImpls.V(this, preferenceScreen, i, false, false, new Function1<LinearLayout, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LinearLayout) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LinearLayout linearLayout) {
                Intrinsics.checkNotNullParameter(linearLayout, "$this$layoutDsl");
                linearLayout.setClickable(false);
                final Spo2DailyMonitorFragment spo2DailyMonitorFragment = this.this$0;
                spo2DailyMonitorFragment.icon(linearLayout, new Function1<ImageView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$1.1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((ImageView) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull ImageView imageView) {
                        Intrinsics.checkNotNullParameter(imageView, "$this$icon");
                        imageView.setImageResource(R.drawable.settings_device_spo2_monitor);
                        ViewDsl.DefaultImpls.U(spo2DailyMonitorFragment, imageView, -1, swf.b(256.0f), (Function1) null, 4, (Object) null);
                    }
                });
            }
        }, 6, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2
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
                final Spo2DailyMonitorFragment spo2DailyMonitorFragment = this.this$0;
                PrefDsl.DefaultImpls.G0(spo2DailyMonitorFragment, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$1$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$1$3", f = "Spo2DailyMonitorUI.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ Spo2DailyMonitorFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(Spo2DailyMonitorFragment spo2DailyMonitorFragment, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.this$0 = spo2DailyMonitorFragment;
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
                                wbg.Companion.h0(!z ? 1 : 0);
                                Spo2DailyMonitorViewModel spo2DailyMonitorViewModel = (Spo2DailyMonitorViewModel) this.this$0.c0();
                                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                                this.label = 1;
                                obj = spo2DailyMonitorViewModel.z0(fragmentActivityRequireActivity, z, this);
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
                        hCOUISwitchLoadingPreference.setTitle(R.string.band_blood_oxygen_monitor);
                        hCOUISwitchLoadingPreference.setSummary(R.string.band_blood_oxygen_monitor_desc);
                        LiveData liveDataX = spo2DailyMonitorFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$1$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m155invoke(@Nullable Object obj) {
                                if (!(obj instanceof Spo2DailyMonitorUiState)) {
                                    obj = null;
                                }
                                Spo2DailyMonitorUiState spo2DailyMonitorUiState = (Spo2DailyMonitorUiState) obj;
                                Intrinsics.checkNotNull(spo2DailyMonitorUiState);
                                return Boolean.valueOf(spo2DailyMonitorUiState.getSpo2().getSpo2AllDayMonitorEnable());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new Spo2DailyMonitorFragment$showScreen$2$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$1$invoke$$inlined$checkStateBy$2
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
                        final Spo2DailyMonitorFragment spo2DailyMonitorFragment2 = spo2DailyMonitorFragment;
                        LiveData liveDataX2 = spo2DailyMonitorFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$1$invoke$$inlined$enableStateBy$1
                            {
                                super(1);
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m156invoke(@Nullable Object obj) {
                                if (!(obj instanceof Spo2DailyMonitorUiState)) {
                                    obj = null;
                                }
                                Spo2DailyMonitorUiState spo2DailyMonitorUiState = (Spo2DailyMonitorUiState) obj;
                                Intrinsics.checkNotNull(spo2DailyMonitorUiState);
                                return ((Spo2DailyMonitorViewModel) spo2DailyMonitorFragment2.c0()).m0() ? Boolean.TRUE : Boolean.valueOf(spo2DailyMonitorUiState.getAppInstallBean().g());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new Spo2DailyMonitorFragment$showScreen$2$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$1$invoke$$inlined$enableStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(spo2DailyMonitorFragment, null));
                    }
                }, 3, (Object) null);
                final Spo2DailyMonitorFragment spo2DailyMonitorFragment2 = this.this$0;
                final z zVar = spo2;
                PrefDsl.DefaultImpls.G0(spo2DailyMonitorFragment2, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2.2

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$2$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$2$3", f = "Spo2DailyMonitorUI.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        final /* synthetic */ z $data;
                        final /* synthetic */ HCOUISwitchLoadingPreference $this_switchLoading;
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ Spo2DailyMonitorFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(HCOUISwitchLoadingPreference hCOUISwitchLoadingPreference, Spo2DailyMonitorFragment spo2DailyMonitorFragment, z zVar, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.$this_switchLoading = hCOUISwitchLoadingPreference;
                            this.this$0 = spo2DailyMonitorFragment;
                            this.$data = zVar;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_switchLoading, this.this$0, this.$data, continuation);
                            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                            return anonymousClass3;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                        }

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                boolean z = this.Z$0;
                                wbg.Companion.h0(this.$this_switchLoading.isChecked() ? 1 : 0);
                                Spo2DailyMonitorViewModel spo2DailyMonitorViewModel = (Spo2DailyMonitorViewModel) this.this$0.c0();
                                int lowSpo2WarningValue = this.$data.getLowSpo2WarningValue();
                                this.label = 1;
                                obj = spo2DailyMonitorViewModel.y0(z, lowSpo2WarningValue, this);
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
                        hCOUISwitchLoadingPreference.setTitle(R.string.band_low_blood_oxygen_warning_title);
                        hCOUISwitchLoadingPreference.setSummary(R.string.band_low_blood_oxygen_warning_desc);
                        LiveData liveDataX = spo2DailyMonitorFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$2$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m158invoke(@Nullable Object obj) {
                                if (!(obj instanceof Spo2DailyMonitorUiState)) {
                                    obj = null;
                                }
                                Spo2DailyMonitorUiState spo2DailyMonitorUiState = (Spo2DailyMonitorUiState) obj;
                                Intrinsics.checkNotNull(spo2DailyMonitorUiState);
                                return Boolean.valueOf(spo2DailyMonitorUiState.getSpo2().getSpo2AllDayMonitorEnable() && spo2DailyMonitorUiState.getAppInstallBean().g());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new Spo2DailyMonitorFragment$showScreen$2$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$2$invoke$$inlined$enableStateBy$2
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
                        LiveData liveDataX2 = spo2DailyMonitorFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$2$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m157invoke(@Nullable Object obj) {
                                if (!(obj instanceof Spo2DailyMonitorUiState)) {
                                    obj = null;
                                }
                                Spo2DailyMonitorUiState spo2DailyMonitorUiState = (Spo2DailyMonitorUiState) obj;
                                Intrinsics.checkNotNull(spo2DailyMonitorUiState);
                                return Boolean.valueOf(spo2DailyMonitorUiState.getSpo2().getLowSpo2WarningEnable());
                            }
                        });
                        LifecycleOwner context2 = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX2.observe(context2, new Spo2DailyMonitorFragment$showScreen$2$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$2$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new AnonymousClass3(hCOUISwitchLoadingPreference, spo2DailyMonitorFragment2, zVar, null));
                    }
                }, 3, (Object) null);
                final Spo2DailyMonitorFragment spo2DailyMonitorFragment3 = this.this$0;
                PrefDsl.DefaultImpls.B0(spo2DailyMonitorFragment3, hCOUIPreferenceCategory, "low_warning", false, new Function1<HCOUIListPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2.3

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$3$a */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class a implements Observer<Integer> {
                        public final /* synthetic */ HCOUIListPreference i;

                        public a(HCOUIListPreference hCOUIListPreference) {
                            this.i = hCOUIListPreference;
                        }

                        public final void a(int i) {
                            this.i.setValue(String.valueOf(i));
                        }

                        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                            a(((Number) obj).intValue());
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUIListPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final HCOUIListPreference hCOUIListPreference) {
                        Intrinsics.checkNotNullParameter(hCOUIListPreference, "$this$singleSelect");
                        hCOUIListPreference.setDialogTitle(R.string.settings_spo2_watch_step_goal);
                        hCOUIListPreference.setDialogMessage(R.string.settings_spo2_low_warning_tip3);
                        hCOUIListPreference.l(false);
                        hCOUIListPreference.setEntries(new String[]{"80%", "85%", "90%"});
                        hCOUIListPreference.setEntryValues(new String[]{"80", "85", "90"});
                        hCOUIListPreference.setTitle(R.string.band_low_blood_oxygen_warning_value);
                        LiveData liveDataX = spo2DailyMonitorFragment3.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$3$invoke$$inlined$enableStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m160invoke(@Nullable Object obj) {
                                if (!(obj instanceof Spo2DailyMonitorUiState)) {
                                    obj = null;
                                }
                                Spo2DailyMonitorUiState spo2DailyMonitorUiState = (Spo2DailyMonitorUiState) obj;
                                Intrinsics.checkNotNull(spo2DailyMonitorUiState);
                                return Boolean.valueOf(spo2DailyMonitorUiState.getSpo2().getSpo2AllDayMonitorEnable() && spo2DailyMonitorUiState.getSpo2().getLowSpo2WarningEnable() && spo2DailyMonitorUiState.getAppInstallBean().g());
                            }
                        });
                        LifecycleOwner context = hCOUIListPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new Spo2DailyMonitorFragment$showScreen$2$3$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$3$invoke$$inlined$enableStateBy$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Boolean) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Boolean bool) {
                                Preference preference = hCOUIListPreference;
                                Intrinsics.checkNotNullExpressionValue(bool, "it");
                                preference.setEnabled(bool.booleanValue());
                            }
                        }));
                        Spo2DailyMonitorFragment spo2DailyMonitorFragment4 = spo2DailyMonitorFragment3;
                        spo2DailyMonitorFragment4.d0(((Spo2DailyMonitorViewModel) spo2DailyMonitorFragment4.c0()).x(new Function1<Spo2DailyMonitorUiState, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment.showScreen.2.3.2
                            @Nullable
                            public final Integer invoke(@NotNull Spo2DailyMonitorUiState spo2DailyMonitorUiState) {
                                Intrinsics.checkNotNullParameter(spo2DailyMonitorUiState, "$this$changeBy");
                                return Integer.valueOf(spo2DailyMonitorUiState.getSpo2().getLowSpo2WarningValue());
                            }
                        }), new a(hCOUIListPreference));
                        hCOUIListPreference.setSummary("%s");
                        final Spo2DailyMonitorFragment spo2DailyMonitorFragment5 = spo2DailyMonitorFragment3;
                        spo2DailyMonitorFragment5.e0(hCOUIListPreference, new Function1<Object, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment.showScreen.2.3.4

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$3$4$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$3$4$1", f = "Spo2DailyMonitorUI.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Object $it;
                                final /* synthetic */ HCOUIListPreference $this_singleSelect;
                                int label;
                                final /* synthetic */ Spo2DailyMonitorFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(HCOUIListPreference hCOUIListPreference, Object obj, Spo2DailyMonitorFragment spo2DailyMonitorFragment, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$this_singleSelect = hCOUIListPreference;
                                    this.$it = obj;
                                    this.this$0 = spo2DailyMonitorFragment;
                                }

                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$this_singleSelect, this.$it, this.this$0, continuation);
                                }

                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.$this_singleSelect.setEnabled(false);
                                        int i2 = Integer.parseInt(this.$it.toString());
                                        wbg.Companion.i0(i2);
                                        Spo2DailyMonitorViewModel spo2DailyMonitorViewModel = (Spo2DailyMonitorViewModel) this.this$0.c0();
                                        this.label = 1;
                                        obj = spo2DailyMonitorViewModel.y0(true, i2, this);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.$this_singleSelect.setValue(String.valueOf(((Spo2DailyMonitorUiState) ((Spo2DailyMonitorViewModel) this.this$0.c0()).T()).getSpo2().getLowSpo2WarningValue()));
                                    }
                                    this.$this_singleSelect.setEnabled(true);
                                    return Unit.INSTANCE;
                                }

                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m159invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m159invoke(@NotNull Object obj) {
                                Intrinsics.checkNotNullParameter(obj, "it");
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(spo2DailyMonitorFragment5), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(hCOUIListPreference, obj, spo2DailyMonitorFragment5, null), 3, (Object) null);
                            }
                        });
                    }
                }, 2, (Object) null);
                Spo2DailyMonitorFragment spo2DailyMonitorFragment4 = this.this$0;
                PreferenceScreen preferenceScreen2 = preferenceScreen;
                String strL = ((Spo2DailyMonitorViewModel) spo2DailyMonitorFragment4.c0()).m0() ? swf.l(R.string.device_settings_spo2_uninstall_desc_v3) : swf.l(R.string.device_settings_spo2_uninstall_desc_v2);
                final Spo2DailyMonitorFragment spo2DailyMonitorFragment5 = this.this$0;
                spo2DailyMonitorFragment4.b0(preferenceScreen2, strL, new Function1<COUIPagerFooterPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2.4
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((COUIPagerFooterPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull final COUIPagerFooterPreference cOUIPagerFooterPreference) {
                        Intrinsics.checkNotNullParameter(cOUIPagerFooterPreference, "$this$footerPreference");
                        LiveData liveDataX = spo2DailyMonitorFragment5.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$4$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m161invoke(@Nullable Object obj) {
                                if (!(obj instanceof Spo2DailyMonitorUiState)) {
                                    obj = null;
                                }
                                Spo2DailyMonitorUiState spo2DailyMonitorUiState = (Spo2DailyMonitorUiState) obj;
                                Intrinsics.checkNotNull(spo2DailyMonitorUiState);
                                return Boolean.valueOf(!spo2DailyMonitorUiState.getAppInstallBean().g());
                            }
                        });
                        LifecycleOwner context = cOUIPagerFooterPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new Spo2DailyMonitorFragment$showScreen$2$4$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$2$4$invoke$$inlined$visibleStateBy$2
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
        PrefDsl.DefaultImpls.V(this, preferenceScreen, i, false, false, new Function1<LinearLayout, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3

            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3$6, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass6 extends Lambda implements Function1<TextView, Unit> {
                final /* synthetic */ Spo2DailyMonitorFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(Spo2DailyMonitorFragment spo2DailyMonitorFragment) {
                    super(1);
                    this.this$0 = spo2DailyMonitorFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$0(View view) {
                    wbg.Companion.g0();
                    e1.d().b("/bloodoxygen/BloodOxygenDescriptionActivity").navigation();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((TextView) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull TextView textView) {
                    Intrinsics.checkNotNullParameter(textView, "$this$textView");
                    this.this$0.preferenceSummaryStyle(textView, Float.valueOf(12.0f));
                    ViewDsl.DefaultImpls.U(this.this$0, textView, 0, 0, new Function1<LinearLayout.LayoutParams, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment.showScreen.3.6.1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LinearLayout.LayoutParams) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LinearLayout.LayoutParams layoutParams) {
                            Intrinsics.checkNotNullParameter(layoutParams, "$this$linearParam");
                            layoutParams.topMargin = swf.b(6.0f);
                        }
                    }, 3, (Object) null);
                    Spo2DailyMonitorFragment spo2DailyMonitorFragment = this.this$0;
                    Context context = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    textView.setTextColor(spo2DailyMonitorFragment.themeColor(context));
                    textView.setText(R.string.band_understand_more_tips);
                    textView.setOnClickListener(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0038: INVOKE 
                          (r10v0 'textView' android.widget.TextView)
                          (wrap android.view.View$OnClickListener:0x0035: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:6) call: com.heytap.health.settings.watch.sporthealthsettings2.ui.n.<init>():void type: CONSTRUCTOR)
                         VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void A[MD:(android.view.View$OnClickListener):void (c)] (LINE:6) in method: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.6.invoke(android.widget.TextView):void, file: D:\￩ﾡﾹ￧ﾛﾮ\oppo￩ﾀﾚ￧ﾟﾥ￨ﾽﾬ￥ﾏﾑ\analysis\health667-dex\classes18.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.heytap.health.settings.watch.sporthealthsettings2.ui.n, state: NOT_LOADED
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
                        java.lang.String r0 = "$this$textView"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment r0 = r9.this$0
                        r1 = 1094713344(0x41400000, float:12.0)
                        java.lang.Float r1 = java.lang.Float.valueOf(r1)
                        r0.preferenceSummaryStyle(r10, r1)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment r2 = r9.this$0
                        r4 = 0
                        r5 = 0
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3$6$1 r6 = new kotlin.jvm.functions.Function1<android.widget.LinearLayout.LayoutParams, kotlin.Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment.showScreen.3.6.1
                            static {
                                /*
                                    com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3$6$1 r0 = new com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3$6$1
                                    r0.<init>()
                                    
                                    // error: 0x0005: SPUT (r0 I:com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3$6$1) com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment.showScreen.3.6.1.INSTANCE com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3$6$1
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.AnonymousClass6.AnonymousClass1.<clinit>():void");
                            }

                            {
                                /*
                                    r1 = this;
                                    r0 = 1
                                    r1.<init>(r0)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.AnonymousClass6.AnonymousClass1.<init>():void");
                            }

                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                                /*
                                    r0 = this;
                                    android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
                                    r0.invoke(r1)
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.AnonymousClass6.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                            }

                            public final void invoke(@org.jetbrains.annotations.NotNull android.widget.LinearLayout.LayoutParams r1) {
                                /*
                                    r0 = this;
                                    java.lang.String r0 = "$this$linearParam"
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                                    r0 = 1086324736(0x40c00000, float:6.0)
                                    int r0 = com.oplus.aiunit.vision.swf.b(r0)
                                    r1.topMargin = r0
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.AnonymousClass6.AnonymousClass1.invoke(android.widget.LinearLayout$LayoutParams):void");
                            }
                        }
                        r7 = 3
                        r8 = 0
                        r3 = r10
                        com.heytap.sporthealth.blib.helper.ViewDsl.DefaultImpls.U(r2, r3, r4, r5, r6, r7, r8)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment r9 = r9.this$0
                        android.content.Context r0 = r10.getContext()
                        java.lang.String r1 = "context"
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                        int r9 = r9.themeColor(r0)
                        r10.setTextColor(r9)
                        int r9 = com.heytap.health.device_settings.impl.R.string.band_understand_more_tips
                        r10.setText(r9)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.n r9 = new com.heytap.health.settings.watch.sporthealthsettings2.ui.n
                        r9.<init>()
                        r10.setOnClickListener(r9)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.AnonymousClass6.invoke(android.widget.TextView):void");
                }
            }

            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LinearLayout) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LinearLayout linearLayout) {
                Intrinsics.checkNotNullParameter(linearLayout, "$this$layoutDsl");
                ViewDsl.DefaultImpls.h0(this.this$0, linearLayout, swf.b(32.0f), 0, 2, (Object) null);
                final Spo2DailyMonitorFragment spo2DailyMonitorFragment = this.this$0;
                spo2DailyMonitorFragment.textView(linearLayout, new Function1<TextView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TextView) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TextView textView) {
                        Intrinsics.checkNotNullParameter(textView, "$this$textView");
                        spo2DailyMonitorFragment.preferenceTitleStyle(textView, Float.valueOf(12.0f));
                        ViewDsl.DefaultImpls.U(spo2DailyMonitorFragment, textView, 0, 0, new Function1<LinearLayout.LayoutParams, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment.showScreen.3.1.1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((LinearLayout.LayoutParams) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LinearLayout.LayoutParams layoutParams) {
                                Intrinsics.checkNotNullParameter(layoutParams, "$this$linearParam");
                                layoutParams.topMargin = swf.b(26.0f);
                                layoutParams.bottomMargin = swf.b(4.0f);
                            }
                        }, 3, (Object) null);
                        textView.setText(R.string.band_to_understanding_blood_oxygen);
                    }
                });
                final Spo2DailyMonitorFragment spo2DailyMonitorFragment2 = this.this$0;
                spo2DailyMonitorFragment2.textView(linearLayout, new Function1<TextView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.2
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TextView) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TextView textView) {
                        Intrinsics.checkNotNullParameter(textView, "$this$textView");
                        spo2DailyMonitorFragment2.preferenceSummaryStyle(textView, Float.valueOf(12.0f));
                        textView.setText(R.string.band_to_understanding_blood_oxygen_tip1);
                    }
                });
                final Spo2DailyMonitorFragment spo2DailyMonitorFragment3 = this.this$0;
                spo2DailyMonitorFragment3.textView(linearLayout, new Function1<TextView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.3
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TextView) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TextView textView) {
                        Intrinsics.checkNotNullParameter(textView, "$this$textView");
                        spo2DailyMonitorFragment3.preferenceTitleStyle(textView, Float.valueOf(12.0f));
                        ViewDsl.DefaultImpls.U(spo2DailyMonitorFragment3, textView, 0, 0, new Function1<LinearLayout.LayoutParams, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment.showScreen.3.3.1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((LinearLayout.LayoutParams) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LinearLayout.LayoutParams layoutParams) {
                                Intrinsics.checkNotNullParameter(layoutParams, "$this$linearParam");
                                layoutParams.topMargin = swf.b(26.0f);
                                layoutParams.bottomMargin = swf.b(4.0f);
                            }
                        }, 3, (Object) null);
                        textView.setText(R.string.band_to_spo2_measure_title);
                    }
                });
                final Spo2DailyMonitorFragment spo2DailyMonitorFragment4 = this.this$0;
                spo2DailyMonitorFragment4.textView(linearLayout, new Function1<TextView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.4
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TextView) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TextView textView) {
                        Intrinsics.checkNotNullParameter(textView, "$this$textView");
                        spo2DailyMonitorFragment4.preferenceSummaryStyle(textView, Float.valueOf(12.0f));
                        textView.setText(R.string.band_to_understanding_blood_oxygen_tip2);
                    }
                });
                final Spo2DailyMonitorFragment spo2DailyMonitorFragment5 = this.this$0;
                spo2DailyMonitorFragment5.textView(linearLayout, new Function1<TextView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.Spo2DailyMonitorFragment$showScreen$3.5
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TextView) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TextView textView) {
                        Intrinsics.checkNotNullParameter(textView, "$this$textView");
                        spo2DailyMonitorFragment5.preferenceSummaryStyle(textView, Float.valueOf(12.0f));
                        textView.setText(R.string.band_to_understanding_blood_oxygen_tip3);
                    }
                });
                Spo2DailyMonitorFragment spo2DailyMonitorFragment6 = this.this$0;
                spo2DailyMonitorFragment6.textView(linearLayout, new AnonymousClass6(spo2DailyMonitorFragment6));
            }
        }, 6, (Object) null);
    }
}