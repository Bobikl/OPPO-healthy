package com.heytap.wearable.support.watchface.gl.material;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.heytap.wearable.support.watchface.gl.Camera;
import com.heytap.wearable.support.watchface.gl.shape.Mesh;

/* JADX INFO: loaded from: classes2.dex */
public class ShaderProgram3DBalloonDepth extends ShaderProgram3D {
    private int mUOrigin;
    private String mUOriginName = "uOrigin";
    private float[] mViewMatrix;

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void init() {
        super.init();
        this.mUOrigin = GLES20.glGetUniformLocation(this.mProgram, this.mUOriginName);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateMeshData(Mesh mesh) {
        float[] modelMatrix = mesh.getModelMatrix();
        Matrix.setIdentityM(modelMatrix, 0);
        float[] pos = mesh.getPos();
        float[] scale = mesh.getScale();
        Matrix.translateM(modelMatrix, 0, pos[0], pos[1], pos[2]);
        Matrix.scaleM(modelMatrix, 0, scale[0], scale[1], scale[2]);
        float[] fArr = new float[4];
        Matrix.multiplyMV(fArr, 0, this.mViewMatrix, 0, new float[]{pos[0], pos[1], pos[2], 1.0f}, 0);
        GLES20.glUniform3fv(this.mUOrigin, 1, fArr, 0);
        super.updateMeshData(mesh);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateViewData(Camera camera) {
        this.mViewMatrix = camera.getViewMatrix();
        GLES20.glUniformMatrix4fv(this.mUProjMatrix, 1, false, camera.getProjectMatrix(), 0);
        GLES20.glUniformMatrix4fv(this.mUViewMatrix, 1, false, this.mViewMatrix, 0);
    }
}
