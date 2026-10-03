package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import com.oplus.aiunit.vision.vr3;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class View {
    private AmbientOcclusionOptions mAmbientOcclusionOptions;
    private BlendMode mBlendMode;
    private BloomOptions mBloomOptions;
    private Camera mCamera;
    private ColorGrading mColorGrading;
    private DepthOfFieldOptions mDepthOfFieldOptions;
    private DynamicResolutionOptions mDynamicResolution;
    private FogOptions mFogOptions;
    private MultiSampleAntiAliasingOptions mMultiSampleAntiAliasingOptions;
    private String mName;
    private long mNativeObject;
    private RenderQuality mRenderQuality;
    private RenderTarget mRenderTarget;
    private Scene mScene;
    private TemporalAntiAliasingOptions mTemporalAntiAliasingOptions;
    private Viewport mViewport = new Viewport(0, 0, 0, 0);
    private VignetteOptions mVignetteOptions;
    private VsmShadowOptions mVsmShadowOptions;

    @Deprecated
    public enum AmbientOcclusion {
        NONE,
        SSAO
    }

    public static class AmbientOcclusionOptions {
        public boolean bentNormals;
        public boolean enabled;

        @NonNull
        public QualityLevel lowPassFilter;
        public float minHorizonAngleRad;

        @NonNull
        public QualityLevel quality;
        public float ssctContactDistanceMax;
        public float ssctDepthBias;
        public float ssctDepthSlopeBias;
        public boolean ssctEnabled;
        public float ssctIntensity;
        public float ssctLightConeRad;

        @NonNull
        @Size(min = 3)
        public float[] ssctLightDirection;
        public int ssctRayCount;
        public int ssctSampleCount;
        public float ssctStartTraceDistance;

        @NonNull
        public QualityLevel upsampling;
        public float radius = 0.3f;
        public float bias = 5.0E-4f;
        public float power = 1.0f;
        public float resolution = 0.5f;
        public float intensity = 1.0f;
        public float bilateralThreshold = 0.05f;

        public AmbientOcclusionOptions() {
            QualityLevel qualityLevel = QualityLevel.LOW;
            this.quality = qualityLevel;
            this.lowPassFilter = QualityLevel.MEDIUM;
            this.upsampling = qualityLevel;
            this.enabled = false;
            this.bentNormals = false;
            this.minHorizonAngleRad = vr3.UNSET;
            this.ssctLightConeRad = 1.0f;
            this.ssctStartTraceDistance = 0.01f;
            this.ssctContactDistanceMax = 1.0f;
            this.ssctIntensity = 0.8f;
            this.ssctLightDirection = new float[]{vr3.UNSET, -1.0f, vr3.UNSET};
            this.ssctDepthBias = 0.01f;
            this.ssctDepthSlopeBias = 0.01f;
            this.ssctSampleCount = 4;
            this.ssctRayCount = 1;
            this.ssctEnabled = false;
        }
    }

    public enum AntiAliasing {
        NONE,
        FXAA
    }

    public enum BlendMode {
        OPAQUE,
        TRANSLUCENT
    }

    public static class BloomOptions {

        @Nullable
        public Texture dirt = null;
        public float dirtStrength = 0.2f;
        public float strength = 0.1f;
        public int resolution = 360;
        public float anamorphism = 1.0f;
        public int levels = 6;
        public BlendingMode blendingMode = BlendingMode.ADD;
        public boolean threshold = true;
        public boolean enabled = false;
        public float highlight = 1000.0f;
        public boolean lensFlare = false;
        public boolean starburst = true;
        public float chromaticAberration = 0.005f;
        public int ghostCount = 4;
        public float ghostSpacing = 0.6f;
        public float ghostThreshold = 10.0f;
        public float haloThickness = 0.1f;
        public float haloRadius = 0.4f;
        public float haloThreshold = 10.0f;

        public enum BlendingMode {
            ADD,
            INTERPOLATE
        }
    }

    public static class DepthOfFieldOptions {
        public float cocScale = 1.0f;
        public float maxApertureDiameter = 0.01f;
        public boolean enabled = false;

        @NonNull
        public Filter filter = Filter.MEDIAN;
        public boolean nativeResolution = false;
        public int foregroundRingCount = 0;
        public int backgroundRingCount = 0;
        public int fastGatherRingCount = 0;
        public int maxForegroundCOC = 0;
        public int maxBackgroundCOC = 0;

        public enum Filter {
            NONE,
            MEDIAN
        }
    }

    public enum Dithering {
        NONE,
        TEMPORAL
    }

    public static class DynamicResolutionOptions {
        public boolean enabled = false;
        public boolean homogeneousScaling = false;
        public float minScale = 0.5f;
        public float maxScale = 1.0f;
        public float sharpness = 0.9f;

        @NonNull
        public QualityLevel quality = QualityLevel.LOW;
    }

    public static class FogOptions {
        public float distance = vr3.UNSET;
        public float maximumOpacity = 1.0f;
        public float height = vr3.UNSET;
        public float heightFalloff = 1.0f;

        @NonNull
        @Size(min = 3)
        public float[] color = {0.5f, 0.5f, 0.5f};
        public float density = 0.1f;
        public float inScatteringStart = vr3.UNSET;
        public float inScatteringSize = -1.0f;
        public boolean fogColorFromIbl = false;
        public boolean enabled = false;
    }

    public static class InternalOnPickCallback implements Runnable {
        float mDepth;
        float mFragCoordsX;
        float mFragCoordsY;
        float mFragCoordsZ;
        private final PickingQueryResult mPickingQueryResult = new PickingQueryResult();

        @Entity
        int mRenderable;
        private final OnPickCallback mUserCallback;

        public InternalOnPickCallback(OnPickCallback onPickCallback) {
            this.mUserCallback = onPickCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            PickingQueryResult pickingQueryResult = this.mPickingQueryResult;
            pickingQueryResult.renderable = this.mRenderable;
            pickingQueryResult.depth = this.mDepth;
            float[] fArr = pickingQueryResult.fragCoords;
            fArr[0] = this.mFragCoordsX;
            fArr[1] = this.mFragCoordsY;
            fArr[2] = this.mFragCoordsZ;
            this.mUserCallback.onPick(pickingQueryResult);
        }
    }

    public static class MultiSampleAntiAliasingOptions {
        public boolean enabled = false;
        public int sampleCount = 4;
        public boolean customResolve = false;
    }

    public interface OnPickCallback {
        void onPick(@NonNull PickingQueryResult pickingQueryResult);
    }

    public static class PickingQueryResult {
        public float depth;

        @NonNull
        public float[] fragCoords = new float[3];

        @Entity
        public int renderable;
    }

    public enum QualityLevel {
        LOW,
        MEDIUM,
        HIGH,
        ULTRA
    }

    public static class RenderQuality {
        public QualityLevel hdrColorBuffer = QualityLevel.HIGH;
    }

    public enum ShadowType {
        PCF,
        VSM
    }

    public enum TargetBufferFlags {
        COLOR0(1),
        COLOR1(2),
        COLOR2(4),
        COLOR3(8),
        DEPTH(16),
        STENCIL(32);

        public static EnumSet<TargetBufferFlags> ALL;
        public static EnumSet<TargetBufferFlags> ALL_COLOR;
        public static EnumSet<TargetBufferFlags> DEPTH_STENCIL;
        public static EnumSet<TargetBufferFlags> NONE;
        private int mFlags;

        static {
            TargetBufferFlags targetBufferFlags = COLOR0;
            TargetBufferFlags targetBufferFlags2 = COLOR1;
            TargetBufferFlags targetBufferFlags3 = COLOR2;
            TargetBufferFlags targetBufferFlags4 = COLOR3;
            TargetBufferFlags targetBufferFlags5 = DEPTH;
            TargetBufferFlags targetBufferFlags6 = STENCIL;
            NONE = EnumSet.noneOf(TargetBufferFlags.class);
            ALL_COLOR = EnumSet.of(targetBufferFlags, targetBufferFlags2, targetBufferFlags3, targetBufferFlags4);
            DEPTH_STENCIL = EnumSet.of(targetBufferFlags5, targetBufferFlags6);
            ALL = EnumSet.range(targetBufferFlags, targetBufferFlags6);
        }

        TargetBufferFlags(int i) {
            this.mFlags = i;
        }

        public static int flags(EnumSet<TargetBufferFlags> enumSet) {
            Iterator<TargetBufferFlags> it = enumSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                i |= it.next().mFlags;
            }
            return i;
        }
    }

    public static class TemporalAntiAliasingOptions {
        public float filterWidth = 1.0f;
        public float feedback = 0.04f;
        public boolean enabled = false;
    }

    @Deprecated
    public enum ToneMapping {
        LINEAR,
        ACES
    }

    public static class VignetteOptions {
        public float midPoint = 0.5f;
        public float roundness = 0.5f;
        public float feather = 0.5f;

        @NonNull
        @Size(min = SwapChain.CONFIG_ENABLE_XCB)
        public float[] color = {vr3.UNSET, vr3.UNSET, vr3.UNSET, 1.0f};
        public boolean enabled = false;
    }

    public static class VsmShadowOptions {
        public int anisotropy = 0;
        public boolean mipmapping = false;
        public float exponent = 5.54f;
        public float minVarianceScale = 1.0f;
        public float lightBleedReduction = 0.2f;
    }

    public View(long j) {
        this.mNativeObject = j;
    }

    private static native int nGetAmbientOcclusion(long j);

    private static native int nGetAntiAliasing(long j);

    private static native int nGetDithering(long j);

    private static native int nGetSampleCount(long j);

    private static native boolean nIsFrontFaceWindingInverted(long j);

    private static native boolean nIsPostProcessingEnabled(long j);

    private static native boolean nIsScreenSpaceRefractionEnabled(long j);

    private static native boolean nIsShadowingEnabled(long j);

    private static native void nPick(long j, int i, int i2, Object obj, InternalOnPickCallback internalOnPickCallback);

    private static native void nSetAmbientOcclusion(long j, int i);

    private static native void nSetAmbientOcclusionOptions(long j, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3, boolean z, boolean z2, float f7);

    private static native void nSetAntiAliasing(long j, int i);

    private static native void nSetBlendMode(long j, int i);

    private static native void nSetBloomOptions(long j, long j2, float f, float f2, int i, float f3, int i2, int i3, boolean z, boolean z2, float f4, boolean z3, boolean z4, float f5, int i4, float f6, float f7, float f8, float f9, float f10);

    private static native void nSetCamera(long j, long j2);

    private static native void nSetColorGrading(long j, long j2);

    private static native void nSetDepthOfFieldOptions(long j, float f, float f2, boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6);

    private static native void nSetDithering(long j, int i);

    private static native void nSetDynamicLightingOptions(long j, float f, float f2);

    private static native void nSetDynamicResolutionOptions(long j, boolean z, boolean z2, float f, float f2, float f3, int i);

    private static native void nSetFogOptions(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z2);

    private static native void nSetFrontFaceWindingInverted(long j, boolean z);

    private static native void nSetMultiSampleAntiAliasingOptions(long j, boolean z, int i, boolean z2);

    private static native void nSetName(long j, String str);

    private static native void nSetPostProcessingEnabled(long j, boolean z);

    private static native void nSetRenderQuality(long j, int i);

    private static native void nSetRenderTarget(long j, long j2);

    private static native void nSetSSCTOptions(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, int i2, boolean z);

    private static native void nSetSampleCount(long j, int i);

    private static native void nSetScene(long j, long j2);

    private static native void nSetScreenSpaceRefractionEnabled(long j, boolean z);

    private static native void nSetShadowType(long j, int i);

    private static native void nSetShadowingEnabled(long j, boolean z);

    private static native void nSetTemporalAntiAliasingOptions(long j, float f, float f2, boolean z);

    private static native void nSetViewport(long j, int i, int i2, int i3, int i4);

    private static native void nSetVignetteOptions(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z);

    private static native void nSetVisibleLayers(long j, int i, int i2);

    private static native void nSetVsmShadowOptions(long j, int i, boolean z, float f, float f2, float f3);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    @NonNull
    @Deprecated
    public AmbientOcclusion getAmbientOcclusion() {
        return AmbientOcclusion.values()[nGetAmbientOcclusion(getNativeObject())];
    }

    @NonNull
    public AmbientOcclusionOptions getAmbientOcclusionOptions() {
        if (this.mAmbientOcclusionOptions == null) {
            this.mAmbientOcclusionOptions = new AmbientOcclusionOptions();
        }
        return this.mAmbientOcclusionOptions;
    }

    @NonNull
    public AntiAliasing getAntiAliasing() {
        return AntiAliasing.values()[nGetAntiAliasing(getNativeObject())];
    }

    public BlendMode getBlendMode() {
        return this.mBlendMode;
    }

    @NonNull
    public BloomOptions getBloomOptions() {
        if (this.mBloomOptions == null) {
            this.mBloomOptions = new BloomOptions();
        }
        return this.mBloomOptions;
    }

    @Nullable
    public Camera getCamera() {
        return this.mCamera;
    }

    public ColorGrading getColorGrading() {
        return this.mColorGrading;
    }

    @NonNull
    public DepthOfFieldOptions getDepthOfFieldOptions() {
        if (this.mDepthOfFieldOptions == null) {
            this.mDepthOfFieldOptions = new DepthOfFieldOptions();
        }
        return this.mDepthOfFieldOptions;
    }

    @NonNull
    public Dithering getDithering() {
        return Dithering.values()[nGetDithering(getNativeObject())];
    }

    @NonNull
    public DynamicResolutionOptions getDynamicResolutionOptions() {
        if (this.mDynamicResolution == null) {
            this.mDynamicResolution = new DynamicResolutionOptions();
        }
        return this.mDynamicResolution;
    }

    @NonNull
    public FogOptions getFogOptions() {
        if (this.mFogOptions == null) {
            this.mFogOptions = new FogOptions();
        }
        return this.mFogOptions;
    }

    @NonNull
    public MultiSampleAntiAliasingOptions getMultiSampleAntiAliasingOptions() {
        if (this.mMultiSampleAntiAliasingOptions == null) {
            this.mMultiSampleAntiAliasingOptions = new MultiSampleAntiAliasingOptions();
        }
        return this.mMultiSampleAntiAliasingOptions;
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed View");
    }

    @NonNull
    public RenderQuality getRenderQuality() {
        if (this.mRenderQuality == null) {
            this.mRenderQuality = new RenderQuality();
        }
        return this.mRenderQuality;
    }

    @Nullable
    public RenderTarget getRenderTarget() {
        return this.mRenderTarget;
    }

    @Deprecated
    public int getSampleCount() {
        return nGetSampleCount(getNativeObject());
    }

    @Nullable
    public Scene getScene() {
        return this.mScene;
    }

    @NonNull
    public TemporalAntiAliasingOptions getTemporalAntiAliasingOptions() {
        if (this.mTemporalAntiAliasingOptions == null) {
            this.mTemporalAntiAliasingOptions = new TemporalAntiAliasingOptions();
        }
        return this.mTemporalAntiAliasingOptions;
    }

    @NonNull
    @Deprecated
    public ToneMapping getToneMapping() {
        return ToneMapping.ACES;
    }

    @NonNull
    public Viewport getViewport() {
        return this.mViewport;
    }

    @NonNull
    public VignetteOptions getVignetteOptions() {
        if (this.mVignetteOptions == null) {
            this.mVignetteOptions = new VignetteOptions();
        }
        return this.mVignetteOptions;
    }

    @NonNull
    public VsmShadowOptions getVsmShadowOptions() {
        if (this.mVsmShadowOptions == null) {
            this.mVsmShadowOptions = new VsmShadowOptions();
        }
        return this.mVsmShadowOptions;
    }

    public boolean isFrontFaceWindingInverted() {
        return nIsFrontFaceWindingInverted(getNativeObject());
    }

    public boolean isPostProcessingEnabled() {
        return nIsPostProcessingEnabled(getNativeObject());
    }

    public boolean isScreenSpaceRefractionEnabled() {
        return nIsScreenSpaceRefractionEnabled(getNativeObject());
    }

    public boolean isShadowingEnabled() {
        return nIsShadowingEnabled(getNativeObject());
    }

    public void pick(int i, int i2, @Nullable Object obj, @Nullable OnPickCallback onPickCallback) {
        nPick(getNativeObject(), i, i2, obj, new InternalOnPickCallback(onPickCallback));
    }

    @Deprecated
    public void setAmbientOcclusion(@NonNull AmbientOcclusion ambientOcclusion) {
        nSetAmbientOcclusion(getNativeObject(), ambientOcclusion.ordinal());
    }

    public void setAmbientOcclusionOptions(@NonNull AmbientOcclusionOptions ambientOcclusionOptions) {
        this.mAmbientOcclusionOptions = ambientOcclusionOptions;
        nSetAmbientOcclusionOptions(getNativeObject(), ambientOcclusionOptions.radius, ambientOcclusionOptions.bias, ambientOcclusionOptions.power, ambientOcclusionOptions.resolution, ambientOcclusionOptions.intensity, ambientOcclusionOptions.bilateralThreshold, ambientOcclusionOptions.quality.ordinal(), ambientOcclusionOptions.lowPassFilter.ordinal(), ambientOcclusionOptions.upsampling.ordinal(), ambientOcclusionOptions.enabled, ambientOcclusionOptions.bentNormals, ambientOcclusionOptions.minHorizonAngleRad);
        long nativeObject = getNativeObject();
        float f = ambientOcclusionOptions.ssctLightConeRad;
        float f2 = ambientOcclusionOptions.ssctStartTraceDistance;
        float f3 = ambientOcclusionOptions.ssctContactDistanceMax;
        float f4 = ambientOcclusionOptions.ssctIntensity;
        float[] fArr = ambientOcclusionOptions.ssctLightDirection;
        nSetSSCTOptions(nativeObject, f, f2, f3, f4, fArr[0], fArr[1], fArr[2], ambientOcclusionOptions.ssctDepthBias, ambientOcclusionOptions.ssctDepthSlopeBias, ambientOcclusionOptions.ssctSampleCount, ambientOcclusionOptions.ssctRayCount, ambientOcclusionOptions.ssctEnabled);
    }

    public void setAntiAliasing(@NonNull AntiAliasing antiAliasing) {
        nSetAntiAliasing(getNativeObject(), antiAliasing.ordinal());
    }

    public void setBlendMode(BlendMode blendMode) {
        this.mBlendMode = blendMode;
        nSetBlendMode(getNativeObject(), blendMode.ordinal());
    }

    public void setBloomOptions(@NonNull BloomOptions bloomOptions) {
        this.mBloomOptions = bloomOptions;
        long nativeObject = getNativeObject();
        Texture texture = bloomOptions.dirt;
        nSetBloomOptions(nativeObject, texture != null ? texture.getNativeObject() : 0L, bloomOptions.dirtStrength, bloomOptions.strength, bloomOptions.resolution, bloomOptions.anamorphism, bloomOptions.levels, bloomOptions.blendingMode.ordinal(), bloomOptions.threshold, bloomOptions.enabled, bloomOptions.highlight, bloomOptions.lensFlare, bloomOptions.starburst, bloomOptions.chromaticAberration, bloomOptions.ghostCount, bloomOptions.ghostSpacing, bloomOptions.ghostThreshold, bloomOptions.haloThickness, bloomOptions.haloRadius, bloomOptions.haloThreshold);
    }

    public void setCamera(@Nullable Camera camera) {
        this.mCamera = camera;
        nSetCamera(getNativeObject(), camera == null ? 0L : camera.getNativeObject());
    }

    public void setColorGrading(@Nullable ColorGrading colorGrading) {
        nSetColorGrading(getNativeObject(), colorGrading != null ? colorGrading.getNativeObject() : 0L);
        this.mColorGrading = colorGrading;
    }

    public void setDepthOfFieldOptions(@NonNull DepthOfFieldOptions depthOfFieldOptions) {
        this.mDepthOfFieldOptions = depthOfFieldOptions;
        nSetDepthOfFieldOptions(getNativeObject(), depthOfFieldOptions.cocScale, depthOfFieldOptions.maxApertureDiameter, depthOfFieldOptions.enabled, depthOfFieldOptions.filter.ordinal(), depthOfFieldOptions.nativeResolution, depthOfFieldOptions.foregroundRingCount, depthOfFieldOptions.backgroundRingCount, depthOfFieldOptions.fastGatherRingCount, depthOfFieldOptions.maxForegroundCOC, depthOfFieldOptions.maxBackgroundCOC);
    }

    public void setDithering(@NonNull Dithering dithering) {
        nSetDithering(getNativeObject(), dithering.ordinal());
    }

    public void setDynamicLightingOptions(float f, float f2) {
        nSetDynamicLightingOptions(getNativeObject(), f, f2);
    }

    public void setDynamicResolutionOptions(@NonNull DynamicResolutionOptions dynamicResolutionOptions) {
        this.mDynamicResolution = dynamicResolutionOptions;
        nSetDynamicResolutionOptions(getNativeObject(), dynamicResolutionOptions.enabled, dynamicResolutionOptions.homogeneousScaling, dynamicResolutionOptions.minScale, dynamicResolutionOptions.maxScale, dynamicResolutionOptions.sharpness, dynamicResolutionOptions.quality.ordinal());
    }

    public void setFogOptions(@NonNull FogOptions fogOptions) {
        Asserts.assertFloat3In(fogOptions.color);
        this.mFogOptions = fogOptions;
        long nativeObject = getNativeObject();
        float f = fogOptions.distance;
        float f2 = fogOptions.maximumOpacity;
        float f3 = fogOptions.height;
        float f4 = fogOptions.heightFalloff;
        float[] fArr = fogOptions.color;
        nSetFogOptions(nativeObject, f, f2, f3, f4, fArr[0], fArr[1], fArr[2], fogOptions.density, fogOptions.inScatteringStart, fogOptions.inScatteringSize, fogOptions.fogColorFromIbl, fogOptions.enabled);
    }

    public void setFrontFaceWindingInverted(boolean z) {
        nSetFrontFaceWindingInverted(getNativeObject(), z);
    }

    public void setMultiSampleAntiAliasingOptions(@NonNull MultiSampleAntiAliasingOptions multiSampleAntiAliasingOptions) {
        this.mMultiSampleAntiAliasingOptions = multiSampleAntiAliasingOptions;
        nSetMultiSampleAntiAliasingOptions(getNativeObject(), multiSampleAntiAliasingOptions.enabled, multiSampleAntiAliasingOptions.sampleCount, multiSampleAntiAliasingOptions.customResolve);
    }

    public void setName(@NonNull String str) {
        this.mName = str;
        nSetName(getNativeObject(), str);
    }

    public void setPostProcessingEnabled(boolean z) {
        nSetPostProcessingEnabled(getNativeObject(), z);
    }

    public void setRenderQuality(@NonNull RenderQuality renderQuality) {
        this.mRenderQuality = renderQuality;
        nSetRenderQuality(getNativeObject(), renderQuality.hdrColorBuffer.ordinal());
    }

    public void setRenderTarget(@Nullable RenderTarget renderTarget) {
        this.mRenderTarget = renderTarget;
        nSetRenderTarget(getNativeObject(), renderTarget != null ? renderTarget.getNativeObject() : 0L);
    }

    @Deprecated
    public void setSampleCount(int i) {
        nSetSampleCount(getNativeObject(), i);
    }

    public void setScene(@Nullable Scene scene) {
        this.mScene = scene;
        nSetScene(getNativeObject(), scene == null ? 0L : scene.getNativeObject());
    }

    public void setScreenSpaceRefractionEnabled(boolean z) {
        nSetScreenSpaceRefractionEnabled(getNativeObject(), z);
    }

    public void setShadowType(ShadowType shadowType) {
        nSetShadowType(getNativeObject(), shadowType.ordinal());
    }

    public void setShadowingEnabled(boolean z) {
        nSetShadowingEnabled(getNativeObject(), z);
    }

    public void setTemporalAntiAliasingOptions(@NonNull TemporalAntiAliasingOptions temporalAntiAliasingOptions) {
        this.mTemporalAntiAliasingOptions = temporalAntiAliasingOptions;
        nSetTemporalAntiAliasingOptions(getNativeObject(), temporalAntiAliasingOptions.feedback, temporalAntiAliasingOptions.filterWidth, temporalAntiAliasingOptions.enabled);
    }

    @Deprecated
    public void setToneMapping(@NonNull ToneMapping toneMapping) {
    }

    public void setViewport(@NonNull Viewport viewport) {
        this.mViewport = viewport;
        long nativeObject = getNativeObject();
        Viewport viewport2 = this.mViewport;
        nSetViewport(nativeObject, viewport2.left, viewport2.bottom, viewport2.width, viewport2.height);
    }

    public void setVignetteOptions(@NonNull VignetteOptions vignetteOptions) {
        Asserts.assertFloat4In(vignetteOptions.color);
        this.mVignetteOptions = vignetteOptions;
        long nativeObject = getNativeObject();
        float f = vignetteOptions.midPoint;
        float f2 = vignetteOptions.roundness;
        float f3 = vignetteOptions.feather;
        float[] fArr = vignetteOptions.color;
        nSetVignetteOptions(nativeObject, f, f2, f3, fArr[0], fArr[1], fArr[2], fArr[3], vignetteOptions.enabled);
    }

    public void setVisibleLayers(@IntRange(from = 0, to = 255) int i, @IntRange(from = 0, to = 255) int i2) {
        nSetVisibleLayers(getNativeObject(), i & 255, i2 & 255);
    }

    public void setVsmShadowOptions(@NonNull VsmShadowOptions vsmShadowOptions) {
        this.mVsmShadowOptions = vsmShadowOptions;
        nSetVsmShadowOptions(getNativeObject(), vsmShadowOptions.anisotropy, vsmShadowOptions.mipmapping, vsmShadowOptions.exponent, vsmShadowOptions.minVarianceScale, vsmShadowOptions.lightBleedReduction);
    }
}
