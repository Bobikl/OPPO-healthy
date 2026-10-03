package com.heytap.health.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.heytap.health.base.R$styleable;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes15.dex */
public class GradientProgressBar extends View {
    public static final int[] A = {Color.parseColor("#31E376"), Color.parseColor("#BAE745"), Color.parseColor("#FFC30E"), Color.parseColor("#FD8326"), Color.parseColor("#F55050")};
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3286j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3287l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f3288n;
    public String o;
    public String p;
    public float q;
    public float r;
    public float s;
    public int t;
    public boolean u;
    public Paint v;
    public Paint w;
    public Paint x;
    public Paint y;
    public Path z;

    public GradientProgressBar(Context context) {
        super(context);
        this.i = A;
        e(context, null);
    }

    public final void a(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        float width = (getWidth() / 2.0f) - (this.y.measureText(this.o) / 2.0f);
        float width2 = ((getWidth() - getPaddingRight()) - getPaddingLeft()) - this.y.measureText(this.p);
        float paddingTop = ((((getPaddingTop() + ejg.a(getContext(), 13.0f)) + this.m) + ejg.a(getContext(), 5.0f)) + this.y.getFontMetrics().bottom) - this.y.getFontMetrics().top;
        canvas.drawText(this.f3288n, paddingLeft, paddingTop, this.y);
        canvas.drawText(this.o, width, paddingTop, this.y);
        canvas.drawText(this.p, width2, paddingTop, this.y);
    }

    public final void b(Canvas canvas) {
        float paddingTop = getPaddingTop() + ejg.a(getContext(), 16.0f);
        RectF rectF = new RectF(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), this.m + paddingTop);
        if (this.q <= 0.0f) {
            this.q = this.m / 2.0f;
        }
        Path path = this.z;
        float f = this.q;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.v.setShader(new LinearGradient(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop, this.i, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawPath(this.z, this.v);
        float paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 3.0f);
        float paddingLeft2 = getPaddingLeft() + ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / 3.0f) * 2.0f);
        Path path2 = new Path();
        path2.moveTo(paddingLeft, paddingTop);
        path2.lineTo(paddingLeft, this.m + paddingTop);
        path2.moveTo(paddingLeft2, paddingTop);
        path2.lineTo(paddingLeft2, paddingTop + this.m);
        this.x.setStrokeWidth(ejg.a(getContext(), 1.3f));
        canvas.drawPath(path2, this.x);
    }

    public final void c(Canvas canvas) {
        if (this.u) {
            return;
        }
        float fA = ejg.a(getContext(), 3.0f);
        float fA2 = ejg.a(getContext(), 1.3f);
        float f = fA / 2.0f;
        float f2 = this.r - f;
        float paddingTop = (getPaddingTop() + ejg.a(getContext(), 16.0f)) - f;
        float f3 = this.r + f;
        float paddingTop2 = getPaddingTop() + ejg.a(getContext(), 16.0f) + this.m + f;
        RectF rectF = new RectF(f2 - fA2, paddingTop, f3 + fA2, paddingTop2);
        Path path = new Path();
        path.addRect(rectF, Path.Direction.CW);
        this.w.setColor(-1);
        canvas.drawPath(path, this.w);
        RectF rectF2 = new RectF(f2 - (fA2 / 4.0f), paddingTop, f3, paddingTop2);
        Path path2 = new Path();
        path2.addRoundRect(rectF2, f, f, Path.Direction.CW);
        this.w.setColor(-16777216);
        canvas.drawPath(path2, this.w);
    }

    public final int d(int i) {
        if (i == 1) {
            return 0;
        }
        for (int i2 = 0; i2 <= i; i2++) {
            float f = this.s;
            double d = i2;
            float f2 = i;
            if (f >= ((float) (d - 0.5d)) / f2 && f < ((float) (d + 0.5d)) / f2) {
                return i2;
            }
        }
        return 0;
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_base_GradientProgressBar);
        this.f3286j = typedArrayObtainStyledAttributes.getInt(R$styleable.lib_base_GradientProgressBar_lib_base_min_progress_value, 0);
        this.k = typedArrayObtainStyledAttributes.getInt(R$styleable.lib_base_GradientProgressBar_lib_base_max_progress_value, 100);
        this.f3287l = typedArrayObtainStyledAttributes.getInt(R$styleable.lib_base_GradientProgressBar_lib_base_progress_value, 0);
        this.m = typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_base_GradientProgressBar_lib_base_progress_height, 40.0f);
        this.f3288n = typedArrayObtainStyledAttributes.getString(R$styleable.lib_base_GradientProgressBar_lib_base_indicator_bottom_text_left);
        this.o = typedArrayObtainStyledAttributes.getString(R$styleable.lib_base_GradientProgressBar_lib_base_indicator_bottom_text_center);
        this.p = typedArrayObtainStyledAttributes.getString(R$styleable.lib_base_GradientProgressBar_lib_base_indicator_bottom_text_right);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_base_GradientProgressBar_lib_base_indicator_bottom_text_size, ejg.n(context, 20.0f));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.lib_base_GradientProgressBar_lib_base_indicator_bottom_text_color, -16777216);
        typedArrayObtainStyledAttributes.recycle();
        int i = this.f3287l;
        int i2 = this.f3286j;
        if (i < i2) {
            this.f3287l = i2;
        }
        int i3 = this.f3287l;
        int i4 = this.k;
        if (i3 > i4) {
            this.f3287l = i4;
        }
        Paint paint = new Paint();
        this.w = paint;
        paint.setAntiAlias(true);
        this.w.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.x = paint2;
        paint2.setAntiAlias(true);
        this.x.setColor(-1);
        this.x.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.y = paint3;
        paint3.setAntiAlias(true);
        this.y.setColor(color);
        this.y.setTextSize(dimension);
        Paint paint4 = new Paint();
        this.v = paint4;
        paint4.setAntiAlias(true);
        this.z = new Path();
    }

    public float getScale() {
        return this.s;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.s = this.f3287l / (this.k - this.f3286j);
        this.r = getPaddingLeft() + (this.m / 2.0f) + (this.s * (((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.m));
        this.t = d(this.i.length - 1);
        b(canvas);
        a(canvas);
        c(canvas);
    }

    public void setCurrentProgress(int i) {
        int i2 = this.f3286j;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.k;
        if (i > i3) {
            i = i3;
        }
        this.f3287l = i;
        this.u = i == 0;
        requestLayout();
    }

    public void setRadius(float f) {
        this.q = f;
    }

    public GradientProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = A;
        e(context, attributeSet);
    }

    public GradientProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = A;
        e(context, attributeSet);
    }
}
