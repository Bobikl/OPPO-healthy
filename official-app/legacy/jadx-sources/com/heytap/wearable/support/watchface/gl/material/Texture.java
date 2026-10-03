package com.heytap.wearable.support.watchface.gl.material;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import com.heytap.wearable.support.watchface.gl.Disposable;
import com.oplus.aiunit.vision.k18;

/* JADX INFO: loaded from: classes2.dex */
public class Texture implements Disposable {
    private static final String TAG = "Texture";
    private static final int TEXTURE_INVALID_ID = 0;
    protected int[] mTexture = {0};
    protected int mWidth = 0;
    protected int mHeight = 0;

    public void activeTexture(int i) {
        GLES20.glActiveTexture(i + k18.GL_TEXTURE0);
        GLES20.glBindTexture(k18.GL_TEXTURE_2D, this.mTexture[0]);
    }

    @Override // com.heytap.wearable.support.watchface.gl.Disposable
    public void dispose() {
        GLES20.glDeleteTextures(1, this.mTexture, 0);
        this.mTexture[0] = 0;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getTextureId() {
        return this.mTexture[0];
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isInitialized() {
        return this.mTexture[0] != 0;
    }

    public void updateData(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            SdkDebugLog.e(TAG, "updateData: bitmap is empty");
            return;
        }
        this.mWidth = bitmap.getWidth();
        this.mHeight = bitmap.getHeight();
        int[] iArr = this.mTexture;
        if (iArr[0] > 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
        }
        GLES20.glGenTextures(1, this.mTexture, 0);
        GLES20.glBindTexture(k18.GL_TEXTURE_2D, this.mTexture[0]);
        GLES20.glTexParameterf(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_MIN_FILTER, 9729.0f);
        GLES20.glTexParameterf(k18.GL_TEXTURE_2D, 10240, 9729.0f);
        GLES20.glTexParameterf(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_WRAP_S, 10497.0f);
        GLES20.glTexParameterf(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_WRAP_T, 10497.0f);
        GLUtils.texImage2D(k18.GL_TEXTURE_2D, 0, bitmap, 0);
        SdkDebugLog.d(TAG, "updateData");
    }

    public void updateSubData(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            SdkDebugLog.e(TAG, "updateSubData: bitmap is empty");
            return;
        }
        GLES20.glBindTexture(k18.GL_TEXTURE_2D, this.mTexture[0]);
        GLUtils.texSubImage2D(k18.GL_TEXTURE_2D, 0, 0, 0, bitmap);
        SdkDebugLog.d(TAG, "updateSubData");
    }
}
