package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: loaded from: classes9.dex */
public class IndexBuffer {
    private long mNativeObject;

    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        public static class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j2) {
                this.mNativeObject = j2;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                IndexBuffer.nDestroyBuilder(this.mNativeObject);
            }
        }

        public enum IndexType {
            USHORT,
            UINT
        }

        public Builder() {
            long jNCreateBuilder = IndexBuffer.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public Builder bufferType(@NonNull IndexType indexType) {
            IndexBuffer.nBuilderBufferType(this.mNativeBuilder, indexType.ordinal());
            return this;
        }

        @NonNull
        public IndexBuffer build(@NonNull Engine engine) {
            long jNBuilderBuild = IndexBuffer.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new IndexBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create IndexBuffer");
        }

        @NonNull
        public Builder indexCount(@IntRange(from = 1) int i) {
            IndexBuffer.nBuilderIndexCount(this.mNativeBuilder, i);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBufferType(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIndexCount(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j2);

    private static native int nGetIndexCount(long j2);

    private static native int nSetBuffer(long j2, long j3, Buffer buffer, int i, int i2, int i3, Object obj, Runnable runnable);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    @IntRange(from = 0)
    public int getIndexCount() {
        return nGetIndexCount(getNativeObject());
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed IndexBuffer");
    }

    public void setBuffer(@NonNull Engine engine, @NonNull Buffer buffer) {
        setBuffer(engine, buffer, 0, 0, null, null);
    }

    private IndexBuffer(long j2) {
        this.mNativeObject = j2;
    }

    public void setBuffer(@NonNull Engine engine, @NonNull Buffer buffer, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        setBuffer(engine, buffer, i, i2, null, null);
    }

    public void setBuffer(@NonNull Engine engine, @NonNull Buffer buffer, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @Nullable Object obj, @Nullable Runnable runnable) {
        if (nSetBuffer(getNativeObject(), engine.getNativeObject(), buffer, buffer.remaining(), i, i2 == 0 ? buffer.remaining() : i2, obj, runnable) < 0) {
            throw new BufferOverflowException();
        }
    }
}
