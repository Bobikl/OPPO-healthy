package com.heytap.health.sunshine.ui.compose;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.heytap.health.base.R$color;
import com.heytap.wearable.emergency.api.emergency.EmergencyMainApis;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "cardCode", EmergencyMainApis.EVENT_OPEN_PAGE_PRAM_CODE, "", "a", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "sunshine_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nKnowledgeItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KnowledgeItem.kt\ncom/heytap/health/sunshine/ui/compose/KnowledgeItemKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,74:1\n76#2:75\n76#2:90\n25#3:76\n460#3,13:102\n473#3,3:118\n1114#4,6:77\n74#5,6:83\n80#5:115\n84#5:122\n75#6:89\n76#6,11:91\n89#6:121\n164#7:116\n154#7:117\n*S KotlinDebug\n*F\n+ 1 KnowledgeItem.kt\ncom/heytap/health/sunshine/ui/compose/KnowledgeItemKt\n*L\n39#1:75\n43#1:90\n40#1:76\n43#1:102,13\n43#1:118,3\n40#1:77,6\n43#1:83,6\n43#1:115\n43#1:122\n43#1:89\n43#1:91,11\n43#1:121\n51#1:116\n52#1:117\n*E\n"})
public final class KnowledgeItemKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final String cardCode, @NotNull final String pageCode, @Nullable Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(pageCode, "pageCode");
        Composer composerStartRestartGroup = composer.startRestartGroup(-478398769);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(cardCode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(pageCode) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-478398769, i, -1, "com.heytap.health.sunshine.ui.compose.SunshineKnowledgeCard (KnowledgeItem.kt:34)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM = StatDataAnalyzeKt.m(companion);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl, density, companion2.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m1201Text4IGK_g("知识卡", (Modifier) null, ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199686, 0, 131026);
                float fM4104constructorimpl = Dp.m4104constructorimpl((float) 0.33d);
                Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(10), 0.0f, 0.0f, 13, null);
                composer2 = composerStartRestartGroup;
                DividerKt.m1008DivideroMI9zvI(modifierM430paddingqDBjuR0$default, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_10alpha, composer2, 0), fM4104constructorimpl, 0.0f, composer2, 390, 8);
                AndroidView_androidKt.AndroidView(new KnowledgeItemKt$SunshineKnowledgeCard$1$1(context, cardCode, pageCode, mutableState), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), null, composer2, 48, 4);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.KnowledgeItemKt$SunshineKnowledgeCard$2
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
                KnowledgeItemKt.a(cardCode, pageCode, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}