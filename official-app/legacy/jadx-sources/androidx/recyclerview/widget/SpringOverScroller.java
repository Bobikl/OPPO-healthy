package androidx.recyclerview.widget;

import android.content.Context;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes12.dex */
public class SpringOverScroller extends OverScroller implements NearIOverScroller {
    private static final int FLING_MODE = 1;
    private static final int FLING_SPEED_INCREASE_COUNT_THRESHOLD = 4;
    private static final int FLING_SPEED_INCREASE_EDGE_REACHED_VELOCITY = 1000;
    private static final int FLING_SPEED_INCREASE_EDGE_REACHED_VELOCITY_THRESHOLD = 20000;
    private static final int FLING_SPEED_INCREASE_MAX_VELOCITY = 70000;
    private static final float FLING_SPEED_INCREASE_RATE = 1.4f;
    private static final int FLING_SPEED_INCREASE_TIME_INTERVAL_THRESHOLD = 500;
    private static final int FLING_SPEED_INCREASE_VELOCITY_THRESHOLD = 8000;
    private static final float MIN_FRAME_INTERVAL = 0.008f;
    public static final float Near_FLING_FRICTION_FAST = 0.76f;
    public static final float Near_FLING_FRICTION_NORMAL = 0.32f;
    public static final int Near_FLING_MODE_FAST = 0;
    public static final int Near_FLING_MODE_NORMAL = 1;
    private static final float ONE_SECOND = 1000.0f;
    private static final int REST_MODE = 2;
    private static final int SCROLL_DEFAULT_DURATION = 250;
    private static final int SCROLL_MODE = 0;
    private static final float SOLVER_TIMESTEP_SEC = 0.016f;
    private static final int VSYNC_DURATION = 5000;
    private static float mRefreshTime;
    private Context mContext;
    private int mContinuousFlingCount;
    private boolean mEnableFlingSpeedIncrease;
    private Interpolator mInterpolator;
    private float mLastFlingSpeedIncreaseRate;
    private long mLastFlingTime;
    private int mMode;
    private ReboundOverScroller mScrollerX;
    private ReboundOverScroller mScrollerY;

    public static class NearViscousFluidInterpolator implements Interpolator {
        private static final float VISCOUS_FLUID_NORMALIZE;
        private static final float VISCOUS_FLUID_OFFSET;
        private static final float VISCOUS_FLUID_SCALE = 8.0f;

        static {
            float fViscousFluid = 1.0f / viscousFluid(1.0f);
            VISCOUS_FLUID_NORMALIZE = fViscousFluid;
            VISCOUS_FLUID_OFFSET = 1.0f - (fViscousFluid * viscousFluid(1.0f));
        }

        private static float viscousFluid(float f) {
            float f2 = f * 8.0f;
            return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : 0.36787945f + ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float fViscousFluid = VISCOUS_FLUID_NORMALIZE * viscousFluid(f);
            return fViscousFluid > 0.0f ? fViscousFluid + VISCOUS_FLUID_OFFSET : fViscousFluid;
        }
    }

