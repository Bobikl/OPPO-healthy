package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class Skybox {
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
                Skybox.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = Skybox.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public Skybox build(@NonNull Engine engine) {
            long jNBuilderBuild = Skybox.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new Skybox(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Skybox");
        }

        @NonNull
        public Builder color(float f, float f2, float f3, float f4) {
            Skybox.nBuilderColor(this.mNativeBuilder, f, f2, f3, f4);
            return this;
        }

        @NonNull
        public Builder environment(@NonNull Texture texture) {
            Skybox.nBuilderEnvironment(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }

        @NonNull
        public Builder intensity(float f) {
            Skybox.nBuilderIntensity(this.mNativeBuilder, f);
            return this;
        }

        @NonNull
        public Builder showSun(boolean z) {
            Skybox.nBuilderShowSun(this.mNativeBuilder, z);
            return this;
        }

        @NonNull
        public Builder color(@NonNull @Size(min = SwapChain.CONFIG_ENABLE_XCB) float[] fArr) {
            Skybox.nBuilderColor(this.mNativeBuilder, fArr[0], fArr[1], fArr[2], fArr[3]);
            return this;
        }
    }

    public Skybox(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderColor(long j, float f, float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderEnvironment(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShowSun(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native float nGetIntensity(long j);

    private static native int nGetLayerMask(long j);

    private static native long nGetTexture(long j);

    private static native void nSetColor(long j, float f, float f2, float f3, float f4);

    private static native void nSetLayerMask(long j, int i, int i2);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public float getIntensity() {
        return nGetIntensity(getNativeObject());
    }

    public int getLayerMask() {
        return nGetLayerMask(getNativeObject());
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Skybox");
    }

    @Nullable
    public Texture getTexture() {
        long jNGetTexture = nGetTexture(getNativeObject());
        if (jNGetTexture == 0) {
            return null;
        }
        return new Texture(jNGetTexture);
    }

    public void setColor(float f, float f2, float f3, float f4) {
        nSetColor(getNativeObject(), f, f2, f3, f4);
    }

    public void setLayerMask(@IntRange(from = 0, to = 255) int i, @IntRange(from = 0, to = 255) int i2) {
        nSetLayerMask(getNativeObject(), i & 255, i2 & 255);
    }

    public void setColor(@NonNull @Size(min = SwapChain.CONFIG_ENABLE_XCB) float[] fArr) {
        nSetColor(getNativeObject(), fArr[0], fArr[1], fArr[2], fArr[3]);
    }
}
