package com.heytap.nearx.uikit.widget.dialogview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.heytap.nearx.uikit.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class NearAlertDialogMaxLinearLayout extends LinearLayout {
    private int mLandscapeMaxHeight;
    private int mMaxHeight;
    private int mMaxWidth;
    private OnSizeChangeListener mOnSizeChangeListener;

    public interface OnSizeChangeListener {
        void onSizeChange(int i, int i2, int i3, int i4);
    }

    public NearAlertDialogMaxLinearLayout(Context context) {
        super(context);
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = this.mMaxWidth;
        boolean z2 = true;
        if (i3 == 0 || measuredWidth <= i3) {
            z = false;
        } else {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            z = true;
        }
        int i4 = this.mMaxHeight;
        if (measuredHeight > i4) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            z2 = z;
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        OnSizeChangeListener onSizeChangeListener = this.mOnSizeChangeListener;
        if (onSizeChangeListener != null) {
            onSizeChangeListener.onSizeChange(i, i2, i3, i4);
        }
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
    }

    public void setOnSizeChangeListener(OnSizeChangeListener onSizeChangeListener) {
        this.mOnSizeChangeListener = onSizeChangeListener;
    }

    public NearAlertDialogMaxLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearAlertDialogMaxLinearLayout);
        this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearAlertDialogMaxLinearLayout_maxWidth, 0);
        this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearAlertDialogMaxLinearLayout_maxHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
