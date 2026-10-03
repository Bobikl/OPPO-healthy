package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SkinningBuffer {
    private long mNativeObject;

    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

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
                SkinningBuffer.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = SkinningBuffer.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public Builder boneCount(@IntRange(from = 1) int i) {
            SkinningBuffer.nBuilderBoneCount(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public SkinningBuffer build(@NonNull Engine engine) {
            long jNBuilderBuild = SkinningBuffer.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new SkinningBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create SkinningBuffer");
        }

        @NonNull
        public Builder initialize(boolean z) {
            SkinningBuffer.nBuilderInitialize(this.mNativeBuilder, z);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBoneCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderInitialize(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetBoneCount(long j);

    private static native int nSetBonesAsMatrices(long j, long j2, Buffer buffer, int i, int i2, int i3);

    private static native int nSetBonesAsQuaternions(long j, long j2, Buffer buffer, int i, int i2, int i3);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getBoneCount() {
        return nGetBoneCount(this.mNativeObject);
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed IndexBuffer");
    }

    public void setBonesAsMatrices(@NonNull Engine engine, @NonNull Buffer buffer, @IntRange(from = 0, to = 255) int i, @IntRange(from = 0) int i2) {
        if (nSetBonesAsMatrices(this.mNativeObject, engine.getNativeObject(), buffer, buffer.remaining(), i, i2) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void setBonesAsQuaternions(@NonNull Engine engine, @NonNull Buffer buffer, @IntRange(from = 0, to = 255) int i, @IntRange(from = 0) int i2) {
        if (nSetBonesAsQuaternions(this.mNativeObject, engine.getNativeObject(), buffer, buffer.remaining(), i, i2) < 0) {
            throw new BufferOverflowException();
        }
    }

    private SkinningBuffer(long j) {
        this.mNativeObject = j;
    }
}
