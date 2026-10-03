package com.heytap.health.hrv.ui.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.Updater;
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
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.ViewGroupKt;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.hrv.R$color;
import com.heytap.health.hrv.R$id;
import com.heytap.health.hrv.R$string;
import com.heytap.health.hrv.constant.HrvStatusType;
import com.heytap.health.hrv.ui.chart.BaseChart;
import com.heytap.health.hrv.ui.item.DayChartViewKt;
import com.heytap.health.hrv.viewmodel.StressDataChartVM;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.ti9;
import com.oplus.aiunit.vision.x83;
import com.oplus.aiunit.vision.xp0;
import com.oplus.backup.sdk.common.utils.ModuleType;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u001a#\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0011H\u0002\u001a\u000f\u0010\u0019\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/hrv/viewmodel/StressDataChartVM;", "viewModel", "Landroidx/compose/runtime/MutableState;", "", "markerState", "", "d", "(Lcom/heytap/health/hrv/viewmodel/StressDataChartVM;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "", "stressState", "value", "", "title", MapSchema.FIELD_NAME_ENTRY, "(IILjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Landroid/view/View;", "commonView", "Lcom/heytap/health/hrv/ui/chart/BaseChart;", "i", c7n.g, "Lkotlin/Function1;", LogFieldKey.MESSAGE_KEY, "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/heytap/health/hrv/ui/chart/BaseChart;", "chart", "j", "c", "(Landroidx/compose/runtime/Composer;I)V", "hrv_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDayChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DayChartView.kt\ncom/heytap/health/hrv/ui/item/DayChartViewKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 9 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,247:1\n25#2:248\n460#2,13:275\n460#2,13:309\n473#2,3:336\n473#2,3:341\n36#2:350\n1114#3,6:249\n1114#3,6:351\n73#4,7:255\n80#4:288\n84#4:345\n75#5:262\n76#5,11:264\n75#5:296\n76#5,11:298\n89#5:339\n89#5:344\n76#6:263\n76#6:297\n76#6:348\n76#6:357\n74#7,7:289\n81#7:322\n85#7:340\n1098#8:323\n927#8,6:324\n927#8,6:330\n1313#9,2:346\n154#10:349\n*S KotlinDebug\n*F\n+ 1 DayChartView.kt\ncom/heytap/health/hrv/ui/item/DayChartViewKt\n*L\n62#1:248\n82#1:275,13\n88#1:309,13\n88#1:336,3\n82#1:341,3\n183#1:350\n62#1:249,6\n183#1:351,6\n82#1:255,7\n82#1:288\n82#1:345\n82#1:262\n82#1:264,11\n88#1:296\n88#1:298,11\n88#1:339\n82#1:344\n82#1:263\n88#1:297\n171#1:348\n245#1:357\n88#1:289,7\n88#1:322\n88#1:340\n97#1:323\n98#1:324,6\n107#1:330,6\n125#1:346,2\n180#1:349\n*E\n"})
public final class DayChartViewKt {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/hrv/ui/item/DayChartViewKt$a", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "hrv_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ohb {
        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String a(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
            TimeStampedData timeStampedData = (TimeStampedData) data;
            return ti9.a(timeStampedData.getHeartRateType()) + " " + ((int) timeStampedData.getY());
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String b(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (!(entry.getData() instanceof TimeStampedData)) {
                return "anything";
            }
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
            String strG = lo9.g(((TimeStampedData) data).getTimestamp(), o15.DATE_FORMAT_HOUR);
            Intrinsics.checkNotNullExpressionValue(strG, "{\n                      …m\")\n                    }");
            return strG;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void c(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-491520249);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-491520249, i, -1, "com.heytap.health.hrv.ui.item.PreviewView (DayChartView.kt:243)");
            }
            e88.d((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            e(0, 0, null, composerStartRestartGroup, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.DayChartViewKt$PreviewView$1
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
                DayChartViewKt.c(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@NotNull final StressDataChartVM viewModel, @NotNull final MutableState<Boolean> markerState, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(markerState, "markerState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1993370389);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1993370389, i, -1, "com.heytap.health.hrv.ui.item.StatusValue (DayChartView.kt:57)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        if (composerStartRestartGroup.rememberedValue() == Composer.INSTANCE.getEmpty()) {
            composerStartRestartGroup.updateRememberedValue(markerState);
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (markerState.getValue().booleanValue()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.DayChartViewKt$StatusValue$2
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
                    DayChartViewKt.d(viewModel, markerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
            return;
        }
        PhysicalMentalStat physicalMentalStat = (PhysicalMentalStat) LiveDataAdapterKt.observeAsState(viewModel.J(), composerStartRestartGroup, 8).getValue();
        if (physicalMentalStat == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.DayChartViewKt$StatusValue$stat$1
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
                    DayChartViewKt.d(viewModel, markerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
            return;
        }
        e(physicalMentalStat.getStressState(), physicalMentalStat.getAvgStress(), StringResources_androidKt.stringResource(R$string.health_hrv_achiev_avg_vitality_today, composerStartRestartGroup, 0), composerStartRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.DayChartViewKt$StatusValue$3
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
                DayChartViewKt.d(viewModel, markerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:72:0x016d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:76:0x0240  */
    /* JADX WARN: Code duplicated, block: B:79:0x024c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0250  */
    /* JADX WARN: Code duplicated, block: B:83:0x029a  */
    /* JADX WARN: Code duplicated, block: B:84:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:91:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x03c7  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(int i, int i2, @Nullable String str, @Nullable Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        int i12;
        String str3;
        String strA;
        int i13;
        long jColorResource;
        long j2;
        Function0<ComposeUiNode> constructor;
        int i14;
        Composer composer2;
        Function0<ComposeUiNode> constructor2;
        AnnotatedString.Builder builder;
        int iPushStyle;
        int iPushStyle2;
        final int i15;
        final String str4;
        final int i16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1519072336);
        int i17 = i4 & 1;
        if (i17 != 0) {
            i6 = i3 | 6;
            i5 = i;
        } else if ((i3 & 14) == 0) {
            i5 = i;
            i6 = (composerStartRestartGroup.changed(i5) ? 4 : 2) | i3;
        } else {
            i5 = i;
            i6 = i3;
        }
        int i18 = i4 & 2;
        if (i18 == 0) {
            if ((i3 & 112) == 0) {
                i7 = i2;
                i6 |= composerStartRestartGroup.changed(i7) ? 32 : 16;
            }
            i8 = i4 & 4;
            if (i8 != 0) {
                if ((i3 & 896) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i9 = 256;
                    } else {
                        i9 = 128;
                    }
                    i6 |= i9;
                }
                i10 = i6;
                if ((i10 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i17 != 0) {
                        i11 = 3;
                    } else {
                        i11 = i5;
                    }
                    if (i18 != 0) {
                        i12 = 75;
                    } else {
                        i12 = i7;
                    }
                    if (i8 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1519072336, i10, -1, "com.heytap.health.hrv.ui.item.StatusValueAct (DayChartView.kt:72)");
                    }
                    strA = ti9.a(i11);
                    i13 = 0;
                    if (i11 == HrvStatusType.GOOD.getType()) {
                        composerStartRestartGroup.startReplaceableGroup(-1619882505);
                        jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_excellent, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (i11 == HrvStatusType.RELAX.getType()) {
                        composerStartRestartGroup.startReplaceableGroup(-1619882413);
                        jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_good, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (i11 == HrvStatusType.NORMAL.getType()) {
                        composerStartRestartGroup.startReplaceableGroup(-1619882325);
                        jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_normal, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (i11 == HrvStatusType.REST.getType()) {
                        composerStartRestartGroup.startReplaceableGroup(-1619882237);
                        jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_over, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1619882170);
                        jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_default, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    j2 = jColorResource;
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
                    constructor = companion3.getConstructor();
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
                    i14 = i11;
                    composer2 = composerStartRestartGroup;
                    TextKt.m1201Text4IGK_g(str3, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_8A000000, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i10 >> 6) & 14) | 3072, 0, 131058);
                    Alignment.Vertical bottom = companion2.getBottom();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), bottom, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composer2);
                    Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                    composer2.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (i14 == HrvStatusType.DEFAULT.getType()) {
                        composer2.startReplaceableGroup(337057129);
                        TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_status_no_data, composer2, 0), (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(337057470);
                        builder = new AnnotatedString.Builder(i13, 1, null);
                        iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(34), FontWeight.INSTANCE.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16376, (DefaultConstructorMarker) null));
                        try {
                            builder.append(String.valueOf(i12));
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            iPushStyle2 = builder.pushStyle(new SpanStyle(j2, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                            try {
                                builder.append(" ");
                                builder.append(strA);
                                builder.pop(iPushStyle2);
                                TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                                composer2.endReplaceableGroup();
                            } catch (Throwable th) {
                                builder.pop(iPushStyle2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            builder.pop(iPushStyle);
                            throw th2;
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
                    i15 = i12;
                    str4 = str3;
                    i16 = i14;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    i16 = i5;
                    i15 = i7;
                    str4 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.DayChartViewKt$StatusValueAct$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i19) {
                        DayChartViewKt.e(i16, i15, str4, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i6 |= ModuleType.TYPE_SYSTEM_SETTING;
            str2 = str;
            i10 = i6;
            if ((i10 & 731) == 146) {
                if (i17 != 0) {
                    i11 = 3;
                } else {
                    i11 = i5;
                }
                if (i18 != 0) {
                    i12 = 75;
                } else {
                    i12 = i7;
                }
                if (i8 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1519072336, i10, -1, "com.heytap.health.hrv.ui.item.StatusValueAct (DayChartView.kt:72)");
                }
                strA = ti9.a(i11);
                i13 = 0;
                if (i11 == HrvStatusType.GOOD.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882505);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_excellent, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.RELAX.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882413);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_good, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.NORMAL.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882325);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_normal, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.REST.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882237);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_over, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1619882170);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_default, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                j2 = jColorResource;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(companion4);
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
                Composer composerM1259constructorimpl3 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion6.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion6.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion6.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                i14 = i11;
                composer2 = composerStartRestartGroup;
                TextKt.m1201Text4IGK_g(str3, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_8A000000, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i10 >> 6) & 14) | 3072, 0, 131058);
                Alignment.Vertical bottom2 = companion5.getBottom();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), bottom2, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                Density density4 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(companion4);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM1259constructorimpl4 = Updater.m1259constructorimpl(composer2);
                Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion6.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion6.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion6.getSetViewConfiguration());
                composer2.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                if (i14 == HrvStatusType.DEFAULT.getType()) {
                    composer2.startReplaceableGroup(337057129);
                    TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_status_no_data, composer2, 0), (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(337057470);
                    builder = new AnnotatedString.Builder(i13, 1, null);
                    iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(34), FontWeight.INSTANCE.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16376, (DefaultConstructorMarker) null));
                    builder.append(String.valueOf(i12));
                    Unit unit2 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    iPushStyle2 = builder.pushStyle(new SpanStyle(j2, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                    builder.append(" ");
                    builder.append(strA);
                    builder.pop(iPushStyle2);
                    TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                    composer2.endReplaceableGroup();
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
                i15 = i12;
                str4 = str3;
                i16 = i14;
            } else {
                if (i17 != 0) {
                    i11 = 3;
                } else {
                    i11 = i5;
                }
                if (i18 != 0) {
                    i12 = 75;
                } else {
                    i12 = i7;
                }
                if (i8 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1519072336, i10, -1, "com.heytap.health.hrv.ui.item.StatusValueAct (DayChartView.kt:72)");
                }
                strA = ti9.a(i11);
                i13 = 0;
                if (i11 == HrvStatusType.GOOD.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882505);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_excellent, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.RELAX.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882413);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_good, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.NORMAL.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882325);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_normal, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.REST.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882237);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_over, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1619882170);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_default, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                j2 = jColorResource;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Modifier.Companion companion7 = Modifier.INSTANCE;
                Arrangement arrangement3 = Arrangement.INSTANCE;
                Arrangement.Vertical top3 = arrangement3.getTop();
                Alignment.Companion companion8 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top3, companion8.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                constructor = companion9.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(companion7);
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
                Composer composerM1259constructorimpl5 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyColumnMeasurePolicy3, companion9.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion9.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion9.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion9.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                i14 = i11;
                composer2 = composerStartRestartGroup;
                TextKt.m1201Text4IGK_g(str3, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_8A000000, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i10 >> 6) & 14) | 3072, 0, 131058);
                Alignment.Vertical bottom3 = companion8.getBottom();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement3.getStart(), bottom3, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                Density density6 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion9.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(companion7);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM1259constructorimpl6 = Updater.m1259constructorimpl(composer2);
                Updater.m1266setimpl(composerM1259constructorimpl6, measurePolicyRowMeasurePolicy3, companion9.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl6, density6, companion9.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl6, layoutDirection6, companion9.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl6, viewConfiguration6, companion9.getSetViewConfiguration());
                composer2.enableReusing();
                function3MaterializerOf6.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                if (i14 == HrvStatusType.DEFAULT.getType()) {
                    composer2.startReplaceableGroup(337057129);
                    TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_status_no_data, composer2, 0), (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(337057470);
                    builder = new AnnotatedString.Builder(i13, 1, null);
                    iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(34), FontWeight.INSTANCE.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16376, (DefaultConstructorMarker) null));
                    builder.append(String.valueOf(i12));
                    Unit unit3 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    iPushStyle2 = builder.pushStyle(new SpanStyle(j2, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                    builder.append(" ");
                    builder.append(strA);
                    builder.pop(iPushStyle2);
                    TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                    composer2.endReplaceableGroup();
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
                i15 = i12;
                str4 = str3;
                i16 = i14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.DayChartViewKt$StatusValueAct$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i19) {
                    DayChartViewKt.e(i16, i15, str4, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i6 |= 48;
        i7 = i2;
        i8 = i4 & 4;
        if (i8 != 0) {
            if ((i3 & 896) == 0) {
                str2 = str;
                if (composerStartRestartGroup.changed(str2)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i6 |= i9;
            }
            i10 = i6;
            if ((i10 & 731) == 146) {
                if (i17 != 0) {
                    i11 = 3;
                } else {
                    i11 = i5;
                }
                if (i18 != 0) {
                    i12 = 75;
                } else {
                    i12 = i7;
                }
                if (i8 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1519072336, i10, -1, "com.heytap.health.hrv.ui.item.StatusValueAct (DayChartView.kt:72)");
                }
                strA = ti9.a(i11);
                i13 = 0;
                if (i11 == HrvStatusType.GOOD.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882505);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_excellent, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.RELAX.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882413);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_good, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.NORMAL.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882325);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_normal, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.REST.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882237);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_over, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1619882170);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_default, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                j2 = jColorResource;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Modifier.Companion companion10 = Modifier.INSTANCE;
                Arrangement arrangement4 = Arrangement.INSTANCE;
                Arrangement.Vertical top4 = arrangement4.getTop();
                Alignment.Companion companion11 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(top4, companion11.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                constructor = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(companion10);
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
                Composer composerM1259constructorimpl7 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl7, measurePolicyColumnMeasurePolicy4, companion12.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl7, density7, companion12.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl7, layoutDirection7, companion12.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl7, viewConfiguration7, companion12.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf7.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                i14 = i11;
                composer2 = composerStartRestartGroup;
                TextKt.m1201Text4IGK_g(str3, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_8A000000, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i10 >> 6) & 14) | 3072, 0, 131058);
                Alignment.Vertical bottom4 = companion11.getBottom();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement4.getStart(), bottom4, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                Density density8 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection8 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(companion10);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM1259constructorimpl8 = Updater.m1259constructorimpl(composer2);
                Updater.m1266setimpl(composerM1259constructorimpl8, measurePolicyRowMeasurePolicy4, companion12.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl8, density8, companion12.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl8, layoutDirection8, companion12.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl8, viewConfiguration8, companion12.getSetViewConfiguration());
                composer2.enableReusing();
                function3MaterializerOf8.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                if (i14 == HrvStatusType.DEFAULT.getType()) {
                    composer2.startReplaceableGroup(337057129);
                    TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_status_no_data, composer2, 0), (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(337057470);
                    builder = new AnnotatedString.Builder(i13, 1, null);
                    iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(34), FontWeight.INSTANCE.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16376, (DefaultConstructorMarker) null));
                    builder.append(String.valueOf(i12));
                    Unit unit4 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    iPushStyle2 = builder.pushStyle(new SpanStyle(j2, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                    builder.append(" ");
                    builder.append(strA);
                    builder.pop(iPushStyle2);
                    TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                    composer2.endReplaceableGroup();
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
                i15 = i12;
                str4 = str3;
                i16 = i14;
            } else {
                if (i17 != 0) {
                    i11 = 3;
                } else {
                    i11 = i5;
                }
                if (i18 != 0) {
                    i12 = 75;
                } else {
                    i12 = i7;
                }
                if (i8 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1519072336, i10, -1, "com.heytap.health.hrv.ui.item.StatusValueAct (DayChartView.kt:72)");
                }
                strA = ti9.a(i11);
                i13 = 0;
                if (i11 == HrvStatusType.GOOD.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882505);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_excellent, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.RELAX.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882413);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_good, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.NORMAL.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882325);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_normal, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i11 == HrvStatusType.REST.getType()) {
                    composerStartRestartGroup.startReplaceableGroup(-1619882237);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_over, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1619882170);
                    jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_default, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                j2 = jColorResource;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Modifier.Companion companion13 = Modifier.INSTANCE;
                Arrangement arrangement5 = Arrangement.INSTANCE;
                Arrangement.Vertical top5 = arrangement5.getTop();
                Alignment.Companion companion14 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(top5, companion14.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(companion13);
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
                Composer composerM1259constructorimpl9 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl9, measurePolicyColumnMeasurePolicy5, companion15.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl9, density9, companion15.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl9, layoutDirection9, companion15.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl9, viewConfiguration9, companion15.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf9.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                i14 = i11;
                composer2 = composerStartRestartGroup;
                TextKt.m1201Text4IGK_g(str3, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_8A000000, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i10 >> 6) & 14) | 3072, 0, 131058);
                Alignment.Vertical bottom5 = companion14.getBottom();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement5.getStart(), bottom5, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                Density density10 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection10 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration10 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(companion13);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM1259constructorimpl10 = Updater.m1259constructorimpl(composer2);
                Updater.m1266setimpl(composerM1259constructorimpl10, measurePolicyRowMeasurePolicy5, companion15.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl10, density10, companion15.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl10, layoutDirection10, companion15.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl10, viewConfiguration10, companion15.getSetViewConfiguration());
                composer2.enableReusing();
                function3MaterializerOf10.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                if (i14 == HrvStatusType.DEFAULT.getType()) {
                    composer2.startReplaceableGroup(337057129);
                    TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_status_no_data, composer2, 0), (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(337057470);
                    builder = new AnnotatedString.Builder(i13, 1, null);
                    iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(34), FontWeight.INSTANCE.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16376, (DefaultConstructorMarker) null));
                    builder.append(String.valueOf(i12));
                    Unit unit5 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    iPushStyle2 = builder.pushStyle(new SpanStyle(j2, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                    builder.append(" ");
                    builder.append(strA);
                    builder.pop(iPushStyle2);
                    TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                    composer2.endReplaceableGroup();
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
                i15 = i12;
                str4 = str3;
                i16 = i14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.DayChartViewKt$StatusValueAct$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i19) {
                    DayChartViewKt.e(i16, i15, str4, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i6 |= ModuleType.TYPE_SYSTEM_SETTING;
        str2 = str;
        i10 = i6;
        if ((i10 & 731) == 146) {
            if (i17 != 0) {
                i11 = 3;
            } else {
                i11 = i5;
            }
            if (i18 != 0) {
                i12 = 75;
            } else {
                i12 = i7;
            }
            if (i8 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1519072336, i10, -1, "com.heytap.health.hrv.ui.item.StatusValueAct (DayChartView.kt:72)");
            }
            strA = ti9.a(i11);
            i13 = 0;
            if (i11 == HrvStatusType.GOOD.getType()) {
                composerStartRestartGroup.startReplaceableGroup(-1619882505);
                jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_excellent, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i11 == HrvStatusType.RELAX.getType()) {
                composerStartRestartGroup.startReplaceableGroup(-1619882413);
                jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_good, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i11 == HrvStatusType.NORMAL.getType()) {
                composerStartRestartGroup.startReplaceableGroup(-1619882325);
                jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_normal, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i11 == HrvStatusType.REST.getType()) {
                composerStartRestartGroup.startReplaceableGroup(-1619882237);
                jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_over, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1619882170);
                jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_default, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            j2 = jColorResource;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion16 = Modifier.INSTANCE;
            Arrangement arrangement6 = Arrangement.INSTANCE;
            Arrangement.Vertical top6 = arrangement6.getTop();
            Alignment.Companion companion17 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(top6, companion17.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
            constructor = companion18.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(companion16);
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
            Composer composerM1259constructorimpl11 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl11, measurePolicyColumnMeasurePolicy6, companion18.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl11, density11, companion18.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl11, layoutDirection11, companion18.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl11, viewConfiguration11, companion18.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf11.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
            i14 = i11;
            composer2 = composerStartRestartGroup;
            TextKt.m1201Text4IGK_g(str3, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_8A000000, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i10 >> 6) & 14) | 3072, 0, 131058);
            Alignment.Vertical bottom6 = companion17.getBottom();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement6.getStart(), bottom6, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            Density density12 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection12 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration12 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion18.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(companion16);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM1259constructorimpl12 = Updater.m1259constructorimpl(composer2);
            Updater.m1266setimpl(composerM1259constructorimpl12, measurePolicyRowMeasurePolicy6, companion18.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl12, density12, companion18.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl12, layoutDirection12, companion18.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl12, viewConfiguration12, companion18.getSetViewConfiguration());
            composer2.enableReusing();
            function3MaterializerOf12.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
            if (i14 == HrvStatusType.DEFAULT.getType()) {
                composer2.startReplaceableGroup(337057129);
                TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_status_no_data, composer2, 0), (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(337057470);
                builder = new AnnotatedString.Builder(i13, 1, null);
                iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(34), FontWeight.INSTANCE.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16376, (DefaultConstructorMarker) null));
                builder.append(String.valueOf(i12));
                Unit unit6 = Unit.INSTANCE;
                builder.pop(iPushStyle);
                iPushStyle2 = builder.pushStyle(new SpanStyle(j2, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                builder.append(" ");
                builder.append(strA);
                builder.pop(iPushStyle2);
                TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                composer2.endReplaceableGroup();
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
            i15 = i12;
            str4 = str3;
            i16 = i14;
        } else {
            if (i17 != 0) {
                i11 = 3;
            } else {
                i11 = i5;
            }
            if (i18 != 0) {
                i12 = 75;
            } else {
                i12 = i7;
            }
            if (i8 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1519072336, i10, -1, "com.heytap.health.hrv.ui.item.StatusValueAct (DayChartView.kt:72)");
            }
            strA = ti9.a(i11);
            i13 = 0;
            if (i11 == HrvStatusType.GOOD.getType()) {
                composerStartRestartGroup.startReplaceableGroup(-1619882505);
                jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_excellent, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i11 == HrvStatusType.RELAX.getType()) {
                composerStartRestartGroup.startReplaceableGroup(-1619882413);
                jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_good, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i11 == HrvStatusType.NORMAL.getType()) {
                composerStartRestartGroup.startReplaceableGroup(-1619882325);
                jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_normal, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i11 == HrvStatusType.REST.getType()) {
                composerStartRestartGroup.startReplaceableGroup(-1619882237);
                jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_over, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1619882170);
                jColorResource = ColorResources_androidKt.colorResource(R$color.health_hrv_stress_default, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            j2 = jColorResource;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion19 = Modifier.INSTANCE;
            Arrangement arrangement7 = Arrangement.INSTANCE;
            Arrangement.Vertical top7 = arrangement7.getTop();
            Alignment.Companion companion110 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(top7, companion110.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
            constructor = companion111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(companion19);
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
            Composer composerM1259constructorimpl13 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl13, measurePolicyColumnMeasurePolicy7, companion111.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl13, density13, companion111.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl13, layoutDirection13, companion111.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl13, viewConfiguration13, companion111.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf13.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
            i14 = i11;
            composer2 = composerStartRestartGroup;
            TextKt.m1201Text4IGK_g(str3, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_8A000000, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i10 >> 6) & 14) | 3072, 0, 131058);
            Alignment.Vertical bottom7 = companion110.getBottom();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement7.getStart(), bottom7, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            Density density14 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection14 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration14 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(companion19);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM1259constructorimpl14 = Updater.m1259constructorimpl(composer2);
            Updater.m1266setimpl(composerM1259constructorimpl14, measurePolicyRowMeasurePolicy7, companion111.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl14, density14, companion111.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl14, layoutDirection14, companion111.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl14, viewConfiguration14, companion111.getSetViewConfiguration());
            composer2.enableReusing();
            function3MaterializerOf14.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
            if (i14 == HrvStatusType.DEFAULT.getType()) {
                composer2.startReplaceableGroup(337057129);
                TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_status_no_data, composer2, 0), (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(337057470);
                builder = new AnnotatedString.Builder(i13, 1, null);
                iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composer2, 0), TextUnitKt.getSp(34), FontWeight.INSTANCE.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16376, (DefaultConstructorMarker) null));
                builder.append(String.valueOf(i12));
                Unit unit7 = Unit.INSTANCE;
                builder.pop(iPushStyle);
                iPushStyle2 = builder.pushStyle(new SpanStyle(j2, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                builder.append(" ");
                builder.append(strA);
                builder.pop(iPushStyle2);
                TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                composer2.endReplaceableGroup();
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
            i15 = i12;
            str4 = str3;
            i16 = i14;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.DayChartViewKt$StatusValueAct$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i19) {
                DayChartViewKt.e(i16, i15, str4, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
            }
        });
    }

    @NotNull
    public static final BaseChart h(@NotNull View commonView) {
        Intrinsics.checkNotNullParameter(commonView, "commonView");
        LinearLayout linearLayout = (LinearLayout) commonView.findViewById(R$id.hrv_card_chart);
        BaseChart baseChart = new BaseChart(commonView.getContext());
        baseChart.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        j(baseChart);
        baseChart.setLineStrokeWidth(4.0f);
        baseChart.setCircleStrokeRadius(1.5f);
        baseChart.setCircleStrokeHoleRadius(2.0f);
        baseChart.setExtraTopOffset(0.0f);
        baseChart.getXAxis().setEnabled(false);
        baseChart.getAxisRight().setEnabled(false);
        baseChart.getXAxis().setGranularity(1.0f);
        baseChart.setOnTouchListener((ChartTouchListener) null);
        TimeStampedData timeStampedData = new TimeStampedData();
        timeStampedData.setTimestamp(System.currentTimeMillis());
        timeStampedData.setY(0.0f);
        timeStampedData.setHeartRateType(HrvStatusType.DEFAULT.getType());
        List<? extends TimeStampedData> listListOf = CollectionsKt__CollectionsJVMKt.listOf(timeStampedData);
        baseChart.setTimeXAxisMinimum(((TimeStampedData) CollectionsKt___CollectionsKt.first((List) listListOf)).getTimestamp());
        baseChart.setTimeXAxisMaximum(((TimeStampedData) CollectionsKt___CollectionsKt.last((List) listListOf)).getTimestamp());
        baseChart.setEntryData(listListOf);
        linearLayout.removeAllViews();
        linearLayout.addView(baseChart);
        return baseChart;
    }

    @NotNull
    public static final BaseChart i(@NotNull View commonView) {
        Intrinsics.checkNotNullParameter(commonView, "commonView");
        LinearLayout chartView = (LinearLayout) commonView.findViewById(R$id.hrv_card_chart);
        Intrinsics.checkNotNullExpressionValue(chartView, "chartView");
        for (View view : ViewGroupKt.getChildren(chartView)) {
            if (view instanceof BaseChart) {
                return (BaseChart) view;
            }
        }
        return h(commonView);
    }

    public static final void j(BaseChart baseChart) {
        baseChart.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.y15
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return DayChartViewKt.k(i, d);
            }
        });
        baseChart.setDrawZeroGridLine(false);
        baseChart.getXAxis().setLabelCount(5);
        baseChart.setExtraSpace(15.0f);
        baseChart.setLineStrokeWidth(6.0f);
        baseChart.setCircleStrokeRadius(2.0f);
        baseChart.setCircleStrokeHoleRadius(3.0f);
        baseChart.setXAxisTimeUnit(TimeUnit.MINUTE);
        baseChart.getXAxis().setDrawGridLines(false);
        baseChart.getAxisRight().setDrawGridLines(false);
        baseChart.setChartType(0);
        DataRenderer renderer = baseChart.getRenderer();
        Intrinsics.checkNotNull(renderer, "null cannot be cast to non-null type com.heytap.health.hrv.ui.chart.ChartRenderer");
        ((x83) renderer).h(210.0f);
        CommonMarkerView commonMarkerView = new CommonMarkerView(baseChart.getContext(), new a());
        baseChart.setMarker(commonMarkerView);
        commonMarkerView.setChartView(baseChart);
        baseChart.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.z15
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return DayChartViewKt.l(i, d);
            }
        });
    }

    public static final String k(int i, double d) {
        return String.valueOf((int) d);
    }

    public static final String l(int i, double d) {
        return String.valueOf(i * 6);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @NotNull
    public static final BaseChart m(@NotNull final Function1<? super Boolean, Unit> markerState, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(markerState, "markerState");
        composer.startReplaceableGroup(1507515422);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507515422, i, -1, "com.heytap.health.hrv.ui.item.lineChartAndroidView (DayChartView.kt:167)");
        }
        final BaseChart baseChart = new BaseChart((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        baseChart.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Modifier modifierM455height3ABfNKs = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(238));
        Function1<Context, BaseChart> function1 = new Function1<Context, BaseChart>() { // from class: com.heytap.health.hrv.ui.item.DayChartViewKt$lineChartAndroidView$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final BaseChart invoke(@NotNull Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return baseChart;
            }
        };
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(markerState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<BaseChart, Unit>() { // from class: com.heytap.health.hrv.ui.item.DayChartViewKt$lineChartAndroidView$2$1

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class a implements OnChartValueSelectedListener {
                    public final /* synthetic */ Function1<Boolean, Unit> a;

                    /* JADX WARN: Multi-variable type inference failed */
                    public a(Function1<? super Boolean, Unit> function1) {
                        this.a = function1;
                    }

                    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
                    public void onNothingSelected() {
                        this.a.invoke(Boolean.FALSE);
                    }

                    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
                    public void onValueSelected(@NotNull Entry e2, @NotNull Highlight h) {
                        Intrinsics.checkNotNullParameter(e2, "e");
                        Intrinsics.checkNotNullParameter(h, "h");
                        this.a.invoke(Boolean.TRUE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BaseChart baseChart2) {
                    invoke2(baseChart2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BaseChart chart) {
                    Intrinsics.checkNotNullParameter(chart, "chart");
                    DayChartViewKt.j(chart);
                    chart.setOnChartValueSelectedListener(new a(markerState));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        AndroidView_androidKt.AndroidView(function1, modifierM455height3ABfNKs, (Function1) objRememberedValue, composer, 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return baseChart;
    }
}