package com.heytap.health.base.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J.\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/base/view/OnPageChangeCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "", "position", "", "onPageSelected", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "beforeViewHolder", "afterViewHolder", "a", "Landroidx/viewpager2/widget/ViewPager2;", "i", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager2", "()Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "<init>", "(Landroidx/viewpager2/widget/ViewPager2;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public abstract class OnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ViewPager2 viewPager2;

    public OnPageChangeCallback(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager2");
        this.viewPager2 = viewPager2;
    }

    public void a(int position, @Nullable RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ViewHolder beforeViewHolder, @Nullable RecyclerView.ViewHolder afterViewHolder) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int position) {
        super.onPageSelected(position);
        View childAt = this.viewPager2.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) childAt;
        a(position, recyclerView.findViewHolderForAdapterPosition(position), recyclerView.findViewHolderForAdapterPosition(position - 1), recyclerView.findViewHolderForAdapterPosition(position + 1));
    }
}
