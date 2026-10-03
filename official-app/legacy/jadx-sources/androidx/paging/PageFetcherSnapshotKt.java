package androidx.paging;

import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"shouldPrioritizeOver", "", "Landroidx/paging/GenerationalViewportHint;", "previous", "loadType", "Landroidx/paging/LoadType;", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class PageFetcherSnapshotKt {
    public static final boolean shouldPrioritizeOver(@NotNull GenerationalViewportHint generationalViewportHint, @NotNull GenerationalViewportHint previous, @NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(generationalViewportHint, "<this>");
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (generationalViewportHint.getGenerationId() > previous.getGenerationId()) {
            return true;
        }
        if (generationalViewportHint.getGenerationId() < previous.getGenerationId()) {
            return false;
        }
        return HintHandlerKt.shouldPrioritizeOver(generationalViewportHint.getHint(), previous.getHint(), loadType);
    }
}
