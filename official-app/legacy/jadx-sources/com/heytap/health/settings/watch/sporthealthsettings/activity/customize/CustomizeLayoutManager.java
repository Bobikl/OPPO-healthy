package com.heytap.health.settings.watch.sporthealthsettings.activity.customize;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.o9l;

/* JADX INFO: loaded from: classes18.dex */
public class CustomizeLayoutManager extends RecyclerView.LayoutManager {
    public final Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5487j = 0;
    public int k;

    public CustomizeLayoutManager(String str) {
        this.i = (Boolean) lc5.d(str).a(new o9l());
    }

    public final void a(RecyclerView.Recycler recycler) {
        int width;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int i = 0;
        Rect rect = new Rect(0, this.k, b(), this.k + c());
        int paddingStart2 = paddingStart;
        int iMax = paddingTop;
        int i2 = 0;
        int i3 = 0;
        while (i2 < getItemCount()) {
            View viewForPosition = recycler.getViewForPosition(i2);
            if (i2 == 0) {
                width = this.i.booleanValue() ? i : (int) (((double) ((getWidth() - getPaddingStart()) - getPaddingEnd())) * 0.3d);
            } else {
                width = (((getWidth() - getPaddingStart()) - getPaddingEnd()) / 2) + ejg.a(viewForPosition.getContext(), 8.0f);
            }
            measureChildWithMargins(viewForPosition, width, i);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
            addView(viewForPosition);
            Rect rect2 = new Rect();
            rect2.set(paddingStart2, iMax, paddingStart2 + decoratedMeasuredWidth, iMax + decoratedMeasuredHeight);
            if (d(rect, rect2)) {
                int i4 = rect2.left;
                int i5 = rect2.top;
                int i6 = this.k;
                layoutDecoratedWithMargins(viewForPosition, i4, i5 - i6, rect2.right, rect2.bottom - i6);
            } else {
                removeAndRecycleView(viewForPosition, recycler);
            }
            i2++;
            if (i2 != getItemCount()) {
                if (i2 % 2 == 0) {
                    paddingStart2 += decoratedMeasuredWidth + ejg.a(viewForPosition.getContext(), 16.0f);
                } else {
                    paddingStart2 = getPaddingStart();
                    iMax += Math.max(decoratedMeasuredHeight, i3) + ejg.a(viewForPosition.getContext(), 10.0f);
                }
                i3 = decoratedMeasuredHeight;
            }
            i = 0;
        }
        this.f5487j = Math.max(iMax, c());
    }

    public int b() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final int c() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return true;
    }

    public boolean d(Rect rect, Rect rect2) {
        return rect2.top < rect.bottom || rect.top < rect2.bottom;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        this.f5487j = 0;
        if (getItemCount() <= 0 || state.isPreLayout()) {
            return;
        }
        detachAndScrapAttachedViews(recycler);
        a(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        detachAndScrapAttachedViews(recycler);
        int i2 = this.k;
        if (i2 + i < 0) {
            i = -i2;
        } else if (i2 + i > this.f5487j - c()) {
            i = (this.f5487j - c()) - this.k;
        }
        offsetChildrenVertical(-i);
        a(recycler);
        this.k += i;
        return i;
    }
}
