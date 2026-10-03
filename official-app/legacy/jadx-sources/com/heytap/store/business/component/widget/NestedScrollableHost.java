package com.heytap.store.business.component.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/business/component/widget/NestedScrollableHost;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "child", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "initialX", "", "initialY", "parentViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getParentViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "touchSlop", "", "canChildScroll", "", "orientation", "delta", "handleInterceptTouchEvent", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NestedScrollableHost extends FrameLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private float initialX;
    private float initialY;
    private int touchSlop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this._$_findViewCache = new LinkedHashMap();
    }

    private final boolean canChildScroll(int orientation, float delta) {
        int i = -((int) Math.signum(delta));
        if (orientation == 0) {
            View child = getChild();
            if (child == null) {
                return false;
            }
            return child.canScrollHorizontally(i);
        }
        if (orientation != 1) {
            throw new IllegalArgumentException();
        }
        View child2 = getChild();
        if (child2 == null) {
            return false;
        }
        return child2.canScrollVertically(i);
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x000d, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ViewPager2 getParentViewPager() {
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            while (view != null && !(view instanceof ViewPager2)) {
                Object parent2 = view.getParent();
                view = parent2 instanceof View ? (View) parent2 : null;
            }
            if (view instanceof ViewPager2) {
                return (ViewPager2) view;
            }
            return null;
        }
    }

    private final void handleInterceptTouchEvent(MotionEvent e2) {
        ViewPager2 parentViewPager = getParentViewPager();
        Integer numValueOf = parentViewPager == null ? null : Integer.valueOf(parentViewPager.getOrientation());
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        if (canChildScroll(iIntValue, -1.0f) || canChildScroll(iIntValue, 1.0f)) {
            if (e2.getAction() == 0) {
                this.initialX = e2.getX();
                this.initialY = e2.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            if (e2.getAction() == 2) {
                float x = e2.getX() - this.initialX;
                float y = e2.getY() - this.initialY;
                boolean z = iIntValue == 0;
                float fAbs = Math.abs(x) * (z ? 0.5f : 1.0f);
                float fAbs2 = Math.abs(y) * (z ? 1.0f : 0.5f);
                int i = this.touchSlop;
                if (fAbs > i || fAbs2 > i) {
                    if (z == (fAbs2 > fAbs)) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return;
                    }
                    if (!z) {
                        x = y;
                    }
                    if (canChildScroll(iIntValue, x)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        handleInterceptTouchEvent(e2);
        return super.onInterceptTouchEvent(e2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this._$_findViewCache = new LinkedHashMap();
    }
}
