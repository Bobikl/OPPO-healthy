package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"findVisibleItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "itemIndex", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridMeasureResultKt {
    @Nullable
    public static final LazyStaggeredGridItemInfo findVisibleItem(@NotNull LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, final int i) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridLayoutInfo, "<this>");
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.first((List) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        boolean z = false;
        if (i <= ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.last((List) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() && index <= i) {
            z = true;
        }
        if (!z) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.getOrNull(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), CollectionsKt__CollectionsKt.binarySearch$default(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new Function1<LazyStaggeredGridItemInfo, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull LazyStaggeredGridItemInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getIndex() - i);
            }
        }, 3, (Object) null));
    }
}
