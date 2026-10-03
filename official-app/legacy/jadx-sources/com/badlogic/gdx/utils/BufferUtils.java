package com.badlogic.gdx.utils;

import com.oplus.aiunit.vision.wg0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class BufferUtils {
    public static wg0<ByteBuffer> a = new wg0<>();
    public static int b = 0;

    public static void a(float[] fArr, Buffer buffer, int i, int i2) {
        if (buffer instanceof ByteBuffer) {
            buffer.limit(i << 2);
        } else if (buffer instanceof FloatBuffer) {
            buffer.limit(i);
        }
        copyJni(fArr, buffer, i, i2);
        buffer.position(0);
    }

    public static void b(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        synchronized (a) {
            if (!a.i(byteBuffer, true)) {
                throw new IllegalArgumentException("buffer not allocated with newUnsafeByteBuffer or already disposed");
            }
        }
        b -= iCapacity;
        freeMemory(byteBuffer);
    }

    public static ByteBuffer c(int i) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        return byteBufferAllocateDirect;
    }

    private static native void copyJni(float[] fArr, Buffer buffer, int i, int i2);

    public static FloatBuffer d(int i) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        return byteBufferAllocateDirect.asFloatBuffer();
    }

    public static IntBuffer e(int i) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        return byteBufferAllocateDirect.asIntBuffer();
    }

    public static ByteBuffer f(int i) {
        ByteBuffer byteBufferNewDisposableByteBuffer = newDisposableByteBuffer(i);
        byteBufferNewDisposableByteBuffer.order(ByteOrder.nativeOrder());
        b += i;
        synchronized (a) {
            a.a(byteBufferNewDisposableByteBuffer);
        }
        return byteBufferNewDisposableByteBuffer;
    }

    private static native void freeMemory(ByteBuffer byteBuffer);

    private static native ByteBuffer newDisposableByteBuffer(int i);
}
