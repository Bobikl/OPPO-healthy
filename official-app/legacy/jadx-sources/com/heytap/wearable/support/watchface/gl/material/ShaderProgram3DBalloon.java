package com.heytap.wearable.support.watchface.gl.material;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.heytap.wearable.support.watchface.gl.Camera;
import com.heytap.wearable.support.watchface.gl.CameraOrtho;
import com.heytap.wearable.support.watchface.gl.shape.BalloonSphere;
import com.heytap.wearable.support.watchface.gl.shape.Mesh;

/* JADX INFO: loaded from: classes2.dex */
public class ShaderProgram3DBalloon extends ShaderProgram3D {
    private int mUColor;
    private int mUCoordScale;
    private int mULightCount;
    private int mUOrigin;
    protected int mUViewShadowMatrix;
    private int[] mULightVector = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int[] mULightColor = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private String[] mULightVectorName = {"uLightVector[0]", "uLightVector[1]", "uLightVector[2]", "uLightVector[3]", "uLightVector[4]", "uLightVector[5]", "uLightVector[6]", "uLightVector[7]", "uLightVector[8]"};
    private String[] mULightColorName = {"uLightColor[0]", "uLightColor[1]", "uLightColor[2]", "uLightColor[3]", "uLightColor[4]", "uLightColor[5]", "uLightColor[6]", "uLightColor[7]", "uLightColor[8]"};
    private String mULightCountName = "uLightCount";
    private String mUColorName = "uColor";
    private String mUOriginName = "uOrigin";
    private String mUViewShadowMatrixName = "uViewShadowMatrix";
    private String mUCoordScaleName = "uCoordScale";

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void init() {
        super.init();
        int i = 0;
        while (true) {
            String[] strArr = this.mULightVectorName;
            if (i >= strArr.length) {
                this.mULightCount = GLES20.glGetUniformLocation(this.mProgram, this.mULightCountName);
                this.mUColor = GLES20.glGetUniformLocation(this.mProgram, this.mUColorName);
                this.mUOrigin = GLES20.glGetUniformLocation(this.mProgram, this.mUOriginName);
                this.mUViewShadowMatrix = GLES20.glGetUniformLocation(this.mProgram, this.mUViewShadowMatrixName);
                this.mUCoordScale = GLES20.glGetUniformLocation(this.mProgram, this.mUCoordScaleName);
                return;
            }
            this.mULightVector[i] = GLES20.glGetUniformLocation(this.mProgram, strArr[i]);
            this.mULightColor[i] = GLES20.glGetUniformLocation(this.mProgram, this.mULightColorName[i]);
            i++;
        }
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
        if (mesh instanceof BalloonSphere) {
            BalloonSphere balloonSphere = (BalloonSphere) mesh;
            BalloonSphere[] light = balloonSphere.getLight();
            for (int i = 0; i < balloonSphere.getLightCount(); i++) {
                GLES20.glUniform3fv(this.mULightVector[i], 1, light[i].getPos(), 0);
                GLES20.glUniform3fv(this.mULightColor[i], 1, light[i].getColor(), 0);
            }
            GLES20.glUniform1i(this.mULightCount, balloonSphere.getLightCount());
            GLES20.glUniform1f(this.mUCoordScale, 0.62f);
        } else {
            GLES20.glUniform1f(this.mUCoordScale, 0.44f);
        }
        super.updateMeshData(mesh);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateViewData(Camera camera) {
        float[] viewMatrix = camera.getViewMatrix();
        GLES20.glUniformMatrix4fv(this.mUProjMatrix, 1, false, camera.getProjectMatrix(), 0);
        GLES20.glUniformMatrix4fv(this.mUViewMatrix, 1, false, viewMatrix, 0);
        GLES20.glUniform3fv(this.mUViewPos, 1, camera.getPosition(), 0);
        GLES20.glUniformMatrix4fv(this.mUViewShadowMatrix, 1, false, ((CameraOrtho) camera).getViewShadowMatrix(), 0);
    }
}
