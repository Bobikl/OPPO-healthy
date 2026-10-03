package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"focusModifier", "Landroidx/compose/ui/Modifier;", "focusTarget", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FocusModifierKt {
    @Deprecated(message = "Replaced by focusTarget", replaceWith = @ReplaceWith(expression = "focusTarget()", imports = {"androidx.compose.ui.focus.focusTarget"}))
    @NotNull
    public static final Modifier focusModifier(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return focusTarget(modifier);
    }

    @NotNull
    public static final Modifier focusTarget(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(FocusTargetModifierNode.FocusTargetModifierElement.INSTANCE);
    }
}
