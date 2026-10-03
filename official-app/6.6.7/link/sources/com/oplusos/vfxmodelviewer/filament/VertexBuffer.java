package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class VertexBuffer {
    private long mNativeObject;

    public enum AttributeType {
        BYTE,
        BYTE2,
        BYTE3,
        BYTE4,
        UBYTE,
        UBYTE2,
        UBYTE3,
        UBYTE4,
        SHORT,
        SHORT2,
        SHORT3,
        SHORT4,
        USHORT,
        USHORT2,
        USHORT3,
        USHORT4,
        INT,
        UINT,
        FLOAT,
        FLOAT2,
        FLOAT3,
        FLOAT4,
        HALF,
        HALF2,
        HALF3,
        HALF4
    }

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
                VertexBuffer.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = VertexBuffer.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public Builder attribute(@NonNull VertexAttribute vertexAttribute, @IntRange(from = 0) int i, @NonNull AttributeType attributeType, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
            VertexBuffer.nBuilderAttribute(this.mNativeBuilder, vertexAttribute.ordinal(), i, attributeType.ordinal(), i2, i3);
            return this;
        }

        @NonNull
        public Builder bufferCount(@IntRange(from = 1) int i) {
            VertexBuffer.nBuilderBufferCount(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public VertexBuffer build(@NonNull Engine engine) {
            long jNBuilderBuild = VertexBuffer.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new VertexBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create VertexBuffer");
        }

        @NonNull
        public Builder enableBufferObjects(boolean z) {
            VertexBuffer.nBuilderEnableBufferObjects(this.mNativeBuilder, z);
            return this;
        }

        @NonNull
        public Builder normalized(@NonNull VertexAttribute vertexAttribute) {
            VertexBuffer.nBuilderNormalized(this.mNativeBuilder, vertexAttribute.ordinal(), true);
            return this;
        }

        @NonNull
        public Builder vertexCount(@IntRange(from = 1) int i) {
            VertexBuffer.nBuilderVertexCount(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public Builder normalized(@NonNull VertexAttribute vertexAttribute, boolean z) {
            VertexBuffer.nBuilderNormalized(this.mNativeBuilder, vertexAttribute.ordinal(), z);
            return this;
        }

        @NonNull
        public Builder attribute(@NonNull VertexAttribute vertexAttribute, @IntRange(from = 0) int i, @NonNull AttributeType attributeType) {
            return attribute(vertexAttribute, i, attributeType, 0, 0);
        }
    }

    public enum VertexAttribute {
        POSITION,
        TANGENTS,
        COLOR,
        UV0,
        UV1,
        BONE_INDICES,
        BONE_WEIGHTS,
        UNUSED,
        CUSTOM0,
        CUSTOM1,
        CUSTOM2,
        CUSTOM3,
        CUSTOM4,
        CUSTOM5,
        CUSTOM6,
        CUSTOM7
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderAttribute(long j, int i, int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBufferCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderEnableBufferObjects(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNormalized(long j, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVertexCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetVertexCount(long j);

    private static native int nSetBufferAt(long j, long j2, int i, Buffer buffer, int i2, int i3, int i4, Object obj, Runnable runnable);

    private static native void nSetBufferObjectAt(long j, long j2, int i, long j3);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed VertexBuffer");
    }

    @IntRange(from = 0)
    public int getVertexCount() {
        return nGetVertexCount(getNativeObject());
    }

    public void setBufferAt(@NonNull Engine engine, int i, @NonNull Buffer buffer) {
        setBufferAt(engine, i, buffer, 0, 0, null, null);
    }

    public void setBufferObjectAt(@NonNull Engine engine, int i, @NonNull BufferObject bufferObject) {
        nSetBufferObjectAt(getNativeObject(), engine.getNativeObject(), i, bufferObject.getNativeObject());
    }

    private VertexBuffer(long j) {
        this.mNativeObject = j;
    }

    public void setBufferAt(@NonNull Engine engine, int i, @NonNull Buffer buffer, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
        setBufferAt(engine, i, buffer, i2, i3, null, null);
    }

    public void setBufferAt(@NonNull Engine engine, int i, @NonNull Buffer buffer, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @Nullable Object obj, @Nullable Runnable runnable) {
        if (nSetBufferAt(getNativeObject(), engine.getNativeObject(), i, buffer, buffer.remaining(), i2, i3 == 0 ? buffer.remaining() : i3, obj, runnable) < 0) {
            throw new BufferOverflowException();
        }
    }
}
