package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0013\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/pager/ConsumeAllFlingOnDirection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/gestures/Orientation;)V", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "consumeOnOrientation", "consumeOnOrientation-8S9VItk", "(JLandroidx/compose/foundation/gestures/Orientation;)J", "consumeOnOrientation-QWom1Mo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ConsumeAllFlingOnDirection implements NestedScrollConnection {

    @NotNull
    private final Orientation orientation;

    public ConsumeAllFlingOnDirection(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.orientation = orientation;
    }

    /* JADX INFO: renamed from: consumeOnOrientation-8S9VItk, reason: not valid java name */
    public final long m665consumeOnOrientation8S9VItk(long j2, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == Orientation.Vertical ? Offset.m1374copydBAh8RU$default(j2, 0.0f, 0.0f, 2, null) : Offset.m1374copydBAh8RU$default(j2, 0.0f, 0.0f, 1, null);
    }

    /* JADX INFO: renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m666consumeOnOrientationQWom1Mo(long j2, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == Orientation.Vertical ? Velocity.m4325copyOhffZ5M$default(j2, 0.0f, 0.0f, 2, null) : Velocity.m4325copyOhffZ5M$default(j2, 0.0f, 0.0f, 1, null);
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo319onPostFlingRZ2iAVY(long j2, long j3, @NotNull Continuation<? super Velocity> continuation) {
        return Velocity.m4320boximpl(m666consumeOnOrientationQWom1Mo(j3, this.orientation));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo320onPostScrollDzOQY0M(long consumed, long available, int source) {
        return NestedScrollSource.m2908equalsimpl0(source, NestedScrollSource.INSTANCE.m2914getFlingWNlRxjI()) ? m665consumeOnOrientation8S9VItk(available, this.orientation) : Offset.INSTANCE.m1396getZeroF1C5BW0();
    }
}