    public static class ReboundOverScroller {
        private static final float FLING_CHANGE_INCREASE_STEP = 1.2f;
        private static final float FLING_CHANGE_REDUCE_STEP = 0.6f;
        private static final float FLING_DXDT_RATIO = 0.167f;
        private static final double FLING_FRICTION_DIVISOR = 10000.0d;
        private static final float FLOAT_1 = 1.0f;
        private static final float FLOAT_2 = 2.0f;
        private static final double INCREASE_FRICTION_COEF = 0.00125d;
        private static final double MAX_VELOCITY_ADJUST_FRICTION = 10000.0d;
        private static final double MID_FLING_BASE_FRICTION = 2.6d;
        private static final double MID_VELOCITY_ADJUST_FRICTION = 4000.0d;
        private static final double MIN_FLING_FRICTION_REDUCE = 2.0d;
        private static final double MIN_VELOCITY_ADJUST_FRICTION = 1000.0d;
        private static final int NUM_60 = 60;
        private static final float ONE_MILLION = 1.0E-7f;
        private static final double REDUCE_FRICTION_COEF = 0.00125d;
        private static final double SLOW_FLING_BASE_FRICTION = 4.5d;
        private static final int SPRING_BACK_ADJUST_TENSION_VALUE = 100;
        private static final int SPRING_BACK_ADJUST_THRESHOLD = 180;
        private static final float SPRING_BACK_FRICTION = 12.19f;
        private static final int SPRING_BACK_STOP_THRESHOLD = 2;
        private static final float SPRING_BACK_TENSION = 16.0f;
        private static final long TIME_ADJUST_FRICTION = 480;
        private static final double VELOCITY_REDUCE_FRICTION = 2000.0d;
        private static float sTimeIncrease = 1.0f;
        private ReboundConfig mConfig;
        private long mCurrentComputeTime;
        private double mEndValue;
        private long mFlingPreTime;
        private long mFlingStartTime;
        private boolean mIsSpringBack;
        private long mLastComputeTime;
        private int mScrollDuration;
        private int mScrollFinal;
        private int mScrollStart;
        private long mScrollStartTime;
        private double mStartValue;
        private boolean mTensionAdjusted;
        private PhysicsState mCurrentState = new PhysicsState();
        private PhysicsState mPreviousState = new PhysicsState();
        private PhysicsState mTempState = new PhysicsState();
        private float mFlingFriction = 0.32f;
        private double mRestSpeedThreshold = 20.0d;
        private double mDisplacementFromRestThreshold = 0.05d;
        private int mNearCount = 1;
        private boolean mIsScrollView = false;
        private float mSpringBackTensionMultiple = 0.83f;
        private ReboundConfig mFlingConfig = new ReboundConfig(0.32f, 0.0d);
        private ReboundConfig mSpringBackConfig = new ReboundConfig(12.1899995803833d, 16.0d);

        public static class PhysicsState {
            double mPosition;
            double mVelocity;
        }

        public static class ReboundConfig {
            double mFriction;
            double mTension;

            public ReboundConfig(double d, double d2) {
                this.mFriction = frictionFromOrigamiValue((float) d);
                this.mTension = tensionFromOrigamiValue((float) d2);
            }

            private float frictionFromOrigamiValue(float f) {
                if (f == 0.0f) {
                    return 0.0f;
                }
                return 25.0f + ((f - 8.0f) * 3.0f);
            }

            private double tensionFromOrigamiValue(float f) {
                if (f == 0.0f) {
                    return 0.0d;
                }
                return ((f - 30.0f) * 3.62f) + 194.0f;
            }

            public void setFriction(double d) {
                this.mFriction = frictionFromOrigamiValue((float) d);
            }

            public void setTension(double d) {
                this.mTension = tensionFromOrigamiValue((float) d);
            }
        }

        public ReboundOverScroller() {
            setConfig(this.mFlingConfig);
        }

        public void fling(int i, int i2) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mFlingStartTime = jCurrentAnimationTimeMillis;
            this.mFlingPreTime = jCurrentAnimationTimeMillis;
            this.mNearCount = 1;
            sTimeIncrease = 1.0f;
            this.mFlingConfig.setFriction(this.mFlingFriction);
            this.mFlingConfig.setTension(0.0d);
            setConfig(this.mFlingConfig);
            setCurrentValue(i, true);
            setVelocity(i2);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.mLastComputeTime = jElapsedRealtime;
            this.mCurrentComputeTime = jElapsedRealtime;
        }

        public double getCurrentValue() {
            return this.mCurrentState.mPosition;
        }

        public double getDisplacementDistanceForState(PhysicsState physicsState) {
            return Math.abs(this.mEndValue - physicsState.mPosition);
        }

        public double getEndValue() {
            return this.mEndValue;
        }

