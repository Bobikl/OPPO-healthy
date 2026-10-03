package com.coui.appcompat.seekbar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.RequiresApi;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.oplus.aiunit.vision.im2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.wvk;
import com.oplus.graphics.OplusCanvas;
import com.oplus.graphics.OplusPathAdapter;
import com.oplus.os.LinearmotorVibrator;
import com.support.seekbar.R$attr;
import com.support.seekbar.R$color;
import com.support.seekbar.R$dimen;
import com.support.seekbar.R$style;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 22)
public class COUISectionSeekBar extends COUISeekBar {
    public ValueAnimator A1;
    public int B1;
    public float D1;
    public int E1;
    public float F1;
    public float G1;
    public ColorStateList H1;
    public ColorStateList I1;
    public int J1;
    public int K1;
    public com.coui.appcompat.animation.dynamicanimation.b L1;
    public FloatPropertyCompat<COUISectionSeekBar> M1;
    public final PorterDuffXfermode t1;
    public float u1;
    public float v1;
    public boolean w1;
    public float x1;
    public float y1;
    public boolean z1;

    public class a extends FloatPropertyCompat<COUISectionSeekBar> {
        public a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(COUISectionSeekBar cOUISectionSeekBar) {
            return cOUISectionSeekBar.getScale();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(COUISectionSeekBar cOUISectionSeekBar, float f) {
            cOUISectionSeekBar.setScale(f);
        }
    }

    public class b implements COUIDynamicAnimation.q {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
        public void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
            COUISectionSeekBar.this.U0(this.a, this.b);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUISectionSeekBar.this.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            COUISectionSeekBar cOUISectionSeekBar = COUISectionSeekBar.this;
            cOUISectionSeekBar.x1 = cOUISectionSeekBar.v1 + (COUISectionSeekBar.this.D1 * 0.4f) + (COUISectionSeekBar.this.y1 * 0.6f);
            COUISectionSeekBar.this.invalidate();
            COUISectionSeekBar.this.q1();
        }
    }

