package androidx.paging;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0019"}, d2 = {"Landroidx/paging/MutableLoadStateCollection;", "", "()V", "append", "Landroidx/paging/LoadState;", "getAppend", "()Landroidx/paging/LoadState;", "setAppend", "(Landroidx/paging/LoadState;)V", "prepend", "getPrepend", "setPrepend", "refresh", "getRefresh", "setRefresh", ParserTag.TAG_GET, "loadType", "Landroidx/paging/LoadType;", "set", "", "states", "Landroidx/paging/LoadStates;", "type", "state", "snapshot", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableLoadStateCollection {

    @NotNull
    private LoadState append;

    @NotNull
    private LoadState prepend;

    @NotNull
    private LoadState refresh;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MutableLoadStateCollection() {
        LoadState.NotLoading.Companion companion = LoadState.NotLoading.INSTANCE;
        this.refresh = companion.getIncomplete$paging_common();
        this.prepend = companion.getIncomplete$paging_common();
        this.append = companion.getIncomplete$paging_common();
    }

    @NotNull
    public final LoadState get(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return this.refresh;
        }
        if (i == 2) {
            return this.append;
        }
        if (i == 3) {
            return this.prepend;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final LoadState getAppend() {
        return this.append;
    }

    @NotNull
    public final LoadState getPrepend() {
        return this.prepend;
    }

    @NotNull
    public final LoadState getRefresh() {
        return this.refresh;
    }

    public final void set(@NotNull LoadType type, @NotNull LoadState state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            this.refresh = state;
        } else if (i == 2) {
            this.append = state;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.prepend = state;
        }
    }

    public final void setAppend(@NotNull LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadState, "<set-?>");
        this.append = loadState;
    }

    public final void setPrepend(@NotNull LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadState, "<set-?>");
        this.prepend = loadState;
    }

    public final void setRefresh(@NotNull LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadState, "<set-?>");
        this.refresh = loadState;
    }

    @NotNull
    public final LoadStates snapshot() {
        return new LoadStates(this.refresh, this.prepend, this.append);
    }

    public final void set(@NotNull LoadStates states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.refresh = states.getRefresh();
        this.append = states.getAppend();
        this.prepend = states.getPrepend();
    }
}
