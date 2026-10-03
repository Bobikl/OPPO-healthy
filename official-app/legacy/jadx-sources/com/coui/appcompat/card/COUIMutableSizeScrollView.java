package com.coui.appcompat.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.coui.appcompat.scrollview.COUIScrollView;
import com.support.scrollview.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIMutableSizeScrollView extends COUIScrollView {
    public int f0;
    public final int g0;
    public final PointF h0;
    public final PointF i0;

    public COUIMutableSizeScrollView(Context context) {
        this(context, null);
    }

    public boolean C(int i, int i2) {
        if (i == 0) {
            return false;
        }
        return canScrollVertically((int) (-Math.signum(i2)));
    }

    public int getMaxHeight() {
        return this.f0;
    }

    @Override // com.coui.appcompat.scrollview.COUIScrollView, android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h0.x = motionEvent.getX();
            this.h0.y = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.coui.appcompat.scrollview.COUIScrollView, android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() != 1) {
            return;
        }
        int measuredHeight = getChildAt(0).getMeasuredHeight();
        int i3 = this.f0;
        if (i3 < 0 || measuredHeight <= i3) {
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.f0);
    }

    @Override // com.coui.appcompat.scrollview.COUIScrollView, android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 2) {
            this.i0.x = motionEvent.getX();
            this.i0.y = motionEvent.getY();
            PointF pointF = this.i0;
            float f = pointF.x;
            PointF pointF2 = this.h0;
            float f2 = f - pointF2.x;
            float f3 = pointF.y - pointF2.y;
            float fAbs = Math.abs(f2) * 0.5f;
            float fAbs2 = Math.abs(f3);
            int i = this.g0;
            if (fAbs > i || fAbs2 > i) {
                if (fAbs > fAbs2) {
                    if (C(0, (int) f2)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                } else if (C(1, (int) f3)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMaxHeight(int i) {
        this.f0 = i;
        requestLayout();
    }

    public COUIMutableSizeScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIMutableSizeScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.h0 = new PointF();
        this.i0 = new PointF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIMaxHeightScrollView);
        this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIMaxHeightScrollView_scrollViewMaxHeight, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
