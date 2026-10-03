package com.heytap.wearable.support.watchface.gl.material;

import android.opengl.GLES20;
import com.heytap.wearable.support.watchface.gl.Camera;
import com.heytap.wearable.support.watchface.gl.shape.Mesh;
import com.oplus.aiunit.vision.k18;

/* JADX INFO: loaded from: classes2.dex */
public class ShaderProgram3D extends ShaderProgram {
    protected int mACoordinate;
    protected int mANormal;
    protected int mAPosition;
    protected int mUEdgeBlend;
    protected int mULightParam;
    protected int mULightVector;
    protected int mUModelMatrix;
    protected int mUParam0;
    protected int mUProjMatrix;
    protected int mUTexture0;
    protected int mUTexture1;
    protected int mUTexture2;
    protected int mUViewMatrix;
    protected int mUViewPos;
    protected int mUWorldMatrix;
    private String mUProjMatrixName = "uProjMatrix";
    private String mUViewMatrixName = "uViewMatrix";
    private String mUWorldMatrixName = "uWorldMatrix";
    private String mUModelMatrixName = "uModelMatrix";
    private String mULightVectorName = "uLightVector";
    private String mULightParamName = "uLightParam";
    private String mUViewPosName = "uViewPos";
    private String mUEdgeBlendName = "uEdgeBlend";
    private String mUParam0Name = "uParam0";
    private String mUTexture0Name = "uTexture";
    private String mUTexture1Name = "uTexture1";
    private String mUTexture2Name = "uTexture2";
    private String mAPositionName = "aPosition";
    private String mACoordinateName = "aCoordinate";
    private String mANormalName = "aNormal";
    private float[] mViewMatrix = new float[16];

    public void endDraw() {
        GLES20.glDisableVertexAttribArray(this.mAPosition);
        GLES20.glDisableVertexAttribArray(this.mACoordinate);
        GLES20.glDisableVertexAttribArray(this.mANormal);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void init() {
        this.mUProjMatrix = GLES20.glGetUniformLocation(this.mProgram, this.mUProjMatrixName);
        this.mUViewMatrix = GLES20.glGetUniformLocation(this.mProgram, this.mUViewMatrixName);
        this.mUWorldMatrix = GLES20.glGetUniformLocation(this.mProgram, this.mUWorldMatrixName);
        this.mUModelMatrix = GLES20.glGetUniformLocation(this.mProgram, this.mUModelMatrixName);
        this.mULightVector = GLES20.glGetUniformLocation(this.mProgram, this.mULightVectorName);
        this.mULightParam = GLES20.glGetUniformLocation(this.mProgram, this.mULightParamName);
        this.mUViewPos = GLES20.glGetUniformLocation(this.mProgram, this.mUViewPosName);
        this.mUEdgeBlend = GLES20.glGetUniformLocation(this.mProgram, this.mUEdgeBlendName);
        this.mUParam0 = GLES20.glGetUniformLocation(this.mProgram, this.mUParam0Name);
        this.mUTexture0 = GLES20.glGetUniformLocation(this.mProgram, this.mUTexture0Name);
        this.mUTexture1 = GLES20.glGetUniformLocation(this.mProgram, this.mUTexture1Name);
        this.mUTexture2 = GLES20.glGetUniformLocation(this.mProgram, this.mUTexture2Name);
        this.mAPosition = GLES20.glGetAttribLocation(this.mProgram, this.mAPositionName);
        this.mACoordinate = GLES20.glGetAttribLocation(this.mProgram, this.mACoordinateName);
        this.mANormal = GLES20.glGetAttribLocation(this.mProgram, this.mANormalName);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateEdgeBlendParam(float[] fArr) {
        GLES20.glUniform3fv(this.mUEdgeBlend, 1, fArr, 0);
    }

    public void updateLightParam(float[] fArr) {
        GLES20.glUniform4fv(this.mULightParam, 1, fArr, 0);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateMeshData(Mesh mesh) {
        updateModelMatrix(mesh.getModelMatrix());
        int i = this.mAPosition;
        if (i >= 0) {
            GLES20.glEnableVertexAttribArray(i);
            GLES20.glVertexAttribPointer(this.mAPosition, 3, k18.GL_FLOAT, false, 0, 0);
        }
        int i2 = this.mACoordinate;
        if (i2 >= 0) {
            GLES20.glEnableVertexAttribArray(i2);
            GLES20.glVertexAttribPointer(this.mACoordinate, 2, k18.GL_FLOAT, false, 0, mesh.getVertexCount() * 3 * 4);
        }
        int i3 = this.mANormal;
        if (i3 >= 0) {
            GLES20.glEnableVertexAttribArray(i3);
            GLES20.glVertexAttribPointer(this.mANormal, 3, k18.GL_FLOAT, true, 0, mesh.getVertexCount() * 5 * 4);
        }
        GLES20.glUniform1i(this.mUTexture0, 0);
        GLES20.glUniform1i(this.mUTexture1, 1);
        GLES20.glUniform1i(this.mUTexture2, 2);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateModelMatrix(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.mUModelMatrix, 1, false, fArr, 0);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateParam(float[] fArr, int i) {
        GLES20.glUniform4fv(this.mUParam0, 1, fArr, 0);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateViewData(Camera camera) {
        camera.getViewMatrixSafe(this.mViewMatrix);
        GLES20.glUniformMatrix4fv(this.mUProjMatrix, 1, false, camera.getProjectMatrix(), 0);
        GLES20.glUniformMatrix4fv(this.mUViewMatrix, 1, false, this.mViewMatrix, 0);
        GLES20.glUniform3fv(this.mULightVector, 1, camera.mLightVector, 0);
        GLES20.glUniform3fv(this.mUViewPos, 1, camera.getPosition(), 0);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateWorldMatrix(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.mUWorldMatrix, 1, false, fArr, 0);
    }
}
