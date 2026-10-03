package com.oplus.aiunit.vision;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/s68;", "", "", "array", "", "b", "", "attributeLocation", "c", "a", "[F", "()[F", "Ljava/nio/FloatBuffer;", "Ljava/nio/FloatBuffer;", "floatBuffer", "<init>", "()V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class s68 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final float[] array;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FloatBuffer floatBuffer;

    public s68() {
        float[] fArr = new float[8];
        this.array = fArr;
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        Intrinsics.checkExpressionValueIsNotNull(floatBufferPut, "ByteBuffer\n            .…)\n            .put(array)");
        this.floatBuffer = floatBufferPut;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float[] getArray() {
        return this.array;
    }

    public final void b(@NotNull float[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        this.floatBuffer.position(0);
        this.floatBuffer.put(array);
    }

    public final void c(int attributeLocation) {
        this.floatBuffer.position(0);
        GLES20.glVertexAttribPointer(attributeLocation, 2, k18.GL_FLOAT, false, 0, (Buffer) this.floatBuffer);
        GLES20.glEnableVertexAttribArray(attributeLocation);
    }
}
