package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;
import com.oplusos.vfxmodelviewer.filament.proguard.UsedByNative;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@UsedByNative("NioUtils.cpp")
final class NioUtils {

    public enum BufferType {
        BYTE,
        CHAR,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE
    }

    private NioUtils() {
    }

    @UsedByNative("NioUtils.cpp")
    public static Object getBaseArray(@NonNull Buffer buffer) {
        if (buffer.hasArray()) {
            return buffer.array();
        }
        return null;
    }

    @UsedByNative("NioUtils.cpp")
    public static int getBaseArrayOffset(@NonNull Buffer buffer, int i) {
        if (buffer.hasArray()) {
            return (buffer.arrayOffset() + buffer.position()) << i;
        }
        return 0;
    }

    @UsedByNative("NioUtils.cpp")
    public static long getBasePointer(@NonNull Buffer buffer, long j, int i) {
        if (j != 0) {
            return ((long) (buffer.position() << i)) + j;
        }
        return 0L;
    }

    @UsedByNative("NioUtils.cpp")
    public static int getBufferType(@NonNull Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return BufferType.BYTE.ordinal();
        }
        if (buffer instanceof CharBuffer) {
            return BufferType.CHAR.ordinal();
        }
        if (buffer instanceof ShortBuffer) {
            return BufferType.SHORT.ordinal();
        }
        if (buffer instanceof IntBuffer) {
            return BufferType.INT.ordinal();
        }
        if (buffer instanceof LongBuffer) {
            return BufferType.LONG.ordinal();
        }
        return buffer instanceof FloatBuffer ? BufferType.FLOAT.ordinal() : BufferType.DOUBLE.ordinal();
    }
}
