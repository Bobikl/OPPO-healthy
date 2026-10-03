package com.heytap.health.sunshine.ui.chart;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.databaseengine.model.sunshine.SunshineStat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.core.widget.charts.data.HealthGradientColor;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.healthbase.view.CommonCalendarFragment;
import com.heytap.health.sunshine.R$string;
import com.heytap.health.sunshine.util.CalendarAchievementCounter;
import com.heytap.health.sunshine.util.ChartType;
import com.heytap.health.sunshine.viewmodel.SunshineStatAnalyzeVM;
import com.heytap.health.sunshine.viewmodel.SunshineStatChartVM;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt;
import com.oplus.aiunit.vision.AnalyzeData;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.ir9;
import com.oplus.aiunit.vision.l14;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.swf;
import com.oplus.aiunit.vision.tz9;
import io.protostuff.MapSchema;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001SB\u001b\u0012\u0006\u0010'\u001a\u00020$\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010(¢\u0006\u0004\bP\u0010QJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u000f\u0010\u0016\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014J\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014J\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0014J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0006H\u0004R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00101\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u00104\"\u0004\b5\u00106R,\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004080\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R(\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@\"\u0004\bA\u0010BR\u0017\u0010H\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bE\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010JR\u001d\u0010O\u001a\u0004\u0018\u00010(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u0010L\u001a\u0004\bM\u0010N¨\u0006T"}, d2 = {"Lcom/heytap/health/sunshine/ui/chart/BaseStatChart;", "Lcom/oplus/aiunit/vision/tz9;", "Lcom/oplus/aiunit/vision/ir9;", "Landroidx/compose/runtime/MutableState;", "", "showState", "", "b", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "list", "Lcom/heytap/health/sunshine/util/ChartType;", "chartType", "d", "(Ljava/util/List;Lcom/heytap/health/sunshine/util/ChartType;Landroidx/compose/runtime/Composer;I)V", "", "x", "Lcom/heytap/health/sunshine/ui/chart/BaseChart;", "chart", "", "y", "c", "(Landroidx/compose/runtime/Composer;I)V", "", "Lcom/heytap/databaseengine/model/sunshine/SunshineStat;", MapSchema.FIELD_NAME_KEY, "startTime", "endTime", "w", "time", "u", "v", l14.TIME_STYLE_LEFT_DIR_NAME, "q", "t", "Lcom/heytap/health/base/base/BaseFragment;", "i", "Lcom/heytap/health/base/base/BaseFragment;", "fragment", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "j", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "familyConfig", "Lcom/heytap/health/sunshine/ui/chart/BaseChart;", LogFieldKey.MESSAGE_KEY, "()Lcom/heytap/health/sunshine/ui/chart/BaseChart;", "s", "(Lcom/heytap/health/sunshine/ui/chart/BaseChart;)V", "mChart", LogFieldKey.LEVEL_KEY, "Z", "()Z", "r", "(Z)V", "initedTime", "Lkotlin/Pair;", "Landroidx/compose/runtime/MutableState;", "n", "()Landroidx/compose/runtime/MutableState;", "mDateStepPair", "mMarkerShowState", "o", "Ljava/util/List;", "()Ljava/util/List;", "setMStampedDatas", "(Ljava/util/List;)V", "mStampedDatas", "Lcom/heytap/health/sunshine/viewmodel/SunshineStatChartVM;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/sunshine/viewmodel/SunshineStatChartVM;", "()Lcom/heytap/health/sunshine/viewmodel/SunshineStatChartVM;", "mViewModel", "Lcom/heytap/health/sunshine/viewmodel/SunshineStatAnalyzeVM;", "Lcom/heytap/health/sunshine/viewmodel/SunshineStatAnalyzeVM;", "mStatFragmentVM", "Lkotlin/Lazy;", "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "<init>", "(Lcom/heytap/health/base/base/BaseFragment;Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "Companion", "a", "sunshine_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseStatChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStatChart.kt\ncom/heytap/health/sunshine/ui/chart/BaseStatChart\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n154#2:520\n154#2:711\n74#3,6:521\n80#3:553\n84#3:597\n73#3,7:605\n80#3:638\n84#3:707\n75#4:527\n76#4,11:529\n75#4:561\n76#4,11:563\n89#4:591\n89#4:596\n75#4:612\n76#4,11:614\n75#4:646\n76#4,11:648\n89#4:701\n89#4:706\n76#5:528\n76#5:562\n76#5:613\n76#5:647\n76#5:710\n460#6,13:540\n460#6,13:574\n473#6,3:588\n473#6,3:593\n25#6:598\n460#6,13:625\n460#6,13:659\n473#6,3:698\n473#6,3:703\n66#7,7:554\n73#7:587\n77#7:592\n1114#8,6:599\n74#9,7:639\n81#9:672\n85#9:702\n1098#10:673\n927#10,6:674\n927#10,6:680\n927#10,6:686\n927#10,6:692\n1855#11,2:708\n766#11:712\n857#11,2:713\n1179#11,2:716\n1253#11,4:718\n1179#11,2:722\n1253#11,4:724\n1#12:715\n*S KotlinDebug\n*F\n+ 1 BaseStatChart.kt\ncom/heytap/health/sunshine/ui/chart/BaseStatChart\n*L\n116#1:520\n233#1:711\n112#1:521,6\n112#1:553\n112#1:597\n138#1:605,7\n138#1:638\n138#1:707\n112#1:527\n112#1:529,11\n118#1:561\n118#1:563,11\n118#1:591\n112#1:596\n138#1:612\n138#1:614,11\n144#1:646\n144#1:648,11\n144#1:701\n138#1:706\n112#1:528\n118#1:562\n138#1:613\n144#1:647\n230#1:710\n112#1:540,13\n118#1:574,13\n118#1:588,3\n112#1:593,3\n130#1:598\n138#1:625,13\n144#1:659,13\n144#1:698,3\n138#1:703,3\n118#1:554,7\n118#1:587\n118#1:592\n130#1:599,6\n144#1:639,7\n144#1:672\n144#1:702\n153#1:673\n155#1:674,6\n164#1:680,6\n173#1:686,6\n182#1:692,6\n199#1:708,2\n411#1:712\n411#1:713,2\n473#1:716,2\n473#1:718,4\n478#1:722,2\n478#1:724,4\n*E\n"})
public abstract class BaseStatChart implements tz9, ir9 {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final BaseFragment fragment;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final FamilyMoreDataDetailConfigBean familyConfig;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public BaseChart mChart;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean initedTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableState<Pair<Boolean, Boolean>> mDateStepPair;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState<Boolean> mMarkerShowState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public List<TimeStampedData> mStampedDatas;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final SunshineStatChartVM mViewModel;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final SunshineStatAnalyzeVM mStatFragmentVM;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig;
    public static final int $stable = 8;

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
        timeStampedData.setHeartRateType(0);
        Unit unit = Unit.INSTANCE;
        this.mStampedDatas = CollectionsKt__CollectionsKt.mutableListOf(timeStampedData);
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
        this.mViewModel = (SunshineStatChartVM) new ViewModelProvider(fragmentActivityRequireActivity).get(SunshineStatChartVM.class);
        this.mStatFragmentVM = (SunshineStatAnalyzeVM) new ViewModelProvider(fragment).get(SunshineStatAnalyzeVM.class);
        this.lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.sunshine.ui.chart.BaseStatChart$lazyGetFamilyConfig$2
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
    public final void b(final MutableState<Boolean> mutableState, Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(754494642);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(754494642, i, -1, "com.heytap.health.sunshine.ui.chart.BaseStatChart.AvgStress (BaseStatChart.kt:128)");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.chart.BaseStatChart$AvgStress$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    this.$tmp0_rcvr.b(mutableState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
            return;
        }
        int i2 = 0;
        String strStringResource = StringResources_androidKt.stringResource(R$string.health_sunshine_avg_comprehensive_status_day, composerStartRestartGroup, 0);
        AnalyzeData analyzeData = (AnalyzeData) LiveDataAdapterKt.observeAsState(this.mStatFragmentVM.M(), composerStartRestartGroup, 8).getValue();
        int avgDuration = analyzeData != null ? analyzeData.getAvgDuration() : Integer.MIN_VALUE;
        int i3 = avgDuration / 60;
        int i4 = avgDuration % 60;
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.INSTANCE;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
        int i5 = avgDuration;
        TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, ColorResources_androidKt.colorResource(R$color.lib_base_8A000000, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        Alignment.Vertical bottom = companion2.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), bottom, composerStartRestartGroup, 48);
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
        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (i5 == Integer.MIN_VALUE) {
            composerStartRestartGroup.startReplaceableGroup(97522819);
            TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.health_base.R$string.health_base_no_data, composerStartRestartGroup, 0), (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(97523212);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(i2, 1, null);
            if (i3 > 0) {
                int i6 = com.heytap.health.health_base.R$color.health_base_black_90alpha;
                int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(i6, composerStartRestartGroup, 0), TextUnitKt.getSp(34), FontWeight.INSTANCE.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16376, (DefaultConstructorMarker) null));
                try {
                    builder.append(String.valueOf(i3));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.startReplaceableGroup(97523822);
                    int iPushStyle2 = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(i6, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(R$string.health_sunshine_hour, composerStartRestartGroup, 0));
                        builder.pop(iPushStyle2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } catch (Throwable th) {
                        builder.pop(iPushStyle2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
            }
            int i7 = com.heytap.health.health_base.R$color.health_base_black_90alpha;
            int iPushStyle3 = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), TextUnitKt.getSp(34), FontWeight.INSTANCE.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16376, (DefaultConstructorMarker) null));
            try {
                builder.append(String.valueOf(i4));
                Unit unit2 = Unit.INSTANCE;
                builder.pop(iPushStyle3);
                int iPushStyle4 = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(R$string.health_sunshine_minute, composerStartRestartGroup, 0));
                    builder.pop(iPushStyle4);
                    composer2 = composerStartRestartGroup;
                    TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                    composer2.endReplaceableGroup();
                } catch (Throwable th3) {
                    builder.pop(iPushStyle4);
                    throw th3;
                }
            } catch (Throwable th4) {
                builder.pop(iPushStyle3);
                throw th4;
            }
        }
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.chart.BaseStatChart$AvgStress$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i8) {
                this.$tmp2_rcvr.b(mutableState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void c(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-920712262);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-920712262, i, -1, "com.heytap.health.sunshine.ui.chart.BaseStatChart.ChartView (BaseStatChart.kt:110)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierM429paddingqDBjuR0 = PaddingKt.m429paddingqDBjuR0(AutoClipContentModifierKt.b(BackgroundKt.m163backgroundbw27NRU$default(companion, ColorResources_androidKt.colorResource(R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null)), Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(10), Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(18));
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
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM429paddingqDBjuR0);
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
        b(this.mMarkerShowState, composerStartRestartGroup, 64);
        d(this.mStampedDatas, type(), composerStartRestartGroup, NearHintRedDot.RED_POINT_ANIM_DURATION);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.chart.BaseStatChart$ChartView$2
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
                this.$tmp0_rcvr.c(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void d(final List<TimeStampedData> list, final ChartType chartType, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1393097837);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1393097837, i, -1, "com.heytap.health.sunshine.ui.chart.BaseStatChart.LineChartAndroidView (BaseStatChart.kt:225)");
        }
        AndroidView_androidKt.AndroidView(new Function1<Context, BaseChart>() { // from class: com.heytap.health.sunshine.ui.chart.BaseStatChart$LineChartAndroidView$1
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.chart.BaseStatChart$LineChartAndroidView$3
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
                this.$tmp0_rcvr.d(list, chartType, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @NotNull
    public final List<TimeStampedData> k(@NotNull List<SunshineStat> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
        for (SunshineStat sunshineStat : list) {
            TimeStampedData timeStampedData = new TimeStampedData(o15.a(sunshineStat.getDate()), sunshineStat.getTotalDuration());
            timeStampedData.setHeartRateType(sunshineStat.getSunshineType());
            if (type() == ChartType.YEAR || sunshineStat.getTotalDuration() >= sunshineStat.getTargetDuration()) {
                timeStampedData.setGradientColor(new HealthGradientColor(ContextCompat.getColor(contextRequireContext, com.heytap.health.sunshine.R$color.health_sunshine_chart_bar_bottom), ContextCompat.getColor(contextRequireContext, com.heytap.health.sunshine.R$color.health_sunshine_chart_bar_top)));
            } else {
                int i = com.heytap.health.sunshine.R$color.health_sunshine_chart_bar_bottom_not_reach;
                timeStampedData.setColor(ContextCompat.getColor(contextRequireContext, i));
                timeStampedData.setGradientColor(new HealthGradientColor(ContextCompat.getColor(contextRequireContext, i), ContextCompat.getColor(contextRequireContext, com.heytap.health.sunshine.R$color.health_sunshine_chart_bar_top_not_reach)));
            }
            arrayList.add(timeStampedData);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getInitedTime() {
        return this.initedTime;
    }

    @NotNull
    public final BaseChart m() {
        BaseChart baseChart = this.mChart;
        if (baseChart != null) {
            return baseChart;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mChart");
        return null;
    }

    @NotNull
    public final MutableState<Pair<Boolean, Boolean>> n() {
        return this.mDateStepPair;
    }

    @NotNull
    public final List<TimeStampedData> o() {
        return this.mStampedDatas;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final SunshineStatChartVM getMViewModel() {
        return this.mViewModel;
    }

    public void q(boolean left) {
        ChartTouchListener onTouchListener = m().getOnTouchListener();
        if (onTouchListener instanceof HChartTouchListener) {
            ((HChartTouchListener) onTouchListener).v(left);
        }
    }

    public final void r(boolean z) {
        this.initedTime = z;
    }

    public final void s(@NotNull BaseChart baseChart) {
        Intrinsics.checkNotNullParameter(baseChart, "<set-?>");
        this.mChart = baseChart;
    }

    public final void t() {
        LinkedHashMap linkedHashMap;
        List<SunshineStat> value = this.mViewModel.F().getValue();
        List<SunshineStat> list = value;
        if (list == null || list.isEmpty()) {
            List<TimeStampedData> list2 = this.mStampedDatas;
            linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10)), 16));
            for (TimeStampedData timeStampedData : list2) {
                Pair pair = TuplesKt.to(h15.D(timeStampedData.getTimestamp()), Float.valueOf(((int) timeStampedData.getY()) > 0 ? 1.0f : 0.0f));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            List<SunshineStat> list3 = value;
            linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10)), 16));
            for (SunshineStat sunshineStat : list3) {
                Pair pair2 = TuplesKt.to(h15.D(o15.a(sunshineStat.getDate())), Float.valueOf(sunshineStat.getTotalDuration() / RangesKt___RangesKt.coerceAtLeast(sunshineStat.getTargetDuration(), 1.0f)));
                linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        final COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = new COUIBottomSheetDialogFragment();
        TimeStampedData timeStampedData2 = (TimeStampedData) CollectionsKt___CollectionsKt.firstOrNull((List) this.mStampedDatas);
        if (timeStampedData2 == null) {
            return;
        }
        long timestamp = timeStampedData2.getTimestamp();
        Pair<Long, Long> value2 = this.mStatFragmentVM.N().getValue();
        if (value2 != null) {
            LocalDate localDateD = h15.D(Math.max(value2.getFirst().longValue(), timestamp));
            Long lValueOf = Long.valueOf(timestamp);
            int iF = swf.f(com.heytap.health.sunshine.R$color.health_sunshine_FF266BF5);
            Function1<LocalDate, Unit> function1 = new Function1<LocalDate, Unit>() { // from class: com.heytap.health.sunshine.ui.chart.BaseStatChart$showCalendar$calendarFragment$1

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
                    } else if (i == 2) {
                        endDate = selectDate.plusDays(31L);
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        endDate = selectDate.with(TemporalAdjusters.lastDayOfYear());
                    }
                    int i2 = iArr[this.this$0.type().ordinal()];
                    if (i2 == 1) {
                        startDate = endDate.with((TemporalAdjuster) DayOfWeek.MONDAY);
                    } else if (i2 == 2) {
                        startDate = h15.y(selectDate);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        startDate = selectDate.with(TemporalAdjusters.firstDayOfYear());
                    }
                    this.this$0.m().highlightValue((Highlight) null, true);
                    SunshineStatAnalyzeVM sunshineStatAnalyzeVM = this.this$0.mStatFragmentVM;
                    Intrinsics.checkNotNullExpressionValue(startDate, "startDate");
                    Long lValueOf2 = Long.valueOf(h15.x(startDate));
                    Intrinsics.checkNotNullExpressionValue(endDate, "endDate");
                    sunshineStatAnalyzeVM.P(new Pair<>(lValueOf2, Long.valueOf(h15.x(endDate))));
                    cOUIBottomSheetDialogFragment.dismiss();
                }
            };
            CalendarAchievementCounter calendarAchievementCounter = CalendarAchievementCounter.INSTANCE;
            Resources resources = this.fragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "fragment.resources");
            cOUIBottomSheetDialogFragment.setMainPanelFragment(new CommonCalendarFragment(localDateD, lValueOf, linkedHashMap2, iF, function1, calendarAchievementCounter.e(value, resources)));
            cOUIBottomSheetDialogFragment.show(this.fragment.getChildFragmentManager(), type().name());
        }
    }

    public final float u(long time, @NotNull BaseChart chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        return (float) (((time / chart.getXAxisTimeUnit().getUnit()) - chart.getXStart()) - ((double) chart.getExtraXAxisSpace()));
    }

    @Override // com.oplus.aiunit.vision.ir9
    public boolean u5() {
        return ir9.a.c(this);
    }

    public final float v(long time) {
        if (this.mStampedDatas.isEmpty()) {
            return 0.0f;
        }
        int size = this.mStampedDatas.size();
        for (int i = 0; i < size; i++) {
            if (time <= this.mStampedDatas.get(i).getTimestamp()) {
                return i - m().getExtraXAxisSpace();
            }
        }
        return 0.0f;
    }

    public final void w(long startTime, long endTime) {
        this.mDateStepPair.setValue(new Pair<>(Boolean.valueOf(!this.mStampedDatas.isEmpty() && startTime > this.mStampedDatas.get(0).getTimestamp()), Boolean.valueOf(endTime < ((TimeStampedData) CollectionsKt___CollectionsKt.last((List) this.mStampedDatas)).getTimestamp())));
    }

    public final void x(long startTime, long endTime) {
        Float fValueOf;
        List<TimeStampedData> list = this.mStampedDatas;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            long timestamp = ((TimeStampedData) next).getTimestamp();
            if (startTime <= timestamp && timestamp <= endTime) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            float y = ((TimeStampedData) it2.next()).getY();
            while (it2.hasNext()) {
                y = Math.max(y, ((TimeStampedData) it2.next()).getY());
            }
            fValueOf = Float.valueOf(y);
        } else {
            fValueOf = null;
        }
        float f = 20.0f;
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 20.0f;
        if (fFloatValue > 0.0f) {
            f = ((fFloatValue % 10.0f) > 0.0f ? 1 : ((fFloatValue % 10.0f) == 0.0f ? 0 : -1)) == 0 ? fFloatValue : 10.0f * ((((int) fFloatValue) / 10) + 1);
        }
        m().setYAxisRightValues(new float[]{0.0f, f / 2, f});
    }

    public final long y(float x, BaseChart chart) {
        return (long) ((((double) x) + chart.getXStart()) * chart.getXAxisTimeUnit().getUnit());
    }
}