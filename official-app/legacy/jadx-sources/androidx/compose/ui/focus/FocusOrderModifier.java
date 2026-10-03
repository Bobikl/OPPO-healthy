package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Use Modifier.focusProperties() instead")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderModifier;", "Landroidx/compose/ui/Modifier$Element;", "populateFocusOrder", "", "focusOrder", "Landroidx/compose/ui/focus/FocusOrder;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FocusOrderModifier extends Modifier.Element {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull FocusOrderModifier focusOrderModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return FocusOrderModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull FocusOrderModifier focusOrderModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return FocusOrderModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull FocusOrderModifier focusOrderModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) FocusOrderModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull FocusOrderModifier focusOrderModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) FocusOrderModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull FocusOrderModifier focusOrderModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return FocusOrderModifier.super.then(other);
        }
    }

    void populateFocusOrder(@NotNull FocusOrder focusOrder);
}
