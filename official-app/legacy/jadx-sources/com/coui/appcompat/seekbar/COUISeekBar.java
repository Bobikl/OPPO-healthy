package com.coui.appcompat.seekbar;

import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsSeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.FloatValueHolder;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.oplus.aiunit.vision.b85;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.d01;
import com.oplus.aiunit.vision.ft7;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.hr3;
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
import com.oplus.graphics.OplusPathAdapter;
import com.oplus.os.LinearmotorVibrator;
import com.support.seekbar.R$attr;
import com.support.seekbar.R$color;
import com.support.seekbar.R$dimen;
import com.support.seekbar.R$string;
import com.support.seekbar.R$style;
import com.support.seekbar.R$styleable;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 22)
public class COUISeekBar extends AbsSeekBar implements s50, u50 {
    public static final int MOVE_BY_DEFAULT = 0;
    public static final int MOVE_BY_DISTANCE = 2;
    public static final int MOVE_BY_FINGER = 1;
    public static final Interpolator r1 = new hj2();
    public static final Interpolator s1 = new sh2();
    public int A;
    public l A0;
    public int B;
    public boolean B0;
    public int C;
    public int C0;
    public float D;
    public int D0;
    public float E;
    public float E0;
    public float F;
    public mki F0;
    public float G;
    public VelocityTracker G0;
    public float H;
    public boolean H0;
    public float I;
    public float I0;
    public float J;
    public int J0;
    public float K;
    public int K0;
    public float L;
    public osj L0;
    public float M;
    public boolean M0;
    public float N;
    public ExecutorService N0;
    public float O;
    public int O0;
    public float P;
    public int P0;
    public float Q;
    public vie Q0;
    public float R;
    public ft7 R0;
    public float S;
    public pt7 S0;
    public int T;
    public float T0;
    public int U;
    public float U0;
    public int V;
    public float V0;
    public float W;
    public float W0;
    public int X0;
    public float Y0;
    public float Z0;
    public Paint a0;
    public float a1;
    public LinearGradient b0;
    public Locale b1;
    public LinearGradient c0;
    public NumberFormat c1;
    public boolean d0;
    public com.coui.appcompat.animation.dynamicanimation.b d1;
    public boolean e0;
    public FloatPropertyCompat<COUISeekBar> e1;
    public float f0;
    public com.coui.appcompat.animation.dynamicanimation.b f1;
    public float g0;
    public FloatPropertyCompat<COUISeekBar> g1;
    public float h0;
    public com.coui.appcompat.animation.dynamicanimation.b h1;
    public final String i;
    public float i0;
    public com.coui.appcompat.animation.dynamicanimation.b i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2045j;
    public float j0;
    public COUIDynamicAnimation.q j1;
    public float k;
    public RectF k0;
    public com.coui.appcompat.animation.dynamicanimation.b k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2046l;
    public RectF l0;
    public Path l1;
    public boolean m;
    public ValueAnimator m0;
    public RectF m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2047n;
    public ValueAnimator n0;
    public AnimatorSet n1;
    public Object o;
    public float o0;
    public Interpolator o1;
    public int p;
    public Paint p0;
    public Interpolator p1;
    public float q;
    public float q0;
    public RectF q1;
    public int r;
    public boolean r0;
    public int s;
    public boolean s0;
    public int t;
    public boolean t0;
    public int u;
    public Path u0;
    public int v;
    public Path v0;
    public boolean w;
    public m w0;
    public ColorStateList x;
    public m x0;
    public ColorStateList y;
    public kki y0;
    public ColorStateList z;
    public int z0;

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

