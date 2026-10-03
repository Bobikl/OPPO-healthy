package com.heytap.sports.record.details.widget;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SportLevelProgressBarComposeKt {

    @NotNull
    public static final ComposableSingletons$SportLevelProgressBarComposeKt INSTANCE = new ComposableSingletons$SportLevelProgressBarComposeKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f110lambda1 = ComposableLambdaKt.composableLambdaInstance(719731391, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.widget.ComposableSingletons$SportLevelProgressBarComposeKt$lambda-1$1
        @Override // p010kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(content, "content");
            if ((i & 14) == 0) {
                i |= composer.changedInstance(content) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(719731391, i, -1, "com.heytap.sports.record.details.widget.ComposableSingletons$SportLevelProgressBarComposeKt.lambda-1.<anonymous> (SportLevelProgressBarCompose.kt:244)");
            }
            float f = 12;
            Modifier modifierM426padding3ABfNKs = PaddingKt.m426padding3ABfNKs(BackgroundKt.m162backgroundbw27NRU(PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(f), 0.0f, 0.0f, 13, null), Color.INSTANCE.m1655getWhite0d7_KjU(), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f))), Dp.m4104constructorimpl(16));
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM426padding3ABfNKs);
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
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            content.invoke(composer, Integer.valueOf(i & 14));
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f111lambda2 = ComposableLambdaKt.composableLambdaInstance(160955886, false, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.widget.ComposableSingletons$SportLevelProgressBarComposeKt$lambda-2$1
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
                ComposerKt.traceEventStart(160955886, i, -1, "com.heytap.sports.record.details.widget.ComposableSingletons$SportLevelProgressBarComposeKt.lambda-2.<anonymous> (SportLevelProgressBarCompose.kt:262)");
            }
            float f = 4;
            SportLevelProgressBarComposeKt.d(2.5f, 0.0f, 0L, 0L, true, 0.0f, 0.0f, 0.0f, 0L, PaddingKt.m430paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(f), 0.0f, 10, null), false, false, null, new Float[]{Float.valueOf(2.0f), Float.valueOf(3.0f), Float.valueOf(5.0f), Float.valueOf(9.0f), Float.valueOf(14.0f), Float.valueOf(25.0f)}, new String[]{"偏长", "欠佳", "正常", "良好", "优秀"}, null, composer, 805330950, 36864, 40430);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f112lambda3 = ComposableLambdaKt.composableLambdaInstance(-297254555, false, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.widget.ComposableSingletons$SportLevelProgressBarComposeKt$lambda-3$1
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
                ComposerKt.traceEventStart(-297254555, i, -1, "com.heytap.sports.record.details.widget.ComposableSingletons$SportLevelProgressBarComposeKt.lambda-3.<anonymous> (SportLevelProgressBarCompose.kt:282)");
            }
            float f = 4;
            SportLevelProgressBarComposeKt.d(5.5f, 0.0f, 0L, 0L, true, 0.0f, 0.0f, 0.0f, 0L, PaddingKt.m430paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(f), 0.0f, 10, null), false, false, null, new Float[]{Float.valueOf(2.0f), Float.valueOf(3.0f), Float.valueOf(5.0f), Float.valueOf(9.0f), Float.valueOf(14.0f), Float.valueOf(25.0f)}, new String[]{"偏长", "欠佳", "正常", "良好", "优秀"}, null, composer, 805330950, 36918, 37358);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f113lambda4 = ComposableLambdaKt.composableLambdaInstance(-1181990362, false, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.widget.ComposableSingletons$SportLevelProgressBarComposeKt$lambda-4$1
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
                ComposerKt.traceEventStart(-1181990362, i, -1, "com.heytap.sports.record.details.widget.ComposableSingletons$SportLevelProgressBarComposeKt.lambda-4.<anonymous> (SportLevelProgressBarCompose.kt:304)");
            }
            float f = 4;
            SportLevelProgressBarComposeKt.d(3.5f, 0.0f, 0L, 0L, true, 0.0f, 0.0f, 0.0f, 0L, PaddingKt.m430paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(f), 0.0f, 10, null), false, false, null, new Float[]{Float.valueOf(2.0f), Float.valueOf(3.0f), Float.valueOf(5.0f), Float.valueOf(9.0f), Float.valueOf(14.0f), Float.valueOf(25.0f)}, new String[]{"左侧触地时间长", "欠佳", "正常", "良好", "右侧触地时间长"}, null, composer, 805330950, 36912, 38382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> a() {
        return f110lambda1;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> b() {
        return f111lambda2;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> c() {
        return f112lambda3;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> d() {
        return f113lambda4;
    }
}
