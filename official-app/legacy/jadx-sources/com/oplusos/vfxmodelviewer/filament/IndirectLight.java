package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;

/* JADX INFO: loaded from: classes9.dex */
public class IndirectLight {
    long mNativeObject;

    public IndirectLight(long j2) {
        this.mNativeObject = j2;
    }

    @NonNull
    @Size(min = 4)
    public static float[] getColorEstimate(@Nullable @Size(min = 4) float[] fArr, @NonNull float[] fArr2, float f, float f2, float f3) {
        if (fArr2.length < 27) {
            throw new ArrayIndexOutOfBoundsException("3 bands SH required, array must be at least 9 x float3");
        }
        float[] fArrAssertFloat4 = Asserts.assertFloat4(fArr);
        nGetColorEstimateStatic(fArrAssertFloat4, fArr2, f, f2, f3);
        return fArrAssertFloat4;
    }

    @NonNull
    @Size(min = 3)
    public static float[] getDirectionEstimate(@NonNull float[] fArr, @Nullable @Size(min = 3) float[] fArr2) {
        if (fArr.length < 27) {
            throw new ArrayIndexOutOfBoundsException("3 bands SH required, array must be at least 9 x float3");
        }
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr2);
        nGetDirectionEstimateStatic(fArr, fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderReflections(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j2);

    private static native void nGetColorEstimate(long j2, float[] fArr, float f, float f2, float f3);

    private static native void nGetColorEstimateStatic(float[] fArr, float[] fArr2, float f, float f2, float f3);

    private static native void nGetDirectionEstimate(long j2, float[] fArr);

    private static native void nGetDirectionEstimateStatic(float[] fArr, float[] fArr2);

    private static native float nGetIntensity(long j2);

    private static native long nGetIrradianceTexture(long j2);

    private static native long nGetReflectionsTexture(long j2);

    private static native void nGetRotation(long j2, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIntensity(long j2, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIrradiance(long j2, int i, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIrradianceAsTexture(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nRadiance(long j2, int i, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nRotation(long j2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9);

    private static native void nSetIntensity(long j2, float f);

    private static native void nSetRotation(long j2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public float getIntensity() {
        return nGetIntensity(getNativeObject());
    }

    @Nullable
    public Texture getIrradianceTexture() {
        long jNGetIrradianceTexture = nGetIrradianceTexture(getNativeObject());
        if (jNGetIrradianceTexture == 0) {
            return null;
        }
        return new Texture(jNGetIrradianceTexture);
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed IndirectLight");
    }

    @Nullable
    public Texture getReflectionsTexture() {
        long jNGetReflectionsTexture = nGetReflectionsTexture(getNativeObject());
        if (jNGetReflectionsTexture == 0) {
            return null;
        }
        return new Texture(jNGetReflectionsTexture);
    }

    @NonNull
    @Size(min = 9)
    public float[] getRotation(@Nullable @Size(min = 9) float[] fArr) {
        float[] fArrAssertMat3f = Asserts.assertMat3f(fArr);
        nGetRotation(getNativeObject(), fArrAssertMat3f);
        return fArrAssertMat3f;
    }

    public void setIntensity(float f) {
        nSetIntensity(getNativeObject(), f);
    }

    public void setRotation(@NonNull @Size(min = 9) float[] fArr) {
        Asserts.assertMat3fIn(fArr);
        nSetRotation(getNativeObject(), fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], fArr[8]);
    }

    @NonNull
    @Size(min = 4)
    @Deprecated
    public float[] getColorEstimate(@Nullable @Size(min = 4) float[] fArr, float f, float f2, float f3) {
        float[] fArrAssertFloat4 = Asserts.assertFloat4(fArr);
        nGetColorEstimate(getNativeObject(), fArrAssertFloat4, f, f2, f3);
        return fArrAssertFloat4;
    }

    @NonNull
    @Size(min = 3)
    @Deprecated
    public float[] getDirectionEstimate(@Nullable @Size(min = 3) float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetDirectionEstimate(getNativeObject(), fArrAssertFloat3);
        return fArrAssertFloat3;
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
                IndirectLight.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = IndirectLight.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public IndirectLight build(@NonNull Engine engine) {
            long jNBuilderBuild = IndirectLight.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new IndirectLight(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create IndirectLight");
        }

        @NonNull
        public Builder intensity(float f) {
            IndirectLight.nIntensity(this.mNativeBuilder, f);
            return this;
        }

        @NonNull
        public Builder irradiance(@IntRange(from = 1, to = 3) int i, @NonNull float[] fArr) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalArgumentException("bands must be 1, 2 or 3");
                    }
                    if (fArr.length < 27) {
                        throw new ArrayIndexOutOfBoundsException("3 bands SH, array must be at least 9 x float3");
                    }
                } else if (fArr.length < 12) {
                    throw new ArrayIndexOutOfBoundsException("2 bands SH, array must be at least 4 x float3");
                }
            } else if (fArr.length < 3) {
                throw new ArrayIndexOutOfBoundsException("1 band SH, array must be at least 1 x float3");
            }
            IndirectLight.nIrradiance(this.mNativeBuilder, i, fArr);
            return this;
        }

        @NonNull
        public Builder radiance(@IntRange(from = 1, to = 3) int i, @NonNull float[] fArr) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalArgumentException("bands must be 1, 2 or 3");
                    }
                    if (fArr.length < 27) {
                        throw new ArrayIndexOutOfBoundsException("3 bands SH, array must be at least 9 x float3");
                    }
                } else if (fArr.length < 12) {
                    throw new ArrayIndexOutOfBoundsException("2 bands SH, array must be at least 4 x float3");
                }
            } else if (fArr.length < 3) {
                throw new ArrayIndexOutOfBoundsException("1 band SH, array must be at least 1 x float3");
            }
            IndirectLight.nRadiance(this.mNativeBuilder, i, fArr);
            return this;
        }

        @NonNull
        public Builder reflections(@NonNull Texture texture) {
            IndirectLight.nBuilderReflections(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }

        @NonNull
        public Builder rotation(@NonNull @Size(min = 9) float[] fArr) {
            IndirectLight.nRotation(this.mNativeBuilder, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], fArr[8]);
            return this;
        }

        @NonNull
        public Builder irradiance(@NonNull Texture texture) {
            IndirectLight.nIrradianceAsTexture(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }
    }
}
