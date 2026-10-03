package com.heytap.wearable.support.watchface.gl.animation;

import android.opengl.Matrix;
import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.TransformNode;
import com.heytap.wearable.support.watchface.gl.math.Interpolate;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class RotateTransform {
    private static final float FIRST_CONTROL_VALUE = 0.9f;
    private static final long KEEP_TIME = 230;
    private static final float SECOND_CONTROL_VALUE = 0.1f;
    private static final String TAG = "RotateCamera";
    private TransformNode mTransformNode;
    private float[] mViewMatrix = new float[16];
    private Float3 mYAxis = new Float3(0.0f, 1.0f, 0.0f);
    private Float3 mZAxis = new Float3(0.0f, 0.0f, -1.0f);
    private Float3 mXAxis = new Float3(1.0f, 0.0f, 0.0f);
    private Float3 mPos = new Float3(0.0f, 0.0f, 0.0f);
    private float mLastHeading = 0.0f;
    private float mLastPitch = 0.0f;
    private float mTargetHeading = 0.0f;
    private float mTargetPitch = 0.0f;
    private float mBeginHeading = 0.0f;
    private float mBeginPitch = 0.0f;
    private float[] mControlHeading = new float[2];
    private float[] mControlPitch = new float[2];
    private long mStartTime = 0;
    private boolean mRunning = false;
    private Lock mValueLock = new ReentrantLock();

    public RotateTransform(TransformNode transformNode) {
        this.mTransformNode = transformNode;
    }

    private void updateMatrix(float f, float f2) {
        Matrix.setIdentityM(this.mViewMatrix, 0);
        this.mTransformNode.getLocalAxis(this.mXAxis, this.mYAxis, this.mZAxis);
        TransformNode transformNode = this.mTransformNode;
        Float3 float3 = this.mYAxis;
        transformNode.rotate(f, float3.x, float3.y, float3.z);
        this.mTransformNode.getLocalAxis(this.mXAxis, this.mYAxis, this.mZAxis);
        TransformNode transformNode2 = this.mTransformNode;
        Float3 float4 = this.mXAxis;
        transformNode2.rotateAppend(f2, float4.x, float4.y, float4.z);
    }

    public void setValue(float f, float f2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mValueLock.lock();
        try {
            this.mTargetHeading = f;
            this.mTargetPitch = f2;
            float f3 = this.mLastHeading;
            this.mBeginHeading = f3;
            float f4 = this.mLastPitch;
            this.mBeginPitch = f4;
            float f5 = f - f3;
            float[] fArr = this.mControlHeading;
            fArr[0] = (f5 * 0.9f) + f3;
            fArr[1] = f3 + (f5 * 0.1f);
            float f6 = f2 - f4;
            float[] fArr2 = this.mControlPitch;
            fArr2[0] = (0.9f * f6) + f4;
            fArr2[1] = f4 + (f6 * 0.1f);
            this.mStartTime = jCurrentTimeMillis;
            this.mRunning = true;
        } finally {
            this.mValueLock.unlock();
        }
    }

    public void update() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mValueLock.lock();
        try {
            float f = this.mTargetHeading;
            float f2 = this.mTargetPitch;
            float f3 = this.mBeginHeading;
            float f4 = this.mBeginPitch;
            float[] fArr = this.mControlHeading;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float[] fArr2 = this.mControlPitch;
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            long j2 = jCurrentTimeMillis - this.mStartTime;
            this.mValueLock.unlock();
            if (Math.abs(j2) > KEEP_TIME) {
                this.mRunning = false;
            }
            if (this.mRunning) {
                float f9 = j2 / 230.0f;
                float fInterpolateBezier = Interpolate.interpolateBezier(f9, f3, f5, f6, f);
                float fInterpolateBezier2 = Interpolate.interpolateBezier(f9, f4, f7, f8, f2);
                this.mLastHeading = fInterpolateBezier;
                this.mLastPitch = fInterpolateBezier2;
                updateMatrix(fInterpolateBezier, fInterpolateBezier2);
            }
        } catch (Throwable th) {
            this.mValueLock.unlock();
            throw th;
        }
    }
}
