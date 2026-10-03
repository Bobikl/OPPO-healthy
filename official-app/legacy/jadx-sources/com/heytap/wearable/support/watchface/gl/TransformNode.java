package com.heytap.wearable.support.watchface.gl;

import android.opengl.Matrix;
import android.renderscript.Float3;

/* JADX INFO: loaded from: classes2.dex */
public class TransformNode {
    protected float[] mModelMatrix;
    protected float[] mScaleMatrix = new float[16];
    protected float[] mTransMatrix = new float[16];
    protected float[] mRotateMatrix = new float[16];
    protected float[] mGlobeMatrix = new float[16];
    protected float mOriginPosX = 0.0f;
    protected float mOriginPosY = 0.0f;
    protected float mOriginPosZ = 0.0f;
    protected float mOriginScaleX = 1.0f;
    protected float mOriginScaleY = 1.0f;
    protected float mOriginScaleZ = 1.0f;
    protected TransformNode mParentNode = null;

    public TransformNode() {
        float[] fArr = new float[16];
        this.mModelMatrix = fArr;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(this.mScaleMatrix, 0);
        Matrix.setIdentityM(this.mTransMatrix, 0);
        Matrix.setIdentityM(this.mRotateMatrix, 0);
        Matrix.setIdentityM(this.mGlobeMatrix, 0);
    }

    public void getLocalAxis(Float3 float3, Float3 float4, Float3 float5) {
        float[] fArr = this.mRotateMatrix;
        float3.x = fArr[0];
        float3.y = fArr[4];
        float3.z = fArr[8];
        float4.x = fArr[1];
        float4.y = fArr[5];
        float4.z = fArr[9];
        float5.x = fArr[2];
        float5.y = fArr[6];
        float5.z = fArr[10];
    }

    public float[] getModelMatrix() {
        TransformNode transformNode = this.mParentNode;
        if (transformNode == null) {
            return this.mModelMatrix;
        }
        Matrix.multiplyMM(this.mGlobeMatrix, 0, transformNode.getModelMatrix(), 0, this.mModelMatrix, 0);
        return this.mGlobeMatrix;
    }

    public void getPos(Float3 float3) {
        float[] fArr = this.mModelMatrix;
        float3.x = fArr[12];
        float3.y = fArr[13];
        float3.z = fArr[14];
    }

    public void reset() {
        Matrix.setIdentityM(this.mModelMatrix, 0);
        Matrix.setIdentityM(this.mScaleMatrix, 0);
        Matrix.setIdentityM(this.mTransMatrix, 0);
        Matrix.setIdentityM(this.mRotateMatrix, 0);
        Matrix.setIdentityM(this.mGlobeMatrix, 0);
        scale(this.mOriginScaleX, this.mOriginScaleY, this.mOriginScaleZ);
        translate(this.mOriginPosX, this.mOriginPosY, this.mOriginPosZ);
    }

    public void rotate(float f, float f2, float f3, float f4) {
        Matrix.setIdentityM(this.mRotateMatrix, 0);
        Matrix.rotateM(this.mRotateMatrix, 0, f, f2, f3, f4);
        updateModelMatrix();
    }

    public void rotateAppend(float f, float f2, float f3, float f4) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, f, f2, f3, f4);
        float[] fArr2 = this.mRotateMatrix;
        Matrix.multiplyMM(fArr2, 0, fArr, 0, fArr2, 0);
        updateModelMatrix();
    }

    public void scale(float f, float f2, float f3) {
        Matrix.setIdentityM(this.mScaleMatrix, 0);
        Matrix.scaleM(this.mScaleMatrix, 0, f, f2, f3);
        updateModelMatrix();
    }

    public void setOrignPos(float f, float f2, float f3) {
        this.mOriginPosX = f;
        this.mOriginPosY = f2;
        this.mOriginPosZ = f3;
        translate(f, f2, f3);
    }

    public void setOrignScale(float f, float f2, float f3) {
        this.mOriginScaleX = f;
        this.mOriginScaleY = f2;
        this.mOriginScaleZ = f3;
        scale(f, f2, f3);
    }

    public void setParentNode(TransformNode transformNode) {
        this.mParentNode = transformNode;
    }

    public void translate(float f, float f2, float f3) {
        Matrix.setIdentityM(this.mTransMatrix, 0);
        Matrix.translateM(this.mTransMatrix, 0, f, f2, f3);
        updateModelMatrix();
    }

    public void updateModelMatrix() {
        Matrix.setIdentityM(this.mModelMatrix, 0);
        Matrix.multiplyMM(this.mModelMatrix, 0, this.mRotateMatrix, 0, this.mScaleMatrix, 0);
        float[] fArr = this.mModelMatrix;
        Matrix.multiplyMM(fArr, 0, this.mTransMatrix, 0, fArr, 0);
    }
}
