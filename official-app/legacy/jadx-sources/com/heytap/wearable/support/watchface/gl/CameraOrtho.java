package com.heytap.wearable.support.watchface.gl;

import android.opengl.Matrix;
import android.renderscript.Float3;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class CameraOrtho extends Camera {
    private float[][] mLightVector = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, 3);
    protected float[] mViewShadowMatrix = new float[16];
    protected float[] mShadowPos = new float[3];
    protected Float3 mShadowUp = new Float3(0.0f, 0.0f, 1.0f);
    protected Float3 mShadowCenter = new Float3(0.0f, 0.0f, 0.0f);

    public float[][] getLightVector() {
        return this.mLightVector;
    }

    public float[] getViewShadowMatrix() {
        return this.mViewShadowMatrix;
    }

    public void init(Float3 float3, Float3 float4, Float3 float5, float f, Float3 float6, Float3 float7, Float3 float8) {
        float[] fArr = this.mPos;
        fArr[0] = float3.x;
        fArr[1] = float3.y;
        fArr[2] = float3.z;
        this.mCenter = float4;
        this.mUp = float5;
        this.mRatio = f;
        float[] fArr2 = this.mShadowPos;
        fArr2[0] = float6.x;
        fArr2[1] = float6.y;
        fArr2[2] = float6.z;
        this.mShadowCenter = float7;
        this.mShadowUp = float8;
        setUp();
    }

    @Override // com.heytap.wearable.support.watchface.gl.Camera
    public void setUp() {
        Matrix.orthoM(this.mProjectMatrix, 0, -100.0f, 100.0f, -100.0f, 100.0f, -4000.0f, 4000.0f);
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
        float[] fArr3 = this.mViewShadowMatrix;
        float[] fArr4 = this.mShadowPos;
        float f7 = fArr4[0];
        float f8 = fArr4[1];
        float f9 = fArr4[2];
        Float3 float5 = this.mShadowCenter;
        float f10 = float5.x;
        float f11 = float5.y;
        float f12 = float5.z;
        Float3 float6 = this.mShadowUp;
        Matrix.setLookAtM(fArr3, 0, f7, f8, f9, f10, f11, f12, float6.x, float6.y, float6.z);
        float[][] fArr5 = this.mLightVector;
        float[] fArr6 = fArr5[0];
        fArr6[0] = 1.0f;
        fArr6[1] = 0.0f;
        fArr6[2] = 0.0f;
        float[] fArr7 = fArr5[1];
        fArr7[0] = 0.0f;
        fArr7[1] = 1.0f;
        fArr7[2] = 1.0f;
        float[] fArr8 = fArr5[2];
        fArr8[0] = 0.0f;
        fArr8[1] = 1.0f;
        fArr8[2] = 1.0f;
    }

    @Override // com.heytap.wearable.support.watchface.gl.Camera
    public void updateProj(float f, float f2) {
        float f3 = f2 / f;
        Matrix.orthoM(this.mProjectMatrix, 0, -100.0f, 100.0f, f3 * (-100.0f), f3 * 100.0f, -4000.0f, 4000.0f);
    }

    public void updateProj(float f, float f2, float f3, float f4) {
        Matrix.orthoM(this.mProjectMatrix, 0, f, f2, f3, f4, -4000.0f, 4000.0f);
    }

    @Override // com.heytap.wearable.support.watchface.gl.Camera
    public void init() {
        float[] fArr = this.mPos;
        fArr[0] = 100.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        this.mCenter = new Float3(0.0f, 0.0f, 0.0f);
        this.mUp = new Float3(0.0f, 0.0f, 1.0f);
        this.mRatio = 0.8214286f;
        setUp();
    }
}
