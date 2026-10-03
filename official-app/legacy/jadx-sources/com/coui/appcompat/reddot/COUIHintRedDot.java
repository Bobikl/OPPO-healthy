package com.coui.appcompat.reddot;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.oi2;
import com.oplus.aiunit.vision.pi2;
import com.support.reddot.R$attr;
import com.support.reddot.R$drawable;
import com.support.reddot.R$plurals;
import com.support.reddot.R$string;
import com.support.reddot.R$style;
import com.support.reddot.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIHintRedDot extends View {
    public static final int CONSTANT_VALUE_3 = 3;
    public static final int CONSTANT_VALUE_4 = 4;
    public static final int MAX_ALPHA_VALUE = 255;
    public static final int MIN_ALPHA_VALUE = 0;
    public static final int NO_POINT_MODE = 0;
    public static final long NUM_CHANGE_ALPHA_ANIM_DURATION = 150;
    public static final long NUM_CHANGE_WIDTH_ANIM_DURATION = 517;
    public static final Interpolator NUM_CHANGE_WIDTH_ANIM_INTERPOLATOR = new hj2();
    public static final int POINT_NAVI_WITH_NUM = 3;
    public static final int POINT_NUM_MODE_STROKE = 5;
    public static final int POINT_ONLY_MODE = 1;
    public static final int POINT_ONLY_MODE_STROKE = 4;
    public static final int POINT_WITH_NUM_MODE = 2;
    public static final long RED_POINT_ANIM_DURATION = 520;
    public static final int TYPE_BIG_RECT_RADIUS = 2;
    public static final int TYPE_SMALL_RECT_RADIUS = 1;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1980j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1981l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1982n;
    public oi2 o;
    public RectF p;
    public String q;
    public int r;
    public int s;
    public boolean t;
    public ValueAnimator u;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public Drawable y;

    public COUIHintRedDot(Context context) {
        this(context, null);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.u.end();
        }
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            return;
        }
        this.x.end();
    }

    public pi2 b() {
        pi2 pi2Var = new pi2();
        pi2Var.b(getPointMode());
        pi2Var.c(getPointNumber());
        pi2Var.d(getPointText());
        return pi2Var;
    }

    public void c() {
        this.i = true;
    }

    public boolean getIsLaidOut() {
        return this.i;
    }

    public int getPointMode() {
        return this.f1980j;
    }

    public int getPointNumber() {
        return this.k;
    }

    public String getPointText() {
        return this.f1981l;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        a();
        super.onDetachedFromWindow();
        this.i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        RectF rectF = this.p;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.p.bottom = getHeight();
        if (this.t && ((i = this.k) < 1000 || this.f1982n < 1000)) {
            oi2 oi2Var = this.o;
            int i2 = this.s;
            oi2Var.d(canvas, i, i2, this.f1982n, 255 - i2, this.p);
        } else {
            int i3 = this.k;
            if (i3 == 0 || i3 < 1000) {
                this.o.g(canvas, this.f1980j, this.f1981l, this.p);
            } else {
                this.o.g(canvas, this.f1980j, this.m, this.p);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.i = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.w ? this.v : this.o.p(this.f1980j, this.f1981l), this.o.n(this.f1980j));
    }

    public void setBgColor(int i) {
        this.o.r(i);
    }

    public void setCornerRadius(int i) {
        this.o.s(i);
    }

    public void setDotDiameter(int i) {
        this.o.t(i);
    }

    public void setEllipsisDiameter(int i) {
        this.o.u(i);
    }

    public void setLargeWidth(int i) {
        this.o.v(i);
    }

    public void setMediumWidth(int i) {
        this.o.w(i);
    }

    public void setPointMode(int i) {
        if (this.f1980j != i) {
            this.f1980j = i;
            if (i == 4) {
                setBackground(this.y);
            }
            requestLayout();
            int i2 = this.f1980j;
            if (i2 == 1 || i2 == 4) {
                setContentDescription(this.q);
            } else if (i2 == 0) {
                setContentDescription("");
            }
        }
    }

    public void setPointNumber(int i) {
        this.k = i;
        if (i != 0) {
            setPointText(String.valueOf(i));
        } else {
            setPointText("");
        }
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(",");
            Resources resources = getResources();
            int i2 = this.r;
            int i3 = this.k;
            sb.append(resources.getQuantityString(i2, i3, Integer.valueOf(i3)));
            setContentDescription(sb.toString());
        }
    }

    public void setPointText(String str) {
        this.f1981l = str;
        requestLayout();
    }

    public void setSmallWidth(int i) {
        this.o.x(i);
    }

    public void setTextColor(int i) {
        this.o.y(i);
    }

    public void setTextSize(int i) {
        this.o.z(i);
    }

    public void setViewHeight(int i) {
        this.o.A(i);
    }

    public COUIHintRedDot(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiHintRedDotStyle);
    }

    public COUIHintRedDot(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_COUI_COUIHintRedDot);
    }

    public COUIHintRedDot(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1980j = 0;
        this.k = 0;
        this.f1981l = "";
        this.f1982n = 0;
        this.s = 255;
        int[] iArr = R$styleable.COUIHintRedDot;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f1980j = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIHintRedDot_couiHintRedPointMode, 0);
        setPointNumber(typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIHintRedDot_couiHintRedPointNum, 0));
        this.f1981l = typedArrayObtainStyledAttributes.getString(R$styleable.COUIHintRedDot_couiHintRedPointText);
        typedArrayObtainStyledAttributes.recycle();
        this.o = new oi2(context, attributeSet, iArr, i, i2);
        this.p = new RectF();
        this.q = getResources().getString(R$string.red_dot_description);
        this.r = R$plurals.red_dot_with_number_description;
        Drawable drawable = context.getResources().getDrawable(R$drawable.red_dot_stroke_circle);
        this.y = drawable;
        if (this.f1980j == 4) {
            setBackground(drawable);
        }
        this.m = context.getString(R$string.red_dot_more);
    }
}
