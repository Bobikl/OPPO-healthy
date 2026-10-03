package com.coui.appcompat.progressbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.graphics.ColorUtils;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.gg2;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.vm2;
import com.oplus.aiunit.vision.xl2;
import com.oplus.graphics.OplusPathAdapter;
import com.support.appcompat.R$attr;
import com.support.progressbar.R$color;
import com.support.progressbar.R$dimen;
import com.support.progressbar.R$drawable;
import com.support.progressbar.R$string;
import com.support.progressbar.R$style;
import com.support.progressbar.R$styleable;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUIInstallLoadProgress extends COUILoadProgress {
    public static final int LOAD_STYLE_BIG_ROUND = 1;
    public static final int LOAD_STYLE_CIRCLE = 2;
    public static final int LOAD_STYLE_DEFAULT = 0;
    public static final int[] S0 = {R$attr.couiColorPrimary, R$attr.couiColorSecondary};
    public Locale A0;
    public int B0;
    public int C0;
    public int D0;
    public final String E;
    public int E0;
    public final boolean F;
    public float F0;
    public TextPaint G;
    public boolean G0;
    public String H;
    public int H0;
    public int I;
    public float[] I0;
    public int J;
    public ValueAnimator J0;
    public ColorStateList K;
    public ValueAnimator K0;
    public int L;
    public Interpolator L0;
    public String M;
    public Interpolator M0;
    public Paint.FontMetricsInt N;
    public int N0;
    public int O;
    public Context O0;
    public Paint P;
    public boolean P0;
    public int Q;
    public String Q0;
    public boolean R;
    public OplusPathAdapter R0;
    public Path S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int a0;
    public Bitmap b0;
    public Bitmap c0;
    public Bitmap d0;
    public Paint e0;
    public Paint f0;
    public Paint g0;
    public Drawable h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public ColorStateList o0;
    public int p0;
    public ColorStateList q0;
    public int r0;
    public boolean s0;
    public int t0;
    public ColorStateList u0;
    public int v0;
    public int w0;
    public float x0;
    public float y0;
    public float z0;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setPath(COUIInstallLoadProgress.this.S);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIInstallLoadProgress.this.y0 = ((Float) valueAnimator.getAnimatedValue("brightnessHolder")).floatValue();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue("narrowHolderX")).floatValue();
            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue("narrowHolderY")).floatValue();
            float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue("narrowHolderFont")).floatValue();
            if (fFloatValue < COUIInstallLoadProgress.this.getMeasuredWidth() * 0.005f && fFloatValue2 < COUIInstallLoadProgress.this.getMeasuredHeight() * 0.005f) {
                fFloatValue = COUIInstallLoadProgress.this.getMeasuredWidth() * 0.005f;
                fFloatValue2 = COUIInstallLoadProgress.this.getMeasuredHeight() * 0.005f;
            }
            COUIInstallLoadProgress.this.E0 = (int) (((double) fFloatValue) + 0.5d);
            COUIInstallLoadProgress.this.D0 = (int) (((double) fFloatValue2) + 0.5d);
            COUIInstallLoadProgress.this.F0 = fFloatValue3;
            COUIInstallLoadProgress.this.v();
            COUIInstallLoadProgress.this.invalidate();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIInstallLoadProgress.this.V = ((Float) valueAnimator.getAnimatedValue("circleRadiusHolder")).floatValue();
            COUIInstallLoadProgress.this.y0 = ((Float) valueAnimator.getAnimatedValue("circleBrightnessHolder")).floatValue();
            COUIInstallLoadProgress.this.invalidate();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIInstallLoadProgress.this.y0 = ((Float) valueAnimator.getAnimatedValue("brightnessHolder")).floatValue();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue("narrowHolderX")).floatValue();
            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue("narrowHolderY")).floatValue();
            COUIInstallLoadProgress.this.F0 = ((Float) valueAnimator.getAnimatedValue("narrowHolderFont")).floatValue();
            COUIInstallLoadProgress.this.E0 = (int) (((double) fFloatValue) + 0.5d);
            COUIInstallLoadProgress.this.D0 = (int) (((double) fFloatValue2) + 0.5d);
            COUIInstallLoadProgress.this.v();
            COUIInstallLoadProgress.this.invalidate();
        }
    }

    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean i;

        public e(boolean z) {
            this.i = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.i) {
                COUIInstallLoadProgress.super.performClick();
            }
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUIInstallLoadProgress.this.V = ((Float) valueAnimator.getAnimatedValue("circleRadiusHolder")).floatValue();
            COUIInstallLoadProgress.this.y0 = ((Float) valueAnimator.getAnimatedValue("circleBrightnessHolder")).floatValue();
            COUIInstallLoadProgress.this.W = ((Integer) valueAnimator.getAnimatedValue("circleInAlphaHolder")).intValue();
            COUIInstallLoadProgress.this.a0 = ((Integer) valueAnimator.getAnimatedValue("circleOutAlphaHolder")).intValue();
            COUIInstallLoadProgress.this.invalidate();
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            COUIInstallLoadProgress.super.performClick();
        }
    }

    public COUIInstallLoadProgress(Context context) {
        this(context, null);
    }

    private void init() {
        if (this.l0 == 2) {
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        this.G = textPaint;
        textPaint.setAntiAlias(true);
        int i = this.J;
        if (i == 0) {
            i = this.I;
        }
        int i2 = this.B0;
        this.C0 = i2;
        if (i2 == -1) {
            this.C0 = this.K.getColorForState(getDrawableState(), lh2.b(getContext(), R$attr.couiDefaultTextColor, 0));
        }
        this.G.setTextSize(i);
        gg2.a(this.G, true);
        this.N = this.G.getFontMetricsInt();
        o();
    }

    public static boolean q(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.toString(str.charAt(i2)).matches("^[一-龥]{1}$")) {
                i++;
            }
        }
        return i > 0;
    }

    public final int dip2px(Context context, float f2) {
        return (int) (((double) (f2 * context.getResources().getDisplayMetrics().density)) + 0.5d);
    }

    @Override // com.coui.appcompat.progressbar.COUILoadProgress, androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    public final Bitmap getBitmapFromVectorDrawable(int i) {
        Drawable drawable = getContext().getDrawable(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final int getCurrentColor(int i) {
        if (!isEnabled()) {
            return this.H0;
        }
        ColorUtils.colorToHSL(i, this.I0);
        float[] fArr = this.I0;
        fArr[2] = fArr[2] * this.y0;
        int iHSLToColor = ColorUtils.HSLToColor(fArr);
        int iRed = Color.red(iHSLToColor);
        int iGreen = Color.green(iHSLToColor);
        int iBlue = Color.blue(iHSLToColor);
        int iAlpha = Color.alpha(i);
        if (iRed > 255) {
            iRed = 255;
        }
        if (iGreen > 255) {
            iGreen = 255;
        }
        if (iBlue > 255) {
            iBlue = 255;
        }
        return Color.argb(iAlpha, iRed, iGreen, iBlue);
    }

    public final int getDefaultSize(int i, float f2, boolean z) {
        return i - (z ? dip2px(getContext(), f2) : dip2px(getContext(), f2) * 2);
    }

    public final String getDisplayText(String str, int i) {
        int iBreakText = this.G.breakText(str, true, i, null);
        return (iBreakText == 0 || iBreakText == str.length()) ? str : str.substring(0, iBreakText - 1);
    }

    public final String isEnglish(String str) {
        int iLastIndexOf;
        return (q(str) || (iLastIndexOf = str.lastIndexOf(32)) <= 0) ? str : str.substring(0, iLastIndexOf);
    }

    public final boolean isZhLanguage(Locale locale) {
        return "zh".equalsIgnoreCase(locale.getLanguage());
    }

    public final void o() {
        String displayText = getDisplayText(this.H, this.j0);
        if (displayText.length() <= 0 || displayText.length() >= this.H.length()) {
            return;
        }
        this.H = isEnglish(getDisplayText(displayText, (this.j0 - (this.L * 2)) - ((int) this.G.measureText(this.M)))) + this.M;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l0 == 2) {
            Bitmap bitmap = this.b0;
            if (bitmap == null || bitmap.isRecycled()) {
                Bitmap bitmapFromVectorDrawable = getBitmapFromVectorDrawable(R$drawable.coui_install_load_progress_circle_load);
                this.b0 = bitmapFromVectorDrawable;
                this.b0 = vm2.a(bitmapFromVectorDrawable, this.o0 == null ? this.m0 : this.p0);
            }
            Bitmap bitmap2 = this.c0;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                this.c0 = getBitmapFromVectorDrawable(R$drawable.coui_install_load_progress_circle_reload);
            }
            Bitmap bitmap3 = this.d0;
            if (bitmap3 == null || bitmap3.isRecycled()) {
                this.d0 = getBitmapFromVectorDrawable(R$drawable.coui_install_load_progress_circle_pause);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Locale locale = Locale.getDefault();
        if (this.l0 != 0 || this.A0.getLanguage().equalsIgnoreCase(locale.getLanguage())) {
            return;
        }
        this.A0 = locale;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_install_download_progress_width_in_foreign_language);
        if (isZhLanguage(this.A0)) {
            this.i0 -= dimensionPixelSize;
            this.j0 -= dimensionPixelSize;
        } else {
            this.i0 += dimensionPixelSize;
            this.j0 += dimensionPixelSize;
        }
        invalidate();
    }

    @Override // com.coui.appcompat.progressbar.COUILoadProgress, android.view.View
    public void onDetachedFromWindow() {
        if (this.l0 == 2) {
            Bitmap bitmap = this.b0;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.b0.recycle();
            }
            Bitmap bitmap2 = this.d0;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.d0.recycle();
            }
            Bitmap bitmap3 = this.c0;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                this.c0.recycle();
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // com.coui.appcompat.progressbar.COUILoadProgress, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        float f2;
        int i;
        int i2;
        super.onDraw(canvas);
        float f3 = this.E0;
        float f4 = this.D0;
        float width = getWidth() - this.E0;
        float height = getHeight() - this.D0;
        int i3 = this.m;
        if (i3 == 3) {
            if (this.l0 == 2) {
                onDrawCircle(canvas, (float) ((((double) this.i0) * 1.0d) / 2.0d), (float) ((((double) this.k0) * 1.0d) / 2.0d), true, this.c0, this.d0);
                return;
            }
            t(canvas, f3, f4, width, height, true, 0.0f, 0.0f);
            this.G.setColor(this.s0 ? this.t0 : this.w0);
            this.R = false;
            if (this.s == null) {
                onDrawText(canvas, f3, f4, this.i0, this.k0);
                return;
            } else {
                s(canvas, f3, f4, this.i0, this.k0);
                return;
            }
        }
        int i4 = 1;
        if (i3 == 0) {
            int i5 = this.l0;
            if (i5 == 2) {
                onDrawCircle(canvas, (float) ((((double) this.i0) * 1.0d) / 2.0d), (float) ((((double) this.k0) * 1.0d) / 2.0d), false, this.b0, this.d0);
            } else if (i5 == 1) {
                t(canvas, f3, f4, width, height, true, 0.0f, 0.0f);
            } else {
                t(canvas, f3, f4, width, height, false, 0.0f, 0.0f);
            }
            int i6 = this.l0;
            if (i6 == i4) {
                this.G.setColor(this.s0 ? this.t0 : this.w0);
            } else if (i6 == 0) {
                this.G.setColor(this.u0 == null ? this.m0 : this.t0);
            }
        } else {
            i4 = 1;
        }
        int i7 = this.m;
        if (i7 != i4 && i7 != 2) {
            i2 = 2;
        } else if (this.l0 == 2) {
            if (i7 == i4) {
                onDrawCircle(canvas, (float) ((((double) this.i0) * 1.0d) / 2.0d), (float) ((((double) this.k0) * 1.0d) / 2.0d), true, this.d0, this.c0);
            } else if (i7 == 2) {
                onDrawCircle(canvas, (float) ((((double) this.i0) * 1.0d) / 2.0d), (float) ((((double) this.k0) * 1.0d) / 2.0d), true, this.c0, this.d0);
            }
            i2 = 2;
        } else {
            if (this.p) {
                f2 = this.q;
                i = this.o;
            } else {
                f2 = this.f1968n;
                i = this.o;
            }
            float f5 = f2 / i;
            int i8 = this.i0;
            int i9 = this.E0;
            this.Q = ((int) (f5 * (i8 - (i9 * 2)))) + i9;
            i2 = 2;
            t(canvas, f3, f4, width, height, false, 0.0f, 0.0f);
            canvas.save();
            if (ViewUtils.isLayoutRtl(this)) {
                canvas.translate(0.0f, 0.0f);
                canvas.clipRect((width - this.Q) + 0.0f, f4, width, this.k0);
                canvas.translate(-0.0f, 0.0f);
            } else {
                canvas.clipRect(f3, f4, this.Q, this.k0);
            }
            if (this.l0 != 2) {
                t(canvas, f3, f4, width, height, true, 0.0f, 0.0f);
                canvas.restore();
            }
            this.R = true;
            this.G.setColor(this.u0 == null ? this.m0 : this.t0);
        }
        if (this.l0 != i2) {
            if (this.s == null) {
                onDrawText(canvas, f3, f4, this.i0, this.k0);
            } else {
                s(canvas, f3, f4, this.i0, this.k0);
            }
        }
    }

    public final void onDrawCircle(Canvas canvas, float f2, float f3, boolean z, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.e0.setColor(this.o0 == null ? getCurrentColor(this.m0) : this.p0);
        if (!z) {
            this.e0.setColor(this.q0 == null ? getCurrentColor(this.n0) : this.r0);
        }
        int width = (this.i0 - bitmap.getWidth()) / 2;
        int height = (this.k0 - bitmap.getHeight()) / 2;
        this.f0.setAlpha(this.W);
        this.g0.setAlpha(this.a0);
        canvas.save();
        canvas.clipPath(this.S);
        canvas.drawColor(this.e0.getColor());
        float f4 = width;
        float f5 = height;
        canvas.drawBitmap(bitmap, f4, f5, this.f0);
        canvas.drawBitmap(bitmap2, f4, f5, this.g0);
        canvas.restore();
        canvas.save();
    }

    public final void onDrawText(Canvas canvas, float f2, float f3, float f4, float f5) {
        if (this.H != null) {
            this.G.setTextSize(this.I * this.F0);
            float fMeasureText = this.G.measureText(this.H);
            int i = this.L;
            float f6 = i + (((f4 - fMeasureText) - (i * 2)) / 2.0f);
            Paint.FontMetricsInt fontMetricsInt = this.N;
            float f7 = ((f5 - fontMetricsInt.descent) - fontMetricsInt.ascent) / 2.0f;
            canvas.drawText(this.H, f6, f7, this.G);
            if (this.R) {
                this.G.setColor(this.v0);
                canvas.save();
                if (ViewUtils.isLayoutRtl(this)) {
                    canvas.clipRect(f4 - this.Q, f3, f4, f5);
                } else {
                    canvas.clipRect(f2, f3, this.Q, f5);
                }
                canvas.drawText(this.H, f6, f7, this.G);
                canvas.restore();
                this.R = false;
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(this.o);
        accessibilityEvent.setCurrentItemIndex(this.f1968n);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        String str2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i = this.m;
        if ((i == 0 || i == 3 || i == 2) && (str = this.H) != null) {
            accessibilityNodeInfo.setContentDescription(str);
        } else {
            if (i != 1 || (str2 = this.Q0) == null) {
                return;
            }
            accessibilityNodeInfo.setContentDescription(str2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.i0, this.k0);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        v();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z = false;
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (x >= 0.0f && x <= this.i0 && y >= 0.0f && y <= this.k0) {
                    z = true;
                }
                performTouchEndAnim(z);
            } else if (action == 3) {
                performTouchEndAnim(false);
            }
        } else {
            u();
            performTouchStartAnim();
        }
        return true;
    }

    public final void p(ValueAnimator valueAnimator) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.cancel();
    }

    public final void performTouchEndAnim(boolean z) {
        u();
        if (this.G0) {
            p(this.J0);
            int i = this.l0;
            if (i == 0 || i == 1) {
                ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("brightnessHolder", this.y0, 1.0f), PropertyValuesHolder.ofFloat("narrowHolderX", this.E0, 0.0f), PropertyValuesHolder.ofFloat("narrowHolderY", this.D0, 0.0f), PropertyValuesHolder.ofFloat("narrowHolderFont", this.F0, 1.0f));
                this.K0 = valueAnimatorOfPropertyValuesHolder;
                valueAnimatorOfPropertyValuesHolder.setInterpolator(this.M0);
                this.K0.setDuration(340L);
                this.K0.addUpdateListener(new d());
                this.K0.addListener(new e(z));
                this.K0.start();
            } else if (i == 2) {
                ValueAnimator valueAnimatorOfPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("circleRadiusHolder", this.V, this.U), PropertyValuesHolder.ofFloat("circleBrightnessHolder", this.y0, 1.0f), PropertyValuesHolder.ofInt("circleInAlphaHolder", 0, 255), PropertyValuesHolder.ofInt("circleOutAlphaHolder", 255, 0));
                this.K0 = valueAnimatorOfPropertyValuesHolder2;
                valueAnimatorOfPropertyValuesHolder2.setInterpolator(this.M0);
                this.K0.setDuration(340L);
                this.K0.addUpdateListener(new f());
                this.K0.addListener(new g());
                this.K0.start();
            }
            this.G0 = false;
        }
    }

    public final void performTouchStartAnim() {
        if (this.G0) {
            return;
        }
        p(this.K0);
        int i = this.l0;
        if (i == 0 || i == 1) {
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("brightnessHolder", 1.0f, this.z0), PropertyValuesHolder.ofFloat("narrowHolderX", 0.0f, getMeasuredWidth() * 0.05f), PropertyValuesHolder.ofFloat("narrowHolderY", 0.0f, getMeasuredHeight() * 0.05f), PropertyValuesHolder.ofFloat("narrowHolderFont", 1.0f, 0.92f));
            this.J0 = valueAnimatorOfPropertyValuesHolder;
            valueAnimatorOfPropertyValuesHolder.setInterpolator(this.L0);
            this.J0.setDuration(200L);
            this.J0.addUpdateListener(new b());
            this.J0.start();
        } else if (i == 2) {
            ValueAnimator valueAnimatorOfPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("circleRadiusHolder", this.V, this.U * 0.9f), PropertyValuesHolder.ofFloat("circleBrightnessHolder", this.y0, this.z0));
            this.J0 = valueAnimatorOfPropertyValuesHolder2;
            valueAnimatorOfPropertyValuesHolder2.setInterpolator(this.L0);
            this.J0.setDuration(200L);
            this.J0.addUpdateListener(new c());
            this.J0.start();
        }
        this.G0 = true;
    }

    public final boolean r() {
        return byf.a() == 1;
    }

    public final void s(Canvas canvas, float f2, float f3, float f4, float f5) {
        Drawable drawable = this.s;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.s.getIntrinsicHeight();
            int i = ((int) (f4 - intrinsicWidth)) / 2;
            int i2 = ((int) (f5 - intrinsicHeight)) / 2;
            int i3 = intrinsicWidth + i;
            int i4 = intrinsicHeight + i2;
            this.s.setBounds(i, i2, i3, i4);
            this.s.setColorFilter(this.C0, PorterDuff.Mode.SRC_IN);
            this.s.draw(canvas);
            if (this.R) {
                canvas.save();
                this.t.setBounds(i, i2, i3, i4);
                this.t.setColorFilter(this.v0, PorterDuff.Mode.SRC_IN);
                if (ViewUtils.isLayoutRtl(this)) {
                    canvas.clipRect(f4 - this.Q, f3, f4, f5);
                } else {
                    canvas.clipRect(f2, f3, this.Q, f5);
                }
                this.t.draw(canvas);
                canvas.restore();
                this.R = false;
            }
        }
    }

    @Deprecated
    public void setBtnTextColor(@ColorInt int i) {
        this.t0 = i;
        this.s0 = true;
        invalidate();
    }

    public void setBtnTextColorBySurpassProgress(@ColorInt int i) {
        this.v0 = i;
        invalidate();
    }

    public void setBtnTextColorStateList(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        if (colorStateList == null) {
            setBtnTextColor(-1);
        } else {
            setBtnTextColor(colorStateList.getDefaultColor());
        }
    }

    public void setDefaultTextSize(int i) {
        this.I = i;
    }

    public void setDisabledColor(int i) {
        this.H0 = i;
    }

    public void setDownloadingContentDecrpition(String str) {
        this.Q0 = str;
    }

    public void setIsNeedVibrate(boolean z) {
        this.P0 = z;
    }

    public void setLoadStyle(int i) {
        if (i != 2) {
            this.l0 = i;
            this.P = new Paint(1);
            if (this.G != null || this.K == null) {
                return;
            }
            init();
            return;
        }
        this.l0 = 2;
        Paint paint = new Paint(1);
        this.e0 = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint(1);
        this.f0 = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint(1);
        this.g0 = paint3;
        paint3.setAntiAlias(true);
        this.b0 = getBitmapFromVectorDrawable(R$drawable.coui_install_load_progress_circle_load);
        this.c0 = getBitmapFromVectorDrawable(R$drawable.coui_install_load_progress_circle_reload);
        this.d0 = getBitmapFromVectorDrawable(R$drawable.coui_install_load_progress_circle_pause);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_install_download_progress_default_circle_radius);
        this.T = dimensionPixelSize;
        int defaultSize = getDefaultSize(dimensionPixelSize, 1.5f, true);
        this.U = defaultSize;
        this.V = defaultSize;
    }

    public void setMaxBrightness(int i) {
        this.z0 = i;
    }

    public void setText(String str) {
        if (str.equals(this.H)) {
            return;
        }
        this.H = str;
        if (this.G != null) {
            o();
        }
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        if (i != 0) {
            this.B0 = i;
        }
    }

    public void setTextId(int i) {
        setText(getResources().getString(i));
    }

    public void setTextPadding(int i) {
        this.L = i;
    }

    public void setTextSize(int i) {
        if (i != 0) {
            this.J = i;
        }
    }

    @Deprecated
    public void setThemeColor(int i) {
        this.p0 = i;
        Bitmap bitmap = this.b0;
        if (bitmap == null || bitmap.isRecycled()) {
            this.b0 = getBitmapFromVectorDrawable(R$drawable.coui_install_load_progress_circle_load);
        }
        this.b0 = vm2.a(this.b0, this.p0);
        invalidate();
    }

    public void setThemeColorStateList(ColorStateList colorStateList) {
        this.o0 = colorStateList;
        if (colorStateList == null) {
            setThemeColor(-1);
        } else {
            setThemeColor(colorStateList.getDefaultColor());
        }
    }

    @Deprecated
    public void setThemeSecondaryColor(int i) {
        this.r0 = i;
        invalidate();
    }

    public void setThemeSecondaryColorStateList(ColorStateList colorStateList) {
        this.q0 = colorStateList;
        if (colorStateList == null) {
            setThemeSecondaryColor(-1);
        } else {
            setThemeSecondaryColor(colorStateList.getDefaultColor());
        }
    }

    public void setTouchModeHeight(int i) {
        this.k0 = i;
    }

    public void setTouchModeWidth(int i) {
        this.i0 = i;
        this.j0 = getDefaultSize(i, 1.5f, false);
        if (this.G != null) {
            o();
        }
        requestLayout();
    }

    public final void t(Canvas canvas, float f2, float f3, float f4, float f5, boolean z, float f6, float f7) {
        canvas.translate(f6, f7);
        this.P.setColor(this.o0 == null ? getCurrentColor(this.m0) : this.p0);
        if (!z) {
            this.P.setColor(this.q0 == null ? getCurrentColor(this.n0) : this.r0);
        }
        canvas.drawPath(this.S, this.P);
        canvas.translate(-f6, -f7);
    }

    public final void u() {
        if (this.P0) {
            performHapticFeedback(302);
        }
    }

    public final void v() {
        if (this.l0 == 2) {
            float f2 = (float) ((((double) this.i0) * 1.0d) / 2.0d);
            float f3 = (float) ((((double) this.k0) * 1.0d) / 2.0d);
            float f4 = this.V;
            xl2.a(this.S, new RectF(f2 - f4, f3 - f4, f2 + f4, f3 + f4), this.O);
            return;
        }
        float f5 = this.E0;
        float f6 = this.D0;
        float width = getWidth() - this.E0;
        float height = getHeight() - this.D0;
        RectF rectF = new RectF(f5, f6, width, height);
        if (!r()) {
            xl2.a(this.S, rectF, ((height - f6) / 2.0f) - this.x0);
        } else {
            this.S.reset();
            this.R0.addSmoothRoundRect(rectF, (rectF.height() * getScaleY()) / 2.0f, (rectF.height() * getScaleY()) / 2.0f, Path.Direction.CCW);
            invalidateOutline();
        }
    }

    public COUIInstallLoadProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.support.progressbar.R$attr.couiInstallLoadProgressStyle);
    }

    public COUIInstallLoadProgress(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_COUI_COUILoadProgress_InstallDownload);
    }

    public COUIInstallLoadProgress(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.E = "COUIInstallLoadProgress";
        this.F = true;
        this.G = null;
        this.J = 0;
        this.L = 0;
        this.M = null;
        this.N = null;
        this.O = 0;
        this.P = null;
        this.Q = 0;
        this.R = false;
        this.S = new Path();
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = 255;
        this.a0 = 0;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.l0 = 0;
        this.s0 = false;
        this.y0 = 1.0f;
        this.B0 = -1;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 1.0f;
        this.I0 = new float[3];
        ph2.c(this, false);
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.N0 = attributeSet.getStyleAttribute();
        } else {
            this.N0 = i;
        }
        this.O0 = context;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(S0);
        this.m0 = typedArrayObtainStyledAttributes.getColor(0, 0);
        this.n0 = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.A0 = Locale.getDefault();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.COUILoadProgress, i, i2);
        Resources resources = getResources();
        int i3 = R$color.coui_install_load_progress_text_color_in_progress;
        this.w0 = resources.getColor(i3);
        this.v0 = getResources().getColor(i3);
        this.P0 = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.COUILoadProgress_loadingButtonNeedVibrate, false);
        Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(R$styleable.COUILoadProgress_couiDefaultDrawable);
        if (drawable != null) {
            setButtonDrawable(drawable);
        }
        setState(typedArrayObtainStyledAttributes2.getInteger(R$styleable.COUILoadProgress_couiState, 0));
        typedArrayObtainStyledAttributes2.recycle();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_install_download_progress_textsize);
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, R$styleable.COUIInstallLoadProgress, i, i2);
        setLoadStyle(typedArrayObtainStyledAttributes3.getInteger(R$styleable.COUIInstallLoadProgress_couiStyle, 0));
        this.h0 = typedArrayObtainStyledAttributes3.getDrawable(R$styleable.COUIInstallLoadProgress_couiInstallGiftBg);
        this.k0 = typedArrayObtainStyledAttributes3.getDimensionPixelSize(R$styleable.COUIInstallLoadProgress_couiInstallViewHeight, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(R$styleable.COUIInstallLoadProgress_couiInstallViewWidth, 0);
        this.i0 = dimensionPixelOffset;
        this.j0 = getDefaultSize(dimensionPixelOffset, 1.5f, false);
        this.z0 = typedArrayObtainStyledAttributes3.getFloat(R$styleable.COUIInstallLoadProgress_brightness, 0.8f);
        this.H0 = typedArrayObtainStyledAttributes3.getColor(R$styleable.COUIInstallLoadProgress_disabledColor, 0);
        this.L0 = new hj2();
        this.M0 = new hj2();
        int i4 = this.l0;
        if (i4 != 2) {
            if (i4 == 1) {
                this.O = getResources().getDimensionPixelSize(R$dimen.coui_install_download_progress_round_border_radius);
            } else {
                this.O = getResources().getDimensionPixelSize(R$dimen.coui_install_download_progress_round_border_radius_small);
                if (!isZhLanguage(this.A0)) {
                    int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.coui_install_download_progress_width_in_foreign_language);
                    this.i0 += dimensionPixelSize2;
                    this.j0 += dimensionPixelSize2;
                }
            }
            this.K = typedArrayObtainStyledAttributes3.getColorStateList(R$styleable.COUIInstallLoadProgress_couiInstallDefaultColor);
            this.L = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(R$styleable.COUIInstallLoadProgress_couiInstallPadding, 0);
            this.H = typedArrayObtainStyledAttributes3.getString(R$styleable.COUIInstallLoadProgress_couiInstallTextview);
            this.I = typedArrayObtainStyledAttributes3.getDimensionPixelSize(R$styleable.COUIInstallLoadProgress_couiInstallTextsize, dimensionPixelSize);
            this.I = (int) gg2.g(this.I, getResources().getConfiguration().fontScale, 2);
            if (this.M == null) {
                this.M = getResources().getString(R$string.coui_install_load_progress_apostrophe);
            }
        } else {
            this.O = getResources().getDimensionPixelSize(R$dimen.coui_install_download_progress_circle_round_border_radius);
        }
        setThemeColorStateList(typedArrayObtainStyledAttributes3.getColorStateList(R$styleable.COUIInstallLoadProgress_couiThemeColor));
        setThemeSecondaryColorStateList(typedArrayObtainStyledAttributes3.getColorStateList(R$styleable.COUIInstallLoadProgress_couiThemeColorSecondary));
        setBtnTextColorStateList(typedArrayObtainStyledAttributes3.getColorStateList(R$styleable.COUIInstallLoadProgress_couiThemeTextColor));
        typedArrayObtainStyledAttributes3.recycle();
        this.x0 = getResources().getDimension(R$dimen.coui_install_download_progress_round_border_radius_offset);
        if (r() && Build.VERSION.SDK_INT >= 30) {
            this.R0 = new OplusPathAdapter(this.S, 1);
            setOutlineProvider(new a());
            setClipToOutline(true);
        }
        init();
    }
}
