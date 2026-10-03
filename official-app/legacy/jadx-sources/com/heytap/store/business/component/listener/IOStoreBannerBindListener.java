package com.heytap.store.business.component.listener;

import android.view.View;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.store.business.component.adapter.viewholder.OStoreBannerInnerViewHolder;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lcom/heytap/store/business/component/listener/IOStoreBannerBindListener;", "", "onBindViewHolder", "", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "Lcom/heytap/store/business/component/adapter/viewholder/OStoreBannerInnerViewHolder;", "position", "", "realPos", "onCreateViewHolder", "view", "Landroid/view/View;", "onPageChange", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IOStoreBannerBindListener {
    void onBindViewHolder(@NotNull OStoreBannerInnerViewHolder holder, int position, int realPos);

    void onCreateViewHolder(@NotNull View view);

    void onPageChange(int realPos);
}
