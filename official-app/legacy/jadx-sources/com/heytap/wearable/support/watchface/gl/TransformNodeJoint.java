package com.heytap.wearable.support.watchface.gl;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class TransformNodeJoint extends TransformNode {
    @Override // com.heytap.wearable.support.watchface.gl.TransformNode
    public void rotate(float f, float f2, float f3, float f4) {
        Matrix.setIdentityM(this.mRotateMatrix, 0);
        Matrix.rotateM(this.mRotateMatrix, 0, f, f2, f3, f4);
        float[] fArr = this.mModelMatrix;
        Matrix.multiplyMM(fArr, 0, this.mRotateMatrix, 0, fArr, 0);
    }

    @Override // com.heytap.wearable.support.watchface.gl.TransformNode
    public void scale(float f, float f2, float f3) {
        Matrix.setIdentityM(this.mScaleMatrix, 0);
        Matrix.scaleM(this.mScaleMatrix, 0, f, f2, f3);
        float[] fArr = this.mModelMatrix;
        Matrix.multiplyMM(fArr, 0, this.mScaleMatrix, 0, fArr, 0);
    }

    @Override // com.heytap.wearable.support.watchface.gl.TransformNode
    public void translate(float f, float f2, float f3) {
        Matrix.setIdentityM(this.mTransMatrix, 0);
        Matrix.translateM(this.mTransMatrix, 0, f, f2, f3);
        float[] fArr = this.mModelMatrix;
        Matrix.multiplyMM(fArr, 0, this.mTransMatrix, 0, fArr, 0);
    }
}
