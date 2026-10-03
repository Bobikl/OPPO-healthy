package com.heytap.health.daily.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.heytap.health.daily.R$drawable;
import com.heytap.health.daily.R$styleable;
import com.heytap.store.base.widget.banner.config.BannerConfig;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes16.dex */
public class CardProgressView extends View {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3884j;
    public Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f3885l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3886n;
    public int o;
    public Drawable p;
    public float q;
    public ObjectAnimator r;

    public CardProgressView(Context context) {
        super(context);
        this.i = 0;
        this.f3884j = 2400;
        this.k = new Paint();
        this.f3885l = new Path();
        this.m = -16777216;
        this.f3886n = BannerConfig.INDICATOR_SELECTED_COLOR;
        this.o = -16711936;
        this.q = 0.0f;
        e(context, null);
    }

    public final float a(float f) {
        return ejg.a(getContext(), f);
    }

    public final void b(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * (this.i / this.f3884j);
        float fSqrt = (float) ((2.0d / Math.sqrt(3.0d)) * ((double) (getMeasuredHeight() * 0.33333334f)));
        float fMin = (measuredWidth > ((float) getMeasuredWidth()) / 2.0f ? Math.min(measuredWidth + (fSqrt / 2.0f), getMeasuredWidth()) - fSqrt : Math.max(0.0f, measuredWidth - (fSqrt / 2.0f))) * this.q;
        Drawable drawable = this.p;
        drawable.setBounds((int) fMin, 0, (int) (fMin + drawable.getIntrinsicWidth()), this.p.getIntrinsicHeight());
        this.p.draw(canvas);
    }

    public final void c(Canvas canvas) {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight() * 0.33333334f;
        this.k.setColor(this.f3886n);
        this.k.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(new RectF(0.0f, measuredHeight, measuredWidth, getMeasuredHeight()), a(3.0f), a(3.0f), this.k);
    }

    public final void d(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * (this.i / this.f3884j);
        if (measuredWidth > getMeasuredWidth()) {
            measuredWidth = getMeasuredWidth();
        }
        float f = measuredWidth * this.q;
        float measuredHeight = getMeasuredHeight() * 0.33333334f;
        this.k.setColor(this.o);
        this.k.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(0.0f, measuredHeight, f, getMeasuredHeight(), a(3.0f), a(3.0f), this.k);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.health_daily_CardProgressView, 0, 0);
        try {
            this.f3886n = typedArrayObtainStyledAttributes.getColor(R$styleable.health_daily_CardProgressView_health_daily__bg_color, BannerConfig.INDICATOR_SELECTED_COLOR);
            this.m = typedArrayObtainStyledAttributes.getColor(R$styleable.health_daily_CardProgressView_health_daily__arrow_color, -16777216);
            this.o = typedArrayObtainStyledAttributes.getColor(R$styleable.health_daily_CardProgressView_health_daily__value_color, -16711936);
            this.p = context.getDrawable(R$drawable.health_daily_ic_arrow);
            typedArrayObtainStyledAttributes.recycle();
            this.k.setAntiAlias(true);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void f(int i, int i2) {
        this.i = i;
        this.f3884j = i2;
        invalidate();
        g();
    }

    public void g() {
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.r.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        this.r = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(667L);
        this.r.start();
    }

    public float getPhaseX() {
        return this.q;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a7b.f("CardProgressView", "onDraw,value:" + this.i + ",targetValue:" + this.f3884j);
        c(canvas);
        d(canvas);
        b(canvas);
    }

    public void setPhaseX(float f) {
        StringBuilder sb = new StringBuilder();
        sb.append("setPhaseX:");
        sb.append(f);
        this.q = f;
        invalidate();
    }

    public CardProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
        this.f3884j = 2400;
        this.k = new Paint();
        this.f3885l = new Path();
        this.m = -16777216;
        this.f3886n = BannerConfig.INDICATOR_SELECTED_COLOR;
        this.o = -16711936;
        this.q = 0.0f;
        e(context, attributeSet);
    }

    public CardProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        this.f3884j = 2400;
        this.k = new Paint();
        this.f3885l = new Path();
        this.m = -16777216;
        this.f3886n = BannerConfig.INDICATOR_SELECTED_COLOR;
        this.o = -16711936;
        this.q = 0.0f;
        e(context, attributeSet);
    }
}
