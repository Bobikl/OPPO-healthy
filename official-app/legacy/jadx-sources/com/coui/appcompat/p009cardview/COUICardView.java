package com.coui.appcompat.p009cardview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.b23;
import com.oplus.aiunit.vision.w13;
import com.oplus.aiunit.vision.z13;
import com.support.cardview.R$color;
import com.support.cardview.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUICardView extends FrameLayout {
    public static final int[] p = {R.attr.colorBackground};
    public static final b23 q;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1650j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1651l;
    public final Rect m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f1652n;
    public final z13 o;

    public class a implements z13 {
        public Drawable a;

        public a() {
        }

        @Override // com.oplus.aiunit.vision.z13
        public Drawable getCardBackground() {
            return this.a;
        }

        @Override // com.oplus.aiunit.vision.z13
        public View getCardView() {
            return COUICardView.this;
        }

        @Override // com.oplus.aiunit.vision.z13
        public boolean getPreventCornerOverlap() {
            return COUICardView.this.getPreventCornerOverlap();
        }

        @Override // com.oplus.aiunit.vision.z13
        public boolean getUseCompatPadding() {
            return COUICardView.this.getUseCompatPadding();
        }

        @Override // com.oplus.aiunit.vision.z13
        public void setCardBackground(Drawable drawable) {
            this.a = drawable;
            COUICardView.this.setBackgroundDrawable(drawable);
        }

        @Override // com.oplus.aiunit.vision.z13
        public void setShadowPadding(int i, int i2, int i3, int i4) {
            COUICardView.this.f1652n.set(i, i2, i3, i4);
            COUICardView cOUICardView = COUICardView.this;
            Rect rect = cOUICardView.m;
            COUICardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    static {
        w13 w13Var = new w13();
        q = w13Var;
        w13Var.initStatic();
    }

    public COUICardView(Context context) {
        super(context);
        this.m = new Rect();
        this.f1652n = new Rect();
        this.o = new a();
        b(context, null, 0);
    }

    public final void b(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICardView, i, 0);
        int i2 = R$styleable.COUICardView_cardBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(p);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(R$color.cardview_light_background) : getResources().getColor(R$color.cardview_dark_background));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUICardView_cardCornerRadius, 0.0f);
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUICardView_couiCardCornerWeight, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUICardView_couiCardRoundCornerRadius, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUICardView_cardElevation, 0.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUICardView_cardMaxElevation, 0.0f);
        this.i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICardView_cardUseCompatPadding, false);
        this.f1650j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICardView_contentPadding, 0);
        this.m.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICardView_contentPaddingLeft, dimensionPixelSize);
        this.m.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICardView_contentPaddingTop, dimensionPixelSize);
        this.m.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICardView_contentPaddingRight, dimensionPixelSize);
        this.m.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICardView_contentPaddingBottom, dimensionPixelSize);
        float f2 = dimension3 > dimension4 ? dimension3 : dimension4;
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICardView_android_minWidth, 0);
        this.f1651l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        q.c(this.o, context, colorStateList, dimension, dimension3, f2, f, dimension2);
    }

    public ColorStateList getCardBackgroundColor() {
        return q.f(this.o);
    }

    public float getCardElevation() {
        return q.i(this.o);
    }

    public float getCardRoundCornerRadius() {
        return q.b(this.o);
    }

    public int getContentPaddingBottom() {
        return this.m.bottom;
    }

    public int getContentPaddingLeft() {
        return this.m.left;
    }

    public int getContentPaddingRight() {
        return this.m.right;
    }

    public int getContentPaddingTop() {
        return this.m.top;
    }

    public float getMaxCardElevation() {
        return q.g(this.o);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1650j;
    }

    public float getRadius() {
        return q.h(this.o);
    }

    public boolean getUseCompatPadding() {
        return this.i;
    }

    public float getWeight() {
        return q.o(this.o);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        b23 b23Var = q;
        if (b23Var instanceof w13) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(b23Var.k(this.o)), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(b23Var.j(this.o)), View.MeasureSpec.getSize(i2)), mode2);
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        q.l(this.o, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        q.e(this.o, f);
    }

    public void setCardRoundCornerRadius(float f) {
        q.p(this.o, f);
    }

    public void setMaxCardElevation(float f) {
        q.m(this.o, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f1651l = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.k = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1650j) {
            this.f1650j = z;
            q.a(this.o);
        }
    }

    public void setRadius(float f) {
        q.q(this.o, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.i != z) {
            this.i = z;
            q.n(this.o);
        }
    }

    public void setWeight(float f) {
        q.d(this.o, f);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        q.l(this.o, colorStateList);
    }

    public COUICardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new Rect();
        this.f1652n = new Rect();
        this.o = new a();
        b(context, attributeSet, 0);
    }

    public COUICardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new Rect();
        this.f1652n = new Rect();
        this.o = new a();
        b(context, attributeSet, i);
    }
}
