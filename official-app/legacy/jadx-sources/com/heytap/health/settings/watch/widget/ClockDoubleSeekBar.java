package com.heytap.health.settings.watch.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ArrayRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.heytap.health.device_settings.impl.R$array;
import com.heytap.health.device_settings.impl.R$color;
import com.heytap.health.device_settings.impl.R$dimen;
import com.heytap.health.device_settings.impl.R$drawable;
import com.heytap.health.device_settings.impl.R$styleable;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.weg;
import com.oplus.backup.sdk.common.utils.ModuleType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class ClockDoubleSeekBar extends View {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5651j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5652l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5653n;
    public int o;
    public int[] p;
    public int q;
    public Drawable r;
    public Drawable s;
    public Drawable t;
    public Drawable u;
    public Drawable v;
    public Point w;
    public Point x;
    public TextPaint y;
    public int z;

    public interface a {
    }

    public ClockDoubleSeekBar(Context context) {
        super(context);
        this.w = new Point();
        this.x = new Point();
        this.y = new TextPaint();
        f(null);
    }

    private int getClockMinHeight() {
        return ((this.q - (this.t.getIntrinsicHeight() / 2)) + (Math.max(this.u.getIntrinsicHeight(), this.v.getIntrinsicHeight()) / 2)) * 2;
    }

    private int getClockMinWidth() {
        return ((this.q - (this.t.getIntrinsicHeight() / 2)) + (Math.max(this.u.getIntrinsicWidth(), this.v.getIntrinsicWidth()) / 2)) * 2;
    }

    public final int a(float f, float f2, int i) {
        if (f < f2 / 2.0f) {
            return Math.round(((i * f2) / 360.0f) * 1440.0f);
        }
        int iRound = Math.round((((i + 1) * f2) / 360.0f) * 1440.0f);
        if (iRound == 1440) {
            return 0;
        }
        return iRound;
    }

    public final double b(float f, float f2) {
        double measuredWidth = ((double) getMeasuredWidth()) / 2.0d;
        double measuredHeight = ((double) getMeasuredHeight()) / 2.0d;
        double d = f;
        double d2 = f2;
        double dAtan = (Math.atan(Math.abs(measuredWidth - d) / Math.abs(measuredHeight - d2)) * 180.0d) / 3.141592653589793d;
        if (d < measuredWidth) {
            return d2 < measuredHeight ? (90.0d - dAtan) + 270.0d : dAtan + 180.0d;
        }
        return d2 > measuredHeight ? (90.0d - dAtan) + 90.0d : dAtan;
    }

    public final void c() {
        a7b.f("ClockDoubleSeekBar", "checkTimeInterval -> startTime: " + this.f5652l + ", endTime: " + this.m);
        int i = this.f5652l;
        int i2 = this.m;
        int i3 = i > i2 ? (1440 - i) + i2 : i2 - i;
        int i4 = this.f5653n;
        if (i3 <= i4) {
            int i5 = this.z;
            if (i5 == 1) {
                int i6 = i + i4;
                this.m = i6;
                if (i6 >= 1440) {
                    this.m = i6 - weg.WINDOW_NIGHT_END;
                }
            } else if (i5 == 2) {
                int i7 = i2 - i4;
                this.f5652l = i7;
                if (i7 < 0) {
                    this.f5652l = i7 + weg.WINDOW_NIGHT_END;
                }
            }
        } else {
            int i8 = this.o;
            if (i3 >= i8) {
                int i9 = this.z;
                if (i9 == 1) {
                    int i10 = i + i8;
                    this.m = i10;
                    if (i10 >= 1440) {
                        this.m = i10 - weg.WINDOW_NIGHT_END;
                    }
                } else if (i9 == 2) {
                    int i11 = i2 + (1440 - i8);
                    this.f5652l = i11;
                    if (i11 > 1440) {
                        this.f5652l = i11 - weg.WINDOW_NIGHT_END;
                    }
                }
            }
        }
        a7b.f("ClockDoubleSeekBar", "timeInterval: " + i3 + ", lastTouch: " + this.z + ", startTime: " + this.f5652l + ", endTime: " + this.m);
    }

    public final void d(double d, Point point) {
        a7b.f("ClockDoubleSeekBar", "degrees: " + d);
        double measuredWidth = ((double) getMeasuredWidth()) / 2.0d;
        double measuredHeight = ((double) getMeasuredHeight()) / 2.0d;
        int intrinsicHeight = this.q - (this.t.getIntrinsicHeight() / 2);
        int i = (int) (d / 90.0d);
        double d2 = d % 90.0d;
        a7b.f("ClockDoubleSeekBar", "quadrant: " + i + ", relativeAngle: " + d2);
        double d3 = d2 * 0.017453292519943295d;
        StringBuilder sb = new StringBuilder();
        sb.append("sin Angle: ");
        sb.append(Math.sin(d3));
        a7b.f("ClockDoubleSeekBar", sb.toString());
        double dSin = Math.sin(d3) * ((double) intrinsicHeight);
        double dSqrt = Math.sqrt(((double) (intrinsicHeight * intrinsicHeight)) - (dSin * dSin));
        a7b.f("ClockDoubleSeekBar", "degreesOpposite: " + dSin + ", degreesSide: " + dSqrt);
        if (i == 0 || i == 4) {
            point.set((int) (measuredWidth + dSin), (int) (measuredHeight - dSqrt));
            return;
        }
        if (i == 1) {
            point.set((int) (measuredWidth + dSqrt), (int) (measuredHeight + dSin));
        } else if (i == 2) {
            point.set((int) (measuredWidth - dSin), (int) (measuredHeight + dSqrt));
        } else {
            point.set((int) (measuredWidth - dSqrt), (int) (measuredHeight - dSin));
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.z = j(motionEvent.getX(), motionEvent.getY());
            getParent().requestDisallowInterceptTouchEvent(this.z != 0);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int e(int i, int i2) {
        return View.MeasureSpec.getMode(i2) != 1073741824 ? i : View.MeasureSpec.getSize(i2);
    }

    public final void f(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ClockDoubleSeekBar);
        try {
            try {
                this.i = typedArrayObtainStyledAttributes.getColor(R$styleable.ClockDoubleSeekBar_clockBackground, getContext().getColor(R$color.settings_color_cccccc));
                this.f5651j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockDoubleSeekBar_clockRadius, getContext().getResources().getDimensionPixelSize(R$dimen.settings_clock_radius));
                this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockDoubleSeekBar_clockPadding, getContext().getResources().getDimensionPixelSize(com.heytap.health.device_pair.R$dimen.dip_8));
                this.f5652l = typedArrayObtainStyledAttributes.getInteger(R$styleable.ClockDoubleSeekBar_startTime, 0);
                this.m = typedArrayObtainStyledAttributes.getInteger(R$styleable.ClockDoubleSeekBar_endTime, 60);
                Drawable drawable = ContextCompat.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.ClockDoubleSeekBar_startDrawable, R$drawable.settings_ic_night_normal));
                this.u = drawable;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.u.getIntrinsicHeight());
                Drawable drawable2 = ContextCompat.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.ClockDoubleSeekBar_endDrawable, R$drawable.settings_ic_sun_normal));
                this.v = drawable2;
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.v.getIntrinsicHeight());
                Drawable drawable3 = ContextCompat.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.ClockDoubleSeekBar_hourLine, R$drawable.settings_hour_line));
                this.s = drawable3;
                drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), this.s.getIntrinsicHeight());
                Drawable drawable4 = ContextCompat.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.ClockDoubleSeekBar_minuteLine, R$drawable.settings_minute_line));
                this.r = drawable4;
                drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), this.r.getIntrinsicHeight());
                Drawable drawable5 = ContextCompat.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.ClockDoubleSeekBar_outerRingLine, R$drawable.settings_seconds_line));
                this.t = drawable5;
                drawable5.setBounds(0, 0, drawable5.getIntrinsicWidth(), this.t.getIntrinsicHeight());
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockDoubleSeekBar_outerRingRadius, getContext().getResources().getDimensionPixelSize(R$dimen.settings_outerring_radius));
                this.p = getContext().getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(R$styleable.ClockDoubleSeekBar_outerRingColors, R$array.settings_clock_colors));
                this.f5653n = typedArrayObtainStyledAttributes.getInteger(R$styleable.ClockDoubleSeekBar_minTime, 0);
                this.o = typedArrayObtainStyledAttributes.getInteger(R$styleable.ClockDoubleSeekBar_maxTime, 0);
            } catch (Exception e2) {
                a7b.f("ClockDoubleSeekBar", a7b.e(e2));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean g(Point point, Drawable drawable, float f, float f2) {
        double dAbs = Math.abs(point.x - f);
        double dAbs2 = Math.abs(point.y - f2);
        return Math.sqrt((dAbs * dAbs) + (dAbs2 * dAbs2)) < ((double) (Math.min(drawable.getIntrinsicWidth(), drawable.getIntrinsicWidth()) / 2));
    }

    public int getEndTime() {
        return this.m;
    }

    public int getStartTime() {
        return this.f5652l;
    }

    public final boolean h(float f, float f2) {
        return g(this.x, this.v, f, f2);
    }

    public final boolean i(float f, float f2) {
        return g(this.w, this.u, f, f2);
    }

    public final int j(float f, float f2) {
        if (i(f, f2)) {
            return 1;
        }
        return h(f, f2) ? 2 : 0;
    }

    public final float k(float f) {
        int i = ((int) f) / 90;
        float f2 = f % 90.0f;
        if (i != 0) {
            if (i == 1) {
                return f2;
            }
            if (i == 2) {
                return f2 + 90.0f;
            }
            if (i == 3) {
                return f2 + 180.0f;
            }
            if (i != 4) {
                return 0.0f;
            }
        }
        return f2 - 90.0f;
    }

    public final float l(float f, float f2) {
        return f < f2 ? f2 - f : (360.0f - f) + f2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        a7b.f("ClockDoubleSeekBar", "centerX: " + measuredWidth + ", centerY: " + measuredHeight);
        this.y.reset();
        this.y.setAntiAlias(true);
        this.y.setColor(this.i);
        float f = (float) measuredWidth;
        float f2 = (float) measuredHeight;
        canvas.drawCircle(f, f2, this.f5651j, this.y);
        canvas.save();
        int intrinsicWidth = measuredWidth - (this.s.getIntrinsicWidth() / 2);
        int i = (measuredHeight - this.f5651j) + this.k;
        float f3 = 360.0f / 96;
        int i2 = 0;
        for (int i3 = 96; i2 < i3; i3 = 96) {
            canvas.save();
            canvas.rotate(i2 * f3, f, f2);
            canvas.translate(intrinsicWidth, i);
            if (i2 % 4 == 0) {
                this.s.draw(canvas);
            } else {
                this.r.draw(canvas);
            }
            canvas.restore();
            i2++;
        }
        int intrinsicWidth2 = measuredWidth - (this.t.getIntrinsicWidth() / 2);
        int i4 = measuredHeight - this.q;
        float f4 = 360.0f / ModuleType.TYPE_CLOCK;
        int i5 = 0;
        for (int i6 = ModuleType.TYPE_CLOCK; i5 < i6; i6 = ModuleType.TYPE_CLOCK) {
            canvas.save();
            canvas.rotate(i5 * f4, f, f2);
            canvas.translate(intrinsicWidth2, i4);
            this.t.draw(canvas);
            canvas.restore();
            i5++;
        }
        float f5 = (this.f5652l / 1440.0f) * 360.0f;
        float f6 = (this.m / 1440.0f) * 360.0f;
        float fK = k(f5);
        float fL = l(f5, f6);
        int[] iArr = this.p;
        int length = iArr.length;
        a7b.f("ClockDoubleSeekBar", Arrays.toString(iArr));
        float f7 = (fL / 360.0f) / length;
        a7b.f("ClockDoubleSeekBar", "posDiff: " + f7);
        float[] fArr = new float[length];
        for (int i7 = 0; i7 < length; i7++) {
            fArr[i7] = i7 * f7;
        }
        a7b.f("ClockDoubleSeekBar", "positions: " + Arrays.toString(fArr));
        SweepGradient sweepGradient = new SweepGradient((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), this.p, fArr);
        Matrix matrix = new Matrix();
        matrix.setRotate(k(f5), f, f2);
        sweepGradient.setLocalMatrix(matrix);
        this.y.reset();
        this.y.setAntiAlias(true);
        this.y.setStrokeWidth(this.t.getIntrinsicHeight());
        this.y.setStyle(Paint.Style.STROKE);
        this.y.setStrokeCap(Paint.Cap.ROUND);
        this.y.setShader(sweepGradient);
        int intrinsicHeight = this.t.getIntrinsicHeight() / 2;
        int i8 = this.q;
        RectF rectF = new RectF((measuredWidth - i8) + intrinsicHeight, (measuredHeight - i8) + intrinsicHeight, (measuredWidth + i8) - intrinsicHeight, (measuredHeight + i8) - intrinsicHeight);
        a7b.f("ClockDoubleSeekBar", "rectF: " + rectF);
        a7b.f("ClockDoubleSeekBar", "start: " + this.f5652l + ", mEnd: " + this.m);
        canvas.drawArc(rectF, fK, fL, false, this.y);
        canvas.save();
        d((double) f5, this.w);
        a7b.f("ClockDoubleSeekBar", "startPoint: " + this.w);
        canvas.translate((float) (this.w.x - (this.u.getIntrinsicWidth() / 2)), (float) (this.w.y - (this.u.getIntrinsicHeight() / 2)));
        this.u.draw(canvas);
        canvas.restore();
        canvas.save();
        d(f6, this.x);
        a7b.f("ClockDoubleSeekBar", "endPoint: " + this.x);
        canvas.translate((float) (this.x.x - (this.v.getIntrinsicWidth() / 2)), (float) (this.x.y - (this.v.getIntrinsicHeight() / 2)));
        this.v.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(e(getClockMinWidth(), i), e(getClockMinHeight(), i2));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            return this.z != 0;
        }
        if (action == 1) {
            this.z = 0;
        } else if (action == 2) {
            double dB = b(motionEvent.getX(), motionEvent.getY());
            float f = 360.0f / ModuleType.TYPE_CLOCK;
            int i = (int) (dB / ((double) f));
            float f2 = (float) (dB - ((double) (i * f)));
            a7b.f("ClockDoubleSeekBar", "angleOfMinute: " + i + ", angleDiff: " + f2 + ", angle: " + dB + ", rotate: " + f);
            int i2 = this.z;
            if (i2 == 1) {
                this.f5652l = a(f2, f, i);
                c();
            } else {
                if (i2 != 2) {
                    return false;
                }
                this.m = a(f2, f, i);
                c();
            }
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setEndDrawable(@DrawableRes int i) {
        Drawable drawable = getContext().getDrawable(i);
        this.v = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.v.getIntrinsicHeight());
    }

    public void setEndTime(int i) {
        this.m = i;
    }

    public void setOnChangeListener(a aVar) {
    }

    public void setOuterRingColors(@ArrayRes int i) {
        this.p = getContext().getResources().getIntArray(i);
    }

    public void setStartDrawable(@DrawableRes int i) {
        Drawable drawable = getContext().getDrawable(i);
        this.u = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.u.getIntrinsicHeight());
    }

    public void setStartTime(int i) {
        this.f5652l = i;
    }

    public ClockDoubleSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new Point();
        this.x = new Point();
        this.y = new TextPaint();
        f(attributeSet);
    }

    public ClockDoubleSeekBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = new Point();
        this.x = new Point();
        this.y = new TextPaint();
        f(attributeSet);
    }
}
