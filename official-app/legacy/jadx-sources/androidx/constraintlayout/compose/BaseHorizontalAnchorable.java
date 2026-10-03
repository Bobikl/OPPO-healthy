package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B'\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H&J+\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "tasks", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "", "index", "", "(Ljava/util/List;I)V", "getConstraintReference", "Landroidx/constraintlayout/core/state/ConstraintReference;", "state", "linkTo", "anchor", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "margin", "Landroidx/compose/ui/unit/Dp;", "goneMargin", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseHorizontalAnchorable implements HorizontalAnchorable {
    private final int index;

    @NotNull
    private final List<Function1<State, Unit>> tasks;

    public BaseHorizontalAnchorable(@NotNull List<Function1<State, Unit>> tasks, int i) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.tasks = tasks;
        this.index = i;
    }

    @NotNull
    public abstract ConstraintReference getConstraintReference(@NotNull State state);

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    /* JADX INFO: renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo4349linkToVpY3zN4(@NotNull final ConstraintLayoutBaseScope.HorizontalAnchor anchor, final float margin, final float goneMargin) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.BaseHorizontalAnchorable$linkTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                ConstraintReference constraintReference = this.this$0.getConstraintReference(state);
                BaseHorizontalAnchorable baseHorizontalAnchorable = this.this$0;
                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor = anchor;
                AnchorFunctions.INSTANCE.getHorizontalAnchorFunctions()[baseHorizontalAnchorable.index][horizontalAnchor.getIndex$compose_release()].invoke(constraintReference, horizontalAnchor.getId$compose_release()).margin(Dp.m4102boximpl(margin)).marginGone(Dp.m4102boximpl(goneMargin));
            }
        });
    }
}
