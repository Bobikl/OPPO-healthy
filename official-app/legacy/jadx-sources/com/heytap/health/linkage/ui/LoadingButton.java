package com.heytap.health.linkage.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import com.coui.appcompat.button.COUIButton;
import com.heytap.health.base.base.BaseApplication;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes16.dex */
public class LoadingButton extends COUIButton {
    public int d0;
    public ValueAnimator e0;
    public final RectF f0;
    public String g0;
    public final Paint h0;
    public float i0;
    public ViewPropertyAnimator j0;
    public ViewPropertyAnimator k0;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoadingButton.this.i0 = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
            LoadingButton.this.invalidate();
        }
    }

    public LoadingButton(Context context) {
        this(context, null);
    }

    public void A() {
        if (this.d0 == 1) {
            this.d0 = 0;
            setText(this.g0);
            this.e0.cancel();
            this.i0 = 0.0f;
        }
    }

    public final void B() {
        if (Math.abs(getScaleX() - 0.95f) < 0.01f) {
            return;
        }
        y();
        this.j0 = animate().scaleX(0.95f).scaleY(0.95f).setDuration(100L).setInterpolator(new LinearInterpolator());
    }

    public final void C() {
        if (Math.abs(getScaleX() - 1.0f) < 0.01f) {
            return;
        }
        y();
        this.k0 = animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).setInterpolator(new LinearInterpolator());
    }

    public void D() {
        if (this.e0 == null) {
            initAnim();
        }
        if (this.d0 == 0) {
            this.d0 = 1;
            this.g0 = getText().toString();
            setText("");
            this.i0 = 0.0f;
            this.e0.start();
        }
    }

    public int getButtonState() {
        return this.d0;
    }

    public final void initAnim() {
        this.h0.setAntiAlias(true);
        this.h0.setStyle(Paint.Style.STROKE);
        this.h0.setColor(-1);
        this.h0.setStrokeCap(Paint.Cap.ROUND);
        this.h0.setStrokeWidth(ejg.a(BaseApplication.a(), 2.0f));
        this.e0 = z(0.0f, 360.0f, 1000L, 0L, new a());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d0 == 1) {
            this.e0.cancel();
        }
        y();
    }

    @Override // com.coui.appcompat.button.COUIButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d0 == 1) {
            canvas.drawArc(this.f0, this.i0, 230.0f, false, this.h0);
        }
    }

    @Override // com.coui.appcompat.button.COUIButton, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float measuredHeight = (getMeasuredHeight() * 0.33333334f) / 2.0f;
        this.f0.set((getMeasuredWidth() / 2.0f) - measuredHeight, (getMeasuredHeight() / 2.0f) - measuredHeight, (getMeasuredWidth() / 2.0f) + measuredHeight, (getMeasuredHeight() / 2.0f) + measuredHeight);
    }

    @Override // com.coui.appcompat.button.COUIButton, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d0 == 1) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            B();
        } else if (action == 1 || action == 3) {
            C();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void y() {
        ViewPropertyAnimator viewPropertyAnimator = this.j0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.j0 = null;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.k0;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            this.k0 = null;
        }
    }

    public final ValueAnimator z(float f, float f2, long j2, long j3, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setStartDelay(j3);
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return valueAnimatorOfFloat;
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h0 = new Paint();
        this.i0 = 0.0f;
        this.f0 = new RectF();
        this.d0 = 0;
        this.i0 = 0.0f;
        this.g0 = getText().toString();
        initAnim();
    }
}
