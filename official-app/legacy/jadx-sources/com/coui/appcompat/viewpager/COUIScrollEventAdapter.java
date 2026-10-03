package com.coui.appcompat.viewpager;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.oplus.aiunit.vision.ye2;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUIScrollEventAdapter extends RecyclerView.OnScrollListener {
    public ViewPager2.OnPageChangeCallback a;

    @NonNull
    public final COUIViewPager2 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f2159c;

    @NonNull
    public final LinearLayoutManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2160e;
    public int f;
    public a g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2161j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2162l;
    public boolean m;

    public static final class a {
        public int a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2163c;

        public void a() {
            this.a = -1;
            this.b = 0.0f;
            this.f2163c = 0;
        }
    }

    public COUIScrollEventAdapter(@NonNull COUIViewPager2 cOUIViewPager2) {
        this.b = cOUIViewPager2;
        COUIViewPager2.RecyclerViewImpl recyclerViewImpl = cOUIViewPager2.m;
        this.f2159c = recyclerViewImpl;
        this.d = (LinearLayoutManager) recyclerViewImpl.getLayoutManager();
        this.g = new a();
        resetState();
    }

    public final void dispatchScrolled(int i, float f, int i2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrolled(i, f, i2);
        }
    }

    public final void dispatchSelected(int i) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i);
        }
    }

    public final void dispatchStateChanged(int i) {
        if ((this.f2160e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i);
        }
    }

    public final int getPosition() {
        return this.d.findFirstVisibleItemPosition();
    }

    public double getRelativeScrollPosition() {
        updateScrollEventValues();
        a aVar = this.g;
        return ((double) aVar.a) + ((double) aVar.b);
    }

    public int getScrollState() {
        return this.f;
    }

    public boolean isDragging() {
        return this.f == 1;
    }

    public boolean isFakeDragging() {
        return this.m;
    }

    public boolean isIdle() {
        return this.f == 0;
    }

    public final boolean isInAnyDraggingState() {
        int i = this.f2160e;
        return i == 1 || i == 4;
    }

    public void notifyBeginFakeDrag() {
        this.f2160e = 4;
        startDrag(true);
    }

    public void notifyDataSetChangeHappened() {
        this.f2162l = true;
    }

    public void notifyProgrammaticScroll(int i, boolean z) {
        this.f2160e = z ? 2 : 3;
        this.m = false;
        boolean z2 = this.i != i;
        this.i = i;
        dispatchStateChanged(2);
        if (z2) {
            dispatchSelected(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f2160e == 1 && this.f == 1) && i == 1) {
            startDrag(false);
            return;
        }
        if (isInAnyDraggingState() && i == 2) {
            if (this.k) {
                dispatchStateChanged(2);
                this.f2161j = true;
                return;
            }
            return;
        }
        if (isInAnyDraggingState() && i == 0) {
            updateScrollEventValues();
            if (this.k) {
                a aVar = this.g;
                if (aVar.f2163c == 0) {
                    int i2 = this.h;
                    int i3 = aVar.a;
                    if (i2 != i3) {
                        dispatchSelected(i3);
                    }
                } else {
                    z = false;
                }
            } else {
                int i4 = this.g.a;
                if (i4 != -1) {
                    dispatchScrolled(i4, 0.0f, 0);
                }
            }
            if (z) {
                dispatchStateChanged(0);
                resetState();
            }
        }
        if (this.f2160e == 2 && i == 0 && this.f2162l) {
            updateScrollEventValues();
            a aVar2 = this.g;
            if (aVar2.f2163c == 0) {
                int i5 = this.i;
                int i6 = aVar2.a;
                if (i5 != i6) {
                    if (i6 == -1) {
                        i6 = 0;
                    }
                    dispatchSelected(i6);
                }
                dispatchStateChanged(0);
                resetState();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int i3;
        this.k = true;
        updateScrollEventValues();
        if (this.f2161j) {
            this.f2161j = false;
            if (i2 > 0) {
                z = true;
            } else {
                if (i2 == 0) {
                    if ((i < 0) == this.b.m()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                a aVar = this.g;
                if (aVar.f2163c != 0) {
                    i3 = aVar.a + 1;
                } else {
                    i3 = this.g.a;
                }
            } else {
                i3 = this.g.a;
            }
            this.i = i3;
            if (this.h != i3) {
                dispatchSelected(i3);
            }
        } else if (this.f2160e == 0) {
            int i4 = this.g.a;
            if (i4 == -1) {
                i4 = 0;
            }
            dispatchSelected(i4);
        }
        a aVar2 = this.g;
        int i5 = aVar2.a;
        if (i5 == -1) {
            i5 = 0;
        }
        dispatchScrolled(i5, aVar2.b, aVar2.f2163c);
        a aVar3 = this.g;
        int i6 = aVar3.a;
        int i7 = this.i;
        if ((i6 == i7 || i7 == -1) && aVar3.f2163c == 0 && this.f != 1) {
            dispatchStateChanged(0);
            resetState();
        }
    }

    public final void resetState() {
        this.f2160e = 0;
        this.f = 0;
        this.g.a();
        this.h = -1;
        this.i = -1;
        this.f2161j = false;
        this.k = false;
        this.m = false;
        this.f2162l = false;
    }

    public void setOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.a = onPageChangeCallback;
    }

    public final void startDrag(boolean z) {
        this.m = z;
        this.f2160e = z ? 4 : 1;
        int i = this.i;
        if (i != -1) {
            this.h = i;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = getPosition();
        }
        dispatchStateChanged(1);
    }

    public final void updateScrollEventValues() {
        int top;
        a aVar = this.g;
        int iFindFirstVisibleItemPosition = this.d.findFirstVisibleItemPosition();
        aVar.a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            aVar.a();
            return;
        }
        View viewFindViewByPosition = this.d.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            aVar.a();
            return;
        }
        int leftDecorationWidth = this.d.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.d.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.d.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.d.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.d.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.f2159c.getPaddingLeft();
            if (this.b.m()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.f2159c.getPaddingTop();
        }
        int i = -top;
        aVar.f2163c = i;
        if (i >= 0) {
            aVar.b = height == 0 ? 0.0f : i / height;
        } else {
            if (!new ye2(this.d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f2163c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }
}
