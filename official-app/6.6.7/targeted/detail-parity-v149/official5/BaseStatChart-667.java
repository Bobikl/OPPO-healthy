package com.heytap.health.hrv.ui.chart;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.hrv.R$string;
import com.heytap.health.hrv.constant.HrvStatusType;
import com.heytap.health.hrv.ui.item.CalendarPanelFragment;
import com.heytap.health.hrv.ui.item.ComposeItemKt;
import com.heytap.health.hrv.ui.item.DayChartViewKt;
import com.heytap.health.hrv.util.ChartType;
import com.heytap.health.hrv.viewmodel.StressStatAnalyzeVM;
import com.heytap.health.hrv.viewmodel.StressStatChartVM;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt;
import com.oplus.aiunit.vision.AnalyzeData;
import com.oplus.aiunit.vision.gf8;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.ir9;
import com.oplus.aiunit.vision.l14;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ti9;
import com.oplus.aiunit.vision.uz9;
import io.protostuff.MapSchema;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001OB\u001b\u0012\u0006\u0010(\u001a\u00020%\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010)¢\u0006\u0004\bL\u0010MJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u000f\u0010\u0016\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014J\u0016\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0014J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0004J\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0006R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00103\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R,\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004040\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00105R(\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b/\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010FR\u001d\u0010K\u001a\u0004\u0018\u00010)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b;\u0010H\u001a\u0004\bI\u0010J¨\u0006P"}, d2 = {"Lcom/heytap/health/hrv/ui/chart/BaseStatChart;", "Lcom/oplus/aiunit/vision/uz9;", "Lcom/oplus/aiunit/vision/ir9;", "Landroidx/compose/runtime/MutableState;", "", "showState", "", "c", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "list", "Lcom/heytap/health/hrv/util/ChartType;", "chartType", MapSchema.FIELD_NAME_ENTRY, "(Ljava/util/List;Lcom/heytap/health/hrv/util/ChartType;Landroidx/compose/runtime/Composer;I)V", "", "x", "Lcom/heytap/health/hrv/ui/chart/BaseChart;", "chart", "", "y", "d", "(Landroidx/compose/runtime/Composer;I)V", "", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "n", "startTime", "endTime", "time", "v", "w", l14.TIME_STYLE_LEFT_DIR_NAME, "s", "u", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/base/base/BaseFragment;", "i", "Lcom/heytap/health/base/base/BaseFragment;", "fragment", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "j", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "familyConfig", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/hrv/ui/chart/BaseChart;", "o", "()Lcom/heytap/health/hrv/ui/chart/BaseChart;", "t", "(Lcom/heytap/health/hrv/ui/chart/BaseChart;)V", "mChart", "Lkotlin/Pair;", "Landroidx/compose/runtime/MutableState;", LogFieldKey.PROCESS_NAME_KEY, "()Landroidx/compose/runtime/MutableState;", "mDateStepPair", "mMarkerShowState", "Ljava/util/List;", "q", "()Ljava/util/List;", "setMStampedDatas", "(Ljava/util/List;)V", "mStampedDatas", "Lcom/heytap/health/hrv/viewmodel/StressStatChartVM;", "Lcom/heytap/health/hrv/viewmodel/StressStatChartVM;", "r", "()Lcom/heytap/health/hrv/viewmodel/StressStatChartVM;", "mViewModel", "Lcom/heytap/health/hrv/viewmodel/StressStatAnalyzeVM;", "Lcom/heytap/health/hrv/viewmodel/StressStatAnalyzeVM;", "mStatFragmentVM", "Lkotlin/Lazy;", "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "<init>", "(Lcom/heytap/health/base/base/BaseFragment;Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "Companion", "a", "hrv_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseStatChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStatChart.kt\ncom/heytap/health/hrv/ui/chart/BaseStatChart\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,393:1\n154#2:394\n154#2:482\n74#3,6:395\n80#3:427\n84#3:471\n75#4:401\n76#4,11:403\n75#4:435\n76#4,11:437\n89#4:465\n89#4:470\n76#5:402\n76#5:436\n76#5:481\n460#6,13:414\n460#6,13:448\n473#6,3:462\n473#6,3:467\n25#6:472\n66#7,7:428\n73#7:461\n77#7:466\n1114#8,6:473\n1855#9,2:479\n*S KotlinDebug\n*F\n+ 1 BaseStatChart.kt\ncom/heytap/health/hrv/ui/chart/BaseStatChart\n*L\n107#1:394\n157#1:482\n103#1:395,6\n103#1:427\n103#1:471\n103#1:401\n103#1:403,11\n109#1:435\n109#1:437,11\n109#1:465\n103#1:470\n103#1:402\n109#1:436\n154#1:481\n103#1:414,13\n109#1:448,13\n109#1:462,3\n103#1:467,3\n122#1:472\n109#1:428,7\n109#1:461\n109#1:466\n122#1:473,6\n138#1:479,2\n*E\n"})
public abstract class BaseStatChart implements uz9, ir9 {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final BaseFragment fragment;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final FamilyMoreDataDetailConfigBean familyConfig;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public BaseChart mChart;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState<Pair<Boolean, Boolean>> mDateStepPair;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableState<Boolean> mMarkerShowState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<TimeStampedData> mStampedDatas;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final StressStatChartVM mViewModel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final StressStatAnalyzeVM mStatFragmentVM;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[ChartType.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartType.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChartType.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChartType.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseStatChart(@NotNull BaseFragment fragment, @Nullable FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.familyConfig = familyMoreDataDetailConfigBean;
        Boolean bool = Boolean.TRUE;
        this.mDateStepPair = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(bool, bool), null, 2, null);
        this.mMarkerShowState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        TimeStampedData timeStampedData = new TimeStampedData();
        timeStampedData.setTimestamp(System.currentTimeMillis());
        timeStampedData.setY(0.0f);
        timeStampedData.setHeartRateType(HrvStatusType.DEFAULT.getType());
        Unit unit = Unit.INSTANCE;
        this.mStampedDatas = CollectionsKt__CollectionsKt.mutableListOf(timeStampedData);
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
        this.mViewModel = (StressStatChartVM) new ViewModelProvider(fragmentActivityRequireActivity).get(StressStatChartVM.class);
        this.mStatFragmentVM = (StressStatAnalyzeVM) new ViewModelProvider(fragment).get(StressStatAnalyzeVM.class);
        this.lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.hrv.ui.chart.BaseStatChart$lazyGetFamilyConfig$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final FamilyMoreDataDetailConfigBean invoke() {
                return this.this$0.familyConfig;
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
    public final void c(final MutableState<Boolean> mutableState, Composer composer, final int i) {
        String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1127198105);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1127198105, i, -1, "com.heytap.health.hrv.ui.chart.BaseStatChart.AvgStress (BaseStatChart.kt:120)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        if (composerStartRestartGroup.rememberedValue() == Composer.INSTANCE.getEmpty()) {
            composerStartRestartGroup.updateRememberedValue(mutableState);
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (mutableState.getValue().booleanValue()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.chart.BaseStatChart$AvgStress$2
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
                    this.$tmp4_rcvr.c(mutableState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
            return;
        }
        AnalyzeData a20Var = (AnalyzeData) LiveDataAdapterKt.observeAsState(this.mStatFragmentVM.I(), composerStartRestartGroup, 8).getValue();
        Integer numValueOf = a20Var != null ? Integer.valueOf(a20Var.getCurrentStressAvg()) : null;
        int iB = ti9.b(numValueOf);
        int i2 = b.$EnumSwitchMapping$0[type().ordinal()];
        if (i2 == 1) {
            composerStartRestartGroup.startReplaceableGroup(1800557937);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_achiev_avg_vitality_today, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (i2 == 2) {
            composerStartRestartGroup.startReplaceableGroup(1800558034);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_avg_comprehensive_status_week, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (i2 == 3) {
            composerStartRestartGroup.startReplaceableGroup(1800558136);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_avg_comprehensive_status_month, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            if (i2 != 4) {
                composerStartRestartGroup.startReplaceableGroup(1800552510);
                composerStartRestartGroup.endReplaceableGroup();
                throw new NoWhenBranchMatchedException();
            }
            composerStartRestartGroup.startReplaceableGroup(1800558238);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_avg_comprehensive_status_year, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        DayChartViewKt.e(iB, numValueOf != null ? numValueOf.intValue() : 0, strStringResource, composerStartRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.chart.BaseStatChart$AvgStress$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                this.$tmp6_rcvr.c(mutableState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void d(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1750904415);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1750904415, i, -1, "com.heytap.health.hrv.ui.chart.BaseStatChart.ChartView (BaseStatChart.kt:101)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(AutoClipContentModifierKt.b(BackgroundKt.m163backgroundbw27NRU$default(companion, ColorResources_androidKt.colorResource(R$color.lib_base_card_white_bg_2, composerStartRestartGroup, 0), null, 2, null)), Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(10), Dp.m4104constructorimpl(f), 0.0f, 8, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        c(this.mMarkerShowState, composerStartRestartGroup, 64);
        e(this.mStampedDatas, type(), composerStartRestartGroup, NearHintRedDot.RED_POINT_ANIM_DURATION);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ComposeItemKt.b(composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.chart.BaseStatChart$ChartView$2
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
                this.$tmp0_rcvr.d(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void e(final List<TimeStampedData> list, final ChartType chartType, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(544594380);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(544594380, i, -1, "com.heytap.health.hrv.ui.chart.BaseStatChart.LineChartAndroidView (BaseStatChart.kt:149)");
        }
        AndroidView_androidKt.AndroidView(new Function1<Context, BaseChart>() { // from class: com.heytap.health.hrv.ui.chart.BaseStatChart$LineChartAndroidView$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final BaseChart invoke(@NotNull Context ctx) {
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                BaseChart baseChart = new BaseChart(ctx);
                baseChart.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return baseChart;
            }
        }, SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(238)), new BaseStatChart$LineChartAndroidView$2(this, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), list, chartType), composerStartRestartGroup, 54, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.chart.BaseStatChart$LineChartAndroidView$3
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
                this.$tmp0_rcvr.e(list, chartType, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    public final void l() {
        if (this.mChart != null) {
            o().E();
        }
    }

    public final void m() {
        if (this.mChart != null) {
            o().r();
        }
    }

    @NotNull
    public final List<TimeStampedData> n(@NotNull List<PhysicalMentalStat> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        for (PhysicalMentalStat physicalMentalStat : list) {
            TimeStampedData timeStampedData = new TimeStampedData(o15.a(physicalMentalStat.getDate()), physicalMentalStat.getAvgStress());
            timeStampedData.setHeartRateType(physicalMentalStat.getStressState());
            arrayList.add(timeStampedData);
        }
        return arrayList;
    }

    @NotNull
    public final BaseChart o() {
        BaseChart baseChart = this.mChart;
        if (baseChart != null) {
            return baseChart;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mChart");
        return null;
    }

    @NotNull
    public final MutableState<Pair<Boolean, Boolean>> p() {
        return this.mDateStepPair;
    }

    @NotNull
    public final List<TimeStampedData> q() {
        return this.mStampedDatas;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final StressStatChartVM getMViewModel() {
        return this.mViewModel;
    }

    public void s(boolean left) {
        ChartTouchListener onTouchListener = o().getOnTouchListener();
        if (onTouchListener instanceof HChartTouchListener) {
            ((HChartTouchListener) onTouchListener).v(left);
        }
    }

    public final void t(@NotNull BaseChart baseChart) {
        Intrinsics.checkNotNullParameter(baseChart, "<set-?>");
        this.mChart = baseChart;
    }

    public final void u() {
        final COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = new COUIBottomSheetDialogFragment();
        TimeStampedData timeStampedData = (TimeStampedData) CollectionsKt___CollectionsKt.firstOrNull((List) this.mStampedDatas);
        if (timeStampedData == null) {
            return;
        }
        long timestamp = timeStampedData.getTimestamp();
        Pair<Long, Long> value = this.mStatFragmentVM.K().getValue();
        if (value != null) {
            cOUIBottomSheetDialogFragment.setMainPanelFragment(new CalendarPanelFragment(gf8.INSTANCE.f(Math.max(value.getFirst().longValue(), timestamp)), Long.valueOf(timestamp), new Function1<LocalDate, Unit>() { // from class: com.heytap.health.hrv.ui.chart.BaseStatChart$showCalendar$calendarFragment$1

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ChartType.values().length];
                        try {
                            iArr[ChartType.WEEK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ChartType.MONTH.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[ChartType.YEAR.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate) {
                    invoke2(localDate);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LocalDate selectDate) {
                    LocalDate endDate;
                    LocalDate startDate;
                    Intrinsics.checkNotNullParameter(selectDate, "selectDate");
                    ChartType chartTypeType = this.this$0.type();
                    int[] iArr = a.$EnumSwitchMapping$0;
                    int i = iArr[chartTypeType.ordinal()];
                    if (i == 1) {
                        endDate = selectDate.with((TemporalAdjuster) DayOfWeek.SUNDAY);
                    } else if (i != 2) {
                        endDate = i != 3 ? selectDate.with((TemporalAdjuster) DayOfWeek.SUNDAY) : selectDate.with(TemporalAdjusters.lastDayOfYear());
                    } else {
                        endDate = selectDate.plusDays(31L);
                    }
                    int i2 = iArr[this.this$0.type().ordinal()];
                    if (i2 == 1) {
                        startDate = endDate.with((TemporalAdjuster) DayOfWeek.MONDAY);
                    } else if (i2 != 2) {
                        startDate = i2 != 3 ? endDate.minusWeeks(1L) : selectDate.with(TemporalAdjusters.firstDayOfYear());
                    } else {
                        startDate = h15.y(selectDate);
                    }
                    this.this$0.o().highlightValue((Highlight) null, true);
                    StressStatAnalyzeVM stressStatAnalyzeVM = this.this$0.mStatFragmentVM;
                    gf8.Companion companion = gf8.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(startDate, "startDate");
                    Long lValueOf = Long.valueOf(companion.j(startDate));
                    Intrinsics.checkNotNullExpressionValue(endDate, "endDate");
                    stressStatAnalyzeVM.N(new Pair<>(lValueOf, Long.valueOf(companion.j(endDate))));
                    cOUIBottomSheetDialogFragment.dismiss();
                }
            }));
            cOUIBottomSheetDialogFragment.show(this.fragment.getChildFragmentManager(), type().name());
        }
    }

    @Override // com.oplus.aiunit.vision.ir9
    public boolean u5() {
        return ir9.a.c(this);
    }

    public final float v(long time, @NotNull BaseChart chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        return (float) (((time / chart.getXAxisTimeUnit().getUnit()) - chart.getXStart()) - ((double) chart.getExtraXAxisSpace()));
    }

    public final float w(long time) {
        if (this.mStampedDatas.isEmpty()) {
            return 0.0f;
        }
        int size = this.mStampedDatas.size();
        for (int i = 0; i < size; i++) {
            if (time <= this.mStampedDatas.get(i).getTimestamp()) {
                return i - o().getExtraXAxisSpace();
            }
        }
        return 0.0f;
    }

    public final void x(long startTime, long endTime) {
        this.mDateStepPair.setValue(new Pair<>(Boolean.valueOf(!this.mStampedDatas.isEmpty() && startTime > this.mStampedDatas.get(0).getTimestamp()), Boolean.valueOf(endTime < ((TimeStampedData) CollectionsKt___CollectionsKt.last((List) this.mStampedDatas)).getTimestamp())));
    }

    public final long y(float x, BaseChart chart) {
        return (long) ((((double) x) + chart.getXStart()) * chart.getXAxisTimeUnit().getUnit());
    }
}