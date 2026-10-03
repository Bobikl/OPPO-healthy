package com.heytap.udeviceui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.oplus.aiunit.vision.pek;
import com.oplus.aiunit.vision.rek;

/* JADX INFO: loaded from: classes18.dex */
public class UDeviceSwitch extends CompoundButton {
    public int A;
    public int B;
    public int C;
    public int D;
    public RectF E;
    public RectF F;
    public int G;
    public int H;
    public float I;
    public float J;
    public float K;
    public int L;
    public float M;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Paint V;
    public Paint W;
    public Paint a0;
    public Drawable b0;
    public Drawable c0;
    public Drawable d0;
    public Drawable e0;
    public Drawable f0;
    public Drawable g0;
    public AnimatorSet h0;
    public String i;
    public AnimatorSet i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8337j;
    public AnimatorSet j0;
    public String k;
    public AnimatorSet k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8338l;
    public rek l0;
    public int m;
    public int m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8339n;
    public int n0;
    public int o;
    public boolean o0;
    public int p;
    public boolean p0;
    public int q;
    public AccessibilityManager q0;
    public int r;
    public int r0;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public interface a {
    }

    public UDeviceSwitch(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0041  */
    public final void a(boolean z) {
        int i;
        this.h0.setInterpolator(PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "circleScaleX", 1.0f, 1.3f);
        objectAnimatorOfFloat.setDuration(133L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "circleScaleX", 1.3f, 1.0f);
        objectAnimatorOfFloat2.setStartDelay(133L);
        objectAnimatorOfFloat2.setDuration(250L);
        int circleTranslation = getCircleTranslation();
        if (p()) {
            if (z) {
                i = 0;
            } else {
                i = this.H;
            }
        } else if (z) {
            i = this.H;
        } else {
            i = 0;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "circleTranslation", circleTranslation, i);
        objectAnimatorOfInt.setDuration(383L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "innerCircleAlpha", getInnerCircleAlpha(), z ? 0.0f : 1.0f);
        objectAnimatorOfFloat3.setDuration(100L);
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(this, "barColor", getBarColor(), z ? this.f8339n : this.o);
        objectAnimatorOfArgb.setDuration(450L);
        this.h0.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfInt).with(objectAnimatorOfFloat3).with(objectAnimatorOfArgb);
        this.h0.start();
    }

    public final Drawable b() {
        if (o()) {
            return isChecked() ? this.e0 : this.f0;
        }
        return isChecked() ? this.c0 : this.d0;
    }

    public final void c(Canvas canvas) {
        canvas.save();
        this.V.setColor(this.L);
        if (!isEnabled()) {
            this.V.setColor(isChecked() ? this.w : this.v);
        }
        int i = this.m;
        float f = i / 2.0f;
        int i2 = this.C;
        int i3 = this.D;
        canvas.drawRoundRect(i2, i3, this.f8338l + i2, i + i3, f, f, this.V);
        canvas.restore();
    }

    public final void d(Canvas canvas) {
        canvas.save();
        float f = this.J;
        canvas.scale(f, f, this.E.centerX(), this.E.centerY());
        float f2 = this.t / 2.0f;
        this.a0.setColor(this.u);
        if (!isEnabled()) {
            this.a0.setColor(isChecked() ? this.y : this.x);
        }
        float f3 = this.K;
        if (f3 == 0.0f) {
            this.a0.setAlpha((int) (f3 * 255.0f));
        }
        canvas.drawRoundRect(this.F, f2, f2, this.a0);
        canvas.restore();
    }

    public final void e(Canvas canvas) {
        canvas.save();
        float f = this.M;
        canvas.scale(f, f, this.E.centerX(), this.E.centerY());
        canvas.rotate(this.O, this.E.centerX(), this.E.centerY());
        Drawable drawable = this.b0;
        if (drawable != null) {
            RectF rectF = this.E;
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.b0.setAlpha((int) (this.N * 255.0f));
            this.b0.draw(canvas);
        }
        canvas.restore();
    }

