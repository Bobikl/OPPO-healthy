package com.heytap.wearable.support.watchface.gl.animation;

import com.heytap.wearable.support.watchface.gl.math.Interpolate;

/* JADX INFO: loaded from: classes2.dex */
public class ValueLoopAnimation {
    private long mDelayTime;
    private long mDuration;
    private float mEnd;
    private long mPauseTime;
    private float mStart;
    private long mStartTime;
    private float mValue;
    private long mDeltaTime = 0;
    private boolean mRunning = false;

    public float getValue() {
        return this.mValue;
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
        this.mStart = f;
        this.mEnd = f2;
        this.mDuration = j2;
        this.mDelayTime = j3;
        this.mStartTime = System.currentTimeMillis();
        this.mPauseTime = System.currentTimeMillis();
        this.mValue = this.mStart;
        this.mRunning = true;
    }

    public void update() {
        if (this.mRunning) {
            long jCurrentTimeMillis = ((System.currentTimeMillis() - this.mStartTime) - this.mDelayTime) - this.mDeltaTime;
            if (jCurrentTimeMillis < 0) {
                return;
            }
            long j2 = this.mDuration;
            float f = (jCurrentTimeMillis % j2) / j2;
            if (f < 0.5f) {
                this.mValue = Interpolate.interpolateLinear(f * 2.0f, this.mStart, this.mEnd);
            } else {
                this.mValue = Interpolate.interpolateLinear((f * 2.0f) - 1.0f, this.mEnd, this.mStart);
            }
        }
    }
}
