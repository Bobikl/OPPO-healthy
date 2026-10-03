package androidx.paging;

import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"shouldPrioritizeOver", "", "Landroidx/paging/ViewportHint;", "previous", "loadType", "Landroidx/paging/LoadType;", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class HintHandlerKt {
    public static final boolean shouldPrioritizeOver(@NotNull ViewportHint viewportHint, @Nullable ViewportHint viewportHint2, @NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(viewportHint, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (viewportHint2 == null) {
            return true;
        }
        if ((viewportHint2 instanceof ViewportHint.Initial) && (viewportHint instanceof ViewportHint.Access)) {
            return true;
        }
        return (((viewportHint instanceof ViewportHint.Initial) && (viewportHint2 instanceof ViewportHint.Access)) || (viewportHint.getOriginalPageOffsetFirst() == viewportHint2.getOriginalPageOffsetFirst() && viewportHint.getOriginalPageOffsetLast() == viewportHint2.getOriginalPageOffsetLast() && viewportHint2.presentedItemsBeyondAnchor$paging_common(loadType) <= viewportHint.presentedItemsBeyondAnchor$paging_common(loadType))) ? false : true;
    }
}
