package com.heytap.health.device.tab.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.heytap.health.device_pair.R$color;
import com.heytap.health.device_settings.impl.R$styleable;
import com.oplus.aiunit.vision.qe0;

/* JADX INFO: loaded from: classes16.dex */
public class HorizBatteryView extends View {
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3989j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3990l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3991n;
    public Paint o;
    public int p;
    public Path q;

    public HorizBatteryView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, Path path) {
        b(canvas, path);
        e(canvas, path);
        if (this.f3991n <= this.m) {
            this.o.setColor(this.k);
        } else {
            this.o.setColor(this.f3990l);
        }
        canvas.drawRect(6.0f, 14.0f, ((this.f3991n / 100.0f) * 27.0f) + 6.0f, 28.0f, this.o);
    }

    public final void b(Canvas canvas, Path path) {
        path.moveTo(34.0f, 6.9404f);
        path.lineTo(5.0f, 6.9404f);
        path.cubicTo(2.2386f, 6.9404f, 0.0f, 9.16f, 0.0f, 11.8979f);
        path.lineTo(0.0f, 29.7447f);
        path.cubicTo(0.0f, 32.4826f, 2.2386f, 34.7021f, 5.0f, 34.7021f);
        path.lineTo(34.0f, 34.7021f);
        path.cubicTo(36.7614f, 34.7021f, 39.0f, 32.4826f, 39.0f, 29.7447f);
        path.lineTo(39.0f, 11.8979f);
        path.cubicTo(39.0f, 9.16f, 36.7614f, 6.9404f, 34.0f, 6.9404f);
        path.close();
        path.moveTo(34.0f, 9.9149f);
        path.cubicTo(35.1046f, 9.9149f, 36.0f, 10.8027f, 36.0f, 11.8979f);
        path.lineTo(36.0f, 29.7447f);
        path.cubicTo(36.0f, 30.8398f, 35.1046f, 31.7277f, 34.0f, 31.7277f);
        path.lineTo(5.0f, 31.7277f);
        path.cubicTo(3.8954f, 31.7277f, 3.0f, 30.8398f, 3.0f, 29.7447f);
        path.lineTo(3.0f, 11.8979f);
        path.cubicTo(3.0f, 10.8027f, 3.8954f, 9.9149f, 5.0f, 9.9149f);
        path.lineTo(34.0f, 9.9149f);
        path.close();
        canvas.drawPath(path, this.o);
        e(canvas, path);
        path.reset();
    }

    public final void c(Canvas canvas, Path path) {
        b(canvas, path);
        path.moveTo(12.6082f, 22.0191f);
        path.lineTo(12.5627f, 22.0865f);
        path.cubicTo(12.3803f, 22.409f, 12.6096f, 22.8297f, 13.0f, 22.8297f);
        path.lineTo(17.572f, 22.8294f);
        path.lineTo(16.5002f, 29.2499f);
        path.cubicTo(16.4156f, 29.7567f, 17.0588f, 30.0462f, 17.3821f, 29.6468f);
        path.lineTo(25.4244f, 19.7088f);
        path.lineTo(25.4708f, 19.6415f);
        path.cubicTo(25.6571f, 19.3191f, 25.4283f, 18.8943f, 25.0357f, 18.8943f);
        path.lineTo(20.13f, 18.8934f);
        path.lineTo(21.4896f, 12.3415f);
        path.cubicTo(21.5966f, 11.8255f, 20.9356f, 11.5164f, 20.6082f, 11.9293f);
        path.lineTo(12.6082f, 22.0191f);
        path.close();
        canvas.drawPath(path, this.o);
    }

    public final void d(Canvas canvas, Path path) {
        path.moveTo(6.913f, 7.119f);
        path.lineTo(9.887f, 10.093f);
        path.lineTo(5.0f, 10.0936f);
        path.cubicTo(3.9456f, 10.0936f, 3.0818f, 10.9025f, 3.0055f, 11.9286f);
        path.lineTo(3.0f, 12.0766f);
        path.lineTo(3.0f, 29.9234f);
        path.cubicTo(3.0f, 31.0186f, 3.8954f, 31.9064f, 5.0f, 31.9064f);
        path.lineTo(5.0f, 31.9064f);
        path.lineTo(31.701f, 31.906f);
        path.lineTo(34.6364f, 34.8411f);
        path.cubicTo(34.4983f, 34.8585f, 34.3583f, 34.8703f, 34.2169f, 34.8763f);
        path.lineTo(34.0f, 34.8808f);
        path.lineTo(5.0f, 34.8808f);
        path.cubicTo(2.2386f, 34.8808f, 0.0f, 32.6613f, 0.0f, 29.9234f);
        path.lineTo(0.0f, 29.9234f);
        path.lineTo(0.0f, 12.0766f);
        path.cubicTo(0.0f, 9.3387f, 2.2386f, 7.1191f, 5.0f, 7.1191f);
        path.lineTo(5.0f, 7.1191f);
        path.lineTo(6.913f, 7.119f);
        path.close();
        path.moveTo(34.0f, 7.1191f);
        path.cubicTo(36.7614f, 7.1191f, 39.0f, 9.3387f, 39.0f, 12.0766f);
        path.lineTo(39.0f, 12.0766f);
        path.lineTo(39.0f, 29.9234f);
        path.cubicTo(39.0f, 31.3096f, 38.4261f, 32.563f, 37.5011f, 33.4626f);
        path.lineTo(35.3878f, 31.3512f);
        path.cubicTo(35.7652f, 30.9906f, 36.0f, 30.4842f, 36.0f, 29.9234f);
        path.lineTo(36.0f, 29.9234f);
        path.lineTo(36.0f, 12.0766f);
        path.cubicTo(36.0f, 10.9814f, 35.1046f, 10.0936f, 34.0f, 10.0936f);
        path.lineTo(34.0f, 10.0936f);
        path.lineTo(14.13f, 10.093f);
        path.lineTo(11.155f, 7.119f);
        path.close();
        canvas.drawPath(path, this.o);
        e(canvas, path);
        path.reset();
        this.o.setStyle(Paint.Style.FILL_AND_STROKE);
        this.o.setStrokeWidth(3.0f);
        path.moveTo(2.0352f, 4.1178f);
        path.lineTo(36.6835f, 38.7669f);
        path.close();
        canvas.drawPath(path, this.o);
    }

    public final void e(Canvas canvas, Path path) {
        path.reset();
        path.moveTo(38.0f, 14.0596f);
        path.lineTo(39.0f, 14.0596f);
        path.cubicTo(40.6569f, 14.0596f, 42.0f, 15.4027f, 42.0f, 17.0596f);
        path.lineTo(42.0f, 24.9404f);
        path.cubicTo(42.0f, 26.5973f, 40.6569f, 27.9404f, 39.0f, 27.9404f);
        path.lineTo(38.0f, 27.9404f);
        path.lineTo(38.0f, 14.0596f);
        path.close();
        this.o.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, this.o);
    }

    public final void f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HorizBatteryView);
        this.f3991n = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizBatteryView_defaultPercent, 0);
        this.m = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizBatteryView_lowBatteryPercent, 20);
        int i = R$styleable.HorizBatteryView_lowBatteryColor;
        int i2 = R$color.black;
        this.k = typedArrayObtainStyledAttributes.getColor(i, ContextCompat.getColor(context, i2));
        this.f3990l = typedArrayObtainStyledAttributes.getColor(R$styleable.HorizBatteryView_normalBatteryColor, ContextCompat.getColor(context, i2));
        this.p = typedArrayObtainStyledAttributes.getInt(R$styleable.HorizBatteryView_batteryType, 0);
        typedArrayObtainStyledAttributes.recycle();
        setAlpha(0.5f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.o.setStyle(Paint.Style.FILL_AND_STROKE);
        this.o.setStrokeWidth(1.0f);
        canvas.scale(this.i, this.f3989j);
        this.q.reset();
        this.q.setFillType(Path.FillType.WINDING);
        int i = this.p;
        if (i == 0) {
            a(canvas, this.q);
        } else if (i == 2) {
            c(canvas, this.q);
        } else {
            d(canvas, this.q);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iResolveSize = View.resolveSize(measuredWidth, i);
        int iResolveSize2 = View.resolveSize(measuredHeight, i2);
        this.i = iResolveSize / 42.0f;
        this.f3989j = iResolveSize2 / 42.0f;
        setMeasuredDimension(iResolveSize, iResolveSize2);
    }

    public void setBatteryPercent(int i) {
        boolean z;
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        boolean z2 = true;
        if (this.f3991n != i) {
            this.f3991n = i;
            z = true;
        } else {
            z = false;
        }
        int i2 = this.f3991n <= 0 ? 1 : 0;
        if (this.p != i2) {
            this.p = i2;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidate();
        }
    }

    public HorizBatteryView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizBatteryView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public HorizBatteryView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.q = new Path();
        qe0.G(this, false);
        f(context, attributeSet);
        Paint paint = new Paint();
        this.o = paint;
        paint.setAntiAlias(true);
        this.o.setColor(ContextCompat.getColor(getContext(), R$color.black));
    }
}
