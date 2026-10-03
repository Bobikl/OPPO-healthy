package com.oplus.aiunit.vision;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: loaded from: classes15.dex */
public class lb3 extends Drawable implements Animatable {
    public Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ValueAnimator f13617j;
    public int k;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f13619n;
    public boolean p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RectF f13618l = new RectF();
    public int o = 1200;
    public int q = Color.parseColor("#19000000");
    public int r = Color.parseColor("#FF2AD181");
    public Property<lb3, Integer> s = new a(Integer.class, "radius");

    public class a extends Property<lb3, Integer> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(lb3 lb3Var) {
            return Integer.valueOf(lb3Var.k);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(lb3 lb3Var, Integer num) {
            lb3Var.k = num.intValue();
        }
    }

    public lb3(boolean z, int i) {
        this.p = false;
        this.p = z;
        this.f13619n = i;
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setAntiAlias(true);
        this.i.setColor(-16777216);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(ValueAnimator valueAnimator) {
        StringBuilder sb = new StringBuilder();
        sb.append("update = ");
        sb.append(valueAnimator.getAnimatedValue());
        invalidateSelf();
    }

    public final Rect d(Rect rect) {
        int iMin = Math.min(rect.width() - this.f13619n, rect.height() - this.f13619n);
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int i = iMin / 2;
        return new Rect(iCenterX - i, iCenterY - i, iCenterX + i, iCenterY + i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        StringBuilder sb = new StringBuilder();
        sb.append("draw drawable, rect=");
        sb.append(this.f13618l);
        sb.append(" radius=");
        sb.append(this.k);
        this.i.setColor(this.q);
        canvas.drawArc(this.f13618l, -90.0f, 360.0f, false, this.i);
        if (this.p) {
            this.i.setColor(this.r);
            canvas.drawArc(this.f13618l, -90.0f, this.k, false, this.i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ValueAnimator valueAnimator = this.f13617j;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13618l.set(d(rect));
        if (isRunning()) {
            stop();
        }
        if (this.p) {
            start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        stop();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt(this.s, 0, 360));
        this.f13617j = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.m);
        this.f13617j.setDuration(this.o);
        this.f13617j.setInterpolator(new AccelerateInterpolator());
        this.f13617j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.kb3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.e(valueAnimator);
            }
        });
        this.f13617j.setRepeatMode(1);
        this.f13617j.setRepeatCount(0);
        this.f13617j.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ValueAnimator valueAnimator = this.f13617j;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }
}
