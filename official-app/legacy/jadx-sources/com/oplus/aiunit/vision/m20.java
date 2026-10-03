package com.oplus.aiunit.vision;

import android.opengl.GLES30;
import java.nio.Buffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class m20 extends l20 implements l18 {
    @Override // com.oplus.aiunit.vision.l18
    public void F(int i, IntBuffer intBuffer) {
        GLES30.glDeleteVertexArrays(i, intBuffer);
    }

    @Override // com.oplus.aiunit.vision.l18
    public void Z(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Buffer buffer) {
        if (buffer == null) {
            GLES30.glTexImage3D(i, i2, i3, i4, i5, i6, i7, i8, i9, 0);
        } else {
            GLES30.glTexImage3D(i, i2, i3, i4, i5, i6, i7, i8, i9, buffer);
        }
    }

    @Override // com.oplus.aiunit.vision.l18
    public void e(int i) {
        GLES30.glBindVertexArray(i);
    }

    @Override // com.oplus.aiunit.vision.l18
    public void x(int i, IntBuffer intBuffer) {
        GLES30.glGenVertexArrays(i, intBuffer);
    }
}
