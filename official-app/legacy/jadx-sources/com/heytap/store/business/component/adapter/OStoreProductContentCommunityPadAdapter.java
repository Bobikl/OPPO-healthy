package com.heytap.store.business.component.adapter;

import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.store.business.component.adapter.viewholder.BaseProductGridViewHolder;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/store/business/component/adapter/OStoreProductContentCommunityPadAdapter;", "Lcom/heytap/store/business/component/adapter/OStoreProductGridContentListAdapter;", "()V", "configWidthBeforeBind", "", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "Lcom/heytap/store/business/component/adapter/viewholder/BaseProductGridViewHolder;", "getItemViewType", "", "position", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreProductContentCommunityPadAdapter extends OStoreProductGridContentListAdapter {
    @Override // com.heytap.store.business.component.adapter.OStoreProductGridContentListAdapter
    public void configWidthBeforeBind(@NotNull BaseProductGridViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // com.heytap.store.business.component.adapter.OStoreProductGridContentListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return 8;
    }
}
