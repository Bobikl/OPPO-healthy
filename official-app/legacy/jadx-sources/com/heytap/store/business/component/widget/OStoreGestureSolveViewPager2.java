package com.heytap.store.business.component.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012J\"\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/heytap/store/business/component/widget/OStoreGestureSolveViewPager2;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "disallowParentInterceptDownEvent", "", "isNeedParentIntercept", "mIsInterCept", "mStartX", "", "mStartY", "mTouchSlop", "mViewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "bindViewPager", "", "viewPager2", "measureChild", "child", "Landroid/view/View;", "parentWidthMeasureSpec", "parentHeightMeasureSpec", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "setIsInterCept", "isInterCept", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreGestureSolveViewPager2 extends FrameLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private final boolean disallowParentInterceptDownEvent;
    private boolean isNeedParentIntercept;
    private boolean mIsInterCept;
    private float mStartX;
    private float mStartY;
    private int mTouchSlop;

    @Nullable
    private ViewPager2 mViewPager2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreGestureSolveViewPager2(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setIsInterCept$default(OStoreGestureSolveViewPager2 oStoreGestureSolveViewPager2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        oStoreGestureSolveViewPager2.setIsInterCept(z);
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

    public final void bindViewPager(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager2");
        this.mViewPager2 = viewPager2;
    }

    @Override // android.view.ViewGroup
    public void measureChild(@Nullable View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        super.measureChild(child, parentWidthMeasureSpec, parentHeightMeasureSpec);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.mViewPager2 == null || !this.mIsInterCept) {
            return super.onInterceptTouchEvent(event);
        }
        int action = event.getAction();
        boolean z = true;
        if (action == 0) {
            this.mStartX = event.getX();
            this.mStartY = event.getY();
            getParent().requestDisallowInterceptTouchEvent(true ^ this.disallowParentInterceptDownEvent);
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            float x = event.getX();
            float y = event.getY();
            float fAbs = Math.abs(x - this.mStartX);
            float fAbs2 = Math.abs(y - this.mStartY);
            ViewPager2 viewPager2 = this.mViewPager2;
            if (viewPager2 != null) {
                z = viewPager2.getOrientation() == 0 ? false : false;
                this.isNeedParentIntercept = z;
            }
            getParent().requestDisallowInterceptTouchEvent(this.isNeedParentIntercept);
        } else if (action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(event);
    }

    public final void setIsInterCept(boolean isInterCept) {
        this.mIsInterCept = isInterCept;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreGestureSolveViewPager2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OStoreGestureSolveViewPager2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreGestureSolveViewPager2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.mIsInterCept = true;
        this._$_findViewCache = new LinkedHashMap();
    }
}
