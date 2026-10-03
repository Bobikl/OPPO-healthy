package com.heytap.wearable.support.watchface.gl;

import android.opengl.Matrix;
import android.renderscript.Float3;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class Camera {
    protected float mRatio;
    protected float[] mViewMatrix = new float[16];
    protected float[] mProjectMatrix = new float[16];
    public float[] mLightVector = new float[3];
    protected float[] mPos = new float[3];
    protected Float3 mUp = new Float3(0.0f, 0.0f, 1.0f);
    protected Float3 mCenter = new Float3(0.0f, 0.0f, 0.0f);
    private Float3 mUpOrigin = new Float3();
    private Float3 mRightOrigin = new Float3();
    private Float3 mLookDirOrigin = new Float3(1.0f, 0.0f, 0.0f);
    private Lock mValueLock = new ReentrantLock();

    public float getDistance(float f, float f2, float f3) {
        float[] fArr = this.mPos;
        return Matrix.length(f - fArr[0], f2 - fArr[1], f3 - fArr[2]);
    }

    public float getPixelLength(float f, float f2, float f3) {
        Float3 float3 = this.mUp;
        float[] fArr = this.mViewMatrix;
        float f4 = fArr[1];
        float3.x = f4;
        float f5 = fArr[5];
        float3.y = f5;
        float f6 = fArr[9];
        float3.z = f6;
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[4];
        Matrix.multiplyMM(fArr2, 0, this.mProjectMatrix, 0, fArr, 0);
        Matrix.multiplyMV(fArr3, 0, fArr2, 0, new float[]{f4 * f3, f5 * f3, f3 * f6, 1.0f}, 0);
        if (Math.abs(fArr3[3]) > 0.001f) {
            return fArr3[1] / fArr3[3];
        }
        return 0.0f;
    }

    public void getPos(Float3 float3) {
        float[] fArr = this.mPos;
        float3.x = fArr[0];
        float3.y = fArr[1];
        float3.z = fArr[2];
    }

    public float[] getPosition() {
        return this.mPos;
    }

    public float[] getProjectMatrix() {
        return this.mProjectMatrix;
    }

    public void getRotate(Float3 float3, Float3 float4, Float3 float5) {
        float[] fArr = this.mViewMatrix;
        float5.x = fArr[0];
        float5.y = fArr[4];
        float5.z = fArr[8];
        float4.x = fArr[1];
        float4.y = fArr[5];
        float4.z = fArr[9];
        float3.x = fArr[2];
        float3.y = fArr[6];
        float3.z = fArr[10];
    }

    public void getScreenPos(float f, float f2, float f3, float[] fArr) {
        float[] fArr2 = new float[16];
        float[] fArr3 = {f, f2, f3, 1.0f};
        float[] fArr4 = new float[4];
        Matrix.multiplyMM(fArr2, 0, this.mProjectMatrix, 0, this.mViewMatrix, 0);
        Matrix.multiplyMV(fArr4, 0, fArr2, 0, fArr3, 0);
        float f4 = fArr4[0];
        float f5 = fArr4[3];
        fArr[0] = f4 / f5;
        fArr[1] = fArr4[1] / f5;
    }

    public float[] getViewMatrix() {
        return this.mViewMatrix;
    }

    public void getViewMatrixSafe(float[] fArr) {
        this.mValueLock.lock();
        for (int i = 0; i < 16; i++) {
            try {
                fArr[i] = this.mViewMatrix[i];
            } catch (Throwable th) {
                this.mValueLock.unlock();
                throw th;
            }
        }
        this.mValueLock.unlock();
    }

    public void init() {
        float[] fArr = this.mPos;
        fArr[0] = 10.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        this.mCenter = new Float3(0.0f, 0.0f, 0.0f);
        this.mUp = new Float3(0.0f, 0.0f, 1.0f);
        this.mRatio = 0.8214286f;
        setUp();
    }

    public void setLookAtM(Float3 float3, Float3 float4, Float3 float5) {
        float[] fArr = this.mPos;
        fArr[0] = float3.x;
        fArr[1] = float3.y;
        fArr[2] = float3.z;
        Float3 float6 = this.mCenter;
        float6.x = float4.x;
        float6.y = float4.y;
        float6.z = float4.z;
        Float3 float7 = this.mUp;
        float7.x = float5.x;
        float7.y = float5.y;
        float7.z = float5.z;
        setUp();
    }

    public void setUp() {
        Matrix.perspectiveM(this.mProjectMatrix, 0, 45.0f, this.mRatio, 1.0f, 300.0f);
        float[] fArr = this.mViewMatrix;
        float[] fArr2 = this.mPos;
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        Float3 float3 = this.mCenter;
        float f4 = float3.x;
        float f5 = float3.y;
        float f6 = float3.z;
        Float3 float4 = this.mUp;
        Matrix.setLookAtM(fArr, 0, f, f2, f3, f4, f5, f6, float4.x, float4.y, float4.z);
        float fSin = (float) (Math.sin(0.5235987755982988d) * Math.cos(-0.7853981633974483d));
        float fSin2 = (float) (Math.sin(0.5235987755982988d) * Math.sin(-0.7853981633974483d));
        float fCos = (float) Math.cos(0.5235987755982988d);
        float[] fArr3 = this.mLightVector;
        fArr3[0] = fSin;
        fArr3[1] = fSin2;
        fArr3[2] = fCos;
    }

    public void updatePos(float[] fArr) {
        float[] fArr2 = this.mPos;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        setUp();
    }

    public void updateProj(float f, float f2) {
        float f3 = f / f2;
        this.mRatio = f3;
        Matrix.perspectiveM(this.mProjectMatrix, 0, 45.0f, f3, 1.0f, 300.0f);
    }

    public void init(Float3 float3, Float3 float4, Float3 float5, float f) {
        float[] fArr = this.mPos;
        fArr[0] = float3.x;
        fArr[1] = float3.y;
        fArr[2] = float3.z;
        Float3 float6 = this.mCenter;
        float6.x = float4.x;
        float6.y = float4.y;
        float6.z = float4.z;
        Float3 float7 = this.mUp;
        float7.x = float5.x;
        float7.y = float5.y;
        float7.z = float5.z;
        this.mRatio = f;
        setUp();
    }
}
