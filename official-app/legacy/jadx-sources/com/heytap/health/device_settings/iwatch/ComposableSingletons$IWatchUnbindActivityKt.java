package com.heytap.health.device_settings.iwatch;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.heytap.health.device_pair.R$drawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$IWatchUnbindActivityKt {

    @NotNull
    public static final ComposableSingletons$IWatchUnbindActivityKt INSTANCE = new ComposableSingletons$IWatchUnbindActivityKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<String, Composer, Integer, Unit> f53lambda1 = ComposableLambdaKt.composableLambdaInstance(2113563134, false, new Function3<String, Composer, Integer, Unit>() { // from class: com.heytap.health.device_settings.iwatch.ComposableSingletons$IWatchUnbindActivityKt$lambda-1$1
        @Override // p010kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull String it, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2113563134, i, -1, "com.heytap.health.device_settings.iwatch.ComposableSingletons$IWatchUnbindActivityKt.lambda-1.<anonymous> (IWatchUnbindActivity.kt:133)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.oobe_icon_info, composer, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    public final Function3<String, Composer, Integer, Unit> a() {
        return f53lambda1;
    }
}
