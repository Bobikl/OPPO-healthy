package com.heytap.health.watchface.business.legacy.main.util;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public class GirdSpacesItemDecoration extends RecyclerView.ItemDecoration {
    public a a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6949c;
    public final int d;

    public static class a {
        public Drawable a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6950c;

        public a(int i, int i2, int i3) {
            this.b = i;
            this.f6950c = i2;
            if (i3 != 0) {
                this.a = new ColorDrawable(i3);
            }
        }

        public void a(Rect rect, View view, RecyclerView recyclerView) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (gridLayoutManager != null) {
                int spanCount = gridLayoutManager.getSpanCount();
                if (gridLayoutManager.getOrientation() == 1) {
                    if (gridLayoutManager.getSpanSizeLookup().getSpanGroupIndex(childAdapterPosition, spanCount) == 0) {
                        rect.top = this.f6950c;
                    }
                    rect.bottom = this.f6950c;
                    if (layoutParams.getSpanSize() == spanCount) {
                        int i = this.b;
                        rect.left = i;
                        rect.right = i;
                        return;
                    } else {
                        float f = spanCount;
                        float spanIndex = (spanCount - layoutParams.getSpanIndex()) / f;
                        int i2 = this.b;
                        int i3 = (int) (spanIndex * i2);
                        rect.left = i3;
                        rect.right = (int) (((i2 * (spanCount + 1)) / f) - i3);
                        return;
                    }
                }
                if (gridLayoutManager.getSpanSizeLookup().getSpanGroupIndex(childAdapterPosition, spanCount) == 0) {
                    rect.left = this.b;
                }
                rect.right = this.b;
                if (layoutParams.getSpanSize() == spanCount) {
                    int i4 = this.f6950c;
                    rect.top = i4;
                    rect.bottom = i4;
                } else {
                    float f2 = spanCount;
                    float spanIndex2 = (spanCount - layoutParams.getSpanIndex()) / f2;
                    int i5 = this.f6950c;
                    int i6 = (int) (spanIndex2 * i5);
                    rect.top = i6;
                    rect.bottom = (int) (((i5 * (spanCount + 1)) / f2) - i6);
                }
            }
        }

        public void b(Canvas canvas, RecyclerView recyclerView) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            if (gridLayoutManager != null) {
                GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
                if (this.a == null || gridLayoutManager.getChildCount() == 0) {
                    return;
                }
                int spanCount = gridLayoutManager.getSpanCount();
                int childCount = recyclerView.getChildCount();
                float f = 2.0f;
                int i = 1;
                if (gridLayoutManager.getOrientation() == 1) {
                    int i2 = 0;
                    while (i2 < childCount) {
                        View childAt = recyclerView.getChildAt(i2);
                        float leftDecorationWidth = (((((gridLayoutManager.getLeftDecorationWidth(childAt) + gridLayoutManager.getRightDecorationWidth(childAt)) * spanCount) / (spanCount + 1)) + 1.0f) - this.b) / f;
                        float bottomDecorationHeight = ((gridLayoutManager.getBottomDecorationHeight(childAt) + i) - this.f6950c) / f;
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                        int spanSize = spanSizeLookup.getSpanSize(childAdapterPosition);
                        int spanIndex = spanSizeLookup.getSpanIndex(childAdapterPosition, gridLayoutManager.getSpanCount());
                        int i3 = gridLayoutManager.getSpanSizeLookup().getSpanGroupIndex(childAdapterPosition, spanCount) == 0 ? i : 0;
                        if (i3 == 0 && spanIndex == 0) {
                            int leftDecorationWidth2 = gridLayoutManager.getLeftDecorationWidth(childAt);
                            int width = recyclerView.getWidth() - gridLayoutManager.getLeftDecorationWidth(childAt);
                            int top = (int) (childAt.getTop() - bottomDecorationHeight);
                            int i4 = this.f6950c;
                            int i5 = top - i4;
                            this.a.setBounds(leftDecorationWidth2, i5, width, i4 + i5);
                            this.a.draw(canvas);
                        }
                        if (!(spanIndex + spanSize == spanCount)) {
                            int right = (int) (childAt.getRight() + leftDecorationWidth);
                            int i6 = this.b + right;
                            int top2 = childAt.getTop();
                            if (i3 == 0) {
                                top2 = (int) (top2 - bottomDecorationHeight);
                            }
                            this.a.setBounds(right, top2, i6, (int) (childAt.getBottom() + bottomDecorationHeight));
                            this.a.draw(canvas);
                        }
                        i2++;
                        spanSizeLookup = spanSizeLookup;
                        gridLayoutManager = gridLayoutManager;
                        f = 2.0f;
                        i = 1;
                    }
                    return;
                }
                GridLayoutManager gridLayoutManager2 = gridLayoutManager;
                GridLayoutManager.SpanSizeLookup spanSizeLookup2 = spanSizeLookup;
                int i7 = 0;
                while (i7 < childCount) {
                    View childAt2 = recyclerView.getChildAt(i7);
                    gridLayoutManager2 = gridLayoutManager2;
                    float rightDecorationWidth = ((gridLayoutManager2.getRightDecorationWidth(childAt2) + 1) - this.b) / 2.0f;
                    float topDecorationHeight = ((((gridLayoutManager2.getTopDecorationHeight(childAt2) + gridLayoutManager2.getBottomDecorationHeight(childAt2)) * spanCount) / (spanCount + 1)) - this.f6950c) / 2.0f;
                    int childAdapterPosition2 = recyclerView.getChildAdapterPosition(childAt2);
                    GridLayoutManager.SpanSizeLookup spanSizeLookup3 = spanSizeLookup2;
                    int spanSize2 = spanSizeLookup3.getSpanSize(childAdapterPosition2);
                    int spanIndex2 = spanSizeLookup3.getSpanIndex(childAdapterPosition2, gridLayoutManager2.getSpanCount());
                    boolean z = gridLayoutManager2.getSpanSizeLookup().getSpanGroupIndex(childAdapterPosition2, spanCount) == 0;
                    if (!z && spanIndex2 == 0) {
                        int left = (int) (childAt2.getLeft() - rightDecorationWidth);
                        int i8 = this.b;
                        int i9 = left - i8;
                        this.a.setBounds(i9, gridLayoutManager2.getRightDecorationWidth(childAt2), i8 + i9, recyclerView.getHeight() - gridLayoutManager2.getTopDecorationHeight(childAt2));
                        this.a.draw(canvas);
                    }
                    if (!(spanIndex2 + spanSize2 == spanCount)) {
                        int left2 = childAt2.getLeft();
                        if (!z) {
                            left2 = (int) (left2 - rightDecorationWidth);
                        }
                        int right2 = (int) (childAt2.getRight() + topDecorationHeight);
                        int bottom = (int) (childAt2.getBottom() + rightDecorationWidth);
                        this.a.setBounds(left2, bottom, right2, this.b + bottom);
                        this.a.draw(canvas);
                    }
                    i7++;
                    spanSizeLookup2 = spanSizeLookup3;
                    childCount = childCount;
                }
            }
        }
    }

    public GirdSpacesItemDecoration(int i, int i2) {
        this.f6949c = i;
        this.d = i2;
    }

    public final a a(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return new a(this.f6949c, this.d, this.b);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (this.a == null) {
            this.a = a(recyclerView.getLayoutManager());
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(rect, view, recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (this.a == null) {
            this.a = a(recyclerView.getLayoutManager());
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.b(canvas, recyclerView);
        }
        super.onDraw(canvas, recyclerView, state);
    }
}
