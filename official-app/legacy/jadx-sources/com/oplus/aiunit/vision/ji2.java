package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.COUIGradualStopAdapter;
import androidx.recyclerview.widget.COUIRecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class ji2 {
    public static final boolean f;
    public COUIRecyclerView a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.LayoutManager f12915c;
    public OrientationHelper d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12916e = -1;

    static {
        f = bj2.LOG_DEBUG || bj2.e("COUIGradualStopHelper", 3);
    }

    public void a(COUIRecyclerView cOUIRecyclerView) {
        this.a = cOUIRecyclerView;
        this.b = cOUIRecyclerView.getContext();
    }

    public final View b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
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

    public View c() {
        RecyclerView.LayoutManager layoutManagerM = m();
        int childCount = layoutManagerM.getChildCount();
        OrientationHelper orientationHelperN = n(layoutManagerM);
        float startAfterPadding = orientationHelperN.getStartAfterPadding() + (orientationHelperN.getTotalSpace() / 2.0f);
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManagerM.getChildAt(i);
            if (childAt != null) {
                int decoratedStart = orientationHelperN.getDecoratedStart(childAt);
                int decoratedEnd = orientationHelperN.getDecoratedEnd(childAt);
                if (startAfterPadding >= decoratedStart && startAfterPadding <= decoratedEnd) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public float d(int i) {
        int childCount;
        RecyclerView.LayoutManager layoutManagerM = m();
        if (layoutManagerM == null || (childCount = layoutManagerM.getChildCount()) == 0) {
            return 0.0f;
        }
        OrientationHelper orientationHelperN = n(layoutManagerM);
        float startAfterPadding = orientationHelperN.getStartAfterPadding() + (orientationHelperN.getTotalSpace() / 2.0f);
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManagerM.getChildAt(i2);
            if (childAt != null) {
                int decoratedStart = orientationHelperN.getDecoratedStart(childAt);
                int decoratedEnd = orientationHelperN.getDecoratedEnd(childAt);
                float f2 = decoratedStart;
                if (startAfterPadding >= f2) {
                    float f3 = decoratedEnd;
                    if (startAfterPadding <= f3) {
                        if (i > 0) {
                            return f3 - startAfterPadding;
                        }
                        if (i < 0) {
                            return f2 - startAfterPadding;
                        }
                        float f4 = f2 - startAfterPadding;
                        float f5 = f3 - startAfterPadding;
                        return Math.abs(f4) <= Math.abs(f5) ? f4 : f5;
                    }
                } else {
                    continue;
                }
            }
        }
        if (f) {
            Log.d("COUIGradualStopHelper", "getCenterToEdgeOffsetInVelocityDirection has no center item");
        }
        return 0.0f;
    }

    public float e() {
        int childCount;
        RecyclerView.LayoutManager layoutManagerM = m();
        float f2 = 0.0f;
        if (layoutManagerM == null || (childCount = layoutManagerM.getChildCount()) == 0) {
            return 0.0f;
        }
        OrientationHelper orientationHelperN = n(layoutManagerM);
        float startAfterPadding = orientationHelperN.getStartAfterPadding() + (orientationHelperN.getTotalSpace() / 2.0f);
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManagerM.getChildAt(i);
            if (childAt != null) {
                int decoratedStart = orientationHelperN.getDecoratedStart(childAt);
                int decoratedEnd = orientationHelperN.getDecoratedEnd(childAt);
                if (startAfterPadding >= decoratedStart && startAfterPadding <= decoratedEnd) {
                    return l(childAt) - startAfterPadding;
                }
            }
        }
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = layoutManagerM.getChildAt(i2);
            if (childAt2 != null) {
                float fL = l(childAt2) - startAfterPadding;
                float fAbs = Math.abs(fL);
                if (fAbs < f3) {
                    f2 = fL;
                    f3 = fAbs;
                }
            }
        }
        return f2;
    }

    public float f(View view, int i, boolean z) {
        RecyclerView.LayoutManager layoutManagerM = m();
        if (layoutManagerM == null) {
            return 0.0f;
        }
        OrientationHelper orientationHelperN = n(layoutManagerM);
        int decoratedEnd = orientationHelperN.getDecoratedEnd(view);
        int decoratedStart = orientationHelperN.getDecoratedStart(view);
        int iK = k(i);
        int iG = g(i);
        int i2 = z ? 1 : -1;
        if (o(this.b)) {
            i2 = z ? -1 : 1;
        }
        if (i2 != 1) {
            decoratedEnd = decoratedStart;
        }
        return decoratedEnd + ((i2 * (iG + (iK * i2))) / 2.0f);
    }

    public int g(int i) {
        if (m() == null) {
            return 0;
        }
        RecyclerView.Adapter adapter = this.a.getAdapter();
        int itemDecoratedMeasurement = adapter instanceof COUIGradualStopAdapter ? ((COUIGradualStopAdapter) adapter).getItemDecoratedMeasurement(i) : 0;
        return itemDecoratedMeasurement <= 0 ? i(i) : itemDecoratedMeasurement;
    }

    public final int h(int i) {
        View viewFindViewByPosition;
        int i2;
        int i3;
        RecyclerView.LayoutManager layoutManagerM = m();
        if (layoutManagerM == null || (viewFindViewByPosition = layoutManagerM.findViewByPosition(i)) == null || !(viewFindViewByPosition.getLayoutParams() instanceof RecyclerView.LayoutParams)) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewFindViewByPosition.getLayoutParams();
        if ((layoutManagerM instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManagerM).getOrientation() == 1) {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i3 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }
        return i2 - i3;
    }

    public final int i(int i) {
        int itemCount;
        View childAt;
        RecyclerView.LayoutManager layoutManagerM = m();
        if (layoutManagerM == null || (itemCount = layoutManagerM.getItemCount()) <= 0 || i < 0 || i >= itemCount) {
            return 0;
        }
        View viewFindViewByPosition = layoutManagerM.findViewByPosition(i);
        OrientationHelper orientationHelperN = n(layoutManagerM);
        if (viewFindViewByPosition != null) {
            return orientationHelperN.getDecoratedMeasurement(viewFindViewByPosition);
        }
        if (layoutManagerM.getChildCount() <= 0 || (childAt = layoutManagerM.getChildAt(0)) == null) {
            return 0;
        }
        return orientationHelperN.getDecoratedMeasurement(childAt);
    }

    public float j(int i, int i2) {
        float fAbs;
        int position;
        ji2 ji2Var = this;
        if (!r()) {
            return 0.0f;
        }
        RecyclerView.LayoutManager layoutManagerM = m();
        OrientationHelper orientationHelperN = ji2Var.n(layoutManagerM);
        float startAfterPadding = orientationHelperN.getStartAfterPadding() + (orientationHelperN.getTotalSpace() / 2.0f);
        int i3 = 0;
        boolean z = true;
        if (!ji2Var.o(ji2Var.b) ? i <= 0 : i >= 0) {
            z = false;
        }
        int childCount = layoutManagerM.getChildCount();
        int itemCount = layoutManagerM.getItemCount();
        View viewC = c();
        int position2 = viewC != null ? layoutManagerM.getPosition(viewC) : -1;
        if (viewC == null || position2 == -1) {
            fAbs = 0.0f;
            position = 0;
        } else {
            position = z ? position2 + 1 : position2 - 1;
            if (position < 0 || position >= itemCount) {
                float fL = ji2Var.l(viewC) - startAfterPadding;
                return (((float) i) * fL <= 0.0f || Math.abs(fL) <= ((float) Math.abs(i2))) ? i2 : fL;
            }
            fAbs = Math.abs(ji2Var.f(viewC, position, z) - startAfterPadding);
        }
        if (fAbs == 0.0f) {
            float f2 = Float.MAX_VALUE;
            while (i3 < childCount) {
                View childAt = layoutManagerM.getChildAt(i3);
                if (childAt != null) {
                    float fL2 = ji2Var.l(childAt) - startAfterPadding;
                    if (i * fL2 > 0.0f && Math.abs(fL2) < Math.abs(f2)) {
                        float fAbs2 = Math.abs(fL2);
                        position = layoutManagerM.getPosition(childAt);
                        f2 = fL2;
                        fAbs = fAbs2;
                    }
                }
                i3++;
                ji2Var = this;
            }
        }
        float f3 = fAbs;
        if (f) {
            Log.d("COUIGradualStopHelper", "initialVelocity:" + i + " distance:" + i2 + " centerAdapterPosition:" + position2 + " startPos:" + position + " displacement:" + f3 + " itemCount:" + itemCount);
        }
        return p(position, z, f3, i2, itemCount);
    }

    public int k(int i) {
        if (m() == null) {
            return 0;
        }
        RecyclerView.Adapter adapter = this.a.getAdapter();
        int itemCenterOffset = adapter instanceof COUIGradualStopAdapter ? ((COUIGradualStopAdapter) adapter).getItemCenterOffset(i) : 0;
        return itemCenterOffset != 0 ? itemCenterOffset : h(i);
    }

    public float l(View view) {
        RecyclerView.LayoutManager layoutManagerM = m();
        if (layoutManagerM == null || view == null) {
            return 0.0f;
        }
        OrientationHelper orientationHelperN = n(layoutManagerM);
        return orientationHelperN.getDecoratedStart(view) + ((orientationHelperN.getDecoratedMeasurement(view) + k(layoutManagerM.getPosition(view))) / 2.0f);
    }

    public final RecyclerView.LayoutManager m() {
        RecyclerView.LayoutManager layoutManager = this.f12915c;
        if (layoutManager == null || layoutManager != this.a.getLayoutManager()) {
            this.f12915c = this.a.getLayoutManager();
        }
        return this.f12915c;
    }

    public final OrientationHelper n(@NonNull RecyclerView.LayoutManager layoutManager) {
        int orientation = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() : -1;
        OrientationHelper orientationHelper = this.d;
        if (orientationHelper == null || this.f12916e != orientation || orientationHelper.getLayoutManager() != layoutManager) {
            this.f12916e = orientation;
            this.d = orientation == 1 ? OrientationHelper.createVerticalHelper(layoutManager) : OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.d;
    }

    public final boolean o(Context context) {
        COUIRecyclerView cOUIRecyclerView = this.a;
        if (cOUIRecyclerView != null) {
            return ViewCompat.getLayoutDirection(cOUIRecyclerView) == 1;
        }
        return context != null && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final float p(int i, boolean z, float f2, int i2, int i3) {
        int iAbs = Math.abs(i2);
        int i4 = 1;
        int i5 = z ? 1 : -1;
        if (o(this.b)) {
            i5 = z ? -1 : 1;
        }
        float fG = f2;
        int i6 = 0;
        int i7 = i;
        while (fG < iAbs && i7 >= 0 && i7 < i3) {
            int iK = k(i7);
            float fG2 = fG + ((g(i7) - (i5 * iK)) / 2.0f);
            boolean z2 = f;
            if (z2) {
                Log.d("COUIGradualStopHelper", "displacement:" + fG2 + " nextPos:" + i7 + " offset:" + iK);
            }
            i7 = z ? i7 + 1 : i7 - 1;
            i6 += i4;
            if (i7 < 0 || i7 >= i3 || i6 > 1000) {
                return i2;
            }
            int iG = g(i7);
            if (iG == -1 || iG < 0) {
                return i2;
            }
            int iK2 = k(i7);
            fG = fG2 + ((g(i7) + (i5 * iK2)) / 2.0f);
            if (z2) {
                Log.d("COUIGradualStopHelper", "displacement:" + fG + " nextPos:" + i7 + " offset:" + iK2 + " nextItemWidth:" + iG);
            }
            i4 = 1;
        }
        return i5 * fG;
    }

    public void q() {
        OrientationHelper orientationHelperN;
        View viewB;
        RecyclerView.LayoutManager layoutManagerM = m();
        if (layoutManagerM == null || (viewB = b(layoutManagerM, (orientationHelperN = n(layoutManagerM)))) == null) {
            return;
        }
        int startAfterPadding = orientationHelperN.getStartAfterPadding() + (orientationHelperN.getTotalSpace() / 2);
        int itemCount = layoutManagerM.getItemCount() - 1;
        if (layoutManagerM.getPosition(viewB) == 0) {
            startAfterPadding = o(this.b) ? orientationHelperN.getEndAfterPadding() - (orientationHelperN.getDecoratedMeasurement(viewB) / 2) : orientationHelperN.getStartAfterPadding() + (orientationHelperN.getDecoratedMeasurement(viewB) / 2);
        }
        if (layoutManagerM.getPosition(viewB) == itemCount) {
            startAfterPadding = o(this.b) ? orientationHelperN.getStartAfterPadding() + (orientationHelperN.getDecoratedMeasurement(viewB) / 2) : orientationHelperN.getEndAfterPadding() - (orientationHelperN.getDecoratedMeasurement(viewB) / 2);
        }
        int decoratedStart = (orientationHelperN.getDecoratedStart(viewB) + (orientationHelperN.getDecoratedMeasurement(viewB) / 2)) - startAfterPadding;
        if (Math.abs(decoratedStart) > 1.0f) {
            if ((layoutManagerM instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManagerM).getOrientation() == 1) {
                this.a.smoothScrollBy(0, decoratedStart);
            } else {
                this.a.smoothScrollBy(decoratedStart, 0);
            }
        }
    }

    public boolean r() {
        RecyclerView.LayoutManager layoutManagerM = m();
        if (layoutManagerM == null) {
            return false;
        }
        return (layoutManagerM.getChildCount() == 0 || layoutManagerM.getItemCount() == 0) ? false : true;
    }
}
