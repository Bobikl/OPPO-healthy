package com.coui.appcompat.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.support.appcompat.R$styleable;
import com.support.button.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class COUIButtonLayout extends LinearLayout {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1611j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1612l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1613n;
    public int o;
    public int p;

    public COUIButtonLayout(Context context) {
        super(context);
        this.k = false;
        this.f1612l = false;
    }

    private void setPaddingHorizontal(int i) {
        if (i == 0) {
            i = getOrientation() == 0 ? this.m : this.f1613n;
        }
        setPaddingRelative(i, getPaddingTop(), i, getPaddingBottom());
    }

    public final void a() {
        this.o = getOrientation();
        this.m = getResources().getDimensionPixelSize(R$dimen.coui_horizontal_btn_margin);
        this.f1613n = getResources().getDimensionPixelSize(R$dimen.coui_horizontal_single_btn_margin);
    }

    public int getMaxHeight() {
        return this.f1611j;
    }

    public int getMaxWidth() {
        return this.i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.p;
        if (i3 <= 0 || !(mode == Integer.MIN_VALUE || mode == 1073741824)) {
            this.i = View.MeasureSpec.getSize(i);
        } else {
            int iMin = Math.min(i3, View.MeasureSpec.getSize(i));
            this.i = iMin;
            i = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        }
        this.f1611j = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
    }

    public void setHorizontalLayoutPadding(int i) {
        this.m = i;
        if (getOrientation() == 0) {
            setPaddingHorizontal(this.m);
        }
    }

    public void setLimitHeight(boolean z) {
        this.k = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        super.setOrientation(i);
        if (this.o != i) {
            setPaddingHorizontal(0);
            this.o = i;
        }
    }

    public void setVerticalLayoutPadding(int i) {
        this.f1613n = i;
        if (getOrientation() == 1) {
            setPaddingHorizontal(this.f1613n);
        }
    }

    public COUIButtonLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = false;
        this.f1612l = false;
        a();
        if (getContext() != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.COUIButtonLayout);
            this.m = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIButtonLayout_horizontalLayoutPadding, this.m);
            this.f1613n = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIButtonLayout_verticalLayoutPadding, this.f1613n);
            this.p = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIButtonLayout_couiLimitMaxWidth, this.p);
            typedArrayObtainStyledAttributes.recycle();
        }
        setPaddingHorizontal(0);
    }
}
