package com.heytap.wearable.support.watchface.gl.animation;

import android.view.animation.Interpolator;
import com.heytap.wearable.support.watchface.gl.TransformNode;
import com.heytap.wearable.support.watchface.gl.math.Interpolate;

/* JADX INFO: loaded from: classes2.dex */
public class AutoRotate {
    private long mDuration;
    private Interpolator mInterpolator;
    private long mStartTime;
    private TransformNode mTransformNode;
    private float[] mRotateAxis = {0.0f, 0.0f, 1.0f};
    private long mLastTime = 0;
    private long mStopTime = 0;
    private long mStopDuration = 0;
    private long mBackTime = 0;
    private long mBackDuration = 0;
    private float mStopAngle = 0.0f;
    private float mLastRotateAngle = 0.0f;
    private float mTotalRotateAngle = 0.0f;
    private State mState = State.STOP;
    private boolean mLoop = true;
    private float mAngle = 0.01f;

    public enum State {
        RUNNING,
        DECELERATE,
        STOP,
        BACK
    }

    public AutoRotate(TransformNode transformNode) {
        this.mTransformNode = transformNode;
    }

    public float getAngle() {
        return this.mTotalRotateAngle;
    }

    public boolean isRunning() {
        return State.STOP != this.mState;
    }

    public void reset() {
        this.mState = State.STOP;
        float f = this.mTotalRotateAngle;
        if (f > 180.0f) {
            this.mTotalRotateAngle = f - 360.0f;
        }
        TransformNode transformNode = this.mTransformNode;
        float[] fArr = this.mRotateAxis;
        transformNode.rotate(0.0f, fArr[0], fArr[1], fArr[2]);
        this.mTotalRotateAngle = 0.0f;
        this.mLastRotateAngle = 0.0f;
    }

    public void rotate(float f, float f2, float f3, float f4) {
        this.mAngle = f;
        float[] fArr = this.mRotateAxis;
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
    }

    public void setDuration(long j2) {
        this.mDuration = j2;
        this.mLoop = false;
    }

    public void setInterpolator(Interpolate interpolate) {
    }

    public void start() {
        this.mLastTime = System.currentTimeMillis();
        this.mState = State.RUNNING;
        this.mStartTime = System.currentTimeMillis();
    }

    public void startAfterBack(long j2) {
        this.mState = State.BACK;
        this.mBackTime = System.currentTimeMillis();
        this.mBackDuration = j2;
        this.mLastRotateAngle = 0.0f;
    }

    public void stop(long j2) {
        this.mStopTime = System.currentTimeMillis();
        this.mStopDuration = j2;
        this.mStopAngle = this.mAngle * 0.5f * j2;
        this.mLastRotateAngle = 0.0f;
        this.mState = State.DECELERATE;
    }

    public void update() {
        float fInterpolateLinear;
        State state = State.RUNNING;
        State state2 = this.mState;
        float f = 0.0f;
        if (state == state2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis - this.mLastTime;
            this.mLastTime = jCurrentTimeMillis;
            long j3 = jCurrentTimeMillis - this.mStartTime;
            if (!this.mLoop) {
                long j4 = this.mDuration;
                long j5 = j4 - j3;
                long j6 = j4 / 2;
                if (j5 < 0) {
                    this.mState = State.STOP;
                } else {
                    fInterpolateLinear = (j5 >= j6 || j6 <= 0) ? this.mAngle : Interpolate.interpolateLinear(j5 / j6, this.mAngle, 0.0f);
                }
                float f2 = (this.mTotalRotateAngle + f) % 360.0f;
                this.mTotalRotateAngle = f2;
                TransformNode transformNode = this.mTransformNode;
                float[] fArr = this.mRotateAxis;
                transformNode.rotate(f2, fArr[0], fArr[1], fArr[2]);
                return;
            }
            fInterpolateLinear = this.mAngle;
            f = fInterpolateLinear * j2;
            float f3 = (this.mTotalRotateAngle + f) % 360.0f;
            this.mTotalRotateAngle = f3;
            TransformNode transformNode2 = this.mTransformNode;
            float[] fArr2 = this.mRotateAxis;
            transformNode2.rotate(f3, fArr2[0], fArr2[1], fArr2[2]);
            return;
        }
        if (State.DECELERATE == state2) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.mStopTime;
            long j7 = this.mStopDuration;
            if (jCurrentTimeMillis2 >= j7 || j7 <= 0.001f) {
                this.mState = State.STOP;
                return;
            }
            float fInterpolateDecrease = Interpolate.interpolateDecrease(jCurrentTimeMillis2 / j7, 0.0f, this.mStopAngle);
            this.mLastRotateAngle = fInterpolateDecrease;
            float f4 = (this.mTotalRotateAngle + (fInterpolateDecrease - fInterpolateDecrease)) % 360.0f;
            this.mTotalRotateAngle = f4;
            TransformNode transformNode3 = this.mTransformNode;
            float[] fArr3 = this.mRotateAxis;
            transformNode3.rotate(f4, fArr3[0], fArr3[1], fArr3[2]);
            return;
        }
        if (State.BACK == state2) {
            long jCurrentTimeMillis3 = System.currentTimeMillis() - this.mBackTime;
            long j8 = this.mBackDuration;
            if (jCurrentTimeMillis3 >= j8 || j8 <= 0.001f) {
                this.mTotalRotateAngle = 0.0f;
                start();
                return;
            }
            float f5 = jCurrentTimeMillis3 / j8;
            float f6 = this.mTotalRotateAngle;
            if (f6 > 180.0f) {
                this.mTotalRotateAngle = f6 - 360.0f;
            }
            float fInterpolateLinear2 = Interpolate.interpolateLinear(f5, this.mTotalRotateAngle, 0.0f);
            TransformNode transformNode4 = this.mTransformNode;
            float[] fArr4 = this.mRotateAxis;
            transformNode4.rotate(fInterpolateLinear2, fArr4[0], fArr4[1], fArr4[2]);
            this.mLastRotateAngle = fInterpolateLinear2;
        }
    }

    public void stop() {
        this.mState = State.STOP;
    }
}
