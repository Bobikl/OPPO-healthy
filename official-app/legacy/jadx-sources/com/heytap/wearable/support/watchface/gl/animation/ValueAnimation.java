package com.heytap.wearable.support.watchface.gl.animation;

import android.view.animation.Interpolator;
import com.heytap.wearable.support.watchface.gl.math.Interpolate;

/* JADX INFO: loaded from: classes2.dex */
public class ValueAnimation extends Animation {
    private float mBegin;
    private long mDelayTime;
    private long mDuration;
    private long mLastTime;
    private long mPauseTime;
    private boolean mRunning;
    private long mStartTime;
    private float mTarget;
    private float mValue;

    public ValueAnimation() {
        this.mDelayTime = 0L;
        this.mRunning = false;
        this.mValue = 0.0f;
        this.mTarget = 0.0f;
        this.mDuration = 1L;
    }

    public void change(float f, float f2) {
        if (System.currentTimeMillis() - this.mStartTime < 0) {
            this.mBegin = f;
            this.mTarget = f2;
            this.mValue = f;
        }
    }

    public float getValue() {
        return this.mValue;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void pause() {
        this.mRunning = false;
        this.mPauseTime = System.currentTimeMillis();
    }

    public void resume() {
        this.mStartTime += System.currentTimeMillis() - this.mPauseTime;
        this.mRunning = true;
    }

    public void start(float f, float f2, long j2, long j3) {
        this.mStartTime = System.currentTimeMillis();
        this.mPauseTime = System.currentTimeMillis();
        this.mLastTime = this.mStartTime;
        this.mValue = f;
        this.mBegin = f;
        this.mTarget = f2;
        this.mDuration = j2;
        this.mDelayTime = j3;
        this.mRunning = true;
    }

    public void stop() {
        this.mRunning = false;
    }

    public void stopWithValue(float f) {
        this.mValue = f;
        this.mRunning = false;
    }

    public void update() {
        if (this.mRunning) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.mStartTime) - this.mDelayTime;
            if (jCurrentTimeMillis < 0) {
                return;
            }
            float f = jCurrentTimeMillis / this.mDuration;
            if (f < 1.0f) {
                this.mValue = Interpolate.interpolateIncrease(f, this.mBegin, this.mTarget);
                return;
            }
            this.mValue = this.mTarget;
            this.mRunning = false;
            onStop();
        }
    }

    public void updateInterpolator() {
        if (this.mRunning) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.mStartTime;
            long j3 = this.mDelayTime;
            float f = (jCurrentTimeMillis - j2) - j3;
            if (f < 0.0f) {
                this.mLastTime = jCurrentTimeMillis;
                return;
            }
            long j4 = this.mDuration;
            if (f >= j4) {
                this.mValue = this.mTarget;
                this.mRunning = false;
                onStop();
                return;
            }
            long j5 = this.mLastTime;
            long j6 = jCurrentTimeMillis - j5;
            float f2 = j4;
            float f3 = f / f2;
            float f4 = ((j5 - j2) - j3) / f2;
            float fInterpolateBezier = Interpolate.interpolateBezier(f3, 0.0f, 0.0f, 1.0f, 1.0f) - Interpolate.interpolateBezier(f4, 0.0f, 0.0f, 1.0f, 1.0f);
            float fInterpolateBezier2 = Interpolate.interpolateBezier(f3, 0.0f, 0.53f, 0.47f, 1.0f) - Interpolate.interpolateBezier(f4, 0.0f, 0.53f, 0.47f, 1.0f);
            if (fInterpolateBezier2 > 0.001f && fInterpolateBezier > 0.001f) {
                this.mValue += ((fInterpolateBezier * (this.mTarget - this.mBegin)) / (fInterpolateBezier2 * f2)) * j6;
            }
            float f5 = this.mTarget;
            if ((f5 - this.mValue) * (f5 - this.mBegin) < 0.001f) {
                this.mValue = f5;
                this.mRunning = false;
                onStop();
            }
            this.mLastTime = jCurrentTimeMillis;
        }
    }

    public ValueAnimation(float f, float f2, long j2) {
        this.mDelayTime = 0L;
        this.mRunning = false;
        this.mValue = f;
        this.mBegin = f;
        this.mTarget = f2;
        this.mDuration = j2;
    }

    public void updateInterpolator(Interpolator interpolator) {
        if (this.mRunning) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.mStartTime) - this.mDelayTime;
            if (jCurrentTimeMillis < 0) {
                return;
            }
            long j2 = this.mDuration;
            float f = jCurrentTimeMillis / j2;
            if (f < 1.0f && j2 > 0.001f) {
                float interpolation = interpolator.getInterpolation(f);
                float f2 = this.mBegin;
                this.mValue = f2 + (interpolation * (this.mTarget - f2));
            } else {
                this.mValue = this.mTarget;
                this.mRunning = false;
                onStop();
            }
        }
    }
}
