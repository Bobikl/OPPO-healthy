package androidx.recyclerview.widget;

import android.content.Context;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes12.dex */
public class NearLocateOverScroller extends OverScroller implements NearIOverScroller {
    private static final int FLING_MODE = 1;
    private static final int INVALID_POSITION = -1;
    private static final float ONE = 1.0f;
    private static final Interpolator SCROLL = new Interpolator() { // from class: androidx.recyclerview.widget.NearLocateOverScroller.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final int SCROLL_DEFAULT_DURATION = 250;
    private static final int SCROLL_MODE = 0;
    private static final String TAG = "NearLocateOverScroller";
    private static final float THOUSAND = 1000.0f;
    private Interpolator mInterpolator;
    private int mMode;
    private NearSplineOverScroller mScrollerX;
    private NearSplineOverScroller mScrollerY;

    public static class NearSplineOverScroller {
        private static final int BALLISTIC = 2;
        private static final int CUBIC = 1;
        private static final float END_TENSION = 1.0f;
        private static final float GRAVITY = 2000.0f;
        private static final float INFLEXION = 0.35f;
        private static final float LENGTH = 39.37f;
        private static final double MIN_ALPHA = 1.0E-5d;
        private static final int NB_SAMPLES = 100;
        private static final float ONE = 1.0f;
        private static final float P1 = 0.175f;
        private static final float P2 = 0.35000002f;
        private static final float SIX = 6.0f;
        private static final int SPLINE = 0;
        private static final float START_TENSION = 0.5f;
        private static final float THREE = 3.0f;
        private static final float TUNING = 0.84f;
        private static final float TWO = 2.0f;
        private static final float ZERO = 0.0f;
        private float mCurrVelocity;
        private int mCurrentPosition;
        private float mDeceleration;
        private int mDuration;
        private int mFinal;
        private int mOver;
        private float mPhysicalCoeff;
        private int mSplineDistance;
        private int mSplineDuration;
        private int mStart;
        private long mStartTime;
        private int mVelocity;
        private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
        private static final float[] SPLINE_POSITION = new float[101];
        private static final float[] SPLINE_TIME = new float[101];
        private float mFlingFriction = ViewConfiguration.getScrollFriction() * 2.5f;
        private int mState = 0;
        private boolean mFinished = true;

        static {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i = 0; i < 100; i++) {
                float f13 = i / 100.0f;
                float f14 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f14 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = 1.0f - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f15 = (((f4 * P1) + (f2 * P2)) * f5) + f6;
                    if (Math.abs(f15 - f13) < 1.0E-5d) {
                        break;
                    } else if (f15 > f13) {
                        f14 = f2;
                    } else {
                        f11 = f2;
                    }
                }
                SPLINE_POSITION[i] = (f5 * ((f4 * 0.5f) + f2)) + f6;
                float f16 = 1.0f;
                while (true) {
                    f7 = ((f16 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f7 * f3 * f8;
                    f10 = f7 * f7 * f7;
                    float f17 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (Math.abs(f17 - f13) < 1.0E-5d) {
                        break;
                    }
                    if (f17 > f13) {
                        f16 = f7;
                    } else {
                        f12 = f7;
                    }
                    f = 2.0f;
                    f3 = 3.0f;
                }
                SPLINE_TIME[i] = (f9 * ((f8 * P1) + (f7 * P2))) + f10;
            }
            SPLINE_POSITION[100] = 1.0f;
            SPLINE_TIME[100] = 1.0f;
        }

        public NearSplineOverScroller(Context context) {
            this.mPhysicalCoeff = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * TUNING;
        }

        private void adjustDuration(int i, int i2, int i3) {
            float fAbs = Math.abs((i3 - i) / (i2 - i));
            int i4 = (int) (fAbs * 100.0f);
            if (i4 < 100) {
                float f = i4 / 100.0f;
                int i5 = i4 + 1;
                float[] fArr = SPLINE_TIME;
                float f2 = fArr[i4];
                this.mDuration = (int) (this.mDuration * (f2 + (((fAbs - f) / ((i5 / 100.0f) - f)) * (fArr[i5] - f2))));
            }
        }

        private void fitOnBounceCurve(int i, int i2, int i3) {
            float f = this.mDeceleration;
            float f2 = (-i3) / f;
            float f3 = i3;
            float fSqrt = (float) Math.sqrt((((double) ((((f3 * f3) / 2.0f) / Math.abs(f)) + Math.abs(i2 - i))) * 2.0d) / ((double) Math.abs(this.mDeceleration)));
            this.mStartTime -= (long) ((int) ((fSqrt - f2) * 1000.0f));
            this.mCurrentPosition = i2;
            this.mStart = i2;
            this.mVelocity = (int) ((-this.mDeceleration) * fSqrt);
        }

        private static float getDeceleration(int i) {
            if (i > 0) {
                return -2000.0f;
            }
            return GRAVITY;
        }

        private double getSplineDeceleration(int i) {
            return Math.log((Math.abs(i) * 0.35f) / (this.mFlingFriction * this.mPhysicalCoeff));
        }

        private double getSplineFlingDistance(int i) {
            double splineDeceleration = getSplineDeceleration(i);
            float f = DECELERATION_RATE;
            return ((double) (this.mFlingFriction * this.mPhysicalCoeff)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * splineDeceleration);
        }

        private int getSplineFlingDuration(int i) {
            return (int) (Math.exp(getSplineDeceleration(i) / ((double) (DECELERATION_RATE - 1.0f))) * 1000.0d);
        }

        private void onEdgeReached() {
            int i = this.mVelocity;
            float f = i * i;
            float fAbs = f / (Math.abs(this.mDeceleration) * 2.0f);
            float fSignum = Math.signum(this.mVelocity);
            int i2 = this.mOver;
            if (fAbs > i2) {
                this.mDeceleration = ((-fSignum) * f) / (i2 * 2.0f);
                fAbs = i2;
            }
            this.mOver = (int) fAbs;
            this.mState = 2;
            int i3 = this.mStart;
            int i4 = this.mVelocity;
            if (i4 <= 0) {
                fAbs = -fAbs;
            }
            this.mFinal = i3 + ((int) fAbs);
            this.mDuration = -((int) ((i4 * 1000.0f) / this.mDeceleration));
        }

        private void startAfterEdge(int i, int i2, int i3, int i4) {
            if (i > i2 && i < i3) {
                Log.e(NearLocateOverScroller.TAG, "startAfterEdge called from a valid position");
                this.mFinished = true;
                return;
            }
            boolean z = i > i3;
            int i5 = z ? i3 : i2;
            int i6 = i - i5;
            if (i6 * i4 >= 0) {
                startBounceAfterEdge(i, i5, i4);
            } else if (getSplineFlingDistance(i4) > Math.abs(i6)) {
                fling(i, i4, z ? i2 : i, z ? i : i3, this.mOver);
            } else {
                startSpringback(i, i5, i4);
            }
        }

        private void startBounceAfterEdge(int i, int i2, int i3) {
            this.mDeceleration = getDeceleration(i3 == 0 ? i - i2 : i3);
            fitOnBounceCurve(i, i2, i3);
            onEdgeReached();
        }

        private void startSpringback(int i, int i2, int i3) {
            this.mFinished = false;
            this.mState = 1;
            this.mCurrentPosition = i;
            this.mStart = i;
            this.mFinal = i2;
            int i4 = i - i2;
            this.mDeceleration = getDeceleration(i4);
            this.mVelocity = -i4;
            this.mOver = Math.abs(i4);
            this.mDuration = (int) (Math.sqrt((i4 * (-2.0f)) / this.mDeceleration) * 1000.0d);
        }

        public boolean continueWhenFinished() {
            int i = this.mState;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                if (i == 2) {
                    this.mStartTime += (long) this.mDuration;
                    startSpringback(this.mFinal, this.mStart, 0);
                }
            } else {
                if (this.mDuration >= this.mSplineDuration) {
                    return false;
                }
                int i2 = this.mFinal;
                this.mCurrentPosition = i2;
                this.mStart = i2;
                int i3 = (int) this.mCurrVelocity;
                this.mVelocity = i3;
                this.mDeceleration = getDeceleration(i3);
                this.mStartTime += (long) this.mDuration;
                onEdgeReached();
            }
            update();
            return true;
        }

        public void finish() {
            this.mCurrentPosition = this.mFinal;
            this.mFinished = true;
        }

        public void fling(int i, int i2, int i3, int i4, int i5) {
            double splineFlingDistance;
            this.mOver = i5;
            this.mFinished = false;
            float f = i2;
            this.mCurrVelocity = f;
            this.mVelocity = i2;
            this.mDuration = 0;
            this.mSplineDuration = 0;
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mCurrentPosition = i;
            this.mStart = i;
            if (i > i4 || i < i3) {
                startAfterEdge(i, i3, i4, i2);
                return;
            }
            this.mState = 0;
            if (i2 != 0) {
                int splineFlingDuration = getSplineFlingDuration(i2);
                this.mDuration = splineFlingDuration;
                this.mSplineDuration = splineFlingDuration;
                splineFlingDistance = getSplineFlingDistance(i2);
            } else {
                splineFlingDistance = 0.0d;
            }
            int iSignum = (int) (splineFlingDistance * ((double) Math.signum(f)));
            this.mSplineDistance = iSignum;
            int i6 = i + iSignum;
            this.mFinal = i6;
            if (i6 < i3) {
                adjustDuration(this.mStart, i6, i3);
                this.mFinal = i3;
            }
            int i7 = this.mFinal;
            if (i7 > i4) {
                adjustDuration(this.mStart, i7, i4);
                this.mFinal = i4;
            }
        }

        public void notifyEdgeReached(int i, int i2, int i3) {
            if (this.mState == 0) {
                this.mOver = i3;
                this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
                startAfterEdge(i, i2, i2, (int) this.mCurrVelocity);
            }
        }

        public void setFinalPosition(int i) {
            this.mFinal = i;
            this.mSplineDistance = i - this.mStart;
            this.mFinished = false;
        }

        public void setFriction(float f) {
            this.mFlingFriction = f;
        }

        public boolean springback(int i, int i2, int i3) {
            this.mFinished = true;
            this.mCurrentPosition = i;
            this.mStart = i;
            this.mFinal = i;
            this.mVelocity = 0;
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mDuration = 0;
            if (i < i2) {
                startSpringback(i, i2, 0);
            } else if (i > i3) {
                startSpringback(i, i3, 0);
            }
            return !this.mFinished;
        }

        public void startScroll(int i, int i2, int i3) {
            this.mFinished = false;
            this.mCurrentPosition = i;
            this.mStart = i;
            this.mFinal = i + i2;
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mDuration = i3;
            this.mDeceleration = 0.0f;
            this.mVelocity = 0;
        }

        public boolean update() {
            float f;
            float f2;
            double d;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.mStartTime;
            if (jCurrentAnimationTimeMillis == 0) {
                return this.mDuration > 0;
            }
            int i = this.mDuration;
            if (jCurrentAnimationTimeMillis > i) {
                return false;
            }
            int i2 = this.mState;
            if (i2 == 0) {
                int i3 = this.mSplineDuration;
                float f3 = jCurrentAnimationTimeMillis / i3;
                int i4 = (int) (f3 * 100.0f);
                if (i4 < 100) {
                    float f4 = i4 / 100.0f;
                    int i5 = i4 + 1;
                    float[] fArr = SPLINE_POSITION;
                    float f5 = fArr[i4];
                    f2 = (fArr[i5] - f5) / ((i5 / 100.0f) - f4);
                    f = f5 + ((f3 - f4) * f2);
                } else {
                    f = 1.0f;
                    f2 = 0.0f;
                }
                int i6 = this.mSplineDistance;
                this.mCurrVelocity = ((f2 * i6) / i3) * 1000.0f;
                d = f * i6;
            } else if (i2 == 1) {
                float f6 = jCurrentAnimationTimeMillis / i;
                float f7 = f6 * f6;
                float fSignum = Math.signum(this.mVelocity);
                int i7 = this.mOver;
                this.mCurrVelocity = fSignum * i7 * 6.0f * ((-f6) + f7);
                d = i7 * fSignum * ((3.0f * f7) - ((2.0f * f6) * f7));
            } else if (i2 != 2) {
                d = 0.0d;
            } else {
                float f8 = jCurrentAnimationTimeMillis / 1000.0f;
                int i8 = this.mVelocity;
                float f9 = this.mDeceleration;
                this.mCurrVelocity = i8 + (f9 * f8);
                d = (i8 * f8) + (((f9 * f8) * f8) / 2.0f);
            }
            this.mCurrentPosition = this.mStart + ((int) Math.round(d));
            return true;
        }

        public void updateScroll(float f) {
            int i = this.mStart;
            this.mCurrentPosition = i + Math.round(f * (this.mFinal - i));
        }
    }

