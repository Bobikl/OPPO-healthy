package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.home.impl.R$layout;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/ra9;", "Lcom/oplus/aiunit/vision/e7c;", "", "a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "Landroid/content/Context;", "context", "", "b", "viewHolder", "Lcom/oplus/aiunit/vision/pa9;", "cardData", "", MapSchema.FIELD_NAME_ENTRY, "i", "Lcom/oplus/aiunit/vision/pa9;", "<init>", "(Lcom/oplus/aiunit/vision/pa9;)V", "home_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ra9 extends e7c {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final pa9 cardData;

    public ra9(@NotNull pa9 cardData) {
        Intrinsics.checkNotNullParameter(cardData, "cardData");
        this.cardData = cardData;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.home_card_common;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(@NotNull RecyclerView.ViewHolder holder, int position, @Nullable Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = -xu5.a(holder.itemView.getContext(), 10.0f);
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            holder.itemView.setLayoutParams(layoutParams);
        }
        e(holder, this.cardData);
    }

    public final boolean e(RecyclerView.ViewHolder viewHolder, pa9 cardData) {
        Object tag;
        int iA = cardData.a();
        String name = cardData.getClass().getName();
        View view = viewHolder.itemView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("getOrAddView() start find key=");
        sb.append(iA);
        sb.append(", tag=");
        sb.append(name);
        sb.append("; child=");
        sb.append(childAt);
        if ((childAt == null || (tag = childAt.getTag(iA)) == null || !tag.equals(name)) ? false : true) {
            cardData.e(childAt);
            if (!cardData.d()) {
                cardData.c();
                cardData.j(true);
            }
            return true;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewHolder.itemView.getContext());
        int iA2 = cardData.a();
        View view2 = viewHolder.itemView;
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewInflate = layoutInflaterFrom.inflate(iA2, (ViewGroup) view2, false);
        cardData.e(viewInflate);
        cardData.c();
        cardData.j(true);
        viewInflate.setTag(iA, name);
        View view3 = viewHolder.itemView;
        Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view3).removeAllViews();
        View view4 = viewHolder.itemView;
        Intrinsics.checkNotNull(view4, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view4).addView(viewInflate);
        return false;
    }
}
