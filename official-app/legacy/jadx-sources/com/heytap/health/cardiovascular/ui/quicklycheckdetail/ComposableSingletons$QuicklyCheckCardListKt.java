package com.heytap.health.cardiovascular.ui.quicklycheckdetail;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import com.heytap.health.cardiovascular.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$QuicklyCheckCardListKt {

    @NotNull
    public static final ComposableSingletons$QuicklyCheckCardListKt INSTANCE = new ComposableSingletons$QuicklyCheckCardListKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f35lambda1 = ComposableLambdaKt.composableLambdaInstance(2028301432, false, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.cardiovascular.ui.quicklycheckdetail.ComposableSingletons$QuicklyCheckCardListKt$lambda-1$1
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
                ComposerKt.traceEventStart(2028301432, i, -1, "com.heytap.health.cardiovascular.ui.quicklycheckdetail.ComposableSingletons$QuicklyCheckCardListKt.lambda-1.<anonymous> (QuicklyCheckCardList.kt:37)");
            }
            QuicklyCheckupThemeKt.a(R$string.health_cardiovascular_records_label_risk, 0.0f, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f36lambda2 = ComposableLambdaKt.composableLambdaInstance(1913173537, false, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.cardiovascular.ui.quicklycheckdetail.ComposableSingletons$QuicklyCheckCardListKt$lambda-2$1
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
                ComposerKt.traceEventStart(1913173537, i, -1, "com.heytap.health.cardiovascular.ui.quicklycheckdetail.ComposableSingletons$QuicklyCheckCardListKt.lambda-2.<anonymous> (QuicklyCheckCardList.kt:71)");
            }
            QuicklyCheckupThemeKt.a(R$string.health_cardiovascular_records_label_target, Dp.m4104constructorimpl(12), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f37lambda3 = ComposableLambdaKt.composableLambdaInstance(1228943232, false, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.cardiovascular.ui.quicklycheckdetail.ComposableSingletons$QuicklyCheckCardListKt$lambda-3$1
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
                ComposerKt.traceEventStart(1228943232, i, -1, "com.heytap.health.cardiovascular.ui.quicklycheckdetail.ComposableSingletons$QuicklyCheckCardListKt.lambda-3.<anonymous> (QuicklyCheckCardList.kt:136)");
            }
            QuicklyCheckupTargetCardComposeKt.b(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    public final Function2<Composer, Integer, Unit> a() {
        return f35lambda1;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> b() {
        return f36lambda2;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> c() {
        return f37lambda3;
    }
}
