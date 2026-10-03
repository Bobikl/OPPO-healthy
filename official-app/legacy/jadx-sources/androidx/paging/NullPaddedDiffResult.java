package androidx.paging;

import androidx.recyclerview.widget.DiffUtil;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/paging/NullPaddedDiffResult;", "", "diff", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "hasOverlap", "", "(Landroidx/recyclerview/widget/DiffUtil$DiffResult;Z)V", "getDiff", "()Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "getHasOverlap", "()Z", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NullPaddedDiffResult {

    @NotNull
    private final DiffUtil.DiffResult diff;
    private final boolean hasOverlap;

    public NullPaddedDiffResult(@NotNull DiffUtil.DiffResult diff, boolean z) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        this.diff = diff;
        this.hasOverlap = z;
    }

    @NotNull
    public final DiffUtil.DiffResult getDiff() {
        return this.diff;
    }

    public final boolean getHasOverlap() {
        return this.hasOverlap;
    }
}
