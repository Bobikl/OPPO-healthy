package com.heytap.wearable.support.watchface.gl;

import android.opengl.Matrix;
import android.renderscript.Float3;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class CameraProj extends CameraOrtho {
    private float[][] mLightVector = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, 3);
    private float mFovy = 95.0f;

    @Override // com.heytap.wearable.support.watchface.gl.CameraOrtho
    public float[][] getLightVector() {
        return this.mLightVector;
    }

    @Override // com.heytap.wearable.support.watchface.gl.CameraOrtho, com.heytap.wearable.support.watchface.gl.Camera
    public void init() {
        float[] fArr = this.mPos;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        this.mCenter = new Float3(0.0f, 0.0f, 0.0f);
        this.mUp = new Float3(0.0f, 0.0f, 1.0f);
        this.mRatio = 0.8214286f;
        setUp();
    }

    @Override // com.heytap.wearable.support.watchface.gl.CameraOrtho, com.heytap.wearable.support.watchface.gl.Camera
    public void setUp() {
        Matrix.perspectiveM(this.mProjectMatrix, 0, this.mFovy, this.mRatio, 0.01f, 3000.0f);
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
        float[][] fArr3 = this.mLightVector;
        float[] fArr4 = fArr3[0];
        fArr4[0] = 1.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 0.0f;
        float[] fArr5 = fArr3[1];
        fArr5[0] = 0.0f;
        fArr5[1] = 1.0f;
        fArr5[2] = 1.0f;
        float[] fArr6 = fArr3[2];
        fArr6[0] = 0.0f;
        fArr6[1] = 1.0f;
        fArr6[2] = 1.0f;
    }

    @Override // com.heytap.wearable.support.watchface.gl.CameraOrtho, com.heytap.wearable.support.watchface.gl.Camera
    public void updateProj(float f, float f2) {
        float f3 = f / f2;
        this.mRatio = f3;
        Matrix.perspectiveM(this.mProjectMatrix, 0, this.mFovy, f3, 0.01f, 3000.0f);
    }
}
