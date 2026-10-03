package com.heytap.sports.home.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.heytap.sports.R$color;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PhysiqueRadarChart extends View {
    public static final int CIRCLE_POINT_RADIUS = 8;
    public Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Path f7880j;
    public List<Float> k;

    public PhysiqueRadarChart(Context context) {
        super(context);
        b();
    }

    public final float[] a(float f, int i, int i2, int i3, int i4) {
        float f2 = (float) ((((double) f) * 3.141592653589793d) / 180.0d);
        double d = i - i3;
        double d2 = f2;
        double d3 = i2 - i4;
        return new float[]{(float) ((((double) i) + (Math.cos(d2) * d)) - (Math.sin(d2) * d3)), (float) (((double) i4) + (d * Math.sin(d2)) + (d3 * Math.cos(d2)))};
    }

    public final void b() {
        this.i = new Paint();
        this.f7880j = new Path();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.k == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.i.reset();
        int iA = ejg.a(getContext(), 71.0f);
        int i = width / 2;
        int i2 = height / 2;
        int i3 = (width - iA) / 2;
        int i4 = i3 + iA;
        int i5 = (height - iA) / 2;
        int i6 = i5 + iA;
        this.i.setAntiAlias(true);
        this.i.setColor(getContext().getColor(R$color.sports_home_radar_bg));
        float f = i5;
        canvas.drawOval(i3, f, i4, i6, this.i);
        this.i.setColor(getContext().getColor(R$color.sports_home_radar_circle));
        float f2 = 1.3f;
        this.i.setStrokeWidth(ejg.a(getContext(), 1.3f));
        this.i.setStyle(Paint.Style.STROKE);
        int i7 = iA / 10;
        int i8 = 0;
        while (i8 < 5) {
            canvas.drawOval(i3, i5, i4, i6, this.i);
            i3 += i7;
            i5 += i7;
            i4 -= i7;
            i6 -= i7;
            i8++;
            f2 = 1.3f;
        }
        float f3 = f2;
        float size = 360.0f / this.k.size();
        this.f7880j.reset();
        float[] fArr = null;
        int i9 = 0;
        while (i9 < this.k.size()) {
            float fFloatValue = this.k.get(i9).floatValue();
            this.i.setStrokeWidth(ejg.a(getContext(), f3));
            this.i.setStyle(Paint.Style.STROKE);
            this.i.setColor(getContext().getColor(R$color.sports_home_radar_circle));
            float f4 = i;
            float f5 = i2;
            canvas.drawLine(f4, f, f4, f5, this.i);
            int i10 = (int) (f5 - ((iA * fFloatValue) / 2.0f));
            int i11 = iA;
            float[] fArrA = a(size * i9, i, i10, i, i2);
            float f6 = fArrA[0];
            float f7 = fArrA[1];
            if (fFloatValue != 0.0f) {
                this.i.setStyle(Paint.Style.FILL);
                this.i.setColor(getContext().getColor(R$color.sports_home_radar_line));
                canvas.drawCircle(f4, i10, 8.0f, this.i);
                if (fArr == null) {
                    this.f7880j.moveTo(f6, f7);
                    fArr = new float[]{f6, f7};
                }
                this.f7880j.lineTo(f6, f7);
            }
            canvas.rotate(size, f4, f5);
            i9++;
            iA = i11;
            f3 = 1.3f;
        }
        if (fArr != null) {
            this.f7880j.lineTo(fArr[0], fArr[1]);
        }
        this.i.setColor(getContext().getColor(R$color.sports_home_radar_scope));
        this.i.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.f7880j, this.i);
        this.i.setColor(getContext().getColor(R$color.sports_home_radar_line));
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(ejg.a(b78.a(), 2.0f));
        canvas.drawPath(this.f7880j, this.i);
    }

    public void setData(List<Float> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.k = list;
        postInvalidate();
    }

    public PhysiqueRadarChart(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public PhysiqueRadarChart(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
