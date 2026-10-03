package com.heytap.health.heartrate.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.heartrate.R$id;
import com.heytap.health.heartrate.R$layout;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/heartrate/ui/adapter/HeartRateDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/health/heartrate/ui/adapter/HeartRateDetailAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, MapSchema.FIELD_NAME_ENTRY, BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "d", "getItemCount", "", "Lcom/heytap/health/heartrate/ui/adapter/HeartRateDetailAdapter$a;", "dataList", "f", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "<init>", "()V", "a", "ViewHolder", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class HeartRateDetailAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<Item> dataList = new ArrayList<>();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/heartrate/ui/adapter/HeartRateDetailAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "i", "Landroid/view/View;", "a", "()Landroid/view/View;", "rootView", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "c", "()Landroid/widget/TextView;", "titleTv", MapSchema.FIELD_NAME_KEY, "b", "statusTv", "itemView", "<init>", "(Landroid/view/View;)V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final View rootView;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TextView titleTv;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final TextView statusTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.root_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.root_view)");
            this.rootView = viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.tv_title)");
            this.titleTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.tv_status);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.id.tv_status)");
            this.statusTv = (TextView) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final View getRootView() {
            return this.rootView;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getStatusTv() {
            return this.statusTv;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getTitleTv() {
            return this.titleTv;
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.heartrate.ui.adapter.HeartRateDetailAdapter$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\t\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/heartrate/ui/adapter/HeartRateDetailAdapter$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "titleStr", "b", "statusStr", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnClickListener;", "()Landroid/view/View$OnClickListener;", "clickListener", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Item {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String titleStr;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String statusStr;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final View.OnClickListener clickListener;

        public Item(@NotNull String titleStr, @NotNull String statusStr, @NotNull View.OnClickListener clickListener) {
            Intrinsics.checkNotNullParameter(titleStr, "titleStr");
            Intrinsics.checkNotNullParameter(statusStr, "statusStr");
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            this.titleStr = titleStr;
            this.statusStr = statusStr;
            this.clickListener = clickListener;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final View.OnClickListener getClickListener() {
            return this.clickListener;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStatusStr() {
            return this.statusStr;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitleStr() {
            return this.titleStr;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.titleStr, item.titleStr) && Intrinsics.areEqual(this.statusStr, item.statusStr) && Intrinsics.areEqual(this.clickListener, item.clickListener);
        }

        public int hashCode() {
            return (((this.titleStr.hashCode() * 31) + this.statusStr.hashCode()) * 31) + this.clickListener.hashCode();
        }

        @NotNull
        public String toString() {
            return "Item(titleStr=" + this.titleStr + ", statusStr=" + this.statusStr + ", clickListener=" + this.clickListener + ")";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Item item = this.dataList.get(position);
        Intrinsics.checkNotNullExpressionValue(item, "dataList[position]");
        Item item2 = item;
        holder.getTitleTv().setText(item2.getTitleStr());
        holder.getStatusTv().setText(item2.getStatusStr());
        holder.getRootView().setOnClickListener(item2.getClickListener());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R$layout.health_heart_rate_detail_data_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    public final void f(@NotNull List<Item> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList.clear();
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }
}
