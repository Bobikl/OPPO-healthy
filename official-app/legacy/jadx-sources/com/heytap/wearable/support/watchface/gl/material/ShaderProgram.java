package com.heytap.wearable.support.watchface.gl.material;

import android.opengl.GLES20;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import com.heytap.wearable.support.watchface.gl.Camera;
import com.heytap.wearable.support.watchface.gl.Disposable;
import com.heytap.wearable.support.watchface.gl.shape.Mesh;
import com.oplus.aiunit.vision.k18;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ShaderProgram implements Disposable {
    private static final String TAG = "ShaderProgram";
    protected int mProgram;
    protected Map<String, Integer> mUniformParamMap = new HashMap();

    private int loadShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, k18.GL_COMPILE_STATUS, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        SdkDebugLog.e(TAG, "Shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader) + Weather.SEPARATOR + str);
        GLES20.glDeleteShader(iGlCreateShader);
        return -1;
    }

    public Boolean create(String str, String str2) {
        int iLoadShader;
        int iLoadShader2 = loadShader(k18.GL_VERTEX_SHADER, str);
        if (iLoadShader2 >= 0 && (iLoadShader = loadShader(k18.GL_FRAGMENT_SHADER, str2)) >= 0) {
            int iGlCreateProgram = GLES20.glCreateProgram();
            this.mProgram = iGlCreateProgram;
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
            GLES20.glAttachShader(this.mProgram, iLoadShader);
            GLES20.glLinkProgram(this.mProgram);
            GLES20.glDeleteShader(iLoadShader2);
            GLES20.glDeleteShader(iLoadShader);
            init();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.heytap.wearable.support.watchface.gl.Disposable
    public void dispose() {
        GLES20.glDeleteProgram(this.mProgram);
        this.mProgram = 0;
    }

    public int getProgram() {
        return this.mProgram;
    }

    public int getUniformLocation(String str) {
        if (!this.mUniformParamMap.containsKey(str)) {
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgram, str);
            this.mUniformParamMap.put(str, Integer.valueOf(iGlGetUniformLocation));
            return iGlGetUniformLocation;
        }
        Integer num = this.mUniformParamMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        SdkDebugLog.d(TAG, "getUniformLocation don't have " + str);
        return 0;
    }

    public void init() {
    }

    public void setUniform(String str, float[] fArr) {
        GLES20.glUniform4fv(getUniformLocation(str), 1, fArr, 0);
    }

    public void setUniform1f(String str, float f) {
        GLES20.glUniform1f(getUniformLocation(str), f);
    }

    public void setUniform1i(String str, int i) {
        GLES20.glUniform1i(getUniformLocation(str), i);
    }

    public void setUniform2fv(String str, float[] fArr) {
        GLES20.glUniform2fv(getUniformLocation(str), 1, fArr, 0);
    }

    public void setUniform2iv(String str, int[] iArr) {
        GLES20.glUniform2iv(getUniformLocation(str), 1, iArr, 0);
    }

    public void setUniform4iv(String str, int[] iArr) {
        GLES20.glUniform4iv(getUniformLocation(str), 1, iArr, 0);
    }

    public void updateEdgeBlendParam(float[] fArr) {
    }

    public void updateLightParam() {
    }

    public void updateMeshData(Mesh mesh) {
    }

    public void updateModelMatrix(float[] fArr) {
    }

    public void updateParam(float[] fArr, int i) {
    }

    public void updateViewData(Camera camera) {
    }

    public void updateWorldMatrix(float[] fArr) {
    }

    public void useProgram() {
        GLES20.glUseProgram(this.mProgram);
    }
}
