package com.heytap.health.sport.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$TabLayoutComposeKt {

    @NotNull
    public static final ComposableSingletons$TabLayoutComposeKt INSTANCE = new ComposableSingletons$TabLayoutComposeKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<Integer, Composer, Integer, Unit> f68lambda1 = ComposableLambdaKt.composableLambdaInstance(-2043418741, false, new Function3<Integer, Composer, Integer, Unit>() { // from class: com.heytap.health.sport.view.ComposableSingletons$TabLayoutComposeKt$lambda-1$1
        @Override // p010kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer, Integer num2) {
            invoke(num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(int i, @Nullable Composer composer, int i2) {
            if ((i2 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2043418741, i2, -1, "com.heytap.health.sport.view.ComposableSingletons$TabLayoutComposeKt.lambda-1.<anonymous> (TabLayoutCompose.kt:112)");
            }
            float f = 12;
            BoxKt.Box(BackgroundKt.m162backgroundbw27NRU(SizeKt.m455height3ABfNKs(PaddingKt.m427paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(16), Dp.m4104constructorimpl(f)), Dp.m4104constructorimpl(228)), ColorKt.Color(3774808064L), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f))), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    public final Function3<Integer, Composer, Integer, Unit> a() {
        return f68lambda1;
    }
}
