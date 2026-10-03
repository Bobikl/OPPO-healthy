package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.scrollview.NearScrollView;

/* JADX INFO: loaded from: classes18.dex */
public class NearMaxHeightScrollView extends NearScrollView {
    private int maxHeight;
    private ScrollViewListener scrollViewListener;

    public interface ScrollViewListener {
        void onScrollChanged(NearMaxHeightScrollView nearMaxHeightScrollView, int i, int i2, int i3, int i4);
    }

    public NearMaxHeightScrollView(Context context) {
        this(context, null);
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    @Override // com.heytap.nearx.uikit.widget.scrollview.NearScrollView, android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.maxHeight;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, size), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ScrollViewListener scrollViewListener = this.scrollViewListener;
        if (scrollViewListener != null) {
            scrollViewListener.onScrollChanged(this, i, i2, i3, i4);
        }
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
        requestLayout();
    }

    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        this.scrollViewListener = scrollViewListener;
    }

    public NearMaxHeightScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearMaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scrollViewListener = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearMaxHeightScrollView);
        this.maxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearMaxHeightScrollView_nxScrollViewMaxHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
