package com.heytap.wearable.support.watchface.gl.animation;

import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.Camera;
import com.heytap.wearable.support.watchface.gl.math.Interpolate;
import com.heytap.wearable.support.watchface.gl.math.VectorMath;

/* JADX INFO: loaded from: classes2.dex */
public class CenterCamera {
    private Camera mCamera;
    private Float3 mCenter;
    private float mDegree;
    private long mDelayTime;
    private float mDis;
    private float mDisTarget;
    private long mDuration;
    private long mStartTime;
    private Float3 mUp;
    private Float3 mLook = new Float3();
    private Float3 mPosTarget = new Float3(0.0f, 0.0f, -1.0f);
    private Float3 mLookTarget = new Float3();
    private Float3 mRotateAxis = new Float3();
    private Float3 mLookCur = new Float3();
    private Float3 mPosCur = new Float3();
    private Float3 mRightCur = new Float3();
    private Float3 mUpCur = new Float3();
    private boolean mRunning = false;

    public CenterCamera(Camera camera, Float3 float3, Float3 float4) {
        this.mCamera = camera;
        this.mCenter = new Float3(float3.x, float3.y, float3.z);
        this.mUp = new Float3(float4.x, float4.y, float4.z);
    }

    public boolean IsRunning() {
        return this.mRunning;
    }

    public void TranslateTo(Float3 float3, Float3 float4, long j2, long j3) {
        this.mRunning = true;
        this.mPosTarget = float3;
        Float3 float5 = this.mLook;
        float f = float4.x;
        Float3 float6 = this.mCenter;
        float5.x = f - float6.x;
        float5.y = float4.y - float6.y;
        float5.z = float4.z - float6.z;
        this.mDis = VectorMath.length(float5);
        VectorMath.normalize(this.mLook);
        Float3 float7 = this.mLookTarget;
        Float3 float8 = this.mPosTarget;
        float f2 = float8.x;
        Float3 float9 = this.mCenter;
        float7.x = f2 - float9.x;
        float7.y = float8.y - float9.y;
        float7.z = float8.z - float9.z;
        this.mDisTarget = VectorMath.length(float7);
        VectorMath.normalize(this.mLookTarget);
        VectorMath.cross(this.mRotateAxis, this.mLook, this.mLookTarget);
        this.mDegree = VectorMath.angle(this.mLookTarget, this.mLook);
        this.mStartTime = System.currentTimeMillis();
        this.mDuration = j3;
        this.mDelayTime = j2;
    }

    public void update() {
        if (this.mRunning) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.mStartTime) - this.mDelayTime;
            if (jCurrentTimeMillis < 0) {
                return;
            }
            long j2 = this.mDuration;
            if (jCurrentTimeMillis >= j2) {
                this.mCamera.setLookAtM(this.mPosTarget, this.mCenter, this.mUp);
                this.mRunning = false;
                return;
            }
            float f = ((float) j2) > 0.001f ? jCurrentTimeMillis / j2 : 1.0f;
            float fInterpolateLinear = Interpolate.interpolateLinear(f, this.mDis, this.mDisTarget);
            float f2 = this.mDegree * f;
            Float3 float3 = this.mLookCur;
            Float3 float4 = this.mLook;
            Float3 float5 = this.mRotateAxis;
            VectorMath.rotate(float3, float4, f2, float5.x, float5.y, float5.z);
            Float3 float6 = this.mPosCur;
            Float3 float7 = this.mCenter;
            float f3 = float7.x;
            Float3 float8 = this.mLookCur;
            float6.x = f3 + (float8.x * fInterpolateLinear);
            float6.y = float7.y + (float8.y * fInterpolateLinear);
            float6.z = float7.z + (float8.z * fInterpolateLinear);
            VectorMath.cross(this.mRightCur, float8, this.mUp);
            VectorMath.cross(this.mUpCur, this.mRightCur, this.mLookCur);
            this.mCamera.setLookAtM(this.mPosCur, this.mCenter, this.mUp);
        }
    }

    public void TranslateTo(Float3 float3) {
        this.mRunning = false;
        this.mCamera.setLookAtM(float3, this.mCenter, this.mUp);
    }
}
