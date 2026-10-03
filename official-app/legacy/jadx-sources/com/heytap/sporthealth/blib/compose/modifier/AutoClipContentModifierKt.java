package com.heytap.sporthealth.blib.compose.modifier;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LiveData;
import com.heytap.health.base.resposiveui.config.NearUIConfig;
import com.heytap.health.base.resposiveui.config.a;
import com.oplus.aiunit.vision.a7b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "b", "Landroid/content/Context;", "context", "", "c", "lib_ui_release"}, k = 2, mv = {1, 8, 0})
public final class AutoClipContentModifierKt {
    @NotNull
    public static final Modifier b(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt$autoClipContentForFold$1
            private static final NearUIConfig.Status invoke$lambda$0(State<? extends NearUIConfig.Status> state) {
                return state.getValue();
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1735169301);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1735169301, i, -1, "com.heytap.sporthealth.blib.compose.modifier.autoClipContentForFold.<anonymous> (AutoClipContentModifier.kt:18)");
                }
                LiveData<NearUIConfig.Status> liveDataQ = a.m((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).q();
                Intrinsics.checkNotNullExpressionValue(liveDataQ, "getInstance(LocalContext.current).getUiStatus()");
                boolean z = invoke$lambda$0(LiveDataAdapterKt.observeAsState(liveDataQ, NearUIConfig.Status.UNKNOWN, composer, 56)) == NearUIConfig.Status.FOLD;
                float fM4104constructorimpl = z ? Dp.m4104constructorimpl(0) : Dp.m4104constructorimpl(AutoClipContentModifierKt.c((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())));
                a7b.f("autoClipContentForFold", "getUiStatus() observe status:" + z + "; padding:" + Dp.m4115toStringimpl(fM4104constructorimpl));
                Modifier modifierM428paddingVpY3zN4$default = PaddingKt.m428paddingVpY3zN4$default(composed, fM4104constructorimpl, 0.0f, 2, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM428paddingVpY3zN4$default;
            }
        }, 1, null);
    }

    public static final float c(Context context) {
        int i = context.getResources().getConfiguration().screenWidthDp;
        float f = 8;
        float f2 = ((((i - 48) - 56) * 1.0f) / f) + f + f;
        a7b.f("autoClipContentForFold", "getUnfoldExtraPadding() screenWidthDp:" + i + " extraPaddingDp:" + f2);
        return f2;
    }
}
