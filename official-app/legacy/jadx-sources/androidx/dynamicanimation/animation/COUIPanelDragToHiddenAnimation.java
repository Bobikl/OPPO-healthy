package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;

/* JADX INFO: loaded from: classes12.dex */
public class COUIPanelDragToHiddenAnimation extends DynamicAnimation<COUIPanelDragToHiddenAnimation> {
    private long mDuration;
    private float mEndVelocity;
    private final DragForce mFlingForce;
    private long mStartTime;
    private float mStartVelocity;

    public static final class DragForce implements Force {
        private static final float DEFAULT_FRICTION = -4.2f;
        private static final float THOUSAND = 1000.0f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private static final float ZERO = 0.0f;
        private float mVelocityThreshold;
        private final DynamicAnimation.MassState mMassState = new DynamicAnimation.MassState();
        private float mFriction = DEFAULT_FRICTION;
        private long mStartTime = 0;
        private long mEndTime = 0;
        private float mStartVelocity = 0.0f;
        private float mEndVelocity = 0.0f;
        private float mStartValue = 0.0f;
        private float mEndValue = 0.0f;

        private float getCurrentValue(long j2) {
            long j3 = this.mEndTime;
            if (j2 >= j3) {
                return this.mEndValue;
            }
            long j4 = this.mStartTime;
            float f = (j2 - j4) / (j3 - j4);
            float f2 = this.mStartValue;
            return f2 + ((this.mEndValue - f2) * f);
        }

        private float getCurrentVelocity(long j2) {
            long j3 = this.mEndTime;
            if (j2 >= j3) {
                return this.mEndVelocity;
            }
            long j4 = this.mStartTime;
            float f = (j2 - j4) / (j3 - j4);
            float f2 = this.mStartVelocity;
            return f2 + ((this.mEndVelocity - f2) * f);
        }

        @Override // androidx.dynamicanimation.animation.Force
        public float getAcceleration(float f, float f2) {
            return this.mMassState.mVelocity;
        }

        public float getFrictionScalar() {
            return this.mFriction / DEFAULT_FRICTION;
        }

        @Override // androidx.dynamicanimation.animation.Force
        public boolean isAtEquilibrium(float f, float f2) {
            return Math.abs(f2) < this.mVelocityThreshold;
        }

        public void setFrictionScalar(float f) {
            this.mFriction = f * DEFAULT_FRICTION;
        }

        public void setValueThreshold(float f) {
            this.mVelocityThreshold = f * VELOCITY_THRESHOLD_MULTIPLIER;
        }

        public DynamicAnimation.MassState updateValueAndVelocity(float f, float f2, long j2, long j3) {
            if (this.mEndVelocity < 0.0f) {
                float f3 = j3;
                this.mMassState.mVelocity = (float) (((double) f2) * Math.exp((f3 / 1000.0f) * this.mFriction));
                DynamicAnimation.MassState massState = this.mMassState;
                float f4 = this.mFriction;
                massState.mValue = (float) (((double) (f - (f2 / f4))) + (((double) (f2 / f4)) * Math.exp((f4 * f3) / 1000.0f)));
            } else {
                this.mMassState.mVelocity = getCurrentVelocity(j2);
                this.mMassState.mValue = getCurrentValue(j2);
            }
            DynamicAnimation.MassState massState2 = this.mMassState;
            if (isAtEquilibrium(massState2.mValue, massState2.mVelocity)) {
                this.mMassState.mVelocity = 0.0f;
            }
            return this.mMassState;
        }
    }

    public COUIPanelDragToHiddenAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        this.mStartVelocity = 0.0f;
        this.mEndVelocity = -1.0f;
        this.mStartTime = 0L;
        this.mDuration = 120L;
        dragForce.setValueThreshold(getValueThreshold());
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public float getAcceleration(float f, float f2) {
        return this.mFlingForce.getAcceleration(f, f2);
    }

    public float getFriction() {
        return this.mFlingForce.getFrictionScalar();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean isAtEquilibrium(float f, float f2) {
        return f >= this.mMaxValue || f <= this.mMinValue || this.mFlingForce.isAtEquilibrium(f, f2);
    }

    public COUIPanelDragToHiddenAnimation setDuration(long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("Duration must be positive");
        }
        this.mDuration = j2;
        return this;
    }

    public COUIPanelDragToHiddenAnimation setEndVelocity(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Velocity must be positive");
        }
        this.mEndVelocity = f;
        return this;
    }

    public COUIPanelDragToHiddenAnimation setFriction(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.mFlingForce.setFrictionScalar(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void setValueThreshold(float f) {
        this.mFlingForce.setValueThreshold(f);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void start() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mStartTime = jCurrentTimeMillis;
        this.mFlingForce.mStartTime = jCurrentTimeMillis;
        this.mFlingForce.mEndTime = this.mStartTime + this.mDuration;
        this.mFlingForce.mStartVelocity = this.mStartVelocity;
        this.mFlingForce.mEndVelocity = this.mEndVelocity;
        this.mFlingForce.mStartValue = 0.0f;
        this.mFlingForce.mEndValue = this.mMaxValue;
        super.start();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean updateValueAndVelocity(long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DynamicAnimation.MassState massStateUpdateValueAndVelocity = this.mFlingForce.updateValueAndVelocity(this.mValue, this.mVelocity, jCurrentTimeMillis, j2);
        float f = massStateUpdateValueAndVelocity.mValue;
        this.mValue = f;
        float f2 = massStateUpdateValueAndVelocity.mVelocity;
        this.mVelocity = f2;
        float f3 = this.mEndVelocity;
        if (f3 >= 0.0f && (f2 <= f3 || jCurrentTimeMillis >= this.mStartTime + this.mDuration)) {
            this.mValue = this.mMaxValue;
            return true;
        }
        float f4 = this.mMinValue;
        if (f < f4) {
            this.mValue = f4;
            return true;
        }
        float f5 = this.mMaxValue;
        if (f <= f5) {
            return isAtEquilibrium(f, f2);
        }
        this.mValue = f5;
        return true;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public COUIPanelDragToHiddenAnimation setMaxValue(float f) {
        super.setMaxValue(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public COUIPanelDragToHiddenAnimation setMinValue(float f) {
        super.setMinValue(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public COUIPanelDragToHiddenAnimation setStartVelocity(float f) {
        super.setStartVelocity(f);
        this.mStartVelocity = f;
        return this;
    }

    public <K> COUIPanelDragToHiddenAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        this.mStartVelocity = 0.0f;
        this.mEndVelocity = -1.0f;
        this.mStartTime = 0L;
        this.mDuration = 120L;
        dragForce.setValueThreshold(getValueThreshold());
    }
}
