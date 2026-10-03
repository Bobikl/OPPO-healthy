package com.heytap.wearable.support.watchface.gl.material;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.l18;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class TextureArray extends Texture {
    private static final String TAG = "TextureArray";
    protected int mDepth = 0;
    private Lock mListLock = new ReentrantLock();
    protected Map<Integer, Bitmap> mBitMapList = new HashMap();
    private boolean mReady = false;
    private int mLoadNum = 0;
    private int mUpdateState = 0;

    private void update() {
        this.mListLock.lock();
        Iterator<Map.Entry<Integer, Bitmap>> it = this.mBitMapList.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<Integer, Bitmap> next = it.next();
            Integer key = next.getKey();
            updateArrayData(next.getValue(), key.intValue(), 0);
            this.mBitMapList.remove(key);
            this.mLoadNum++;
        }
        this.mListLock.unlock();
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.Texture
    public void activeTexture(int i) {
        GLES20.glActiveTexture(i + k18.GL_TEXTURE0);
        GLES20.glBindTexture(l18.GL_TEXTURE_2D_ARRAY, this.mTexture[0]);
        if (!this.mReady) {
            update();
        }
        for (int iGlGetError = GLES20.glGetError(); iGlGetError != 0; iGlGetError = GLES20.glGetError()) {
            SdkDebugLog.d(TAG, "checkGLError" + iGlGetError);
        }
    }

    public void init(int i, int i2, int i3) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mDepth = i3;
        GLES20.glGenTextures(1, this.mTexture, 0);
        GLES20.glBindTexture(l18.GL_TEXTURE_2D_ARRAY, this.mTexture[0]);
        GLES20.glTexParameterf(l18.GL_TEXTURE_2D_ARRAY, k18.GL_TEXTURE_MIN_FILTER, 9987.0f);
        GLES20.glTexParameterf(l18.GL_TEXTURE_2D_ARRAY, 10240, 9987.0f);
        GLES20.glTexParameterf(l18.GL_TEXTURE_2D_ARRAY, k18.GL_TEXTURE_WRAP_S, 33071.0f);
        GLES20.glTexParameterf(l18.GL_TEXTURE_2D_ARRAY, k18.GL_TEXTURE_WRAP_T, 33071.0f);
        GLES30.glTexStorage3D(l18.GL_TEXTURE_2D_ARRAY, 3, l18.GL_RGBA8, this.mWidth, this.mHeight, this.mDepth);
    }

    public boolean isElementReady(int i) {
        return ((this.mUpdateState >> i) & 1) == 1;
    }

    public boolean isReady() {
        if (this.mLoadNum == this.mDepth) {
            this.mReady = true;
        } else {
            update();
        }
        return this.mReady;
    }

    public void reSet() {
        this.mReady = false;
        this.mLoadNum = 0;
        this.mListLock.lock();
        this.mBitMapList.clear();
        this.mListLock.unlock();
        this.mUpdateState = 0;
    }

    public void updateArrayData(Bitmap bitmap, int i, int i2) {
        this.mUpdateState |= 1 << i;
        int iPow = (int) Math.pow(2.0d, i2);
        int i3 = this.mWidth / iPow;
        int i4 = this.mHeight / iPow;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i3 * i4 * 4);
        if (bitmap != null) {
            bitmap.copyPixelsToBuffer(byteBufferAllocateDirect);
        }
        byteBufferAllocateDirect.position(0);
        if (bitmap == null || bitmap.isRecycled()) {
            SdkDebugLog.e(TAG, "updateSubData: bitmap is empty");
        } else {
            GLES20.glBindTexture(l18.GL_TEXTURE_2D_ARRAY, this.mTexture[0]);
            GLES30.glTexSubImage3D(l18.GL_TEXTURE_2D_ARRAY, i2, 0, 0, i, i3, i4, 1, k18.GL_RGBA, 5121, byteBufferAllocateDirect);
            SdkDebugLog.d(TAG, "updateSubData");
        }
        GLES20.glGenerateMipmap(l18.GL_TEXTURE_2D_ARRAY);
        for (int iGlGetError = GLES20.glGetError(); iGlGetError != 0; iGlGetError = GLES20.glGetError()) {
            SdkDebugLog.d(TAG, "checkGLError" + iGlGetError);
        }
    }

    public void updateBitmap(Bitmap bitmap, int i, int i2) {
        this.mListLock.lock();
        this.mBitMapList.put(Integer.valueOf(i), bitmap);
        this.mListLock.unlock();
        for (int iGlGetError = GLES20.glGetError(); iGlGetError != 0; iGlGetError = GLES20.glGetError()) {
            SdkDebugLog.d(TAG, "checkGLError" + iGlGetError);
        }
    }
}
