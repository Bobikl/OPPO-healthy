package com.heytap.health.menstrual_period.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$MenstrualTimeDataActivityKt {

    @NotNull
    public static final ComposableSingletons$MenstrualTimeDataActivityKt INSTANCE = new ComposableSingletons$MenstrualTimeDataActivityKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f60lambda1 = ComposableLambdaKt.composableLambdaInstance(-2123719180, false, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.menstrual_period.ui.ComposableSingletons$MenstrualTimeDataActivityKt$lambda-1$1
        @Override // p010kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2123719180, i, -1, "com.heytap.health.menstrual_period.ui.ComposableSingletons$MenstrualTimeDataActivityKt.lambda-1.<anonymous> (MenstrualTimeDataActivity.kt:447)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    public final Function2<Composer, Integer, Unit> a() {
        return f60lambda1;
    }
}
