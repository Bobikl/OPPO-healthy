package com.heytap.health.sunshine.ui.compose;

import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.health_base.R$color;
import com.heytap.health.sunshine.R$plurals;
import com.heytap.health.sunshine.R$string;
import com.heytap.health.sunshine.constant.VitaminLevel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.AnalyzeData;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.n28;
import com.oplus.aiunit.vision.t70;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.util.List;
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
import p010kotlin.text.StringsKt__StringNumberConversionsKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\n\u0010\u0016\u001a\u00020\u0000*\u00020\u0000\u001a\f\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "type", "Landroidx/lifecycle/LiveData;", "Lcom/oplus/aiunit/vision/z10;", "analyzeDataLD", "", "a", "(Landroidx/compose/ui/Modifier;ILandroidx/lifecycle/LiveData;Landroidx/compose/runtime/Composer;II)V", "analyzeData", MapSchema.FIELD_NAME_ENTRY, "(ILcom/oplus/aiunit/vision/z10;Landroidx/compose/runtime/Composer;I)V", "c", "(Lcom/oplus/aiunit/vision/z10;Landroidx/compose/runtime/Composer;I)V", c7n.g, c7n.f, "(Landroidx/compose/runtime/Composer;I)V", "", "text", "f", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", LogFieldKey.MESSAGE_KEY, "o", "n", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Landroidx/compose/ui/graphics/Brush;", "brush", "b", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/runtime/Composer;I)V", "d", "sunshine_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStatDataAnalyze.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatDataAnalyze.kt\ncom/heytap/health/sunshine/ui/compose/StatDataAnalyzeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,368:1\n154#2:369\n154#2:403\n154#2:404\n154#2:405\n154#2:482\n154#2:597\n154#2:631\n154#2:675\n164#2:681\n154#2:682\n74#3,6:370\n80#3:402\n84#3:410\n74#3,6:444\n80#3:476\n84#3:481\n74#3,6:483\n80#3:515\n84#3:520\n74#3,6:559\n80#3:591\n84#3:596\n74#3,6:598\n80#3:630\n84#3:636\n74#3,6:642\n80#3:674\n84#3:680\n75#4:376\n76#4,11:378\n89#4:409\n75#4:417\n76#4,11:419\n75#4:450\n76#4,11:452\n89#4:480\n75#4:489\n76#4,11:491\n89#4:519\n89#4:524\n75#4:532\n76#4,11:534\n75#4:565\n76#4,11:567\n89#4:595\n75#4:604\n76#4,11:606\n89#4:635\n89#4:640\n75#4:648\n76#4,11:650\n89#4:679\n76#5:377\n76#5:418\n76#5:451\n76#5:490\n76#5:533\n76#5:566\n76#5:605\n76#5:649\n460#6,13:389\n473#6,3:406\n460#6,13:430\n460#6,13:463\n473#6,3:477\n460#6,13:502\n473#6,3:516\n473#6,3:521\n460#6,13:545\n460#6,13:578\n473#6,3:592\n460#6,13:617\n473#6,3:632\n473#6,3:637\n460#6,13:661\n473#6,3:676\n75#7,6:411\n81#7:443\n85#7:525\n75#7,6:526\n81#7:558\n85#7:641\n1098#8:683\n927#8,6:684\n927#8,6:690\n*S KotlinDebug\n*F\n+ 1 StatDataAnalyze.kt\ncom/heytap/health/sunshine/ui/compose/StatDataAnalyzeKt\n*L\n70#1:369\n74#1:403\n77#1:404\n80#1:405\n110#1:482\n194#1:597\n202#1:631\n243#1:675\n256#1:681\n257#1:682\n68#1:370,6\n68#1:402\n68#1:410\n96#1:444,6\n96#1:476\n96#1:481\n107#1:483,6\n107#1:515\n107#1:520\n181#1:559,6\n181#1:591\n181#1:596\n191#1:598,6\n191#1:630\n191#1:636\n214#1:642,6\n214#1:674\n214#1:680\n68#1:376\n68#1:378,11\n68#1:409\n91#1:417\n91#1:419,11\n96#1:450\n96#1:452,11\n96#1:480\n107#1:489\n107#1:491,11\n107#1:519\n91#1:524\n176#1:532\n176#1:534,11\n181#1:565\n181#1:567,11\n181#1:595\n191#1:604\n191#1:606,11\n191#1:635\n176#1:640\n214#1:648\n214#1:650,11\n214#1:679\n68#1:377\n91#1:418\n96#1:451\n107#1:490\n176#1:533\n181#1:566\n191#1:605\n214#1:649\n68#1:389,13\n68#1:406,3\n91#1:430,13\n96#1:463,13\n96#1:477,3\n107#1:502,13\n107#1:516,3\n91#1:521,3\n176#1:545,13\n181#1:578,13\n181#1:592,3\n191#1:617,13\n191#1:632,3\n176#1:637,3\n214#1:661,13\n214#1:676,3\n91#1:411,6\n91#1:443\n91#1:525\n176#1:526,6\n176#1:558\n176#1:641\n335#1:683\n336#1:684,6\n341#1:690,6\n*E\n"})
public final class StatDataAnalyzeKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@Nullable Modifier modifier, final int i, @Nullable LiveData<AnalyzeData> liveData, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        LiveData<AnalyzeData> mutableLiveData;
        Composer composerStartRestartGroup = composer.startRestartGroup(1360233507);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = i2 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 128;
        }
        if (i6 == 4 && (i4 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableLiveData = liveData;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if (i6 != 0) {
                    mutableLiveData = new MutableLiveData<>(new AnalyzeData(0, null, 0, null, 0, null, 0, 127, null));
                    i4 &= -897;
                } else {
                    mutableLiveData = liveData;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i6 != 0) {
                    i4 &= -897;
                }
                mutableLiveData = liveData;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1360233507, i4, -1, "com.heytap.health.sunshine.ui.compose.DataAnalyze (StatDataAnalyze.kt:59)");
            }
            AnalyzeData z10Var = (AnalyzeData) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue();
            if (z10Var != null) {
                float f = 20;
                float f2 = 16;
                Modifier modifierM = m(PaddingKt.m429paddingqDBjuR0(modifier3, Dp.m4104constructorimpl(f2), Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(f2), Dp.m4104constructorimpl(f)));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM);
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
                f(StringResources_androidKt.stringResource(R$string.health_sunshine_data_detail_title, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(10)), composerStartRestartGroup, 6);
                e(i, z10Var, composerStartRestartGroup, ((i4 >> 3) & 14) | 64);
                composerStartRestartGroup.startReplaceableGroup(1685113626);
                if (i != 7) {
                    SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(8)), composerStartRestartGroup, 6);
                    c(z10Var, composerStartRestartGroup, 8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(8)), composerStartRestartGroup, 6);
                h(z10Var, composerStartRestartGroup, 8);
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
        final Modifier modifier4 = modifier3;
        final LiveData<AnalyzeData> liveData2 = mutableLiveData;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$DataAnalyze$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i7) {
                StatDataAnalyzeKt.a(modifier4, i, liveData2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final String str, final Brush brush, Composer composer, final int i) {
        int i2;
        String str2;
        String strSubstring;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2072787021);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(brush) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2072787021, i, -1, "com.heytap.health.sunshine.ui.compose.GradientValueWithUnit (StatDataAnalyze.kt:314)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1633771654);
            int i3 = 0;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "--", false, 2, (Object) null)) {
                TextKt.m1201Text4IGK_g("--", (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_base_black_90alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getW700(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199686, 0, 131026);
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$GradientValueWithUnit$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i4) {
                        StatDataAnalyzeKt.b(str, brush, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    }
                });
                return;
            }
            composerStartRestartGroup.endReplaceableGroup();
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, StringUtil.SPACE, 0, false, 6, (Object) null);
            if (iIndexOf$default >= 0) {
                String strSubstring2 = str.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                str2 = strSubstring2;
            } else {
                str2 = str;
            }
            if (iIndexOf$default >= 0) {
                strSubstring = str.substring(iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            String str3 = strSubstring;
            long jColorResource = ColorResources_androidKt.colorResource(R$color.health_base_black_55alpha, composerStartRestartGroup, 0);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(i3, 1, defaultConstructorMarker);
            String str4 = str2;
            composer2 = composerStartRestartGroup;
            int iPushStyle = builder.pushStyle(new SpanStyle(brush, 0.0f, TextUnitKt.getSp(24), FontWeight.INSTANCE.getW700(), null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, BaselineShift.m3887boximpl(BaselineShift.m3888constructorimpl(-0.1f)), null, 0 == true ? 1 : 0, 0L, null, null, null, null, 130546, null));
            try {
                builder.append(str4);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                if ((str3.length() > 0) != false) {
                    int iPushStyle2 = builder.pushStyle(new SpanStyle(jColorResource, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                    try {
                        builder.append(str3);
                        builder.pop(iPushStyle2);
                    } catch (Throwable th) {
                        builder.pop(iPushStyle2);
                        throw th;
                    }
                }
                TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th2) {
                builder.pop(iPushStyle);
                throw th2;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$GradientValueWithUnit$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i4) {
                StatDataAnalyzeKt.b(str, brush, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final AnalyzeData z10Var, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-595694003);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-595694003, i, -1, "com.heytap.health.sunshine.ui.compose.MostLikeTimeAndType (StatDataAnalyze.kt:174)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierO = o(IntrinsicKt.height(companion, IntrinsicSize.Max));
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
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierO);
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
        f(StringResources_androidKt.stringResource(R$string.health_sunshine_most_like_time, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
        b(StringResources_androidKt.stringResource(R$string.health_sunshine_value_hour, new Object[]{z10Var.getMostLike()}, composerStartRestartGroup, 64), Brush.Companion.m1567horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4294945830L)), Color.m1608boximpl(ColorKt.Color(4294954022L))}), 0.0f, 0.0f, 0, 14, (Object) null), composerStartRestartGroup, 48);
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
        f(StringResources_androidKt.stringResource(R$string.health_sunshine_type, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
        String strN = n(z10Var.getType(), composerStartRestartGroup, 0);
        FontWeight w600 = FontWeight.INSTANCE.getW600();
        TextKt.m1201Text4IGK_g(strN, PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(2), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(R$color.health_base_black_90alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(20), (FontStyle) null, w600, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199728, 0, 131024);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$MostLikeTimeAndType$2
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
                StatDataAnalyzeKt.c(z10Var, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(locale = "zh")
    public static final void d(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-308391973);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-308391973, i, -1, "com.heytap.health.sunshine.ui.compose.PreviewTest (StatDataAnalyze.kt:355)");
            }
            AnalyzeData z10Var = new AnalyzeData(0, null, 0, null, 0, null, 0, 127, null);
            z10Var.m(t70.SPORTS_TIPS_SWITCH);
            z10Var.k(-26);
            z10Var.l("8-9");
            z10Var.n(1);
            z10Var.i(VitaminLevel.ENOUGH);
            z10Var.j(6);
            a(Modifier.INSTANCE, 5, new MutableLiveData(z10Var), composerStartRestartGroup, n28.GL_GEQUAL, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$PreviewTest$1
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
                StatDataAnalyzeKt.d(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(final int i, final AnalyzeData z10Var, Composer composer, final int i2) {
        String strStringResource;
        Brush brushM1567horizontalGradient8A3gB4$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(863149888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(863149888, i2, -1, "com.heytap.health.sunshine.ui.compose.ReachGoalAndCompare (StatDataAnalyze.kt:89)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierO = o(IntrinsicKt.height(companion, IntrinsicSize.Max));
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
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierO);
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
        f(StringResources_androidKt.stringResource(R$string.health_sunshine_reach_goal_count, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(z10Var.getReachGoalCount());
        String strPluralStringResource = StringResources_androidKt.pluralStringResource(R$plurals.health_sunshine_value_day, intOrNull != null ? intOrNull.intValue() : 0, new Object[]{z10Var.getReachGoalCount()}, composerStartRestartGroup, 512);
        Brush.Companion companion4 = Brush.INSTANCE;
        b(strPluralStringResource, Brush.Companion.m1567horizontalGradient8A3gB4$default(companion4, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4286438656L)), Color.m1608boximpl(ColorKt.Color(4279687754L))}), 0.0f, 0.0f, 0, 14, (Object) null), composerStartRestartGroup, 48);
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
        if (i == 5) {
            composerStartRestartGroup.startReplaceableGroup(283329627);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_sunshine_compare_to_last_week, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (i != 6) {
            composerStartRestartGroup.startReplaceableGroup(283329911);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_sunshine_best_month, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(283329776);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_sunshine_compare_to_last_month, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        f(strStringResource, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-514278302);
        if (i == 7) {
            brushM1567horizontalGradient8A3gB4$default = Brush.Companion.m1567horizontalGradient8A3gB4$default(companion4, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4294945830L)), Color.m1608boximpl(ColorKt.Color(4294954022L))}), 0.0f, 0.0f, 0, 14, (Object) null);
        } else if (z10Var.getCompareWithLast() == Integer.MIN_VALUE) {
            int i3 = com.heytap.health.ui.R$color.lib_ui_black;
            brushM1567horizontalGradient8A3gB4$default = Brush.Companion.m1567horizontalGradient8A3gB4$default(companion4, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(i3, composerStartRestartGroup, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(i3, composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
        } else {
            brushM1567horizontalGradient8A3gB4$default = z10Var.getCompareWithLast() >= 0 ? Brush.Companion.m1567horizontalGradient8A3gB4$default(companion4, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4286438656L)), Color.m1608boximpl(ColorKt.Color(4279687754L))}), 0.0f, 0.0f, 0, 14, (Object) null) : Brush.Companion.m1567horizontalGradient8A3gB4$default(companion4, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4294925690L)), Color.m1608boximpl(ColorKt.Color(4294936429L))}), 0.0f, 0.0f, 0, 14, (Object) null);
        }
        composerStartRestartGroup.endReplaceableGroup();
        String strValueOf = "--";
        if (i == 7) {
            if (z10Var.getBestMonth() != Integer.MIN_VALUE) {
                strValueOf = String.valueOf(z10Var.getBestMonth());
            }
        } else if (z10Var.getCompareWithLast() != Integer.MIN_VALUE) {
            String str = z10Var.getCompareWithLast() > 0 ? "+" : "";
            strValueOf = str + z10Var.getCompareWithLast();
        }
        b(i == 7 ? StringResources_androidKt.stringResource(R$string.health_sunshine_value_month, new Object[]{strValueOf}, composerStartRestartGroup, 64) : StringResources_androidKt.pluralStringResource(R$plurals.health_sunshine_value_minute, Math.abs(z10Var.getCompareWithLast()), new Object[]{strValueOf}, composerStartRestartGroup, 512), brushM1567horizontalGradient8A3gB4$default, composerStartRestartGroup, 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$ReachGoalAndCompare$2
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
                StatDataAnalyzeKt.e(i, z10Var, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(@NotNull final String text, @Nullable Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1780712028);
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
                ComposerKt.traceEventStart(-1780712028, i2, -1, "com.heytap.health.sunshine.ui.compose.SubTitle (StatDataAnalyze.kt:262)");
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$SubTitle$1
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
                StatDataAnalyzeKt.f(text, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2005610532);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2005610532, i, -1, "com.heytap.health.sunshine.ui.compose.VerticalDivider (StatDataAnalyze.kt:251)");
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$VerticalDivider$1
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
                StatDataAnalyzeKt.g(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void h(final AnalyzeData z10Var, Composer composer, final int i) {
        List listListOf;
        Composer composerStartRestartGroup = composer.startRestartGroup(-41515904);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-41515904, i, -1, "com.heytap.health.sunshine.ui.compose.VitaminDAndStatus (StatDataAnalyze.kt:212)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierO = o(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null));
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierO);
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
        f(StringResources_androidKt.stringResource(R$string.health_sunshine_avg_vitamin_d, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
        VitaminLevel vitaminLevelB = z10Var.getAvgVitaminD();
        composerStartRestartGroup.startReplaceableGroup(2045327470);
        if (vitaminLevelB == VitaminLevel.LOW) {
            listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4294925690L)), Color.m1608boximpl(ColorKt.Color(4294936429L))});
        } else if (vitaminLevelB == VitaminLevel.MIDDLE) {
            listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4281516260L)), Color.m1608boximpl(ColorKt.Color(4284259839L))});
        } else if (vitaminLevelB == VitaminLevel.ENOUGH) {
            listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4286438656L)), Color.m1608boximpl(ColorKt.Color(4279687754L))});
        } else {
            int i2 = com.heytap.health.ui.R$color.lib_ui_black;
            listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(i2, composerStartRestartGroup, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(i2, composerStartRestartGroup, 0))});
        }
        List list = listListOf;
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m1201Text4IGK_g(VitaminLevel.INSTANCE.a(z10Var.getAvgVitaminD()), PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(2), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Brush.Companion.m1567horizontalGradient8A3gB4$default(Brush.INSTANCE, list, 0.0f, 0.0f, 0, 14, (Object) null), 0.0f, TextUnitKt.getSp(20), FontWeight.INSTANCE.getW700(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 33554418, null), composerStartRestartGroup, 48, 0, 65532);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$VitaminDAndStatus$2
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
                StatDataAnalyzeKt.h(z10Var, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @NotNull
    public static final Modifier m(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$cardModifier$1
            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1210711018);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1210711018, i, -1, "com.heytap.health.sunshine.ui.compose.cardModifier.<anonymous> (StatDataAnalyze.kt:274)");
                }
                Modifier modifierM426padding3ABfNKs = PaddingKt.m426padding3ABfNKs(BackgroundKt.m162backgroundbw27NRU(SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composer, 0), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(12))), Dp.m4104constructorimpl(16));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM426padding3ABfNKs;
            }
        }, 1, null);
    }

    @Composable
    public static final String n(int i, Composer composer, int i2) {
        String strStringResource;
        composer.startReplaceableGroup(1628289935);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1628289935, i2, -1, "com.heytap.health.sunshine.ui.compose.getSunshineTypeText (StatDataAnalyze.kt:298)");
        }
        if (i == 1) {
            composer.startReplaceableGroup(-382734564);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_sunshine_type_dawn, composer, 0);
            composer.endReplaceableGroup();
        } else if (i == 2) {
            composer.startReplaceableGroup(-382734492);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_sunshine_type_morning, composer, 0);
            composer.endReplaceableGroup();
        } else if (i == 3) {
            composer.startReplaceableGroup(-382734417);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_sunshine_type_afternoon, composer, 0);
            composer.endReplaceableGroup();
        } else if (i != 4) {
            composer.startReplaceableGroup(1020141237);
            composer.endReplaceableGroup();
            strStringResource = "--";
        } else {
            composer.startReplaceableGroup(-382734340);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_sunshine_type_evening, composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    public static final Modifier o(Modifier modifier) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt$shadowCard$1
            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1782939891);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1782939891, i, -1, "com.heytap.health.sunshine.ui.compose.shadowCard.<anonymous> (StatDataAnalyze.kt:287)");
                }
                Modifier modifierM426padding3ABfNKs = PaddingKt.m426padding3ABfNKs(BackgroundKt.m162backgroundbw27NRU(SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.sunshine.R$color.health_sunshine_card_background, composer, 0), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(14))), Dp.m4104constructorimpl(12));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM426padding3ABfNKs;
            }
        }, 1, null);
    }
}