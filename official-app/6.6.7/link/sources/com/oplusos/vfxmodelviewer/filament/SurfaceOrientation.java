package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.nio.Buffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SurfaceOrientation {
    private long mNativeObject;

    public static class Builder {
        private Buffer mNormals;
        private int mNormalsStride;
        private Buffer mPositions;
        private int mPositionsStride;
        private Buffer mTangents;
        private int mTangentsStride;
        private Buffer mTexCoords;
        private int mTexCoordsStride;
        private int mTriangleCount;
        private Buffer mTrianglesUint16;
        private Buffer mTrianglesUint32;
        private int mVertexCount;

        @NonNull
        public SurfaceOrientation build() {
            long jNCreateBuilder = SurfaceOrientation.nCreateBuilder();
            SurfaceOrientation.nBuilderVertexCount(jNCreateBuilder, this.mVertexCount);
            SurfaceOrientation.nBuilderTriangleCount(jNCreateBuilder, this.mTriangleCount);
            Buffer buffer = this.mNormals;
            if (buffer != null) {
                SurfaceOrientation.nBuilderNormals(jNCreateBuilder, buffer, buffer.remaining(), this.mNormalsStride);
            }
            Buffer buffer2 = this.mTangents;
            if (buffer2 != null) {
                SurfaceOrientation.nBuilderTangents(jNCreateBuilder, buffer2, buffer2.remaining(), this.mTangentsStride);
            }
            Buffer buffer3 = this.mTexCoords;
            if (buffer3 != null) {
                SurfaceOrientation.nBuilderUVs(jNCreateBuilder, buffer3, buffer3.remaining(), this.mTexCoordsStride);
            }
            Buffer buffer4 = this.mPositions;
            if (buffer4 != null) {
                SurfaceOrientation.nBuilderPositions(jNCreateBuilder, buffer4, buffer4.remaining(), this.mPositionsStride);
            }
            Buffer buffer5 = this.mTrianglesUint16;
            if (buffer5 != null) {
                SurfaceOrientation.nBuilderTriangles16(jNCreateBuilder, buffer5, buffer5.remaining());
            }
            Buffer buffer6 = this.mTrianglesUint32;
            if (buffer6 != null) {
                SurfaceOrientation.nBuilderTriangles32(jNCreateBuilder, buffer6, buffer6.remaining());
            }
            long jNBuilderBuild = SurfaceOrientation.nBuilderBuild(jNCreateBuilder);
            SurfaceOrientation.nDestroyBuilder(jNCreateBuilder);
            if (jNBuilderBuild != 0) {
                return new SurfaceOrientation(jNBuilderBuild);
            }
            throw new IllegalStateException("Could not create SurfaceOrientation");
        }

        @NonNull
        public Builder normals(@NonNull Buffer buffer) {
            this.mNormals = buffer;
            this.mNormalsStride = 0;
            return this;
        }

        @NonNull
        public Builder positions(@NonNull Buffer buffer) {
            this.mPositions = buffer;
            this.mPositionsStride = 0;
            return this;
        }

        @NonNull
        public Builder tangents(@NonNull Buffer buffer) {
            this.mTangents = buffer;
            this.mTangentsStride = 0;
            return this;
        }

        @NonNull
        public Builder triangleCount(int i) {
            this.mTriangleCount = i;
            return this;
        }

        @NonNull
        public Builder triangles_uint16(@NonNull Buffer buffer) {
            this.mTrianglesUint16 = buffer;
            return this;
        }

        @NonNull
        public Builder triangles_uint32(@NonNull Buffer buffer) {
            this.mTrianglesUint32 = buffer;
            return this;
        }

        @NonNull
        public Builder uvs(@NonNull Buffer buffer) {
            this.mTexCoords = buffer;
            this.mTexCoordsStride = 0;
            return this;
        }

        @NonNull
        public Builder vertexCount(@IntRange(from = 1) int i) {
            this.mVertexCount = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNormals(long j, Buffer buffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPositions(long j, Buffer buffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTangents(long j, Buffer buffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTriangleCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTriangles16(long j, Buffer buffer, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTriangles32(long j, Buffer buffer, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUVs(long j, Buffer buffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVertexCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    private static native void nDestroy(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native void nGetQuatsAsFloat(long j, Buffer buffer, int i);

    private static native void nGetQuatsAsHalf(long j, Buffer buffer, int i);

    private static native void nGetQuatsAsShort(long j, Buffer buffer, int i);

    private static native int nGetVertexCount(long j);

    public void destroy() {
        nDestroy(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed SurfaceOrientation");
    }

    @NonNull
    public void getQuatsAsFloat(@NonNull Buffer buffer) {
        nGetQuatsAsFloat(this.mNativeObject, buffer, buffer.remaining());
    }

    @NonNull
    public void getQuatsAsHalf(@NonNull Buffer buffer) {
        nGetQuatsAsHalf(this.mNativeObject, buffer, buffer.remaining());
    }

    @NonNull
    public void getQuatsAsShort(@NonNull Buffer buffer) {
        nGetQuatsAsShort(this.mNativeObject, buffer, buffer.remaining());
    }

    @IntRange(from = 0)
    public int getVertexCount() {
        return nGetVertexCount(this.mNativeObject);
    }

    private SurfaceOrientation(long j) {
        this.mNativeObject = j;
    }
}
