package androidx.recyclerview.widget;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes12.dex */
public class InnerColorSpringOverScroller extends OverScroller implements IOverScroller {
    private static final int FLING_MODE = 1;
    private static final int REST_MODE = 2;
    private static final int SCROLL_DEFAULT_DURATION = 250;
    private static final int SCROLL_MODE = 0;
    private static final float SOLVER_TIMESTEP_SEC = 0.016f;
    public static final float THEME1_FLING_FRICTION_FAST = 0.76f;
    public static final float THEME1_FLING_FRICTION_NORMAL = 1.06f;
    public static final int THEME1_FLING_MODE_FAST = 0;
    public static final int THEME1_FLING_MODE_NORMAL = 1;
    private static float mRefreshTime;
    private Interpolator mInterpolator;
    private int mMode;
    private ReboundOverScroller mScrollerX;
    private ReboundOverScroller mScrollerY;

    public static class ColorViscousFluidInterpolator implements Interpolator {
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
        private static final float FLOAT_1 = 1.0f;
        private static final float FLOAT_2 = 2.0f;
        private static final int NUM_60 = 60;
        private static final double SOLVER_TIMESTEP_SEC = 0.016d;
        private static final int SPRING_BACK_ADJUST_TENSION_VALUE = 100;
        private static final int SPRING_BACK_ADJUST_THRESHOLD = 180;
        private static final float SPRING_BACK_FRICTION = 12.19f;
        private static final int SPRING_BACK_STOP_THRESHOLD = 2;
        private static final float SPRING_BACK_TENSION = 16.0f;
        private static float sTimeIncrease = 1.0f;
        private ReboundConfig mConfig;
        private double mEndValue;
        private boolean mIsSpringBack;
        private int mScrollDuration;
        private int mScrollFinal;
        private int mScrollStart;
        private long mScrollStartTime;
        private double mStartValue;
        private boolean mTensionAdjusted;
        private PhysicsState mCurrentState = new PhysicsState();
        private PhysicsState mPreviousState = new PhysicsState();
        private PhysicsState mTempState = new PhysicsState();
        private float mFlingFriction = 1.06f;
        private double mRestSpeedThreshold = 100.0d;
        private double mDisplacementFromRestThreshold = 0.05d;
        private int mTheme1Count = 1;
        private boolean mIsScrollView = false;
        private float mSpringBackTensionMultiple = 2.15f;
        private ReboundConfig mFlingConfig = new ReboundConfig(1.06f, 0.0d);
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
            this.mTheme1Count = 1;
            sTimeIncrease = 1.0f;
            this.mFlingConfig.setFriction(this.mFlingFriction);
            this.mFlingConfig.setTension(0.0d);
            setConfig(this.mFlingConfig);
            setCurrentValue(i, true);
            setVelocity(i2);
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
            this.mCurrentState.mPosition = i;
            PhysicsState physicsState = this.mPreviousState;
            physicsState.mPosition = 0.0d;
            physicsState.mVelocity = 0.0d;
            PhysicsState physicsState2 = this.mTempState;
            physicsState2.mPosition = 0.0d;
            physicsState2.mVelocity = 0.0d;
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
            PhysicsState physicsState = this.mCurrentState;
            if (d == physicsState.mVelocity) {
                return;
            }
            physicsState.mVelocity = d;
        }

        public boolean springBack(int i, int i2, int i3) {
            setCurrentValue(i, false);
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
        }

        public boolean update() {
            if (isAtRest()) {
                return false;
            }
            PhysicsState physicsState = this.mCurrentState;
            double d = physicsState.mPosition;
            double d2 = physicsState.mVelocity;
            PhysicsState physicsState2 = this.mTempState;
            double d3 = physicsState2.mPosition;
            double d4 = physicsState2.mVelocity;
            if (this.mIsSpringBack) {
                double displacementDistanceForState = getDisplacementDistanceForState(physicsState);
                if (!this.mTensionAdjusted && displacementDistanceForState < 180.0d) {
                    this.mConfig.mTension += 100.0d;
                    this.mTensionAdjusted = true;
                } else if (displacementDistanceForState < 2.0d) {
                    this.mCurrentState.mPosition = this.mEndValue;
                    this.mTensionAdjusted = false;
                    this.mIsSpringBack = false;
                    return false;
                }
            } else if (this.mTheme1Count < 60) {
                sTimeIncrease += 0.020000001f;
                this.mConfig.mFriction += 0.020000001415610313d;
            } else {
                float f = sTimeIncrease;
                float f2 = f - ((f - 0.6f) / 60.0f);
                sTimeIncrease = f2;
                this.mConfig.mFriction -= (double) ((f2 - 0.6f) / 60.0f);
            }
            ReboundConfig reboundConfig = this.mConfig;
            double d5 = (reboundConfig.mTension * (this.mEndValue - d3)) - (reboundConfig.mFriction * this.mPreviousState.mVelocity);
            double d6 = ((((double) InnerColorSpringOverScroller.mRefreshTime) * d2) / 2.0d) + d;
            double d7 = ((((double) InnerColorSpringOverScroller.mRefreshTime) * d5) / 2.0d) + d2;
            ReboundConfig reboundConfig2 = this.mConfig;
            double d8 = (reboundConfig2.mTension * (this.mEndValue - d6)) - (reboundConfig2.mFriction * d7);
            double d9 = d + ((((double) InnerColorSpringOverScroller.mRefreshTime) * d7) / 2.0d);
            double d10 = d2 + ((((double) InnerColorSpringOverScroller.mRefreshTime) * d8) / 2.0d);
            ReboundConfig reboundConfig3 = this.mConfig;
            double d11 = (reboundConfig3.mTension * (this.mEndValue - d9)) - (reboundConfig3.mFriction * d10);
            double d12 = d + (((double) InnerColorSpringOverScroller.mRefreshTime) * d10);
            double d13 = d2 + (((double) InnerColorSpringOverScroller.mRefreshTime) * d11);
            ReboundConfig reboundConfig4 = this.mConfig;
            double d14 = (reboundConfig4.mTension * (this.mEndValue - d12)) - (reboundConfig4.mFriction * d13);
            double d15 = d + ((d2 + ((d7 + d10) * 2.0d) + d13) * 0.16699999570846558d * ((double) InnerColorSpringOverScroller.mRefreshTime));
            double d16 = d2 + ((d5 + ((d8 + d11) * 2.0d) + d14) * 0.16699999570846558d * ((double) InnerColorSpringOverScroller.mRefreshTime));
            PhysicsState physicsState3 = this.mTempState;
            physicsState3.mVelocity = d13;
            physicsState3.mPosition = d12;
            PhysicsState physicsState4 = this.mCurrentState;
            physicsState4.mVelocity = d16;
            physicsState4.mPosition = d15;
            this.mTheme1Count++;
            return true;
        }

