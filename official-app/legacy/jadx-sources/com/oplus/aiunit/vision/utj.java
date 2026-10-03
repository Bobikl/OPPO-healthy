package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/utj;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "<init>", "()V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class utj {
    public static final utj INSTANCE = new utj();

    public final int a(@Nullable Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] == 0) {
            return 0;
        }
        if (bitmap == null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            return 0;
        }
        if (bitmap.isRecycled()) {
            q0.INSTANCE.b("TextureUtil", "bitmap isRecycled");
            return 0;
        }
        GLES20.glBindTexture(k18.GL_TEXTURE_2D, iArr[0]);
        GLES20.glTexParameteri(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_MIN_FILTER, k18.GL_LINEAR_MIPMAP_LINEAR);
        GLES20.glTexParameteri(k18.GL_TEXTURE_2D, 10240, k18.GL_LINEAR);
        GLUtils.texImage2D(k18.GL_TEXTURE_2D, 0, bitmap, 0);
        GLES20.glGenerateMipmap(k18.GL_TEXTURE_2D);
        GLES20.glBindTexture(k18.GL_TEXTURE_2D, 0);
        return iArr[0];
    }
}
