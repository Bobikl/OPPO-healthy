package com.heytap.wearable.support.watchface.gl;

import android.opengl.GLES20;
import com.oplus.aiunit.vision.k18;

/* JADX INFO: loaded from: classes2.dex */
public class FrameBufferDepthObject extends FrameBufferObject {
    @Override // com.heytap.wearable.support.watchface.gl.FrameBufferObject
    public boolean init(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        int[] iArr = this.mFrameBuffers;
        if (iArr[0] == 0) {
            GLES20.glGenFramebuffers(1, iArr, 0);
        }
        GLES20.glBindFramebuffer(k18.GL_FRAMEBUFFER, this.mFrameBuffers[0]);
        int[] iArr2 = this.mTexture;
        if (iArr2[0] == 0) {
            GLES20.glGenTextures(1, iArr2, 0);
        }
        int i3 = this.mTexture[0];
        GLES20.glBindTexture(k18.GL_TEXTURE_2D, i3);
        GLES20.glTexParameterf(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_MIN_FILTER, 9728.0f);
        GLES20.glTexParameterf(k18.GL_TEXTURE_2D, 10240, 9728.0f);
        GLES20.glTexParameterf(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_WRAP_S, 33071.0f);
        GLES20.glTexParameterf(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_WRAP_T, 33071.0f);
        GLES20.glTexImage2D(k18.GL_TEXTURE_2D, 0, k18.GL_DEPTH_COMPONENT, this.mWidth, this.mHeight, 0, k18.GL_DEPTH_COMPONENT, 5123, null);
        GLES20.glFramebufferTexture2D(k18.GL_FRAMEBUFFER, k18.GL_DEPTH_ATTACHMENT, k18.GL_TEXTURE_2D, i3, 0);
        GLES20.glBindFramebuffer(k18.GL_FRAMEBUFFER, 0);
        return GLES20.glCheckFramebufferStatus(k18.GL_FRAMEBUFFER) == 36053;
    }
}
