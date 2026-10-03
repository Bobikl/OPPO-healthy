package com.heytap.health.hrv.ui.item;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.heytap.health.core.operation.space.SpaceView;
import com.heytap.health.health_base.R$color;
import com.heytap.health.hrv.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/core/operation/space/SpaceView;", "spaceView", "", "a", "(Lcom/heytap/health/core/operation/space/SpaceView;Landroidx/compose/runtime/Composer;I)V", "hrv_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nKnowledgeItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KnowledgeItem.kt\ncom/heytap/health/hrv/ui/item/KnowledgeItemKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,59:1\n25#2:60\n460#2,13:86\n473#2,3:102\n1114#3,6:61\n74#4,6:67\n80#4:99\n84#4:106\n75#5:73\n76#5,11:75\n89#5:105\n76#6:74\n164#7:100\n154#7:101\n*S KotlinDebug\n*F\n+ 1 KnowledgeItem.kt\ncom/heytap/health/hrv/ui/item/KnowledgeItemKt\n*L\n36#1:60\n39#1:86,13\n39#1:102,3\n36#1:61,6\n39#1:67,6\n39#1:99\n39#1:106\n39#1:73\n39#1:75,11\n39#1:105\n39#1:74\n42#1:100\n43#1:101\n*E\n"})
public final class KnowledgeItemKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final SpaceView spaceView, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(spaceView, "spaceView");
        Composer composerStartRestartGroup = composer.startRestartGroup(357644144);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357644144, i, -1, "com.heytap.health.hrv.ui.item.KnowledgeCardView (KnowledgeItem.kt:32)");
        }
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
            Modifier modifierD = ComposeItemKt.d(companion);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            StressDayDataViewKt.d(StringResources_androidKt.stringResource(R$string.health_hrv_konwledge_title, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
            DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(10), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
            AndroidView_androidKt.AndroidView(new KnowledgeItemKt$KnowledgeCardView$1$1(spaceView, mutableState), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), null, composerStartRestartGroup, 48, 4);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.KnowledgeItemKt$KnowledgeCardView$2
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
                KnowledgeItemKt.a(spaceView, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}