    public final void f(Canvas canvas) {
        canvas.save();
        float f = this.J;
        canvas.scale(f, f, this.E.centerX(), this.E.centerY());
        this.W.setColor(isChecked() ? this.r : this.s);
        if (!isEnabled()) {
            this.W.setColor(isChecked() ? this.A : this.z);
        }
        float f2 = this.p / 2.0f;
        canvas.drawRoundRect(this.E, f2, f2, this.W);
        canvas.restore();
    }

    public final void g(Canvas canvas) {
        canvas.save();
        Drawable drawableB = b();
        drawableB.setAlpha(i());
        int i = this.C;
        int i2 = this.D;
        drawableB.setBounds(i, i2, this.f8338l + i, this.m + i2);
        b().draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Switch.class.getName();
    }

    public int getBarColor() {
        return this.L;
    }

    public float getCircleScale() {
        return this.J;
    }

    public float getCircleScaleX() {
        return this.I;
    }

    public int getCircleTranslation() {
        return this.G;
    }

    public float getInnerCircleAlpha() {
        return this.K;
    }

    public float getLoadingAlpha() {
        return this.N;
    }

    public float getLoadingRotation() {
        return this.O;
    }

    public float getLoadingScale() {
        return this.M;
    }

    public final void h(Canvas canvas) {
        if (this.P) {
            int width = (getWidth() - this.p) / 2;
            int width2 = (getWidth() + this.p) / 2;
            int height = (getHeight() - this.p) / 2;
            int height2 = (getHeight() + this.p) / 2;
            int width3 = getWidth() / 2;
            int height3 = getHeight() / 2;
            canvas.save();
            canvas.rotate(this.O, width3, height3);
            this.g0.setBounds(width, height, width2, height2);
            this.g0.draw(canvas);
            canvas.restore();
        }
    }

    public final int i() {
        return (int) ((isEnabled() ? 1.0f : 0.5f) * 255.0f);
    }

    public final void j() {
        l();
        m();
        n();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        AnimatorSet animatorSet = this.h0;
        if (animatorSet == null || !animatorSet.isStarted()) {
            return;
        }
        this.h0.end();
    }

    public final void k() {
        this.V = new Paint(1);
        this.W = new Paint(1);
        this.a0 = new Paint(1);
    }

    public final void l() {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.i0 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "circleScale", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(interpolatorCreate);
        objectAnimatorOfFloat.setDuration(433L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "loadingScale", 0.5f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(interpolatorCreate);
        objectAnimatorOfFloat2.setDuration(550L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "loadingAlpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setInterpolator(interpolatorCreate);
        objectAnimatorOfFloat3.setDuration(550L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "loadingRotation", 0.0f, 360.0f);
        objectAnimatorOfFloat4.setRepeatCount(-1);
        objectAnimatorOfFloat4.setDuration(800L);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        this.i0.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat4);
    }

    public final void m() {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.j0 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "loadingAlpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(interpolatorCreate);
        objectAnimatorOfFloat.setDuration(100L);
        this.j0.play(objectAnimatorOfFloat);
    }

    public final void n() {
        this.k0 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "loadingRotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.k0.play(objectAnimatorOfFloat);
    }

    public boolean o() {
        return this.P;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
        this.S = true;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S = false;
        this.R = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.U) {
            g(canvas);
            h(canvas);
            return;
        }
        u();
        t();
        c(canvas);
        e(canvas);
        f(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.Q) {
            accessibilityNodeInfo.setText(isChecked() ? this.i : this.f8337j);
        } else {
            accessibilityNodeInfo.setCheckable(false);
            accessibilityNodeInfo.setText(isChecked() ? this.i : this.f8337j);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.R = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f8338l + (this.C * 2), this.m + (this.D * 2));
        if (this.p0) {
            return;
        }
        this.p0 = true;
        if (p()) {
            this.G = isChecked() ? 0 : this.H;
        } else {
            this.G = isChecked() ? this.H : 0;
        }
        this.K = isChecked() ? 0.0f : 1.0f;
        this.L = isChecked() ? this.f8339n : this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.o0 = true;
            this.T = true;
        }
        if (this.Q && motionEvent.getAction() == 1 && isEnabled()) {
            v();
            return false;
        }
        if (this.P) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean p() {
        return getLayoutDirection() == 1;
    }

    public boolean q() {
        return this.T;
    }

