package com.heytap.health.watchface.business.creation.category.paint.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.R$styleable;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintColorPickView extends View {
    public static final int[] z = {-1229250, -243, -13842644, -13052202, -14211083, -252164, -1229250};
    public Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f6815j;
    public Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6816l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6817n;
    public int o;
    public RectF p;
    public boolean q;
    public int r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public a x;
    public int y;

    public interface a {
        void a(int i);
    }

    public HandPaintColorPickView(Context context) {
        super(context);
        this.p = new RectF();
        this.q = false;
        this.w = true;
        f(null, 0);
    }

    public final int a(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }

    public final int b(float f) {
        float f2 = (float) (((double) f) / 6.283185307179586d);
        if (f2 < 0.0f) {
            f2 += 1.0f;
        }
        if (f2 <= 0.0f) {
            return z[0];
        }
        if (f2 >= 1.0f) {
            int[] iArr = z;
            return iArr[iArr.length - 1];
        }
        int[] iArr2 = z;
        float length = f2 * (iArr2.length - 1);
        int i = (int) length;
        float f3 = length - i;
        int i2 = iArr2[i];
        int i3 = iArr2[i + 1];
        return Color.argb(a(Color.alpha(i2), Color.alpha(i3), f3), a(Color.red(i2), Color.red(i3), f3), a(Color.green(i2), Color.green(i3), f3), a(Color.blue(i2), Color.blue(i3), f3));
    }

    public final void c() {
        int i = this.o;
        if (i != 0) {
            this.m = (this.y / 2) - i;
        }
        RectF rectF = this.p;
        int i2 = this.m;
        rectF.set(-i2, -i2, i2, i2);
    }

    public final float[] d(float f) {
        double d = f;
        return new float[]{(float) (((double) this.m) * Math.cos(d)), (float) (((double) this.m) * Math.sin(d))};
    }

    public final float e(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        return (float) Math.toRadians(fArr[0]);
    }

    public final void f(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.HandPaintColorPickView, i, 0);
        Resources resources = getContext().getResources();
        try {
            this.f6816l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HandPaintColorPickView_color_wheel_thickness, resources.getDimensionPixelSize(R$dimen.watch_face_wheel_thickness));
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HandPaintColorPickView_color_wheel_radius, resources.getDimensionPixelSize(R$dimen.watch_face_wheel_radius));
            this.f6817n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HandPaintColorPickView_color_pointer_radius, resources.getDimensionPixelSize(R$dimen.watch_face_pointer_radius));
            this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.HandPaintColorPickView_color_pointer_halo_radius, resources.getDimensionPixelSize(R$dimen.watch_face_pointer_halo_radius));
        } catch (Exception unused) {
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.v = -1.5707964f;
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, z, (float[]) null);
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setShader(sweepGradient);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(this.f6816l);
        Paint paint2 = new Paint(1);
        this.f6815j = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        this.k = paint3;
        paint3.setColor(b(this.v));
        this.r = b(this.v);
    }

    public int getColor() {
        return this.r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.i.setStrokeWidth(this.f6816l);
        float f = this.s;
        canvas.translate(f, f);
        canvas.drawOval(this.p, this.i);
        float[] fArrD = d(this.v);
        canvas.drawCircle(fArrD[0], fArrD[1], this.o, this.f6815j);
        canvas.drawCircle(fArrD[0], fArrD[1], this.f6817n, this.k);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.m;
        int i4 = this.o;
        int iMin = (i3 + i4) * 2;
        if (i4 == 0) {
            iMin = (i3 + (this.f6816l / 2)) * 2;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(iMin, size) : iMin;
        }
        if (mode2 == 1073741824) {
            iMin = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, size2);
        }
        int iMin2 = Math.min(size, iMin);
        this.y = iMin2;
        setMeasuredDimension(iMin2, iMin2);
        this.s = this.y * 0.5f;
        c();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        double dSqrt;
        int i;
        int i2;
        a aVar;
        getParent().requestDisallowInterceptTouchEvent(true);
        float x = motionEvent.getX() - this.s;
        float y = motionEvent.getY() - this.s;
        int action = motionEvent.getAction();
        if (action == 0) {
            float[] fArrD = d(this.v);
            float f = fArrD[0];
            int i3 = this.o;
            if (x < f - i3 || x > i3 + f) {
                dSqrt = Math.sqrt((x * x) + (y * y));
                i = this.m;
                i2 = this.o;
                if (dSqrt <= i + i2 || dSqrt < i - i2 || !this.w) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                }
                this.q = true;
                float fAtan2 = (float) Math.atan2(y - this.u, x - this.t);
                this.v = fAtan2;
                this.k.setColor(b(fAtan2));
                this.r = b(this.v);
                invalidate();
            } else {
                float f2 = fArrD[1];
                if (y < f2 - i3 || y > i3 + f2) {
                    dSqrt = Math.sqrt((x * x) + (y * y));
                    i = this.m;
                    i2 = this.o;
                    if (dSqrt <= i + i2) {
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                }
                this.t = x - f;
                this.u = y - f2;
                this.q = true;
                invalidate();
            }
        } else if (action == 1) {
            this.q = false;
            a aVar2 = this.x;
            if (aVar2 != null) {
                aVar2.a(this.r);
            }
            invalidate();
        } else if (action != 2) {
            if (action == 3 && (aVar = this.x) != null) {
                aVar.a(this.r);
            }
        } else {
            if (!this.q) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
            float fAtan3 = (float) Math.atan2(y - this.u, x - this.t);
            this.v = fAtan3;
            this.k.setColor(b(fAtan3));
            this.r = b(this.v);
            invalidate();
        }
        return true;
    }

    public void setColor(int i) {
        float fE = e(i);
        this.v = fE;
        this.k.setColor(b(fE));
        this.r = b(this.v);
        invalidate();
    }

    public void setOnColorSelectedListener(a aVar) {
        this.x = aVar;
    }

    public HandPaintColorPickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new RectF();
        this.q = false;
        this.w = true;
        f(attributeSet, 0);
    }

    public HandPaintColorPickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new RectF();
        this.q = false;
        this.w = true;
        f(attributeSet, i);
    }
}
