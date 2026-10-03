package com.heytap.nearx.uikit.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated
public class NestedScrollableHost extends FrameLayout {
    public ViewPager2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewPager2 f7553j;
    public RecyclerView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PointF f7554l;
    public final PointF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7555n;

    public NestedScrollableHost(@NonNull Context context) {
        this(context, null);
    }

    public final boolean a(int i, int i2) {
        int i3 = (int) (-Math.signum(i2));
        RecyclerView childRecyclerView = getChildRecyclerView();
        ViewPager2 childViewPager = getChildViewPager();
        if (i == 0) {
            return (childRecyclerView != null && childRecyclerView.canScrollHorizontally(i3)) || (childViewPager != null && childViewPager.canScrollHorizontally(i3));
        }
        return (childRecyclerView != null && childRecyclerView.canScrollVertically(i3)) || (childViewPager != null && childViewPager.canScrollVertically(i3));
    }

    public final void b(MotionEvent motionEvent) {
        if (getParentViewPager() != null) {
            if (getChildRecyclerView() == null && getChildViewPager() == null) {
                return;
            }
            int orientation = this.i.getOrientation();
            if (a(orientation, -1) || a(orientation, 1)) {
                if (motionEvent.getAction() == 0) {
                    this.f7554l.x = motionEvent.getX();
                    this.f7554l.y = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                if (motionEvent.getAction() == 2) {
                    this.m.x = motionEvent.getX();
                    this.m.y = motionEvent.getY();
                    PointF pointF = this.m;
                    float f = pointF.x;
                    PointF pointF2 = this.f7554l;
                    float f2 = f - pointF2.x;
                    float f3 = pointF.y - pointF2.y;
                    boolean z = orientation == 0;
                    float fAbs = Math.abs(f2) * (z ? 0.5f : 1.0f);
                    float fAbs2 = Math.abs(f3) * (z ? 1.0f : 0.5f);
                    int i = this.f7555n;
                    if (fAbs > i || fAbs2 > i) {
                        if (z != (fAbs > fAbs2)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            return;
                        }
                        if (a(orientation, z ? (int) f2 : (int) f3)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                }
            }
        }
    }

    @Nullable
    public RecyclerView getChildRecyclerView() {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof RecyclerView) {
                this.k = (RecyclerView) getChildAt(i);
                break;
            }
        }
        return this.k;
    }

    @Nullable
    public ViewPager2 getChildViewPager() {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof ViewPager2) {
                this.f7553j = (ViewPager2) getChildAt(i);
                break;
            }
        }
        return this.f7553j;
    }

    @Nullable
    public ViewPager2 getParentViewPager() {
        View view;
        Object parent = getParent();
        while (true) {
            view = (View) parent;
            if ((view instanceof ViewPager2) || view == null) {
                break;
            }
            parent = view.getParent();
        }
        ViewPager2 viewPager2 = (ViewPager2) view;
        this.i = viewPager2;
        return viewPager2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public NestedScrollableHost(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollableHost(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NestedScrollableHost(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7554l = new PointF();
        this.m = new PointF();
        this.f7555n = 0;
        this.f7555n = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
