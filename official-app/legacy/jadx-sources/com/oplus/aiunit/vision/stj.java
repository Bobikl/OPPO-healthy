package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.heytap.wearable.support.watchface.gl.material.Texture;

/* JADX INFO: loaded from: classes2.dex */
public class stj extends Texture {
    public SurfaceTexture a() {
        GLES20.glActiveTexture(k18.GL_TEXTURE0);
        GLES20.glGenTextures(1, this.mTexture, 0);
        GLES20.glBindTexture(36197, this.mTexture[0]);
        return new SurfaceTexture(this.mTexture[0]);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.Texture
    public void activeTexture(int i) {
        GLES20.glActiveTexture(i + k18.GL_TEXTURE0);
        GLES20.glBindTexture(36197, this.mTexture[0]);
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.Texture
    public boolean isInitialized() {
        return this.mTexture[0] != 0;
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.Texture
    public void updateData(Bitmap bitmap) {
    }

    @Override // com.heytap.wearable.support.watchface.gl.material.Texture
    public void updateSubData(Bitmap bitmap) {
    }
}
