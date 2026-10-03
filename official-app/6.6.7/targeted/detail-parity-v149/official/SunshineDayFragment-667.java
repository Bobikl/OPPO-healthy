package com.heytap.health.sunshine.ui.detail;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.heytap.databaseengine.model.sunshine.SunshineStat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.healthbase.view.CommonCalendarFragment;
import com.heytap.health.sunshine.R$id;
import com.heytap.health.sunshine.R$layout;
import com.heytap.health.sunshine.ui.compose.DayDetailKt;
import com.heytap.health.sunshine.util.CalendarAchievementCounter;
import com.heytap.health.sunshine.viewmodel.SunshineStatChartVM;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.compose.composable.DatePickerKt;
import com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt;
import com.heytap.sporthealth.blib.compose.modifier.OverScrollModifierKt;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.ir9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.swf;
import com.oplus.aiunit.vision.zs9;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\u000f\u0010\r\u001a\u00020\bH\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001e\u0010 \u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u001d\u0010+\u001a\u0004\u0018\u00010&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/heytap/health/sunshine/ui/detail/SunshineDayFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "Lcom/oplus/aiunit/vision/ir9;", "Lcom/oplus/aiunit/vision/zs9;", "", "getLayoutId", "Landroid/view/View;", "view", "", "initView", "initData", "s0", "t0", "c0", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/heytap/health/sunshine/viewmodel/SunshineStatChartVM;", "o", "Lcom/heytap/health/sunshine/viewmodel/SunshineStatChartVM;", "mStatViewModel", "Landroidx/compose/runtime/MutableState;", "", LogFieldKey.PROCESS_NAME_KEY, "Landroidx/compose/runtime/MutableState;", "mDateTitle", "Lkotlin/Pair;", "", "q", "mDateStepPair", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "r", "Ljava/time/LocalDate;", "mLocalDate", "s", "mCurrentPageIndex", "Lcom/heytap/databaseengine/model/sunshine/SunshineStat;", "t", "mCurrentStat", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "u", "Lkotlin/Lazy;", "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "", "v", "q0", "()J", "locationTime", "<init>", "()V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSunshineDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunshineDayFragment.kt\ncom/heytap/health/sunshine/ui/detail/SunshineDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,282:1\n1179#2,2:283\n1253#2,4:285\n154#3:289\n*S KotlinDebug\n*F\n+ 1 SunshineDayFragment.kt\ncom/heytap/health/sunshine/ui/detail/SunshineDayFragment\n*L\n188#1:283,2\n188#1:285,4\n264#1:289\n*E\n"})
public final class SunshineDayFragment extends BaseFragment implements ir9, zs9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public SunshineStatChartVM mStatViewModel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final MutableState<String> mDateTitle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final MutableState<Pair<Boolean, Boolean>> mDateStepPair;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public LocalDate mLocalDate;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final MutableState<Integer> mCurrentPageIndex;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final MutableState<SunshineStat> mCurrentStat;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Lazy locationTime;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    public SunshineDayFragment() {
        Boolean bool = Boolean.TRUE;
        this.mDateStepPair = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(bool, bool), null, 2, null);
        this.mLocalDate = LocalDate.now();
        this.mCurrentPageIndex = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.mCurrentStat = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SunshineStat(null, null, null, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 8191, null), null, 2, null);
        this.lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$lazyGetFamilyConfig$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final FamilyMoreDataDetailConfigBean invoke() {
                Bundle arguments = this.this$0.getArguments();
                if (arguments != null) {
                    return (FamilyMoreDataDetailConfigBean) BundleCompat.getSerializable(arguments, "ARGUMENT_MORE_DATA_DETAIL", FamilyMoreDataDetailConfigBean.class);
                }
                return null;
            }
        });
        this.locationTime = LazyKt__LazyJVMKt.lazy(new Function0<Long>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$locationTime$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                Bundle arguments = this.this$0.getArguments();
                return Long.valueOf(arguments != null ? this.this$0.r0(arguments) : 0L);
            }
        });
    }

    @Override // com.oplus.aiunit.vision.ir9
    @Nullable
    public FamilyMoreDataDetailConfigBean R6() {
        return (FamilyMoreDataDetailConfigBean) this.lazyGetFamilyConfig.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void c0(Composer composer, final int i) {
        int iMax;
        Composer composerStartRestartGroup = composer.startRestartGroup(-798334992);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-798334992, i, -1, "com.heytap.health.sunshine.ui.detail.SunshineDayFragment.SunshineHorizontalPager (SunshineDayFragment.kt:214)");
        }
        SunshineStatChartVM sunshineStatChartVM = this.mStatViewModel;
        if (sunshineStatChartVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatViewModel");
            sunshineStatChartVM = null;
        }
        final List list = (List) LiveDataAdapterKt.observeAsState(sunshineStatChartVM.F(), composerStartRestartGroup, 8).getValue();
        if (list == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$SunshineHorizontalPager$stats$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    this.$tmp0_rcvr.c0(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
            return;
        }
        LocalDate localDateNow = LocalDate.now();
        if (list.isEmpty()) {
            iMax = 1;
        } else {
            iMax = Math.max(((int) ChronoUnit.DAYS.between(h15.D(o15.a(((SunshineStat) CollectionsKt___CollectionsKt.first(list)).getDate())), (LocalDate) ComparisonsKt___ComparisonsJvmKt.maxOf(h15.D(o15.a(((SunshineStat) CollectionsKt___CollectionsKt.last(list)).getDate())), localDateNow))) + 1, 1);
        }
        PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(this.mCurrentPageIndex.getValue().intValue(), 0.0f, composerStartRestartGroup, 0, 2);
        EffectsKt.LaunchedEffect(this.mCurrentPageIndex.getValue(), new SunshineDayFragment$SunshineHorizontalPager$1(pagerStateRememberPagerState, this, null), composerStartRestartGroup, 64);
        EffectsKt.LaunchedEffect(Integer.valueOf(pagerStateRememberPagerState.getCurrentPage()), new SunshineDayFragment$SunshineHorizontalPager$2(list, this, pagerStateRememberPagerState, iMax, null), composerStartRestartGroup, 64);
        PagerKt.m668HorizontalPagerAlbwjTQ(iMax, BackgroundKt.m163backgroundbw27NRU$default(SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(266)), ColorResources_androidKt.colorResource(R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), pagerStateRememberPagerState, null, null, 0, 0.0f, null, null, false, false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -104722705, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$SunshineHorizontalPager$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer2, Integer num2) {
                invoke(num.intValue(), composer2, num2.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(int i2, @Nullable Composer composer2, int i3) {
                int i4;
                if ((i3 & 14) == 0) {
                    i4 = (composer2.changed(i2) ? 4 : 2) | i3;
                } else {
                    i4 = i3;
                }
                if ((i4 & 91) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-104722705, i3, -1, "com.heytap.health.sunshine.ui.detail.SunshineDayFragment.SunshineHorizontalPager.<anonymous> (SunshineDayFragment.kt:265)");
                }
                SunshineStat sunshineStat = (SunshineStat) CollectionsKt___CollectionsKt.getOrNull(list, i2);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer2);
                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                composer2.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                DayDetailKt.f(sunshineStat != null ? sunshineStat.getTotalDuration() : 0, sunshineStat != null ? sunshineStat.getTargetDuration() : 0, sunshineStat != null && StringsKt__StringsKt.contains$default((CharSequence) sunshineStat.getDataClient(), (CharSequence) ":", false, 2, (Object) null), composer2, 0, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 0, 3072, 8184);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$SunshineHorizontalPager$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                this.$tmp2_rcvr.c0(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_sunshine_day_fragment;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        SunshineStatChartVM sunshineStatChartVM = (SunshineStatChartVM) new ViewModelProvider(fragmentActivityRequireActivity).get(SunshineStatChartVM.class);
        this.mStatViewModel = sunshineStatChartVM;
        if (sunshineStatChartVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatViewModel");
            sunshineStatChartVM = null;
        }
        sunshineStatChartVM.H(p0());
        s0();
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        LinearLayout linearLayout = (LinearLayout) W(R$id.fl_day_data_container);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1086789748, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$initView$1$1
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1086789748, i, -1, "com.heytap.health.sunshine.ui.detail.SunshineDayFragment.initView.<anonymous>.<anonymous> (SunshineDayFragment.kt:93)");
                }
                final SunshineDayFragment sunshineDayFragment = this.this$0;
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer);
                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                composer.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierB = AutoClipContentModifierKt.b(BackgroundKt.m163backgroundbw27NRU$default(companion, ColorResources_androidKt.colorResource(R$color.lib_base_card_white_bg, composer, 0), null, 2, null));
                composer.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierB);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composer);
                Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                composer.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                DatePickerKt.a(sunshineDayFragment.mDateTitle, new Function0<Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$initView$1$1$1$1$1
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (((Number) sunshineDayFragment.mCurrentPageIndex.getValue()).intValue() > 0) {
                            MutableState mutableState = sunshineDayFragment.mCurrentPageIndex;
                            mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() - 1));
                        }
                    }
                }, new Function0<Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$initView$1$1$1$1$2
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MutableState mutableState = sunshineDayFragment.mCurrentPageIndex;
                        mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
                    }
                }, sunshineDayFragment.mDateStepPair, 0L, new Function0<Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$initView$1$1$1$1$3
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sunshineDayFragment.t0();
                    }
                }, composer, 0, 16);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(OverScrollModifierKt.b(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), false, null, 0.0f, 0.0f, null, null, 63, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierVerticalScroll$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM1259constructorimpl3 = Updater.m1259constructorimpl(composer);
                Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                composer.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                sunshineDayFragment.c0(composer, 8);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = sunshineDayFragment.mCurrentStat;
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                DayDetailKt.c((SunshineStat) ((MutableState) objRememberedValue).getValue(), composer, 8);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        linearLayout.addView(composeView);
    }

    @NotNull
    public String p0() {
        return ir9.a.a(this);
    }

    public long q0() {
        return ((Number) this.locationTime.getValue()).longValue();
    }

    public long r0(@Nullable Bundle bundle) {
        return zs9.a.a(this, bundle);
    }

    public final void s0() {
        SunshineStatChartVM sunshineStatChartVM = this.mStatViewModel;
        if (sunshineStatChartVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatViewModel");
            sunshineStatChartVM = null;
        }
        sunshineStatChartVM.F().observe(this, new a(new Function1<List<? extends SunshineStat>, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$initDataObserver$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends SunshineStat> list) {
                invoke2((List<SunshineStat>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<SunshineStat> stats) {
                SunshineStat sunshineStat;
                List<SunshineStat> list = stats;
                if (list == null || list.isEmpty()) {
                    MutableState mutableState = this.this$0.mDateTitle;
                    String strT = q15.t(this.this$0.mLocalDate);
                    Intrinsics.checkNotNullExpressionValue(strT, "toDateWithWeek(mLocalDate)");
                    mutableState.setValue(strT);
                    this.this$0.mDateStepPair.setValue(new Pair(Boolean.TRUE, Boolean.valueOf(!Intrinsics.areEqual(this.this$0.mLocalDate, LocalDate.now()))));
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(stats, "stats");
                ListIterator<SunshineStat> listIterator = stats.listIterator(stats.size());
                while (true) {
                    sunshineStat = null;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    SunshineStat sunshineStatPrevious = listIterator.previous();
                    if (StringsKt__StringsKt.contains$default((CharSequence) sunshineStatPrevious.getDataClient(), (CharSequence) ":", false, 2, (Object) null)) {
                        sunshineStat = sunshineStatPrevious;
                        break;
                    }
                }
                SunshineStat sunshineStat2 = sunshineStat;
                if (Intrinsics.areEqual(this.this$0.mLocalDate, LocalDate.now())) {
                    if (sunshineStat2 == null) {
                        this.this$0.mLocalDate = LocalDate.now();
                    } else if (Intrinsics.areEqual(this.this$0.mLocalDate, LocalDate.now())) {
                        SunshineDayFragment sunshineDayFragment = this.this$0;
                        sunshineDayFragment.mLocalDate = sunshineDayFragment.q0() > 0 ? h15.D(this.this$0.q0()) : h15.D(o15.a(sunshineStat2.getDate()));
                    }
                }
                MutableState mutableState2 = this.this$0.mDateTitle;
                String strT2 = q15.t(this.this$0.mLocalDate);
                Intrinsics.checkNotNullExpressionValue(strT2, "toDateWithWeek(mLocalDate)");
                mutableState2.setValue(strT2);
                this.this$0.mDateStepPair.setValue(new Pair(Boolean.TRUE, Boolean.valueOf(true ^ Intrinsics.areEqual(this.this$0.mLocalDate, LocalDate.now()))));
                this.this$0.mCurrentPageIndex.setValue(Integer.valueOf((int) ChronoUnit.DAYS.between(h15.D(o15.a(stats.get(0).getDate())), this.this$0.mLocalDate)));
            }
        }));
    }

    public final void t0() {
        Map mapEmptyMap;
        final COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = new COUIBottomSheetDialogFragment();
        final LocalDate localDate = this.mLocalDate;
        SunshineStatChartVM sunshineStatChartVM = this.mStatViewModel;
        if (sunshineStatChartVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatViewModel");
            sunshineStatChartVM = null;
        }
        List<SunshineStat> value = sunshineStatChartVM.F().getValue();
        List<SunshineStat> list = value;
        long jCurrentTimeMillis = list == null || list.isEmpty() ? System.currentTimeMillis() - 2592000000L : o15.a(value.get(0).getDate());
        if (value != null) {
            List<SunshineStat> list2 = value;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10)), 16));
            for (SunshineStat sunshineStat : list2) {
                Pair pair = TuplesKt.to(h15.D(o15.a(sunshineStat.getDate())), Float.valueOf(sunshineStat.getTotalDuration() / RangesKt___RangesKt.coerceAtLeast(sunshineStat.getTargetDuration(), 1.0f)));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            mapEmptyMap = linkedHashMap;
        } else {
            mapEmptyMap = MapsKt__MapsKt.emptyMap();
        }
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        int iF = swf.f(com.heytap.health.sunshine.R$color.health_sunshine_FF266BF5);
        Function1<LocalDate, Unit> function1 = new Function1<LocalDate, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineDayFragment$showCalendar$calendarFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate2) {
                invoke2(localDate2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LocalDate selectDate) {
                Intrinsics.checkNotNullParameter(selectDate, "selectDate");
                this.mCurrentPageIndex.setValue(Integer.valueOf(((Number) this.mCurrentPageIndex.getValue()).intValue() + ((int) ChronoUnit.DAYS.between(localDate, selectDate))));
                this.mLocalDate = selectDate;
                MutableState mutableState = this.mDateTitle;
                String strT = q15.t(this.mLocalDate);
                Intrinsics.checkNotNullExpressionValue(strT, "toDateWithWeek(mLocalDate)");
                mutableState.setValue(strT);
                cOUIBottomSheetDialogFragment.dismiss();
            }
        };
        CalendarAchievementCounter calendarAchievementCounter = CalendarAchievementCounter.INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        cOUIBottomSheetDialogFragment.setMainPanelFragment(new CommonCalendarFragment(localDate, lValueOf, mapEmptyMap, iF, function1, calendarAchievementCounter.e(value, resources)));
        cOUIBottomSheetDialogFragment.show(getChildFragmentManager(), getTag());
    }

    @Override // com.oplus.aiunit.vision.ir9
    public boolean u5() {
        return ir9.a.c(this);
    }
}