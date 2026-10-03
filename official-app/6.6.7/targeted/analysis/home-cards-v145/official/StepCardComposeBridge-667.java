package com.heytap.health.main.card;

import androidx.annotation.ColorRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.heytap.health.health.impl.R$color;
import com.heytap.health.healthbase.view.HealthLinearProgressIndicatorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a2\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "composeView", "", "step", "stepGoal", "", "progressColor", "cursorColor", "", "a", "health_impl_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "StepCardComposeBridge")
public final class StepCardComposeBridge {
    public static final void a(@NotNull ComposeView composeView, final long j2, final long j3, @ColorRes final int i, @ColorRes final int i2) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1283434441, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.main.card.StepCardComposeBridge$setStepCardProgressContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i3) {
                if ((i3 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1283434441, i3, -1, "com.heytap.health.main.card.setStepCardProgressContent.<anonymous> (StepCardComposeBridge.kt:16)");
                }
                long j4 = j3;
                HealthLinearProgressIndicatorKt.a(j4 > 0 ? j2 / j4 : 0.0f, null, ColorResources_androidKt.colorResource(R$color.health_step_progress_bar_bg, composer, 0), ColorResources_androidKt.colorResource(i, composer, 0), ColorResources_androidKt.colorResource(i2, composer, 0), 0.0f, false, composer, 0, 98);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}