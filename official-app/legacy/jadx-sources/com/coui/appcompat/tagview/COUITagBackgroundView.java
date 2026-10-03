package com.coui.appcompat.tagview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.oplus.aiunit.vision.tm2;
import com.support.reddot.R$attr;
import com.support.reddot.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUITagBackgroundView extends LinearLayout {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2128j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2129l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f2130n;
    public float o;
    public int p;
    public ColorStateList q;
    public ShapeAppearanceModel r;
    public final Path s;
    public final RectF t;
    public MaterialShapeDrawable u;
    public Paint v;
    public boolean w;

    public COUITagBackgroundView(@NonNull Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.s);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void b() {
        this.r = new ShapeAppearanceModel.Builder().setTopRightCorner(0, this.k).setBottomRightCorner(0, this.m).setTopLeftCorner(0, this.f2128j).setBottomLeftCorner(0, this.f2129l).build();
        this.w = true;
    }

    public final void c() {
        MaterialShapeDrawable materialShapeDrawable = this.u;
        if (materialShapeDrawable == null) {
            this.u = new MaterialShapeDrawable(this.r);
        } else {
            materialShapeDrawable.setShapeAppearanceModel(this.r);
        }
        this.u.setShadowCompatibilityMode(2);
        this.u.initializeElevationOverlay(getContext());
        this.u.setFillColor(this.f2130n);
        this.u.setStroke(this.o, this.q);
    }

    public final void d() {
        setBackground(this.u);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.w) {
            this.t.set(getBackground().getBounds());
            ShapeAppearancePathProvider.getInstance().calculatePath(this.r, 1.0f, this.t, this.s);
            this.w = false;
        }
        a(canvas);
    }

    public int getCardBLCornerRadius() {
        return this.f2129l;
    }

    public int getCardBRCornerRadius() {
        return this.m;
    }

    public int getCardCornerRadius() {
        return this.i;
    }

    public int getCardTLCornerRadius() {
        return this.f2128j;
    }

    public int getCardTRCornerRadius() {
        return this.k;
    }

    public ColorStateList getColorStateList() {
        return this.f2130n;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.u;
    }

    public int getStrokeColor() {
        return this.p;
    }

    public ColorStateList getStrokeStateColor() {
        return this.q;
    }

    public float getStrokeWidth() {
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent != null) {
            ((ViewGroup) parent).setClipChildren(false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.w = true;
    }

    public void setCardBLCornerRadius(int i) {
        this.f2129l = i;
        b();
        c();
        d();
    }

    public void setCardBRCornerRadius(int i) {
        this.m = i;
        b();
        c();
        d();
    }

    public void setCardCornerRadius(int i) {
        this.i = i;
        this.f2129l = i;
        this.m = i;
        this.f2128j = i;
        this.k = i;
        b();
        c();
        d();
    }

    public void setCardTLCornerRadius(int i) {
        this.f2128j = i;
        b();
        c();
        d();
    }

    public void setCardTRCornerRadius(int i) {
        this.k = i;
        b();
        c();
        d();
    }

    public void setColorStateList(ColorStateList colorStateList) {
        this.f2130n = colorStateList;
        b();
        c();
        d();
    }

    public void setStrokeColor(int i) {
        this.p = i;
        setStrokeStateColor(ColorStateList.valueOf(i));
    }

    public void setStrokeStateColor(ColorStateList colorStateList) {
        this.q = colorStateList;
        b();
        c();
        d();
    }

    public void setStrokeWidth(float f) {
        this.o = f;
        b();
        c();
        d();
    }

    public COUITagBackgroundView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUITagBackgroundView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = 0.0f;
        this.p = 0;
        this.q = ColorStateList.valueOf(0);
        this.s = new Path();
        this.t = new RectF();
        this.w = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUITagBackgroundView);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITagBackgroundView_couiTagCornerRadius, 0);
        this.i = dimensionPixelSize;
        this.f2128j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITagBackgroundView_couiTagTLCornerRadius, dimensionPixelSize);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITagBackgroundView_couiTagTRCornerRadius, this.i);
        this.f2129l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITagBackgroundView_couiTagBLCornerRadius, this.i);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITagBackgroundView_couiTagBRCornerRadius, this.i);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUITagBackgroundView_couiTagBackgroundColor);
        this.f2130n = colorStateList;
        if (colorStateList == null) {
            this.f2130n = ColorStateList.valueOf(tm2.a(context, R$attr.couiColorBackgroundWithTag));
        }
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUITagBackgroundView_couiTagStrokeColor);
        this.q = colorStateList2;
        if (colorStateList2 == null) {
            this.q = ColorStateList.valueOf(0);
        }
        Paint paint = new Paint(1);
        this.v = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITagBackgroundView_couiTagStrokeWidth, 0);
        b();
        c();
        d();
        typedArrayObtainStyledAttributes.recycle();
    }
}
