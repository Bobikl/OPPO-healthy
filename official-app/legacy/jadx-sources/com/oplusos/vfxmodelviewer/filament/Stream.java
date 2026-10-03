package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes9.dex */
public class Stream {
    private long mNativeEngine;
    private long mNativeObject;

    public enum StreamType {
        NATIVE,
        TEXTURE_ID,
        ACQUIRED
    }

    public Stream(long j2, Engine engine) {
        this.mNativeObject = j2;
        this.mNativeEngine = engine.getNativeObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHeight(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderStream(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderStreamSource(long j2, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWidth(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j2);

    private static native int nGetStreamType(long j2);

    private static native long nGetTimestamp(long j2);

    private static native int nReadPixels(long j2, long j3, int i, int i2, int i3, int i4, Buffer buffer, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj, Runnable runnable);

    private static native void nSetAcquiredImage(long j2, long j3, Object obj, Object obj2, Runnable runnable);

    private static native void nSetDimensions(long j2, int i, int i2);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed Stream");
    }

    public StreamType getStreamType() {
        return StreamType.values()[nGetStreamType(getNativeObject())];
    }

    public long getTimestamp() {
        return nGetTimestamp(getNativeObject());
    }

    public void readPixels(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @NonNull Texture.PixelBufferDescriptor pixelBufferDescriptor) {
        if (pixelBufferDescriptor.storage.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        long nativeObject = getNativeObject();
        long j2 = this.mNativeEngine;
        Buffer buffer = pixelBufferDescriptor.storage;
        if (nReadPixels(nativeObject, j2, i, i2, i3, i4, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void setAcquiredImage(Object obj, Object obj2, Runnable runnable) {
        nSetAcquiredImage(getNativeObject(), this.mNativeEngine, obj, obj2, runnable);
    }

    public void setDimensions(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        nSetDimensions(getNativeObject(), i, i2);
    }

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
                Stream.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = Stream.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public Stream build(@NonNull Engine engine) {
            long jNBuilderBuild = Stream.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new Stream(jNBuilderBuild, engine);
            }
            throw new IllegalStateException("Couldn't create Stream");
        }

        @NonNull
        public Builder height(int i) {
            Stream.nBuilderHeight(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public Builder stream(@NonNull Object obj) {
            if (Platform.get().validateStreamSource(obj)) {
                Stream.nBuilderStreamSource(this.mNativeBuilder, obj);
                return this;
            }
            throw new IllegalArgumentException("Invalid stream source: " + obj);
        }

        @NonNull
        public Builder width(int i) {
            Stream.nBuilderWidth(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder stream(long j2) {
            Stream.nBuilderStream(this.mNativeBuilder, j2);
            return this;
        }
    }
}
