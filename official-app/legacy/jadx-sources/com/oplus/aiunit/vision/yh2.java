package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.COUIRecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class yh2 {
    public COUIRecyclerView a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OrientationHelper f19015c;
    public RecyclerView.LayoutManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f19016e;
    public int b = 0;
    public boolean f = true;
    public Interpolator g = null;
    public int h = 0;
    public RecyclerView.OnScrollListener i = new a();

    public class a extends RecyclerView.OnScrollListener {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                yh2.this.o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    public interface b {
    }

    public void b(COUIRecyclerView cOUIRecyclerView) {
        this.a = cOUIRecyclerView;
        this.f19016e = cOUIRecyclerView.getContext();
    }

    public void c() {
        this.b = 0;
        this.a.removeOnScrollListener(this.i);
    }

    public final float d(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            int position = layoutManager.getPosition(childAt);
            if (position != -1 && position != layoutManager.getItemCount() - 1 && position != 0) {
                if (position < i2) {
                    view = childAt;
                    i2 = position;
                }
                if (position > i) {
                    view2 = childAt;
                    i = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(orientationHelper.getDecoratedEnd(view), orientationHelper.getDecoratedEnd(view2)) - Math.min(orientationHelper.getDecoratedStart(view), orientationHelper.getDecoratedStart(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i - i2) + 1);
    }

    public final View e(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs((layoutManager.getDecoratedLeft(childAt) + (layoutManager.getDecoratedMeasuredWidth(childAt) / 2)) - startAfterPadding);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    public View f(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.getIsHorizontalScrollEnabled()) {
            int i = this.b;
            if (i == 2) {
                return e(layoutManager, h(layoutManager));
            }
            if (i == 1) {
                return g(layoutManager, h(layoutManager));
            }
        }
        return null;
    }

    public final View g(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            boolean z = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1;
            boolean z2 = linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1;
            if (z || z2) {
                return null;
            }
        }
        int endAfterPadding = l(this.f19016e) ? orientationHelper.getEndAfterPadding() : orientationHelper.getStartAfterPadding();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs((l(this.f19016e) ? orientationHelper.getDecoratedEnd(childAt) : orientationHelper.getDecoratedStart(childAt)) - endAfterPadding);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    public final OrientationHelper h(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f19015c;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f19015c = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f19015c;
    }

    public int i() {
        return this.b;
    }

    public final RecyclerView.LayoutManager j() {
        RecyclerView.LayoutManager layoutManager = this.d;
        if (layoutManager == null || layoutManager != this.a.getLayoutManager()) {
            this.d = this.a.getLayoutManager();
        }
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int k(int i) {
        View viewF;
        float fD;
        int iRound;
        int decoratedStart;
        RecyclerView.LayoutManager layoutManagerJ = j();
        int itemCount = layoutManagerJ.getItemCount();
        if (itemCount == 0 || (viewF = f(layoutManagerJ)) == null) {
            return -1;
        }
        int position = layoutManagerJ.getPosition(viewF);
        int i2 = itemCount - 1;
        PointF pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManagerJ).computeScrollVectorForPosition(i2);
        if (pointFComputeScrollVectorForPosition == null) {
            return -1;
        }
        if (layoutManagerJ.getIsHorizontalScrollEnabled()) {
            fD = d(layoutManagerJ, h(layoutManagerJ));
            iRound = Math.round(i / fD);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iRound = -iRound;
            }
        } else {
            fD = 1.0f;
            iRound = 0;
        }
        int i3 = iRound + position;
        if (i3 != position && i3 >= 0 && i3 < itemCount) {
            int i4 = this.b;
            if (i4 == 2) {
                View childAt = (layoutManagerJ.getPosition(viewF) != 0 || layoutManagerJ.getChildCount() == 0) ? null : layoutManagerJ.getChildAt(layoutManagerJ.getChildCount() - 1);
                if (layoutManagerJ.getPosition(viewF) == i2 && layoutManagerJ.getChildCount() != 0) {
                    childAt = layoutManagerJ.getChildAt(0);
                }
                int startAfterPadding = h(layoutManagerJ).getStartAfterPadding() + (h(layoutManagerJ).getTotalSpace() / 2);
                if (childAt != null) {
                    decoratedStart = h(layoutManagerJ).getDecoratedStart(childAt) + (h(layoutManagerJ).getDecoratedMeasurement(childAt) / 2) + (l(this.f19016e) ? -((int) ((i3 - layoutManagerJ.getPosition(childAt)) * fD)) : (int) ((i3 - layoutManagerJ.getPosition(childAt)) * fD));
                } else {
                    decoratedStart = h(layoutManagerJ).getDecoratedStart(viewF) + (h(layoutManagerJ).getDecoratedMeasurement(viewF) / 2) + (l(this.f19016e) ? -((int) ((i3 - layoutManagerJ.getPosition(viewF)) * fD)) : (int) ((i3 - layoutManagerJ.getPosition(viewF)) * fD));
                }
                return decoratedStart - startAfterPadding;
            }
            if (i4 == 1) {
                int i5 = i3 - position;
                return ((l(this.f19016e) ? h(layoutManagerJ).getDecoratedEnd(viewF) : h(layoutManagerJ).getDecoratedStart(viewF)) + (l(this.f19016e) ? -((int) (i5 * fD)) : (int) (i5 * fD))) - (l(this.f19016e) ? h(layoutManagerJ).getEndAfterPadding() : h(layoutManagerJ).getStartAfterPadding());
            }
        }
        return -1;
    }

    public final boolean l(Context context) {
        return context != null && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public void m(int i) {
        this.b = i;
        this.a.addOnScrollListener(this.i);
    }

    public final void n(int i, int i2) {
        int i3;
        Interpolator interpolator = this.g;
        if (interpolator == null || (i3 = this.h) == 0) {
            this.a.smoothScrollBy(i, i2);
        } else {
            this.a.smoothScrollBy(i, i2, interpolator, i3);
        }
    }

    public final void o() {
        RecyclerView.LayoutManager layoutManagerJ;
        View viewF;
        int decoratedStart;
        int startAfterPadding;
        if ((!this.f && this.b == 2) || (layoutManagerJ = j()) == null || (viewF = f(layoutManagerJ)) == null) {
            return;
        }
        int i = this.b;
        if (i == 2) {
            int startAfterPadding2 = h(layoutManagerJ).getStartAfterPadding() + (h(layoutManagerJ).getTotalSpace() / 2);
            int itemCount = layoutManagerJ.getItemCount() - 1;
            if (layoutManagerJ.getPosition(viewF) == 0) {
                startAfterPadding2 = l(this.f19016e) ? h(layoutManagerJ).getEndAfterPadding() - (h(layoutManagerJ).getDecoratedMeasurement(viewF) / 2) : h(layoutManagerJ).getStartAfterPadding() + (h(layoutManagerJ).getDecoratedMeasurement(viewF) / 2);
            }
            if (layoutManagerJ.getPosition(viewF) == itemCount) {
                startAfterPadding2 = l(this.f19016e) ? h(layoutManagerJ).getStartAfterPadding() + (h(layoutManagerJ).getDecoratedMeasurement(viewF) / 2) : h(layoutManagerJ).getEndAfterPadding() - (h(layoutManagerJ).getDecoratedMeasurement(viewF) / 2);
            }
            int decoratedStart2 = (h(layoutManagerJ).getDecoratedStart(viewF) + (h(layoutManagerJ).getDecoratedMeasurement(viewF) / 2)) - startAfterPadding2;
            if (Math.abs(decoratedStart2) > 1.0f) {
                n(decoratedStart2, 0);
                return;
            }
            return;
        }
        if (i == 1) {
            if (l(this.f19016e)) {
                decoratedStart = h(layoutManagerJ).getDecoratedEnd(viewF);
                startAfterPadding = h(layoutManagerJ).getEndAfterPadding();
            } else {
                decoratedStart = h(layoutManagerJ).getDecoratedStart(viewF);
                startAfterPadding = h(layoutManagerJ).getStartAfterPadding();
            }
            int i2 = decoratedStart - startAfterPadding;
            if (Math.abs(i2) > 1.0f) {
                n(i2, 0);
            }
        }
    }

    public void p() {
        if (this.b != 0) {
            o();
        }
    }

    public void setOnCalculatePreChildDistanceListener(b bVar) {
    }
}
