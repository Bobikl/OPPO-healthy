package com.heytap.health.base.view.processbuttonview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$styleable;
import com.heytap.health.base.task.ThreadUtils;
import com.oplus.aiunit.vision.u35;
import com.oplus.aiunit.vision.xa2;

/* JADX INFO: loaded from: classes15.dex */
public class TextProgressButton extends AppCompatTextView {
    public static final int DISABLE = 3;
    public static final int DOWNLOADING = 1;
    public static final int INSTALLING = 2;
    public static final int NORMAL = 0;
    public RectF A;
    public LinearGradient B;
    public LinearGradient C;
    public LinearGradient D;
    public AnimatorSet E;
    public ValueAnimator F;
    public CharSequence G;
    public xa2 H;
    public xa2 I;
    public int J;
    public boolean K;
    public Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile Paint f3327j;
    public Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f3328l;
    public int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f3329n;
    public int o;
    public int p;
    public int q;
    public float r;
    public float s;
    public float t;
    public int u;
    public int v;
    public float w;
    public float x;
    public float y;
    public float z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextProgressButton.this.y = fFloatValue;
            TextProgressButton.this.z = fFloatValue;
            TextProgressButton.this.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ ValueAnimator i;

        public b(ValueAnimator valueAnimator) {
            this.i = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) this.i.getAnimatedValue()).intValue();
            int iM = TextProgressButton.this.m(iIntValue);
            int iN = TextProgressButton.this.n(iIntValue);
            TextProgressButton.this.k.setColor(TextProgressButton.this.q);
            TextProgressButton.this.f3328l.setColor(TextProgressButton.this.q);
            TextProgressButton.this.k.setAlpha(iM);
            TextProgressButton.this.f3328l.setAlpha(iN);
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextProgressButton.this.k.setAlpha(0);
            TextProgressButton.this.f3328l.setAlpha(0);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextProgressButton textProgressButton = TextProgressButton.this;
            textProgressButton.s = ((textProgressButton.t - TextProgressButton.this.s) * fFloatValue) + TextProgressButton.this.s;
            TextProgressButton.this.invalidate();
        }
    }

    public TextProgressButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(String str, float f) {
        this.G = str;
        int i = this.v;
        if (f >= i && f < this.u) {
            this.t = f;
            this.F.start();
        } else if (f < i) {
            this.s = 0.0f;
        } else if (f >= this.u) {
            this.s = 100.0f;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(int i) {
        if (this.J != i) {
            this.J = i;
            invalidate();
            if (i == 2) {
                this.E.start();
                return;
            }
            if (i == 0 || i == 3) {
                this.E.cancel();
            } else if (i == 1) {
                this.E.cancel();
            }
        }
    }

    public final void A() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 20.0f);
        valueAnimatorOfFloat.setInterpolator(PathInterpolatorCompat.create(0.11f, 0.0f, 0.12f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.setDuration(1243L);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        ValueAnimator duration = ValueAnimator.ofInt(0, 1243).setDuration(1243L);
        duration.addUpdateListener(new b(duration));
        duration.addListener(new c());
        duration.setRepeatMode(1);
        duration.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.E = animatorSet;
        animatorSet.playTogether(duration, valueAnimatorOfFloat);
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
        this.F = duration2;
        duration2.addUpdateListener(new d());
    }

    public final xa2 B() {
        xa2 xa2Var = this.I;
        return xa2Var != null ? xa2Var : this.H;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || this.J == 0 || this.K) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        xa2 xa2VarB = B();
        if (xa2VarB.b()) {
            if (this.f3329n == null) {
                this.f3329n = new int[]{iArr[0], iArr[1]};
                int[] iArr = this.m;
            }
            if (isPressed()) {
                int iA = xa2VarB.a(this.m[0]);
                int iA2 = xa2VarB.a(this.m[1]);
                if (xa2VarB.d()) {
                    v(iA, iA2);
                } else {
                    v(iA, iA);
                }
            } else if (xa2VarB.d()) {
                int[] iArr2 = this.f3329n;
                v(iArr2[0], iArr2[1]);
            } else {
                int i = this.f3329n[0];
                v(i, i);
            }
            invalidate();
        }
    }

    public float getButtonRadius() {
        return this.x;
    }

    public int getMaxProgress() {
        return this.u;
    }

    public int getMinProgress() {
        return this.v;
    }

    public float getProgress() {
        return this.s;
    }

    public int getState() {
        return this.J;
    }

    public int getTextColor() {
        return this.p;
    }

    public int getTextCoverColor() {
        return this.q;
    }

    @Override // android.widget.TextView
    public float getTextSize() {
        return this.r;
    }

    public final int m(int i) {
        double d2;
        double d3;
        if (i >= 0 && i <= 160) {
            return 0;
        }
        if (160 < i && i <= 243) {
            d2 = i - 160;
            d3 = 3.072289156626506d;
        } else {
            if ((243 < i && i <= 1160) || 1160 >= i || i > 1243) {
                return 255;
            }
            d2 = i - 1243;
            d3 = -3.072289156626506d;
        }
        return (int) (d2 * d3);
    }

    public final int n(int i) {
        double d2;
        double d3;
        if (i < 0 || i > 83) {
            if (83 >= i || i > 1000) {
                if (1000 < i && i <= 1083) {
                    d2 = i - 1083;
                    d3 = -3.072289156626506d;
                } else if (1083 < i && i <= 1243) {
                    return 0;
                }
            }
            return 255;
        }
        d3 = 3.072289156626506d;
        d2 = i;
        return (int) (d2 * d3);
    }

    public final void o(Canvas canvas) {
        this.A = new RectF();
        if (this.x == 0.0f) {
            this.x = getMeasuredHeight() / 2;
        }
        RectF rectF = this.A;
        rectF.left = 2.0f;
        rectF.top = 2.0f;
        rectF.right = getMeasuredWidth() - 2;
        this.A.bottom = getMeasuredHeight() - 2;
        xa2 xa2VarB = B();
        int i = this.J;
        if (i == 0) {
            if (xa2VarB.d()) {
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight() / 2, getMeasuredWidth(), getMeasuredHeight() / 2, this.m, (float[]) null, Shader.TileMode.CLAMP);
                this.B = linearGradient;
                this.i.setShader(linearGradient);
            } else {
                if (this.i.getShader() != null) {
                    this.i.setShader(null);
                }
                this.i.setColor(this.m[0]);
            }
            RectF rectF2 = this.A;
            float f = this.x;
            canvas.drawRoundRect(rectF2, f, f, this.i);
            return;
        }
        if (i == 1) {
            if (xa2VarB.d()) {
                this.w = this.s / (this.u + 0.0f);
                int[] iArr = this.m;
                int[] iArr2 = {iArr[0], iArr[1], this.o};
                float measuredWidth = getMeasuredWidth();
                float f2 = this.w;
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, measuredWidth, 0.0f, iArr2, new float[]{0.0f, f2, f2 + 0.001f}, Shader.TileMode.CLAMP);
                this.C = linearGradient2;
                this.i.setShader(linearGradient2);
            } else {
                this.w = this.s / (this.u + 0.0f);
                float measuredWidth2 = getMeasuredWidth();
                int[] iArr3 = {this.m[0], this.o};
                float f3 = this.w;
                this.C = new LinearGradient(0.0f, 0.0f, measuredWidth2, 0.0f, iArr3, new float[]{f3, f3 + 0.001f}, Shader.TileMode.CLAMP);
                this.i.setColor(this.m[0]);
                this.i.setShader(this.C);
            }
            RectF rectF3 = this.A;
            float f4 = this.x;
            canvas.drawRoundRect(rectF3, f4, f4, this.i);
            return;
        }
        if (i == 2) {
            if (xa2VarB.d()) {
                LinearGradient linearGradient3 = new LinearGradient(0.0f, getMeasuredHeight() / 2, getMeasuredWidth(), getMeasuredHeight() / 2, this.m, (float[]) null, Shader.TileMode.CLAMP);
                this.B = linearGradient3;
                this.i.setShader(linearGradient3);
            } else {
                this.i.setShader(null);
                this.i.setColor(this.m[0]);
            }
            RectF rectF4 = this.A;
            float f5 = this.x;
            canvas.drawRoundRect(rectF4, f5, f5, this.i);
            return;
        }
        if (i != 3) {
            return;
        }
        if (xa2VarB.d()) {
            LinearGradient linearGradient4 = new LinearGradient(0.0f, getMeasuredHeight() / 2, getMeasuredWidth(), getMeasuredHeight() / 2, new int[]{r(R$color.lib_base_progress_disable_bgcolor)}, (float[]) null, Shader.TileMode.CLAMP);
            this.B = linearGradient4;
            this.i.setShader(linearGradient4);
        } else {
            if (this.i.getShader() != null) {
                this.i.setShader(null);
            }
            this.i.setColor(r(R$color.lib_base_progress_disable_bgcolor));
        }
        RectF rectF5 = this.A;
        float f6 = this.x;
        canvas.drawRoundRect(rectF5, f6, f6, this.i);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            return;
        }
        q(canvas);
    }

    public final void p(Canvas canvas) {
        CharSequence charSequence;
        float height = (canvas.getHeight() / 2) - ((this.f3327j.descent() / 2.0f) + (this.f3327j.ascent() / 2.0f));
        if (this.G == null) {
            this.G = "";
        }
        int iBreakText = this.f3327j.breakText(this.G.toString(), true, getMeasuredWidth() - this.f3327j.measureText("…"), null);
        if (iBreakText < this.G.length()) {
            charSequence = ((Object) this.G.subSequence(0, iBreakText)) + "…";
        } else {
            charSequence = this.G;
        }
        float fMeasureText = this.f3327j.measureText(charSequence.toString());
        int i = this.J;
        if (i == 0) {
            this.f3327j.setShader(null);
            this.f3327j.setColor(this.q);
            canvas.drawText(charSequence.toString(), (getMeasuredWidth() - fMeasureText) / 2.0f, height, this.f3327j);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.f3327j.setColor(this.q);
                canvas.drawText(charSequence.toString(), (getMeasuredWidth() - fMeasureText) / 2.0f, height, this.f3327j);
                canvas.drawCircle(((getMeasuredWidth() + fMeasureText) / 2.0f) + 4.0f + this.y, height, 4.0f, this.k);
                canvas.drawCircle(((getMeasuredWidth() + fMeasureText) / 2.0f) + 24.0f + this.z, height, 4.0f, this.f3328l);
                return;
            }
            if (i != 3) {
                return;
            }
            this.f3327j.setShader(null);
            this.f3327j.setColor(r(R$color.lib_base_progress_disable_txtcolor));
            canvas.drawText(charSequence.toString(), (getMeasuredWidth() - fMeasureText) / 2.0f, height, this.f3327j);
            return;
        }
        float measuredWidth = getMeasuredWidth() * this.w;
        float f = fMeasureText / 2.0f;
        float measuredWidth2 = (getMeasuredWidth() / 2) - f;
        float measuredWidth3 = (getMeasuredWidth() / 2) + f;
        float measuredWidth4 = ((f - (getMeasuredWidth() / 2)) + measuredWidth) / fMeasureText;
        if (measuredWidth <= measuredWidth2) {
            this.f3327j.setShader(null);
            this.f3327j.setColor(this.p);
        } else if (measuredWidth2 >= measuredWidth || measuredWidth > measuredWidth3) {
            this.f3327j.setShader(null);
            this.f3327j.setColor(this.q);
        } else {
            this.D = new LinearGradient((getMeasuredWidth() - fMeasureText) / 2.0f, 0.0f, (getMeasuredWidth() + fMeasureText) / 2.0f, 0.0f, new int[]{this.q, this.p}, new float[]{measuredWidth4, measuredWidth4 + 0.001f}, Shader.TileMode.CLAMP);
            this.f3327j.setColor(this.p);
            this.f3327j.setShader(this.D);
        }
        canvas.drawText(charSequence.toString(), (getMeasuredWidth() - fMeasureText) / 2.0f, height, this.f3327j);
    }

    public final void q(Canvas canvas) {
        o(canvas);
        p(canvas);
    }

    public int r(int i) {
        return ContextCompat.getColor(getContext(), i);
    }

    public final void s() {
        this.u = 100;
        this.v = 0;
        this.s = 0.0f;
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(true);
        this.i.setStyle(Paint.Style.FILL);
        this.f3327j = new Paint();
        this.f3327j.setAntiAlias(true);
        this.f3327j.setTextSize(this.r);
        setLayerType(1, this.f3327j);
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setAntiAlias(true);
        this.k.setTextSize(this.r);
        Paint paint3 = new Paint();
        this.f3328l = paint3;
        paint3.setAntiAlias(true);
        this.f3328l.setTextSize(this.r);
        this.J = 0;
        invalidate();
    }

    public void setButtonRadius(float f) {
        this.x = f;
    }

    public void setCurrentText(CharSequence charSequence) {
        this.G = charSequence;
        invalidate();
    }

    public void setMaxProgress(int i) {
        this.u = i;
    }

    public void setMinProgress(int i) {
        this.v = i;
    }

    public void setPendingStateClickable(boolean z) {
        this.K = z;
    }

    public void setProgress(float f) {
        this.s = f;
    }

    public void setProgressBtnBackgroundColor(int i) {
        v(i, i);
    }

    public void setProgressBtnBackgroundSecondColor(int i) {
        this.o = i;
    }

    public void setState(final int i) {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.etj
            @Override // java.lang.Runnable
            public final void run() {
                this.i.x(i);
            }
        });
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        this.p = i;
    }

    public void setTextCoverColor(int i) {
        this.q = i;
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        this.r = f;
        this.f3327j.setTextSize(f);
    }

    public final void t(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_base_TextProgressBtn);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.lib_base_TextProgressBtn_progressbtn_background_color, Color.parseColor("#6699ff"));
        v(color, color);
        this.o = typedArrayObtainStyledAttributes.getColor(R$styleable.lib_base_TextProgressBtn_progressbtn_background_second_color, -3355444);
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.lib_base_TextProgressBtn_progressbtn_radius, getMeasuredHeight() / 2);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.lib_base_TextProgressBtn_progressbtn_text_size, 50);
        this.p = typedArrayObtainStyledAttributes.getColor(R$styleable.lib_base_TextProgressBtn_progressbtn_text_color, color);
        this.q = typedArrayObtainStyledAttributes.getColor(R$styleable.lib_base_TextProgressBtn_progressbtn_text_covercolor, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_TextProgressBtn_progressbtn_enable_gradient, false);
        ((u35) this.H).e(z).f(typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_TextProgressBtn_progressbtn_enable_press, false));
        if (z) {
            v(this.H.c(this.m[0]), this.m[0]);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void u() {
        this.H = new u35();
    }

    public final int[] v(int i, int i2) {
        int[] iArr = {i, i2};
        this.m = iArr;
        return iArr;
    }

    public void y() {
        this.E.cancel();
        this.E.removeAllListeners();
        this.F.cancel();
        this.F.removeAllListeners();
    }

    public void z(final String str, final float f) {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.ftj
            @Override // java.lang.Runnable
            public final void run() {
                this.i.w(str, f);
            }
        });
    }

    public TextProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = 50.0f;
        this.s = -1.0f;
        this.K = false;
        if (isInEditMode()) {
            u();
            return;
        }
        u();
        t(context, attributeSet);
        s();
        A();
    }
}
