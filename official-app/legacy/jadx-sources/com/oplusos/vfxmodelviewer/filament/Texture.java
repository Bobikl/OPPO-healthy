package com.oplusos.vfxmodelviewer.filament;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import com.oplusos.vfxmodelviewer.filament.proguard.UsedByReflection;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class Texture {
    public static final int BASE_LEVEL = 0;
    private long mNativeObject;

    /* JADX INFO: renamed from: com.oplusos.vfxmodelviewer.filament.Texture$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format;
        static final /* synthetic */ int[] $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type = iArr;
            try {
                iArr[Type.UBYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[Type.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[Type.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[Type.USHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[Type.SHORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[Type.HALF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[Type.UINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[Type.INT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[Type.FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[Type.UINT_10F_11F_11F_REV.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[Type.USHORT_565.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[Format.values().length];
            $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format = iArr2;
            try {
                iArr2[Format.R.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.R_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.DEPTH_COMPONENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.RG.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.RG_INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.DEPTH_STENCIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.STENCIL_INDEX.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.RGB.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.RGB_INTEGER.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.RGBA.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[Format.RGBA_INTEGER.ordinal()] = 12;
            } catch (NoSuchFieldError unused23) {
            }
        }
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
                Texture.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = Texture.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public Texture build(@NonNull Engine engine) {
            long jNBuilderBuild = Texture.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new Texture(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Texture");
        }

        @NonNull
        public Builder depth(@IntRange(from = 1) int i) {
            Texture.nBuilderDepth(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public Builder format(@NonNull InternalFormat internalFormat) {
            Texture.nBuilderFormat(this.mNativeBuilder, internalFormat.ordinal());
            return this;
        }

        @NonNull
        public Builder height(@IntRange(from = 1) int i) {
            Texture.nBuilderHeight(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public Builder importTexture(long j2) {
            Texture.nBuilderImportTexture(this.mNativeBuilder, j2);
            return this;
        }

        @NonNull
        public Builder levels(@IntRange(from = 1) int i) {
            Texture.nBuilderLevels(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public Builder sampler(@NonNull Sampler sampler) {
            Texture.nBuilderSampler(this.mNativeBuilder, sampler.ordinal());
            return this;
        }

        @NonNull
        public Builder swizzle(@NonNull Swizzle swizzle, @NonNull Swizzle swizzle2, @NonNull Swizzle swizzle3, @NonNull Swizzle swizzle4) {
            Texture.nBuilderSwizzle(this.mNativeBuilder, swizzle.ordinal(), swizzle2.ordinal(), swizzle3.ordinal(), swizzle4.ordinal());
            return this;
        }

        @NonNull
        public Builder usage(int i) {
            Texture.nBuilderUsage(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public Builder width(@IntRange(from = 1) int i) {
            Texture.nBuilderWidth(this.mNativeBuilder, i);
            return this;
        }
    }

    public enum CompressedFormat {
        EAC_R11,
        EAC_R11_SIGNED,
        EAC_RG11,
        EAC_RG11_SIGNED,
        ETC2_RGB8,
        ETC2_SRGB8,
        ETC2_RGB8_A1,
        ETC2_SRGB8_A1,
        ETC2_EAC_RGBA8,
        ETC2_EAC_SRGBA8,
        DXT1_RGB,
        DXT1_RGBA,
        DXT3_RGBA,
        DXT5_RGBA,
        DXT1_SRGB,
        DXT1_SRGBA,
        DXT3_SRGBA,
        DXT5_SRGBA,
        RGBA_ASTC_4x4,
        RGBA_ASTC_5x4,
        RGBA_ASTC_5x5,
        RGBA_ASTC_6x5,
        RGBA_ASTC_6x6,
        RGBA_ASTC_8x5,
        RGBA_ASTC_8x6,
        RGBA_ASTC_8x8,
        RGBA_ASTC_10x5,
        RGBA_ASTC_10x6,
        RGBA_ASTC_10x8,
        RGBA_ASTC_10x10,
        RGBA_ASTC_12x10,
        RGBA_ASTC_12x12,
        SRGB8_ALPHA8_ASTC_4x4,
        SRGB8_ALPHA8_ASTC_5x4,
        SRGB8_ALPHA8_ASTC_5x5,
        SRGB8_ALPHA8_ASTC_6x5,
        SRGB8_ALPHA8_ASTC_6x6,
        SRGB8_ALPHA8_ASTC_8x5,
        SRGB8_ALPHA8_ASTC_8x6,
        SRGB8_ALPHA8_ASTC_8x8,
        SRGB8_ALPHA8_ASTC_10x5,
        SRGB8_ALPHA8_ASTC_10x6,
        SRGB8_ALPHA8_ASTC_10x8,
        SRGB8_ALPHA8_ASTC_10x10,
        SRGB8_ALPHA8_ASTC_12x10,
        SRGB8_ALPHA8_ASTC_12x12
    }

    public enum CubemapFace {
        POSITIVE_X,
        NEGATIVE_X,
        POSITIVE_Y,
        NEGATIVE_Y,
        POSITIVE_Z,
        NEGATIVE_Z
    }

    public enum Format {
        R,
        R_INTEGER,
        RG,
        RG_INTEGER,
        RGB,
        RGB_INTEGER,
        RGBA,
        RGBA_INTEGER,
        UNUSED,
        DEPTH_COMPONENT,
        DEPTH_STENCIL,
        STENCIL_INDEX,
        ALPHA
    }

    public enum InternalFormat {
        R8,
        R8_SNORM,
        R8UI,
        R8I,
        STENCIL8,
        R16F,
        R16UI,
        R16I,
        RG8,
        RG8_SNORM,
        RG8UI,
        RG8I,
        RGB565,
        RGB9_E5,
        RGB5_A1,
        RGBA4,
        DEPTH16,
        RGB8,
        SRGB8,
        RGB8_SNORM,
        RGB8UI,
        RGB8I,
        DEPTH24,
        R32F,
        R32UI,
        R32I,
        RG16F,
        RG16UI,
        RG16I,
        R11F_G11F_B10F,
        RGBA8,
        SRGB8_A8,
        RGBA8_SNORM,
        UNUSED,
        RGB10_A2,
        RGBA8UI,
        RGBA8I,
        DEPTH32F,
        DEPTH24_STENCIL8,
        DEPTH32F_STENCIL8,
        RGB16F,
        RGB16UI,
        RGB16I,
        RG32F,
        RG32UI,
        RG32I,
        RGBA16F,
        RGBA16UI,
        RGBA16I,
        RGB32F,
        RGB32UI,
        RGB32I,
        RGBA32F,
        RGBA32UI,
        RGBA32I,
        EAC_R11,
        EAC_R11_SIGNED,
        EAC_RG11,
        EAC_RG11_SIGNED,
        ETC2_RGB8,
        ETC2_SRGB8,
        ETC2_RGB8_A1,
        ETC2_SRGB8_A1,
        ETC2_EAC_RGBA8,
        ETC2_EAC_SRGBA8,
        DXT1_RGB,
        DXT1_RGBA,
        DXT3_RGBA,
        DXT5_RGBA,
        DXT1_SRGB,
        DXT1_SRGBA,
        DXT3_SRGBA,
        DXT5_SRGBA,
        RGBA_ASTC_4x4,
        RGBA_ASTC_5x4,
        RGBA_ASTC_5x5,
        RGBA_ASTC_6x5,
        RGBA_ASTC_6x6,
        RGBA_ASTC_8x5,
        RGBA_ASTC_8x6,
        RGBA_ASTC_8x8,
        RGBA_ASTC_10x5,
        RGBA_ASTC_10x6,
        RGBA_ASTC_10x8,
        RGBA_ASTC_10x10,
        RGBA_ASTC_12x10,
        RGBA_ASTC_12x12,
        SRGB8_ALPHA8_ASTC_4x4,
        SRGB8_ALPHA8_ASTC_5x4,
        SRGB8_ALPHA8_ASTC_5x5,
        SRGB8_ALPHA8_ASTC_6x5,
        SRGB8_ALPHA8_ASTC_6x6,
        SRGB8_ALPHA8_ASTC_8x5,
        SRGB8_ALPHA8_ASTC_8x6,
        SRGB8_ALPHA8_ASTC_8x8,
        SRGB8_ALPHA8_ASTC_10x5,
        SRGB8_ALPHA8_ASTC_10x6,
        SRGB8_ALPHA8_ASTC_10x8,
        SRGB8_ALPHA8_ASTC_10x10,
        SRGB8_ALPHA8_ASTC_12x10,
        SRGB8_ALPHA8_ASTC_12x12
    }

    public static class PrefilterOptions {
        public int sampleCount = 8;

        /* JADX INFO: renamed from: mirror, reason: collision with root package name */
        public boolean f20188mirror = true;
    }

    public enum Sampler {
        SAMPLER_2D,
        SAMPLER_2D_ARRAY,
        SAMPLER_CUBEMAP,
        SAMPLER_EXTERNAL,
        SAMPLER_3D
    }

    public enum Swizzle {
        SUBSTITUTE_ZERO,
        SUBSTITUTE_ONE,
        CHANNEL_0,
        CHANNEL_1,
        CHANNEL_2,
        CHANNEL_3
    }

    public enum Type {
        UBYTE,
        BYTE,
        USHORT,
        SHORT,
        UINT,
        INT,
        HALF,
        FLOAT,
        COMPRESSED,
        UINT_10F_11F_11F_REV,
        USHORT_565
    }

    public static class Usage {
        public static final int COLOR_ATTACHMENT = 1;
        public static final int DEFAULT = 24;
        public static final int DEPTH_ATTACHMENT = 2;
        public static final int SAMPLEABLE = 16;
        public static final int STENCIL_ATTACHMENT = 4;
        public static final int SUBPASS_INPUT = 32;
        public static final int UPLOADABLE = 8;
    }

    public Texture(long j2) {
        this.mNativeObject = j2;
    }

    public static boolean isTextureFormatSupported(@NonNull Engine engine, @NonNull InternalFormat internalFormat) {
        return nIsTextureFormatSupported(engine.getNativeObject(), internalFormat.ordinal());
    }

    public static boolean isTextureSwizzleSupported(@NonNull Engine engine) {
        return nIsTextureSwizzleSupported(engine.getNativeObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderDepth(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFormat(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHeight(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderImportTexture(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLevels(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSampler(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSwizzle(long j2, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUsage(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWidth(long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j2);

    private static native void nGenerateMipmaps(long j2, long j3);

    private static native int nGeneratePrefilterMipmap(long j2, long j3, int i, int i2, Buffer buffer, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int[] iArr, Object obj, Runnable runnable, int i10, boolean z);

    private static native int nGetDepth(long j2, int i);

    private static native int nGetHeight(long j2, int i);

    private static native int nGetInternalFormat(long j2);

    private static native int nGetLevels(long j2);

    private static native int nGetTarget(long j2);

    private static native int nGetWidth(long j2, int i);

    private static native boolean nIsStreamValidForTexture(long j2, long j3);

    private static native boolean nIsTextureFormatSupported(long j2, int i);

    private static native boolean nIsTextureSwizzleSupported(long j2);

    private static native void nSetExternalImage(long j2, long j3, long j4);

    private static native void nSetExternalStream(long j2, long j3, long j4);

    private static native int nSetImage(long j2, long j3, int i, int i2, int i3, int i4, int i5, Buffer buffer, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Object obj, Runnable runnable);

    private static native int nSetImage3D(long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, Buffer buffer, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Object obj, Runnable runnable);

    private static native int nSetImage3DCompressed(long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, Buffer buffer, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Object obj, Runnable runnable);

    private static native int nSetImageCompressed(long j2, long j3, int i, int i2, int i3, int i4, int i5, Buffer buffer, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Object obj, Runnable runnable);

    private static native int nSetImageCubemap(long j2, long j3, int i, Buffer buffer, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, Object obj, Runnable runnable);

    private static native int nSetImageCubemapCompressed(long j2, long j3, int i, Buffer buffer, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, Object obj, Runnable runnable);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public void generateMipmaps(@NonNull Engine engine) {
        nGenerateMipmaps(getNativeObject(), engine.getNativeObject());
    }

    public void generatePrefilterMipmap(@NonNull Engine engine, @NonNull PixelBufferDescriptor pixelBufferDescriptor, @NonNull @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int[] iArr, PrefilterOptions prefilterOptions) {
        int i;
        boolean z;
        int width = getWidth(0);
        int height = getHeight(0);
        if (prefilterOptions != null) {
            int i2 = prefilterOptions.sampleCount;
            z = prefilterOptions.f20188mirror;
            i = i2;
        } else {
            i = 8;
            z = true;
        }
        long nativeObject = getNativeObject();
        long nativeObject2 = engine.getNativeObject();
        Buffer buffer = pixelBufferDescriptor.storage;
        if (nGeneratePrefilterMipmap(nativeObject, nativeObject2, width, height, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), iArr, pixelBufferDescriptor.handler, pixelBufferDescriptor.callback, i, z) < 0) {
            throw new BufferOverflowException();
        }
    }

    public int getDepth(@IntRange(from = 0) int i) {
        return nGetDepth(getNativeObject(), i);
    }

    @NonNull
    public InternalFormat getFormat() {
        return InternalFormat.values()[nGetInternalFormat(getNativeObject())];
    }

    public int getHeight(@IntRange(from = 0) int i) {
        return nGetHeight(getNativeObject(), i);
    }

    public int getLevels() {
        return nGetLevels(getNativeObject());
    }

    @UsedByReflection("TextureHelper.java")
    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed Texture");
    }

    @NonNull
    public Sampler getTarget() {
        return Sampler.values()[nGetTarget(getNativeObject())];
    }

    public int getWidth(@IntRange(from = 0) int i) {
        return nGetWidth(getNativeObject(), i);
    }

    public void setExternalImage(@NonNull Engine engine, long j2) {
        nSetExternalImage(getNativeObject(), engine.getNativeObject(), j2);
    }

    public void setExternalStream(@NonNull Engine engine, @NonNull Stream stream) {
        long nativeObject = getNativeObject();
        long nativeObject2 = stream.getNativeObject();
        if (!nIsStreamValidForTexture(nativeObject, nativeObject2)) {
            throw new IllegalStateException("Invalid texture sampler: When used with a stream, a texture must use a SAMPLER_EXTERNAL");
        }
        nSetExternalStream(nativeObject, engine.getNativeObject(), nativeObject2);
    }

    public void setImage(@NonNull Engine engine, @IntRange(from = 0) int i, @NonNull PixelBufferDescriptor pixelBufferDescriptor) {
        setImage(engine, i, 0, 0, getWidth(i), getHeight(i), pixelBufferDescriptor);
    }

    public void setImage(@NonNull Engine engine, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5, @NonNull PixelBufferDescriptor pixelBufferDescriptor) {
        int iNSetImage;
        if (pixelBufferDescriptor.type == Type.COMPRESSED) {
            long nativeObject = getNativeObject();
            long nativeObject2 = engine.getNativeObject();
            Buffer buffer = pixelBufferDescriptor.storage;
            iNSetImage = nSetImageCompressed(nativeObject, nativeObject2, i, i2, i3, i4, i5, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.compressedSizeInBytes, pixelBufferDescriptor.compressedFormat.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback);
        } else {
            long nativeObject3 = getNativeObject();
            long nativeObject4 = engine.getNativeObject();
            Buffer buffer2 = pixelBufferDescriptor.storage;
            iNSetImage = nSetImage(nativeObject3, nativeObject4, i, i2, i3, i4, i5, buffer2, buffer2.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback);
        }
        if (iNSetImage < 0) {
            throw new BufferOverflowException();
        }
    }

    public static class PixelBufferDescriptor {
        public int alignment;

        @Nullable
        public Runnable callback;
        public CompressedFormat compressedFormat;
        public int compressedSizeInBytes;
        public Format format;

        @Nullable
        public Object handler;
        public int left;
        public Buffer storage;
        public int stride;
        public int top;
        public Type type;

        public PixelBufferDescriptor(@NonNull Buffer buffer, @NonNull Format format, @NonNull Type type, @IntRange(from = 1, to = 8) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @Nullable Object obj, @Nullable Runnable runnable) {
            this.storage = buffer;
            this.left = i2;
            this.top = i3;
            this.type = type;
            this.alignment = i;
            this.stride = i4;
            this.format = format;
            this.handler = obj;
            this.callback = runnable;
        }

        public static int computeDataSize(@NonNull Format format, @NonNull Type type, int i, int i2, @IntRange(from = 1, to = 8) int i3) {
            int i4;
            if (type == Type.COMPRESSED) {
                return 0;
            }
            int i5 = 4;
            switch (AnonymousClass1.$SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Format[format.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    i4 = 1;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    i4 = 2;
                    break;
                case 9:
                case 10:
                    i4 = 3;
                    break;
                case 11:
                case 12:
                    i4 = 4;
                    break;
                default:
                    throw new IllegalStateException("unsupported format enum");
            }
            switch (AnonymousClass1.$SwitchMap$com$oplusos$vfxmodelviewer$filament$Texture$Type[type.ordinal()]) {
                case 4:
                case 5:
                case 6:
                    i5 = i4 * 2;
                    break;
                case 7:
                case 8:
                case 9:
                    i5 = i4 * 4;
                    break;
                case 10:
                    break;
                case 11:
                    i5 = 2;
                    break;
                default:
                    i5 = i4;
                    break;
            }
            return ((-i3) & ((i5 * i) + (i3 - 1))) * i2;
        }

        public void setCallback(@Nullable Object obj, @Nullable Runnable runnable) {
            this.handler = obj;
            this.callback = runnable;
        }

        public PixelBufferDescriptor(@NonNull Buffer buffer, @NonNull Format format, @NonNull Type type) {
            this(buffer, format, type, 1, 0, 0, 0, null, null);
        }

        public PixelBufferDescriptor(@NonNull Buffer buffer, @NonNull Format format, @NonNull Type type, @IntRange(from = 1, to = 8) int i) {
            this(buffer, format, type, i, 0, 0, 0, null, null);
        }

        public PixelBufferDescriptor(@NonNull Buffer buffer, @NonNull Format format, @NonNull Type type, @IntRange(from = 1, to = 8) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
            this(buffer, format, type, i, i2, i3, 0, null, null);
        }

        public PixelBufferDescriptor(@NonNull ByteBuffer byteBuffer, @NonNull CompressedFormat compressedFormat, @IntRange(from = 0) int i) {
            this.alignment = 1;
            this.left = 0;
            this.top = 0;
            this.stride = 0;
            this.storage = byteBuffer;
            this.type = Type.COMPRESSED;
            this.alignment = 1;
            this.compressedFormat = compressedFormat;
            this.compressedSizeInBytes = i;
        }
    }

    public void setImage(@NonNull Engine engine, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5, @IntRange(from = 0) int i6, @IntRange(from = 0) int i7, @NonNull PixelBufferDescriptor pixelBufferDescriptor) {
        int iNSetImage3D;
        if (pixelBufferDescriptor.type == Type.COMPRESSED) {
            long nativeObject = getNativeObject();
            long nativeObject2 = engine.getNativeObject();
            Buffer buffer = pixelBufferDescriptor.storage;
            iNSetImage3D = nSetImage3DCompressed(nativeObject, nativeObject2, i, i2, i3, i4, i5, i6, i7, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.compressedSizeInBytes, pixelBufferDescriptor.compressedFormat.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback);
        } else {
            long nativeObject3 = getNativeObject();
            long nativeObject4 = engine.getNativeObject();
            Buffer buffer2 = pixelBufferDescriptor.storage;
            iNSetImage3D = nSetImage3D(nativeObject3, nativeObject4, i, i2, i3, i4, i5, i6, i7, buffer2, buffer2.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback);
        }
        if (iNSetImage3D < 0) {
            throw new BufferOverflowException();
        }
    }

    public void setImage(@NonNull Engine engine, @IntRange(from = 0) int i, @NonNull PixelBufferDescriptor pixelBufferDescriptor, @NonNull @Size(min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int[] iArr) {
        int iNSetImageCubemap;
        if (pixelBufferDescriptor.type == Type.COMPRESSED) {
            long nativeObject = getNativeObject();
            long nativeObject2 = engine.getNativeObject();
            Buffer buffer = pixelBufferDescriptor.storage;
            iNSetImageCubemap = nSetImageCubemapCompressed(nativeObject, nativeObject2, i, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.compressedSizeInBytes, pixelBufferDescriptor.compressedFormat.ordinal(), iArr, pixelBufferDescriptor.handler, pixelBufferDescriptor.callback);
        } else {
            long nativeObject3 = getNativeObject();
            long nativeObject4 = engine.getNativeObject();
            Buffer buffer2 = pixelBufferDescriptor.storage;
            iNSetImageCubemap = nSetImageCubemap(nativeObject3, nativeObject4, i, buffer2, buffer2.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), iArr, pixelBufferDescriptor.handler, pixelBufferDescriptor.callback);
        }
        if (iNSetImageCubemap < 0) {
            throw new BufferOverflowException();
        }
    }
}
