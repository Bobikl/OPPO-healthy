package com.heytap.health.esim.nec;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.esim.R$drawable;
import com.heytap.health.esim.R$id;
import com.heytap.health.esim.R$layout;
import com.heytap.health.esim.nec.SimInfoAdapter;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.SimInfo;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.v0j;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\"#B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J&\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0019j\b\u0012\u0004\u0012\u00020\u0004`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/heytap/health/esim/nec/SimInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "Lcom/oplus/aiunit/vision/k3h;", "simInfos", "", b2n.f, MapSchema.FIELD_NAME_ENTRY, "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "onCreateViewHolder", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "onBindViewHolder", "", "", "payloads", "getItemCount", "getItemViewType", "i", "I", "mSelectedIndex", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "j", "Ljava/util/ArrayList;", "mSimInfos", "<init>", "()V", "Companion", "a", "EmptyViewHolder", "SimViewHolder", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SimInfoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int mSelectedIndex;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayList<SimInfo> mSimInfos = new ArrayList<>();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/esim/nec/SimInfoAdapter$EmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EmptyViewHolder extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/esim/nec/SimInfoAdapter$SimViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "d", "()Landroid/widget/TextView;", "titleTv", "j", "a", "contentTv", "Landroid/widget/RadioButton;", MapSchema.FIELD_NAME_KEY, "Landroid/widget/RadioButton;", "c", "()Landroid/widget/RadioButton;", "radioButton", "Landroid/view/View;", LogFieldKey.LEVEL_KEY, "Landroid/view/View;", "b", "()Landroid/view/View;", "dividerView", "itemView", "<init>", "(Landroid/view/View;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class SimViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final TextView titleTv;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TextView contentTv;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final RadioButton radioButton;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final View dividerView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.tv_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tv_title)");
            this.titleTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.tv_content)");
            this.contentTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.radio_button);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.id.radio_button)");
            this.radioButton = (RadioButton) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R$id.view_divider);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "itemView.findViewById(R.id.view_divider)");
            this.dividerView = viewFindViewById4;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getContentTv() {
            return this.contentTv;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final View getDividerView() {
            return this.dividerView;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final RadioButton getRadioButton() {
            return this.radioButton;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getTitleTv() {
            return this.titleTv;
        }
    }

    public static final void f(SimInfoAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i2 = this$0.mSelectedIndex;
        if (i2 == i) {
            return;
        }
        this$0.mSelectedIndex = i;
        this$0.notifyItemChanged(i2, 0);
        this$0.notifyItemChanged(this$0.mSelectedIndex, 0);
    }

    @Nullable
    public final SimInfo e() {
        int i = this.mSelectedIndex;
        if (i < 0 || i >= this.mSimInfos.size()) {
            return null;
        }
        return this.mSimInfos.get(this.mSelectedIndex);
    }

    public final void g(@NotNull List<SimInfo> simInfos) {
        Intrinsics.checkNotNullParameter(simInfos, "simInfos");
        this.mSimInfos.clear();
        this.mSimInfos.addAll(simInfos);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.mSimInfos.isEmpty()) {
            return 1;
        }
        return this.mSimInfos.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.mSimInfos.isEmpty() ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(position) == 1) {
            SimViewHolder simViewHolder = (SimViewHolder) holder;
            final int bindingAdapterPosition = simViewHolder.getBindingAdapterPosition();
            simViewHolder.getTitleTv().setText(this.mSimInfos.get(bindingAdapterPosition).b());
            simViewHolder.getContentTv().setText(v0j.c(this.mSimInfos.get(bindingAdapterPosition).getPhoneNum()));
            simViewHolder.getRadioButton().setChecked(bindingAdapterPosition == this.mSelectedIndex);
            simViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.l3h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimInfoAdapter.f(this.i, bindingAdapterPosition, view);
                }
            });
            if (bindingAdapterPosition == 0 && this.mSimInfos.size() > 1) {
                simViewHolder.itemView.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R$drawable.esim_item_bg_header));
                simViewHolder.getDividerView().setVisibility(0);
            } else if (bindingAdapterPosition == 0 && this.mSimInfos.size() == 1) {
                simViewHolder.itemView.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R$drawable.esim_item_bg_content));
                simViewHolder.getDividerView().setVisibility(8);
            } else if (bindingAdapterPosition == this.mSimInfos.size() - 1) {
                simViewHolder.itemView.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R$drawable.esim_item_bg_footer));
                simViewHolder.getDividerView().setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.esim_item_sim, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inf…_item_sim, parent, false)");
            return new SimViewHolder(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R$layout.esim_item_empty, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "from(parent.context).inf…tem_empty, parent, false)");
        return new EmptyViewHolder(viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder(holder, position, payloads);
        if (payloads.isEmpty()) {
            return;
        }
        ((SimViewHolder) holder).getRadioButton().setChecked(position == this.mSelectedIndex);
    }
}
