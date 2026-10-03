package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"rememberDefaultBringIntoViewParent", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/relocation/BringIntoViewParent;", "toRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBringIntoViewResponder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.android.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,48:1\n76#2:49\n36#3:50\n1114#4,6:51\n*S KotlinDebug\n*F\n+ 1 BringIntoViewResponder.android.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt\n*L\n30#1:49\n31#1:50\n31#1:51,6\n*E\n"})
public final class BringIntoViewResponder_androidKt {
    @Composable
    @NotNull
    public static final BringIntoViewParent rememberDefaultBringIntoViewParent(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1031410916);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1031410916, i, -1, "androidx.compose.foundation.relocation.rememberDefaultBringIntoViewParent (BringIntoViewResponder.android.kt:28)");
        }
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new AndroidBringIntoViewParent(view);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        AndroidBringIntoViewParent androidBringIntoViewParent = (AndroidBringIntoViewParent) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidBringIntoViewParent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect toRect(androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }
}
