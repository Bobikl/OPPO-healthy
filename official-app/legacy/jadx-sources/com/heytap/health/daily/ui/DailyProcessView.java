package com.heytap.health.daily.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.heytap.health.health_base.R$color;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes16.dex */
public class DailyProcessView extends View {
    public static final float r;
    public static final Paint s;
    public static final Paint t;
    public static final Paint u;
    public static final Paint v;
    public static final Paint w;
    public static final Paint x;
    public static final Paint y;
    public static final Paint z;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3856j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3857l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RectF f3858n;
    public final RectF o;
    public final RectF p;
    public final RectF q;

    static {
        Paint paint = new Paint(1);
        s = paint;
        Paint paint2 = new Paint(1);
        t = paint2;
        Paint paint3 = new Paint(1);
        u = paint3;
        Paint paint4 = new Paint(1);
        v = paint4;
        Paint paint5 = new Paint(1);
        w = paint5;
        Paint paint6 = new Paint(1);
        x = paint6;
        Paint paint7 = new Paint(1);
        y = paint7;
        Paint paint8 = new Paint(1);
        z = paint8;
        float fA = ejg.a(b78.a(), 2.0f);
        r = fA;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fA * 2.0f);
        paint.setColor(b78.a().getColor(R$color.health_daily_activity_step_OPlus));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(fA * 2.0f);
        paint2.setColor(b78.a().getColor(R$color.health_daily_activity_calories_OPlus));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeWidth(fA * 2.0f);
        paint3.setColor(b78.a().getColor(R$color.health_daily_activity_exercise_duration_OPlus));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        paint4.setStrokeWidth(fA * 2.0f);
        paint4.setColor(b78.a().getColor(R$color.health_daily_activity_activity_frequency_OPlus));
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(fA * 2.0f);
        paint5.setColor(b78.a().getColor(R$color.health_daily_activity_step_calender));
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(fA * 2.0f);
        paint6.setColor(b78.a().getColor(R$color.health_daily_activity_calories_calender));
        paint7.setStyle(Paint.Style.STROKE);
        paint7.setStrokeWidth(fA * 2.0f);
        paint7.setColor(b78.a().getColor(R$color.health_daily_activity_exercise_duration_calender));
        paint8.setStyle(Paint.Style.STROKE);
        paint8.setStrokeWidth(fA * 2.0f);
        paint8.setColor(b78.a().getColor(R$color.health_daily_activity_activity_frequency_calender));
    }

    public DailyProcessView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = false;
        this.f3858n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
    }

    public void a(float f, float f2, float f3, float f4) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        this.i = (int) (f * 360.0f);
        this.f3856j = (int) (f2 * 360.0f);
        this.k = (int) (f3 * 360.0f);
        this.f3857l = (int) (f4 * 360.0f);
        this.m = true;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.m || getVisibility() == 8) {
            return;
        }
        if (this.i < 360) {
            canvas.drawArc(this.f3858n, 0.0f, 360.0f, false, w);
        }
        if (this.f3856j < 360) {
            canvas.drawArc(this.o, 0.0f, 360.0f, false, x);
        }
        if (this.k < 360) {
            canvas.drawArc(this.p, 0.0f, 360.0f, false, y);
        }
        if (this.f3857l < 360) {
            canvas.drawArc(this.q, 0.0f, 360.0f, false, z);
        }
        int i = this.i;
        if (i > 0) {
            canvas.drawArc(this.f3858n, -90.0f, i, false, s);
        }
        int i2 = this.f3856j;
        if (i2 > 0) {
            canvas.drawArc(this.o, -90.0f, i2, false, t);
        }
        int i3 = this.k;
        if (i3 > 0) {
            canvas.drawArc(this.p, -90.0f, i3, false, u);
        }
        int i4 = this.f3857l;
        if (i4 > 0) {
            canvas.drawArc(this.q, -90.0f, i4, false, v);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float f = r;
        float f2 = measuredWidth - (2.5f * f);
        StringBuilder sb = new StringBuilder();
        sb.append("onMeasure circleWidth is ");
        sb.append(f2);
        sb.append(", width is ");
        sb.append(getMeasuredWidth());
        sb.append(" sPadding is ");
        sb.append(f);
        RectF rectF = this.f3858n;
        rectF.top = f;
        rectF.left = f;
        rectF.right = f + f2;
        rectF.bottom = f + f2;
        RectF rectF2 = this.o;
        rectF2.top = f;
        rectF2.left = (f * 3.5f) + f2;
        float f3 = 2.0f * f2;
        rectF2.right = (f * 3.5f) + f3;
        rectF2.bottom = f + f2;
        RectF rectF3 = this.p;
        rectF3.top = (f * 3.5f) + f2;
        rectF3.left = f;
        rectF3.right = f + f2;
        rectF3.bottom = (f * 3.5f) + f3;
        RectF rectF4 = this.q;
        rectF4.top = (f * 3.5f) + f2;
        rectF4.left = (f * 3.5f) + f2;
        rectF4.right = (f * 3.5f) + f3;
        rectF4.bottom = (f * 3.5f) + f3;
    }
}
