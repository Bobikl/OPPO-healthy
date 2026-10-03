package com.heytap.store.product_support.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.heytap.store.platform.tools.SizeUtils;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\u0004R\u001b\u0010\r\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/product_support/widget/TwoCardFlowDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", ParserTag.SPAN_COUNT, "", "(I)V", "cardSpacing", "getCardSpacing", "()I", "cardSpacing$delegate", "Lkotlin/Lazy;", "firstRowPadding", "getFirstRowPadding", "setFirstRowPadding", "oneCardPadding", "getOneCardPadding", "oneCardPadding$delegate", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TwoCardFlowDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: cardSpacing$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardSpacing;
    private int firstRowPadding;

    /* JADX INFO: renamed from: oneCardPadding$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy oneCardPadding;
    private final int spanCount;

    public TwoCardFlowDecoration() {
        this(0, 1, null);
    }

    private final int getCardSpacing() {
        return ((Number) this.cardSpacing.getValue()).intValue();
    }

    private final int getOneCardPadding() {
        return ((Number) this.oneCardPadding.getValue()).intValue();
    }

    public final int getFirstRowPadding() {
        return this.firstRowPadding;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        int spanIndex;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int layoutPosition = parent.getChildViewHolder(view).getLayoutPosition();
        int i = this.spanCount;
        if (i == 1) {
            if (layoutPosition == 0) {
                outRect.top = this.firstRowPadding;
            } else {
                outRect.top = getOneCardPadding();
            }
            outRect.left = getCardSpacing();
            outRect.right = getCardSpacing();
            return;
        }
        int i2 = i - 1;
        if (view.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            }
            spanIndex = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex();
        } else {
            spanIndex = layoutPosition % this.spanCount;
        }
        int cardSpacing = layoutPosition < i2 + 1 ? this.firstRowPadding : getCardSpacing();
        if (spanIndex == 0) {
            outRect.set(getCardSpacing(), cardSpacing, getCardSpacing(), getCardSpacing());
        } else if (spanIndex == i2) {
            outRect.set(getCardSpacing(), cardSpacing, getCardSpacing(), getCardSpacing());
        } else {
            outRect.set(getCardSpacing(), cardSpacing, getCardSpacing(), getCardSpacing());
        }
    }

    public final void setFirstRowPadding(int i) {
        this.firstRowPadding = i;
    }

    public TwoCardFlowDecoration(int i) {
        this.spanCount = i;
        this.firstRowPadding = SizeUtils.INSTANCE.dp2px(10.0f);
        this.cardSpacing = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.product_support.widget.TwoCardFlowDecoration$cardSpacing$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(SizeUtils.INSTANCE.dp2px(2.0f));
            }
        });
        this.oneCardPadding = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.product_support.widget.TwoCardFlowDecoration$oneCardPadding$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(SizeUtils.INSTANCE.dp2px(10.0f));
            }
        });
    }

    public /* synthetic */ TwoCardFlowDecoration(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i);
    }
}
