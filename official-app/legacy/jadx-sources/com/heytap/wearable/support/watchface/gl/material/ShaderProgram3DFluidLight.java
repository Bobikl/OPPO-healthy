package com.heytap.wearable.support.watchface.gl.material;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.heytap.wearable.support.watchface.gl.Camera;
import com.heytap.wearable.support.watchface.gl.CameraOrtho;
import com.heytap.wearable.support.watchface.gl.shape.Mesh;

/* JADX INFO: loaded from: classes2.dex */
public class ShaderProgram3DFluidLight extends ShaderProgram3D {
    private int mUColor;
    private int mUOrigin;
    private int[] mULightVector = {0, 0, 0};
    private String[] mULightVectorName = {"uLightVector[0]", "uLightVector[1]", "uLightVector[2]"};
    private String mUColorName = "uColor";
    private String mUOriginName = "uOrigin";

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void init() {
        super.init();
        this.mULightVector[0] = GLES20.glGetUniformLocation(this.mProgram, this.mULightVectorName[0]);
        this.mULightVector[1] = GLES20.glGetUniformLocation(this.mProgram, this.mULightVectorName[1]);
        this.mULightVector[2] = GLES20.glGetUniformLocation(this.mProgram, this.mULightVectorName[2]);
        this.mUColor = GLES20.glGetUniformLocation(this.mProgram, this.mUColorName);
        this.mUOrigin = GLES20.glGetUniformLocation(this.mProgram, this.mUOriginName);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateMeshData(Mesh mesh) {
        float[] modelMatrix = mesh.getModelMatrix();
        Matrix.setIdentityM(modelMatrix, 0);
        float[] pos = mesh.getPos();
        float[] scale = mesh.getScale();
        float[] color = mesh.getColor();
        Matrix.translateM(modelMatrix, 0, pos[0], pos[1], pos[2]);
        Matrix.scaleM(modelMatrix, 0, scale[0], scale[1], scale[2]);
        GLES20.glUniform4fv(this.mUColor, 1, color, 0);
        GLES20.glUniform3fv(this.mUOrigin, 1, pos, 0);
        super.updateMeshData(mesh);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateViewData(Camera camera) {
        float[] viewMatrix = camera.getViewMatrix();
        GLES20.glUniformMatrix4fv(this.mUProjMatrix, 1, false, camera.getProjectMatrix(), 0);
        GLES20.glUniformMatrix4fv(this.mUViewMatrix, 1, false, viewMatrix, 0);
        GLES20.glUniform3fv(this.mUViewPos, 1, camera.getPosition(), 0);
        float[][] lightVector = ((CameraOrtho) camera).getLightVector();
        GLES20.glUniform3fv(this.mULightVector[0], 1, lightVector[0], 0);
        GLES20.glUniform3fv(this.mULightVector[1], 1, lightVector[1], 0);
        GLES20.glUniform3fv(this.mULightVector[2], 1, lightVector[2], 0);
    }
}
