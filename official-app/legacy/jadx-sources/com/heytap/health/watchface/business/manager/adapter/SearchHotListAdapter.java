package com.heytap.health.watchface.business.manager.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.manager.adapter.SearchHotListAdapter;
import com.heytap.health.watchface.business.manager.bean.HotSearchListItem;
import com.oplus.aiunit.vision.a78;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/watchface/business/manager/adapter/SearchHotListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "Lcom/heytap/health/watchface/business/manager/bean/HotSearchListItem;", "hotLists", "", "f", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "onCreateViewHolder", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "onBindViewHolder", "getItemCount", "Lcom/heytap/health/watchface/business/manager/adapter/SearchHotListAdapter$a;", "i", "Lcom/heytap/health/watchface/business/manager/adapter/SearchHotListAdapter$a;", "mListener", "", "j", "Ljava/util/List;", "mDataList", "<init>", "(Lcom/heytap/health/watchface/business/manager/adapter/SearchHotListAdapter$a;)V", "ItemHolder", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SearchHotListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final a mListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<HotSearchListItem> mDataList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/watchface/business/manager/adapter/SearchHotListAdapter$ItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "a", "()Landroid/widget/TextView;", "mIndexTv", "j", "c", "mTitleTv", "Landroid/widget/ImageView;", MapSchema.FIELD_NAME_KEY, "Landroid/widget/ImageView;", "b", "()Landroid/widget/ImageView;", "mLabelIv", "Landroid/view/View;", "itemView", "<init>", "(Lcom/heytap/health/watchface/business/manager/adapter/SearchHotListAdapter;Landroid/view/View;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public final class ItemHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final TextView mIndexTv;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TextView mTitleTv;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final ImageView mLabelIv;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SearchHotListAdapter f7028l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemHolder(@NotNull SearchHotListAdapter searchHotListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f7028l = searchHotListAdapter;
            View viewFindViewById = itemView.findViewById(R$id.tv_index);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tv_index)");
            this.mIndexTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_hotList);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.tv_hotList)");
            this.mTitleTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.iv_label);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.id.iv_label)");
            this.mLabelIv = (ImageView) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getMIndexTv() {
            return this.mIndexTv;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getMLabelIv() {
            return this.mLabelIv;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getMTitleTv() {
            return this.mTitleTv;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watchface/business/manager/adapter/SearchHotListAdapter$a;", "", "Lcom/heytap/health/watchface/business/manager/bean/HotSearchListItem;", "item", "", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@NotNull HotSearchListItem item);
    }

    public SearchHotListAdapter(@NotNull a mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mListener = mListener;
        this.mDataList = new ArrayList();
    }

    public static final void e(SearchHotListAdapter this$0, HotSearchListItem data, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        this$0.mListener.a(data);
    }

    public final void f(@NotNull List<HotSearchListItem> hotLists) {
        Intrinsics.checkNotNullParameter(hotLists, "hotLists");
        this.mDataList.clear();
        this.mDataList.addAll(hotLists);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemHolder itemHolder = (ItemHolder) holder;
        final HotSearchListItem hotSearchListItem = this.mDataList.get(position);
        itemHolder.getMIndexTv().setText(String.valueOf(position + 1));
        itemHolder.getMTitleTv().setText(hotSearchListItem.getName());
        if (hotSearchListItem.getNeedIcon() != 1 || TextUtils.isEmpty(hotSearchListItem.getIconUrl())) {
            itemHolder.getMLabelIv().setVisibility(8);
        } else {
            itemHolder.getMLabelIv().setVisibility(0);
            a78.h(itemHolder.itemView.getContext(), hotSearchListItem.getIconUrl(), itemHolder.getMLabelIv());
        }
        itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ckg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchHotListAdapter.e(this.i, hotSearchListItem, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.watch_face_item_search_hot_list, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context)\n   …_hot_list, parent, false)");
        return new ItemHolder(this, viewInflate);
    }
}
