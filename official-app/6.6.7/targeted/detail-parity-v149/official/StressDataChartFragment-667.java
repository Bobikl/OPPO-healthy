package com.heytap.health.hrv.ui.detail;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.hrv.R$id;
import com.heytap.health.hrv.R$layout;
import com.heytap.health.hrv.bean.StressDayBean;
import com.heytap.health.hrv.constant.HrvConstant;
import com.heytap.health.hrv.constant.HrvStatusType;
import com.heytap.health.hrv.ui.chart.BaseChart;
import com.heytap.health.hrv.ui.item.DayChartViewKt;
import com.heytap.health.hrv.viewmodel.StressDataChartVM;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt;
import com.oplus.aiunit.vision.gf8;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.k7h;
import java.time.LocalDate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J&\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/heytap/health/hrv/ui/detail/StressDataChartFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "", "getLayoutId", "Landroid/view/View;", "view", "", "initView", "initData", "k0", "j0", "", "minTime", "maxTime", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "chartList", "p0", "n0", "Lcom/heytap/health/hrv/viewmodel/StressDataChartVM;", "o", "Lcom/heytap/health/hrv/viewmodel/StressDataChartVM;", "mViewModel", "Ljava/time/LocalDate;", LogFieldKey.PROCESS_NAME_KEY, "Ljava/time/LocalDate;", "mLocalDate", "", "q", "Ljava/lang/String;", "mSsoid", "Lcom/heytap/health/hrv/ui/chart/BaseChart;", "r", "Lcom/heytap/health/hrv/ui/chart/BaseChart;", "mChart", "Landroidx/compose/runtime/MutableState;", "", "s", "Landroidx/compose/runtime/MutableState;", "mMarkerState", "<init>", "()V", "Companion", "a", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class StressDataChartFragment extends BaseFragment {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public StressDataChartVM mViewModel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public LocalDate mLocalDate;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public String mSsoid;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public BaseChart mChart;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final MutableState<Boolean> mMarkerState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.health.hrv.ui.detail.StressDataChartFragment$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/heytap/health/hrv/ui/detail/StressDataChartFragment$a;", "", "Ljava/time/LocalDate;", "localDate", "", "ssoid", "Lcom/heytap/health/hrv/ui/detail/StressDataChartFragment;", "a", "LOCAL_DATE", "Ljava/lang/String;", PdfViewActivity.SSOID, "<init>", "()V", "hrv_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final StressDataChartFragment a(@NotNull LocalDate localDate, @NotNull String ssoid) {
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            Intrinsics.checkNotNullParameter(ssoid, "ssoid");
            Bundle bundle = new Bundle();
            bundle.putSerializable("LOCAL_DATE", localDate);
            bundle.putString(PdfViewActivity.SSOID, ssoid);
            StressDataChartFragment stressDataChartFragment = new StressDataChartFragment();
            stressDataChartFragment.setArguments(bundle);
            return stressDataChartFragment;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/hrv/ui/detail/StressDataChartFragment$b", "Lcom/oplus/aiunit/vision/k7h;", "Lcom/heytap/health/core/widget/charts/data/ChartScrollState;", "state", "", "a", "Landroid/view/MotionEvent;", "motionEvent", "onChartSingleTapped", "onChartLongPressed", "hrv_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nStressDataChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDataChartFragment.kt\ncom/heytap/health/hrv/ui/detail/StressDataChartFragment$initChart$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
    public static final class b extends k7h {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.k7h
        public void a(@NotNull ChartScrollState state) {
            Intrinsics.checkNotNullParameter(state, "state");
        }

        @Override // com.oplus.aiunit.vision.k7h, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(@Nullable MotionEvent motionEvent) {
            BaseChart baseChart;
            if (motionEvent == null || (baseChart = StressDataChartFragment.this.mChart) == null) {
                return;
            }
            if (baseChart.A()) {
                baseChart.setHighlightPerTapEnabled(false);
                StressDataChartFragment.this.mMarkerState.setValue(Boolean.FALSE);
            } else {
                baseChart.setHighlightPerTapEnabled(true);
                StressDataChartFragment.this.mMarkerState.setValue(Boolean.TRUE);
                super.onChartLongPressed(motionEvent);
            }
        }

        @Override // com.oplus.aiunit.vision.k7h, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(@NotNull MotionEvent motionEvent) {
            Entry entryByTouchPoint;
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            BaseChart baseChart = StressDataChartFragment.this.mChart;
            if (baseChart == null) {
                return;
            }
            if (baseChart.B(motionEvent.getX(), motionEvent.getY())) {
                baseChart.highlightValue(null);
                StressDataChartFragment.this.mMarkerState.setValue(Boolean.FALSE);
                baseChart.setHighlightPerTapEnabled(false);
                return;
            }
            if (baseChart.D(motionEvent.getX(), motionEvent.getY(), 30.0f) < 0.0f || (entryByTouchPoint = baseChart.getEntryByTouchPoint(motionEvent.getX(), motionEvent.getY())) == null || entryByTouchPoint.getY() <= 0.0f) {
                baseChart.highlightValue(null);
                StressDataChartFragment.this.mMarkerState.setValue(Boolean.FALSE);
            } else {
                Highlight highlight = new Highlight(entryByTouchPoint.getX(), entryByTouchPoint.getY(), 0);
                highlight.setDataIndex(0);
                baseChart.highlightValue(highlight, false);
                StressDataChartFragment.this.mMarkerState.setValue(Boolean.TRUE);
            }
            baseChart.setHighlightPerTapEnabled(false);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function) {
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

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_hrv_data_chart_fragment;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        StressDataChartVM stressDataChartVM = (StressDataChartVM) new ViewModelProvider(this).get(StressDataChartVM.class);
        this.mViewModel = stressDataChartVM;
        String str = this.mSsoid;
        StressDataChartVM stressDataChartVM2 = null;
        if (str != null) {
            if (stressDataChartVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                stressDataChartVM = null;
            }
            stressDataChartVM.K(str);
        }
        StressDataChartVM stressDataChartVM3 = this.mViewModel;
        if (stressDataChartVM3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            stressDataChartVM3 = null;
        }
        LocalDate localDate = this.mLocalDate;
        if (localDate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLocalDate");
            localDate = null;
        }
        long jH = h15.H(localDate);
        LocalDate localDate2 = this.mLocalDate;
        if (localDate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLocalDate");
            localDate2 = null;
        }
        LocalDate localDatePlusDays = localDate2.plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "mLocalDate.plusDays(1)");
        stressDataChartVM3.F(jH, h15.H(localDatePlusDays) - 1);
        StressDataChartVM stressDataChartVM4 = this.mViewModel;
        if (stressDataChartVM4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            stressDataChartVM4 = null;
        }
        stressDataChartVM4.I().observe(this, new c(new Function1<StressDayBean, Unit>() { // from class: com.heytap.health.hrv.ui.detail.StressDataChartFragment.initData.2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(StressDayBean stressDayBean) {
                invoke2(stressDayBean);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(StressDayBean stressDayBean) {
                if (stressDayBean.getChartDataList().isEmpty() || StressDataChartFragment.this.mChart == null) {
                    return;
                }
                StressDataChartFragment.this.p0(stressDayBean.getCurMinTime(), stressDayBean.getCurMaxTime(), stressDayBean.getChartDataList());
            }
        }));
        StressDataChartVM stressDataChartVM5 = this.mViewModel;
        if (stressDataChartVM5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            stressDataChartVM2 = stressDataChartVM5;
        }
        stressDataChartVM2.J().observe(this, new c(new Function1<PhysicalMentalStat, Unit>() { // from class: com.heytap.health.hrv.ui.detail.StressDataChartFragment.initData.3
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PhysicalMentalStat physicalMentalStat) {
                invoke2(physicalMentalStat);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PhysicalMentalStat physicalMentalStat) {
                HrvConstant hrvConstant = HrvConstant.INSTANCE;
                List<Integer> listA = hrvConstant.a();
                BaseChart baseChart = StressDataChartFragment.this.mChart;
                if (baseChart != null) {
                    baseChart.setBaseLines(hrvConstant.a());
                }
                float[] fArr = {0.0f, listA.get(2).intValue(), listA.get(1).intValue(), listA.get(0).intValue(), 100.0f};
                BaseChart baseChart2 = StressDataChartFragment.this.mChart;
                if (baseChart2 != null) {
                    baseChart2.setYAxisRightValues(fArr);
                }
            }
        }));
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        Bundle arguments = getArguments();
        LocalDate localDate = arguments != null ? (LocalDate) BundleCompat.getSerializable(arguments, "LOCAL_DATE", LocalDate.class) : null;
        Intrinsics.checkNotNull(localDate);
        this.mLocalDate = localDate;
        Bundle arguments2 = getArguments();
        this.mSsoid = arguments2 != null ? arguments2.getString(PdfViewActivity.SSOID) : null;
        FrameLayout frameLayout = (FrameLayout) W(R$id.hrv_day_chart_fragment);
        if (frameLayout != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-373203312, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.detail.StressDataChartFragment$initView$2$1
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
                        ComposerKt.traceEventStart(-373203312, i, -1, "com.heytap.health.hrv.ui.detail.StressDataChartFragment.initView.<anonymous>.<anonymous> (StressDataChartFragment.kt:82)");
                    }
                    float f = 16;
                    Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(AutoClipContentModifierKt.b(Modifier.Companion), Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(10), Dp.m4104constructorimpl(f), 0.0f, 8, null);
                    final StressDataChartFragment stressDataChartFragment = this.this$0;
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
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
                    Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    StressDataChartVM stressDataChartVM = stressDataChartFragment.mViewModel;
                    if (stressDataChartVM == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        stressDataChartVM = null;
                    }
                    DayChartViewKt.d(stressDataChartVM, stressDataChartFragment.mMarkerState, composer, 8);
                    stressDataChartFragment.mChart = DayChartViewKt.m(new Function1<Boolean, Unit>() { // from class: com.heytap.health.hrv.ui.detail.StressDataChartFragment$initView$2$1$1$1
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            stressDataChartFragment.mMarkerState.setValue(Boolean.valueOf(z));
                        }
                    }, composer, 0);
                    stressDataChartFragment.n0();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            frameLayout.addView(composeView);
        }
    }

    public final void j0() {
        BaseChart baseChart = this.mChart;
        if (baseChart != null) {
            baseChart.E();
        }
    }

    public final void k0() {
        BaseChart baseChart = this.mChart;
        if (baseChart != null) {
            baseChart.r();
        }
    }

    public final void n0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeStampedData timeStampedData = new TimeStampedData();
        timeStampedData.setTimestamp(jCurrentTimeMillis);
        timeStampedData.setY(0.0f);
        timeStampedData.setHeartRateType(HrvStatusType.DEFAULT.getType());
        List<? extends TimeStampedData> listListOf = CollectionsKt__CollectionsJVMKt.listOf(timeStampedData);
        gf8.Companion companion = gf8.INSTANCE;
        long j2 = companion.j(companion.f(jCurrentTimeMillis));
        LocalDate localDatePlusDays = companion.f(jCurrentTimeMillis).plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "HDateUtil.getLocalDate(curTime).plusDays(1)");
        p0(j2, companion.j(localDatePlusDays), listListOf);
        BaseChart baseChart = this.mChart;
        if (baseChart == null) {
            return;
        }
        baseChart.setOnChartGestureListener(new b());
    }

    public final void p0(long minTime, long maxTime, List<? extends TimeStampedData> chartList) {
        BaseChart baseChart = this.mChart;
        if (baseChart == null) {
            return;
        }
        baseChart.setTimeXAxisMinimum(minTime);
        baseChart.setTimeXAxisMaximum(maxTime);
        baseChart.setEntryData(chartList);
    }
}