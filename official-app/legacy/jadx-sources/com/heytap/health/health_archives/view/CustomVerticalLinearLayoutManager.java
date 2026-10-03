package com.heytap.health.health_archives.view;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0002J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0006R\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u00060\u0006R\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\u000bJ\b\u0010\u0013\u001a\u00020\rH\u0002R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006#"}, d2 = {"Lcom/heytap/health/health_archives/view/CustomVerticalLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "canScrollHorizontally", "canScrollVertically", "isLayoutRtl", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "onLayoutChildren", "", "dx", "scrollHorizontallyBy", "computeHorizontalScrollOffset", "b", "c", "a", "i", "I", "horizontalScrollOffset", "value", "j", "Z", "d", "(Z)V", "isHorizontalScrollEnabled", MapSchema.FIELD_NAME_KEY, "isRtlInitialScrollDone", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class CustomVerticalLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int horizontalScrollOffset;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isHorizontalScrollEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isRtlInitialScrollDone;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomVerticalLinearLayoutManager(@NotNull Context context) {
        super(context, 1, false);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isHorizontalScrollEnabled = true;
    }

    public final int a() {
        if (getChildCount() == 0) {
            return 0;
        }
        int childCount = getChildCount();
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                iMin = Math.min(iMin, getDecoratedLeft(childAt));
                iMax = Math.max(iMax, getDecoratedRight(childAt));
            }
        }
        return iMax - iMin;
    }

    public final int b() {
        return RangesKt___RangesKt.coerceAtLeast(a() - getWidth(), 0);
    }

    public final void c() {
        this.isRtlInitialScrollDone = false;
        this.horizontalScrollOffset = 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: canScrollHorizontally, reason: from getter */
    public boolean getIsHorizontalScrollEnabled() {
        return this.isHorizontalScrollEnabled;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return this.horizontalScrollOffset;
    }

    public final void d(boolean z) {
        this.isHorizontalScrollEnabled = z;
        requestLayout();
    }

    public final boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        int iB;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onLayoutChildren(recycler, state);
        if (!isLayoutRtl() || this.isRtlInitialScrollDone || getChildCount() <= 0 || (iB = b()) <= 0) {
            return;
        }
        this.horizontalScrollOffset = iB;
        offsetChildrenHorizontal(-iB);
        this.isRtlInitialScrollDone = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int dx, @NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        int iA = a() - getWidth();
        if (iA <= 0) {
            d(false);
            return 0;
        }
        int iCoerceIn = RangesKt___RangesKt.coerceIn(this.horizontalScrollOffset + dx, 0, iA);
        int i = iCoerceIn - this.horizontalScrollOffset;
        if (i != 0) {
            this.horizontalScrollOffset = iCoerceIn;
            offsetChildrenHorizontal(-i);
        }
        return i;
    }
}