        public void updateScroll(float f) {
            PhysicsState physicsState = this.mCurrentState;
            int i = this.mScrollStart;
            physicsState.mPosition = i + Math.round(f * (this.mScrollFinal - i));
        }
    }

    public InnerColorSpringOverScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.mMode = 2;
        this.mScrollerX = new ReboundOverScroller();
        this.mScrollerY = new ReboundOverScroller();
        if (interpolator == null) {
            this.mInterpolator = new ColorViscousFluidInterpolator();
        } else {
            this.mInterpolator = interpolator;
        }
        mRefreshTime = SOLVER_TIMESTEP_SEC;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.IOverScroller
    public void abortAnimation() {
        this.mMode = 2;
        this.mScrollerX.setAtRest();
        this.mScrollerY.setAtRest();
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.IOverScroller
    public boolean computeScrollOffset() {
        if (isTheme1Finished()) {
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

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.IOverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (i2 > i8 || i2 < i7) {
            springBack(i, i2, i5, i6, i7, i8);
        } else {
            fling(i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.IOverScroller
    public float getCurrVelocity() {
        double velocity = this.mScrollerX.getVelocity();
        double velocity2 = this.mScrollerY.getVelocity();
        return (int) Math.sqrt((velocity * velocity) + (velocity2 * velocity2));
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public float getCurrVelocityX() {
        return (float) this.mScrollerX.getVelocity();
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public float getCurrVelocityY() {
        return (float) this.mScrollerY.getVelocity();
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public int getTheme1CurrX() {
        return (int) Math.round(this.mScrollerX.getCurrentValue());
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public int getTheme1CurrY() {
        return (int) Math.round(this.mScrollerY.getCurrentValue());
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public int getTheme1FinalX() {
        return (int) this.mScrollerX.getEndValue();
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public int getTheme1FinalY() {
        return (int) this.mScrollerY.getEndValue();
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public boolean isScrollingInDirection(float f, float f2) {
        return !isFinished() && Math.signum(f) == Math.signum((float) ((int) (this.mScrollerX.mEndValue - this.mScrollerX.mStartValue))) && Math.signum(f2) == Math.signum((float) ((int) (this.mScrollerY.mEndValue - this.mScrollerY.mStartValue)));
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public boolean isTheme1Finished() {
        return this.mScrollerX.isAtRest() && this.mScrollerY.isAtRest() && this.mMode != 0;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.IOverScroller
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.mScrollerX.notifyEdgeReached(i, i2, i3);
        springBack(i, 0, 0, 0, 0, 0);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.IOverScroller
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.mScrollerY.notifyEdgeReached(i, i2, i3);
        springBack(0, i, 0, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public void setCurrVelocityX(float f) {
        this.mScrollerX.mCurrentState.mVelocity = f;
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public void setCurrVelocityY(float f) {
        this.mScrollerY.mCurrentState.mVelocity = f;
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public void setFlingFriction(float f) {
        this.mScrollerX.mFlingFriction = f;
        this.mScrollerY.mFlingFriction = f;
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.mInterpolator = new ColorViscousFluidInterpolator();
        } else {
            this.mInterpolator = interpolator;
        }
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public void setIsScrollView(boolean z) {
        this.mScrollerX.mIsScrollView = z;
        this.mScrollerY.mIsScrollView = z;
    }

    public void setRefreshRate(float f) {
        mRefreshTime = Math.round(10000.0f / f) / 10000.0f;
    }

    public void setSpringBackTensionMultiple(float f) {
        this.mScrollerX.mSpringBackTensionMultiple = f;
        this.mScrollerY.mSpringBackTensionMultiple = f;
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public void setTheme1FinalX(int i) {
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public void setTheme1FinalY(int i) {
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public void setTheme1Friction(float f) {
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.IOverScroller
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean zSpringBack = this.mScrollerX.springBack(i, i3, i4);
        boolean zSpringBack2 = this.mScrollerY.springBack(i2, i5, i6);
        if (zSpringBack || zSpringBack2) {
            this.mMode = 1;
        }
        return zSpringBack || zSpringBack2;
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.IOverScroller
    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.IOverScroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mMode = 0;
        this.mScrollerX.startScroll(i, i3, i5);
        this.mScrollerY.startScroll(i2, i4, i5);
    }

    @Override // android.widget.OverScroller, androidx.recyclerview.widget.IOverScroller
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fling(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.IOverScroller
    public void fling(int i, int i2, int i3, int i4) {
        this.mMode = 1;
        this.mScrollerX.fling(i, i3);
        this.mScrollerY.fling(i2, i4);
    }

    public InnerColorSpringOverScroller(Context context) {
        this(context, null);
    }
}
