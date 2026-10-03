package com.heytap.health.sleep.disturb.ui.card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.sleep.R$drawable;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.R$string;
import com.heytap.health.sleep.disturb.bean.RankItem;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.hw5;
import com.oplus.aiunit.vision.wv5;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0014\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/sleep/disturb/ui/card/TypeCard;", "Lcom/oplus/aiunit/vision/wv5;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", "o", "", "Lcom/heytap/health/sleep/disturb/bean/RankItem;", "itemList", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/sleep/disturb/ui/card/TypeCard$a;", "Lcom/heytap/health/sleep/disturb/ui/card/TypeCard$a;", "adapter", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroid/widget/TextView;", "q", "Landroid/widget/TextView;", "tvNoData", "<init>", "()V", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class TypeCard extends wv5 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final a adapter = new a(new ArrayList());

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public RecyclerView recycler;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public TextView tvNoData;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/sleep/disturb/ui/card/TypeCard$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/health/sleep/disturb/ui/card/TypeCard$a$a;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, MapSchema.FIELD_NAME_ENTRY, BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "d", "getItemCount", "", "Lcom/heytap/health/sleep/disturb/bean/RankItem;", "i", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "list", "<init>", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends RecyclerView.Adapter<C0636a> {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public List<? extends RankItem> list;

        /* JADX INFO: renamed from: com.heytap.health.sleep.disturb.ui.card.TypeCard$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/sleep/disturb/ui/card/TypeCard$a$a;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "b", "()Landroid/widget/TextView;", "tvTypeName", "j", "a", "tvTypeDuration", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0636a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @NotNull
            public final TextView tvTypeName;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final TextView tvTypeDuration;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0636a(@NotNull View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                View viewFindViewById = itemView.findViewById(R$id.tvTypeName);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tvTypeName)");
                this.tvTypeName = (TextView) viewFindViewById;
                View viewFindViewById2 = itemView.findViewById(R$id.tvTypeDuration);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.tvTypeDuration)");
                this.tvTypeDuration = (TextView) viewFindViewById2;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final TextView getTvTypeDuration() {
                return this.tvTypeDuration;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final TextView getTvTypeName() {
                return this.tvTypeName;
            }
        }

        public a(@NotNull List<? extends RankItem> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C0636a holder, int position) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(holder, "holder");
            RankItem rankItem = this.list.get(position);
            holder.getTvTypeName().setText(rankItem.getName());
            if (position != 0) {
                drawable = position != 1 ? b78.a().getDrawable(R$drawable.health_sleep_ic_disturb_type_3_v2) : b78.a().getDrawable(R$drawable.health_sleep_ic_disturb_type_2_v2);
            } else {
                drawable = b78.a().getDrawable(R$drawable.health_sleep_ic_disturb_type_1_v2);
            }
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                holder.getTvTypeName().setCompoundDrawables(drawable, null, null, null);
            }
            holder.getTvTypeDuration().setText(hw5.a(rankItem.getDuration()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0636a onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View view = LayoutInflater.from(parent.getContext()).inflate(R$layout.health_sleep_view_disturb_type_item, parent, false);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            return new C0636a(view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.list.size();
        }

        public final void setList(@NotNull List<? extends RankItem> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.list = list;
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_sleep_view_disturb_common_list_card;
    }

    @Override // com.oplus.aiunit.vision.wv5
    public void o(@NotNull final Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        View viewA = a(cardView, R$id.tvCardTitle);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewA).setText(R$string.health_sleep_disturb_top_3_type);
        View viewA2 = a(cardView, R$id.tvNoData);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type android.widget.TextView");
        this.tvNoData = (TextView) viewA2;
        View viewA3 = a(cardView, R$id.rvCardList);
        Intrinsics.checkNotNull(viewA3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewA3;
        this.recycler = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycler");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.heytap.health.sleep.disturb.ui.card.TypeCard$initView$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        RecyclerView recyclerView3 = this.recycler;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycler");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setAdapter(this.adapter);
    }

    public final void p(@NotNull List<? extends RankItem> itemList) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        RecyclerView recyclerView = null;
        if (itemList.isEmpty()) {
            TextView textView = this.tvNoData;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvNoData");
                textView = null;
            }
            textView.setVisibility(0);
            RecyclerView recyclerView2 = this.recycler;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recycler");
            } else {
                recyclerView = recyclerView2;
            }
            recyclerView.setVisibility(8);
            return;
        }
        TextView textView2 = this.tvNoData;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvNoData");
            textView2 = null;
        }
        textView2.setVisibility(8);
        RecyclerView recyclerView3 = this.recycler;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycler");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setVisibility(0);
        this.adapter.setList(itemList);
        this.adapter.notifyDataSetChanged();
    }
}
