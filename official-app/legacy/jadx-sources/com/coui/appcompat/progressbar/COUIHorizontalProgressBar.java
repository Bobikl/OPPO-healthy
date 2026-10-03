package com.coui.appcompat.progressbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.support.progressbar.R$attr;
import com.support.progressbar.R$style;
import com.support.progressbar.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIHorizontalProgressBar extends ProgressBar {
    public static final int t = Color.argb(12, 0, 0, 0);
    public static final int u = Color.parseColor("#FF2AD181");
    public static final int[] v = {R$attr.couiSeekBarProgressColorDisabled};
    public Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f1962j;
    public ColorStateList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RectF f1963l;
    public RectF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1964n;
    public Path o;
    public Path p;
    public boolean q;
    public int r;
    public Context s;

    public COUIHorizontalProgressBar(Context context) {
        this(context, null);
    }

    public final int a(ColorStateList colorStateList, int i) {
        return colorStateList == null ? i : colorStateList.getColorForState(getDrawableState(), i);
    }

    public boolean b() {
        return getLayoutDirection() == 1;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        this.p.reset();
        this.o.reset();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.i.setColor(a(this.f1962j, t));
        this.f1963l.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        Path path = this.o;
        RectF rectF = this.f1963l;
        int i = this.f1964n;
        path.addRoundRect(rectF, i, i, Path.Direction.CCW);
        canvas.clipPath(this.o);
        RectF rectF2 = this.f1963l;
        int i2 = this.f1964n;
        canvas.drawRoundRect(rectF2, i2, i2, this.i);
        float progress = getProgress() / getMax();
        if (b()) {
            int iRound = Math.round((getWidth() - getPaddingRight()) - (progress * width));
            this.m.set(iRound, getPaddingTop(), iRound + width, getHeight() - getPaddingBottom());
        } else {
            int iRound2 = Math.round(getPaddingLeft() - ((1.0f - progress) * width));
            this.m.set(iRound2, getPaddingTop(), iRound2 + width, getHeight() - getPaddingBottom());
        }
        this.i.setColor(a(this.k, u));
        this.p.addRoundRect(this.m, this.f1964n, 0.0f, Path.Direction.CCW);
        this.p.op(this.o, Path.Op.INTERSECT);
        canvas.drawPath(this.p, this.i);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingRight = (i - getPaddingRight()) - getPaddingLeft();
        int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
        if (this.q) {
            this.f1964n = paddingRight >= paddingTop ? paddingTop / 2 : paddingRight / 2;
        } else {
            this.f1964n = 0;
        }
    }

    public void setBackgroundColor(ColorStateList colorStateList) {
        this.f1962j = colorStateList;
    }

    public void setProgressColor(ColorStateList colorStateList) {
        this.k = colorStateList;
    }

    public COUIHorizontalProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiHorizontalProgressBarStyle);
    }

    public COUIHorizontalProgressBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.COUIProgressHorizontal);
    }

    public COUIHorizontalProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new Paint();
        this.f1963l = new RectF();
        this.m = new RectF();
        this.f1964n = Integer.MAX_VALUE;
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.r = attributeSet.getStyleAttribute();
        } else {
            this.r = i;
        }
        this.s = context;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(v);
        typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.COUIHorizontalProgressBar, i, i2);
        this.f1962j = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.COUIHorizontalProgressBar_couiHorizontalProgressBarBackgroundColor);
        this.k = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.COUIHorizontalProgressBar_couiHorizontalProgressBarProgressColor);
        this.q = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.COUIHorizontalProgressBar_couiHorizontalProgressNeedRadius, true);
        typedArrayObtainStyledAttributes2.recycle();
        this.i.setDither(true);
        this.i.setAntiAlias(true);
        setLayerType(1, this.i);
        this.o = new Path();
        this.p = new Path();
    }
}