        public double getVelocity() {
            return this.mCurrentState.mVelocity;
        }

        public boolean isAtRest() {
            return Math.abs(this.mCurrentState.mVelocity) <= this.mRestSpeedThreshold && (getDisplacementDistanceForState(this.mCurrentState) <= this.mDisplacementFromRestThreshold || this.mConfig.mTension == 0.0d);
        }

        public void notifyEdgeReached(int i, int i2, int i3) {
            PhysicsState physicsState = this.mCurrentState;
            physicsState.mPosition = i;
            PhysicsState physicsState2 = this.mPreviousState;
            physicsState2.mPosition = 0.0d;
            physicsState2.mVelocity = 0.0d;
            PhysicsState physicsState3 = this.mTempState;
            physicsState3.mPosition = i2;
            physicsState3.mVelocity = physicsState.mVelocity;
        }

        public void setAtRest() {
            PhysicsState physicsState = this.mCurrentState;
            double d = physicsState.mPosition;
            this.mEndValue = d;
            this.mTempState.mPosition = d;
            physicsState.mVelocity = 0.0d;
            this.mIsSpringBack = false;
        }

        public void setConfig(ReboundConfig reboundConfig) {
            if (reboundConfig == null) {
                throw new IllegalArgumentException("springConfig is required");
            }
            this.mConfig = reboundConfig;
        }

        public void setCurrentValue(double d, boolean z) {
            this.mStartValue = d;
            if (!this.mIsScrollView) {
                this.mPreviousState.mPosition = 0.0d;
                this.mTempState.mPosition = 0.0d;
            }
            this.mCurrentState.mPosition = d;
            if (z) {
                setAtRest();
            }
        }

        public void setEndValue(double d) {
            if (this.mEndValue == d) {
                return;
            }
            this.mStartValue = getCurrentValue();
            this.mEndValue = d;
        }

        public void setVelocity(double d) {
            if (Math.abs(d - this.mCurrentState.mVelocity) < 1.0000000116860974E-7d) {
                return;
            }
            this.mCurrentState.mVelocity = d;
        }

        public boolean springBack(int i, int i2, int i3) {
            setCurrentValue(i, false);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.mLastComputeTime = jElapsedRealtime;
            this.mCurrentComputeTime = jElapsedRealtime;
            if (i <= i3 && i >= i2) {
                setConfig(new ReboundConfig(this.mFlingFriction, 0.0d));
                return false;
            }
            if (i > i3) {
                setEndValue(i3);
            } else if (i < i2) {
                setEndValue(i2);
            }
            this.mIsSpringBack = true;
            this.mSpringBackConfig.setFriction(12.1899995803833d);
            this.mSpringBackConfig.setTension(this.mSpringBackTensionMultiple * 16.0f);
            setConfig(this.mSpringBackConfig);
            return true;
        }

        public void startScroll(int i, int i2, int i3) {
            this.mScrollStart = i;
            this.mScrollFinal = i + i2;
            this.mScrollDuration = i3;
            this.mScrollStartTime = AnimationUtils.currentAnimationTimeMillis();
            setConfig(this.mFlingConfig);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.mLastComputeTime = jElapsedRealtime;
            this.mCurrentComputeTime = jElapsedRealtime;
        }

