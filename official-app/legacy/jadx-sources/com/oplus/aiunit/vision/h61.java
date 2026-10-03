package com.oplus.aiunit.vision;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J \u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/h61;", "", "Landroid/view/View;", "", "visible", "", "isVisible", "Landroid/view/ViewGroup;", "parent", "getRootView", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "getLoadingView", "getLoadComplete", "getLoadEndView", "getLoadFailView", "", "position", "Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "loadMoreStatus", "convert", "<init>", "()V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public abstract class h61 {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadMoreStatus.values().length];
            iArr[LoadMoreStatus.Complete.ordinal()] = 1;
            iArr[LoadMoreStatus.Loading.ordinal()] = 2;
            iArr[LoadMoreStatus.Fail.ordinal()] = 3;
            iArr[LoadMoreStatus.End.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void isVisible(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public void convert(@NotNull BaseViewHolder holder, int position, @NotNull LoadMoreStatus loadMoreStatus) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(loadMoreStatus, "loadMoreStatus");
        int i = a.$EnumSwitchMapping$0[loadMoreStatus.ordinal()];
        if (i == 1) {
            isVisible(getLoadingView(holder), false);
            isVisible(getLoadComplete(holder), true);
            isVisible(getLoadFailView(holder), false);
            isVisible(getLoadEndView(holder), false);
            return;
        }
        if (i == 2) {
            isVisible(getLoadingView(holder), true);
            isVisible(getLoadComplete(holder), false);
            isVisible(getLoadFailView(holder), false);
            isVisible(getLoadEndView(holder), false);
            return;
        }
        if (i == 3) {
            isVisible(getLoadingView(holder), false);
            isVisible(getLoadComplete(holder), false);
            isVisible(getLoadFailView(holder), true);
            isVisible(getLoadEndView(holder), false);
            return;
        }
        if (i != 4) {
            return;
        }
        isVisible(getLoadingView(holder), false);
        isVisible(getLoadComplete(holder), false);
        isVisible(getLoadFailView(holder), false);
        isVisible(getLoadEndView(holder), true);
    }

    @NotNull
    public abstract View getLoadComplete(@NotNull BaseViewHolder holder);

    @NotNull
    public abstract View getLoadEndView(@NotNull BaseViewHolder holder);

    @NotNull
    public abstract View getLoadFailView(@NotNull BaseViewHolder holder);

    @NotNull
    public abstract View getLoadingView(@NotNull BaseViewHolder holder);

    @NotNull
    public abstract View getRootView(@NotNull ViewGroup parent);
}
