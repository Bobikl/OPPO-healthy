package com.heytap.wearable.support.watchface.gl;

import android.opengl.GLES20;
import com.heytap.wearable.support.watchface.gl.material.Texture;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.l18;

/* JADX INFO: loaded from: classes2.dex */
public class FrameBufferObject extends Texture {
    protected int[] mDepthRenderBuffers = new int[1];
    protected int[] mFrameBuffers = new int[1];

    /* JADX INFO: renamed from: com.heytap.wearable.support.watchface.gl.FrameBufferObject$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$heytap$wearable$support$watchface$gl$FrameBufferObject$FboBufferType;

        static {
            int[] iArr = new int[FboBufferType.values().length];
            $SwitchMap$com$heytap$wearable$support$watchface$gl$FrameBufferObject$FboBufferType = iArr;
            try {
                iArr[FboBufferType.FBO_SHORT565.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$heytap$wearable$support$watchface$gl$FrameBufferObject$FboBufferType[FboBufferType.FBO_BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$heytap$wearable$support$watchface$gl$FrameBufferObject$FboBufferType[FboBufferType.FBO_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum FboBufferType {
        FBO_SHORT565,
        FBO_BYTE,
        FBO_FLOAT
    }

    public void BeginRenderToTarget() {
        GLES20.glBindFramebuffer(k18.GL_FRAMEBUFFER, this.mFrameBuffers[0]);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
    }

    public void EndRenderToTarget() {
        GLES20.glBindFramebuffer(k18.GL_FRAMEBUFFER, 0);
    }

    public boolean init(int i, int i2) {
        return init(i, i2, FboBufferType.FBO_SHORT565);
    }

    public boolean init(int i, int i2, FboBufferType fboBufferType) {
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
        GLES20.glTexParameterf(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_WRAP_S, 33648.0f);
        GLES20.glTexParameterf(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_WRAP_T, 33648.0f);
        int i4 = AnonymousClass1.$SwitchMap$com$heytap$wearable$support$watchface$gl$FrameBufferObject$FboBufferType[fboBufferType.ordinal()];
        if (i4 == 1) {
            GLES20.glTexImage2D(k18.GL_TEXTURE_2D, 0, k18.GL_RGB, this.mWidth, this.mHeight, 0, k18.GL_RGB, k18.GL_UNSIGNED_SHORT_5_6_5, null);
        } else if (i4 == 2) {
            GLES20.glTexImage2D(k18.GL_TEXTURE_2D, 0, k18.GL_RGB, this.mWidth, this.mHeight, 0, k18.GL_RGB, 5121, null);
        } else if (i4 == 3) {
            GLES20.glTexImage2D(k18.GL_TEXTURE_2D, 0, l18.GL_RGB16F, this.mWidth, this.mHeight, 0, k18.GL_RGB, l18.GL_HALF_FLOAT, null);
        }
        GLES20.glFramebufferTexture2D(k18.GL_FRAMEBUFFER, k18.GL_COLOR_ATTACHMENT0, k18.GL_TEXTURE_2D, i3, 0);
        int[] iArr3 = this.mDepthRenderBuffers;
        if (iArr3[0] == 0) {
            GLES20.glGenRenderbuffers(1, iArr3, 0);
        }
        int i5 = this.mDepthRenderBuffers[0];
        GLES20.glBindRenderbuffer(k18.GL_RENDERBUFFER, i5);
        GLES20.glRenderbufferStorage(k18.GL_RENDERBUFFER, k18.GL_DEPTH_COMPONENT16, this.mWidth, this.mHeight);
        GLES20.glFramebufferRenderbuffer(k18.GL_FRAMEBUFFER, k18.GL_DEPTH_ATTACHMENT, k18.GL_RENDERBUFFER, i5);
        GLES20.glBindFramebuffer(k18.GL_FRAMEBUFFER, 0);
        return GLES20.glCheckFramebufferStatus(k18.GL_FRAMEBUFFER) == 36053;
    }
}
