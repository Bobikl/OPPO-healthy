package com.heytap.health.daily.view.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.heytap.health.daily.bean.DailyActivityDayBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DailyActivityDrawableViewOnePlus extends AppCompatImageView {
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Integer> f3888j;
    public final List<Integer> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f3889l;
    public final int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f3890n;
    public int[] o;
    public DailyActivityDayBean p;
    public final RectF q;
    public final Paint r;
    public boolean s;

    public DailyActivityDrawableViewOnePlus(Context context) {
        this(context, null);
    }

    public final float a(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.1f || f > 1.0f) {
            return 0.1f;
        }
        return f;
    }

    public final synchronized void b() {
        for (int i = 0; i < 4; i++) {
            int iIntValue = this.f3888j.get(i).intValue();
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            this.m[i] = iIntValue;
            float[] fArr = this.f3889l;
            float f = iIntValue;
            if (fArr[i] > f) {
                fArr[i] = f;
            }
        }
    }

    public final void c() {
        int i;
        for (int i2 = 0; i2 < 4; i2++) {
            int iIntValue = this.k.get(i2).intValue();
            if (iIntValue <= 0 || (i = this.m[i2]) == 0) {
                this.f3889l[i2] = 0.0f;
            } else if (iIntValue > i) {
                this.f3889l[i2] = 0.99f;
            } else {
                float[] fArr = this.f3889l;
                float f = (iIntValue * 1.0f) / i;
                fArr[i2] = f;
                fArr[i2] = a(f);
                float[] fArr2 = this.f3889l;
                fArr2[i2] = Math.min(0.99f, fArr2[i2]);
            }
        }
    }

    public void init() {
        Arrays.fill(this.f3889l, 0.0f);
        this.f3890n = new int[]{-14853377, -99534, -16724531, -2741636};
        this.o = new int[]{857561855, 872315698, 855690701, 869673596};
        this.r.setStyle(Paint.Style.FILL);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.s || getVisibility() == 8) {
            return;
        }
        this.f3888j.clear();
        this.f3888j.addAll(Arrays.asList(Integer.valueOf(this.p.getTargetActive()), Integer.valueOf(this.p.getTargetTime()), Integer.valueOf(this.p.getTargetStep()), Integer.valueOf(this.p.getTargetCalorie())));
        b();
        this.k.clear();
        this.k.addAll(Arrays.asList(Integer.valueOf(this.p.getCurrentActive()), Integer.valueOf(this.p.getCurrentTime()), Integer.valueOf(this.p.getCurrentStep()), Integer.valueOf(this.p.getCurrentCalorie())));
        c();
        for (int i = 0; i < 4; i++) {
            if (this.f3889l[i] < 0.99f) {
                float width = (getWidth() * 0.00999999f) / 2.0f;
                RectF rectF = this.q;
                rectF.top = width;
                rectF.left = width;
                rectF.right = getWidth() - width;
                this.q.bottom = getHeight() - width;
                this.r.setColor(this.o[i]);
                canvas.drawArc(this.q, i * 90, 90.0f, true, this.r);
            }
            float width2 = ((1.0f - this.f3889l[i]) * getWidth()) / 2.0f;
            RectF rectF2 = this.q;
            rectF2.top = width2;
            rectF2.left = width2;
            rectF2.right = getWidth() - width2;
            this.q.bottom = getHeight() - width2;
            this.r.setColor(this.f3890n[i]);
            canvas.drawArc(this.q, i * 90, 90.0f, true, this.r);
        }
    }

    public void setData(DailyActivityDayBean dailyActivityDayBean) {
        this.p = dailyActivityDayBean;
        this.s = true;
    }

    public DailyActivityDrawableViewOnePlus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DailyActivityDrawableViewOnePlus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3888j = new ArrayList();
        this.k = new ArrayList();
        this.f3889l = new float[4];
        this.m = new int[]{30, 12, 300, 8000};
        this.p = new DailyActivityDayBean();
        this.q = new RectF();
        this.r = new Paint(1);
        this.s = false;
        this.i = context;
        init();
    }
}
