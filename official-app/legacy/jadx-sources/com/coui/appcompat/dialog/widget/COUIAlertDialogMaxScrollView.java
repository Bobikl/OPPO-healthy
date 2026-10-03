package com.coui.appcompat.dialog.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.support.dialog.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIAlertDialogMaxScrollView extends ScrollView {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1703j;

    public interface a {
    }

    public COUIAlertDialogMaxScrollView(Context context) {
        super(context);
    }

    public int getMaxWidth() {
        return this.i;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = this.i;
        boolean z2 = true;
        if (i3 == 0 || measuredWidth <= i3) {
            z = false;
        } else {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            z = true;
        }
        int i4 = this.f1703j;
        if (measuredHeight > i4) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            z2 = z;
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setMaxHeight(int i) {
        this.f1703j = i;
    }

    public void setMaxWidth(int i) {
        this.i = i;
    }

    public void setOnSizeChangeListener(a aVar) {
    }

    public COUIAlertDialogMaxScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIAlertDialogMaxLinearLayout);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIAlertDialogMaxLinearLayout_maxWidth, 0);
        this.f1703j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIAlertDialogMaxLinearLayout_maxHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
