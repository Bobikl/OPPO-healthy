package com.oplus.aiunit.vision;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.R$id;
import com.chad.library.R$layout;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/w3h;", "Lcom/oplus/aiunit/vision/h61;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "getRootView", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "getLoadingView", "getLoadComplete", "getLoadEndView", "getLoadFailView", "<init>", "()V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public final class w3h extends h61 {
    @Override // com.oplus.aiunit.vision.h61
    @NotNull
    public View getLoadComplete(@NotNull BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return holder.getView(R$id.load_more_load_complete_view);
    }

    @Override // com.oplus.aiunit.vision.h61
    @NotNull
    public View getLoadEndView(@NotNull BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return holder.getView(R$id.load_more_load_end_view);
    }

    @Override // com.oplus.aiunit.vision.h61
    @NotNull
    public View getLoadFailView(@NotNull BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return holder.getView(R$id.load_more_load_fail_view);
    }

    @Override // com.oplus.aiunit.vision.h61
    @NotNull
    public View getLoadingView(@NotNull BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return holder.getView(R$id.load_more_loading_view);
    }

    @Override // com.oplus.aiunit.vision.h61
    @NotNull
    public View getRootView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return up.a(parent, R$layout.brvah_quick_view_load_more);
    }
}
