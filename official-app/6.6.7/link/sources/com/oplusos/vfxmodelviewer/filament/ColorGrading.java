package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;
import androidx.annotation.Size;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ColorGrading {
    long mNativeObject;

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
                ColorGrading.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = ColorGrading.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public ColorGrading build(@NonNull Engine engine) {
            long jNBuilderBuild = ColorGrading.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new ColorGrading(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create ColorGrading");
        }

        public Builder channelMixer(@NonNull @Size(min = 3) float[] fArr, @NonNull @Size(min = 3) float[] fArr2, @NonNull @Size(min = 3) float[] fArr3) {
            Asserts.assertFloat3In(fArr);
            Asserts.assertFloat3In(fArr2);
            Asserts.assertFloat3In(fArr3);
            ColorGrading.nBuilderChannelMixer(this.mNativeBuilder, fArr, fArr2, fArr3);
            return this;
        }

        public Builder contrast(float f) {
            ColorGrading.nBuilderContrast(this.mNativeBuilder, f);
            return this;
        }

        public Builder curves(@NonNull @Size(min = 3) float[] fArr, @NonNull @Size(min = 3) float[] fArr2, @NonNull @Size(min = 3) float[] fArr3) {
            Asserts.assertFloat3In(fArr);
            Asserts.assertFloat3In(fArr2);
            Asserts.assertFloat3In(fArr3);
            ColorGrading.nBuilderCurves(this.mNativeBuilder, fArr, fArr2, fArr3);
            return this;
        }

        public Builder exposure(float f) {
            ColorGrading.nBuilderExposure(this.mNativeBuilder, f);
            return this;
        }

        public Builder gamutMapping(boolean z) {
            ColorGrading.nBuilderGamutMapping(this.mNativeBuilder, z);
            return this;
        }

        public Builder luminanceScaling(boolean z) {
            ColorGrading.nBuilderLuminanceScaling(this.mNativeBuilder, z);
            return this;
        }

        public Builder nightAdaptation(float f) {
            ColorGrading.nBuilderNightAdaptation(this.mNativeBuilder, f);
            return this;
        }

        public Builder quality(QualityLevel qualityLevel) {
            ColorGrading.nBuilderQuality(this.mNativeBuilder, qualityLevel.ordinal());
            return this;
        }

        public Builder saturation(float f) {
            ColorGrading.nBuilderSaturation(this.mNativeBuilder, f);
            return this;
        }

        public Builder shadowsMidtonesHighlights(@NonNull @Size(min = SwapChain.CONFIG_ENABLE_XCB) float[] fArr, @NonNull @Size(min = SwapChain.CONFIG_ENABLE_XCB) float[] fArr2, @NonNull @Size(min = SwapChain.CONFIG_ENABLE_XCB) float[] fArr3, @NonNull @Size(min = SwapChain.CONFIG_ENABLE_XCB) float[] fArr4) {
            Asserts.assertFloat4In(fArr);
            Asserts.assertFloat4In(fArr2);
            Asserts.assertFloat4In(fArr3);
            Asserts.assertFloat4In(fArr4);
            ColorGrading.nBuilderShadowsMidtonesHighlights(this.mNativeBuilder, fArr, fArr2, fArr3, fArr4);
            return this;
        }

        public Builder slopeOffsetPower(@NonNull @Size(min = 3) float[] fArr, @NonNull @Size(min = 3) float[] fArr2, @NonNull @Size(min = 3) float[] fArr3) {
            Asserts.assertFloat3In(fArr);
            Asserts.assertFloat3In(fArr2);
            Asserts.assertFloat3In(fArr3);
            ColorGrading.nBuilderSlopeOffsetPower(this.mNativeBuilder, fArr, fArr2, fArr3);
            return this;
        }

        public Builder toneMapper(ToneMapper toneMapper) {
            ColorGrading.nBuilderToneMapper(this.mNativeBuilder, toneMapper.getNativeObject());
            return this;
        }

        public Builder toneMapping(ToneMapping toneMapping) {
            ColorGrading.nBuilderToneMapping(this.mNativeBuilder, toneMapping.ordinal());
            return this;
        }

        public Builder vibrance(float f) {
            ColorGrading.nBuilderVibrance(this.mNativeBuilder, f);
            return this;
        }

        public Builder whiteBalance(float f, float f2) {
            ColorGrading.nBuilderWhiteBalance(this.mNativeBuilder, f, f2);
            return this;
        }
    }

    public enum QualityLevel {
        LOW,
        MEDIUM,
        HIGH,
        ULTRA
    }

    public enum ToneMapping {
        LINEAR,
        ACES_LEGACY,
        ACES,
        FILMIC,
        DISPLAY_RANGE
    }

    public ColorGrading(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderChannelMixer(long j, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderContrast(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCurves(long j, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderExposure(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGamutMapping(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLuminanceScaling(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNightAdaptation(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderQuality(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSaturation(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShadowsMidtonesHighlights(long j, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSlopeOffsetPower(long j, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderToneMapper(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderToneMapping(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVibrance(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWhiteBalance(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed ColorGrading");
    }
}