        public boolean update() {
            if (isAtRest()) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.mCurrentComputeTime = jElapsedRealtime;
            float unused = SpringOverScroller.mRefreshTime = Math.max(SpringOverScroller.MIN_FRAME_INTERVAL, (jElapsedRealtime - this.mLastComputeTime) / 1000.0f);
            this.mLastComputeTime = this.mCurrentComputeTime;
            PhysicsState physicsState = this.mCurrentState;
            double d = physicsState.mPosition;
            double d2 = physicsState.mVelocity;
            PhysicsState physicsState2 = this.mTempState;
            double d3 = physicsState2.mPosition;
            double d4 = physicsState2.mVelocity;
            if (this.mIsSpringBack) {
                double displacementDistanceForState = getDisplacementDistanceForState(physicsState);
                if (!this.mTensionAdjusted && displacementDistanceForState < 180.0d) {
                    this.mTensionAdjusted = true;
                } else if (displacementDistanceForState < MIN_FLING_FRICTION_REDUCE) {
                    this.mCurrentState.mPosition = this.mEndValue;
                    this.mTensionAdjusted = false;
                    this.mIsSpringBack = false;
                    return false;
                }
            } else {
                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                long j2 = jCurrentAnimationTimeMillis - this.mFlingStartTime;
                if (this.mNearCount == 1) {
                    if (Math.abs(this.mCurrentState.mVelocity) > MID_VELOCITY_ADJUST_FRICTION && Math.abs(this.mCurrentState.mVelocity) < 10000.0d) {
                        this.mConfig.mFriction = (Math.abs(this.mCurrentState.mVelocity) / 10000.0d) + MID_FLING_BASE_FRICTION;
                    } else if (Math.abs(this.mCurrentState.mVelocity) <= MID_VELOCITY_ADJUST_FRICTION) {
                        this.mConfig.mFriction = (Math.abs(this.mCurrentState.mVelocity) / 10000.0d) + 4.5d;
                    }
                    this.mFlingPreTime = jCurrentAnimationTimeMillis;
                }
                if (this.mNearCount > 1) {
                    if (j2 > TIME_ADJUST_FRICTION) {
                        if (Math.abs(this.mCurrentState.mVelocity) > VELOCITY_REDUCE_FRICTION) {
                            this.mConfig.mFriction += (jCurrentAnimationTimeMillis - this.mFlingPreTime) * 0.00125d;
                        } else {
                            ReboundConfig reboundConfig = this.mConfig;
                            double d5 = reboundConfig.mFriction;
                            if (d5 > MIN_FLING_FRICTION_REDUCE) {
                                reboundConfig.mFriction = d5 - ((jCurrentAnimationTimeMillis - this.mFlingPreTime) * 0.00125d);
                            }
                        }
                    }
                    this.mFlingPreTime = jCurrentAnimationTimeMillis;
                }
            }
            ReboundConfig reboundConfig2 = this.mConfig;
            double d6 = (reboundConfig2.mTension * (this.mEndValue - d3)) - (reboundConfig2.mFriction * d4);
            double d7 = ((((double) SpringOverScroller.mRefreshTime) * d2) / MIN_FLING_FRICTION_REDUCE) + d;
            double d8 = ((((double) SpringOverScroller.mRefreshTime) * d6) / MIN_FLING_FRICTION_REDUCE) + d2;
            ReboundConfig reboundConfig3 = this.mConfig;
            double d9 = (reboundConfig3.mTension * (this.mEndValue - d7)) - (reboundConfig3.mFriction * d8);
            double d10 = ((((double) SpringOverScroller.mRefreshTime) * d8) / MIN_FLING_FRICTION_REDUCE) + d;
            double d11 = ((((double) SpringOverScroller.mRefreshTime) * d9) / MIN_FLING_FRICTION_REDUCE) + d2;
            ReboundConfig reboundConfig4 = this.mConfig;
            double d12 = (reboundConfig4.mTension * (this.mEndValue - d10)) - (reboundConfig4.mFriction * d11);
            double d13 = (((double) SpringOverScroller.mRefreshTime) * d11) + d;
            double d14 = (((double) SpringOverScroller.mRefreshTime) * d12) + d2;
            ReboundConfig reboundConfig5 = this.mConfig;
            double d15 = (reboundConfig5.mTension * (this.mEndValue - d13)) - (reboundConfig5.mFriction * d14);
            double d16 = (((d8 + d11) * MIN_FLING_FRICTION_REDUCE) + d2 + d14) * 0.16699999570846558d;
            double d17 = (d6 + ((d9 + d12) * MIN_FLING_FRICTION_REDUCE) + d15) * 0.16699999570846558d;
            double d18 = d + (d16 * ((double) SpringOverScroller.mRefreshTime));
            double d19 = d2 + (d17 * ((double) SpringOverScroller.mRefreshTime));
            PhysicsState physicsState3 = this.mTempState;
            physicsState3.mVelocity = d14;
            physicsState3.mPosition = d13;
            PhysicsState physicsState4 = this.mCurrentState;
            physicsState4.mVelocity = d19;
            physicsState4.mPosition = d18;
            this.mNearCount++;
            return true;
        }