    public final void r() {
        if (q()) {
            performHapticFeedback(302);
            setTactileFeedbackEnabled(false);
        }
    }

    public final void s(boolean z) {
        this.l0.d(getContext(), z ? this.m0 : this.n0, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void setBarCheckedColor(int i) {
        this.f8339n = i;
        setBarColor(isChecked() ? this.f8339n : this.o);
    }

    public void setBarCheckedDisabledColor(int i) {
        this.w = i;
    }

    public void setBarColor(int i) {
        this.L = i;
        invalidate();
    }

    public void setBarHeight(int i) {
        this.m = i;
    }

    public void setBarUnCheckedColor(int i) {
        this.o = i;
        setBarColor(isChecked() ? this.f8339n : this.o);
    }

    public void setBarUncheckedDisabledColor(int i) {
        this.v = i;
    }

    public void setBarWidth(int i) {
        this.f8338l = i;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (z == isChecked()) {
            return;
        }
        super.setChecked(z);
        if (!this.U) {
            z = isChecked();
            AnimatorSet animatorSet = this.h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.h0.end();
            }
            if (this.R && this.S) {
                a(z);
            } else {
                if (p()) {
                    setCircleTranslation(z ? 0 : this.H);
                } else {
                    setCircleTranslation(z ? this.H : 0);
                }
                setInnerCircleAlpha(z ? 0.0f : 1.0f);
                setBarColor(z ? this.f8339n : this.o);
            }
        }
        if (this.o0) {
            s(z);
            this.o0 = false;
        }
        r();
        invalidate();
    }

    public void setCheckedDrawable(Drawable drawable) {
        this.c0 = drawable;
    }

    public void setCirclePadding(int i) {
        this.B = i;
    }

    public void setCircleScale(float f) {
        this.J = f;
        invalidate();
    }

    public void setCircleScaleX(float f) {
        this.I = f;
        invalidate();
    }

    public void setCircleTranslation(int i) {
        this.G = i;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setInnerCircleAlpha(float f) {
        this.K = f;
        invalidate();
    }

    public void setInnerCircleCheckedDisabledColor(int i) {
        this.y = i;
    }

    public void setInnerCircleColor(int i) {
        this.u = i;
    }

    public void setInnerCircleUncheckedDisabledColor(int i) {
        this.x = i;
    }

    public void setInnerCircleWidth(int i) {
        this.t = i;
    }

    public void setLoadingAlpha(float f) {
        this.N = f;
        invalidate();
    }

    public void setLoadingDrawable(Drawable drawable) {
        this.b0 = drawable;
    }

    public void setLoadingRotation(float f) {
        this.O = f;
        invalidate();
    }

    public void setLoadingScale(float f) {
        this.M = f;
        invalidate();
    }

    public void setLoadingStyle(boolean z) {
        this.Q = z;
    }

    public void setOnLoadingStateChangedListener(a aVar) {
    }

    public void setOuterCircleCheckedDisabledColor(int i) {
        this.A = i;
    }

    public void setOuterCircleColor(int i) {
        this.r = i;
    }

    public void setOuterCircleStrokeWidth(int i) {
        this.q = i;
    }

    public void setOuterCircleUncheckedDisabledColor(int i) {
        this.z = i;
    }

    public void setOuterCircleWidth(int i) {
        this.p = i;
    }

    public void setShouldPlaySound(boolean z) {
        this.o0 = z;
    }

    public void setTactileFeedbackEnabled(boolean z) {
        this.T = z;
    }

    public void setThemedLoadingCheckedBackground(Drawable drawable) {
        this.e0 = drawable;
    }

    public void setThemedLoadingDrawable(Drawable drawable) {
        this.g0 = drawable;
    }

    public void setThemedLoadingUncheckedBackground(Drawable drawable) {
        this.f0 = drawable;
    }

    public void setUncheckedDrawable(Drawable drawable) {
        this.d0 = drawable;
    }

    public final void t() {
        RectF rectF = this.E;
        float f = rectF.left;
        int i = this.q;
        this.F.set(f + i, rectF.top + i, rectF.right - i, rectF.bottom - i);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public final void u() {
        float f;
        float f2;
        float f3;
        float f4;
        if (isChecked()) {
            if (p()) {
                f = this.B + this.G + this.C;
                f2 = this.p;
                f3 = this.I;
                f4 = (f2 * f3) + f;
            } else {
                f4 = ((this.f8338l - this.B) - (this.H - this.G)) + this.C;
                f = f4 - (this.p * this.I);
            }
        } else if (p()) {
            int i = (this.f8338l - this.B) - (this.H - this.G);
            int i2 = this.C;
            float f5 = i + i2;
            float f6 = i2 + (f5 - (this.p * this.I));
            f4 = f5;
            f = f6;
        } else {
            f = this.B + this.G + this.C;
            f2 = this.p;
            f3 = this.I;
            f4 = (f2 * f3) + f;
        }
        int i3 = this.m;
        int i4 = this.p;
        float f7 = ((i3 - i4) / 2.0f) + this.D;
        this.E.set(f, f7, f4 + 1.0f, i4 + f7);
    }

    public void v() {
        if (this.P) {
            return;
        }
        AccessibilityManager accessibilityManager = this.q0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            announceForAccessibility(this.k);
        }
        this.P = true;
        if (this.U) {
            this.k0.start();
        } else {
            this.i0.start();
        }
        invalidate();
    }

    public UDeviceSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.UDeviceSwitchStyle);
    }

