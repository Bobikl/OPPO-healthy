package com.heytap.wearable.support.watchface.gl.material;

import android.opengl.GLES20;
import com.heytap.wearable.support.watchface.gl.shape.Mesh;
import com.oplus.aiunit.vision.k18;

/* JADX INFO: loaded from: classes2.dex */
public class ShaderProgramPlane2D extends ShaderProgram {
    protected int mUWorldMatrix;
    private int mAPosition = -1;
    private int mACoordinate = -1;
    private int mANormal = -1;
    private int mUTexture = -1;
    private String mUTextureName = "uTexture";
    private String mAPositionName = "aPosition";
    private String mACoordinateName = "aCoordinate";
    private String mANormalName = "aNormal";
    private String mUWorldMatrixName = "uWorldMatrix";

    public void endDraw() {
        GLES20.glDisableVertexAttribArray(this.mAPosition);
        GLES20.glDisableVertexAttribArray(this.mACoordinate);
        GLES20.glDisableVertexAttribArray(this.mANormal);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void init() {
        this.mUTexture = GLES20.glGetUniformLocation(this.mProgram, this.mUTextureName);
        this.mAPosition = GLES20.glGetAttribLocation(this.mProgram, this.mAPositionName);
        this.mACoordinate = GLES20.glGetAttribLocation(this.mProgram, this.mACoordinateName);
        this.mANormal = GLES20.glGetAttribLocation(this.mProgram, this.mANormalName);
        this.mUWorldMatrix = GLES20.glGetUniformLocation(this.mProgram, this.mUWorldMatrixName);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateMeshData(Mesh mesh) {
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
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateWorldMatrix(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.mUWorldMatrix, 1, false, fArr, 0);
    }
}
