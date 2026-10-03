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
import com.heytap.sporthealth.blib.basic.ui.BasicPreferenceFragment;
import com.heytap.sporthealth.blib.helper.DialogCOUIPreference;
import com.heytap.sporthealth.blib.helper.HCOUIPreferenceCategory;
import com.heytap.sporthealth.blib.helper.HCOUISwitchLoadingPreference;
import com.heytap.sporthealth.blib.helper.PrefDsl;
import com.oplus.aiunit.model.QuietHeartRateSetting;
import com.oplus.aiunit.vision.if0;
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
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/QuietHRSettingFragment;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/QuietHRSettingViewModel;", "Landroidx/preference/PreferenceScreen;", "", "n0", "Lkotlin/Pair;", "", "q", "Lkotlin/Pair;", "LIMIT_HEIGHT", "r", "LIMIT_LOW", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class QuietHRSettingFragment extends BasicPreferenceFragment<QuietHRSettingViewModel> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Pair<Integer, Integer> LIMIT_HEIGHT;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Pair<Integer, Integer> LIMIT_LOW;

    public QuietHRSettingFragment() {
        int i;
        int i2;
        this.LIMIT_HEIGHT = TuplesKt.to(Integer.valueOf(if0.s() ? 5 : 10), 15);
        if (if0.s()) {
            i = 40;
            i2 = 90;
        } else {
            i = 40;
            i2 = 50;
        }
        this.LIMIT_LOW = TuplesKt.to(i, Integer.valueOf(i2));
    }

    public void n0(@NotNull PreferenceScreen preferenceScreen) {
        Intrinsics.checkNotNullParameter(preferenceScreen, "<this>");
        final QuietHeartRateSetting quietHeartRateSetting = (QuietHeartRateSetting) ((QuietHRSettingViewModel) c0()).T();
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$1
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
                final QuietHRSettingFragment quietHRSettingFragment = this.this$0;
                final QuietHeartRateSetting quietHeartRateSetting2 = quietHeartRateSetting;
                PrefDsl.DefaultImpls.G0(quietHRSettingFragment, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchLoadingPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$1.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$1$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$1$1$2", f = "QuietHRSettingUI.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                        final /* synthetic */ QuietHeartRateSetting $data;
                        /* synthetic */ boolean Z$0;
                        int label;
                        final /* synthetic */ QuietHRSettingFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(QuietHRSettingFragment quietHRSettingFragment, QuietHeartRateSetting quietHeartRateSetting, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.this$0 = quietHRSettingFragment;
                            this.$data = quietHeartRateSetting;
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
                                QuietHRSettingViewModel quietHRSettingViewModel = (QuietHRSettingViewModel) this.this$0.c0();
                                int type_heart_rate_high = ((QuietHRSettingViewModel) this.this$0.c0()).getTYPE_HEART_RATE_HIGH();
                                int highValue = this.$data.getHighValue();
                                this.label = 1;
                                obj = quietHRSettingViewModel.y0(type_heart_rate_high, z, highValue, this);
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
                        hCOUISwitchLoadingPreference.setTitle(R.string.settings_quite_heart_rate_warning);
                        hCOUISwitchLoadingPreference.setSummary(R.string.settings_quite_heart_rate_warning_desc);
                        hCOUISwitchLoadingPreference.setChecked(quietHeartRateSetting2.getQuietSwitch());
                        LiveData liveDataX = quietHRSettingFragment.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$1$1$invoke$$inlined$checkStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m75invoke(@Nullable Object obj) {
                                if (!(obj instanceof QuietHeartRateSetting)) {
                                    obj = null;
                                }
                                QuietHeartRateSetting quietHeartRateSetting3 = (QuietHeartRateSetting) obj;
                                Intrinsics.checkNotNull(quietHeartRateSetting3);
                                return Boolean.valueOf(quietHeartRateSetting3.getQuietSwitch());
                            }
                        });
                        LifecycleOwner context = hCOUISwitchLoadingPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new QuietHRSettingFragment$showScreen$1$1$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$1$1$invoke$$inlined$checkStateBy$2
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
                        hCOUISwitchLoadingPreference.h(new AnonymousClass2(quietHRSettingFragment, quietHeartRateSetting2, null));
                    }
                }, 3, (Object) null);
            }
        }, 1, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$2

            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/coui/appcompat/picker/COUINumberPicker;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends Lambda implements Function1<COUINumberPicker, Unit> {
                final /* synthetic */ QuietHeartRateSetting $data;
                final /* synthetic */ QuietHRSettingFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(QuietHRSettingFragment quietHRSettingFragment, QuietHeartRateSetting quietHeartRateSetting) {
                    super(1);
                    this.this$0 = quietHRSettingFragment;
                    this.$data = quietHeartRateSetting;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String invoke$lambda$0(int i) {
                    return String.valueOf(i * 10);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((COUINumberPicker) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull COUINumberPicker cOUINumberPicker) {
                    Intrinsics.checkNotNullParameter(cOUINumberPicker, "$this$valuePicker");
                    cOUINumberPicker.setMinValue(((Number) this.this$0.LIMIT_HEIGHT.getFirst()).intValue());
                    cOUINumberPicker.setMaxValue(((Number) this.this$0.LIMIT_HEIGHT.getSecond()).intValue());
                    cOUINumberPicker.setFormatter(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: INVOKE 
                          (r2v0 'cOUINumberPicker' com.coui.appcompat.picker.COUINumberPicker)
                          (wrap com.coui.appcompat.picker.COUINumberPicker$c:0x002d: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:4) call: com.heytap.health.settings.watch.sporthealthsettings2.ui.f.<init>():void type: CONSTRUCTOR)
                         VIRTUAL call: com.coui.appcompat.picker.COUINumberPicker.setFormatter(com.coui.appcompat.picker.COUINumberPicker$c):void (LINE:4) in method: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$2.1.invoke(com.coui.appcompat.picker.COUINumberPicker):void, file: D:\￩ﾡﾹ￧ﾛﾮ\oppo￩ﾀﾚ￧ﾟﾥ￨ﾽﾬ￥ﾏﾑ\analysis\health667-dex\classes18.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.heytap.health.settings.watch.sporthealthsettings2.ui.f, state: NOT_LOADED
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
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment r0 = r1.this$0
                        kotlin.Pair r0 = com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment.s0(r0)
                        java.lang.Object r0 = r0.getFirst()
                        java.lang.Number r0 = (java.lang.Number) r0
                        int r0 = r0.intValue()
                        r2.setMinValue(r0)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment r0 = r1.this$0
                        kotlin.Pair r0 = com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment.s0(r0)
                        java.lang.Object r0 = r0.getSecond()
                        java.lang.Number r0 = (java.lang.Number) r0
                        int r0 = r0.intValue()
                        r2.setMaxValue(r0)
                        com.heytap.health.settings.watch.sporthealthsettings2.ui.f r0 = new com.heytap.health.settings.watch.sporthealthsettings2.ui.f
                        r0.<init>()
                        r2.setFormatter(r0)
                        r0 = 1104150528(0x41d00000, float:26.0)
                        int r0 = com.oplus.aiunit.vision.swf.b(r0)
                        r2.setSelectedValueWidth(r0)
                        com.oplus.aiunit.vision.wbf r1 = r1.$data
                        int r1 = r1.getHighValue()
                        int r1 = r1 / 10
                        r2.setValue(r1)
                        int r1 = com.heytap.health.device_settings.impl.R.string.settings_times_per_minute
                        java.lang.String r1 = com.oplus.aiunit.vision.swf.l(r1)
                        r2.setUnitText(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$2.AnonymousClass1.invoke(com.coui.appcompat.picker.COUINumberPicker):void");
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
                QuietHRSettingFragment quietHRSettingFragment = this.this$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(quietHRSettingFragment, quietHeartRateSetting);
                final QuietHRSettingFragment quietHRSettingFragment2 = this.this$0;
                PrefDsl.DefaultImpls.Y0(quietHRSettingFragment, hCOUIPreferenceCategory, "high_heart_rate", anonymousClass1, false, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$2.2

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$2$2$a */
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
                        int i = R.string.settings_watch_quiet_rate_value_str;
                        dialogCOUIPreference.setTitle(i);
                        dialogCOUIPreference.setSummary(R.string.settings_quite_heart_rate_high_warning_desc);
                        dialogCOUIPreference.setDialogTitle(i);
                        dialogCOUIPreference.m();
                        QuietHRSettingFragment quietHRSettingFragment3 = quietHRSettingFragment2;
                        quietHRSettingFragment3.d0(((QuietHRSettingViewModel) quietHRSettingFragment3.c0()).x(new Function1<QuietHeartRateSetting, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment.showScreen.2.2.1
                            @Nullable
                            public final Integer invoke(@NotNull QuietHeartRateSetting quietHeartRateSetting2) {
                                Intrinsics.checkNotNullParameter(quietHeartRateSetting2, "$this$changeBy");
                                return Integer.valueOf(quietHeartRateSetting2.getHighValue());
                            }
                        }), new a(dialogCOUIPreference));
                        LiveData liveDataX = quietHRSettingFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$2$2$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m77invoke(@Nullable Object obj) {
                                if (!(obj instanceof QuietHeartRateSetting)) {
                                    obj = null;
                                }
                                QuietHeartRateSetting quietHeartRateSetting2 = (QuietHeartRateSetting) obj;
                                Intrinsics.checkNotNull(quietHeartRateSetting2);
                                return Boolean.valueOf(quietHeartRateSetting2.getQuietSwitch());
                            }
                        });
                        LifecycleOwner context = dialogCOUIPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new QuietHRSettingFragment$showScreen$2$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$2$2$invoke$$inlined$visibleStateBy$2
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
                        final QuietHRSettingFragment quietHRSettingFragment4 = quietHRSettingFragment2;
                        quietHRSettingFragment4.e0(dialogCOUIPreference, new Function1<Object, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment.showScreen.2.2.4

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$2$2$4$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$2$2$4$1", f = "QuietHRSettingUI.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Object $it;
                                int label;
                                final /* synthetic */ QuietHRSettingFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(QuietHRSettingFragment quietHRSettingFragment, Object obj, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = quietHRSettingFragment;
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
                                        QuietHRSettingViewModel quietHRSettingViewModel = (QuietHRSettingViewModel) this.this$0.c0();
                                        int type_heart_rate_high = ((QuietHRSettingViewModel) this.this$0.c0()).getTYPE_HEART_RATE_HIGH();
                                        int i2 = Integer.parseInt(this.$it.toString()) * 10;
                                        this.label = 1;
                                        if (quietHRSettingViewModel.y0(type_heart_rate_high, true, i2, this) == coroutine_suspended) {
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
                                m76invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m76invoke(@NotNull Object obj) {
                                Intrinsics.checkNotNullParameter(obj, "it");
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(quietHRSettingFragment4), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(quietHRSettingFragment4, obj, null), 3, (Object) null);
                            }
                        });
                    }
                }, 4, (Object) null);
            }
        }, 1, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$3
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
                final QuietHRSettingFragment quietHRSettingFragment = this.this$0;
                final QuietHeartRateSetting quietHeartRateSetting2 = quietHeartRateSetting;
                Function1<COUINumberPicker, Unit> function1 = new Function1<COUINumberPicker, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$3.1
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
                        cOUINumberPicker.setMinValue(((Number) quietHRSettingFragment.LIMIT_LOW.getFirst()).intValue());
                        cOUINumberPicker.setMaxValue(((Number) quietHRSettingFragment.LIMIT_LOW.getSecond()).intValue());
                        cOUINumberPicker.setValue(quietHeartRateSetting2.getLowValue());
                        cOUINumberPicker.setUnitText(swf.l(R.string.settings_times_per_minute));
                    }
                };
                final QuietHRSettingFragment quietHRSettingFragment2 = this.this$0;
                PrefDsl.DefaultImpls.Y0(quietHRSettingFragment, hCOUIPreferenceCategory, "low_heart_rate", function1, false, new Function1<DialogCOUIPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$3.2

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$3$2$a */
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
                        int i = R.string.settings_watch_quiet_rate_low_value_str;
                        dialogCOUIPreference.setTitle(i);
                        dialogCOUIPreference.setSummary(R.string.settings_watch_quiet_rate_low_value_desc);
                        dialogCOUIPreference.setDialogTitle(i);
                        QuietHRSettingFragment quietHRSettingFragment3 = quietHRSettingFragment2;
                        quietHRSettingFragment3.d0(((QuietHRSettingViewModel) quietHRSettingFragment3.c0()).x(new Function1<QuietHeartRateSetting, Integer>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment.showScreen.3.2.1
                            @Nullable
                            public final Integer invoke(@NotNull QuietHeartRateSetting quietHeartRateSetting3) {
                                Intrinsics.checkNotNullParameter(quietHeartRateSetting3, "$this$changeBy");
                                return Integer.valueOf(quietHeartRateSetting3.getLowValue());
                            }
                        }), new a(dialogCOUIPreference));
                        LiveData liveDataX = quietHRSettingFragment2.c0().x(new Function1<Object, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$3$2$invoke$$inlined$visibleStateBy$1
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final Boolean m79invoke(@Nullable Object obj) {
                                if (!(obj instanceof QuietHeartRateSetting)) {
                                    obj = null;
                                }
                                QuietHeartRateSetting quietHeartRateSetting3 = (QuietHeartRateSetting) obj;
                                Intrinsics.checkNotNull(quietHeartRateSetting3);
                                return Boolean.valueOf(quietHeartRateSetting3.getQuietSwitch());
                            }
                        });
                        LifecycleOwner context = dialogCOUIPreference.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        liveDataX.observe(context, new QuietHRSettingFragment$showScreen$3$2$inlined$sam$i$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$3$2$invoke$$inlined$visibleStateBy$2
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
                        final QuietHRSettingFragment quietHRSettingFragment4 = quietHRSettingFragment2;
                        quietHRSettingFragment4.e0(dialogCOUIPreference, new Function1<Object, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment.showScreen.3.2.4

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$3$2$4$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.QuietHRSettingFragment$showScreen$3$2$4$1", f = "QuietHRSettingUI.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Object $it;
                                int label;
                                final /* synthetic */ QuietHRSettingFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(QuietHRSettingFragment quietHRSettingFragment, Object obj, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = quietHRSettingFragment;
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
                                        QuietHRSettingViewModel quietHRSettingViewModel = (QuietHRSettingViewModel) this.this$0.c0();
                                        int type_heart_rate_low = ((QuietHRSettingViewModel) this.this$0.c0()).getTYPE_HEART_RATE_LOW();
                                        int i2 = Integer.parseInt(this.$it.toString());
                                        this.label = 1;
                                        if (quietHRSettingViewModel.y0(type_heart_rate_low, true, i2, this) == coroutine_suspended) {
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
                                m78invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m78invoke(@NotNull Object obj) {
                                Intrinsics.checkNotNullParameter(obj, "it");
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(quietHRSettingFragment4), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(quietHRSettingFragment4, obj, null), 3, (Object) null);
                            }
                        });
                    }
                }, 4, (Object) null);
            }
        }, 1, (Object) null);
    }
}