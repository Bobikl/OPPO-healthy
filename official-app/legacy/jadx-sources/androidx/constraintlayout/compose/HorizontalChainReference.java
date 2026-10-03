package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import com.oplus.smartenginehelper.entity.TextEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/constraintlayout/compose/HorizontalChainReference;", "", "id", "(Ljava/lang/Object;)V", "absoluteLeft", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getAbsoluteLeft$annotations", "()V", "getAbsoluteLeft", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "absoluteRight", "getAbsoluteRight$annotations", "getAbsoluteRight", TextEntity.ELLIPSIZE_END, "getEnd$annotations", "getEnd", "getId$compose_release", "()Ljava/lang/Object;", "start", "getStart$annotations", "getStart", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HorizontalChainReference {

    @NotNull
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;

    @NotNull
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;

    @NotNull
    private final ConstraintLayoutBaseScope.VerticalAnchor end;

    @NotNull
    private final Object id;

    @NotNull
    private final ConstraintLayoutBaseScope.VerticalAnchor start;

    public HorizontalChainReference(@NotNull Object id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(id, -2);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(id, 0);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(id, -1);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(id, 1);
    }

    @Stable
    public static /* synthetic */ void getAbsoluteLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getAbsoluteRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteRight() {
        return this.absoluteRight;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    @NotNull
    /* JADX INFO: renamed from: getId$compose_release, reason: from getter */
    public final Object getId() {
        return this.id;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }
}
