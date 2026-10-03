package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class BufferObject {
    private long mNativeObject;

    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        public enum BindingType {
            VERTEX
        }

        public static class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j) {
                this.mNativeObject = j;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                BufferObject.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = BufferObject.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public Builder bindingType(@NonNull BindingType bindingType) {
            BufferObject.nBuilderBindingType(this.mNativeBuilder, bindingType.ordinal());
            return this;
        }

        @NonNull
        public BufferObject build(@NonNull Engine engine) {
            long jNBuilderBuild = BufferObject.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new BufferObject(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create BufferObject");
        }

        @NonNull
        public Builder size(@IntRange(from = 1) int i) {
            BufferObject.nBuilderSize(this.mNativeBuilder, i);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBindingType(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSize(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetByteCount(long j);

    private static native int nSetBuffer(long j, long j2, Buffer buffer, int i, int i2, int i3, Object obj, Runnable runnable);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    @IntRange(from = 0)
    public int getByteCount() {
        return nGetByteCount(getNativeObject());
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed BufferObject");
    }

    public void setBuffer(@NonNull Engine engine, @NonNull Buffer buffer) {
        setBuffer(engine, buffer, 0, 0, null, null);
    }

    private BufferObject(long j) {
        this.mNativeObject = j;
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
