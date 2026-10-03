package com.heytap.health.watchface.business.legacy.creation.outfits.view.mainshutterbutton;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.R$styleable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.qeb;

/* JADX INFO: loaded from: classes19.dex */
public class MainShutterButton extends ShutterButton {
    public static final String BUTTON_COLOR_INSIDE_GREY = "button_color_inside_grey";
    public static final String BUTTON_COLOR_INSIDE_NONE = "button_color_inside_none";
    public static final int BUTTON_COLOR_INSIDE_RECT_NONE = 2;
    public static final int BUTTON_COLOR_INSIDE_RECT_RED = 1;
    public static final int BUTTON_COLOR_INSIDE_RECT_WHITE = 0;
    public static final String BUTTON_COLOR_INSIDE_RED = "button_color_inside_red";
    public static final String BUTTON_SHAPE_DIAL_NONE = "button_shape_ring_none";
    public static final String BUTTON_SHAPE_DIAL_ROTATE = "button_shape_dial_rotate";
    public static final String BUTTON_SHAPE_DIAL_STILL = "button_shape_dial_still";
    public static final int BUTTON_TYPE_ARC = 13;
    public static final int BUTTON_TYPE_ARC_RECT = 3;
    public static final int BUTTON_TYPE_ARC_RECT_PROGRESS = 12;
    public static final int BUTTON_TYPE_CIRCLE_TO_RECT = 5;
    public static final int BUTTON_TYPE_LOADING = 4;
    public static final int BUTTON_TYPE_RECT_TO_CIRCLE = 6;
    public static final int BUTTON_TYPE_RING_CIRCLE = 1;
    public static final int BUTTON_TYPE_RING_CIRCLE_RECT = 9;
    public static final int BUTTON_TYPE_RING_CIRCLE_RECT_TO_RING_CIRCLE = 11;
    public static final int BUTTON_TYPE_RING_CIRCLE_RECT_TO_RING_CIRCLE_LOADING = 8;
    public static final int BUTTON_TYPE_RING_CIRCLE_TO_RECT_TO_ARC = 7;
    public static final int BUTTON_TYPE_RING_CIRCLE_TO_RING_CIRCLE_RECT = 10;
    public static final int BUTTON_TYPE_RING_RECT = 2;
    public static final int DEFAULT_ANGLE_ANIM_DURATION = 2000;
    public static final int DEFAULT_SWEEP_ANIM_DURATION = 900;
    public static final int SWEEP_ANGLE = 30;
    public static final String TAG = "MainShutterButton";
    public int A;
    public ValueAnimator.AnimatorUpdateListener A0;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public String T;
    public String U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public ObjectAnimator b0;
    public ObjectAnimator c0;
    public RectF d0;
    public RectF e0;
    public RectF f0;
    public RectF g0;
    public RectF h0;
    public Paint i0;
    public Paint j0;
    public Paint k0;
    public Paint l0;
    public Paint m0;
    public Paint n0;
    public Paint o0;
    public Property<MainShutterButton, Float> p0;
    public Property<MainShutterButton, Float> q0;
    public Property<MainShutterButton, Integer> r0;
    public int s;
    public ObjectAnimator s0;
    public int t;
    public ObjectAnimator t0;
    public int u;
    public ObjectAnimator u0;
    public int v;
    public ValueAnimator v0;
    public int w;
    public ValueAnimator w0;
    public int x;
    public ValueAnimator x0;
    public int y;
    public ValueAnimator y0;
    public int z;
    public ValueAnimator z0;
    public static final Interpolator B0 = new LinearInterpolator();
    public static final Interpolator C0 = new AccelerateDecelerateInterpolator();
    public static final int D0 = Color.parseColor("#FF0C0C");

    public class a extends Property<MainShutterButton, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(MainShutterButton mainShutterButton) {
            return Float.valueOf(mainShutterButton.getCurrentGlobalAngle());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(MainShutterButton mainShutterButton, Float f) {
            mainShutterButton.setCurrentGlobalAngle(f.floatValue());
        }
    }

