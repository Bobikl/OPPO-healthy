package com.heytap.sporthealth.blib.weiget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;

/* JADX INFO: loaded from: classes2.dex */
public class NestedConstraintLayout extends ConstraintLayout implements NestedScrollingChild3 {
    public NestedScrollingChildHelper i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7751j;

    public NestedConstraintLayout(Context context) {
        super(context);
        this.i = new NestedScrollingChildHelper(this);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        return this.i.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @NonNull int[] iArr2) {
        this.i.dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setClickable(true);
        this.i.setNestedScrollingEnabled(true);
        TypedValue typedValue = new TypedValue();
        if (getContext() != null && (getContext() instanceof Activity)) {
            Drawable background = ((Activity) getContext()).getWindow().getDecorView().getBackground();
            if (background instanceof ColorDrawable) {
                setBackgroundColor(((ColorDrawable) background).getColor());
                return;
            }
        }
        if (getContext().getTheme().resolveAttribute(R.attr.windowBackground, typedValue, true)) {
            setBackgroundColor(typedValue.data);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7751j = (int) motionEvent.getY();
            startNestedScroll(2, 0);
        } else if (action == 1) {
            stopNestedScroll(0);
        } else if (action == 2) {
            int y = (int) (this.f7751j - motionEvent.getY());
            this.f7751j = (int) motionEvent.getY();
            dispatchNestedPreScroll(0, y, null, null, 0);
            dispatchNestedScroll(0, y, 0, 0, null, 0, null);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return this.i.startNestedScroll(i, i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        this.i.stopNestedScroll(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        return this.i.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return this.i.hasNestedScrollingParent(i);
    }

    public NestedConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new NestedScrollingChildHelper(this);
    }

    public NestedConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new NestedScrollingChildHelper(this);
    }
}
