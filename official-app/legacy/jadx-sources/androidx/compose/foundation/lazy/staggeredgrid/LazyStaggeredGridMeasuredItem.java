package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.oplus.aiunit.vision.c8l;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ&\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", "index", "", "key", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "spacing", "lane", c8l.SPAN_KEY, "(ILjava/lang/Object;Ljava/util/List;ZIII)V", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "()Z", "isVisible", "setVisible", "(Z)V", "getKey", "()Ljava/lang/Object;", "getLane", "mainAxisSize", "getMainAxisSize", "getPlaceables", "()Ljava/util/List;", "sizeWithSpacings", "getSizeWithSpacings", "getSpacing", "getSpan", "position", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "mainAxis", "crossAxis", "mainAxisLayoutSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1097:1\n59#2,3:1098\n62#2,2:1105\n64#2:1108\n99#2,8:1109\n33#3,4:1101\n38#3:1107\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1020#1:1098,3\n1020#1:1105,2\n1020#1:1108\n1026#1:1109,8\n1020#1:1101,4\n1020#1:1107\n*E\n"})
final class LazyStaggeredGridMeasuredItem {
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;

    @NotNull
    private final Object key;
    private final int lane;
    private final int mainAxisSize;

    @NotNull
    private final List<Placeable> placeables;
    private final int sizeWithSpacings;
    private final int spacing;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridMeasuredItem(int i, @NotNull Object key, @NotNull List<? extends Placeable> placeables, boolean z, int i2, int i3, int i4) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.index = i;
        this.key = key;
        this.placeables = placeables;
        this.isVertical = z;
        this.spacing = i2;
        this.lane = i3;
        this.span = i4;
        int i5 = 1;
        this.isVisible = true;
        Integer numValueOf = 0;
        int size = placeables.size();
        for (int i6 = 0; i6 < size; i6++) {
            Placeable placeable = (Placeable) placeables.get(i6);
            numValueOf = Integer.valueOf(numValueOf.intValue() + (this.isVertical ? placeable.getHeight() : placeable.getWidth()));
        }
        int iIntValue = numValueOf.intValue();
        this.mainAxisSize = iIntValue;
        this.sizeWithSpacings = RangesKt___RangesKt.coerceAtLeast(iIntValue + this.spacing, 0);
        List<Placeable> list = this.placeables;
        if (list.isEmpty()) {
            num = null;
        } else {
            Placeable placeable2 = list.get(0);
            Integer numValueOf2 = Integer.valueOf(this.isVertical ? placeable2.getWidth() : placeable2.getHeight());
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                while (true) {
                    Placeable placeable3 = list.get(i5);
                    Integer numValueOf3 = Integer.valueOf(this.isVertical ? placeable3.getWidth() : placeable3.getHeight());
                    numValueOf2 = numValueOf3.compareTo(numValueOf2) > 0 ? numValueOf3 : numValueOf2;
                    if (i5 == lastIndex) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            num = numValueOf2;
        }
        Integer num2 = num;
        this.crossAxisSize = num2 != null ? num2.intValue() : 0;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Object getKey() {
        return this.key;
    }

    public final int getLane() {
        return this.lane;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @NotNull
    public final List<Placeable> getPlaceables() {
        return this.placeables;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getSpacing() {
        return this.spacing;
    }

    public final int getSpan() {
        return this.span;
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public final LazyStaggeredGridPositionedItem position(int lane, int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        return new LazyStaggeredGridPositionedItem(this.isVertical ? IntOffsetKt.IntOffset(crossAxis, mainAxis) : IntOffsetKt.IntOffset(mainAxis, crossAxis), this.index, lane, this.key, this.isVertical ? IntSizeKt.IntSize(this.crossAxisSize, this.sizeWithSpacings) : IntSizeKt.IntSize(this.sizeWithSpacings, this.crossAxisSize), this.placeables, this.isVertical, mainAxisLayoutSize, null);
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }
}
