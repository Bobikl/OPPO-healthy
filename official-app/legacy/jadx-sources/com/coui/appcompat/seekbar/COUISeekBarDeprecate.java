package com.coui.appcompat.seekbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.AbsSeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.oplus.aiunit.vision.b85;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.d01;
import com.oplus.aiunit.vision.ft7;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.im2;
import com.oplus.aiunit.vision.kki;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.mki;
import com.oplus.aiunit.vision.osj;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.pki;
import com.oplus.aiunit.vision.pt7;
import com.oplus.aiunit.vision.s50;
import com.oplus.aiunit.vision.sh2;
import com.oplus.aiunit.vision.ski;
import com.oplus.aiunit.vision.u50;
import com.oplus.aiunit.vision.vie;
import com.oplus.aiunit.vision.wvk;
import com.oplus.graphics.OplusCanvas;
import com.oplus.graphics.OplusPath;
import com.oplus.os.LinearmotorVibrator;
import com.support.seekbar.R$attr;
import com.support.seekbar.R$color;
import com.support.seekbar.R$dimen;
import com.support.seekbar.R$style;
import com.support.seekbar.R$styleable;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 22)
@Deprecated
public class COUISeekBarDeprecate extends AbsSeekBar implements s50, u50 {
    public static final int MOVE_BY_DEFAULT = 0;
    public static final int MOVE_BY_DISTANCE = 2;
    public static final int MOVE_BY_FINGER = 1;
    public static final Interpolator i1 = new hj2();
    public static final Interpolator j1 = new sh2();
    public int A;
    public boolean A0;
    public int B;
    public kki B0;
    public float C;
    public int C0;
    public float D;
    public boolean D0;
    public float E;
    public RectF E0;
    public float F;
    public int F0;
    public float G;
    public j G0;
    public float H;
    public int H0;
    public float I;
    public float I0;
    public float J;
    public mki J0;
    public float K;
    public VelocityTracker K0;
    public float L;
    public boolean L0;
    public float M;
    public float M0;
    public float N;
    public Interpolator N0;
    public boolean O;
    public int O0;
    public float P;
    public String P0;
    public float Q;
    public int Q0;
    public float R;
    public osj R0;
    public float S;
    public boolean S0;
    public float T;
    public ExecutorService T0;
    public Bitmap U;
    public int U0;
    public boolean V;
    public int V0;
    public TextPaint W;
    public int W0;
    public int X0;
    public vie Y0;
    public ft7 Z0;
    public Paint.FontMetricsInt a0;
    public pt7 a1;
    public String b0;
    public float b1;
    public int c0;
    public float c1;
    public float d0;
    public float d1;
    public boolean e0;
    public float e1;
    public boolean f0;
    public int f1;
    public float g0;
    public float g1;
    public float h0;
    public float h1;
    public float i;
    public float i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2050j;
    public float j0;
    public boolean k;
    public float k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2051l;
    public float l0;
    public Object m;
    public Interpolator m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2052n;
    public Path n0;
    public float o;
    public RectF o0;
    public int p;
    public RectF p0;
    public int q;
    public RectF q0;
    public int r;
    public AnimatorSet r0;
    public int s;
    public AnimatorSet s0;
    public int t;
    public float t0;
    public boolean u;
    public Paint u0;
    public ColorStateList v;
    public float v0;
    public ColorStateList w;
    public Interpolator w0;
    public ColorStateList x;
    public Interpolator x0;
    public int y;
    public float y0;
    public int z;
    public boolean z0;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int mSaveProgress;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mSaveProgress);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mSaveProgress = parcel.readInt();
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUISeekBarDeprecate.this.O(valueAnimator);
            COUISeekBarDeprecate.this.invalidate();
        }
    }

    public class b implements pki {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.pki
        public void onSpringActivate(kki kkiVar) {
        }

        @Override // com.oplus.aiunit.vision.pki
        public void onSpringAtRest(kki kkiVar) {
        }

        @Override // com.oplus.aiunit.vision.pki
        public void onSpringEndStateChange(kki kkiVar) {
        }

        @Override // com.oplus.aiunit.vision.pki
        public void onSpringUpdate(kki kkiVar) {
            if (COUISeekBarDeprecate.this.I0 != kkiVar.e()) {
                if (COUISeekBarDeprecate.this.isEnabled()) {
                    COUISeekBarDeprecate.this.I0 = (float) kkiVar.c();
                } else {
                    COUISeekBarDeprecate.this.I0 = 0.0f;
                }
                COUISeekBarDeprecate.this.invalidate();
            }
        }
    }

    public class c implements Animator.AnimatorListener {
        public final /* synthetic */ boolean i;

        public c(boolean z) {
            this.i = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            COUISeekBarDeprecate.c(COUISeekBarDeprecate.this);
            COUISeekBarDeprecate.this.Q(this.i);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUISeekBarDeprecate.c(COUISeekBarDeprecate.this);
            COUISeekBarDeprecate.this.Q(this.i);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            COUISeekBarDeprecate.this.P(this.i);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f2054j;

        public d(float f, int i) {
            this.i = f;
            this.f2054j = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            COUISeekBarDeprecate.this.setLocalProgress((int) (fFloatValue / this.i));
            COUISeekBarDeprecate cOUISeekBarDeprecate = COUISeekBarDeprecate.this;
            cOUISeekBarDeprecate.i = (fFloatValue - (cOUISeekBarDeprecate.t * this.i)) / this.f2054j;
            cOUISeekBarDeprecate.invalidate();
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUISeekBarDeprecate.this.M = ((Float) valueAnimator.getAnimatedValue("progressRadius")).floatValue();
            COUISeekBarDeprecate.this.G = ((Float) valueAnimator.getAnimatedValue("backgroundRadius")).floatValue();
            COUISeekBarDeprecate.this.L = ((Float) valueAnimator.getAnimatedValue("progressHeight")).floatValue();
            COUISeekBarDeprecate.this.F = ((Float) valueAnimator.getAnimatedValue("backgroundHeight")).floatValue();
            COUISeekBarDeprecate.this.T = ((Float) valueAnimator.getAnimatedValue("animatePadding")).floatValue();
            COUISeekBarDeprecate.this.invalidate();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUISeekBarDeprecate cOUISeekBarDeprecate = COUISeekBarDeprecate.this;
            if (cOUISeekBarDeprecate.u) {
                cOUISeekBarDeprecate.performHapticFeedback(305, 0);
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUISeekBarDeprecate cOUISeekBarDeprecate = COUISeekBarDeprecate.this;
            if (cOUISeekBarDeprecate.u) {
                LinearmotorVibrator linearmotorVibrator = (LinearmotorVibrator) cOUISeekBarDeprecate.m;
                int i = cOUISeekBarDeprecate.p;
                int i2 = cOUISeekBarDeprecate.t;
                wvk.j(linearmotorVibrator, 152, i - i2, cOUISeekBarDeprecate.s - i2, 200, 2000);
            }
        }
    }

    public interface h {
    }

    public interface i {
    }

    public final class j extends ExploreByTouchHelper {
        public Rect i;

        public j(View view) {
            super(view);
            this.i = new Rect();
        }

        public final Rect getBoundsForVirtualView(int i) {
            Rect rect = this.i;
            rect.left = 0;
            rect.top = 0;
            rect.right = COUISeekBarDeprecate.this.getWidth();
            rect.bottom = COUISeekBarDeprecate.this.getHeight();
            return rect;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            return (f < 0.0f || f > ((float) COUISeekBarDeprecate.this.getWidth()) || f2 < 0.0f || f2 > ((float) COUISeekBarDeprecate.this.getHeight())) ? -1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            list.add(0);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, COUISeekBarDeprecate.this.getMin(), COUISeekBarDeprecate.this.getMax(), COUISeekBarDeprecate.this.p));
            if (COUISeekBarDeprecate.this.isEnabled()) {
                int progress = COUISeekBarDeprecate.this.getProgress();
                if (progress > COUISeekBarDeprecate.this.getMin()) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (progress < COUISeekBarDeprecate.this.getMax()) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            sendEventForVirtualView(i, 4);
            return false;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.getText().add(j.class.getSimpleName());
            accessibilityEvent.setItemCount(COUISeekBarDeprecate.this.getMax() - COUISeekBarDeprecate.this.getMin());
            accessibilityEvent.setCurrentItemIndex(COUISeekBarDeprecate.this.getProgress());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setClassName(COUISeekBarDeprecate.class.getName());
            accessibilityNodeInfoCompat.setBoundsInParent(getBoundsForVirtualView(i));
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (!COUISeekBarDeprecate.this.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                COUISeekBarDeprecate cOUISeekBarDeprecate = COUISeekBarDeprecate.this;
                cOUISeekBarDeprecate.X(cOUISeekBarDeprecate.getProgress() + COUISeekBarDeprecate.this.C0, false, true);
                COUISeekBarDeprecate cOUISeekBarDeprecate2 = COUISeekBarDeprecate.this;
                cOUISeekBarDeprecate2.announceForAccessibility(cOUISeekBarDeprecate2.P0);
                return true;
            }
            if (i != 8192) {
                return false;
            }
            COUISeekBarDeprecate cOUISeekBarDeprecate3 = COUISeekBarDeprecate.this;
            cOUISeekBarDeprecate3.X(cOUISeekBarDeprecate3.getProgress() - COUISeekBarDeprecate.this.C0, false, true);
            COUISeekBarDeprecate cOUISeekBarDeprecate4 = COUISeekBarDeprecate.this;
            cOUISeekBarDeprecate4.announceForAccessibility(cOUISeekBarDeprecate4.P0);
            return true;
        }
    }

    public COUISeekBarDeprecate(Context context) {
        this(context, null);
    }

    public static /* synthetic */ i c(COUISeekBarDeprecate cOUISeekBarDeprecate) {
        cOUISeekBarDeprecate.getClass();
        return null;
    }

    private float getDeformationFlingScale() {
        float f2 = this.i;
        if (f2 > 1.0f) {
            return ((f2 - 1.0f) / 5.0f) + 1.0f;
        }
        return f2 < 0.0f ? f2 / 5.0f : f2;
    }

    @NonNull
    private kki getFastMoveSpring() {
        if (this.B0 == null) {
            E();
        }
        return this.B0;
    }

    private float getHeightBottomDeformedValue() {
        float f2;
        float f3;
        if (L()) {
            f2 = this.j0;
            f3 = this.g0;
        } else {
            f2 = this.g0;
            f3 = this.j0;
        }
        return f2 - f3;
    }

    private float getHeightTopDeformedValue() {
        float f2;
        float f3;
        if (L()) {
            f2 = this.k0;
            f3 = this.h0;
        } else {
            f2 = this.h0;
            f3 = this.k0;
        }
        return f2 - f3;
    }

    private int getNormalSeekBarWidth() {
        return (int) (((getWidth() - getStart()) - getEnd()) - (this.S * 2.0f));
    }

    private void setDeformationScale(float f2) {
        if (f2 > 1.0f) {
            f2 = ((f2 - 1.0f) * 5.0f) + 1.0f;
        } else if (f2 < 0.0f) {
            f2 *= 5.0f;
        }
        this.i = Math.max(-1.0f, Math.min(f2, 2.0f));
    }

    private void setFlingScale(float f2) {
        if (!this.f0) {
            this.i = Math.max(0.0f, Math.min(f2, 1.0f));
        } else {
            i(f2);
            setDeformationScale(f2);
        }
    }

    private void setTouchScale(float f2) {
        if (!this.f0) {
            this.i = Math.max(0.0f, Math.min(f2, 1.0f));
        } else {
            this.i = Math.max(-1.0f, Math.min(f2, 2.0f));
            j();
        }
    }

    public void A(MotionEvent motionEvent) {
        float seekBarWidth = getSeekBarWidth();
        int i2 = this.s;
        int i3 = this.t;
        int i4 = i2 - i3;
        float f2 = (i4 > 0 ? (this.p * seekBarWidth) / i4 : 0.0f) + i3;
        if (this.L0 && Float.compare(f2, seekBarWidth / 2.0f) == 0 && Math.abs(motionEvent.getX() - this.t0) < 20.0f) {
            return;
        }
        if (this.u && this.D0) {
            int i5 = this.F0;
            if (i5 != 0) {
                if (i5 == 1) {
                    i0(motionEvent);
                    return;
                } else if (i5 != 2) {
                    return;
                }
            }
            h0(motionEvent);
            return;
        }
        if (N(motionEvent)) {
            float x = motionEvent.getX();
            if (Math.abs(x - this.o) > this.f2052n) {
                c0();
                Z();
                e0();
                this.t0 = x;
                if (M()) {
                    J(motionEvent);
                }
            }
        }
    }

    public void B(MotionEvent motionEvent) {
        getFastMoveSpring().o(0.0d);
        if (!this.u) {
            if (isEnabled() && f0(motionEvent, this) && M()) {
                f(motionEvent.getX());
                return;
            }
            return;
        }
        this.u = false;
        this.D0 = false;
        bj2.d("COUISeekBarDeprecate", "handleMotionEventUp mFlingVelocity = " + this.b1);
        if (!this.S0 || Math.abs(this.b1) < 100.0f) {
            float f2 = this.i;
            if (f2 >= 0.0f) {
                int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            }
            t();
        } else {
            u(this.b1);
        }
        setPressed(false);
        U();
    }

    public final void C() {
    }

    public final void D() {
        this.r0.setInterpolator(j1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(183L);
        valueAnimatorOfFloat.addUpdateListener(new a());
        this.r0.play(valueAnimatorOfFloat);
    }

    public final void E() {
        if (this.B0 != null) {
            return;
        }
        kki kkiVarC = ski.g().c();
        this.B0 = kkiVarC;
        kkiVarC.p(this.J0);
        this.B0.a(new b());
    }

    public final void F() {
        VelocityTracker velocityTracker = this.K0;
        if (velocityTracker == null) {
            this.K0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void G(Context context) {
        this.Y0 = vie.e(context);
        this.a1 = new pt7(0.0f);
        int normalSeekBarWidth = getNormalSeekBarWidth();
        bj2.d("COUISeekBarDeprecate", "COUISeekBarDeprecate initPhysicsAnimator : setActiveFrame:" + normalSeekBarWidth);
        ft7 ft7Var = (ft7) ((ft7) new ft7(4, 0.0f, (float) normalSeekBarWidth).J(this.a1)).A(this.c1, this.d1).b(null);
        this.Z0 = ft7Var;
        ft7Var.j0(this.e1);
        this.Y0.c(this.Z0);
        this.Y0.a(this.Z0, this);
        this.Y0.b(this.Z0, this);
    }

    public final void H() {
        if (this.K0 == null) {
            this.K0 = VelocityTracker.obtain();
        }
    }

    public final void I() {
        this.f2052n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        j jVar = new j(this);
        this.G0 = jVar;
        ViewCompat.setAccessibilityDelegate(this, jVar);
        ViewCompat.setImportantForAccessibility(this, 1);
        this.G0.invalidateRoot();
        Paint paint = new Paint();
        this.u0 = paint;
        paint.setAntiAlias(true);
        this.u0.setDither(true);
        TextPaint textPaint = new TextPaint(1);
        this.W = textPaint;
        textPaint.setAntiAlias(true);
        this.W.setTextSize(getResources().getDimensionPixelSize(R$dimen.coui_seekbar_text_size));
        this.W.setShadowLayer(25.0f, 0.0f, 8.0f, this.c0);
        this.W.setTypeface(Typeface.DEFAULT_BOLD);
        this.a0 = this.W.getFontMetricsInt();
        Y();
    }

    public final void J(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float seekBarWidth = getSeekBarWidth();
        float f2 = this.M;
        float f3 = seekBarWidth + (2.0f * f2);
        float f4 = this.T - f2;
        this.i = Math.max(0.0f, Math.min(L() ? (((getWidth() - x) - getStart()) - f4) / f3 : ((x - getStart()) - f4) / f3, 1.0f));
        int iW = w(Math.round((this.i * (getMax() - getMin())) + getMin()));
        int i2 = this.p;
        int i3 = this.r;
        setLocalProgress(iW);
        invalidate();
        if (i2 == this.p || i3 == this.r) {
            return;
        }
        S();
    }

    public final boolean K() {
        vie vieVar;
        if (this.f0) {
            float f2 = this.i;
            if ((f2 > 1.0f || f2 < 0.0f) && (vieVar = this.Y0) != null && vieVar.q()) {
                return true;
            }
        }
        return false;
    }

    public boolean L() {
        return getLayoutDirection() == 1;
    }

    public final boolean M() {
        return this.F0 != 2;
    }

    public final boolean N(MotionEvent motionEvent) {
        if (this.f0) {
            float f2 = this.i;
            if (f2 > 1.0f || f2 < 0.0f) {
                return g0(motionEvent, this);
            }
        }
        return f0(motionEvent, this);
    }

    public void O(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f2 = this.D;
        float f3 = this.H;
        this.G = f2 + (((f2 * f3) - f2) * animatedFraction);
        float f4 = this.J;
        float f5 = this.N;
        this.M = f4 + (((f4 * f5) - f4) * animatedFraction);
        float f6 = this.C;
        this.F = f6 + (((f3 * f6) - f6) * animatedFraction);
        float f7 = this.I;
        this.L = f7 + (((f5 * f7) - f7) * animatedFraction);
        float f8 = this.S;
        this.T = f8 + (animatedFraction * ((this.y0 * f8) - f8));
    }

    public void P(boolean z) {
        this.u = true;
        this.D0 = true;
    }

    public void Q(boolean z) {
        this.u = false;
        this.D0 = false;
    }

    public boolean R() {
        if (this.m == null) {
            LinearmotorVibrator linearmotorVibratorE = wvk.e(getContext());
            this.m = linearmotorVibratorE;
            this.f2051l = linearmotorVibratorE != null;
        }
        if (this.m == null) {
            return false;
        }
        if (this.r == getMax() || this.r == getMin()) {
            LinearmotorVibrator linearmotorVibrator = (LinearmotorVibrator) this.m;
            int i2 = this.r;
            int i3 = this.t;
            wvk.j(linearmotorVibrator, 154, i2 - i3, this.s - i3, 800, 1200);
        } else {
            if (this.T0 == null) {
                this.T0 = Executors.newSingleThreadExecutor();
            }
            this.T0.execute(new g());
        }
        return true;
    }

    public void S() {
        if (this.f2050j) {
            if (this.f2051l && this.k && R()) {
                return;
            }
            if (this.r == getMax() || this.r == getMin()) {
                performHapticFeedback(306, 0);
                return;
            }
            if (this.T0 == null) {
                this.T0 = Executors.newSingleThreadExecutor();
            }
            this.T0.execute(new f());
        }
    }

    public final void T() {
        VelocityTracker velocityTracker = this.K0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K0 = null;
        }
    }

    public void U() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(PropertyValuesHolder.ofFloat("progressRadius", this.M, this.J), PropertyValuesHolder.ofFloat("backgroundRadius", this.G, this.D), PropertyValuesHolder.ofFloat("progressHeight", this.L, this.I), PropertyValuesHolder.ofFloat("backgroundHeight", this.F, this.C), PropertyValuesHolder.ofFloat("animatePadding", this.T, this.S));
        valueAnimator.setDuration(183L);
        valueAnimator.setInterpolator(j1);
        valueAnimator.addUpdateListener(new e());
        this.r0.cancel();
        valueAnimator.start();
    }

    public final void V() {
        if (this.f0) {
            this.h0 = 0.0f;
            this.g0 = 0.0f;
            this.i0 = 0.0f;
            this.k0 = 0.0f;
            this.j0 = 0.0f;
            C();
        }
    }

    public final void W() {
        if (this.O) {
            this.J = this.D;
            this.K = this.E;
            this.I = this.C;
            this.N = this.H;
        }
    }

    public void X(int i2, boolean z, boolean z2) {
        this.q = this.p;
        int iMax = Math.max(this.t, Math.min(i2, this.s));
        if (this.q != iMax) {
            if (z) {
                b0(iMax, z2);
            } else {
                setLocalProgress(iMax);
                this.q = iMax;
                k0();
                invalidate();
            }
            V();
        }
    }

    public final void Y() {
        if (getThumb() != null) {
            this.U = r(getThumb());
        }
    }

    public void Z() {
        setPressed(true);
        P(true);
        g();
    }

    public final void a0(float f2) {
        kki fastMoveSpring = getFastMoveSpring();
        if (fastMoveSpring.c() == fastMoveSpring.e()) {
            int i2 = this.s - this.t;
            if (f2 >= 95.0f) {
                int i3 = this.p;
                float f3 = i2;
                if (i3 > 0.95f * f3 || i3 < f3 * 0.05f) {
                    return;
                }
                fastMoveSpring.o(1.0d);
                return;
            }
            if (f2 > -95.0f) {
                fastMoveSpring.o(0.0d);
                return;
            }
            int i4 = this.p;
            float f4 = i2;
            if (i4 > 0.95f * f4 || i4 < f4 * 0.05f) {
                return;
            }
            fastMoveSpring.o(-1.0d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    public void b0(int i2, boolean z) {
        long jAbs;
        Interpolator interpolator;
        AnimatorSet animatorSet = this.s0;
        if (animatorSet == null) {
            this.s0 = new AnimatorSet();
        } else {
            animatorSet.removeAllListeners();
            this.s0.cancel();
        }
        this.s0.addListener(new c(z));
        int i3 = this.p;
        int seekBarWidth = getSeekBarWidth();
        int i4 = this.s - this.t;
        float f2 = i4 > 0 ? seekBarWidth / i4 : 0.0f;
        if (f2 > 0.0f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i3 * f2, i2 * f2);
            if (z || (interpolator = this.m0) == null) {
                valueAnimatorOfFloat.setInterpolator(i1);
            } else {
                valueAnimatorOfFloat.setInterpolator(interpolator);
            }
            valueAnimatorOfFloat.addUpdateListener(new d(f2, seekBarWidth));
            if (z) {
                jAbs = (long) ((i4 > 0 ? Math.abs(i2 - i3) / i4 : 0.0f) * 483.0f);
                if (jAbs < 150) {
                    jAbs = 150;
                }
                this.s0.setDuration(jAbs);
            } else {
                float f3 = this.l0;
                if (f3 != -1.0f) {
                    this.s0.setDuration((long) f3);
                } else {
                    jAbs = (long) ((i4 > 0 ? Math.abs(i2 - i3) / i4 : 0.0f) * 483.0f);
                    if (jAbs < 150) {
                        jAbs = 150;
                    }
                    this.s0.setDuration(jAbs);
                }
            }
            this.s0.play(valueAnimatorOfFloat);
            this.s0.start();
        }
    }

    public final void c0() {
        if (K()) {
            d0();
        }
    }

    public void d0() {
        ft7 ft7Var;
        if (!this.S0 || this.Y0 == null || (ft7Var = this.Z0) == null) {
            return;
        }
        ft7Var.n0();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    public void e0() {
        if (this.r0.isRunning()) {
            this.r0.cancel();
        }
        this.r0.start();
    }

    public void f(float f2) {
        float seekBarWidth = getSeekBarWidth();
        float f3 = this.M;
        float f4 = seekBarWidth + (2.0f * f3);
        float f5 = this.T - f3;
        b0(w(Math.round(((L() ? (((getWidth() - f2) - getStart()) - f5) / f4 : ((f2 - getStart()) - f5) / f4) * (getMax() - getMin())) + getMin())), true);
    }

    public boolean f0(MotionEvent motionEvent, View view) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= ((float) view.getPaddingLeft()) && x <= ((float) (view.getWidth() - view.getPaddingRight())) && y >= 0.0f && y <= ((float) view.getHeight());
    }

    public final void g() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        }
    }

    public final boolean g0(MotionEvent motionEvent, View view) {
        float y = motionEvent.getY();
        return y >= 0.0f && y <= ((float) view.getHeight());
    }

    public int getEnd() {
        return getPaddingEnd();
    }

    public int getLabelHeight() {
        return this.R0.getIntrinsicHeight();
    }

    @Override // android.widget.ProgressBar
    public int getMax() {
        return this.s;
    }

    @Override // android.widget.ProgressBar
    public int getMin() {
        return this.t;
    }

    public float getMoveDamping() {
        return this.M0;
    }

    public int getMoveType() {
        return this.F0;
    }

    @Override // android.widget.ProgressBar
    public int getProgress() {
        return this.r;
    }

    public int getSeekBarCenterY() {
        return getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) >> 1);
    }

    public int getSeekBarWidth() {
        return (int) (((getWidth() - getStart()) - getEnd()) - (this.T * 2.0f));
    }

    public int getStart() {
        return getPaddingStart();
    }

    public final float h(float f2) {
        float f3 = this.M0;
        if (f3 != 0.0f) {
            return f3;
        }
        float seekBarWidth = getSeekBarWidth();
        float f4 = seekBarWidth / 2.0f;
        float interpolation = 1.0f - this.N0.getInterpolation(Math.abs(f2 - f4) / f4);
        if (f2 > seekBarWidth - getPaddingRight() || f2 < getPaddingLeft() || interpolation < 0.4f) {
            return 0.4f;
        }
        return interpolation;
    }

    public final void h0(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f2 = x - this.t0;
        int i2 = this.s - this.t;
        if (L()) {
            f2 = -f2;
        }
        float f3 = i2;
        setTouchScale((this.p / f3) + ((f2 * h(x)) / getSeekBarWidth()));
        int iW = w(Math.round((this.i * f3) + getMin()));
        int i3 = this.p;
        int i4 = this.r;
        setLocalProgress(iW);
        invalidate();
        if (i3 != this.p) {
            this.t0 = x;
            if (i4 != this.r) {
                S();
            }
        }
        VelocityTracker velocityTracker = this.K0;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(100);
            a0(this.K0.getXVelocity());
        }
    }

    public final void i(float f2) {
        if (f2 > 1.0f) {
            double d2 = f2 - 1.0f;
            this.g0 = l(d2, this.f1);
            this.h0 = l(d2, this.f1 + this.g1);
            this.i0 = l(d2, this.h1);
            C();
            return;
        }
        if (f2 >= 0.0f) {
            V();
            return;
        }
        double dAbs = Math.abs(f2);
        this.k0 = l(dAbs, this.f1);
        this.j0 = l(dAbs, this.f1 + this.g1);
        this.i0 = l(dAbs, this.h1);
        C();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    public final void i0(MotionEvent motionEvent) {
        int start;
        float f2;
        int iRound = Math.round(((motionEvent.getX() - this.t0) * h(motionEvent.getX())) + this.t0);
        int width = getWidth();
        int width2 = (getWidth() - getStart()) - getEnd();
        if (L()) {
            if (iRound > width - getStart()) {
                f2 = 0.0f;
            } else if (iRound < getEnd()) {
                f2 = 1.0f;
            } else {
                start = (width - iRound) - getEnd();
                f2 = start / width2;
            }
        } else if (iRound < getStart()) {
            f2 = 0.0f;
        } else if (iRound > width - getEnd()) {
            f2 = 1.0f;
        } else {
            start = iRound - getStart();
            f2 = start / width2;
        }
        this.i = Math.max(0.0f, Math.min(f2, 1.0f));
        int iW = w(Math.round((this.i * (getMax() - getMin())) + getMin()));
        int i2 = this.p;
        int i3 = this.r;
        setLocalProgress(iW);
        invalidate();
        if (i2 != this.p) {
            this.t0 = iRound;
            if (i3 != this.r) {
                S();
            }
        }
    }

    public final void j() {
        float f2 = this.i;
        if (f2 > 1.0f) {
            double d2 = (f2 - 1.0f) / 5.0f;
            this.g0 = l(d2, this.f1);
            this.h0 = l(d2, this.f1 + this.g1);
            this.i0 = l(d2, this.h1);
            C();
            return;
        }
        if (f2 < 0.0f) {
            double dAbs = Math.abs(f2) / 5.0f;
            this.k0 = l(dAbs, this.f1);
            this.j0 = l(dAbs, this.f1 + this.g1);
            this.i0 = l(dAbs, this.h1);
            C();
        }
    }

    public final void j0() {
        if (!this.S0 || this.Y0 == null || this.Z0 == null) {
            return;
        }
        int normalSeekBarWidth = getNormalSeekBarWidth();
        bj2.d("COUISeekBarDeprecate", "COUISeekBarDeprecate updateBehavior : setActiveFrame:" + normalSeekBarWidth);
        this.Z0.h0(0.0f, (float) normalSeekBarWidth);
    }

    public final void k() {
        int i2 = this.p;
        if (i2 <= this.t || i2 >= this.s) {
            return;
        }
        V();
    }

    public final void k0() {
        int i2 = this.s;
        int i3 = this.t;
        int i4 = i2 - i3;
        this.i = i4 > 0 ? (this.p - i3) / i4 : 0.0f;
    }

    public final float l(double d2, float f2) {
        return (float) (((double) f2) * (1.0d - Math.exp(d2 * (-11.5d))));
    }

    public void m(Canvas canvas, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float width;
        float fY;
        int seekBarCenterY = getSeekBarCenterY();
        if (this.A0) {
            float f8 = this.T;
            float f9 = this.P;
            float f10 = this.Q;
            f3 = ((f9 / 2.0f) - f10) + f8;
            float f11 = f2 - (f9 - (f10 * 2.0f));
            float f12 = this.M;
            float f13 = f8 - f12;
            f4 = f2 + (f12 * 2.0f);
            f5 = f11;
            f6 = f13;
        } else {
            float f14 = this.T;
            float f15 = this.M;
            f5 = f2 + (f15 * 2.0f);
            f6 = f14 - f15;
            f3 = f6;
            f4 = f5;
        }
        RectF rectF = this.o0;
        float f16 = seekBarCenterY;
        float f17 = this.L;
        float f18 = this.i0;
        rectF.top = (f16 - (f17 / 2.0f)) + f18;
        rectF.bottom = (f16 + (f17 / 2.0f)) - f18;
        if (this.L0) {
            if (L()) {
                width = getWidth() / 2.0f;
                fY = width - ((y(this.i) - 0.5f) * f5);
                RectF rectF2 = this.o0;
                float f19 = f4 / 2.0f;
                rectF2.left = width - f19;
                rectF2.right = f19 + width;
                f7 = fY;
            } else {
                float width2 = getWidth() / 2.0f;
                float fY2 = width2 + ((y(this.i) - 0.5f) * f5);
                RectF rectF3 = this.o0;
                float f20 = f4 / 2.0f;
                rectF3.left = width2 - f20;
                rectF3.right = f20 + width2;
                f7 = fY2;
                fY = width2;
                width = f7;
            }
        } else if (L()) {
            float start = getStart() + f3 + f5;
            fY = start - (y(this.i) * f5);
            RectF rectF4 = this.o0;
            float start2 = getStart() + f6 + f4;
            float f21 = this.g0;
            rectF4.right = (start2 - f21) + this.j0;
            RectF rectF5 = this.o0;
            rectF5.left = (rectF5.right - f4) - (this.h0 - f21);
            f7 = fY;
            width = start;
        } else {
            float start3 = f3 + getStart();
            float fY3 = start3 + (y(this.i) * f5);
            RectF rectF6 = this.o0;
            float start4 = getStart() + f6;
            float f22 = this.j0;
            float f23 = this.g0;
            rectF6.left = (start4 - f22) + f23;
            RectF rectF7 = this.o0;
            rectF7.right = ((((rectF7.left + f4) + this.h0) - f23) + f22) - this.k0;
            f7 = fY3;
            width = f7;
            fY = start3;
        }
        if (this.z0) {
            o(canvas, seekBarCenterY, fY, width);
        }
        float f24 = this.P;
        float f25 = f7 - (f24 / 2.0f);
        float f26 = f7 + (f24 / 2.0f);
        this.v0 = ((f26 - f25) / 2.0f) + f25;
        if (this.A0) {
            q(canvas, seekBarCenterY, f25, f26);
        }
        if (this.V) {
            p(canvas, seekBarCenterY);
        }
    }

    public void n(Canvas canvas) {
        float start = (getStart() + this.T) - this.G;
        float width = ((getWidth() - getEnd()) - this.T) + this.G;
        int seekBarCenterY = getSeekBarCenterY();
        boolean z = this.e0 && this.E != 0.0f;
        if (this.V0 > 0) {
            this.u0.setStyle(Paint.Style.STROKE);
            this.u0.setStrokeWidth(0.0f);
            this.u0.setColor(0);
            this.u0.setShadowLayer(this.V0, 0.0f, 0.0f, this.U0);
            RectF rectF = this.E0;
            int i2 = this.V0;
            float f2 = seekBarCenterY;
            float f3 = this.F;
            rectF.set(start - (i2 / 2), (f2 - (f3 / 2.0f)) - (i2 / 2), (i2 / 2) + width, f2 + (f3 / 2.0f) + (i2 / 2));
            if (z) {
                OplusCanvas oplusCanvas = new OplusCanvas(canvas);
                RectF rectF2 = this.E0;
                float f4 = this.G;
                oplusCanvas.drawSmoothRoundRect(rectF2, f4, f4, this.u0, this.E);
            } else {
                RectF rectF3 = this.E0;
                float f5 = this.G;
                canvas.drawRoundRect(rectF3, f5, f5, this.u0);
            }
            this.u0.clearShadowLayer();
            this.u0.setStyle(Paint.Style.FILL);
        }
        this.u0.setColor(this.z);
        if (L()) {
            RectF rectF4 = this.E0;
            float f6 = (start - this.h0) + this.k0;
            float f7 = seekBarCenterY;
            float f8 = this.F;
            float f9 = this.i0;
            rectF4.set(f6, f7 - ((f8 / 2.0f) - f9), (width - this.g0) + this.j0, f7 + ((f8 / 2.0f) - f9));
        } else {
            RectF rectF5 = this.E0;
            float f10 = (start - this.j0) + this.g0;
            float f11 = seekBarCenterY;
            float f12 = this.F;
            float f13 = this.i0;
            rectF5.set(f10, f11 - ((f12 / 2.0f) - f13), (width + this.h0) - this.k0, f11 + ((f12 / 2.0f) - f13));
        }
        if (!z) {
            RectF rectF6 = this.E0;
            float f14 = this.G;
            canvas.drawRoundRect(rectF6, f14, f14, this.u0);
        } else {
            OplusCanvas oplusCanvas2 = new OplusCanvas(canvas);
            RectF rectF7 = this.E0;
            float f15 = this.G;
            oplusCanvas2.drawSmoothRoundRect(rectF7, f15, f15, this.u0, this.E);
        }
    }

    public final void o(Canvas canvas, int i2, float f2, float f3) {
        boolean z = this.e0 && this.K != 0.0f;
        if (this.X0 > 0 && this.M > this.J) {
            this.u0.setStyle(Paint.Style.STROKE);
            this.u0.setStrokeWidth(0.0f);
            this.u0.setColor(0);
            this.u0.setShadowLayer(this.X0, 0.0f, 0.0f, this.U0);
            RectF rectF = this.p0;
            int i3 = this.X0;
            float f4 = this.M;
            float f5 = i2;
            float f6 = this.L;
            rectF.set((f2 - (i3 / 2)) - f4, (f5 - (f6 / 2.0f)) - (i3 / 2), (i3 / 2) + f3 + f4, f5 + (f6 / 2.0f) + (i3 / 2));
            if (z) {
                OplusCanvas oplusCanvas = new OplusCanvas(canvas);
                RectF rectF2 = this.p0;
                float f7 = this.M;
                oplusCanvas.drawSmoothRoundRect(rectF2, f7, f7, this.u0, this.K);
            } else {
                RectF rectF3 = this.p0;
                float f8 = this.M;
                canvas.drawRoundRect(rectF3, f8, f8, this.u0);
            }
            this.u0.clearShadowLayer();
            this.u0.setStyle(Paint.Style.FILL);
        }
        this.u0.setColor(this.y);
        if (this.L0 && f2 > f3) {
            RectF rectF4 = this.p0;
            float f9 = i2;
            float f10 = this.L;
            rectF4.set(f3, f9 - (f10 / 2.0f), f2, f9 + (f10 / 2.0f));
        } else if (L()) {
            RectF rectF5 = this.p0;
            float f11 = f2 - this.h0;
            float f12 = this.j0;
            float f13 = i2;
            float f14 = this.L;
            float f15 = this.i0;
            rectF5.set(f11 + f12, f13 - ((f14 / 2.0f) - f15), (f3 - this.g0) + f12, f13 + ((f14 / 2.0f) - f15));
        } else {
            RectF rectF6 = this.p0;
            float f16 = this.j0;
            float f17 = (f2 - f16) + this.g0;
            float f18 = i2;
            float f19 = this.L;
            float f20 = this.i0;
            rectF6.set(f17, f18 - ((f19 / 2.0f) - f20), (f3 + this.h0) - f16, f18 + ((f19 / 2.0f) - f20));
        }
        this.n0.reset();
        if (z) {
            OplusPath oplusPath = new OplusPath(this.n0);
            RectF rectF7 = this.o0;
            float f21 = this.M;
            oplusPath.addSmoothRoundRect(rectF7, f21, f21, this.K, Path.Direction.CCW);
        } else {
            Path path = this.n0;
            RectF rectF8 = this.o0;
            float f22 = this.M;
            path.addRoundRect(rectF8, f22, f22, Path.Direction.CCW);
        }
        canvas.save();
        canvas.clipPath(this.n0);
        if (this.A0) {
            RectF rectF9 = this.p0;
            float f23 = rectF9.left;
            float f24 = this.P;
            rectF9.left = f23 - (f24 / 2.0f);
            rectF9.right += f24 / 2.0f;
            if (z) {
                OplusCanvas oplusCanvas2 = new OplusCanvas(canvas);
                RectF rectF10 = this.p0;
                float f25 = this.M;
                oplusCanvas2.drawSmoothRoundRect(rectF10, f25, f25, this.u0, this.K);
            } else {
                float f26 = this.M;
                canvas.drawRoundRect(rectF9, f26, f26, this.u0);
            }
        } else {
            canvas.drawRect(this.p0, this.u0);
        }
        canvas.restore();
    }

    @Override // com.oplus.aiunit.vision.s50
    public void onAnimationEnd(d01 d01Var) {
    }

    @Override // com.oplus.aiunit.vision.u50
    public void onAnimationUpdate(d01 d01Var) {
        float f2;
        Object objN = d01Var.n();
        if (objN == null) {
            return;
        }
        float fFloatValue = ((Float) objN).floatValue();
        int normalSeekBarWidth = getNormalSeekBarWidth();
        if (L()) {
            float f3 = normalSeekBarWidth;
            f2 = (f3 - fFloatValue) / f3;
        } else {
            f2 = fFloatValue / normalSeekBarWidth;
        }
        setFlingScale(f2);
        float f4 = this.p;
        setLocalProgress(w(Math.round((this.s - this.t) * this.i) + this.t));
        invalidate();
        if (f4 != this.p) {
            this.t0 = fFloatValue + getStart();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        wvk.i(getContext());
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d0();
        wvk.l();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        float seekBarWidth = getSeekBarWidth();
        n(canvas);
        m(canvas, seekBarWidth);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = this.H0 + getPaddingTop() + getPaddingBottom();
        if (1073741824 != mode || size < paddingTop) {
            size = paddingTop;
        }
        int i4 = this.Q0;
        if (i4 > 0 && size2 > i4) {
            size2 = i4;
        }
        setMeasuredDimension(size2, size);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setProgress(savedState.mSaveProgress);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mSaveProgress = this.p;
        return savedState;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.D0 = false;
        d0();
        j0();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x003d, please report this as an issue */
    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!isEnabled()) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            B(motionEvent);
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            AnimatorSet animatorSet = this.s0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.s0.cancel();
            }
            if (!K()) {
                d0();
            }
            if (this.S0 && this.Y0 == null) {
                G(getContext());
            }
            F();
            this.K0.addMovement(motionEvent);
            this.u = false;
            this.D0 = false;
            z(motionEvent);
        } else if (action == 1) {
            velocityTracker = this.K0;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, 8000.0f);
                this.b1 = this.K0.getXVelocity();
                bj2.d("COUISeekBarDeprecate", "onTouchEvent ACTION_UP mFlingVelocity = " + this.b1);
            }
            T();
            B(motionEvent);
        } else if (action == 2) {
            k();
            H();
            this.K0.addMovement(motionEvent);
            A(motionEvent);
        } else if (action == 3) {
            velocityTracker = this.K0;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, 8000.0f);
                this.b1 = this.K0.getXVelocity();
                bj2.d("COUISeekBarDeprecate", "onTouchEvent ACTION_UP mFlingVelocity = " + this.b1);
            }
            T();
            B(motionEvent);
        }
        return true;
    }

    public final void p(Canvas canvas, int i2) {
        if (TextUtils.isEmpty(this.b0)) {
            return;
        }
        this.W.setColor(this.c0);
        canvas.save();
        float fMeasureText = this.W.measureText(this.b0);
        Paint.FontMetricsInt fontMetricsInt = this.a0;
        float f2 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i3 = fontMetricsInt.bottom;
        int i4 = fontMetricsInt.top;
        float f3 = (((i2 * 2) - (i3 - i4)) / 2) - i4;
        canvas.translate(L() ? (((((getStart() + this.T) - this.G) + this.d0) - ((fMeasureText / 2.0f) - (f2 / 2.0f))) - this.h0) + this.k0 : (((((((getWidth() - getEnd()) - this.T) + this.G) - this.d0) - (f2 / 2.0f)) - (fMeasureText / 2.0f)) + this.h0) - this.k0, 0.0f);
        canvas.rotate(-getRotation(), fMeasureText / 2.0f, i2);
        canvas.drawText(this.b0, 0.0f, f3, this.W);
        canvas.restore();
    }

    public final void q(Canvas canvas, int i2, float f2, float f3) {
        Bitmap bitmap;
        if (this.W0 > 0 && this.M < this.Q) {
            this.u0.setStyle(Paint.Style.FILL);
            this.u0.setShadowLayer(this.W0, 0.0f, 8.0f, this.U0);
        }
        if (getThumb() == null || (bitmap = this.U) == null) {
            this.u0.setColor(this.A);
            if (!this.e0 || this.R == 0.0f) {
                float f4 = i2;
                float f5 = this.P;
                float f6 = this.Q;
                canvas.drawRoundRect(f2, f4 - (f5 / 2.0f), f3, f4 + (f5 / 2.0f), f6, f6, this.u0);
            } else {
                OplusCanvas oplusCanvas = new OplusCanvas(canvas);
                float f7 = i2;
                float f8 = this.P;
                float f9 = this.Q;
                oplusCanvas.drawSmoothRoundRect(f2, f7 - (f8 / 2.0f), f3, f7 + (f8 / 2.0f), f9, f9, this.u0, this.R);
            }
        } else {
            canvas.drawBitmap(bitmap, f2, i2 - (this.P / 2.0f), this.u0);
        }
        this.u0.clearShadowLayer();
    }

    public final Bitmap r(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int iMax = Math.max(1, drawable.getIntrinsicHeight());
        int iMax2 = Math.max(1, drawable.getIntrinsicWidth());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax2, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, iMax2, iMax);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final void s() {
        W();
        this.y0 = this.H != 1.0f ? (getResources().getDimensionPixelSize(R$dimen.coui_seekbar_progress_pressed_padding_horizontal) + (this.D * this.H)) / this.S : 1.0f;
        float f2 = this.J;
        this.M = f2;
        this.G = this.D;
        float f3 = this.N;
        this.Q = f2 * f3;
        this.R = this.K;
        float f4 = this.I;
        this.L = f4;
        this.F = this.C;
        this.P = f4 * f3;
        this.T = this.S;
        bj2.d("COUISeekBarDeprecate", "COUISeekBarDeprecate ensureSize : mIsProgressFull:" + this.O + ",mBackgroundRadius:" + this.D + ",mBackgroundHeight:" + this.C + ",mBackgroundEnlargeScale" + this.H + ",mProgressRadius:" + this.J + ",mProgressHeight:" + this.I + ",mProgressEnlargeScale" + this.N + ",mPaddingHorizontal" + this.S);
        j0();
    }

    public void setBackgroundEnlargeScale(float f2) {
        this.H = f2;
        s();
        invalidate();
    }

    public void setBackgroundHeight(float f2) {
        this.C = f2;
        s();
        invalidate();
    }

    public void setBackgroundRadius(float f2) {
        this.D = f2;
        s();
        invalidate();
    }

    public void setBackgroundRoundCornerWeight(float f2) {
        this.E = f2;
        invalidate();
    }

    public void setCustomProgressAnimDuration(float f2) {
        if (f2 <= 0.0f) {
            return;
        }
        this.l0 = f2;
    }

    public void setCustomProgressAnimInterpolator(Interpolator interpolator) {
        this.m0 = interpolator;
    }

    public void setDeformedListener(h hVar) {
    }

    public void setDeformedParams(b85 b85Var) {
        this.i = b85Var.g();
        this.p = b85Var.f();
        this.g0 = b85Var.c();
        this.h0 = b85Var.e();
        this.i0 = b85Var.h();
        this.j0 = b85Var.b();
        this.k0 = b85Var.d();
        invalidate();
    }

    public void setEnableAdaptiveVibrator(boolean z) {
        this.k = z;
    }

    public void setEnableVibrator(boolean z) {
        this.f2050j = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ColorStateList colorStateList = this.v;
        Context context = getContext();
        int i2 = R$color.coui_seekbar_progress_color_normal;
        this.y = v(this, colorStateList, lh2.h(context, i2));
        this.z = v(this, this.w, lh2.h(getContext(), R$color.coui_seekbar_background_color_normal));
        this.A = v(this, this.x, lh2.h(getContext(), i2));
        if (z) {
            this.W0 = getContext().getResources().getDimensionPixelSize(R$dimen.coui_seekbar_thumb_shadow_size);
        } else {
            this.W0 = 0;
        }
    }

    public void setFlingLinearDamping(float f2) {
        ft7 ft7Var;
        if (this.S0) {
            this.e1 = f2;
            if (this.Y0 == null || (ft7Var = this.Z0) == null) {
                return;
            }
            ft7Var.j0(f2);
        }
    }

    public void setIncrement(int i2) {
        this.C0 = Math.abs(i2);
    }

    @Override // android.widget.ProgressBar
    public void setInterpolator(Interpolator interpolator) {
        this.N0 = interpolator;
    }

    public void setLocalMax(int i2) {
        this.s = i2;
        k0();
        super.setMax(i2);
    }

    public void setLocalMin(int i2) {
        this.t = i2;
        k0();
        super.setMin(i2);
    }

    public void setLocalProgress(int i2) {
        this.p = i2;
        this.r = x(i2);
        super.setProgress(i2);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar
    public void setMax(int i2) {
        if (i2 < getMin()) {
            int min = getMin();
            Log.e("COUISeekBarDeprecate", "setMax : the input params is lower than min. (inputMax:" + i2 + ",mMin:" + this.t + ")");
            i2 = min;
        }
        if (i2 != this.s) {
            setLocalMax(i2);
            if (this.p > i2) {
                setProgress(i2);
            }
        }
        invalidate();
    }

    public void setMaxHeightDeformed(float f2) {
        this.g1 = f2;
    }

    public void setMaxMovingDistance(int i2) {
        this.f1 = i2;
    }

    public void setMaxWidthDeformed(float f2) {
        this.h1 = f2;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar
    public void setMin(int i2) {
        int max = i2 < 0 ? 0 : i2;
        if (i2 > getMax()) {
            max = getMax();
            Log.e("COUISeekBarDeprecate", "setMin : the input params is greater than max. (inputMin:" + i2 + ",mMax:" + this.s + ")");
        }
        if (max != this.t) {
            setLocalMin(max);
            if (this.p < max) {
                setProgress(max);
            }
        }
        invalidate();
    }

    public void setMoveDamping(float f2) {
        this.M0 = f2;
    }

    public void setMoveType(int i2) {
        this.F0 = i2;
    }

    public void setOnSeekBarChangeListener(i iVar) {
    }

    public void setPaddingHorizontal(float f2) {
        this.S = f2;
        s();
        invalidate();
    }

    public void setPhysicalEnabled(boolean z) {
        if (z == this.S0) {
            return;
        }
        if (z) {
            this.S0 = z;
            j0();
        } else {
            d0();
            this.S0 = z;
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i2) {
        setProgress(i2, false);
    }

    public void setProgressColor(@NonNull ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.v = colorStateList;
            this.y = v(this, colorStateList, lh2.h(getContext(), R$color.coui_seekbar_progress_color_normal));
            invalidate();
        }
    }

    public void setProgressContentDescription(String str) {
        this.P0 = str;
    }

    public void setProgressEnlargeScale(float f2) {
        this.N = f2;
        s();
        invalidate();
    }

    public void setProgressHeight(float f2) {
        this.I = f2;
        s();
        invalidate();
    }

    public void setProgressRadius(float f2) {
        this.J = f2;
        s();
        invalidate();
    }

    public void setProgressRoundCornerWeight(float f2) {
        this.K = f2;
        s();
        invalidate();
    }

    public void setSeekBarBackgroundColor(@NonNull ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.w = colorStateList;
            this.z = v(this, colorStateList, lh2.h(getContext(), R$color.coui_seekbar_background_color_normal));
            invalidate();
        }
    }

    public void setStartFromMiddle(boolean z) {
        this.L0 = z;
    }

    public void setSupportDeformation(boolean z) {
        this.f0 = z;
    }

    public void setText(String str) {
        this.b0 = str;
        invalidate();
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        super.setThumb(drawable);
        Y();
    }

    public void setThumbColor(@NonNull ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.x = colorStateList;
            this.A = v(this, colorStateList, lh2.h(getContext(), R$color.coui_seekbar_progress_color_normal));
            invalidate();
        }
    }

    public final void t() {
        if (this.a1 == null || this.Z0 == null || !this.f0) {
            return;
        }
        float f2 = this.i;
        if (f2 > 1.0f || f2 < 0.0f) {
            int normalSeekBarWidth = getNormalSeekBarWidth();
            int i2 = this.s - this.t;
            float f3 = i2 > 0 ? normalSeekBarWidth / i2 : 0.0f;
            if (L()) {
                this.a1.c((this.s - (getDeformationFlingScale() * i2)) * f3);
            } else {
                this.a1.c(getDeformationFlingScale() * i2 * f3);
            }
            this.Z0.k0();
        }
    }

    public final void u(float f2) {
        int normalSeekBarWidth = getNormalSeekBarWidth();
        int i2 = this.s - this.t;
        float f3 = i2 > 0 ? normalSeekBarWidth / i2 : 0.0f;
        if (L()) {
            if (this.f0) {
                this.a1.c((this.s - (getDeformationFlingScale() * i2)) * f3);
            } else {
                this.a1.c(((this.s - this.p) + this.t) * f3);
            }
        } else if (this.f0) {
            this.a1.c(getDeformationFlingScale() * i2 * f3);
        } else {
            this.a1.c((this.p - this.t) * f3);
        }
        this.Z0.l0(f2);
    }

    public final int v(View view, ColorStateList colorStateList, int i2) {
        return colorStateList == null ? i2 : colorStateList.getColorForState(view.getDrawableState(), i2);
    }

    public final int w(int i2) {
        int i3 = this.s;
        int i4 = this.t;
        int i5 = i3 - i4;
        return Math.max(i4 - i5, Math.min(i2, i3 + i5));
    }

    public final int x(int i2) {
        return Math.max(this.t, Math.min(i2, this.s));
    }

    public final float y(float f2) {
        return Math.max(0.0f, Math.min(f2, 1.0f));
    }

    public void z(MotionEvent motionEvent) {
        this.o = motionEvent.getX();
        this.t0 = motionEvent.getX();
    }

    public COUISeekBarDeprecate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiSeekBarStyle);
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i2, boolean z) {
        X(i2, z, false);
    }

    public COUISeekBarDeprecate(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, lh2.j(context) ? R$style.COUISeekBar_Dark : R$style.COUISeekBar);
    }

    public COUISeekBarDeprecate(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.i = 0.0f;
        this.f2050j = true;
        this.k = true;
        this.f2051l = true;
        this.m = null;
        this.f2052n = 0;
        this.p = 0;
        this.q = 0;
        this.s = 100;
        this.t = 0;
        this.u = false;
        this.v = null;
        this.w = null;
        this.x = null;
        this.O = false;
        this.e0 = false;
        this.l0 = -1.0f;
        this.m0 = null;
        this.n0 = new Path();
        this.o0 = new RectF();
        this.p0 = new RectF();
        this.q0 = new RectF();
        this.r0 = new AnimatorSet();
        this.w0 = PathInterpolatorCompat.create(0.33f, 0.0f, 0.67f, 1.0f);
        this.x0 = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.z0 = false;
        this.A0 = false;
        this.C0 = 1;
        this.D0 = false;
        this.E0 = new RectF();
        this.F0 = 1;
        this.J0 = mki.b(500.0d, 30.0d);
        this.L0 = false;
        this.M0 = 0.0f;
        this.N0 = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.S0 = false;
        this.b1 = 0.0f;
        this.c1 = 2.8f;
        this.d1 = 1.0f;
        this.e1 = 15.0f;
        this.f1 = 30;
        this.g1 = 28.5f;
        this.h1 = 4.7f;
        if (attributeSet != null) {
            this.O0 = attributeSet.getStyleAttribute();
        }
        if (this.O0 == 0) {
            this.O0 = i2;
        }
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUISeekBar, i2, i3);
        this.f2050j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarEnableVibrator, true);
        this.k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarAdaptiveVibrator, false);
        this.S0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarPhysicsEnable, true);
        this.z0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarShowProgress, true);
        this.A0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarShowThumb, true);
        this.L0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarStartMiddle, false);
        this.O = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarProgressFull, false);
        this.w = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUISeekBar_couiSeekBarBackgroundColor);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUISeekBar_couiSeekBarProgressColor);
        this.v = colorStateList;
        if (colorStateList == null) {
            this.v = im2.a(lh2.b(context, com.support.appcompat.R$attr.couiColorContainerTheme, 0), lh2.a(getContext(), com.support.appcompat.R$attr.couiColorDisable));
        }
        this.x = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUISeekBar_couiSeekBarThumbColor);
        this.z = v(this, this.w, lh2.h(getContext(), R$color.coui_seekbar_background_color_normal));
        ColorStateList colorStateList2 = this.v;
        Context context2 = getContext();
        int i4 = R$color.coui_seekbar_progress_color_normal;
        this.y = v(this, colorStateList2, lh2.h(context2, i4));
        this.A = v(this, this.x, lh2.h(getContext(), i4));
        this.U0 = typedArrayObtainStyledAttributes.getColor(R$styleable.COUISeekBar_couiSeekBarShadowColor, lh2.h(getContext(), R$color.coui_seekbar_shadow_color));
        this.B = typedArrayObtainStyledAttributes.getColor(R$styleable.COUISeekBar_couiSeekBarThumbShadowColor, lh2.h(getContext(), R$color.coui_seekbar_thumb_shadow_color));
        this.D = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUISeekBar_couiSeekBarBackgroundRadius, getResources().getDimension(R$dimen.coui_seekbar_background_radius));
        this.J = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUISeekBar_couiSeekBarProgressRadius, getResources().getDimension(R$dimen.coui_seekbar_progress_radius));
        this.E = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUISeekBar_couiSeekBarBackgroundRoundCornerWeight, 0.0f);
        this.K = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUISeekBar_couiSeekBarProgressRoundCornerWeight, 0.0f);
        this.V0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUISeekBar_couiSeekBarShadowSize, 0);
        this.W0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUISeekBar_couiSeekBarThumbShadowSize, 0);
        this.X0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUISeekBar_couiSeekBarInnerShadowSize, 0);
        this.S = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUISeekBar_couiSeekBarProgressPaddingHorizontal, getResources().getDimension(R$dimen.coui_seekbar_progress_padding_horizontal));
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUISeekBar_couiSeekBarBackgroundHeight, (int) (this.D * 2.0f));
        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUISeekBar_couiSeekBarProgressHeight, (int) (this.J * 2.0f));
        this.H0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUISeekBar_couiSeekBarMinHeight, getResources().getDimensionPixelSize(R$dimen.coui_seekbar_view_min_height));
        this.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUISeekBar_couiSeekBarMaxWidth, 0);
        this.H = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUISeekBar_couiSeekBarBackGroundEnlargeScale, 6.0f);
        this.N = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUISeekBar_couiSeekBarProgressEnlargeScale, 4.0f);
        this.V = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarShowText, false);
        this.b0 = typedArrayObtainStyledAttributes.getString(R$styleable.COUISeekBar_couiSeekBarText);
        this.c0 = typedArrayObtainStyledAttributes.getColor(R$styleable.COUISeekBar_couiSeekBarTextColor, getResources().getColor(R$color.coui_seekbar_text_color));
        this.d0 = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUISeekBar_couiSeekBarTextMarginTop, getResources().getDimension(R$dimen.coui_seekbar_text_margin_top));
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarDeformation, false);
        typedArrayObtainStyledAttributes.recycle();
        this.R0 = new osj(getContext());
        this.f2051l = wvk.h(context);
        this.e0 = byf.f();
        I();
        s();
        D();
    }
}
