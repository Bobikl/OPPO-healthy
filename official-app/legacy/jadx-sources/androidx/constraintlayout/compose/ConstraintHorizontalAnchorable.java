package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintHorizontalAnchorable;", "Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "id", "", "index", "", "tasks", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "", "(Ljava/lang/Object;ILjava/util/List;)V", "getId", "()Ljava/lang/Object;", "getConstraintReference", "Landroidx/constraintlayout/core/state/ConstraintReference;", "state", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class ConstraintHorizontalAnchorable extends BaseHorizontalAnchorable {

    @NotNull
    private final Object id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintHorizontalAnchorable(@NotNull Object id, int i, @NotNull List<Function1<State, Unit>> tasks) {
        super(tasks, i);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.id = id;
    }

    @Override // androidx.constraintlayout.compose.BaseHorizontalAnchorable
    @NotNull
    public ConstraintReference getConstraintReference(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ConstraintReference constraintReferenceConstraints = state.constraints(this.id);
        Intrinsics.checkNotNullExpressionValue(constraintReferenceConstraints, "state.constraints(id)");
        return constraintReferenceConstraints;
    }

    @NotNull
    public final Object getId() {
        return this.id;
    }
}
