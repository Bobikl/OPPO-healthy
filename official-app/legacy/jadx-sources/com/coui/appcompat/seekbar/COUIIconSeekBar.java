package com.coui.appcompat.seekbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.tid;
import com.support.nearx.R$attr;
import com.support.nearx.R$color;
import com.support.nearx.R$dimen;
import com.support.nearx.R$drawable;
import com.support.nearx.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIIconSeekBar extends View {
    public static final int BRIGHTNESS_TYPE = 0;
    public static final int VOLUME_TYPE = 1;
    public float A;
    public float B;
    public final Interpolator C;
    public int D;
    public String E;
    public float F;
    public boolean G;
    public RectF H;
    public Bitmap I;
    public int J;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2040j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2041l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RectF f2042n;
    public AnimatorSet o;
    public float p;
    public Paint q;
    public Interpolator r;
    public int s;
    public boolean t;
    public float u;
    public float v;
    public float w;
    public RectF x;
    public PatternExploreByTouchHelper y;
    public float z;

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            COUIIconSeekBar.a(COUIIconSeekBar.this);
            COUIIconSeekBar.this.v();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUIIconSeekBar.a(COUIIconSeekBar.this);
            COUIIconSeekBar.this.v();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            COUIIconSeekBar.this.u();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f2043j;

        public b(float f, int i) {
            this.i = f;
            this.f2043j = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            COUIIconSeekBar cOUIIconSeekBar = COUIIconSeekBar.this;
            cOUIIconSeekBar.k = (int) (fFloatValue / this.i);
            cOUIIconSeekBar.F = fFloatValue / this.f2043j;
            COUIIconSeekBar.this.invalidate();
        }
    }

    public COUIIconSeekBar(Context context) {
        this(context, null);
    }

    public static /* synthetic */ tid a(COUIIconSeekBar cOUIIconSeekBar) {
        cOUIIconSeekBar.getClass();
        return null;
    }

    private int getProgressLeftX() {
        return Math.round(this.x.left + 72.0f + 36.0f + 24.0f);
    }

    private int getProgressRightX() {
        return Math.round(this.x.right - 36.0f);
    }

    public boolean A(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.x;
        return x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom;
    }

    public final void B(MotionEvent motionEvent) {
        float fRound = Math.round(((motionEvent.getX() - this.p) * f(motionEvent.getX())) + this.p);
        if (g(fRound) != this.k) {
            this.p = fRound;
            w();
        }
    }

    public void c(float f) {
        int iRound;
        float seekBarWidth = getSeekBarWidth();
        if (s()) {
            int i = this.f2041l;
            iRound = i - Math.round((i * (((f - this.H.left) - getPaddingLeft()) - this.w)) / seekBarWidth);
        } else {
            iRound = Math.round((this.f2041l * (((f - this.H.left) - getPaddingLeft()) - this.w)) / seekBarWidth);
        }
        d(m(iRound));
    }

    public void d(int i) {
        AnimatorSet animatorSet = this.o;
        if (animatorSet == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.o = animatorSet2;
            animatorSet2.addListener(new a());
        } else {
            animatorSet.cancel();
        }
        int i2 = this.k;
        int seekBarWidth = getSeekBarWidth();
        float f = seekBarWidth / this.f2041l;
        if (f > 0.0f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i2 * f, i * f);
            valueAnimatorOfFloat.setInterpolator(this.r);
            valueAnimatorOfFloat.addUpdateListener(new b(f, seekBarWidth));
            long jAbs = (long) ((Math.abs(i - i2) / this.f2041l) * 483.0f);
            if (jAbs < 150) {
                jAbs = 150;
            }
            this.o.setDuration(jAbs);
            this.o.play(valueAnimatorOfFloat);
            this.o.start();
        }
    }

    public final void e() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        }
    }

    public final float f(float f) {
        float seekBarWidth = getSeekBarWidth();
        float f2 = seekBarWidth / 2.0f;
        float interpolation = 1.0f - this.C.getInterpolation(Math.abs(f - f2) / f2);
        return (f > seekBarWidth - ((float) getPaddingRight()) || f < ((float) getPaddingLeft()) || interpolation < this.B) ? this.B : interpolation;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    public final int g(float f) {
        float progressLeftX;
        float f2;
        float f3;
        int progressRightX = getProgressRightX() - getProgressLeftX();
        if (s()) {
            if (f > getProgressRightX()) {
                f3 = 0.0f;
            } else if (f < getProgressLeftX()) {
                f3 = 1.0f;
            } else {
                f2 = progressRightX;
                progressLeftX = (f2 - f) + getProgressLeftX();
                f3 = progressLeftX / f2;
            }
        } else if (f < getProgressLeftX()) {
            f3 = 0.0f;
        } else if (f > getProgressRightX()) {
            f3 = 1.0f;
        } else {
            progressLeftX = f - getProgressLeftX();
            f2 = progressRightX;
            f3 = progressLeftX / f2;
        }
        this.F = Math.min(f3, 1.0f);
        float max = 0.0f + (f3 * getMax());
        int i = this.k;
        this.k = m(Math.round(max));
        invalidate();
        return i;
    }

    public int getIncrement() {
        return this.s;
    }

    public int getMax() {
        return this.f2041l;
    }

    public int getProgress() {
        return this.k;
    }

    public String getProgressContentDescription() {
        return this.E;
    }

    public int getSeekBarWidth() {
        return (int) this.H.width();
    }

    public int getType() {
        return this.J;
    }

    public void h(Canvas canvas, float f) {
        float progressRightX;
        float f2;
        float fHeight = (this.x.height() / 2.0f) + getPaddingTop();
        if (s()) {
            progressRightX = getProgressRightX();
            f2 = progressRightX - (this.F * f);
        } else {
            float progressLeftX = getProgressLeftX();
            progressRightX = progressLeftX + (this.F * f);
            f2 = progressLeftX;
        }
        if (f2 <= progressRightX) {
            RectF rectF = this.f2042n;
            float f3 = this.v;
            rectF.set(f2, fHeight - f3, progressRightX, fHeight + f3);
        } else {
            RectF rectF2 = this.f2042n;
            float f4 = this.v;
            rectF2.set(progressRightX, fHeight - f4, f2, fHeight + f4);
        }
        this.q.setColor(ContextCompat.getColor(getContext(), R$color.coui_icon_seekbar_def_progress_color));
        RectF rectF3 = this.f2042n;
        float f5 = this.A;
        canvas.drawRoundRect(rectF3, f5, f5, this.q);
        int i = this.k;
        if (i == this.f2041l || i <= this.A) {
            return;
        }
        if (s()) {
            RectF rectF4 = this.f2042n;
            canvas.drawRect(rectF4.left, rectF4.top, rectF4.right - this.A, rectF4.bottom, this.q);
        } else {
            RectF rectF5 = this.f2042n;
            canvas.drawRect(rectF5.left + this.A, rectF5.top, rectF5.right, rectF5.bottom, this.q);
        }
    }

    public void i(Canvas canvas) {
        this.q.setColor(ContextCompat.getColor(getContext(), R$color.coui_icon_seekbar_background));
        this.x.set((getWidth() >> 1) - 204.0f, getPaddingTop(), (getWidth() >> 1) + 204.0f, getPaddingTop() + 96.0f);
        canvas.drawRoundRect(this.x, 90.0f, 90.0f, this.q);
        if (getType() == 0) {
            j(canvas);
        } else {
            k(canvas);
        }
        this.q.setColor(ContextCompat.getColor(getContext(), R$color.coui_icon_seekbar_background_color_normal));
        float fHeight = (this.x.height() / 2.0f) + getPaddingTop();
        float progressLeftX = getProgressLeftX();
        float progressRightX = getProgressRightX();
        RectF rectF = this.H;
        float f = this.A;
        rectF.set(progressLeftX, fHeight - f, progressRightX, fHeight + f);
        RectF rectF2 = this.H;
        float f2 = this.A;
        canvas.drawRoundRect(rectF2, f2, f2, this.q);
        h(canvas, this.H.width());
    }

    public final void j(Canvas canvas) {
        this.q.setColor(-1);
        int i = (int) (this.x.left + 36.0f + 36.0f);
        float width = 72.0f / this.I.getWidth();
        float height = 72.0f / this.I.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(width, height);
        float f = i;
        matrix.postRotate(this.k * 2, f, this.x.height() / 2.0f);
        Bitmap bitmap = this.I;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.I.getHeight(), matrix, true);
        Rect rect = new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        RectF rectF = new RectF();
        float width2 = bitmapCreateBitmap.getWidth() >> 1;
        float f2 = f - width2;
        float f3 = f + width2;
        float fHeight = ((this.x.height() - bitmapCreateBitmap.getHeight()) / 2.0f) + getPaddingTop();
        rectF.set(f2, fHeight, f3, bitmapCreateBitmap.getHeight() + fHeight);
        canvas.drawBitmap(bitmapCreateBitmap, rect, rectF, this.q);
    }

    public final void k(Canvas canvas) {
        Bitmap bitmap;
        this.q.setColor(-1);
        int i = this.k;
        if (i == 0) {
            bitmap = ((BitmapDrawable) getResources().getDrawable(R$drawable.ic_volume_seekbar_close)).getBitmap();
        } else {
            bitmap = (i <= 0 || i > (this.f2041l >> 1)) ? ((BitmapDrawable) getResources().getDrawable(R$drawable.ic_volume_seekbar_open)).getBitmap() : ((BitmapDrawable) getResources().getDrawable(R$drawable.ic_volume_seekbar_middle)).getBitmap();
        }
        Bitmap bitmap2 = bitmap;
        float width = 72.0f / this.I.getWidth();
        float height = 72.0f / this.I.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
        Rect rect = new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        RectF rectF = new RectF();
        float f = this.x.left + 36.0f;
        float width2 = bitmapCreateBitmap.getWidth() + f;
        float fHeight = ((this.x.height() - bitmapCreateBitmap.getHeight()) / 2.0f) + getPaddingTop();
        rectF.set(f, fHeight, width2, bitmapCreateBitmap.getHeight() + fHeight);
        canvas.drawBitmap(bitmapCreateBitmap, rect, rectF, this.q);
    }

    public final void l() {
        this.v = this.u;
        this.A = this.z;
    }

    public final int m(int i) {
        return Math.max(0, Math.min(i, this.f2041l));
    }

    public void n(MotionEvent motionEvent) {
        this.f2040j = motionEvent.getX();
        this.p = motionEvent.getX();
    }

    public void o(MotionEvent motionEvent) {
        float seekBarWidth = getSeekBarWidth();
        if (Float.compare((this.k * seekBarWidth) / this.f2041l, seekBarWidth / 2.0f) != 0 || Math.abs(motionEvent.getX() - this.p) >= 20.0f) {
            if (this.m && this.t) {
                B(motionEvent);
                return;
            }
            if (A(motionEvent)) {
                float x = motionEvent.getX();
                if (Math.abs(x - this.f2040j) > this.i) {
                    z();
                    this.p = x;
                    r(motionEvent);
                }
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        i(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(t(i, Math.round(408.0f)), t(i2, Math.round(96.0f)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.t = false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.m = false;
            this.t = false;
            n(motionEvent);
        } else if (action == 1) {
            p(motionEvent);
        } else if (action == 2) {
            o(motionEvent);
        } else if (action == 3) {
            p(motionEvent);
        }
        return true;
    }

    public void p(MotionEvent motionEvent) {
        if (this.m) {
            v();
            setPressed(false);
        } else if (A(motionEvent)) {
            c(motionEvent.getX());
        }
    }

    public final void q() {
        this.i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        PatternExploreByTouchHelper patternExploreByTouchHelper = new PatternExploreByTouchHelper(this);
        this.y = patternExploreByTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, patternExploreByTouchHelper);
        ViewCompat.setImportantForAccessibility(this, 1);
        this.y.invalidateRoot();
        Paint paint = new Paint();
        this.q = paint;
        paint.setAntiAlias(true);
        this.q.setDither(true);
        this.I = ((BitmapDrawable) getResources().getDrawable(R$drawable.ic_brightness_seekbar)).getBitmap();
    }

    public final void r(MotionEvent motionEvent) {
        int i = this.k;
        float seekBarWidth = getSeekBarWidth();
        if (s()) {
            int i2 = this.f2041l;
            this.k = i2 - Math.round((i2 * ((motionEvent.getX() - getProgressLeftX()) - this.w)) / seekBarWidth);
        } else {
            this.k = Math.round((this.f2041l * ((motionEvent.getX() - getProgressLeftX()) - this.w)) / seekBarWidth);
        }
        int iM = m(this.k);
        this.k = iM;
        if (i != iM) {
            w();
        }
        invalidate();
    }

    public boolean s() {
        return getLayoutDirection() == 1;
    }

    public void setIncrement(int i) {
        this.s = Math.abs(i);
    }

    public void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.f2041l) {
            this.f2041l = i;
            if (this.k > i) {
                this.k = i;
            }
        }
        invalidate();
    }

    public void setOnSeekBarChangeListener(tid tidVar) {
    }

    public void setProgress(int i) {
        x(i, false);
    }

    public void setProgressContentDescription(String str) {
        this.E = str;
    }

    public void setType(int i) {
        this.J = i;
        invalidate();
    }

    public void setVibratorEnable(boolean z) {
        this.G = z;
    }

    public final int t(int i, int i2) {
        return View.MeasureSpec.getMode(i) != 1073741824 ? i2 : View.MeasureSpec.getSize(i);
    }

    public void u() {
        this.m = true;
        this.t = true;
    }

    public void v() {
        this.m = false;
        this.t = false;
    }

    public void w() {
        if (this.G) {
            if (this.k == getMax() || this.k == 0) {
                performHapticFeedback(306, 0);
            } else {
                performHapticFeedback(305, 0);
            }
        }
    }

    public void x(int i, boolean z) {
        y(i, z, false);
    }

    public void y(int i, boolean z, boolean z2) {
        int i2 = this.k;
        int iMax = Math.max(0, Math.min(i, this.f2041l));
        if (i2 != iMax) {
            if (z) {
                d(iMax);
            } else {
                this.k = iMax;
                this.F = iMax / this.f2041l;
                invalidate();
            }
            w();
        }
    }

    public void z() {
        setPressed(true);
        u();
        e();
    }

    public COUIIconSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiIconSeekBarStyle);
    }

    public COUIIconSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        this.k = 0;
        this.f2041l = 100;
        this.m = false;
        this.f2042n = new RectF();
        this.r = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.s = 1;
        this.t = false;
        this.x = new RectF();
        this.B = 0.4f;
        this.C = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.F = 0.0f;
        this.G = false;
        this.H = new RectF();
        if (attributeSet != null) {
            this.D = attributeSet.getStyleAttribute();
        }
        if (this.D == 0) {
            this.D = i;
        }
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIIconSeekBar, i, 0);
        this.w = getResources().getDimensionPixelSize(R$dimen.coui_icon_seekbar_progress_scale_radius);
        this.u = getResources().getDimensionPixelSize(R$dimen.coui_icon_seekbar_progress_radius);
        this.z = getResources().getDimensionPixelSize(R$dimen.coui_icon_seekbar_intent_background_radius);
        this.J = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIIconSeekBar_couiIconSeekBarType, 0);
        this.f2041l = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIIconSeekBar_couiIconSeekBarMax, 100);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIIconSeekBar_couiIconSeekBarProgress, 0);
        this.k = integer;
        this.F = integer / this.f2041l;
        typedArrayObtainStyledAttributes.recycle();
        q();
        l();
    }
}