    public NearLocateOverScroller(Context context) {
        this(context, null);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void abortAnimation() {
        this.mScrollerX.finish();
        this.mScrollerY.finish();
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public boolean computeScrollOffset() {
        if (isNearFinished()) {
            return false;
        }
        int i = this.mMode;
        if (i == 0) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.mScrollerX.mStartTime;
            int i2 = this.mScrollerX.mDuration;
            if (jCurrentAnimationTimeMillis < i2) {
                float interpolation = this.mInterpolator.getInterpolation(jCurrentAnimationTimeMillis / i2);
                this.mScrollerX.updateScroll(interpolation);
                this.mScrollerY.updateScroll(interpolation);
            } else {
                abortAnimation();
            }
        } else if (i == 1) {
            if (!this.mScrollerX.mFinished && !this.mScrollerX.update() && !this.mScrollerX.continueWhenFinished()) {
                this.mScrollerX.finish();
            }
            if (!this.mScrollerY.mFinished && !this.mScrollerY.update() && !this.mScrollerY.continueWhenFinished()) {
                this.mScrollerY.finish();
            }
        }
        return true;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocity() {
        return (float) Math.hypot(this.mScrollerX.mCurrVelocity, this.mScrollerY.mCurrVelocity);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocityX() {
        return this.mScrollerX.mCurrVelocity;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocityY() {
        return this.mScrollerY.mCurrVelocity;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public int getNearCurrX() {
        return this.mScrollerX.mCurrentPosition;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public int getNearCurrY() {
        return this.mScrollerY.mCurrentPosition;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public int getNearFinalX() {
        return this.mScrollerX.mFinal;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public int getNearFinalY() {
        return this.mScrollerY.mFinal;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public boolean isNearFinished() {
        return this.mScrollerX.mFinished && this.mScrollerY.mFinished;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public boolean isScrollingInDirection(float f, float f2) {
        return !isFinished() && Math.signum(f) == Math.signum((float) (this.mScrollerX.mFinal - this.mScrollerX.mStart)) && Math.signum(f2) == Math.signum((float) (this.mScrollerY.mFinal - this.mScrollerY.mStart));
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.mScrollerX.notifyEdgeReached(i, i2, i3);
        springBack(i, 0, 0, 0, 0, 0);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.mScrollerY.notifyEdgeReached(i, i2, i3);
        springBack(0, i, 0, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setCurrVelocityX(float f) {
        this.mScrollerX.mCurrVelocity = f;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setCurrVelocityY(float f) {
        this.mScrollerY.mCurrVelocity = f;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFinalX(int i) {
        if (i == -1) {
            return;
        }
        this.mScrollerX.setFinalPosition(i);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFinalY(int i) {
        if (i == -1) {
            return;
        }
        this.mScrollerY.setFinalPosition(i);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFlingFriction(float f) {
        this.mScrollerX.setFriction(f);
        this.mScrollerY.setFriction(f);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.mInterpolator = SCROLL;
        } else {
            this.mInterpolator = interpolator;
        }
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setIsScrollView(boolean z) {
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setNearFriction(float f) {
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean zSpringback = this.mScrollerX.springback(i, i3, i4);
        boolean zSpringback2 = this.mScrollerY.springback(i2, i5, i6);
        if (zSpringback || zSpringback2) {
            this.mMode = 1;
        }
        return zSpringback || zSpringback2;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    public NearLocateOverScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.mScrollerX = new NearSplineOverScroller(context);
        this.mScrollerY = new NearSplineOverScroller(context);
        if (interpolator == null) {
            this.mInterpolator = SCROLL;
        } else {
            this.mInterpolator = interpolator;
        }
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (i2 > i8 || i2 < i7) {
            springBack(i, i2, i5, i6, i7, i8);
        } else {
            fling(i, i2, i3, i4);
        }
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mMode = 0;
        this.mScrollerX.startScroll(i, i3, i5);
        this.mScrollerY.startScroll(i2, i4, i5);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4) {
        this.mMode = 1;
        this.mScrollerX.fling(i, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        this.mScrollerY.fling(i2, i4, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
    }
}