    public class b extends Property<MainShutterButton, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(MainShutterButton mainShutterButton) {
            return Float.valueOf(mainShutterButton.getCurrentSweepAngle());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(MainShutterButton mainShutterButton, Float f) {
            mainShutterButton.setCurrentSweepAngle(f.floatValue());
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
            MainShutterButton.this.O();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class d extends Property<MainShutterButton, Integer> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(MainShutterButton mainShutterButton) {
            return Integer.valueOf(mainShutterButton.getDialValue());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(MainShutterButton mainShutterButton, Integer num) {
            mainShutterButton.setDialValue(num.intValue());
        }
    }

    public class e implements Animator.AnimatorListener {
        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MainShutterButton.this.y = 0;
            ltl.h(MainShutterButton.TAG, "onAnimationEnd, mRingDotPrepareAnimator end, mButtonType: " + MainShutterButton.this.s);
            if (MainShutterButton.this.t0 != null) {
                if ((2 == MainShutterButton.this.s || 5 == MainShutterButton.this.s) && MainShutterButton.BUTTON_SHAPE_DIAL_ROTATE.equals(MainShutterButton.this.U)) {
                    MainShutterButton.this.t0.setCurrentFraction(0.5f);
                    MainShutterButton.this.t0.start();
                    if (2 != MainShutterButton.this.s) {
                        MainShutterButton.this.setButtonType(2);
                    }
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            MainShutterButton.this.D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            MainShutterButton.this.invalidate();
        }
    }

    public class g implements Animator.AnimatorListener {
        public g() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MainShutterButton.this.B();
            MainShutterButton.this.u0.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class h implements Animator.AnimatorListener {
        public h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MainShutterButton.this.F = 0;
            MainShutterButton.this.z = 0;
            if (6 == MainShutterButton.this.s && MainShutterButton.BUTTON_SHAPE_DIAL_ROTATE.equals(MainShutterButton.this.U)) {
                MainShutterButton.this.setButtonType(1);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            MainShutterButton.this.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = MainShutterButton.this.O - MainShutterButton.this.u;
            if (MainShutterButton.this.f0 == null) {
                float f2 = f / 2.0f;
                MainShutterButton.this.f0 = new RectF(((MainShutterButton.this.getWidth() / 2) - MainShutterButton.this.O) + f2, ((MainShutterButton.this.getHeight() / 2) - MainShutterButton.this.O) + f2, ((MainShutterButton.this.getWidth() / 2) + MainShutterButton.this.O) - f2, ((MainShutterButton.this.getWidth() / 2) + MainShutterButton.this.O) - f2);
            } else {
                float f3 = f / 2.0f;
                MainShutterButton.this.f0.set(((MainShutterButton.this.getWidth() / 2) - MainShutterButton.this.O) + f3, ((MainShutterButton.this.getHeight() / 2) - MainShutterButton.this.O) + f3, ((MainShutterButton.this.getWidth() / 2) + MainShutterButton.this.O) - f3, ((MainShutterButton.this.getWidth() / 2) + MainShutterButton.this.O) - f3);
            }
            MainShutterButton.this.m0.setStrokeWidth(f);
            MainShutterButton.this.invalidate();
        }
    }

    public MainShutterButton(Context context) {
        super(context);
        this.s = 1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 8;
        this.K = 6;
        this.L = 11;
        this.M = 3;
        this.N = 0;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = null;
        this.U = null;
        this.V = false;
        this.W = true;
        this.a0 = true;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
    }

    public final void A() {
        Resources resources = getResources();
        this.J = resources.getDimensionPixelSize(R$dimen.watch_face_shutter_button_line_height);
        this.L = resources.getDimensionPixelSize(R$dimen.watch_face_shutter_button_long_line_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.watch_face_shutter_button_long_line_padding);
        this.M = dimensionPixelSize;
        int i2 = this.u - (dimensionPixelSize * 2);
        int i3 = this.L;
        this.v = i2 - i3;
        this.K = (((dimensionPixelSize * 2) + i3) - this.J) / 2;
        d dVar = new d(Integer.class, Const.Arguments.Call.DIAL);
        this.r0 = dVar;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, dVar, 0, 60);
        this.s0 = objectAnimatorOfInt;
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        this.s0.setDuration(600L);
        this.s0.addListener(new e());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        this.v0 = valueAnimatorOfInt;
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        this.v0.setDuration(this.E);
        this.v0.addUpdateListener(new f());
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this, this.r0, 0, 120);
        this.t0 = objectAnimatorOfInt2;
        objectAnimatorOfInt2.setRepeatMode(1);
        this.t0.setRepeatCount(-1);
        this.t0.setInterpolator(new LinearInterpolator());
        this.t0.setDuration(12000L);
        this.t0.addListener(new g());
        ObjectAnimator objectAnimatorOfInt3 = ObjectAnimator.ofInt(this, this.r0, 0, 60);
        this.u0 = objectAnimatorOfInt3;
        objectAnimatorOfInt3.setInterpolator(new PathInterpolator(0.576f, 0.16f, 0.421f, 0.853f));
        this.u0.addListener(new h());
    }

    public final void B() {
        this.u0.setIntValues(this.F, 120);
        this.u0.setDuration(((120 - this.F) * 800) / 120);
    }

    public final void C() {
        this.A0 = new i();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.t, this.G);
        this.w0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.66f, 1.0f));
        this.w0.setDuration(100L);
        this.w0.addUpdateListener(this.A0);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.G, this.t);
        this.x0 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.66f, 1.0f));
        this.x0.setDuration(100L);
        this.x0.addUpdateListener(this.A0);
    }

    public final void D() {
        if (F()) {
            return;
        }
        this.V = true;
        ObjectAnimator objectAnimator = this.c0;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        ObjectAnimator objectAnimator2 = this.b0;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
        invalidate();
    }

    public final void E() {
        if (F()) {
            this.V = false;
            ObjectAnimator objectAnimator = this.c0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = this.b0;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            invalidate();
        }
    }

    public final boolean F() {
        return this.V;
    }

    public final void G(Canvas canvas) {
        if (BUTTON_SHAPE_DIAL_NONE.equals(this.U)) {
            return;
        }
        int i2 = this.s;
        if (i2 != 1 && i2 != 2 && i2 != 5) {
            if (i2 == 6) {
                if (BUTTON_SHAPE_DIAL_STILL.equals(this.U)) {
                    this.a0 = false;
                    w(canvas, false);
                    return;
                } else {
                    if (BUTTON_SHAPE_DIAL_ROTATE.equals(this.U)) {
                        ObjectAnimator objectAnimator = this.t0;
                        if (objectAnimator != null && objectAnimator.isRunning()) {
                            this.t0.cancel();
                        }
                        this.a0 = true;
                        w(canvas, true);
                        return;
                    }
                    return;
                }
            }
            if (i2 != 9) {
                return;
            }
        }
        if (BUTTON_SHAPE_DIAL_STILL.equals(this.U)) {
            this.a0 = false;
        } else if (BUTTON_SHAPE_DIAL_ROTATE.equals(this.U)) {
            this.a0 = true;
        }
        w(canvas, this.a0);
    }

    public void H(int i2, String str, int i3) {
        ltl.h(TAG, "setButtonType, insideRectColor: " + this.N + " => " + i3 + ", inSideColor: " + this.T + " => " + str);
        this.T = str;
        this.N = i3;
        setButtonType(i2);
    }

    public final void I(int i2, int i3) {
        this.N = i3;
        setButtonTypeAndInvalidate(i2);
    }

    public final void J(int i2, String str) {
        this.T = str;
        setButtonTypeAndInvalidate(i2);
    }

    public final void K() {
        this.p0 = new a(Float.class, "angle");
        this.q0 = new b(Float.class, "arc");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, this.p0, 360.0f);
        this.c0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(B0);
        this.c0.setDuration(this.A);
        this.c0.setRepeatMode(1);
        this.c0.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, this.q0, this.S);
        this.b0 = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(C0);
        this.b0.setDuration(this.B);
        this.b0.setRepeatMode(1);
        this.b0.setRepeatCount(-1);
        this.b0.addListener(new c());
    }

    public final void L() {
        K();
        A();
        C();
    }

    public void M() {
        ObjectAnimator objectAnimator = this.s0;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    public final void N() {
        ValueAnimator valueAnimator = this.v0;
        if (valueAnimator != null) {
            valueAnimator.setDuration(this.E);
            this.v0.start();
        }
    }

    public final void O() {
        boolean z = !this.W;
        this.W = z;
        if (z) {
            this.P = (this.P + (this.C * 2)) % 360.0f;
        }
    }

    public int getButtonType() {
        return this.s;
    }

    public float getCurrentGlobalAngle() {
        return this.Q;
    }

    public float getCurrentSweepAngle() {
        return this.R;
    }

    public int getDialValue() {
        return this.F;
    }

    public String getInsideColor() {
        return this.T;
    }

    public String getRingShape() {
        return this.U;
    }

    public qeb getShutterButtonInfo() {
        return new qeb(this.s, this.T);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        ltl.h(TAG, "onAttachedToWindow, mButtonType: " + this.s);
        if (this.s == 4) {
            D();
        }
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        ltl.h(TAG, " onDetachedFromWindow, mButtonType: " + this.s);
        if (this.s == 4) {
            E();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:112:0x042f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0438  */
    /* JADX WARN: Code duplicated, block: B:69:0x027b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0284  */
    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.view.mainshutterbutton.ShutterButton, com.heytap.health.watchface.business.legacy.creation.outfits.view.mainshutterbutton.RotateImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        if (this.d0 == null) {
            this.d0 = new RectF((getWidth() / 2) - this.u, (getHeight() / 2) - this.u, (getWidth() / 2) + this.u, (getHeight() / 2) + this.u);
        }
        if (this.e0 == null) {
            this.e0 = new RectF((getWidth() / 2) - this.v, (getHeight() / 2) - this.v, (getWidth() / 2) + this.v, (getHeight() / 2) + this.v);
        }
        if (this.g0 == null) {
            this.g0 = new RectF((getWidth() / 2) - (this.w / 2), (getHeight() / 2) - (this.w / 2), (getWidth() / 2) + (this.w / 2), (getHeight() / 2) + (this.w / 2));
        }
        if (this.f0 == null) {
            this.f0 = new RectF(((getWidth() / 2) - this.t) + (this.H / 2), ((getHeight() / 2) - this.t) + (this.H / 2), ((getWidth() / 2) + this.t) - (this.H / 2), ((getWidth() / 2) + this.t) - (this.H / 2));
        }
        if (this.h0 == null) {
            this.h0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        int i6 = this.s;
        if (i6 == 1) {
            x(canvas, true);
        } else if (i6 == 2) {
            x(canvas, true);
            int i7 = this.N;
            if (i7 != 0 && 1 == i7) {
                this.k0.setAlpha(255);
                this.o0 = this.k0;
            } else {
                this.j0.setAlpha(255);
                this.o0 = this.j0;
            }
            RectF rectF = this.g0;
            int i8 = this.x;
            canvas.drawRoundRect(rectF, i8, i8, this.o0);
        } else if (i6 == 3) {
            this.m0.setAlpha(128);
            x(canvas, false);
            this.i0.setStrokeWidth(this.H);
            canvas.drawArc(this.f0, -90.0f, this.D, false, this.i0);
            int i9 = this.N;
            if (i9 == 0) {
                this.j0.setAlpha(255);
                this.o0 = this.j0;
            } else if (1 == i9) {
                this.k0.setAlpha(255);
                this.o0 = this.k0;
            } else if (2 == i9) {
                this.j0.setAlpha(0);
                this.o0 = this.j0;
            } else {
                this.j0.setAlpha(255);
                this.o0 = this.j0;
            }
            RectF rectF2 = this.g0;
            int i10 = this.x;
            canvas.drawRoundRect(rectF2, i10, i10, this.o0);
        } else if (i6 == 4) {
            this.m0.setAlpha(128);
            x(canvas, false);
            float f3 = this.Q - this.P;
            float f4 = this.R;
            if (this.W) {
                f2 = this.C + f4;
                float f5 = this.S;
                if (f4 == f5) {
                    f2 -= f5;
                }
            } else {
                f3 += f4;
                f2 = (360.0f - f4) - this.C;
                float f6 = this.S;
                if (f4 == f6) {
                    f3 -= f6;
                    f2 += f6;
                }
            }
            this.i0.setStrokeWidth(this.H);
            canvas.drawArc(this.f0, f3, f2, false, this.i0);
        } else {
            String str = BUTTON_COLOR_INSIDE_RED;
            if (i6 == 5) {
                this.m0.setAlpha(255);
                RectF rectF3 = this.f0;
                int i11 = this.t;
                canvas.drawRoundRect(rectF3, i11, i11, this.m0);
                if (BUTTON_COLOR_INSIDE_NONE.equals(this.T)) {
                    return;
                }
                int i12 = BUTTON_SHAPE_DIAL_NONE.equals(this.U) ? this.u : this.v;
                float f7 = i12 - (this.w / 2);
                float f8 = (i12 - this.x) / 8.0f;
                float f9 = f7 / 8.0f;
                float width = ((getWidth() / 2) - i12) + (this.y * f9);
                float height = ((getHeight() / 2) - i12) + (this.y * f9);
                float width2 = ((getWidth() / 2) + i12) - (this.y * f9);
                float height2 = (getHeight() / 2) + i12;
                int i13 = this.y;
                float f10 = i12 - (i13 * f8);
                this.h0.set(width, height, width2, height2 - (i13 * f9));
                if (BUTTON_COLOR_INSIDE_GREY.equals(this.T)) {
                    this.l0.setAlpha(51);
                    this.o0 = this.l0;
                } else {
                    if (BUTTON_COLOR_INSIDE_RED.equals(this.T)) {
                        this.k0.setAlpha(255);
                        this.o0 = this.k0;
                        i4 = 1;
                    }
                    canvas.drawRoundRect(this.h0, f10, f10, this.o0);
                    i5 = this.y;
                    if (i5 < 8) {
                        this.y = i5 + 1;
                        invalidate();
                    } else {
                        this.y = 0;
                        H(2, BUTTON_COLOR_INSIDE_NONE, i4);
                    }
                }
                i4 = 0;
                canvas.drawRoundRect(this.h0, f10, f10, this.o0);
                i5 = this.y;
                if (i5 < 8) {
                    this.y = i5 + 1;
                    invalidate();
                } else {
                    this.y = 0;
                    H(2, BUTTON_COLOR_INSIDE_NONE, i4);
                }
            } else if (i6 == 6) {
                RectF rectF4 = this.f0;
                int i14 = this.t;
                canvas.drawRoundRect(rectF4, i14, i14, this.m0);
                int i15 = BUTTON_SHAPE_DIAL_NONE.equals(this.U) ? this.u : this.v;
                float f11 = i15 - (this.w / 2);
                float f12 = (i15 - this.x) / 8.0f;
                float f13 = f11 / 8.0f;
                int i16 = i15 / 2;
                float width3 = ((getWidth() / 2) - i16) - (this.z * f13);
                float height3 = ((getHeight() / 2) - i16) - (this.z * f13);
                float width4 = (getWidth() / 2) + i16 + (this.z * f13);
                float height4 = (getHeight() / 2) + i16;
                int i17 = this.z;
                float f14 = i15 + (i17 * f12);
                this.h0.set(width3, height3, width4, height4 + (i17 * f13));
                int i18 = this.N;
                if (i18 == 0) {
                    this.j0.setAlpha(255);
                    this.o0 = this.j0;
                    str = BUTTON_COLOR_INSIDE_GREY;
                } else if (1 == i18) {
                    this.k0.setAlpha(255);
                    this.o0 = this.k0;
                } else {
                    this.j0.setAlpha(255);
                    this.o0 = this.j0;
                    str = BUTTON_COLOR_INSIDE_NONE;
                }
                canvas.drawRoundRect(this.h0, f14, f14, this.o0);
                int i19 = this.z;
                if (i19 < 8) {
                    this.z = i19 + 1;
                    invalidate();
                } else {
                    this.z = 0;
                    J(1, str);
                }
            } else if (7 == i6) {
                x(canvas, true);
                float f15 = this.w / 8.0f;
                int i20 = this.y;
                float f16 = i20 * f15;
                float f17 = i20 * (this.x / 8.0f);
                float f18 = f16 / 2.0f;
                this.h0.set((getWidth() / 2) - f18, (getHeight() / 2) - f18, (getWidth() / 2) + f18, (getHeight() / 2) + f18);
                int i21 = this.N;
                if (i21 != 0 && 1 == i21) {
                    this.k0.setAlpha(255);
                    this.o0 = this.k0;
                } else {
                    this.j0.setAlpha(255);
                    this.o0 = this.j0;
                }
                canvas.drawRoundRect(this.h0, f17, f17, this.o0);
                int i22 = this.y;
                if (i22 < 8) {
                    this.y = i22 + 1;
                    invalidate();
                } else {
                    this.y = 0;
                    setButtonTypeAndInvalidate(3);
                }
            } else if (8 == i6) {
                RectF rectF5 = this.f0;
                int i23 = this.t;
                canvas.drawRoundRect(rectF5, i23, i23, this.m0);
                int i24 = this.w;
                int i25 = this.z;
                int i26 = this.x;
                float f19 = i26 - (i25 * (i26 / 8.0f));
                float f20 = (i24 - (i25 * (i24 / 8.0f))) / 2.0f;
                this.h0.set((getWidth() / 2) - f20, (getHeight() / 2) - f20, (getWidth() / 2) + f20, (getHeight() / 2) + f20);
                if (BUTTON_COLOR_INSIDE_GREY.equals(this.T)) {
                    this.l0.setAlpha(51);
                    this.o0 = this.l0;
                } else {
                    if (BUTTON_COLOR_INSIDE_RED.equals(this.T)) {
                        this.k0.setAlpha(255);
                        this.o0 = this.k0;
                        i2 = 1;
                    }
                    canvas.drawRoundRect(this.h0, f19, f19, this.o0);
                    i3 = this.z;
                    if (i3 < 8) {
                        this.z = i3 + 1;
                        invalidate();
                    } else {
                        this.z = 0;
                        I(4, i2);
                    }
                }
                i2 = 0;
                canvas.drawRoundRect(this.h0, f19, f19, this.o0);
                i3 = this.z;
                if (i3 < 8) {
                    this.z = i3 + 1;
                    invalidate();
                } else {
                    this.z = 0;
                    I(4, i2);
                }
            } else if (9 == i6) {
                x(canvas, true);
                int i27 = this.N;
                if (i27 != 0 && 1 == i27) {
                    this.k0.setAlpha(255);
                    this.o0 = this.k0;
                } else {
                    this.j0.setAlpha(255);
                    this.o0 = this.j0;
                }
                RectF rectF6 = this.g0;
                int i28 = this.x;
                canvas.drawRoundRect(rectF6, i28, i28, this.o0);
            } else if (10 == i6) {
                this.m0.setAlpha(255);
                RectF rectF7 = this.f0;
                int i29 = this.t;
                canvas.drawRoundRect(rectF7, i29, i29, this.m0);
                float f21 = this.w / 8.0f;
                int i30 = this.y;
                float f22 = i30 * f21;
                float f23 = i30 * (this.x / 8.0f);
                float f24 = f22 / 2.0f;
                this.h0.set((getWidth() / 2) - f24, (getHeight() / 2) - f24, (getWidth() / 2) + f24, (getHeight() / 2) + f24);
                int i31 = this.N;
                if (i31 != 0 && 1 == i31) {
                    this.k0.setAlpha(255);
                    this.o0 = this.k0;
                } else {
                    this.j0.setAlpha(255);
                    this.o0 = this.j0;
                }
                canvas.drawRoundRect(this.h0, f23, f23, this.o0);
                int i32 = this.y;
                if (i32 < 8) {
                    this.y = i32 + 1;
                    invalidate();
                } else {
                    this.y = 0;
                    setButtonTypeAndInvalidate(9);
                }
            } else if (11 == i6) {
                x(canvas, true);
                int i33 = this.w;
                int i34 = this.z;
                int i35 = this.x;
                float f25 = i35 - (i34 * (i35 / 8.0f));
                float f26 = (i33 - (i34 * (i33 / 8.0f))) / 2.0f;
                this.h0.set((getWidth() / 2) - f26, (getHeight() / 2) - f26, (getWidth() / 2) + f26, (getHeight() / 2) + f26);
                int i36 = this.N;
                if (i36 != 0 && 1 == i36) {
                    this.k0.setAlpha(255);
                    this.o0 = this.k0;
                } else {
                    this.j0.setAlpha(255);
                    this.o0 = this.j0;
                }
                canvas.drawRoundRect(this.h0, f25, f25, this.o0);
                int i37 = this.z;
                if (i37 < 8) {
                    this.z = i37 + 1;
                    invalidate();
                } else {
                    this.z = 0;
                    setButtonTypeAndInvalidate(1);
                }
            } else if (i6 == 12) {
                this.m0.setAlpha(128);
                RectF rectF8 = this.f0;
                int i38 = this.t;
                canvas.drawRoundRect(rectF8, i38, i38, this.m0);
                this.i0.setStrokeWidth(this.H);
                canvas.drawArc(this.f0, -90.0f, this.I, false, this.i0);
                int i39 = this.N;
                if (i39 != 0 && 1 == i39) {
                    this.k0.setAlpha(255);
                    this.o0 = this.k0;
                } else {
                    this.j0.setAlpha(255);
                    this.o0 = this.j0;
                }
                RectF rectF9 = this.g0;
                int i40 = this.x;
                canvas.drawRoundRect(rectF9, i40, i40, this.o0);
                if (this.I >= 360) {
                    this.I = 0;
                    setButtonTypeAndInvalidate(11);
                }
            } else if (13 == i6) {
                this.m0.setAlpha(128);
                x(canvas, false);
                this.N = 2;
                int i41 = this.y;
                if (i41 < 8) {
                    this.y = i41 + 1;
                    invalidate();
                } else {
                    this.y = 0;
                    setButtonTypeAndInvalidate(3);
                }
            }
        }
        G(canvas);
    }

    public void setButtonType(int i2) {
        ltl.h(TAG, "setButtonType, type: " + this.s + " => " + i2);
        this.s = i2;
        if (i2 == 12) {
            this.I = 0;
        }
        if (this.z != 0) {
            this.z = 0;
        }
    }

    public void setButtonTypeAndInvalidate(qeb qebVar) {
        ltl.h(TAG, "setButtonTypeAndInvalidate, mShutterButtonType: " + qebVar.d() + ", mInfoInsideColor: " + qebVar.a() + ", mRingShape: " + qebVar.c() + ", mInfoInsideRectColor: " + qebVar.b());
        if (this.s != 4 && F()) {
            this.V = false;
            u();
        }
        v();
        this.T = qebVar.a();
        this.U = qebVar.c();
        this.N = qebVar.b();
        setButtonType(qebVar.d());
        int i2 = this.s;
        if (i2 == 3) {
            N();
            return;
        }
        if (i2 == 4) {
            D();
        } else if (i2 == 5 && BUTTON_SHAPE_DIAL_ROTATE.equals(this.U)) {
            M();
        } else {
            invalidate();
        }
    }

    public void setCurrentGlobalAngle(float f2) {
        this.Q = f2;
        invalidate();
    }

    public void setCurrentSweepAngle(float f2) {
        this.R = f2;
        invalidate();
    }

    public void setDialValue(int i2) {
        this.F = i2;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.x0 == null || this.w0 == null) {
            ltl.h(TAG, "setPressed, return because Animator is null");
            return;
        }
        boolean z2 = z != isPressed();
        super.setPressed(z);
        if (z2) {
            t();
            if (isPressed()) {
                float f2 = this.O;
                int i2 = this.t;
                if (f2 <= i2) {
                    f2 = i2;
                }
                this.w0.setFloatValues(f2, this.G);
                ValueAnimator valueAnimator = this.x0;
                int i3 = this.G;
                valueAnimator.setDuration((long) (((i3 - f2) * 100.0f) / (i3 - this.t)));
                this.w0.start();
            } else {
                float f3 = this.O;
                int i4 = this.t;
                if (f3 <= i4) {
                    f3 = i4;
                }
                this.x0.setFloatValues(f3, i4);
                ValueAnimator valueAnimator2 = this.x0;
                int i5 = this.t;
                valueAnimator2.setDuration((long) (((f3 - i5) * 100.0f) / (this.G - i5)));
                this.x0.start();
            }
            invalidate();
        }
    }

    public void setShutterButtonProgress(float f2) {
        if (this.s != 12) {
            ltl.b(TAG, "setShutterButtonProgress, button type is error, mButtonType: " + this.s);
            return;
        }
        ltl.h(TAG, "setShutterButtonProgress, progress: " + f2);
        int i2 = (int) (f2 * 360.0f);
        this.I = i2;
        if (i2 > 360) {
            this.I = 360;
        }
        invalidate();
    }

    public void setShutterButtonTime(int i2) {
        this.E = i2;
    }

    public final void t() {
        ValueAnimator valueAnimator = this.w0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.w0.cancel();
        }
        ValueAnimator valueAnimator2 = this.x0;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            return;
        }
        this.x0.cancel();
    }

    public final void u() {
        ObjectAnimator objectAnimator = this.c0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.b0;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
    }

    public final void v() {
        ValueAnimator valueAnimator = this.v0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.v0.cancel();
    }

    public final void w(Canvas canvas, boolean z) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.rotate(180.0f);
        int i2 = 0;
        while (i2 < 60) {
            if (!z || i2 % 5 == 0) {
                int i3 = this.v;
                int i4 = this.M;
                canvas.drawLine(0.0f, i3 + i4, 0.0f, i3 + i4 + this.L, this.n0);
            } else {
                int i5 = this.F;
                if (i5 <= 60 || i5 == 0) {
                    int i6 = i2 == i5 ? this.M : this.K;
                    int i7 = i2 == i5 ? this.L : this.J;
                    if (i2 >= i5) {
                        int i8 = this.v;
                        canvas.drawLine(0.0f, i8 + i6, 0.0f, i8 + i6 + i7, this.n0);
                    }
                } else {
                    int i9 = i2 == i5 + (-60) ? this.M : this.K;
                    int i10 = i2 == i5 + (-60) ? this.L : this.J;
                    if (i2 <= i5 - 60 || i5 == 0) {
                        int i11 = this.v;
                        canvas.drawLine(0.0f, i11 + i9, 0.0f, i11 + i9 + i10, this.n0);
                    }
                }
            }
            canvas.rotate(6.0f, 0.0f, 0.0f);
            i2++;
        }
        canvas.restore();
    }

    public final void x(Canvas canvas, boolean z) {
        if (BUTTON_COLOR_INSIDE_RED.equals(this.T)) {
            this.k0.setAlpha(255);
            this.o0 = this.k0;
        } else if (BUTTON_COLOR_INSIDE_GREY.equals(this.T)) {
            this.l0.setAlpha(51);
            this.o0 = this.l0;
        }
        if (z) {
            if (isPressed()) {
                Paint paint = this.o0;
                if (paint != null) {
                    paint.setAlpha(51);
                }
                this.m0.setAlpha(128);
            } else {
                this.m0.setAlpha(255);
            }
        }
        if (!BUTTON_COLOR_INSIDE_NONE.equals(this.T) && this.o0 != null) {
            float f2 = BUTTON_SHAPE_DIAL_NONE.equals(this.U) ? this.u : this.v;
            canvas.drawRoundRect(BUTTON_SHAPE_DIAL_NONE.equals(this.U) ? this.d0 : this.e0, f2, f2, this.o0);
        }
        RectF rectF = this.f0;
        int i2 = this.t;
        canvas.drawRoundRect(rectF, i2, i2, this.m0);
    }

    public void y(Context context, AttributeSet attributeSet, int i2) {
        setButtonTypeAndInvalidate(new qeb(1, BUTTON_COLOR_INSIDE_NONE, BUTTON_SHAPE_DIAL_NONE));
        z(context, attributeSet, i2);
    }

    public final void z(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MainShutterButton, i2, 0);
        Resources resources = context.getResources();
        try {
            try {
                this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MainShutterButton_outside_circle_radius, resources.getDimensionPixelSize(R$dimen.watch_face_shutter_button_big_circle_radius));
                this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MainShutterButton_inside_circle_radius, resources.getDimensionPixelSize(R$dimen.watch_face_shutter_button_small_circle_radius));
                this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MainShutterButton_inside_rec_length, resources.getDimensionPixelSize(R$dimen.watch_face_shutter_button_inside_rect_length));
                this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MainShutterButton_inside_rec_corner_radius, resources.getDimensionPixelSize(R$dimen.watch_face_shutter_button_inside_rect_corner_radius));
                this.A = typedArrayObtainStyledAttributes.getInt(R$styleable.MainShutterButton_angleAnimationDurationMillis, 2000);
                this.B = typedArrayObtainStyledAttributes.getInt(R$styleable.MainShutterButton_sweepAnimationDurationMillis, 900);
                int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.MainShutterButton_minSweepAngle, 30);
                this.C = i3;
                this.S = 360 - (i3 * 2);
                this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MainShutterButton_bottom_circle_radius_scaled, resources.getDimensionPixelSize(R$dimen.watch_face_shutter_button_big_circle_radius_scaled));
            } catch (Exception e2) {
                ltl.h(TAG, "initAttributes " + e2.getMessage());
            }
            typedArrayObtainStyledAttributes.recycle();
            this.H = this.t - this.u;
            Paint paint = new Paint();
            this.i0 = paint;
            paint.setAntiAlias(true);
            this.i0.setStyle(Paint.Style.STROKE);
            this.i0.setStrokeWidth(this.H);
            this.i0.setColor(-1);
            Paint paint2 = new Paint();
            this.j0 = paint2;
            paint2.setAntiAlias(true);
            this.j0.setStyle(Paint.Style.FILL);
            this.j0.setColor(-1);
            this.j0.setAlpha(128);
            Paint paint3 = new Paint();
            this.k0 = paint3;
            paint3.setAntiAlias(true);
            this.k0.setStyle(Paint.Style.FILL);
            this.k0.setColor(D0);
            Paint paint4 = new Paint();
            this.l0 = paint4;
            paint4.setAntiAlias(true);
            this.l0.setStyle(Paint.Style.FILL);
            this.l0.setColor(-1);
            this.l0.setAlpha(51);
            Paint paint5 = new Paint();
            this.m0 = paint5;
            paint5.setAntiAlias(true);
            this.m0.setStyle(Paint.Style.STROKE);
            this.m0.setStrokeWidth(this.H);
            this.m0.setColor(-1);
            Paint paint6 = new Paint();
            this.n0 = paint6;
            paint6.setAntiAlias(true);
            this.n0.setStyle(Paint.Style.FILL);
            this.n0.setColor(-1);
            L();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setButtonTypeAndInvalidate(int i2) {
        ltl.h(TAG, "setButtonTypeAndInvalidate, buttonType: " + i2);
        if (this.s != 4 && F()) {
            this.V = false;
            u();
        }
        v();
        setButtonType(i2);
        int i3 = this.s;
        if (i3 == 3) {
            N();
            return;
        }
        if (i3 == 4) {
            D();
        } else if (i3 == 5 && BUTTON_SHAPE_DIAL_ROTATE.equals(this.U)) {
            M();
        } else {
            invalidate();
        }
    }

    public MainShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = 1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 8;
        this.K = 6;
        this.L = 11;
        this.M = 3;
        this.N = 0;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = null;
        this.U = null;
        this.V = false;
        this.W = true;
        this.a0 = true;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        y(context, attributeSet, 0);
    }

    public MainShutterButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.s = 1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 8;
        this.K = 6;
        this.L = 11;
        this.M = 3;
        this.N = 0;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = null;
        this.U = null;
        this.V = false;
        this.W = true;
        this.a0 = true;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        y(context, attributeSet, i2);
    }
}
