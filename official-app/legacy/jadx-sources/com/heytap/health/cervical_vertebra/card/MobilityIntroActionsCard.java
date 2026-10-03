package com.heytap.health.cervical_vertebra.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.view.recyclercard.a;
import com.heytap.health.cervical_vertebra.R$drawable;
import com.heytap.health.cervical_vertebra.R$id;
import com.heytap.health.cervical_vertebra.R$layout;
import com.heytap.health.cervical_vertebra.R$string;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/cervical_vertebra/card/MobilityIntroActionsCard;", "Lcom/heytap/health/base/view/recyclercard/a;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "", "Lcom/heytap/health/cervical_vertebra/card/MobilityIntroActionsCard$a;", "o", "", "Ljava/util/List;", "itemList", LogFieldKey.PROCESS_NAME_KEY, "Landroid/content/Context;", "<init>", "()V", "a", "MobilityIntroActionsAdapter", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class MobilityIntroActionsCard extends a {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final List<IntroActionItem> itemList = new ArrayList();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public Context context;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/cervical_vertebra/card/MobilityIntroActionsCard$MobilityIntroActionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/health/cervical_vertebra/card/MobilityIntroActionsCard$MobilityIntroActionsAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, MapSchema.FIELD_NAME_ENTRY, BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "d", "getItemCount", "", "Lcom/heytap/health/cervical_vertebra/card/MobilityIntroActionsCard$a;", "i", "Ljava/util/List;", "dataList", "list", "<init>", "(Ljava/util/List;)V", "ViewHolder", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
    public static final class MobilityIntroActionsAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final List<IntroActionItem> dataList;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/cervical_vertebra/card/MobilityIntroActionsCard$MobilityIntroActionsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "i", "Landroid/widget/ImageView;", "a", "()Landroid/widget/ImageView;", "imageView", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "b", "()Landroid/widget/TextView;", "title", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
        public static final class ViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @NotNull
            public final ImageView imageView;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final TextView title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewHolder(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
                View viewFindViewById = view.findViewById(R$id.iv_cervical_mobility_view_intro_action);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.i…bility_view_intro_action)");
                this.imageView = (ImageView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(R$id.tv_cervical_mobility_view_intro_action);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.t…bility_view_intro_action)");
                this.title = (TextView) viewFindViewById2;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final ImageView getImageView() {
                return this.imageView;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final TextView getTitle() {
                return this.title;
            }
        }

        public MobilityIntroActionsAdapter(@NotNull List<IntroActionItem> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.dataList = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            IntroActionItem introActionItem = this.dataList.get(position);
            holder.getTitle().setText(introActionItem.getTitleStr());
            holder.getImageView().setImageResource(introActionItem.getActionResId());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View view = LayoutInflater.from(parent.getContext()).inflate(R$layout.health_cervical_vertebra_item_intro_action, parent, false);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            return new ViewHolder(view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.dataList.size();
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.cervical_vertebra.card.MobilityIntroActionsCard$a, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/cervical_vertebra/card/MobilityIntroActionsCard$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "actionResId", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "titleStr", "<init>", "(ILjava/lang/String;)V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class IntroActionItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int actionResId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String titleStr;

        public IntroActionItem(int i, @NotNull String titleStr) {
            Intrinsics.checkNotNullParameter(titleStr, "titleStr");
            this.actionResId = i;
            this.titleStr = titleStr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getActionResId() {
            return this.actionResId;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitleStr() {
            return this.titleStr;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntroActionItem)) {
                return false;
            }
            IntroActionItem introActionItem = (IntroActionItem) other;
            return this.actionResId == introActionItem.actionResId && Intrinsics.areEqual(this.titleStr, introActionItem.titleStr);
        }

        public int hashCode() {
            return (Integer.hashCode(this.actionResId) * 31) + this.titleStr.hashCode();
        }

        @NotNull
        public String toString() {
            return "IntroActionItem(actionResId=" + this.actionResId + ", titleStr=" + this.titleStr + ")";
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_cervical_vertebra_card_mobility_intro_actions;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @NotNull View cardView) {
        Context context2;
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        super.l(context, cardView);
        if (context == null) {
            context2 = cardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "cardView.context");
        } else {
            context2 = context;
        }
        this.context = context2;
        View viewA = a(cardView, R$id.rv_cervical_mobility_intro_actions);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewA;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        MobilityIntroActionsAdapter mobilityIntroActionsAdapter = new MobilityIntroActionsAdapter(this.itemList);
        recyclerView.setAdapter(mobilityIntroActionsAdapter);
        this.itemList.clear();
        this.itemList.addAll(o());
        mobilityIntroActionsAdapter.notifyItemRangeChanged(0, this.itemList.size());
    }

    public final List<IntroActionItem> o() {
        ArrayList arrayList = new ArrayList();
        int i = R$drawable.cervical_vertebra_mobility_action_prepare;
        Context context = this.context;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        String string = context.getString(R$string.health_cervical_vertebra_action_prepare);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_vertebra_action_prepare)");
        arrayList.add(new IntroActionItem(i, string));
        int i2 = R$drawable.cervical_vertebra_mobility_action_rotate_left;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context3 = null;
        }
        String string2 = context3.getString(R$string.health_cervical_vertebra_action_rotate_left);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…tebra_action_rotate_left)");
        arrayList.add(new IntroActionItem(i2, string2));
        int i3 = R$drawable.cervical_vertebra_mobility_action_rotate_right;
        Context context4 = this.context;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context4 = null;
        }
        String string3 = context4.getString(R$string.health_cervical_vertebra_action_rotate_right);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ebra_action_rotate_right)");
        arrayList.add(new IntroActionItem(i3, string3));
        int i4 = R$drawable.cervical_vertebra_mobility_action_forward;
        Context context5 = this.context;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context5 = null;
        }
        String string4 = context5.getString(R$string.health_cervical_vertebra_action_forward);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…_vertebra_action_forward)");
        arrayList.add(new IntroActionItem(i4, string4));
        int i5 = R$drawable.cervical_vertebra_mobility_action_backward;
        Context context6 = this.context;
        if (context6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context6 = null;
        }
        String string5 = context6.getString(R$string.health_cervical_vertebra_action_backward);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…vertebra_action_backward)");
        arrayList.add(new IntroActionItem(i5, string5));
        int i6 = R$drawable.cervical_vertebra_mobility_action_left_flexion;
        Context context7 = this.context;
        if (context7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context7 = null;
        }
        String string6 = context7.getString(R$string.health_cervical_vertebra_action_left_flexion);
        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.stri…ebra_action_left_flexion)");
        arrayList.add(new IntroActionItem(i6, string6));
        int i7 = R$drawable.cervical_vertebra_mobility_action_right_flexion;
        Context context8 = this.context;
        if (context8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context2 = context8;
        }
        String string7 = context2.getString(R$string.health_cervical_vertebra_action_right_flexion);
        Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.stri…bra_action_right_flexion)");
        arrayList.add(new IntroActionItem(i7, string7));
        return arrayList;
    }
}