    public class d implements Animator.AnimatorListener {
        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (COUISectionSeekBar.this.w1) {
                COUISectionSeekBar.this.z0(true);
                COUISectionSeekBar.this.w1 = false;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (COUISectionSeekBar.this.w1) {
                COUISectionSeekBar.this.z0(true);
                COUISectionSeekBar.this.w1 = false;
            }
            if (COUISectionSeekBar.this.z1) {
                COUISectionSeekBar.this.z1 = false;
                COUISectionSeekBar cOUISectionSeekBar = COUISectionSeekBar.this;
                cOUISectionSeekBar.A1(cOUISectionSeekBar.o0, true);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public COUISectionSeekBar(Context context) {
        this(context, null);
    }

    private void H(Canvas canvas) {
        if (this.r0) {
            int iB = this.x0.b();
            if (iB == 0) {
                this.p0.setColor(this.A);
                if (this.J == 0.0f) {
                    RectF rectF = this.l0;
                    float f = this.I;
                    canvas.drawRoundRect(rectF, f / 2.0f, f / 2.0f, this.p0);
                    return;
                } else {
                    OplusCanvas oplusCanvas = new OplusCanvas(canvas);
                    RectF rectF2 = this.l0;
                    float f2 = this.I;
                    oplusCanvas.drawSmoothRoundRect(rectF2, f2 / 2.0f, f2 / 2.0f, this.p0, this.J);
                    return;
                }
            }
            if (iB != 1) {
                this.p0.setColor(this.A);
                RectF rectF3 = this.l0;
                float f3 = this.I;
                canvas.drawRoundRect(rectF3, f3 / 2.0f, f3 / 2.0f, this.p0);
                return;
            }
            this.v0.reset();
            canvas.save();
            OplusPathAdapter oplusPathAdapterA = this.x0.a();
            RectF rectF4 = this.l0;
            float f4 = this.I;
            oplusPathAdapterA.addSmoothRoundRect(rectF4, f4 / 2.0f, f4 / 2.0f, Path.Direction.CCW);
            canvas.clipPath(this.v0);
            canvas.drawColor(this.A);
            canvas.restore();
        }
    }

    private float getMoveSectionWidth() {
        return getSeekBarMoveWidth() / this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getScale() {
        return this.k * 1000.0f;
    }

    private float getSectionWidth() {
        return getSeekBarNormalWidth() / this.u;
    }

    private int getSeekBarMoveWidth() {
        return (int) (((getWidth() - getStart()) - getEnd()) - (this.R * 2.0f));
    }

    private int getSeekBarNormalWidth() {
        return (int) (((getWidth() - getStart()) - getEnd()) - (this.R * 2.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(float f) {
        this.k = f / 1000.0f;
        w();
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public boolean A0() {
        if (this.o == null) {
            LinearmotorVibrator linearmotorVibratorE = wvk.e(getContext());
            this.o = linearmotorVibratorE;
            this.f2047n = linearmotorVibratorE != null;
        }
        Object obj = this.o;
        if (obj == null) {
            return false;
        }
        wvk.j((LinearmotorVibrator) obj, 0, this.r, this.u, 200, 2000);
        return true;
    }

    public final void A1(float f, boolean z) {
        float fX1 = x1(this.r);
        float fV0 = V0(f, fX1);
        float sectionWidth = getSectionWidth();
        int iRound = this.w ? (int) (fV0 / sectionWidth) : Math.round(fV0 / sectionWidth);
        ValueAnimator valueAnimator = this.A1;
        if (valueAnimator != null && valueAnimator.isRunning() && Float.compare(this.u1, (iRound * sectionWidth) + fX1) == 0) {
            return;
        }
        float f2 = iRound * sectionWidth;
        this.y1 = f2;
        float f3 = this.x1 - fX1;
        this.w1 = true;
        B1(fX1, f2 + fX1, f3, z);
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public void B0() {
        if (this.f2046l) {
            if ((this.f2047n && this.m && A0()) || performHapticFeedback(308)) {
                return;
            }
            performHapticFeedback(302);
        }
    }

    public final void B1(float f, float f2, float f3, boolean z) {
        ValueAnimator valueAnimator;
        if (Float.compare(this.x1, f2) == 0 || ((valueAnimator = this.A1) != null && valueAnimator.isRunning() && Float.compare(this.u1, f2) == 0)) {
            if (this.w1) {
                z0(true);
                this.w1 = false;
                return;
            }
            return;
        }
        this.u1 = f2;
        this.v1 = f;
        if (!z) {
            this.x1 = (f2 + f) - f;
            q1();
            this.w1 = false;
            return;
        }
        if (this.A1 == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.A1 = valueAnimator2;
            valueAnimator2.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 0.25f, 1.0f));
            this.A1.addUpdateListener(new c());
            this.A1.addListener(new d());
        }
        this.A1.cancel();
        this.A1.setDuration(100L);
        this.A1.setFloatValues(f3, f2 - f);
        this.A1.start();
    }

    public final void C1(MotionEvent motionEvent, float f) {
        M0(r0() ? (((getWidth() - motionEvent.getX()) - getEnd()) - this.R) / getSeekBarWidth() : ((motionEvent.getX() - getStart()) - this.R) / getSeekBarWidth(), false);
        M();
        float fV0 = V0(f, this.F1);
        float f2 = fV0 < 0.0f ? fV0 - 0.1f : fV0 + 0.1f;
        float moveSectionWidth = getMoveSectionWidth();
        int iFloatValue = (int) new BigDecimal(Float.toString(f2)).divide(new BigDecimal(Float.toString(moveSectionWidth)), RoundingMode.FLOOR).floatValue();
        float f3 = iFloatValue * moveSectionWidth;
        if (r0()) {
            iFloatValue = -iFloatValue;
        }
        this.y1 = f2;
        if (Math.abs((this.E1 + iFloatValue) - this.r) > 0) {
            float f4 = this.F1;
            B1(f4, f3 + f4, this.D1, true);
        } else {
            this.x1 = this.F1 + f3 + ((this.y1 - f3) * 0.6f);
            invalidate();
        }
        this.o0 = f;
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public void E(Canvas canvas, float f) {
        int seekBarCenterY = getSeekBarCenterY();
        float f2 = this.g0 - this.i0;
        this.N = getStart() + this.R + Math.min(this.x1, getSeekBarWidth()) + (r0() ? -f2 : f2);
        this.q0 = this.x1;
        H(canvas);
        F(canvas);
        t1(canvas, seekBarCenterY, f2);
        u1(canvas, seekBarCenterY);
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public void K0(int i, boolean z, boolean z2) {
        if (this.r != Math.max(0, Math.min(i, this.u))) {
            if (z) {
                z(i, false, z2);
                r1();
                R0(i, z2, false);
            } else {
                z(i, false, z2);
                if (getWidth() != 0) {
                    r1();
                    this.u1 = this.x1;
                    invalidate();
                }
            }
        }
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public void L0() {
        float seekBarWidth = getSeekBarWidth();
        int seekBarCenterY = getSeekBarCenterY();
        if (r0()) {
            float start = getStart() + this.R + seekBarWidth;
            float start2 = getStart() + this.R + this.x1;
            RectF rectF = this.l0;
            float f = start2 - this.g0;
            float f2 = this.i0;
            float f3 = seekBarCenterY;
            float f4 = this.I;
            float f5 = this.h0;
            rectF.set(f + f2, (f3 - (f4 / 2.0f)) + f5, (start - this.f0) + f2, (f3 + (f4 / 2.0f)) - f5);
        } else {
            float start3 = getStart() + this.R;
            float f6 = this.x1 + start3;
            RectF rectF2 = this.l0;
            float f7 = this.i0;
            float f8 = (start3 - f7) + this.f0;
            float f9 = seekBarCenterY;
            float f10 = this.I;
            float f11 = this.h0;
            rectF2.set(f8, (f9 - (f10 / 2.0f)) + f11, (f6 + this.g0) - f7, (f9 + (f10 / 2.0f)) - f11);
        }
        RectF rectF3 = this.l0;
        float f12 = rectF3.left;
        float f13 = this.I;
        rectF3.left = f12 - (f13 / 2.0f);
        rectF3.right += f13 / 2.0f;
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public void R0(int i, boolean z, boolean z2) {
        b bVar = new b(z, z2);
        int i2 = (int) this.q0;
        int i3 = (int) this.x1;
        this.i1.c();
        COUIDynamicAnimation.q qVar = this.j1;
        if (qVar != null) {
            this.i1.removeEndListener(qVar);
        }
        this.i1.a(bVar);
        this.i1.r(i2);
        Q0(z, z2);
        this.i1.x(i3);
        this.j1 = bVar;
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public void Y() {
        super.Y();
        this.z1 = false;
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public void Z(MotionEvent motionEvent) {
        float fY1 = y1(motionEvent);
        this.q = fY1;
        this.o0 = fY1;
        this.d0 = false;
        L(motionEvent);
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public void a0(MotionEvent motionEvent) {
        F0();
        s1(motionEvent);
        float fY1 = y1(motionEvent);
        int i = -1;
        if (this.w) {
            float f = this.o0;
            if (fY1 - f > 0.0f) {
                i = 1;
            } else if (fY1 - f >= 0.0f) {
                i = 0;
            }
            if (i == (-this.B1)) {
                this.B1 = i;
                int i2 = this.E1;
                int i3 = this.r;
                if (i2 != i3) {
                    this.E1 = i3;
                    this.F1 = v1(i3);
                    this.D1 = 0.0f;
                }
                ValueAnimator valueAnimator = this.A1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            C1(motionEvent, fY1);
        } else {
            if (!t0(motionEvent)) {
                return;
            }
            if (Math.abs(motionEvent.getX() - ((this.q + getStart()) + this.R)) > this.p) {
                this.i1.c();
                this.L1.c();
                N0();
                W0();
                int iW1 = w1(this.q);
                this.E1 = iW1;
                y(iW1);
                float fV1 = v1(this.E1);
                this.F1 = fV1;
                this.D1 = 0.0f;
                this.x1 = fV1;
                invalidate();
                C1(motionEvent, fY1);
                this.B1 = fY1 - this.q > 0.0f ? 1 : -1;
            }
        }
        this.o0 = fY1;
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public void b0(MotionEvent motionEvent) {
        E0();
        float fY1 = y1(motionEvent);
        if (!this.w) {
            if (isEnabled() && X0(motionEvent, this)) {
                A1(fY1, false);
                s(fY1);
                D0();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.A1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.z1 = true;
        }
        float f = this.k;
        if (f < 0.0f) {
            this.L1.r(f * 1000.0f);
            this.L1.x(0.0f);
            z0(true);
        } else if (f > 1.0f) {
            this.L1.r(f * 1000.0f);
            this.L1.x(1000.0f);
            z0(true);
        } else if (!this.z1) {
            A1(fY1, true);
        }
        z0(false);
        setPressed(false);
        D0();
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar, android.view.View
    public void draw(Canvas canvas) {
        if (this.x1 == -1.0f) {
            r1();
        }
        super.draw(canvas);
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.x1 = -1.0f;
    }

    public final void q1() {
        int iCeil = this.r;
        float f = this.u1;
        float f2 = this.v1;
        boolean z = true;
        if (f - f2 > 0.0f) {
            iCeil = Math.round(this.x1 / (this.w ? getMoveSectionWidth() : getSectionWidth()));
        } else if (f - f2 < 0.0f) {
            iCeil = (int) Math.ceil(((int) this.x1) / (this.w ? getMoveSectionWidth() : getSectionWidth()));
        } else {
            z = false;
        }
        if (r0() && z) {
            iCeil = this.u - iCeil;
        }
        y(iCeil);
    }

    public final void r1() {
        int seekBarWidth = getSeekBarWidth();
        this.x1 = ((this.r * seekBarWidth) * 1.0f) / this.u;
        if (r0()) {
            this.x1 = seekBarWidth - this.x1;
        }
    }

    public final void s1(MotionEvent motionEvent) {
        float x = (motionEvent.getX() - getStart()) - this.R;
        if (x <= 0.0f || x >= getSeekBarWidth()) {
            return;
        }
        G0();
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.K1 = Q(this, this.I1, lh2.h(getContext(), R$color.coui_seekbar_inactive_mark_selector));
        this.J1 = Q(this, this.H1, lh2.h(getContext(), R$color.coui_seekbar_active_mark_selector));
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar
    public void setMax(int i) {
        if (i < getMin()) {
            i = getMin();
        }
        if (i != this.u) {
            setLocalMax(i);
            if (this.r > i) {
                setProgress(i);
            }
            r1();
        }
        invalidate();
    }

    public final void t1(Canvas canvas, int i, float f) {
        float width = (getWidth() - getEnd()) - this.R;
        float f2 = this.N;
        float f3 = this.M;
        float f4 = f2 - f3;
        float f5 = f2 + f3;
        int iSaveLayer = canvas.saveLayer(null, null, 31);
        this.p0.setXfermode(this.t1);
        int i2 = (!this.r0 || r0()) ? this.K1 : this.J1;
        this.p0.setColor(i2);
        float start = getStart() + this.R;
        float f6 = width - start;
        int i3 = 0;
        boolean z = false;
        while (true) {
            int i4 = this.u;
            if (i3 > i4) {
                this.p0.setXfermode(null);
                canvas.restoreToCount(iSaveLayer);
                return;
            }
            if (this.r0 && !z && ((i3 * f6) / i4) + start > getStart() + this.R + this.x1) {
                this.p0.setColor(r0() ? this.J1 : this.K1);
                z = true;
            }
            float f7 = ((i3 * f6) / this.u) + start + (r0() ? -f : f);
            float f8 = this.G1;
            float f9 = f7 + f8;
            if (f4 > f7 - f8 || f5 < f9) {
                canvas.drawCircle(f7, i, f8, this.p0);
            }
            i3++;
        }
    }

    public final void u1(Canvas canvas, int i) {
        if (this.s0) {
            if (this.P0 > 0 && isEnabled()) {
                this.p0.setStyle(Paint.Style.FILL);
                this.p0.setShadowLayer(this.P0, 0.0f, this.Q, this.O0);
            }
            this.p0.setColor(this.C);
            canvas.drawCircle(this.N, i, this.M, this.p0);
            if (this.P0 <= 0 || !isEnabled()) {
                return;
            }
            this.p0.clearShadowLayer();
        }
    }

    public final float v1(int i) {
        int seekBarMoveWidth = getSeekBarMoveWidth();
        float f = (i * seekBarMoveWidth) / this.u;
        float f2 = seekBarMoveWidth;
        float fMax = Math.max(0.0f, Math.min(f, f2));
        return r0() ? f2 - fMax : fMax;
    }

    public final int w1(float f) {
        int seekBarWidth = getSeekBarWidth();
        if (r0()) {
            f = seekBarWidth - f;
        }
        return Math.max(0, Math.min(Math.round((f * this.u) / seekBarWidth), this.u));
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBar
    public void x0(float f) {
        this.x1 = (int) f;
        invalidate();
    }

    public final float x1(int i) {
        int seekBarNormalWidth = getSeekBarNormalWidth();
        float f = (i * seekBarNormalWidth) / this.u;
        float f2 = seekBarNormalWidth;
        float fMax = Math.max(0.0f, Math.min(f, f2));
        return r0() ? f2 - fMax : fMax;
    }

    public final float y1(MotionEvent motionEvent) {
        return Math.min(Math.max(0.0f, (motionEvent.getX() - getStart()) - this.R), getSeekBarWidth());
    }

    public final void z1() {
        if (this.L1 != null) {
            return;
        }
        this.L1 = new com.coui.appcompat.animation.dynamicanimation.b(this, this.M1);
        com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
        cVar.i(0.0f);
        cVar.l(0.35f);
        this.L1.E(cVar);
    }

    public COUISectionSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiSectionSeekBarStyle);
    }

    public COUISectionSeekBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.COUISectionSeekBar);
    }

    public COUISectionSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.t1 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        this.w1 = false;
        this.x1 = -1.0f;
        this.z1 = false;
        this.E1 = -1;
        this.F1 = 0.0f;
        this.M1 = new a("deformedReleaseTransition");
        this.G1 = getResources().getDimensionPixelSize(R$dimen.coui_section_seekbar_tick_mark_radius);
        Context context2 = getContext();
        int i3 = R$color.coui_seekbar_inactive_mark_selector;
        this.I1 = im2.a(lh2.h(context2, i3), lh2.h(getContext(), R$color.coui_seekbar_inactive_mark_disable_color));
        Context context3 = getContext();
        int i4 = R$color.coui_seekbar_active_mark_selector;
        this.H1 = im2.a(lh2.h(context3, i4), lh2.h(getContext(), R$color.coui_seekbar_active_mark_disable_color));
        this.K1 = Q(this, this.I1, lh2.h(getContext(), i3));
        this.J1 = Q(this, this.H1, lh2.h(getContext(), i4));
        z1();
    }
}
