package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.Placeable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPlaceableWrapper;", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/IntOffset;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "(JLandroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOffset-nOcc-ac", "()J", "J", "getPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyListPlaceableWrapper {
    private final long offset;

    @NotNull
    private final Placeable placeable;

    public /* synthetic */ LazyListPlaceableWrapper(long j2, Placeable placeable, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, placeable);
    }

    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    @NotNull
    public final Placeable getPlaceable() {
        return this.placeable;
    }

    private LazyListPlaceableWrapper(long j2, Placeable placeable) {
        this.offset = j2;
        this.placeable = placeable;
    }
}
