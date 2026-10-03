package com.heytap.health.hrv.ui.item;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.cloud.sdk.cloudstorage.common.ErrorInfo;
import com.heytap.health.health_base.R$color;
import com.heytap.health.hrv.R$drawable;
import com.heytap.health.hrv.R$plurals;
import com.heytap.health.hrv.R$string;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.AnalyzeData;
import com.oplus.aiunit.vision.MenstrualCycleData;
import com.oplus.aiunit.vision.StressDetailData;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.l05;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.th7;
import com.oplus.drs.core.net.entity.UploadStateAware;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u001aA\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u001a\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u001a\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u001a\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u001a\u000f\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u001dH\u0007¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\tH\u0003¢\u0006\u0004\b(\u0010\"¨\u0006)"}, d2 = {"", "type", "Landroidx/lifecycle/LiveData;", "Lcom/oplus/aiunit/vision/a20;", "analyzeDataLD", "Lcom/oplus/aiunit/vision/evb;", "menstrualLD", "Landroidx/compose/ui/Modifier;", "modifier", "", "b", "(ILandroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "stateValue", "Landroidx/compose/ui/graphics/Brush;", "r", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Brush;", "analyzeData", c7n.g, "(Lcom/oplus/aiunit/vision/a20;Landroidx/compose/runtime/Composer;I)V", "c", "(ILcom/oplus/aiunit/vision/a20;Landroidx/compose/runtime/Composer;I)V", MapSchema.FIELD_NAME_ENTRY, "a", "Lcom/oplus/aiunit/vision/o1j;", "data", "", "s", "", SpeechConstant.KEY_TTS_TIMESTAMP, "", LogFieldKey.PROCESS_NAME_KEY, "q", "o", c7n.f, "(Landroidx/compose/runtime/Composer;I)V", "text", "f", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "i", "(Landroidx/lifecycle/LiveData;Landroidx/compose/runtime/Composer;II)V", "d", "hrv_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStressStatAnalyzeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressStatAnalyzeView.kt\ncom/heytap/health/hrv/ui/item/StressStatAnalyzeViewKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,498:1\n154#2:499\n164#2:533\n154#2:534\n154#2:611\n154#2:778\n154#2:935\n154#2:946\n154#2:1100\n164#2:1144\n154#2:1145\n154#2:1146\n164#2:1180\n154#2:1181\n74#3,6:500\n80#3:532\n84#3:539\n74#3,6:573\n80#3:605\n84#3:610\n74#3,6:612\n80#3:644\n84#3:649\n74#3,6:688\n80#3:720\n84#3:777\n74#3,6:779\n80#3:811\n84#3:829\n74#3,6:868\n80#3:900\n84#3:945\n74#3,6:947\n80#3:979\n84#3:984\n74#3,6:1023\n80#3:1055\n84#3:1099\n74#3,6:1101\n80#3:1133\n84#3:1138\n74#3,6:1147\n80#3:1179\n84#3:1186\n75#4:506\n76#4,11:508\n89#4:538\n75#4:546\n76#4,11:548\n75#4:579\n76#4,11:581\n89#4:609\n75#4:618\n76#4,11:620\n89#4:648\n89#4:653\n75#4:661\n76#4,11:663\n75#4:694\n76#4,11:696\n75#4:728\n76#4,11:730\n89#4:771\n89#4:776\n75#4:785\n76#4,11:787\n89#4:828\n89#4:833\n75#4:841\n76#4,11:843\n75#4:874\n76#4,11:876\n75#4:908\n76#4,11:910\n89#4:939\n89#4:944\n75#4:953\n76#4,11:955\n89#4:983\n89#4:988\n75#4:996\n76#4,11:998\n75#4:1029\n76#4,11:1031\n75#4:1063\n76#4,11:1065\n89#4:1093\n89#4:1098\n75#4:1107\n76#4,11:1109\n89#4:1137\n89#4:1142\n75#4:1153\n76#4,11:1155\n89#4:1185\n76#5:507\n76#5:547\n76#5:580\n76#5:619\n76#5:662\n76#5:695\n76#5:729\n76#5:786\n76#5:842\n76#5:875\n76#5:909\n76#5:954\n76#5:997\n76#5:1030\n76#5:1064\n76#5:1108\n76#5:1154\n76#5:1187\n460#6,13:519\n473#6,3:535\n460#6,13:559\n460#6,13:592\n473#6,3:606\n460#6,13:631\n473#6,3:645\n473#6,3:650\n460#6,13:674\n460#6,13:707\n460#6,13:741\n473#6,3:768\n473#6,3:773\n460#6,13:798\n473#6,3:825\n473#6,3:830\n460#6,13:854\n460#6,13:887\n460#6,13:921\n473#6,3:936\n473#6,3:941\n460#6,13:966\n473#6,3:980\n473#6,3:985\n460#6,13:1009\n460#6,13:1042\n460#6,13:1076\n473#6,3:1090\n473#6,3:1095\n460#6,13:1120\n473#6,3:1134\n473#6,3:1139\n460#6,13:1166\n473#6,3:1182\n75#7,6:540\n81#7:572\n85#7:654\n75#7,6:655\n81#7:687\n74#7,7:721\n81#7:754\n85#7:772\n85#7:834\n75#7,6:835\n81#7:867\n74#7,7:901\n81#7:934\n85#7:940\n85#7:989\n75#7,6:990\n81#7:1022\n74#7,7:1056\n81#7:1089\n85#7:1094\n85#7:1143\n1098#8:755\n927#8,6:756\n927#8,6:762\n1098#8:812\n927#8,6:813\n927#8,6:819\n*S KotlinDebug\n*F\n+ 1 StressStatAnalyzeView.kt\ncom/heytap/health/hrv/ui/item/StressStatAnalyzeViewKt\n*L\n82#1:499\n87#1:533\n88#1:534\n163#1:611\n223#1:778\n291#1:935\n301#1:946\n361#1:1100\n445#1:1144\n446#1:1145\n467#1:1146\n472#1:1180\n473#1:1181\n80#1:500,6\n80#1:532\n80#1:539\n148#1:573,6\n148#1:605\n148#1:610\n160#1:612,6\n160#1:644\n160#1:649\n191#1:688,6\n191#1:720\n191#1:777\n220#1:779,6\n220#1:811\n220#1:829\n263#1:868,6\n263#1:900\n263#1:945\n298#1:947,6\n298#1:979\n298#1:984\n331#1:1023,6\n331#1:1055\n331#1:1099\n358#1:1101,6\n358#1:1133\n358#1:1138\n465#1:1147,6\n465#1:1179\n465#1:1186\n80#1:506\n80#1:508,11\n80#1:538\n143#1:546\n143#1:548,11\n148#1:579\n148#1:581,11\n148#1:609\n160#1:618\n160#1:620,11\n160#1:648\n143#1:653\n186#1:661\n186#1:663,11\n191#1:694\n191#1:696,11\n193#1:728\n193#1:730,11\n193#1:771\n191#1:776\n220#1:785\n220#1:787,11\n220#1:828\n186#1:833\n258#1:841\n258#1:843,11\n263#1:874\n263#1:876,11\n270#1:908\n270#1:910,11\n270#1:939\n263#1:944\n298#1:953\n298#1:955,11\n298#1:983\n258#1:988\n326#1:996\n326#1:998,11\n331#1:1029\n331#1:1031,11\n338#1:1063\n338#1:1065,11\n338#1:1093\n331#1:1098\n358#1:1107\n358#1:1109,11\n358#1:1137\n326#1:1142\n465#1:1153\n465#1:1155,11\n465#1:1185\n80#1:507\n143#1:547\n148#1:580\n160#1:619\n186#1:662\n191#1:695\n193#1:729\n220#1:786\n258#1:842\n263#1:875\n270#1:909\n298#1:954\n326#1:997\n331#1:1030\n338#1:1064\n358#1:1108\n465#1:1154\n484#1:1187\n80#1:519,13\n80#1:535,3\n143#1:559,13\n148#1:592,13\n148#1:606,3\n160#1:631,13\n160#1:645,3\n143#1:650,3\n186#1:674,13\n191#1:707,13\n193#1:741,13\n193#1:768,3\n191#1:773,3\n220#1:798,13\n220#1:825,3\n186#1:830,3\n258#1:854,13\n263#1:887,13\n270#1:921,13\n270#1:936,3\n263#1:941,3\n298#1:966,13\n298#1:980,3\n258#1:985,3\n326#1:1009,13\n331#1:1042,13\n338#1:1076,13\n338#1:1090,3\n331#1:1095,3\n358#1:1120,13\n358#1:1134,3\n326#1:1139,3\n465#1:1166,13\n465#1:1182,3\n143#1:540,6\n143#1:572\n143#1:654\n186#1:655,6\n186#1:687\n193#1:721,7\n193#1:754\n193#1:772\n186#1:834\n258#1:835,6\n258#1:867\n270#1:901,7\n270#1:934\n270#1:940\n258#1:989\n326#1:990,6\n326#1:1022\n338#1:1056,7\n338#1:1089\n338#1:1094\n326#1:1143\n196#1:755\n197#1:756,6\n206#1:762,6\n226#1:812\n227#1:813,6\n236#1:819,6\n*E\n"})
public final class StressStatAnalyzeViewKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i, final AnalyzeData analyzeData, Composer composer, final int i2) {
        String strStringResource;
        String strStringResource2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1874700140);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1874700140, i2, -1, "com.heytap.health.hrv.ui.item.CurrentNotice (StressStatAnalyzeView.kt:324)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierI = StressDayDataViewKt.I(IntrinsicKt.height(companion, IntrinsicSize.Max), 0.0f, 0.0f, 3, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierI);
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
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (i == 5) {
            composerStartRestartGroup.startReplaceableGroup(2129026596);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_current_week_notice_v1, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(2129026714);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_current_month_notice_v1, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        f(strStringResource, composerStartRestartGroup, 0);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl3 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        int i3 = R$plurals.health_hrv_stress_notice_count_v1;
        String content = th7.d(i3, analyzeData.getCurrentNotice(), String.valueOf(analyzeData.getCurrentNotice()));
        if (!s(analyzeData.getMostStress())) {
            content = "--";
        }
        long jColorResource = ColorResources_androidKt.colorResource(R$color.health_base_black_90alpha, composerStartRestartGroup, 0);
        FontWeight.Companion companion4 = FontWeight.INSTANCE;
        FontWeight w500 = companion4.getW500();
        long sp = TextUnitKt.getSp(24);
        Intrinsics.checkNotNullExpressionValue(content, "content");
        TextKt.m1201Text4IGK_g(content, (Modifier) null, jColorResource, sp, (FontStyle) null, w500, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        g(composerStartRestartGroup, 0);
        Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl4 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (i == 5) {
            composerStartRestartGroup.startReplaceableGroup(2129027835);
            strStringResource2 = StringResources_androidKt.stringResource(R$string.health_hrv_last_week_stress_notice_v1, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(2129027957);
            strStringResource2 = StringResources_androidKt.stringResource(R$string.health_hrv_last_month_stress_notice_v1, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        f(strStringResource2, composerStartRestartGroup, 0);
        String content2 = th7.d(i3, analyzeData.getLastNotice(), String.valueOf(analyzeData.getLastNotice()));
        if (analyzeData.getLastStressAvg() == 0) {
            content2 = "--";
        }
        long jColorResource2 = ColorResources_androidKt.colorResource(R$color.health_base_black_55alpha, composerStartRestartGroup, 0);
        FontWeight w501 = companion4.getW500();
        long sp2 = TextUnitKt.getSp(24);
        Intrinsics.checkNotNullExpressionValue(content2, "content");
        TextKt.m1201Text4IGK_g(content2, (Modifier) null, jColorResource2, sp2, (FontStyle) null, w501, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt$CurrentNotice$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                StressStatAnalyzeViewKt.a(i, analyzeData, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x0112  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Code duplicated, block: B:73:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x019d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0245  */
    /* JADX WARN: Code duplicated, block: B:86:0x0251  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final int i, @Nullable LiveData<AnalyzeData> liveData, @Nullable LiveData<MenstrualCycleData> liveData2, @Nullable Modifier modifier, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        LiveData<AnalyzeData> mutableLiveData;
        LiveData<MenstrualCycleData> mutableLiveData2;
        int i5;
        LiveData<AnalyzeData> liveData3;
        Modifier modifier3;
        boolean hasData;
        AnalyzeData analyzeData;
        float f;
        Function0<ComposeUiNode> constructor;
        final LiveData<MenstrualCycleData> liveData4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-758914408);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 128;
        }
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 7168) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 6) != 6 && (i4 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                liveData3 = liveData;
                liveData4 = liveData2;
                modifier4 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        mutableLiveData = new MutableLiveData<>(new AnalyzeData(0, 0, null, null, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null));
                        i4 &= ErrorInfo.OC_OPTION_ERROR_DIR;
                    } else {
                        mutableLiveData = liveData;
                    }
                    if (i7 != 0) {
                        mutableLiveData2 = new MutableLiveData<>(new MenstrualCycleData(false, 0, 0, 0, 0, 31, null));
                        i4 &= -897;
                    } else {
                        mutableLiveData2 = liveData2;
                    }
                    if (i8 != 0) {
                        i5 = i4;
                        liveData3 = mutableLiveData;
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        i5 = i4;
                        liveData3 = mutableLiveData;
                        modifier3 = modifier2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if (i6 != 0) {
                        i4 &= ErrorInfo.OC_OPTION_ERROR_DIR;
                    }
                    if (i7 != 0) {
                        i4 &= -897;
                    }
                    mutableLiveData2 = liveData2;
                    i5 = i4;
                    modifier3 = modifier2;
                    liveData3 = liveData;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-758914408, i5, -1, "com.heytap.health.hrv.ui.item.DataAnalyze (StressStatAnalyzeView.kt:65)");
                }
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(liveData3, composerStartRestartGroup, 8);
                MenstrualCycleData menstrualCycleData = (MenstrualCycleData) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, 8).getValue();
                hasData = menstrualCycleData != null ? true ^ menstrualCycleData.getHasData() : true;
                analyzeData = (AnalyzeData) stateObserveAsState.getValue();
                if (analyzeData != null) {
                    float f2 = 10;
                    float fM4104constructorimpl = Dp.m4104constructorimpl(f2);
                    if (hasData) {
                        f = 20;
                    } else {
                        f = 0;
                    }
                    Modifier modifierD = ComposeItemKt.d(PaddingKt.m430paddingqDBjuR0$default(modifier3, 0.0f, fM4104constructorimpl, 0.0f, Dp.m4104constructorimpl(f), 5, null));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierD);
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
                    Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    f(StringResources_androidKt.stringResource(R$string.health_hrv_data_detail_title, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                    DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m4104constructorimpl(f2), 0.0f, Dp.m4104constructorimpl(4), 5, null), ColorResources_androidKt.colorResource(R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
                    h(analyzeData, composerStartRestartGroup, 8);
                    int i9 = (i5 & 14) | 64;
                    c(i, analyzeData, composerStartRestartGroup, i9);
                    e(i, analyzeData, composerStartRestartGroup, i9);
                    a(i, analyzeData, composerStartRestartGroup, i9);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                liveData4 = mutableLiveData2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final LiveData<AnalyzeData> liveData5 = liveData3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt$DataAnalyze$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    StressStatAnalyzeViewKt.b(i, liveData5, liveData4, modifier4, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i3 & 6) != 6) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i6 != 0) {
                    mutableLiveData = new MutableLiveData<>(new AnalyzeData(0, 0, null, null, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null));
                    i4 &= ErrorInfo.OC_OPTION_ERROR_DIR;
                } else {
                    mutableLiveData = liveData;
                }
                if (i7 != 0) {
                    mutableLiveData2 = new MutableLiveData<>(new MenstrualCycleData(false, 0, 0, 0, 0, 31, null));
                    i4 &= -897;
                } else {
                    mutableLiveData2 = liveData2;
                }
                if (i8 != 0) {
                    i5 = i4;
                    liveData3 = mutableLiveData;
                    modifier3 = Modifier.INSTANCE;
                } else {
                    i5 = i4;
                    liveData3 = mutableLiveData;
                    modifier3 = modifier2;
                }
            } else {
                if (i6 != 0) {
                    mutableLiveData = new MutableLiveData<>(new AnalyzeData(0, 0, null, null, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null));
                    i4 &= ErrorInfo.OC_OPTION_ERROR_DIR;
                } else {
                    mutableLiveData = liveData;
                }
                if (i7 != 0) {
                    mutableLiveData2 = new MutableLiveData<>(new MenstrualCycleData(false, 0, 0, 0, 0, 31, null));
                    i4 &= -897;
                } else {
                    mutableLiveData2 = liveData2;
                }
                if (i8 != 0) {
                    i5 = i4;
                    liveData3 = mutableLiveData;
                    modifier3 = Modifier.INSTANCE;
                } else {
                    i5 = i4;
                    liveData3 = mutableLiveData;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-758914408, i5, -1, "com.heytap.health.hrv.ui.item.DataAnalyze (StressStatAnalyzeView.kt:65)");
            }
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(liveData3, composerStartRestartGroup, 8);
            MenstrualCycleData menstrualCycleData2 = (MenstrualCycleData) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, 8).getValue();
            if (menstrualCycleData2 != null) {
            }
            analyzeData = (AnalyzeData) stateObserveAsState2.getValue();
            if (analyzeData != null) {
                float f3 = 10;
                float fM4104constructorimpl2 = Dp.m4104constructorimpl(f3);
                if (hasData) {
                    f = 20;
                } else {
                    f = 0;
                }
                Modifier modifierD2 = ComposeItemKt.d(PaddingKt.m430paddingqDBjuR0$default(modifier3, 0.0f, fM4104constructorimpl2, 0.0f, Dp.m4104constructorimpl(f), 5, null));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierD2);
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
                Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion2.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                f(StringResources_androidKt.stringResource(R$string.health_hrv_data_detail_title, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m4104constructorimpl(f3), 0.0f, Dp.m4104constructorimpl(4), 5, null), ColorResources_androidKt.colorResource(R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
                h(analyzeData, composerStartRestartGroup, 8);
                int i10 = (i5 & 14) | 64;
                c(i, analyzeData, composerStartRestartGroup, i10);
                e(i, analyzeData, composerStartRestartGroup, i10);
                a(i, analyzeData, composerStartRestartGroup, i10);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            liveData4 = mutableLiveData2;
            modifier4 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i6 != 0) {
                    mutableLiveData = new MutableLiveData<>(new AnalyzeData(0, 0, null, null, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null));
                    i4 &= ErrorInfo.OC_OPTION_ERROR_DIR;
                } else {
                    mutableLiveData = liveData;
                }
                if (i7 != 0) {
                    mutableLiveData2 = new MutableLiveData<>(new MenstrualCycleData(false, 0, 0, 0, 0, 31, null));
                    i4 &= -897;
                } else {
                    mutableLiveData2 = liveData2;
                }
                if (i8 != 0) {
                    i5 = i4;
                    liveData3 = mutableLiveData;
                    modifier3 = Modifier.INSTANCE;
                } else {
                    i5 = i4;
                    liveData3 = mutableLiveData;
                    modifier3 = modifier2;
                }
            } else {
                if (i6 != 0) {
                    mutableLiveData = new MutableLiveData<>(new AnalyzeData(0, 0, null, null, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null));
                    i4 &= ErrorInfo.OC_OPTION_ERROR_DIR;
                } else {
                    mutableLiveData = liveData;
                }
                if (i7 != 0) {
                    mutableLiveData2 = new MutableLiveData<>(new MenstrualCycleData(false, 0, 0, 0, 0, 31, null));
                    i4 &= -897;
                } else {
                    mutableLiveData2 = liveData2;
                }
                if (i8 != 0) {
                    i5 = i4;
                    liveData3 = mutableLiveData;
                    modifier3 = Modifier.INSTANCE;
                } else {
                    i5 = i4;
                    liveData3 = mutableLiveData;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-758914408, i5, -1, "com.heytap.health.hrv.ui.item.DataAnalyze (StressStatAnalyzeView.kt:65)");
            }
            State stateObserveAsState3 = LiveDataAdapterKt.observeAsState(liveData3, composerStartRestartGroup, 8);
            MenstrualCycleData menstrualCycleData3 = (MenstrualCycleData) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, 8).getValue();
            if (menstrualCycleData3 != null) {
            }
            analyzeData = (AnalyzeData) stateObserveAsState3.getValue();
            if (analyzeData != null) {
                float f4 = 10;
                float fM4104constructorimpl3 = Dp.m4104constructorimpl(f4);
                if (hasData) {
                    f = 20;
                } else {
                    f = 0;
                }
                Modifier modifierD3 = ComposeItemKt.d(PaddingKt.m430paddingqDBjuR0$default(modifier3, 0.0f, fM4104constructorimpl3, 0.0f, Dp.m4104constructorimpl(f), 5, null));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierD3);
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
                Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                f(StringResources_androidKt.stringResource(R$string.health_hrv_data_detail_title, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m4104constructorimpl(f4), 0.0f, Dp.m4104constructorimpl(4), 5, null), ColorResources_androidKt.colorResource(R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
                h(analyzeData, composerStartRestartGroup, 8);
                int i11 = (i5 & 14) | 64;
                c(i, analyzeData, composerStartRestartGroup, i11);
                e(i, analyzeData, composerStartRestartGroup, i11);
                a(i, analyzeData, composerStartRestartGroup, i11);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            liveData4 = mutableLiveData2;
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final LiveData<AnalyzeData> liveData6 = liveData3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt$DataAnalyze$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                StressStatAnalyzeViewKt.b(i, liveData6, liveData4, modifier4, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final int i, final AnalyzeData analyzeData, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-713801762);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-713801762, i2, -1, "com.heytap.health.hrv.ui.item.MinAndMax (StressStatAnalyzeView.kt:184)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierI = StressDayDataViewKt.I(IntrinsicKt.height(companion, IntrinsicSize.Max), 0.0f, 0.0f, 3, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        int i3 = 0;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierI);
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
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        f(StringResources_androidKt.stringResource(R$string.health_hrv_most_relax, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
        Alignment.Vertical bottom = companion2.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), bottom, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl3 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(772690282);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(i3, 1, null);
        Brush brushR = r(analyzeData.getMostRelax().getStress(), composerStartRestartGroup, 0);
        FontWeight.Companion companion4 = FontWeight.INSTANCE;
        int iPushStyle = builder.pushStyle(new SpanStyle(brushR, 0.0f, TextUnitKt.getSp(24), companion4.getW700(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 131058, null));
        try {
            builder.append(l05.k(String.valueOf(analyzeData.getMostRelax().getStress()), null, 1, null));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            long sp = TextUnitKt.getSp(12);
            int i4 = R$color.health_base_black_55alpha;
            int iPushStyle2 = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(i4, composerStartRestartGroup, 0), sp, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
            try {
                builder.append("  ");
                builder.append(p(i, analyzeData.getMostRelax().getStartTimestamp()));
                builder.pop(iPushStyle2);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1202TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 262142);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                int i5 = 0;
                g(composerStartRestartGroup, 0);
                Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl4 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                f(StringResources_androidKt.stringResource(R$string.health_hrv_most_stress, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(i5, 1, null);
                int iPushStyle3 = builder2.pushStyle(new SpanStyle(r(analyzeData.getMostStress().getStress(), composerStartRestartGroup, 0), 0.0f, TextUnitKt.getSp(24), companion4.getW700(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 131058, null));
                try {
                    builder2.append(l05.k(String.valueOf(analyzeData.getMostStress().getStress()), null, 1, null));
                    builder2.pop(iPushStyle3);
                    int iPushStyle4 = builder2.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(i4, composerStartRestartGroup, 0), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                    try {
                        builder2.append("  ");
                        builder2.append(p(i, analyzeData.getMostStress().getStartTimestamp()));
                        builder2.pop(iPushStyle4);
                        TextKt.m1202TextIbK3jfQ(builder2.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 262142);
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
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt$MinAndMax$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i6) {
                                StressStatAnalyzeViewKt.c(i, analyzeData, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                            }
                        });
                    } catch (Throwable th) {
                        builder2.pop(iPushStyle4);
                        throw th;
                    }
                } catch (Throwable th2) {
                    builder2.pop(iPushStyle3);
                    throw th2;
                }
            } catch (Throwable th3) {
                builder.pop(iPushStyle2);
                throw th3;
            }
        } catch (Throwable th4) {
            builder.pop(iPushStyle);
            throw th4;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(locale = "zh")
    public static final void d(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1074922748);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1074922748, i, -1, "com.heytap.health.hrv.ui.item.PreviewTest (StressStatAnalyzeView.kt:482)");
            }
            e88.d((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            AnalyzeData analyzeData = new AnalyzeData(0, 0, null, null, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
            analyzeData.r(80);
            analyzeData.q(38);
            StressDetailData stressDetailData = new StressDetailData(0L, 0, 3, null);
            stressDetailData.c(System.currentTimeMillis());
            stressDetailData.d(52);
            analyzeData.o(stressDetailData);
            StressDetailData stressDetailData2 = new StressDetailData(0L, 0, 3, null);
            stressDetailData2.c(System.currentTimeMillis());
            stressDetailData2.d(10);
            analyzeData.p(stressDetailData2);
            b(6, new MutableLiveData(analyzeData), null, null, composerStartRestartGroup, 64, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt$PreviewTest$1
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
                StressStatAnalyzeViewKt.d(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(final int i, final AnalyzeData analyzeData, Composer composer, final int i2) {
        String strStringResource;
        int i3;
        String strStringResource2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-439453396);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-439453396, i2, -1, "com.heytap.health.hrv.ui.item.StressPercent (StressStatAnalyzeView.kt:256)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierI = StressDayDataViewKt.I(IntrinsicKt.height(companion, IntrinsicSize.Max), 0.0f, 0.0f, 3, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierI);
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
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (i == 5) {
            composerStartRestartGroup.startReplaceableGroup(-517585566);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_compare_to_last_week, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-517585450);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_compare_to_last_month, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        f(strStringResource, composerStartRestartGroup, 0);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl3 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(2094254647);
        String strStringResource3 = analyzeData.getCurrentAvgIncrease() == 0 ? StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_equal, composerStartRestartGroup, 0) : l05.j(String.valueOf(Math.abs(analyzeData.getCurrentAvgIncrease())), "%");
        composerStartRestartGroup.endReplaceableGroup();
        long jColorResource = ColorResources_androidKt.colorResource(R$color.health_base_black_90alpha, composerStartRestartGroup, 0);
        FontWeight.Companion companion4 = FontWeight.INSTANCE;
        TextKt.m1201Text4IGK_g(strStringResource3, (Modifier) null, jColorResource, TextUnitKt.getSp(24), (FontStyle) null, companion4.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
        int i4 = analyzeData.getCurrentAvgIncrease() > 0 ? R$drawable.health_hrv_ic_up : R$drawable.health_hrv_ic_down;
        composerStartRestartGroup.startReplaceableGroup(2094255493);
        if (analyzeData.getCurrentAvgIncrease() == 0 || analyzeData.getCurrentAvgIncrease() == Integer.MIN_VALUE) {
            i3 = 0;
        } else {
            i3 = 0;
            ImageKt.Image(PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0), "", PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        g(composerStartRestartGroup, i3);
        Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, i3);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl4 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i3));
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (i == 5) {
            composerStartRestartGroup.startReplaceableGroup(-517583776);
            strStringResource2 = StringResources_androidKt.stringResource(R$string.health_hrv_last_week_avg_stress, composerStartRestartGroup, i3);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-517583660);
            strStringResource2 = StringResources_androidKt.stringResource(R$string.health_hrv_last_month_avg_stress, composerStartRestartGroup, i3);
            composerStartRestartGroup.endReplaceableGroup();
        }
        f(strStringResource2, composerStartRestartGroup, i3);
        TextKt.m1201Text4IGK_g(l05.k(String.valueOf(analyzeData.getLastStressAvg()), null, 1, null), (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_base_black_55alpha, composerStartRestartGroup, i3), TextUnitKt.getSp(24), (FontStyle) null, companion4.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt$StressPercent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i5) {
                StressStatAnalyzeViewKt.e(i, analyzeData, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(@NotNull final String text, @Nullable Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(943654669);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(943654669, i2, -1, "com.heytap.health.hrv.ui.item.SubTitle (StressStatAnalyzeView.kt:451)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1201Text4IGK_g(text, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_base_black_90alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i2 & 14) | 199680, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt$SubTitle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i3) {
                StressStatAnalyzeViewKt.f(text, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-487040627);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-487040627, i, -1, "com.heytap.health.hrv.ui.item.VerticalDivider (StressStatAnalyzeView.kt:440)");
            }
            float f = 6;
            BoxKt.Box(BackgroundKt.m163backgroundbw27NRU$default(PaddingKt.m430paddingqDBjuR0$default(SizeKt.m474width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl((float) 0.33d)), 0.0f, Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(f), 5, null), ColorResources_androidKt.colorResource(R$color.health_base_black_20alpha, composerStartRestartGroup, 0), null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt$VerticalDivider$1
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
                StressStatAnalyzeViewKt.g(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void h(final AnalyzeData analyzeData, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248071101);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1248071101, i, -1, "com.heytap.health.hrv.ui.item.WorkAndWeekend (StressStatAnalyzeView.kt:141)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierI = StressDayDataViewKt.I(IntrinsicKt.height(companion, IntrinsicSize.Max), 0.0f, 0.0f, 3, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierI);
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
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        f(StringResources_androidKt.stringResource(R$string.health_hrv_workday_avg_stress, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
        String strK = l05.k(String.valueOf(analyzeData.getWorkDayAvg()), null, 1, null);
        Brush brushR = r(analyzeData.getWorkDayAvg(), composerStartRestartGroup, 0);
        FontWeight.Companion companion4 = FontWeight.INSTANCE;
        TextKt.m1201Text4IGK_g(strK, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(brushR, 0.0f, TextUnitKt.getSp(24), companion4.getW700(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 33554418, null), composerStartRestartGroup, 0, 0, 65534);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        g(composerStartRestartGroup, 0);
        Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl3 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        f(StringResources_androidKt.stringResource(R$string.health_hrv_weekend_avg_stress, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
        TextKt.m1201Text4IGK_g(l05.k(String.valueOf(analyzeData.getWeekendAvg()), null, 1, null), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(r(analyzeData.getWeekendAvg(), composerStartRestartGroup, 0), 0.0f, TextUnitKt.getSp(24), companion4.getW700(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 33554418, null), composerStartRestartGroup, 0, 0, 65534);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt$WorkAndWeekend$2
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
                StressStatAnalyzeViewKt.h(analyzeData, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:39:0x018a  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void i(@Nullable LiveData<AnalyzeData> liveData, @Nullable Composer composer, final int i, final int i2) {
        final LiveData<AnalyzeData> mutableLiveData;
        AnalyzeData analyzeData;
        Function0<ComposeUiNode> constructor;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1713119485);
        int i3 = i2 & 1;
        int i4 = i3 != 0 ? i | 2 : i;
        if (i3 == 1 && (i4 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableLiveData = liveData;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i3 != 0) {
                    mutableLiveData = new MutableLiveData(new AnalyzeData(0, 0, null, null, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null));
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1713119485, i, -1, "com.heytap.health.hrv.ui.item.YearAnalyze (StressStatAnalyzeView.kt:461)");
                }
                analyzeData = (AnalyzeData) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue();
                if (analyzeData != null) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float f = 10;
                    Modifier modifierD = ComposeItemKt.d(PaddingKt.m430paddingqDBjuR0$default(AutoClipContentModifierKt.b(companion), 0.0f, Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(20), 5, null));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierD);
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
                    Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl, density, companion2.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    f(StringResources_androidKt.stringResource(R$string.health_hrv_data_detail_title, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                    DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(4), 5, null), ColorResources_androidKt.colorResource(R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
                    c(6, analyzeData, composerStartRestartGroup, 64);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            mutableLiveData = liveData;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1713119485, i, -1, "com.heytap.health.hrv.ui.item.YearAnalyze (StressStatAnalyzeView.kt:461)");
            }
            analyzeData = (AnalyzeData) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue();
            if (analyzeData != null) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                float f2 = 10;
                Modifier modifierD2 = ComposeItemKt.d(PaddingKt.m430paddingqDBjuR0$default(AutoClipContentModifierKt.b(companion3), 0.0f, Dp.m4104constructorimpl(f2), 0.0f, Dp.m4104constructorimpl(20), 5, null));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierD2);
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
                Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion4.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                f(StringResources_androidKt.stringResource(R$string.health_hrv_data_detail_title, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(companion3, 0.0f, Dp.m4104constructorimpl(f2), 0.0f, Dp.m4104constructorimpl(4), 5, null), ColorResources_androidKt.colorResource(R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
                c(6, analyzeData, composerStartRestartGroup, 64);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressStatAnalyzeViewKt$YearAnalyze$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i5) {
                StressStatAnalyzeViewKt.i(mutableLiveData, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final String o(long j2) {
        String strG = lo9.g(j2, "MMMdd");
        Intrinsics.checkNotNullExpressionValue(strG, "localeDateFormat(timeStamp, \"MMMdd\")");
        return strG;
    }

    public static final String p(int i, long j2) {
        if (j2 == 0) {
            return "";
        }
        return i == 5 ? q(j2) : o(j2);
    }

    public static final String q(long j2) {
        LocalDate localDate = Instant.ofEpochMilli(j2).atZone(ZoneId.systemDefault()).toLocalDate();
        Context contextA = e88.a();
        String[] strArr = {contextA.getString(com.heytap.health.base.R$string.lib_base_date_monday), contextA.getString(com.heytap.health.base.R$string.lib_base_date_tuesday), contextA.getString(com.heytap.health.base.R$string.lib_base_date_wednesday), contextA.getString(com.heytap.health.base.R$string.lib_base_date_thursday), contextA.getString(com.heytap.health.base.R$string.lib_base_date_friday), contextA.getString(com.heytap.health.base.R$string.lib_base_date_saturday), contextA.getString(com.heytap.health.base.R$string.lib_base_date_sunday)};
        String strG = lo9.g(j2, "HHmm");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strArr[localDate.getDayOfWeek().getValue() - 1], strG}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Composable
    public static final Brush r(int i, Composer composer, int i2) {
        Brush brushM1567horizontalGradient8A3gB4$default;
        composer.startReplaceableGroup(-1405313530);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1405313530, i2, -1, "com.heytap.health.hrv.ui.item.createBrushWithState (StressStatAnalyzeView.kt:99)");
        }
        if (76 <= i && i < 101) {
            composer.startReplaceableGroup(1093366376);
            brushM1567horizontalGradient8A3gB4$default = Brush.Companion.m1567horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(com.heytap.health.hrv.R$color.health_hrv_stress_excellent_start, composer, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(com.heytap.health.hrv.R$color.health_hrv_stress_excellent_end, composer, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
            composer.endReplaceableGroup();
        } else {
            if (51 <= i && i < 76) {
                composer.startReplaceableGroup(1093366666);
                brushM1567horizontalGradient8A3gB4$default = Brush.Companion.m1567horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(com.heytap.health.hrv.R$color.health_hrv_stress_good_start, composer, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(com.heytap.health.hrv.R$color.health_hrv_stress_good_end, composer, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
                composer.endReplaceableGroup();
            } else {
                if (26 <= i && i < 51) {
                    composer.startReplaceableGroup(1093366946);
                    brushM1567horizontalGradient8A3gB4$default = Brush.Companion.m1567horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(com.heytap.health.hrv.R$color.health_hrv_stress_normal_start, composer, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(com.heytap.health.hrv.R$color.health_hrv_stress_normal_end, composer, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
                    composer.endReplaceableGroup();
                } else {
                    if (1 <= i && i < 26) {
                        composer.startReplaceableGroup(1093367229);
                        brushM1567horizontalGradient8A3gB4$default = Brush.Companion.m1567horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(com.heytap.health.hrv.R$color.health_hrv_stress_over_start, composer, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(com.heytap.health.hrv.R$color.health_hrv_stress_over_end, composer, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(1093367504);
                        Brush.Companion companion = Brush.INSTANCE;
                        int i3 = R$color.health_base_black_90alpha;
                        brushM1567horizontalGradient8A3gB4$default = Brush.Companion.m1567horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(i3, composer, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(i3, composer, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
                        composer.endReplaceableGroup();
                    }
                }
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return brushM1567horizontalGradient8A3gB4$default;
    }

    public static final boolean s(StressDetailData stressDetailData) {
        return (stressDetailData.getStress() == Integer.MAX_VALUE || stressDetailData.getStress() == Integer.MIN_VALUE || stressDetailData.getStress() == 0) ? false : true;
    }
}