        public void updateScroll(float f) {
            PhysicsState physicsState = this.mCurrentState;
            int i = this.mScrollStart;
            physicsState.mPosition = i + Math.round(f * (this.mScrollFinal - i));
        }
    }

    public SpringOverScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.mMode = 2;
        this.mEnableFlingSpeedIncrease = true;
        this.mLastFlingSpeedIncreaseRate = 1.0f;
        this.mScrollerX = new ReboundOverScroller();
        this.mScrollerY = new ReboundOverScroller();
        if (interpolator == null) {
            this.mInterpolator = new NearViscousFluidInterpolator();
        } else {
            this.mInterpolator = interpolator;
        }
        setRefreshRateUnConvert(SOLVER_TIMESTEP_SEC);
        this.mContext = context;
    }

    private int increaseVelocityIfNeed(int i) {
        if (!this.mEnableFlingSpeedIncrease) {
            return i;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = this.mContinuousFlingCount;
        if (i2 <= 0) {
            if (i2 != 0) {
                return i;
            }
            this.mContinuousFlingCount = i2 + 1;
            this.mLastFlingTime = jCurrentTimeMillis;
            return i;
        }
        if (jCurrentTimeMillis - this.mLastFlingTime > 500 || i < 8000) {
            resetFlingSpeedValue();
            return i;
        }
        this.mLastFlingTime = jCurrentTimeMillis;
        int i3 = i2 + 1;
        this.mContinuousFlingCount = i3;
        if (i3 <= 4) {
            return i;
        }
        float f = this.mLastFlingSpeedIncreaseRate * FLING_SPEED_INCREASE_RATE;
        this.mLastFlingSpeedIncreaseRate = f;
        return Math.max(-70000, Math.min((int) (i * f), 70000));
    }

    private void limitEdgeReachedVelocityIfNeed(ReboundOverScroller reboundOverScroller) {
        if (!this.mEnableFlingSpeedIncrease || this.mContinuousFlingCount <= 4) {
            return;
        }
        ReboundOverScroller.PhysicsState physicsState = reboundOverScroller.mCurrentState;
        double d = physicsState.mVelocity;
        if (d > 20000.0d) {
            physicsState.mVelocity = 1000.0d;
        } else if (d < -20000.0d) {
            physicsState.mVelocity = -1000.0d;
        }
    }

    private void resetFlingSpeedValue() {
        this.mLastFlingTime = 0L;
        this.mContinuousFlingCount = 0;
        this.mLastFlingSpeedIncreaseRate = 1.0f;
    }

    private void setRefreshRateUnConvert(float f) {
        mRefreshTime = f;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void abortAnimation() {
        this.mMode = 2;
        this.mScrollerX.setAtRest();
        this.mScrollerY.setAtRest();
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public boolean computeScrollOffset() {
        if (isNearFinished()) {
            return false;
        }
        int i = this.mMode;
        if (i == 0) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.mScrollerX.mScrollStartTime;
            int i2 = this.mScrollerX.mScrollDuration;
            if (jCurrentAnimationTimeMillis < i2) {
                float interpolation = this.mInterpolator.getInterpolation(jCurrentAnimationTimeMillis / i2);
                this.mScrollerX.updateScroll(interpolation);
                this.mScrollerY.updateScroll(interpolation);
            } else {
                this.mScrollerX.updateScroll(1.0f);
                this.mScrollerY.updateScroll(1.0f);
                abortAnimation();
            }
        } else if (i == 1 && !this.mScrollerX.update() && !this.mScrollerY.update()) {
            abortAnimation();
        }
        return true;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocity() {
        double velocity = this.mScrollerX.getVelocity();
        double velocity2 = this.mScrollerY.getVelocity();
        return (int) Math.sqrt((velocity * velocity) + (velocity2 * velocity2));
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocityX() {
        return (float) this.mScrollerX.getVelocity();
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public float getCurrVelocityY() {
        return (float) this.mScrollerY.getVelocity();
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public final int getNearCurrX() {
        return (int) Math.round(this.mScrollerX.getCurrentValue());
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public final int getNearCurrY() {
        return (int) Math.round(this.mScrollerY.getCurrentValue());
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public final int getNearFinalX() {
        return (int) this.mScrollerX.getEndValue();
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public final int getNearFinalY() {
        return (int) this.mScrollerY.getEndValue();
    }

    public boolean isEnableFlingSpeedIncrease() {
        return this.mEnableFlingSpeedIncrease;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public final boolean isNearFinished() {
        return this.mScrollerX.isAtRest() && this.mScrollerY.isAtRest() && this.mMode != 0;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public boolean isScrollingInDirection(float f, float f2) {
        return !isFinished() && Math.signum(f) == Math.signum((float) ((int) (this.mScrollerX.mEndValue - this.mScrollerX.mStartValue))) && Math.signum(f2) == Math.signum((float) ((int) (this.mScrollerY.mEndValue - this.mScrollerY.mStartValue)));
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.mScrollerX.notifyEdgeReached(i, i2, i3);
        springBack(i, 0, 0, i2, 0, 0);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.mScrollerY.notifyEdgeReached(i, i2, i3);
        springBack(0, i, 0, 0, 0, i2);
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setCurrVelocityX(float f) {
        this.mScrollerX.mCurrentState.mVelocity = f;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setCurrVelocityY(float f) {
        this.mScrollerY.mCurrentState.mVelocity = f;
    }

    public void setEnableFlingSpeedIncrease(boolean z) {
        if (this.mEnableFlingSpeedIncrease == z) {
            return;
        }
        this.mEnableFlingSpeedIncrease = z;
        resetFlingSpeedValue();
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFinalX(int i) {
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFinalY(int i) {
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setFlingFriction(float f) {
        this.mScrollerX.mFlingFriction = f;
        this.mScrollerY.mFlingFriction = f;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.mInterpolator = new NearViscousFluidInterpolator();
        } else {
            this.mInterpolator = interpolator;
        }
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setIsScrollView(boolean z) {
        this.mScrollerX.mIsScrollView = z;
        this.mScrollerY.mIsScrollView = z;
    }

    @Override // androidx.recyclerview.widget.NearIOverScroller
    public void setNearFriction(float f) {
    }

    public void setRefreshRate(float f) {
        mRefreshTime = Math.round(10000.0f / f) / 10000.0f;
    }

    public void setSpringBackTensionMultiple(float f) {
        this.mScrollerX.mSpringBackTensionMultiple = f;
        this.mScrollerY.mSpringBackTensionMultiple = f;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean zSpringBack = this.mScrollerX.springBack(i, i3, i4);
        boolean zSpringBack2 = this.mScrollerY.springBack(i2, i5, i6);
        if (zSpringBack || zSpringBack2) {
            this.mMode = 1;
        }
        return zSpringBack || zSpringBack2;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.NearIOverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fling(i, i2, i3, i4);
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
        this.mScrollerX.fling(i, increaseVelocityIfNeed(i3));
        this.mScrollerY.fling(i2, increaseVelocityIfNeed(i4));
    }

    public SpringOverScroller(Context context) {
        this(context, null);
    }
}
