package com.heytap.store.base.widget.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.heytap.store.base.widget.R;
import com.oplus.aiunit.vision.h61;

/* JADX INFO: loaded from: classes3.dex */
public class FooterLoadMoreView extends h61 {

    @ColorInt
    private int textColor;

    private int getLoadingTextId() {
        return R.id.tv_loading_text;
    }

    @Override // com.oplus.aiunit.vision.h61
    public void convert(@NonNull BaseViewHolder baseViewHolder, int i, @NonNull LoadMoreStatus loadMoreStatus) {
        super.convert(baseViewHolder, i, loadMoreStatus);
        if (this.textColor == 0) {
            return;
        }
        View viewFindView = baseViewHolder.findView(getLoadingTextId());
        View viewFindView2 = baseViewHolder.findView(getLoadFailViewId());
        View viewFindView3 = baseViewHolder.findView(getLoadEndViewId());
        if (viewFindView instanceof TextView) {
            ((TextView) viewFindView).setTextColor(this.textColor);
        }
        if (viewFindView2 instanceof TextView) {
            ((TextView) viewFindView2).setTextColor(this.textColor);
        }
        if (viewFindView3 instanceof TextView) {
            ((TextView) viewFindView3).setTextColor(this.textColor);
        }
    }

    @Override // com.oplus.aiunit.vision.h61
    @NonNull
    public View getLoadComplete(@NonNull BaseViewHolder baseViewHolder) {
        return baseViewHolder.findView(getLoadEndViewId());
    }

    @Override // com.oplus.aiunit.vision.h61
    @NonNull
    public View getLoadEndView(@NonNull BaseViewHolder baseViewHolder) {
        return baseViewHolder.findView(getLoadEndViewId());
    }

    public int getLoadEndViewId() {
        return R.id.tv_load_end_tips;
    }

    @Override // com.oplus.aiunit.vision.h61
    @NonNull
    public View getLoadFailView(@NonNull BaseViewHolder baseViewHolder) {
        return baseViewHolder.findView(getLoadFailViewId());
    }

    public int getLoadFailViewId() {
        return R.id.tv_load_fail_tips;
    }

    @Override // com.oplus.aiunit.vision.h61
    @NonNull
    public View getLoadingView(@NonNull BaseViewHolder baseViewHolder) {
        return baseViewHolder.findView(getLoadingViewId());
    }

    public int getLoadingViewId() {
        return R.id.tv_load_tips;
    }

    @Override // com.oplus.aiunit.vision.h61
    @NonNull
    public View getRootView(@NonNull ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.footer_load_or_no_more_item, viewGroup, false);
    }

    public void setTextColor(@ColorInt int i) {
        this.textColor = i;
    }
}
