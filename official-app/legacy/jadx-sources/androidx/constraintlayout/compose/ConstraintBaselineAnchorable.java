package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005¢\u0006\u0002\u0010\tJ-\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintBaselineAnchorable;", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "id", "", "tasks", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "", "(Ljava/lang/Object;Ljava/util/List;)V", "getId", "()Ljava/lang/Object;", "getTasks", "()Ljava/util/List;", "linkTo", "anchor", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "margin", "Landroidx/compose/ui/unit/Dp;", "goneMargin", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;FF)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class ConstraintBaselineAnchorable implements BaselineAnchorable {

    @NotNull
    private final Object id;

    @NotNull
    private final List<Function1<State, Unit>> tasks;

    public ConstraintBaselineAnchorable(@NotNull Object id, @NotNull List<Function1<State, Unit>> tasks) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.id = id;
        this.tasks = tasks;
    }

    @NotNull
    public final Object getId() {
        return this.id;
    }

    @NotNull
    public final List<Function1<State, Unit>> getTasks() {
        return this.tasks;
    }

    @Override // androidx.constraintlayout.compose.BaselineAnchorable
    /* JADX INFO: renamed from: linkTo-VpY3zN4 */
    public void mo4351linkToVpY3zN4(@NotNull final ConstraintLayoutBaseScope.BaselineAnchor anchor, final float margin, final float goneMargin) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintBaselineAnchorable$linkTo$1
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
                if (state != null) {
                    ConstraintBaselineAnchorable constraintBaselineAnchorable = this.this$0;
                    ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor = anchor;
                    state.baselineNeededFor$compose_release(constraintBaselineAnchorable.getId());
                    state.baselineNeededFor$compose_release(baselineAnchor.getId$compose_release());
                }
                ConstraintReference constraintReferenceConstraints = state.constraints(this.this$0.getId());
                ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor2 = anchor;
                float f = margin;
                float f2 = goneMargin;
                Function2<ConstraintReference, Object, ConstraintReference> baselineAnchorFunction = AnchorFunctions.INSTANCE.getBaselineAnchorFunction();
                Intrinsics.checkNotNullExpressionValue(constraintReferenceConstraints, "this");
                baselineAnchorFunction.invoke(constraintReferenceConstraints, baselineAnchor2.getId$compose_release()).margin(Dp.m4102boximpl(f)).marginGone(Dp.m4102boximpl(f2));
            }
        });
    }
}
