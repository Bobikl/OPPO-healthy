package com.heytap.health.watchface.business.creation.category.flexible.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.creation.category.flexible.adapter.ComplicationListAdapter;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.is3;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004'()*B-\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001b\u0012\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0006\u0010\u000e\u001a\u00020\rJ&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006+"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/ComplicationListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "onCreateViewHolder", "position", "getItemViewType", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "onBindViewHolder", "Lcom/oplus/aiunit/vision/is3;", MapSchema.FIELD_NAME_ENTRY, "", "", "payloads", "getItemCount", "Landroid/content/Context;", "i", "Landroid/content/Context;", "mContext", "Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/ComplicationListAdapter$b;", "j", "Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/ComplicationListAdapter$b;", "mListener", "", MapSchema.FIELD_NAME_KEY, "Ljava/util/List;", "mDataList", LogFieldKey.LEVEL_KEY, "I", "mProvideId", LogFieldKey.MESSAGE_KEY, "mSelectPosition", "<init>", "(Landroid/content/Context;Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/ComplicationListAdapter$b;Ljava/util/List;I)V", "Companion", "a", "ContentViewHolder", "b", "TitleViewHolder", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplicationListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplicationListAdapter.kt\ncom/heytap/health/watchface/business/creation/category/flexible/adapter/ComplicationListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n350#2,7:113\n*S KotlinDebug\n*F\n+ 1 ComplicationListAdapter.kt\ncom/heytap/health/watchface/business/creation/category/flexible/adapter/ComplicationListAdapter\n*L\n28#1:113,7\n*E\n"})
public final class ComplicationListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Context mContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b mListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<is3> mDataList;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int mProvideId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mSelectPosition;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/ComplicationListAdapter$ContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "b", "()Landroid/widget/TextView;", "mTitleTv", "Landroid/widget/RadioButton;", "j", "Landroid/widget/RadioButton;", "a", "()Landroid/widget/RadioButton;", "mCheckBtn", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class ContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final TextView mTitleTv;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final RadioButton mCheckBtn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.tv_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tv_title)");
            this.mTitleTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.rb_widget);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.rb_widget)");
            this.mCheckBtn = (RadioButton) viewFindViewById2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RadioButton getMCheckBtn() {
            return this.mCheckBtn;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getMTitleTv() {
            return this.mTitleTv;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/ComplicationListAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "b", "()Landroid/widget/TextView;", "mTitleTv", "Landroid/view/View;", "j", "Landroid/view/View;", "a", "()Landroid/view/View;", "mDividerView", "itemView", "<init>", "(Landroid/view/View;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class TitleViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final TextView mTitleTv;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final View mDividerView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.tv_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tv_title)");
            this.mTitleTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.view_divider);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.view_divider)");
            this.mDividerView = viewFindViewById2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final View getMDividerView() {
            return this.mDividerView;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getMTitleTv() {
            return this.mTitleTv;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/adapter/ComplicationListAdapter$b;", "", "", "providerId", "", "M", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void M(int providerId);
    }

    public ComplicationListAdapter(@NotNull Context mContext, @NotNull b mListener, @NotNull List<is3> mDataList, int i) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mContext = mContext;
        this.mListener = mListener;
        this.mDataList = mDataList;
        this.mProvideId = i;
        Iterator<is3> it = mDataList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().getProviderId() == this.mProvideId) {
                this.mSelectPosition = i2;
            }
            i2++;
        }
        i2 = -1;
        this.mSelectPosition = i2;
    }

    public static final void f(ComplicationListAdapter this$0, int i, is3 dataBean, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dataBean, "$dataBean");
        if (this$0.mSelectPosition == i) {
            return;
        }
        this$0.mListener.M(dataBean.getProviderId());
        int i2 = this$0.mSelectPosition;
        this$0.mSelectPosition = i;
        this$0.notifyItemChanged(i2, 0);
        this$0.notifyItemChanged(this$0.mSelectPosition, 0);
    }

    @NotNull
    public final is3 e() {
        return this.mDataList.get(this.mSelectPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.mDataList.get(position).getIsTitle() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final int adapterPosition = holder.getAdapterPosition();
        final is3 is3Var = this.mDataList.get(adapterPosition);
        int itemViewType = getItemViewType(adapterPosition);
        if (itemViewType == 1) {
            TitleViewHolder titleViewHolder = (TitleViewHolder) holder;
            titleViewHolder.getMTitleTv().setText(is3Var.getProviderTitle());
            titleViewHolder.getMDividerView().setVisibility(adapterPosition == 0 ? 8 : 0);
        }
        if (itemViewType == 0) {
            ContentViewHolder contentViewHolder = (ContentViewHolder) holder;
            contentViewHolder.getMTitleTv().setText(is3Var.getWidgetName());
            contentViewHolder.getMCheckBtn().setChecked(this.mSelectPosition == adapterPosition);
            contentViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.hs3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ComplicationListAdapter.f(this.i, adapterPosition, is3Var, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R$layout.watch_face_flexible_item_complication_title, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "from(mContext).inflate(\n…, false\n                )");
            return new TitleViewHolder(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(this.mContext).inflate(R$layout.watch_face_flexible_item_complication_list, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "from(mContext)\n         …tion_list, parent, false)");
        return new ContentViewHolder(viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder(holder, position, payloads);
        if (!payloads.isEmpty() && getItemViewType(position) == 0) {
            ((ContentViewHolder) holder).getMCheckBtn().setChecked(this.mSelectPosition == position);
        }
    }
}
