package com.coui.appcompat.dialog.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.coui.appcompat.scrollview.COUINestedScrollView;
import com.support.scrollview.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIMaxHeightNestedScrollView extends COUINestedScrollView {
    public int d0;
    public int e0;
    public b f0;
    public boolean g0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUIMaxHeightNestedScrollView.this.requestLayout();
        }
    }

    public interface b {
        void onChange();
    }

    public COUIMaxHeightNestedScrollView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b bVar = this.f0;
        if (bVar != null) {
            bVar.onChange();
        }
    }

    @Override // com.coui.appcompat.scrollview.COUINestedScrollView, androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.g0 || canScrollVertically(-1) || canScrollVertically(1)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = this.e0;
        if (i3 > 0) {
            measuredHeight = Math.max(measuredHeight, i3);
        }
        int i4 = this.d0;
        if (i4 > 0) {
            measuredHeight = Math.min(i4, measuredHeight);
        }
        if (measuredHeight != getMeasuredHeight()) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(this.d0, measuredHeight), 1073741824));
        }
    }

    public void setConfigChangeListener(b bVar) {
        this.f0 = bVar;
    }

    public void setInterceptWhenCannotScroll(boolean z) {
        this.g0 = z;
    }

    public void setMaxHeight(int i) {
        this.d0 = i;
        if (isInLayout()) {
            post(new a());
        } else {
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        this.e0 = i;
        requestLayout();
    }

    public COUIMaxHeightNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIMaxHeightNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g0 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIMaxHeightScrollView);
        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIMaxHeightScrollView_scrollViewMaxHeight, 0);
        this.e0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIMaxHeightScrollView_scrollViewMinHeight, 0);
        this.g0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIMaxHeightScrollView_scrollViewInterceptWhenCannotScroll, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