        public /* synthetic */ SavedState(Parcel parcel, b bVar) {
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

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUISeekBar cOUISeekBar = COUISeekBar.this;
            if (cOUISeekBar.w) {
                LinearmotorVibrator linearmotorVibrator = (LinearmotorVibrator) cOUISeekBar.o;
                int i = cOUISeekBar.r;
                int i2 = cOUISeekBar.v;
                wvk.j(linearmotorVibrator, 152, i - i2, cOUISeekBar.u - i2, 200, 2000);
            }
        }
    }

    public class b extends FloatPropertyCompat<COUISeekBar> {
        public b(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(COUISeekBar cOUISeekBar) {
            return cOUISeekBar.getCurThumbRadius();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(COUISeekBar cOUISeekBar, float f) {
            cOUISeekBar.setCurThumbRadius(f);
        }
    }

    public class c extends FloatPropertyCompat<COUISeekBar> {
        public c(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(COUISeekBar cOUISeekBar) {
            return cOUISeekBar.getCurGlitterEffectValue();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(COUISeekBar cOUISeekBar, float f) {
            cOUISeekBar.setCurGlitterEffectValue(f);
        }
    }

    public class d implements COUIDynamicAnimation.r {
        public d() {
        }

        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
        public void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
            COUISeekBar cOUISeekBar = COUISeekBar.this;
            cOUISeekBar.f2045j = f / 1000.0f;
            cOUISeekBar.invalidate();
        }
    }

    public class e implements COUIDynamicAnimation.r {
        public e() {
        }

        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
        public void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
            COUISeekBar.this.x0(f);
        }
    }

    public class f implements COUIDynamicAnimation.r {
        public f() {
        }

        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
        public void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
            float f3 = f / 100000.0f;
            COUISeekBar cOUISeekBar = COUISeekBar.this;
            float f4 = cOUISeekBar.k;
            if (f4 > 1.0f) {
                double d = f3;
                cOUISeekBar.f0 = cOUISeekBar.D(d, cOUISeekBar.X0);
                COUISeekBar cOUISeekBar2 = COUISeekBar.this;
                cOUISeekBar2.g0 = cOUISeekBar2.D(d, cOUISeekBar2.X0 + COUISeekBar.this.Y0);
                COUISeekBar cOUISeekBar3 = COUISeekBar.this;
                cOUISeekBar3.h0 = cOUISeekBar3.D(d, cOUISeekBar3.Z0);
                COUISeekBar.this.c0();
                COUISeekBar.this.invalidate();
                return;
            }
            if (f4 < 0.0f) {
                double d2 = f3;
                cOUISeekBar.j0 = cOUISeekBar.D(d2, cOUISeekBar.X0);
                COUISeekBar cOUISeekBar4 = COUISeekBar.this;
                cOUISeekBar4.i0 = cOUISeekBar4.D(d2, cOUISeekBar4.X0 + COUISeekBar.this.Y0);
                COUISeekBar cOUISeekBar5 = COUISeekBar.this;
                cOUISeekBar5.h0 = cOUISeekBar5.D(d2, cOUISeekBar5.Z0);
                COUISeekBar.this.c0();
                COUISeekBar.this.invalidate();
            }
        }
    }

    public class g extends AccessibilityDelegateCompat {
        public g() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, COUISeekBar.this.getMin(), COUISeekBar.this.getMax(), COUISeekBar.this.getProgress()));
            accessibilityNodeInfoCompat.setRoleDescription(COUISeekBar.this.i);
            COUISeekBar cOUISeekBar = COUISeekBar.this;
            accessibilityNodeInfoCompat.setStateDescription(cOUISeekBar.P(cOUISeekBar.getProgress()));
            if (COUISeekBar.this.isEnabled()) {
                int progress = COUISeekBar.this.getProgress();
                if (progress > COUISeekBar.this.getMin()) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (progress < COUISeekBar.this.getMax()) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (!COUISeekBar.this.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                COUISeekBar cOUISeekBar = COUISeekBar.this;
                cOUISeekBar.K0(cOUISeekBar.getProgress() + COUISeekBar.this.z0, false, true);
                COUISeekBar cOUISeekBar2 = COUISeekBar.this;
                cOUISeekBar2.announceForAccessibility(cOUISeekBar2.P(cOUISeekBar2.getProgress()));
                return true;
            }
            if (i != 8192) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            COUISeekBar cOUISeekBar3 = COUISeekBar.this;
            cOUISeekBar3.K0(cOUISeekBar3.getProgress() - COUISeekBar.this.z0, false, true);
            COUISeekBar cOUISeekBar4 = COUISeekBar.this;
            cOUISeekBar4.announceForAccessibility(cOUISeekBar4.P(cOUISeekBar4.getProgress()));
            return true;
        }
    }

    public class h implements pki {
        public h() {
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
            if (COUISeekBar.this.E0 != kkiVar.e()) {
                if (COUISeekBar.this.isEnabled()) {
                    COUISeekBar.this.E0 = (float) kkiVar.c();
                } else {
                    COUISeekBar.this.E0 = 0.0f;
                }
                COUISeekBar.this.invalidate();
            }
        }
    }

    public class i implements COUIDynamicAnimation.q {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        public i(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
        public void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
            if (COUISeekBar.this.A0 != null) {
                l lVar = COUISeekBar.this.A0;
                COUISeekBar cOUISeekBar = COUISeekBar.this;
                lVar.N4(cOUISeekBar, cOUISeekBar.t, this.a);
            }
            COUISeekBar.this.U0(this.a, this.b);
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUISeekBar cOUISeekBar = COUISeekBar.this;
            if (cOUISeekBar.w) {
                cOUISeekBar.performHapticFeedback(305, 0);
            }
        }
    }

    public interface k {
    }

    public interface l {
        void J6(COUISeekBar cOUISeekBar);

        void N4(COUISeekBar cOUISeekBar, int i, boolean z);

        void u4(COUISeekBar cOUISeekBar);
    }

    public final class m {
        public final int a;
        public OplusPathAdapter b;

        public m(Path path) {
            this.b = null;
            int iA = byf.a();
            this.a = iA;
            if (iA == 1) {
                this.b = new OplusPathAdapter(path, iA);
            }
        }

        public OplusPathAdapter a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public COUISeekBar(Context context) {
        this(context, null);
    }

    private int U(int i2) {
        int i3 = this.u;
        int i4 = this.v;
        int i5 = i3 - i4;
        return Math.max(i4 - i5, Math.min(i2, i3 + i5));
    }

    private void Y0(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f2 = x - this.o0;
        int i2 = this.u - this.v;
        if (r0()) {
            f2 = -f2;
        }
        float f3 = i2;
        M0((this.r / f3) + ((f2 * u()) / getSeekBarWidth()), false);
        M();
        this.h1.x(this.k * 1000.0f);
        int iU = U(Math.round((this.k * f3) + getMin()));
        int i3 = this.r;
        int i4 = this.t;
        setLocalProgress(iU);
        if (i3 != this.r) {
            this.o0 = x;
            l lVar = this.A0;
            if (lVar != null) {
                lVar.N4(this, this.t, true);
            }
            if (i4 != this.t) {
                B0();
            }
        }
        VelocityTracker velocityTracker = this.G0;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(100);
            O0(this.G0.getXVelocity());
        }
    }

    private void Z0(MotionEvent motionEvent) {
        float start;
        int seekBarWidth;
        int iRound = Math.round(((motionEvent.getX() - this.o0) * u()) + this.o0);
        if (r0()) {
            start = ((getWidth() - iRound) - getEnd()) - this.R;
            seekBarWidth = getSeekBarWidth();
        } else {
            start = (iRound - getStart()) - this.R;
            seekBarWidth = getSeekBarWidth();
        }
        M0(start / seekBarWidth, false);
        M();
        this.h1.x(this.k * 1000.0f);
        int iU = U(Math.round((this.k * (getMax() - getMin())) + getMin()));
        int i2 = this.r;
        int i3 = this.t;
        setLocalProgress(iU);
        if (i2 != this.r) {
            this.o0 = iRound;
            l lVar = this.A0;
            if (lVar != null) {
                lVar.N4(this, this.t, true);
            }
            if (i3 != this.t) {
                B0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurGlitterEffectValue() {
        return this.W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurThumbRadius() {
        return this.M;
    }

    private float getDeformationFlingScale() {
        float f2 = this.k;
        if (f2 > 1.0f) {
            return ((f2 - 1.0f) / 5.0f) + 1.0f;
        }
        return f2 < 0.0f ? f2 / 5.0f : f2;
    }

    @NonNull
    private kki getFastMoveSpring() {
        if (this.y0 == null) {
            h0();
        }
        return this.y0;
    }

    private float getHeightBottomDeformedValue() {
        float f2;
        float f3;
        if (r0()) {
            f2 = this.i0;
            f3 = this.f0;
        } else {
            f2 = this.f0;
            f3 = this.i0;
        }
        return f2 - f3;
    }

    private float getHeightTopDeformedValue() {
        float f2;
        float f3;
        if (r0()) {
            f2 = this.j0;
            f3 = this.g0;
        } else {
            f2 = this.g0;
            f3 = this.j0;
        }
        return f2 - f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurGlitterEffectValue(float f2) {
        this.W = f2;
        this.V = C(f2);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurThumbRadius(float f2) {
        this.M = f2;
        invalidate();
    }

    private void setDeformationScale(float f2) {
        if (f2 > 1.0f) {
            f2 = ((f2 - 1.0f) * 5.0f) + 1.0f;
        } else if (f2 < 0.0f) {
            f2 *= 5.0f;
        }
        float fMax = Math.max(-1.0f, Math.min(f2, 2.0f));
        this.k = fMax;
        this.f2045j = fMax;
    }

    private void setFlingScale(float f2) {
        if (this.e0) {
            v(f2);
            setDeformationScale(f2);
        } else {
            float fMax = Math.max(0.0f, Math.min(f2, 1.0f));
            this.k = fMax;
            this.f2045j = fMax;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(ValueAnimator valueAnimator) {
        R(valueAnimator);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(ValueAnimator valueAnimator) {
        R(valueAnimator);
        invalidate();
    }

    public final void A() {
        float f2 = this.k;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        G0();
    }

    public boolean A0() {
        if (this.o == null) {
            LinearmotorVibrator linearmotorVibratorE = wvk.e(getContext());
            this.o = linearmotorVibratorE;
            this.f2047n = linearmotorVibratorE != null;
        }
        if (this.o == null) {
            return false;
        }
        if (this.t == getMax() || this.t == getMin()) {
            LinearmotorVibrator linearmotorVibrator = (LinearmotorVibrator) this.o;
            int i2 = this.t;
            int i3 = this.v;
            wvk.j(linearmotorVibrator, 154, i2 - i3, this.u - i3, 800, 1200);
        } else {
            if (this.N0 == null) {
                this.N0 = Executors.newSingleThreadExecutor();
            }
            this.N0.execute(new a());
        }
        return true;
    }

    public final void B() {
        ExecutorService executorService = this.N0;
        if (executorService instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) executorService).getQueue().clear();
        }
    }

    public void B0() {
        if (this.f2046l) {
            if (this.f2047n && this.m && A0()) {
                return;
            }
            if (this.t == getMax() || this.t == getMin()) {
                performHapticFeedback(306, 0);
                return;
            }
            if (this.N0 == null) {
                this.N0 = Executors.newSingleThreadExecutor();
            }
            this.N0.execute(new j());
        }
    }

    public final int C(float f2) {
        return (int) Math.round((1.0d - Math.exp((-(Math.log(85.0d) / 360.0d)) * ((double) f2))) * 255.0d);
    }

    public final void C0() {
        VelocityTracker velocityTracker = this.G0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.G0 = null;
        }
    }

    public final float D(double d2, float f2) {
        return (float) (((double) f2) * (1.0d - Math.exp(d2 * (-11.5d))));
    }

    public void D0() {
        x(this.m0);
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator == null) {
            this.n0 = X(183L, s1);
        } else {
            x(valueAnimator);
        }
        setReleaseAnimatorValues(this.n0);
        this.n0.start();
    }

    public void E(Canvas canvas, float f2) {
        H(canvas);
        F(canvas);
        I(canvas);
    }

    public void E0() {
        if (this.s0) {
            float f2 = this.M;
            if (f2 != this.O) {
                this.d1.r(f2);
                this.d1.x(this.O);
            }
        }
    }

    public void F(Canvas canvas) {
        if (this.t0) {
            if (this.H0) {
                if (r0()) {
                    float f2 = this.k;
                    if (f2 >= 1.0f) {
                        I0();
                    } else if (f2 <= 0.0f) {
                        J0();
                    }
                } else {
                    float f3 = this.k;
                    if (f3 >= 1.0f) {
                        J0();
                    } else if (f3 <= 0.0f) {
                        I0();
                    }
                }
            } else if (r0()) {
                if (this.k >= 1.0f) {
                    I0();
                }
            } else if (this.k >= 1.0f) {
                J0();
            }
            this.a0.setAlpha(this.V);
            RectF rectF = this.l0;
            float f4 = this.I;
            canvas.drawRoundRect(rectF, f4 / 2.0f, f4 / 2.0f, this.a0);
        }
    }

    public void F0() {
        if (!this.H0) {
            if (this.k < 1.0f) {
                this.d0 = false;
            }
        } else {
            float f2 = this.k;
            if (f2 >= 1.0f || f2 <= 0.0f) {
                return;
            }
            this.d0 = false;
        }
    }

    public void G(Canvas canvas) {
        int iB = this.w0.b();
        if (iB == 0) {
            this.p0.setColor(this.B);
            if (this.F == 0.0f) {
                RectF rectF = this.k0;
                float f2 = this.G;
                canvas.drawRoundRect(rectF, f2 / 2.0f, f2 / 2.0f, this.p0);
                return;
            } else {
                OplusCanvas oplusCanvas = new OplusCanvas(canvas);
                RectF rectF2 = this.k0;
                float f3 = this.G;
                oplusCanvas.drawSmoothRoundRect(rectF2, f3 / 2.0f, f3 / 2.0f, this.p0, this.F);
                return;
            }
        }
        if (iB != 1) {
            this.p0.setColor(this.B);
            RectF rectF3 = this.k0;
            float f4 = this.G;
            canvas.drawRoundRect(rectF3, f4 / 2.0f, f4 / 2.0f, this.p0);
            return;
        }
        this.u0.reset();
        canvas.save();
        OplusPathAdapter oplusPathAdapterA = this.w0.a();
        RectF rectF4 = this.k0;
        float f5 = this.G;
        oplusPathAdapterA.addSmoothRoundRect(rectF4, f5 / 2.0f, f5 / 2.0f, Path.Direction.CCW);
        canvas.clipPath(this.u0);
        canvas.drawColor(this.B);
        canvas.restore();
    }

    public void G0() {
        if (this.e0) {
            this.g0 = 0.0f;
            this.f0 = 0.0f;
            this.h0 = 0.0f;
            this.j0 = 0.0f;
            this.i0 = 0.0f;
            c0();
        }
    }

    public final void H(Canvas canvas) {
        if (this.r0) {
            int iB = this.x0.b();
            if (iB == 0) {
                this.p0.setColor(this.A);
                if (this.J == 0.0f) {
                    RectF rectF = this.l0;
                    float f2 = this.I;
                    canvas.drawRoundRect(rectF, f2 / 2.0f, f2 / 2.0f, this.p0);
                    return;
                } else {
                    OplusCanvas oplusCanvas = new OplusCanvas(canvas);
                    RectF rectF2 = this.l0;
                    float f3 = this.I;
                    oplusCanvas.drawSmoothRoundRect(rectF2, f3 / 2.0f, f3 / 2.0f, this.p0, this.J);
                    return;
                }
            }
            if (iB != 1) {
                this.p0.setColor(this.A);
                RectF rectF3 = this.l0;
                float f4 = this.I;
                canvas.drawRoundRect(rectF3, f4 / 2.0f, f4 / 2.0f, this.p0);
                return;
            }
            this.v0.reset();
            canvas.save();
            OplusPathAdapter oplusPathAdapterA = this.x0.a();
            RectF rectF4 = this.l0;
            float f5 = this.I;
            oplusPathAdapterA.addSmoothRoundRect(rectF4, f5 / 2.0f, f5 / 2.0f, Path.Direction.CCW);
            canvas.clipPath(this.v0);
            canvas.drawColor(this.A);
            canvas.restore();
        }
    }

    public void H0() {
        int seekBarCenterY = getSeekBarCenterY();
        float start = (getStart() + this.R) - (this.G / 2.0f);
        float width = ((getWidth() - getEnd()) - this.R) + (this.G / 2.0f);
        if (r0()) {
            RectF rectF = this.k0;
            float f2 = (start - this.g0) + this.j0;
            float f3 = seekBarCenterY;
            float f4 = this.G;
            float f5 = this.h0;
            rectF.set(f2, f3 - ((f4 / 2.0f) - f5), (width - this.f0) + this.i0, f3 + ((f4 / 2.0f) - f5));
            return;
        }
        RectF rectF2 = this.k0;
        float f6 = (start - this.i0) + this.f0;
        float f7 = seekBarCenterY;
        float f8 = this.G;
        float f9 = this.h0;
        rectF2.set(f6, f7 - ((f8 / 2.0f) - f9), (width + this.g0) - this.j0, f7 + ((f8 / 2.0f) - f9));
    }

    public final void I(Canvas canvas) {
        if (this.s0) {
            int seekBarCenterY = getSeekBarCenterY();
            float f2 = this.N;
            float f3 = this.M;
            float f4 = f2 - f3;
            float f5 = f2 + f3;
            if (this.P0 > 0 && isEnabled()) {
                this.p0.setStyle(Paint.Style.FILL);
                this.p0.setShadowLayer(this.P0, 0.0f, this.Q, this.O0);
            }
            this.p0.setColor(this.C);
            float f6 = seekBarCenterY;
            float f7 = this.M;
            canvas.drawRoundRect(f4, f6 - f7, f5, f6 + f7, f7, f7, this.p0);
            if (this.P0 <= 0 || !isEnabled()) {
                return;
            }
            this.p0.clearShadowLayer();
        }
    }

    public final void I0() {
        if (this.c0 == null) {
            RectF rectF = this.l0;
            this.c0 = new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, this.U, this.T, Shader.TileMode.CLAMP);
        }
        this.a0.setShader(this.c0);
    }

    public final void J() {
        this.G = this.E;
        this.M = this.O;
        float f2 = this.I;
        this.K = f2 / 2.0f;
        this.L = f2 / 2.0f;
        this.S = this.R;
        bj2.d("COUISeekBar", "COUISeekBar ensureSize : mPaddingHorizontal:" + this.R + ",mBackgroundHeight:" + this.E + ",mBackgroundEnlargeScale" + this.H + ",mProgressHeight:" + this.I + ",mThumbRadius" + this.O);
        a1();
    }

    public final void J0() {
        if (this.b0 == null) {
            RectF rectF = this.l0;
            this.b0 = new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, this.T, this.U, Shader.TileMode.CLAMP);
        }
        this.a0.setShader(this.b0);
    }

    public final void K(d01 d01Var, float f2) {
        float fMin = Math.min(hr3.c(d01Var.o().a), 8000.0f);
        if (!this.H0) {
            if (this.k < 1.0f || this.d0 || f2 >= 1.0f) {
                return;
            }
            P0(fMin);
            return;
        }
        float f3 = this.k;
        if (f3 >= 1.0f && !this.d0 && f2 < 1.0f) {
            P0(fMin);
        } else {
            if (f3 > 0.0f || this.d0 || f2 <= 0.0f) {
                return;
            }
            P0(fMin);
        }
    }

    public void K0(int i2, boolean z, boolean z2) {
        com.coui.appcompat.animation.dynamicanimation.b bVar = this.h1;
        if (bVar != null) {
            bVar.c();
        }
        this.s = this.r;
        int iMax = Math.max(this.v, Math.min(i2, this.u));
        if (this.s != iMax) {
            if (z) {
                R0(iMax, z2, false);
            } else {
                setLocalProgress(iMax);
                this.s = iMax;
                c1();
                l lVar = this.A0;
                if (lVar != null) {
                    lVar.N4(this, V(iMax), z2);
                }
                invalidate();
            }
            G0();
        }
    }

    public void L(MotionEvent motionEvent) {
        if (this.s0 && u0(motionEvent.getX(), motionEvent.getY())) {
            this.d1.r(this.M);
            this.d1.x(this.P);
        }
    }

    public void L0() {
        float start;
        float fW;
        float start2;
        float fW2;
        float f2;
        float f3;
        float seekBarWidth = getSeekBarWidth();
        int seekBarCenterY = getSeekBarCenterY();
        if (this.H0) {
            if (r0()) {
                start2 = getWidth() / 2.0f;
                fW2 = start2 - ((W(this.f2045j) - 0.5f) * seekBarWidth);
                f2 = start2;
                f3 = fW2;
            } else {
                start = getWidth() / 2.0f;
                fW = start + ((W(this.f2045j) - 0.5f) * seekBarWidth);
                f2 = fW;
                fW2 = start;
                f3 = f2;
            }
        } else if (r0()) {
            start2 = getStart() + this.R + seekBarWidth;
            fW2 = start2 - (W(this.f2045j) * seekBarWidth);
            f2 = start2;
            f3 = fW2;
        } else {
            start = getStart() + this.R;
            fW = start + (W(this.f2045j) * seekBarWidth);
            f2 = fW;
            fW2 = start;
            f3 = f2;
        }
        if (!this.H0 || fW2 <= f2) {
            if (r0()) {
                RectF rectF = this.l0;
                float f4 = fW2 - this.g0;
                float f5 = this.i0;
                float f6 = seekBarCenterY;
                float f7 = this.I;
                float f8 = this.h0;
                rectF.set(f4 + f5, f6 - ((f7 / 2.0f) - f8), (f2 - this.f0) + f5, f6 + ((f7 / 2.0f) - f8));
            } else {
                RectF rectF2 = this.l0;
                float f9 = this.i0;
                float f10 = (fW2 - f9) + this.f0;
                float f11 = seekBarCenterY;
                float f12 = this.I;
                float f13 = this.h0;
                rectF2.set(f10, f11 - ((f12 / 2.0f) - f13), (f2 + this.g0) - f9, f11 + ((f12 / 2.0f) - f13));
            }
        } else if (r0()) {
            RectF rectF3 = this.l0;
            float f14 = f2 - this.g0;
            float f15 = this.i0;
            float f16 = seekBarCenterY;
            float f17 = this.I;
            float f18 = this.h0;
            rectF3.set(f14 + f15, f16 - ((f17 / 2.0f) - f18), (fW2 - this.f0) + f15, f16 + ((f17 / 2.0f) - f18));
        } else {
            RectF rectF4 = this.l0;
            float f19 = this.i0;
            float f20 = (f2 - f19) + this.f0;
            float f21 = seekBarCenterY;
            float f22 = this.I;
            float f23 = this.h0;
            rectF4.set(f20, f21 - ((f22 / 2.0f) - f23), (fW2 + this.g0) - f19, f21 + ((f22 / 2.0f) - f23));
        }
        RectF rectF5 = this.l0;
        float f24 = rectF5.left;
        float f25 = this.I;
        rectF5.left = f24 - (f25 / 2.0f);
        rectF5.right += f25 / 2.0f;
        float f26 = this.g0 - this.i0;
        if (r0()) {
            f26 = -f26;
        }
        this.N = f3 + f26;
    }

    public void M() {
        this.G0.computeCurrentVelocity(1000, 8000.0f);
        float xVelocity = this.G0.getXVelocity();
        if (!this.H0) {
            if (r0()) {
                if (this.k < 1.0f || this.d0 || xVelocity >= 0.0f) {
                    return;
                }
                P0(xVelocity);
                return;
            }
            if (this.k < 1.0f || this.d0 || xVelocity <= 0.0f) {
                return;
            }
            P0(xVelocity);
            return;
        }
        if (r0()) {
            float f2 = this.k;
            if (f2 <= 0.0f && !this.d0 && xVelocity > 0.0f) {
                P0(xVelocity);
                return;
            } else {
                if (f2 < 1.0f || this.d0 || xVelocity >= 0.0f) {
                    return;
                }
                P0(xVelocity);
                return;
            }
        }
        float f3 = this.k;
        if (f3 <= 0.0f && !this.d0 && xVelocity < 0.0f) {
            P0(xVelocity);
        } else {
            if (f3 < 1.0f || this.d0 || xVelocity <= 0.0f) {
                return;
            }
            P0(xVelocity);
        }
    }

    public void M0(float f2, boolean z) {
        if (this.e0) {
            if (z) {
                float fMax = Math.max(-1.0f, Math.min(f2, 2.0f));
                this.k = fMax;
                this.f2045j = fMax;
            } else {
                this.k = Math.max(-1.0f, Math.min(f2, 2.0f));
            }
            w();
            return;
        }
        if (!z) {
            this.k = Math.max(0.0f, Math.min(f2, 1.0f));
            return;
        }
        float fMax2 = Math.max(0.0f, Math.min(f2, 1.0f));
        this.k = fMax2;
        this.f2045j = fMax2;
    }

    public final void N() {
        if (this.S0 == null || this.R0 == null || !this.e0) {
            return;
        }
        float f2 = this.k;
        if (f2 > 1.0f || f2 < 0.0f) {
            int seekBarWidth = getSeekBarWidth();
            int i2 = this.u - this.v;
            float f3 = i2 > 0 ? seekBarWidth / i2 : 0.0f;
            if (r0()) {
                this.S0.c((this.u - (getDeformationFlingScale() * i2)) * f3);
            } else {
                this.S0.c(getDeformationFlingScale() * i2 * f3);
            }
            this.R0.k0();
        }
    }

    public void N0() {
        setPressed(true);
        y0(true);
        t();
    }

    public final void O(float f2) {
        if (this.S0 == null || this.R0 == null) {
            return;
        }
        int seekBarWidth = getSeekBarWidth();
        int i2 = this.u - this.v;
        float f3 = i2 > 0 ? seekBarWidth / i2 : 0.0f;
        if (r0()) {
            if (this.e0) {
                this.S0.c((this.u - (getDeformationFlingScale() * i2)) * f3);
            } else {
                this.S0.c(((this.u - this.r) + this.v) * f3);
            }
        } else if (this.e0) {
            this.S0.c(getDeformationFlingScale() * i2 * f3);
        } else {
            this.S0.c((this.r - this.v) * f3);
        }
        this.R0.l0(f2);
    }

    public final void O0(float f2) {
        kki fastMoveSpring = getFastMoveSpring();
        if (fastMoveSpring.c() == fastMoveSpring.e()) {
            int i2 = this.u - this.v;
            if (f2 >= 95.0f) {
                int i3 = this.r;
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
            int i4 = this.r;
            float f4 = i2;
            if (i4 > 0.95f * f4 || i4 < f4 * 0.05f) {
                return;
            }
            fastMoveSpring.o(-1.0d);
        }
    }

    public final String P(int i2) {
        Locale locale = getResources().getConfiguration().getLocales().get(0);
        if (locale != null && !locale.equals(this.b1)) {
            this.b1 = locale;
            this.c1 = NumberFormat.getPercentInstance(locale);
        }
        NumberFormat numberFormat = this.c1;
        return numberFormat != null ? numberFormat.format(T(i2)) : Integer.toString(i2);
    }

    public final void P0(float f2) {
        this.d0 = true;
        this.f1.r(this.W);
        this.f1.x(0.0f);
        this.f1.s(Math.abs(f2));
    }

    public int Q(View view, ColorStateList colorStateList, int i2) {
        return colorStateList == null ? i2 : colorStateList.getColorForState(view.getDrawableState(), i2);
    }

    public void Q0(boolean z, boolean z2) {
        l lVar;
        if (z2) {
            this.w = true;
            this.B0 = true;
        }
        if (!z || (lVar = this.A0) == null) {
            return;
        }
        lVar.J6(this);
    }

    public void R(ValueAnimator valueAnimator) {
        this.G = ((Float) valueAnimator.getAnimatedValue("backgroundHeight")).floatValue();
    }

    public void R0(int i2, boolean z, boolean z2) {
        i iVar = new i(z, z2);
        float max = (this.k * (getMax() - getMin())) + getMin();
        this.i1.c();
        COUIDynamicAnimation.q qVar = this.j1;
        if (qVar != null) {
            this.i1.removeEndListener(qVar);
        }
        this.i1.a(iVar);
        this.i1.r(max * this.a1);
        Q0(z, z2);
        this.i1.x(i2 * this.a1);
        this.j1 = iVar;
    }

    public final ValueAnimator S(long j2, Interpolator interpolator) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(j2);
        valueAnimator.setInterpolator(interpolator);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.rl2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.i.v0(valueAnimator2);
            }
        });
        return valueAnimator;
    }

    public final void S0() {
        if (q0()) {
            T0();
        }
    }

    public final float T(int i2) {
        float max = getMax();
        float min = getMin();
        float f2 = i2;
        float f3 = max - min;
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, (f2 - min) / f3));
    }

    public void T0() {
        ft7 ft7Var;
        if (!this.M0 || this.Q0 == null || (ft7Var = this.R0) == null) {
            return;
        }
        ft7Var.n0();
    }

    public void U0(boolean z, boolean z2) {
        l lVar;
        if (z2) {
            this.w = false;
            this.B0 = false;
        }
        if (!z || (lVar = this.A0) == null) {
            return;
        }
        lVar.u4(this);
    }

    public final int V(int i2) {
        return Math.max(this.v, Math.min(i2, this.u));
    }

    public float V0(float f2, float f3) {
        return new BigDecimal(Float.toString(f2)).subtract(new BigDecimal(Float.toString(f3))).floatValue();
    }

    public final float W(float f2) {
        return Math.max(0.0f, Math.min(f2, 1.0f));
    }

    public void W0() {
        x(this.m0);
        this.m0.start();
    }

    public final ValueAnimator X(long j2, Interpolator interpolator) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(j2);
        valueAnimator.setInterpolator(interpolator);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.ql2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.i.w0(valueAnimator2);
            }
        });
        return valueAnimator;
    }

    public boolean X0(MotionEvent motionEvent, View view) {
        float y = motionEvent.getY();
        return this.q >= ((float) view.getPaddingStart()) && this.q <= ((float) (view.getWidth() - view.getPaddingEnd())) && y >= 0.0f && y <= ((float) view.getHeight());
    }

    public void Y() {
        E0();
        getFastMoveSpring().o(0.0d);
        if (this.w) {
            this.w = false;
            this.B0 = false;
            bj2.d("COUISeekBar", "handleMotionEventCancel: dragging cancelled by parent");
        }
        setPressed(false);
        D0();
    }

    public void Z(MotionEvent motionEvent) {
        this.q = motionEvent.getX();
        this.o0 = motionEvent.getX();
        this.d0 = false;
        L(motionEvent);
    }

    public void a0(MotionEvent motionEvent) {
        float seekBarWidth = getSeekBarWidth();
        int i2 = this.u;
        int i3 = this.v;
        int i4 = i2 - i3;
        float f2 = (i4 > 0 ? (this.r * seekBarWidth) / i4 : 0.0f) + i3;
        if (this.H0 && Float.compare(f2, seekBarWidth / 2.0f) == 0 && Math.abs(motionEvent.getX() - this.o0) < 20.0f) {
            return;
        }
        if (this.w && this.B0) {
            int i5 = this.C0;
            if (i5 != 0) {
                if (i5 == 1) {
                    Z0(motionEvent);
                    return;
                } else if (i5 != 2) {
                    return;
                }
            }
            Y0(motionEvent);
            return;
        }
        if (t0(motionEvent)) {
            float x = motionEvent.getX();
            if (Math.abs(x - this.q) > this.p) {
                bj2.d("COUISeekBar", "start drag mScale = " + this.k);
                this.i1.c();
                S0();
                N0();
                W0();
                this.o0 = x;
                this.h1.r(this.k * 1000.0f);
                if (s0()) {
                    p0(motionEvent);
                }
            }
        }
    }

    public final void a1() {
        if (!this.M0 || this.Q0 == null || this.R0 == null) {
            return;
        }
        int seekBarWidth = getSeekBarWidth();
        bj2.d("COUISeekBar", "COUISeekBar updateBehavior : setActiveFrame:" + seekBarWidth);
        this.R0.h0(0.0f, (float) seekBarWidth);
    }

    public void b0(MotionEvent motionEvent) {
        l lVar;
        E0();
        getFastMoveSpring().o(0.0d);
        if (!this.w) {
            if (isEnabled() && X0(motionEvent, this) && s0()) {
                S0();
                s(motionEvent.getX());
                return;
            }
            return;
        }
        this.w = false;
        this.B0 = false;
        bj2.d("COUISeekBar", "handleMotionEventUp mFlingVelocity = " + this.T0);
        if (!this.M0 || Math.abs(this.T0) < 100.0f) {
            float f2 = this.k;
            if (f2 >= 0.0f && f2 <= 1.0f && (lVar = this.A0) != null) {
                lVar.u4(this);
            }
            N();
        } else {
            O(this.T0);
        }
        setPressed(false);
        D0();
    }

    public final void b1() {
        int seekBarWidth = getSeekBarWidth();
        int i2 = this.u - this.v;
        this.a1 = i2 > 0 ? seekBarWidth / i2 : 0.0f;
    }

    public final void c0() {
    }

    public final void c1() {
        int i2 = this.u;
        int i3 = this.v;
        int i4 = i2 - i3;
        float f2 = i4 > 0 ? (this.r - i3) / i4 : 0.0f;
        this.k = f2;
        this.f2045j = f2;
    }

    public final void d0() {
        g0();
        m0();
        j0();
        i0();
        e0();
        f0();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        H0();
        L0();
        super.draw(canvas);
    }

    public final void e0() {
        if (this.i1 != null) {
            return;
        }
        FloatValueHolder floatValueHolder = new FloatValueHolder(0.0f);
        com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
        cVar.i(0.0f);
        cVar.l(0.3f);
        com.coui.appcompat.animation.dynamicanimation.b bVarE = new com.coui.appcompat.animation.dynamicanimation.b(floatValueHolder).E(cVar);
        this.i1 = bVarE;
        bVarE.b(new e());
    }

    public final void f0() {
        if (this.k1 != null) {
            return;
        }
        FloatValueHolder floatValueHolder = new FloatValueHolder(0.0f);
        com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
        cVar.i(0.0f);
        cVar.l(0.1f);
        com.coui.appcompat.animation.dynamicanimation.b bVarE = new com.coui.appcompat.animation.dynamicanimation.b(floatValueHolder).E(cVar);
        this.k1 = bVarE;
        bVarE.b(new f());
    }

    public final void g0() {
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator == null) {
            this.m0 = S(183L, s1);
        } else {
            x(valueAnimator);
        }
        setEnlargeAnimatorValues(this.m0);
    }

    public int getEnd() {
        return getPaddingEnd();
    }

    public int getLabelHeight() {
        return this.L0.getIntrinsicHeight();
    }

    @Override // android.widget.ProgressBar
    public int getMax() {
        return this.u;
    }

    @Override // android.widget.ProgressBar
    public int getMin() {
        return this.v;
    }

    public float getMoveDamping() {
        return this.I0;
    }

    public int getMoveType() {
        return this.C0;
    }

    @Deprecated
    public int getNormalSeekBarWidth() {
        return getSeekBarWidth();
    }

    @Override // android.widget.ProgressBar
    public int getProgress() {
        return this.t;
    }

    public int getSeekBarCenterY() {
        return getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) >> 1);
    }

    public int getSeekBarWidth() {
        return (int) (((getWidth() - getStart()) - getEnd()) - (this.R * 2.0f));
    }

    public int getStart() {
        return getPaddingStart();
    }

    public final void h0() {
        if (this.y0 != null) {
            return;
        }
        kki kkiVarC = ski.g().c();
        this.y0 = kkiVarC;
        kkiVarC.p(this.F0);
        this.y0.a(new h());
    }

    public final void i0() {
        if (this.h1 != null) {
            return;
        }
        FloatValueHolder floatValueHolder = new FloatValueHolder(0.0f);
        com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
        cVar.i(0.0f);
        cVar.l(0.1f);
        com.coui.appcompat.animation.dynamicanimation.b bVarE = new com.coui.appcompat.animation.dynamicanimation.b(floatValueHolder).E(cVar);
        this.h1 = bVarE;
        bVarE.b(new d());
    }

    public final void j0() {
        if (this.f1 != null) {
            return;
        }
        this.f1 = new com.coui.appcompat.animation.dynamicanimation.b(this, this.g1);
        com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
        cVar.i(0.0f);
        cVar.l(0.6f);
        this.f1.E(cVar);
    }

    public final void k0() {
        VelocityTracker velocityTracker = this.G0;
        if (velocityTracker == null) {
            this.G0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void l0(Context context) {
        this.Q0 = vie.e(context);
        this.S0 = new pt7(0.0f);
        int seekBarWidth = getSeekBarWidth();
        bj2.d("COUISeekBar", "COUISeekBar initPhysicsAnimator : setActiveFrame:" + seekBarWidth);
        ft7 ft7Var = (ft7) ((ft7) new ft7(4, 0.0f, (float) seekBarWidth).J(this.S0)).A(this.U0, this.V0).b(null);
        this.R0 = ft7Var;
        ft7Var.j0(this.W0);
        this.Q0.c(this.R0);
        this.Q0.a(this.R0, this);
        this.Q0.b(this.R0, this);
    }

    public final void m0() {
        if (this.d1 != null) {
            return;
        }
        this.d1 = new com.coui.appcompat.animation.dynamicanimation.b(this, this.e1);
        com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
        cVar.i(0.0f);
        cVar.l(0.2f);
        this.d1.E(cVar);
    }

    public final void n0() {
        if (this.G0 == null) {
            this.G0 = VelocityTracker.obtain();
        }
    }

    public final void o0() {
        this.p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        ViewCompat.setAccessibilityDelegate(this, new g());
        Paint paint = new Paint(1);
        this.p0 = paint;
        paint.setDither(true);
        TextPaint textPaint = new TextPaint(1);
        this.a0 = textPaint;
        textPaint.setColor(-16777216);
        this.w0 = new m(this.u0);
        this.x0 = new m(this.v0);
    }

    @Override // com.oplus.aiunit.vision.s50
    public void onAnimationEnd(d01 d01Var) {
        l lVar = this.A0;
        if (lVar != null) {
            lVar.u4(this);
        }
    }

    @Override // com.oplus.aiunit.vision.u50
    public void onAnimationUpdate(d01 d01Var) {
        float f2;
        float f3 = this.k;
        Object objN = d01Var.n();
        if (objN == null) {
            return;
        }
        float fFloatValue = ((Float) objN).floatValue();
        int seekBarWidth = getSeekBarWidth();
        if (r0()) {
            float f4 = seekBarWidth;
            f2 = (f4 - fFloatValue) / f4;
        } else {
            f2 = fFloatValue / seekBarWidth;
        }
        setFlingScale(f2);
        K(d01Var, f3);
        float f5 = this.r;
        setLocalProgress(U(Math.round((this.u - this.v) * this.k) + this.v));
        invalidate();
        if (f5 != this.r) {
            this.o0 = fFloatValue + getStart();
            l lVar = this.A0;
            if (lVar != null) {
                lVar.N4(this, this.t, true);
            }
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
        T0();
        wvk.l();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        G(canvas);
        E(canvas, getSeekBarWidth());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = this.D0 + getPaddingTop() + getPaddingBottom();
        if (1073741824 != mode || size < paddingTop) {
            size = paddingTop;
        }
        int i4 = this.K0;
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
        savedState.mSaveProgress = this.r;
        return savedState;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.c0 = null;
        this.b0 = null;
        this.B0 = false;
        T0();
        a1();
        b1();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            if (motionEvent.getAction() == 1) {
                b0(motionEvent);
                return true;
            }
            if (motionEvent.getAction() != 3) {
                return false;
            }
            Y();
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!q0()) {
                T0();
            }
            if (this.M0 && this.Q0 == null) {
                l0(getContext());
            }
            k0();
            this.G0.addMovement(motionEvent);
            this.w = false;
            this.B0 = false;
            Z(motionEvent);
        } else if (action == 1) {
            this.i1.c();
            this.h1.c();
            VelocityTracker velocityTracker = this.G0;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, 8000.0f);
                this.T0 = this.G0.getXVelocity();
                bj2.d("COUISeekBar", "onTouchEvent ACTION_UP mFlingVelocity = " + this.T0);
            }
            C0();
            B();
            b0(motionEvent);
        } else if (action == 2) {
            F0();
            A();
            n0();
            this.G0.addMovement(motionEvent);
            a0(motionEvent);
        } else if (action == 3) {
            this.i1.c();
            this.h1.c();
            C0();
            B();
            Y();
        }
        return true;
    }

    public final void p0(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        M0(r0() ? (((getWidth() - x) - getEnd()) - this.R) / getSeekBarWidth() : ((x - getStart()) - this.R) / getSeekBarWidth(), true);
        this.h1.x(this.k * 1000.0f);
        int iU = U(Math.round((this.k * (getMax() - getMin())) + getMin()));
        int i2 = this.r;
        int i3 = this.t;
        setLocalProgress(iU);
        if (i2 != this.r) {
            l lVar = this.A0;
            if (lVar != null) {
                lVar.N4(this, this.t, true);
            }
            if (i3 != this.t) {
                B0();
            }
        }
    }

    public final boolean q0() {
        vie vieVar;
        if (this.e0) {
            float f2 = this.k;
            if ((f2 > 1.0f || f2 < 0.0f) && (vieVar = this.Q0) != null && vieVar.q()) {
                return true;
            }
        }
        return false;
    }

    public boolean r0() {
        return getLayoutDirection() == 1;
    }

    public void s(float f2) {
        float seekBarWidth = getSeekBarWidth();
        float f3 = this.I;
        float f4 = seekBarWidth + ((f3 / 2.0f) * 2.0f);
        float f5 = this.R - (f3 / 2.0f);
        float width = r0() ? (((getWidth() - f2) - getStart()) - f5) / f4 : ((f2 - getStart()) - f5) / f4;
        A();
        R0(U(Math.round((width * (getMax() - getMin())) + getMin())), true, true);
    }

    public final boolean s0() {
        return this.C0 != 2;
    }

    @Deprecated
    public void setBackgroundEnlargeScale(float f2) {
    }

    @Deprecated
    public void setBackgroundHeight(float f2) {
    }

    @Deprecated
    public void setBackgroundRadius(float f2) {
    }

    public void setBackgroundRoundCornerWeight(float f2) {
        this.F = f2;
        invalidate();
    }

    @Deprecated
    public void setCustomProgressAnimDuration(float f2) {
    }

    @Deprecated
    public void setCustomProgressAnimInterpolator(Interpolator interpolator) {
    }

    public void setDeformedListener(k kVar) {
    }

    public void setDeformedParams(b85 b85Var) {
        this.k = b85Var.g();
        this.f2045j = b85Var.a();
        this.r = b85Var.f();
        this.f0 = b85Var.c();
        this.g0 = b85Var.e();
        this.h0 = b85Var.h();
        this.i0 = b85Var.b();
        this.j0 = b85Var.d();
        invalidate();
    }

    public void setEnableAdaptiveVibrator(boolean z) {
        this.m = z;
    }

    public void setEnableVibrator(boolean z) {
        this.f2046l = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A = Q(this, this.x, lh2.h(getContext(), R$color.coui_seekbar_progress_selector));
        this.B = Q(this, this.y, lh2.h(getContext(), R$color.coui_seekbar_background_selector));
        this.C = Q(this, this.z, lh2.h(getContext(), R$color.coui_seekbar_thumb_selector));
    }

    public void setEnlargeAnimatorValues(ValueAnimator valueAnimator) {
        valueAnimator.setValues(PropertyValuesHolder.ofFloat("backgroundHeight", this.E, this.D));
    }

    public void setFlingLinearDamping(float f2) {
        ft7 ft7Var;
        if (this.M0) {
            this.W0 = f2;
            if (this.Q0 == null || (ft7Var = this.R0) == null) {
                return;
            }
            ft7Var.j0(f2);
        }
    }

    public void setIncrement(int i2) {
        this.z0 = Math.abs(i2);
    }

    @Override // android.widget.ProgressBar
    @Deprecated
    public void setInterpolator(Interpolator interpolator) {
    }

    public void setLocalMax(int i2) {
        this.u = i2;
        b1();
        c1();
        super.setMax(i2);
    }

    public void setLocalMin(int i2) {
        this.v = i2;
        b1();
        c1();
        super.setMin(i2);
    }

    public void setLocalProgress(int i2) {
        this.r = i2;
        this.t = V(i2);
        super.setProgress(i2);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar
    public void setMax(int i2) {
        if (i2 < getMin()) {
            int min = getMin();
            Log.e("COUISeekBar", "setMax : the input params is lower than min. (inputMax:" + i2 + ",mMin:" + this.v + ")");
            i2 = min;
        }
        if (i2 != this.u) {
            setLocalMax(i2);
            if (this.r > i2) {
                setProgress(i2);
            }
        }
        invalidate();
    }

    public void setMaxHeightDeformed(float f2) {
        this.Y0 = f2;
    }

    public void setMaxMovingDistance(int i2) {
        this.X0 = i2;
    }

    public void setMaxWidthDeformed(float f2) {
        this.Z0 = f2;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar
    public void setMin(int i2) {
        int max = i2 < 0 ? 0 : i2;
        if (i2 > getMax()) {
            max = getMax();
            Log.e("COUISeekBar", "setMin : the input params is greater than max. (inputMin:" + i2 + ",mMax:" + this.u + ")");
        }
        if (max != this.v) {
            setLocalMin(max);
            if (this.r < max) {
                setProgress(max);
            }
        }
        invalidate();
    }

    public void setMoveDamping(float f2) {
        this.I0 = f2;
    }

    public void setMoveType(int i2) {
        this.C0 = i2;
    }

    public void setOnSeekBarChangeListener(l lVar) {
        this.A0 = lVar;
    }

    @Deprecated
    public void setPaddingHorizontal(float f2) {
    }

    public void setPhysicalEnabled(boolean z) {
        if (z == this.M0) {
            return;
        }
        if (z) {
            this.M0 = true;
            a1();
        } else {
            T0();
            this.M0 = false;
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i2) {
        setProgress(i2, false);
    }

    public void setProgressColor(@NonNull ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.x = colorStateList;
            this.A = Q(this, colorStateList, lh2.h(getContext(), R$color.coui_seekbar_progress_selector));
            invalidate();
        }
    }

    @Deprecated
    public void setProgressContentDescription(String str) {
    }

    @Deprecated
    public void setProgressEnlargeScale(float f2) {
    }

    @Deprecated
    public void setProgressHeight(float f2) {
    }

    @Deprecated
    public void setProgressRadius(float f2) {
    }

    public void setProgressRoundCornerWeight(float f2) {
        this.J = f2;
        J();
        invalidate();
    }

    public void setReleaseAnimatorValues(ValueAnimator valueAnimator) {
        valueAnimator.setValues(PropertyValuesHolder.ofFloat("backgroundHeight", this.G, this.E));
    }

    public void setSeekBarBackgroundColor(@NonNull ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.y = colorStateList;
            this.B = Q(this, colorStateList, lh2.h(getContext(), R$color.coui_seekbar_background_selector));
            invalidate();
        }
    }

    public void setStartFromMiddle(boolean z) {
        this.H0 = z;
    }

    public void setSupportDeformation(boolean z) {
        this.e0 = z;
    }

    @Deprecated
    public void setText(String str) {
    }

    public void setThumbColor(@NonNull ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.z = colorStateList;
            this.C = Q(this, colorStateList, lh2.h(getContext(), R$color.coui_seekbar_thumb_selector));
            invalidate();
        }
    }

    public final void t() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        }
    }

    public boolean t0(MotionEvent motionEvent) {
        return X0(motionEvent, this);
    }

    public final float u() {
        float f2 = this.I0;
        if (f2 != 0.0f) {
            return f2;
        }
        return 1.0f;
    }

    public final boolean u0(float f2, float f3) {
        int seekBarCenterY = getSeekBarCenterY();
        float f4 = this.N;
        float f5 = this.R;
        if (f2 >= f4 - f5 && f2 <= f4 + f5) {
            float f6 = seekBarCenterY;
            if (f3 >= f6 - f5 && f3 <= f6 + f5) {
                return true;
            }
        }
        return false;
    }

    public final void v(float f2) {
        if (f2 > 1.0f) {
            this.k1.x((f2 - 1.0f) * 100000.0f);
        } else if (f2 >= 0.0f) {
            G0();
        } else {
            this.k1.x(Math.abs(f2) * 100000.0f);
        }
    }

    public void w() {
        float f2 = this.k;
        if (f2 > 1.0f) {
            this.k1.x(((f2 - 1.0f) / 5.0f) * 100000.0f);
        } else if (f2 < 0.0f) {
            this.k1.x((Math.abs(f2) / 5.0f) * 100000.0f);
        }
    }

    public void x(ValueAnimator valueAnimator) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.cancel();
    }

    public void x0(float f2) {
        float f3 = this.a1;
        if (f3 > 0.0f) {
            setLocalProgress((int) (f2 / f3));
            float seekBarWidth = getSeekBarWidth() > 0 ? (f2 - (this.v * this.a1)) / getSeekBarWidth() : 0.0f;
            this.k = seekBarWidth;
            this.f2045j = seekBarWidth;
            invalidate();
        }
    }

    public void y(int i2) {
        z(i2, true, true);
    }

    public void y0(boolean z) {
        Q0(z, true);
    }

    public void z(int i2, boolean z, boolean z2) {
        if (this.r != i2) {
            int i3 = this.t;
            setLocalProgress(i2);
            l lVar = this.A0;
            if (lVar != null) {
                lVar.N4(this, this.t, z2);
            }
            if (!z || i3 == this.t) {
                return;
            }
            B0();
        }
    }

    public void z0(boolean z) {
        U0(z, true);
    }

    public COUISeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiSeekBarStyle);
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i2, boolean z) {
        K0(i2, z, false);
    }

    public COUISeekBar(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, R$style.COUISeekBar);
    }

    public COUISeekBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.i = getResources().getString(R$string.coui_seek_bar_role_description);
        this.f2045j = 0.0f;
        this.k = 0.0f;
        this.f2046l = true;
        this.m = true;
        this.f2047n = true;
        this.o = null;
        this.p = 0;
        this.r = 0;
        this.s = 0;
        this.u = 100;
        this.v = 0;
        this.w = false;
        this.x = null;
        this.y = null;
        this.z = null;
        this.k0 = new RectF();
        this.l0 = new RectF();
        this.r0 = false;
        this.s0 = false;
        this.u0 = new Path();
        this.v0 = new Path();
        this.z0 = 1;
        this.B0 = false;
        this.C0 = 1;
        this.F0 = mki.b(500.0d, 30.0d);
        this.H0 = false;
        this.I0 = 0.0f;
        this.M0 = false;
        this.T0 = 0.0f;
        this.U0 = 2.8f;
        this.V0 = 1.0f;
        this.W0 = 15.0f;
        this.X0 = 30;
        this.Y0 = 28.5f;
        this.Z0 = 4.7f;
        this.e1 = new b("thumbScaleTransition");
        this.g1 = new c("glitterEffectTransition");
        this.l1 = new Path();
        this.m1 = new RectF();
        this.n1 = new AnimatorSet();
        this.o1 = PathInterpolatorCompat.create(0.33f, 0.0f, 0.67f, 1.0f);
        this.p1 = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.q1 = new RectF();
        if (attributeSet != null) {
            this.J0 = attributeSet.getStyleAttribute();
        }
        if (this.J0 == 0) {
            this.J0 = i2;
        }
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUISeekBar, i2, i3);
        this.f2046l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarEnableVibrator, true);
        this.m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarAdaptiveVibrator, false);
        this.M0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarPhysicsEnable, true);
        this.r0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarShowProgress, true);
        this.s0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarShowThumb, true);
        this.t0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarShowGlitterEffect, true);
        this.H0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarStartMiddle, false);
        this.y = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUISeekBar_couiSeekBarBackgroundColor);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUISeekBar_couiSeekBarProgressColor);
        this.x = colorStateList;
        if (colorStateList == null) {
            this.x = im2.a(lh2.b(context, com.support.appcompat.R$attr.couiColorContainerTheme, 0), lh2.a(getContext(), com.support.appcompat.R$attr.couiColorDisable));
        }
        this.z = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUISeekBar_couiSeekBarThumbColor);
        this.B = Q(this, this.y, lh2.h(getContext(), R$color.coui_seekbar_background_selector));
        this.A = Q(this, this.x, lh2.h(getContext(), R$color.coui_seekbar_progress_selector));
        this.C = Q(this, this.z, lh2.h(getContext(), R$color.coui_seekbar_thumb_selector));
        this.O0 = typedArrayObtainStyledAttributes.getColor(R$styleable.COUISeekBar_couiSeekBarThumbShadowColor, lh2.h(getContext(), R$color.coui_seekbar_thumb_shadow_color));
        this.Q = getResources().getDimension(R$dimen.coui_seekbar_shadow_offset_y);
        this.O = getResources().getDimension(R$dimen.coui_seekbar_thumb_radius);
        this.P = getResources().getDimension(R$dimen.coui_seekbar_thumb_max_radius);
        this.T = getResources().getColor(R$color.coui_seekbar_glitter_effect_min_color);
        this.U = getResources().getColor(R$color.coui_seekbar_glitter_effect_max_color);
        this.F = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUISeekBar_couiSeekBarBackgroundRoundCornerWeight, 0.0f);
        this.J = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUISeekBar_couiSeekBarProgressRoundCornerWeight, 0.0f);
        this.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUISeekBar_couiSeekBarThumbShadowSize, 0);
        this.E = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUISeekBar_couiSeekBarBackgroundHeight, getResources().getDimension(R$dimen.coui_seekbar_background_height));
        this.I = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUISeekBar_couiSeekBarProgressHeight, getResources().getDimension(R$dimen.coui_seekbar_progress_height));
        this.D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUISeekBar_couiSeekBarMinHeight, getResources().getDimensionPixelSize(R$dimen.coui_seekbar_view_min_height));
        this.K0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUISeekBar_couiSeekBarMaxWidth, 0);
        this.H = typedArrayObtainStyledAttributes.getFloat(R$styleable.COUISeekBar_couiSeekBarBackGroundEnlargeScale, 1.4f);
        this.e0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISeekBar_couiSeekBarDeformation, true);
        typedArrayObtainStyledAttributes.recycle();
        this.L0 = new osj(getContext());
        this.f2047n = wvk.h(context);
        float f2 = this.E * this.H;
        this.D = f2;
        this.R = f2 / 2.0f;
        o0();
        J();
        d0();
    }
}
