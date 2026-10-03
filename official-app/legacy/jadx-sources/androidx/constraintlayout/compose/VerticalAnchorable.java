package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/constraintlayout/compose/VerticalAnchorable;", "", "linkTo", "", "anchor", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "margin", "Landroidx/compose/ui/unit/Dp;", "goneMargin", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FF)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface VerticalAnchorable {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
        public static /* synthetic */ void m4444linkToVpY3zN4$default(VerticalAnchorable verticalAnchorable, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f, float f2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i & 2) != 0) {
                f = Dp.m4104constructorimpl(0);
            }
            if ((i & 4) != 0) {
                f2 = Dp.m4104constructorimpl(0);
            }
            verticalAnchorable.mo4350linkToVpY3zN4(verticalAnchor, f, f2);
        }
    }

    /* JADX INFO: renamed from: linkTo-VpY3zN4 */
    void mo4350linkToVpY3zN4(@NotNull ConstraintLayoutBaseScope.VerticalAnchor anchor, float margin, float goneMargin);
}
