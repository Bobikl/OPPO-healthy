package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class RenderTarget {
    private static final int ATTACHMENT_COUNT = AttachmentPoint.values().length;
    private long mNativeObject;
    private final Texture[] mTextures;

    public enum AttachmentPoint {
        COLOR,
        COLOR1,
        COLOR2,
        COLOR3,
        COLOR4,
        COLOR5,
        COLOR6,
        COLOR7,
        DEPTH
    }

    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;
        private final Texture[] mTextures = new Texture[RenderTarget.ATTACHMENT_COUNT];

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
                RenderTarget.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = RenderTarget.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public RenderTarget build(@NonNull Engine engine) {
            long jNBuilderBuild = RenderTarget.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new RenderTarget(jNBuilderBuild, this);
            }
            throw new IllegalStateException("Couldn't create RenderTarget");
        }

        @NonNull
        public Builder face(@NonNull AttachmentPoint attachmentPoint, Texture.CubemapFace cubemapFace) {
            RenderTarget.nBuilderFace(this.mNativeBuilder, attachmentPoint.ordinal(), cubemapFace.ordinal());
            return this;
        }

        @NonNull
        public Builder layer(@NonNull AttachmentPoint attachmentPoint, @IntRange(from = 0) int i) {
            RenderTarget.nBuilderLayer(this.mNativeBuilder, attachmentPoint.ordinal(), i);
            return this;
        }

        @NonNull
        public Builder mipLevel(@NonNull AttachmentPoint attachmentPoint, @IntRange(from = 0) int i) {
            RenderTarget.nBuilderMipLevel(this.mNativeBuilder, attachmentPoint.ordinal(), i);
            return this;
        }

        @NonNull
        public Builder texture(@NonNull AttachmentPoint attachmentPoint, @Nullable Texture texture) {
            this.mTextures[attachmentPoint.ordinal()] = texture;
            RenderTarget.nBuilderTexture(this.mNativeBuilder, attachmentPoint.ordinal(), texture != null ? texture.getNativeObject() : 0L);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFace(long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLayer(long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMipLevel(long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTexture(long j2, int i, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j2);

    private static native int nGetFace(long j2, int i);

    private static native int nGetLayer(long j2, int i);

    private static native int nGetMipLevel(long j2, int i);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public Texture.CubemapFace getFace(AttachmentPoint attachmentPoint) {
        return Texture.CubemapFace.values()[nGetFace(getNativeObject(), attachmentPoint.ordinal())];
    }

    @IntRange(from = 0)
    public int getLayer(@NonNull AttachmentPoint attachmentPoint) {
        return nGetLayer(getNativeObject(), attachmentPoint.ordinal());
    }

    @IntRange(from = 0)
    public int getMipLevel(@NonNull AttachmentPoint attachmentPoint) {
        return nGetMipLevel(getNativeObject(), attachmentPoint.ordinal());
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed RenderTarget");
    }

    @Nullable
    public Texture getTexture(@NonNull AttachmentPoint attachmentPoint) {
        return this.mTextures[attachmentPoint.ordinal()];
    }

    private RenderTarget(long j2, Builder builder) {
        int i = ATTACHMENT_COUNT;
        Texture[] textureArr = new Texture[i];
        this.mTextures = textureArr;
        this.mNativeObject = j2;
        System.arraycopy(builder.mTextures, 0, textureArr, 0, i);
    }
}
