package com.coui.appcompat.scroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.coui.appcompat.viewpager.COUIViewPager2;
import com.oplus.aiunit.vision.ag2;
import com.oplus.aiunit.vision.an2;
import com.oplus.aiunit.vision.ij2;
import com.oplus.aiunit.vision.kk2;
import com.oplus.aiunit.vision.tk2;
import com.oplus.aiunit.vision.vk2;
import com.oplus.aiunit.vision.zm2;
import com.support.nearx.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUINestedScrollableHost extends FrameLayout {
    public static final int CUSTOM = Integer.MAX_VALUE;
    public static final int CVP_SCROLL_VIEW = 5;
    public static final int NESTED_SCROLL_VIEW = 4;
    public static final int RECYCLER_VIEW = 2;
    public static final int SCROLL_VIEW = 3;
    public static final int VIEW_PAGER = 0;
    public static final int VIEW_PAGER2 = 1;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f2004j;
    public final PointF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public vk2<?> f2005l;
    public vk2<?> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2006n;
    public int o;
    public vk2<?> p;
    public vk2<?> q;

    public COUINestedScrollableHost(@NonNull Context context) {
        this(context, null);
    }

    public vk2<?> a(int i) {
        if (i == 0) {
            return new an2((ViewPager) d(ViewPager.class));
        }
        if (i == 1) {
            return new zm2((ViewPager2) d(ViewPager2.class));
        }
        if (i == 2) {
            return new kk2((RecyclerView) d(RecyclerView.class));
        }
        if (i == 3) {
            return new tk2((ScrollView) d(ScrollView.class));
        }
        if (i == 4) {
            return new ij2((NestedScrollView) d(NestedScrollView.class));
        }
        if (i == 5) {
            return new ag2((COUIViewPager2) d(COUIViewPager2.class));
        }
        if (i != Integer.MAX_VALUE) {
            return null;
        }
        return this.q;
    }

    public vk2<?> b(int i) {
        if (i == 0) {
            return new an2((ViewPager) e(ViewPager.class));
        }
        if (i == 1) {
            return new zm2((ViewPager2) e(ViewPager2.class));
        }
        if (i == 2) {
            return new kk2((RecyclerView) e(RecyclerView.class));
        }
        if (i == 3) {
            return new tk2((ScrollView) e(ScrollView.class));
        }
        if (i == 4) {
            return new ij2((NestedScrollView) e(NestedScrollView.class));
        }
        if (i == 5) {
            return new ag2((COUIViewPager2) e(COUIViewPager2.class));
        }
        if (i != Integer.MAX_VALUE) {
            return null;
        }
        return this.p;
    }

    public void c() {
        this.f2005l = b(this.f2006n);
        this.m = a(this.o);
    }

    @Nullable
    public final View d(Class<?> cls) {
        for (int i = 0; i < getChildCount(); i++) {
            if (cls.isInstance(getChildAt(i))) {
                return getChildAt(i);
            }
        }
        return null;
    }

    public final View e(Class<?> cls) {
        View view = (View) getParent();
        if (view == null) {
            throw new IllegalStateException("The NearNestedScrollable must have parent class");
        }
        while (!cls.isInstance(view) && view != null) {
            view = (View) view.getParent();
        }
        return view;
    }

    public void f(MotionEvent motionEvent) {
        vk2<?> vk2Var = this.f2005l;
        if (vk2Var == null || this.m == null) {
            return;
        }
        int orientation = vk2Var.getOrientation();
        if (this.m.a(orientation, -1) || this.m.a(orientation, 1)) {
            if (motionEvent.getAction() == 0) {
                this.f2004j.x = motionEvent.getX();
                this.f2004j.y = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            if (motionEvent.getAction() == 2) {
                this.k.x = motionEvent.getX();
                this.k.y = motionEvent.getY();
                PointF pointF = this.k;
                float f = pointF.x;
                PointF pointF2 = this.f2004j;
                float f2 = f - pointF2.x;
                float f3 = pointF.y - pointF2.y;
                boolean z = orientation == 0;
                float fAbs = Math.abs(f2) * (z ? 0.5f : 1.0f);
                float fAbs2 = Math.abs(f3) * (z ? 1.0f : 0.5f);
                int i = this.i;
                if (fAbs > i || fAbs2 > i) {
                    if (z != (fAbs > fAbs2)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                    if (this.m.a(orientation, z ? (int) f2 : (int) f3)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }

    public vk2<?> getChildCustom() {
        return this.q;
    }

    public vk2<?> getParentCustom() {
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setChildCustom(vk2<?> vk2Var) {
        this.q = vk2Var;
    }

    public void setParentCustom(vk2<?> vk2Var) {
        this.p = vk2Var;
    }

    public COUINestedScrollableHost(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUINestedScrollableHost(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f2004j = new PointF();
        this.k = new PointF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUINestedScrollableHost);
        this.f2006n = typedArrayObtainStyledAttributes.getInt(R$styleable.COUINestedScrollableHost_couiParent, 0);
        this.o = typedArrayObtainStyledAttributes.getInt(R$styleable.COUINestedScrollableHost_couiChild, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
