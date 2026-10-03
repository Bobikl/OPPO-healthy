package com.heytap.wearable.support.watchface.gl.material;

import android.opengl.GLES20;
import com.heytap.wearable.support.watchface.gl.shape.Mesh;
import com.oplus.aiunit.vision.k18;

/* JADX INFO: loaded from: classes2.dex */
public class ShaderProgram3DColor extends ShaderProgram3D {
    private int mAColor;
    private int mUBaseColor;
    private String mUBaseColorName = "uBaseColor";
    private String mAVertexColorName = "aColor";

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void init() {
        super.init();
        this.mUBaseColor = GLES20.glGetUniformLocation(this.mProgram, this.mUBaseColorName);
        this.mAColor = GLES20.glGetAttribLocation(this.mProgram, this.mAVertexColorName);
    }

    public void updateColor(float f, float f2, float f3, float f4) {
        GLES20.glUniform4f(this.mUBaseColor, f, f2, f3, f4);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateMeshData(Mesh mesh) {
        super.updateMeshData(mesh);
        GLES20.glEnableVertexAttribArray(this.mAColor);
        GLES20.glVertexAttribPointer(this.mAColor, 4, k18.GL_FLOAT, false, 0, mesh.getVertexCount() * 5 * 4);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D, com.heytap.wearable.support.watchface.gl.material.ShaderProgram
    public void updateWorldMatrix(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.mUWorldMatrix, 1, false, fArr, 0);
    }
}
