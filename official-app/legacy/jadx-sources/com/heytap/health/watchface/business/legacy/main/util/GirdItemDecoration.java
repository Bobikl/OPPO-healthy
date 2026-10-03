package com.heytap.health.watchface.business.legacy.main.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.heytap.wearable.support.watchface.common.utils.DensityUtil;
import com.oplus.aiunit.vision.ltl;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 (2\u00020\u0001:\u0002\u0016\fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b%\u0010'J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002R\u0016\u0010\u0005\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\"\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\u0019\u0010 R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010 ¨\u0006)"}, d2 = {"Lcom/heytap/health/watchface/business/legacy/main/util/GirdItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/content/Context;", "context", "", "verticalPadding", "horizontalPadding", "sidePadding", "", "d", "Lcom/heytap/health/watchface/business/legacy/main/util/GirdItemDecoration$b;", "onCustomItemOffsets", "b", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "getItemOffsets", "a", "", "I", "c", "Lcom/heytap/health/watchface/business/legacy/main/util/GirdItemDecoration$b;", "", MapSchema.FIELD_NAME_ENTRY, "Z", "isVerticalPadding", "()Z", "(Z)V", "f", "isHorizontalPadding", "setHorizontalPadding", "padding", "<init>", "(Landroid/content/Context;F)V", "(Landroid/content/Context;FFF)V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class GirdItemDecoration extends RecyclerView.ItemDecoration {

    @NotNull
    public static final String TAG = "GirdItemDecoration";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int verticalPadding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int horizontalPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int sidePadding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public b onCustomItemOffsets;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isVerticalPadding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isHorizontalPadding;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/heytap/health/watchface/business/legacy/main/util/GirdItemDecoration$b;", "", "Landroid/graphics/Rect;", "outRect", "", "position", ParserTag.SPAN_COUNT, "", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(@NotNull Rect outRect, int position, int spanCount);
    }

    public GirdItemDecoration(@NotNull Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isVerticalPadding = true;
        this.isHorizontalPadding = true;
        a(context, f, f, 0.0f);
    }

    public final void a(Context context, float verticalPadding, float horizontalPadding, float sidePadding) {
        this.horizontalPadding = DensityUtil.dp2px(context, horizontalPadding);
        this.verticalPadding = DensityUtil.dp2px(context, verticalPadding);
        this.sidePadding = DensityUtil.dp2px(context, sidePadding);
    }

    public final void b(@NotNull b onCustomItemOffsets) {
        Intrinsics.checkNotNullParameter(onCustomItemOffsets, "onCustomItemOffsets");
        this.onCustomItemOffsets = onCustomItemOffsets;
    }

    public final void c(boolean z) {
        this.isVerticalPadding = z;
    }

    public final void d(@NotNull Context context, float verticalPadding, float horizontalPadding, float sidePadding) {
        Intrinsics.checkNotNullParameter(context, "context");
        a(context, verticalPadding, horizontalPadding, sidePadding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        int spanIndex;
        int i;
        int spanSize;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            ltl.i(TAG, "getItemOffsets position is NO_POSITION and return.");
            return;
        }
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        int spanCount = 1;
        if (layoutManager != null) {
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int spanCount2 = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
                StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    spanCount = layoutParams2.isFullSpan() ? spanCount2 : 1;
                    spanIndex = layoutParams2.getSpanIndex();
                } else {
                    spanIndex = 0;
                }
                int i2 = spanCount;
                spanCount = spanCount2;
                spanSize = i2;
            } else if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                spanCount = gridLayoutManager.getSpanCount();
                spanSize = gridLayoutManager.getSpanSizeLookup().getSpanSize(childAdapterPosition);
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
                spanIndex = ((GridLayoutManager.LayoutParams) layoutParams3).getSpanIndex();
            } else {
                if (layoutManager instanceof LinearLayoutManager) {
                    int i3 = this.verticalPadding;
                    outRect.left = i3;
                    outRect.right = i3;
                    outRect.bottom = this.horizontalPadding;
                    return;
                }
                spanIndex = 0;
                spanSize = 1;
            }
            int i4 = spanCount;
            spanCount = spanSize;
            i = i4;
        } else {
            spanIndex = 0;
            i = 1;
        }
        if (spanCount == i) {
            boolean z = this.isVerticalPadding;
            outRect.left = z ? this.verticalPadding + this.sidePadding : 0;
            outRect.right = z ? this.verticalPadding + this.sidePadding : 0;
            outRect.bottom = this.isHorizontalPadding ? this.horizontalPadding : 0;
        } else {
            int i5 = this.verticalPadding;
            int i6 = this.sidePadding;
            int i7 = (((i + 1) * i5) + (i6 * 2)) / i;
            int i8 = ((i5 * (spanIndex + 1)) - (spanIndex * i7)) + i6;
            outRect.left = i8;
            outRect.right = i7 - i8;
            outRect.bottom = this.horizontalPadding;
        }
        b bVar = this.onCustomItemOffsets;
        if (bVar != null) {
            bVar.a(outRect, childAdapterPosition, i);
        }
    }

    public GirdItemDecoration(@NotNull Context context, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isVerticalPadding = true;
        this.isHorizontalPadding = true;
        a(context, f, f2, f3);
    }
}
