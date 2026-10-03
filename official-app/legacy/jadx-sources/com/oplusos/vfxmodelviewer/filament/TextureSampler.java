package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class TextureSampler {
    int mSampler;

    /* JADX INFO: renamed from: com.oplusos.vfxmodelviewer.filament.TextureSampler$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$oplusos$vfxmodelviewer$filament$TextureSampler$MagFilter;

        static {
            int[] iArr = new int[MagFilter.values().length];
            $SwitchMap$com$oplusos$vfxmodelviewer$filament$TextureSampler$MagFilter = iArr;
            try {
                iArr[MagFilter.NEAREST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$TextureSampler$MagFilter[MagFilter.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum CompareFunction {
        LESS_EQUAL,
        GREATER_EQUAL,
        LESS,
        GREATER,
        EQUAL,
        NOT_EQUAL,
        ALWAYS,
        NEVER
    }

    public enum CompareMode {
        NONE,
        COMPARE_TO_TEXTURE
    }

    public enum MagFilter {
        NEAREST,
        LINEAR
    }

    public enum MinFilter {
        NEAREST,
        LINEAR,
        NEAREST_MIPMAP_NEAREST,
        LINEAR_MIPMAP_NEAREST,
        NEAREST_MIPMAP_LINEAR,
        LINEAR_MIPMAP_LINEAR
    }

    public enum WrapMode {
        CLAMP_TO_EDGE,
        REPEAT,
        MIRRORED_REPEAT
    }

    public TextureSampler() {
        this(MinFilter.LINEAR_MIPMAP_LINEAR, MagFilter.LINEAR, WrapMode.REPEAT);
    }

    private static MinFilter minFilterFromMagFilter(@NonNull MagFilter magFilter) {
        return AnonymousClass1.$SwitchMap$com$oplusos$vfxmodelviewer$filament$TextureSampler$MagFilter[magFilter.ordinal()] != 1 ? MinFilter.LINEAR : MinFilter.NEAREST;
    }

    private static native int nCreateCompareSampler(int i, int i2);

    private static native int nCreateSampler(int i, int i2, int i3, int i4, int i5);

    private static native float nGetAnisotropy(int i);

    private static native int nGetCompareFunction(int i);

    private static native int nGetCompareMode(int i);

    private static native int nGetMagFilter(int i);

    private static native int nGetMinFilter(int i);

    private static native int nGetWrapModeR(int i);

    private static native int nGetWrapModeS(int i);

    private static native int nGetWrapModeT(int i);

    private static native int nSetAnisotropy(int i, float f);

    private static native int nSetCompareFunction(int i, int i2);

    private static native int nSetCompareMode(int i, int i2);

    private static native int nSetMagFilter(int i, int i2);

    private static native int nSetMinFilter(int i, int i2);

    private static native int nSetWrapModeR(int i, int i2);

    private static native int nSetWrapModeS(int i, int i2);

    private static native int nSetWrapModeT(int i, int i2);

    public float getAnisotropy() {
        return nGetAnisotropy(this.mSampler);
    }

    public CompareFunction getCompareFunction() {
        return CompareFunction.values()[nGetCompareFunction(this.mSampler)];
    }

    public CompareMode getCompareMode() {
        return CompareMode.values()[nGetCompareMode(this.mSampler)];
    }

    public MagFilter getMagFilter() {
        return MagFilter.values()[nGetMagFilter(this.mSampler)];
    }

    public MinFilter getMinFilter() {
        return MinFilter.values()[nGetMinFilter(this.mSampler)];
    }

    public WrapMode getWrapModeR() {
        return WrapMode.values()[nGetWrapModeR(this.mSampler)];
    }

    public WrapMode getWrapModeS() {
        return WrapMode.values()[nGetWrapModeS(this.mSampler)];
    }

    public WrapMode getWrapModeT() {
        return WrapMode.values()[nGetWrapModeT(this.mSampler)];
    }

    public void setAnisotropy(float f) {
        this.mSampler = nSetAnisotropy(this.mSampler, f);
    }

    public void setCompareFunction(CompareFunction compareFunction) {
        this.mSampler = nSetCompareFunction(this.mSampler, compareFunction.ordinal());
    }

    public void setCompareMode(CompareMode compareMode) {
        this.mSampler = nSetCompareMode(this.mSampler, compareMode.ordinal());
    }

    public void setMagFilter(MagFilter magFilter) {
        this.mSampler = nSetMagFilter(this.mSampler, magFilter.ordinal());
    }

    public void setMinFilter(MinFilter minFilter) {
        this.mSampler = nSetMinFilter(this.mSampler, minFilter.ordinal());
    }

    public void setWrapModeR(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeR(this.mSampler, wrapMode.ordinal());
    }

    public void setWrapModeS(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeS(this.mSampler, wrapMode.ordinal());
    }

    public void setWrapModeT(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeT(this.mSampler, wrapMode.ordinal());
    }

    public TextureSampler(@NonNull MagFilter magFilter) {
        this(magFilter, WrapMode.CLAMP_TO_EDGE);
    }

    public TextureSampler(@NonNull MagFilter magFilter, @NonNull WrapMode wrapMode) {
        this(minFilterFromMagFilter(magFilter), magFilter, wrapMode);
    }

    public TextureSampler(@NonNull MinFilter minFilter, @NonNull MagFilter magFilter, @NonNull WrapMode wrapMode) {
        this(minFilter, magFilter, wrapMode, wrapMode, wrapMode);
    }

    public TextureSampler(@NonNull MinFilter minFilter, @NonNull MagFilter magFilter, @NonNull WrapMode wrapMode, @NonNull WrapMode wrapMode2, @NonNull WrapMode wrapMode3) {
        this.mSampler = 0;
        this.mSampler = nCreateSampler(minFilter.ordinal(), magFilter.ordinal(), wrapMode.ordinal(), wrapMode2.ordinal(), wrapMode3.ordinal());
    }

    public TextureSampler(@NonNull CompareMode compareMode) {
        this(compareMode, CompareFunction.LESS_EQUAL);
    }

    public TextureSampler(@NonNull CompareMode compareMode, @NonNull CompareFunction compareFunction) {
        this.mSampler = 0;
        this.mSampler = nCreateCompareSampler(compareMode.ordinal(), compareFunction.ordinal());
    }
}
