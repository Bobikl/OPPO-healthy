package com.heytap.wearable.support.watchface.gl.animation;

import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.Camera;
import com.heytap.wearable.support.watchface.gl.math.Interpolate;
import com.heytap.wearable.support.watchface.gl.math.VectorMath;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class OrbitCamera {
    private static final String TAG = "OrbitCamera";
    private Camera mCamera;
    private Float3 mCenter;
    private float mDis;
    private long mDuration;
    private float mLastDegreeX;
    private float mLastDegreeY;
    private long mStartTime;
    private float mTargetDegreeX;
    private float mTargetDegreeY;
    private Float3 mUp = new Float3(0.0f, 1.0f, 0.0f);
    private Float3 mLook = new Float3(0.0f, 0.0f, -1.0f);
    private Float3 mTargetUp = new Float3(0.0f, 0.0f, -1.0f);
    private Float3 mRight = new Float3(1.0f, 0.0f, 0.0f);
    private Float3 mPos = new Float3(10.0f, 0.0f, 0.0f);
    private Float3 mAxis = new Float3(0.0f, 0.0f, 1.0f);
    private Float3 mAxisRight = new Float3(0.0f, 1.0f, 0.0f);
    private Float3 mAxisLook = new Float3(1.0f, 0.0f, 0.0f);
    private float[] mViewMatrix = new float[16];
    private boolean mDecrease = true;
    private boolean mRunning = false;
    private Lock mValueLock = new ReentrantLock();

    public OrbitCamera(Camera camera, Float3 float3, float f) {
        this.mCenter = new Float3(0.0f, 0.0f, 0.0f);
        this.mCamera = camera;
        this.mDis = f;
        this.mCenter = float3;
    }

    private float getDegreeX() {
        this.mCamera.getRotate(this.mLook, this.mUp, this.mRight);
        if (((double) Math.abs(VectorMath.dot(this.mLook, this.mAxis))) > 0.99d) {
            float degrees = (float) Math.toDegrees((float) Math.acos(VectorMath.dot(this.mRight, this.mAxisRight)));
            Float3 float3 = new Float3();
            VectorMath.cross(float3, this.mUp, this.mAxisLook);
            return VectorMath.dot(float3, this.mLook) < -0.001f ? 360.0f - degrees : degrees;
        }
        float degrees2 = (float) Math.toDegrees((float) Math.acos(VectorMath.dot(this.mRight, this.mAxisRight)));
        Float3 float4 = new Float3();
        VectorMath.cross(float4, this.mLook, this.mAxisLook);
        return VectorMath.dot(float4, this.mAxis) > 0.001f ? 360.0f - degrees2 : degrees2;
    }

    public void OrbitTo(float f, float f2, long j2) {
        this.mStartTime = System.currentTimeMillis();
        this.mCamera.getPos(this.mPos);
        float degreeX = getDegreeX();
        float degrees = (float) Math.toDegrees(Math.acos(this.mPos.z / this.mDis));
        float fAbs = f - degreeX;
        if (Math.abs(fAbs) > 180.0f) {
            fAbs += (Math.abs(fAbs) / (-fAbs)) * 360.0f;
        }
        this.mValueLock.lock();
        try {
            this.mStartTime = System.currentTimeMillis();
            this.mTargetDegreeX = fAbs;
            this.mTargetDegreeY = f2 - degrees;
            this.mDuration = j2;
            this.mLastDegreeX = 0.0f;
            this.mLastDegreeY = 0.0f;
            this.mDecrease = false;
            this.mValueLock.unlock();
            this.mRunning = true;
        } catch (Throwable th) {
            this.mValueLock.unlock();
            throw th;
        }
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void orbitSphereAnimation(float f, float f2, long j2) {
        this.mStartTime = System.currentTimeMillis();
        if (Math.abs(f) > Math.abs(f2)) {
            f2 = 0.0f;
        } else {
            f = 0.0f;
        }
        if (Math.abs(f) > 360.0f) {
            f = (180.0f * f) / Math.abs(f);
        }
        if (Math.abs(f2) > 45.0f) {
            f2 = (45.0f * f2) / Math.abs(f2);
        }
        this.mValueLock.lock();
        try {
            this.mStartTime = System.currentTimeMillis();
            this.mTargetDegreeX = f;
            this.mTargetDegreeY = f2;
            this.mDuration = j2;
            this.mLastDegreeX = 0.0f;
            this.mLastDegreeY = 0.0f;
            this.mDecrease = true;
            this.mValueLock.unlock();
            this.mRunning = true;
        } catch (Throwable th) {
            this.mValueLock.unlock();
            throw th;
        }
    }

    public void rotateRoundSphere(float f, float f2) {
        this.mCamera.getRotate(this.mLook, this.mUp, this.mRight);
        Float3 float3 = this.mTargetUp;
        Float3 float4 = this.mUp;
        float3.x = float4.x;
        float3.y = float4.y;
        float3.z = float4.z;
        Float3 float5 = this.mRight;
        VectorMath.rotate(float3, f2, float5.x, float5.y, float5.z);
        if (VectorMath.dot(this.mTargetUp, this.mAxis) <= 1.0E-4f) {
            Float3 float6 = this.mLook;
            float6.x *= 1.0f;
            float6.y *= 1.0f;
            float6.z *= 1.0f;
            Float3 float7 = this.mUp;
            Float3 float8 = this.mAxis;
            VectorMath.rotate(float7, f, float8.x, float8.y, float8.z);
            this.mCamera.setLookAtM(this.mPos, this.mCenter, this.mUp);
            return;
        }
        Float3 float9 = this.mLook;
        Float3 float10 = this.mRight;
        VectorMath.rotate(float9, f2, float10.x, float10.y, float10.z);
        Float3 float11 = this.mUp;
        Float3 float12 = this.mRight;
        VectorMath.rotate(float11, f2, float12.x, float12.y, float12.z);
        Float3 float13 = this.mLook;
        Float3 float14 = this.mAxis;
        VectorMath.rotate(float13, f, float14.x, float14.y, float14.z);
        Float3 float15 = this.mUp;
        Float3 float16 = this.mAxis;
        VectorMath.rotate(float15, f, float16.x, float16.y, float16.z);
        Float3 float17 = this.mPos;
        Float3 float18 = this.mCenter;
        float f3 = float18.x;
        Float3 float19 = this.mLook;
        float f4 = float19.x;
        float f5 = this.mDis;
        float17.x = f3 + (f4 * f5);
        float17.y = float18.y + (float19.y * f5);
        float17.z = float18.z + (float19.z * f5);
        this.mCamera.setLookAtM(float17, float18, this.mUp);
    }

    public void stop() {
        this.mRunning = false;
    }

    public void update() {
        float fInterpolateDecrease;
        float fInterpolateDecrease2;
        if (this.mRunning) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.mStartTime;
            this.mValueLock.lock();
            try {
                float f = this.mDuration;
                float f2 = this.mTargetDegreeX;
                float f3 = this.mTargetDegreeY;
                float f4 = this.mLastDegreeX;
                float f5 = this.mLastDegreeY;
                boolean z = this.mDecrease;
                this.mValueLock.unlock();
                long j2 = this.mDuration;
                if (j2 == 0) {
                    this.mRunning = false;
                    rotateRoundSphere(f2, f2);
                    return;
                }
                float f6 = jCurrentTimeMillis;
                if (f6 >= f) {
                    this.mRunning = false;
                    return;
                }
                float f7 = ((float) j2) > 0.001f ? f6 / j2 : 1.0f;
                if (z) {
                    fInterpolateDecrease = Interpolate.interpolateDecrease(f7, 0.0f, f2);
                    fInterpolateDecrease2 = Interpolate.interpolateDecrease(f7, 0.0f, f3);
                } else {
                    fInterpolateDecrease = Interpolate.interpolateLinear(f7, 0.0f, f2);
                    fInterpolateDecrease2 = Interpolate.interpolateLinear(f7, 0.0f, f3);
                }
                rotateRoundSphere(fInterpolateDecrease - f4, fInterpolateDecrease2 - f5);
                this.mValueLock.lock();
                try {
                    this.mLastDegreeX = fInterpolateDecrease;
                    this.mLastDegreeY = fInterpolateDecrease2;
                } finally {
                    this.mValueLock.unlock();
                }
            } catch (Throwable th) {
                this.mValueLock.unlock();
                throw th;
            }
        }
    }

    public void OrbitTo(float f, float f2) {
        this.mCamera.getPos(this.mPos);
        float degreeX = getDegreeX();
        float degrees = (float) Math.toDegrees(Math.acos(this.mPos.z / this.mDis));
        float fAbs = f - degreeX;
        if (Math.abs(fAbs) > 180.0f) {
            fAbs += (Math.abs(fAbs) / (-fAbs)) * 360.0f;
        }
        rotateRoundSphere(fAbs, f2 - degrees);
    }
}