    public UDeviceSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = new RectF();
        this.F = new RectF();
        this.I = 1.0f;
        this.J = 1.0f;
        this.P = false;
        this.Q = false;
        this.h0 = new AnimatorSet();
        this.p0 = false;
        setSoundEffectsEnabled(false);
        pek.a(this, false);
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.r0 = attributeSet.getStyleAttribute();
        } else {
            this.r0 = i;
        }
        this.q0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UDeviceSwitch, i, R$style.UDeviceSwitchStyle);
        this.f8338l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UDeviceSwitch_barWidth, 0);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UDeviceSwitch_barHeight, 0);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UDeviceSwitch_outerCircleStrokeWidth, 0);
        this.o = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_barUncheckedColor, 0);
        this.f8339n = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_barCheckedColor, 0);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.UDeviceSwitch_outerCircleWidth, 0);
        this.r = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_outerCircleColor, 0);
        this.s = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_outerUnCheckedCircleColor, 0);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UDeviceSwitch_innerCircleWidth, 0);
        this.u = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_innerCircleColor, 0);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UDeviceSwitch_circlePadding, 0);
        this.b0 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.UDeviceSwitch_loadingDrawable);
        this.v = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_barUncheckedDisabledColor, 0);
        this.w = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_barCheckedDisabledColor, 0);
        this.x = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_innerCircleUncheckedDisabledColor, 0);
        this.y = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_innerCircleCheckedDisabledColor, 0);
        this.z = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_outerCircleUncheckedDisabledColor, 0);
        this.A = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitch_outerCircleCheckedDisabledColor, 0);
        this.c0 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.UDeviceSwitch_themedCheckedDrawable);
        this.d0 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.UDeviceSwitch_themedUncheckedDrawable);
        this.e0 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.UDeviceSwitch_themedLoadingCheckedBackground);
        this.f0 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.UDeviceSwitch_themedLoadingUncheckedBackground);
        this.g0 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.UDeviceSwitch_themedLoadingDrawable);
        this.H = (this.f8338l - (this.B * 2)) - this.p;
        typedArrayObtainStyledAttributes.recycle();
        this.C = getContext().getResources().getDimensionPixelSize(R$dimen.udevice_coui_switch_padding);
        this.D = getContext().getResources().getDimensionPixelSize(R$dimen.udevice_coui_switch_padding_vertical);
        this.U = false;
        k();
        j();
        rek rekVarA = rek.a();
        this.l0 = rekVarA;
        this.m0 = rekVarA.c(context, R$raw.udevice_switch_sound_off);
        this.n0 = this.l0.c(context, R$raw.udevice_switch_sound_on);
        this.i = getResources().getString(R$string.switch_on);
        this.f8337j = getResources().getString(R$string.switch_off);
        this.k = getResources().getString(R$string.switch_loading);
    }
}
