package com.oplusos.vfxmodelviewer.utils;

import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.vr3;
import com.oplusos.vfxmodelviewer.filament.ColorGrading;
import com.oplusos.vfxmodelviewer.filament.Engine;
import com.oplusos.vfxmodelviewer.filament.Entity;
import com.oplusos.vfxmodelviewer.filament.IndirectLight;
import com.oplusos.vfxmodelviewer.filament.LightManager;
import com.oplusos.vfxmodelviewer.filament.MaterialInstance;
import com.oplusos.vfxmodelviewer.filament.Renderer;
import com.oplusos.vfxmodelviewer.filament.Scene;
import com.oplusos.vfxmodelviewer.filament.View;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class AutomationEngine {
    private ColorGrading mColorGrading;
    private final long mNativeObject;

    public static class Options {
        public float sleepDuration = 0.2f;
        public int minFrameCount = 2;
        public boolean verbose = true;
    }

    public static class ViewerContent {

        @Entity
        public int[] assetLights;
        public IndirectLight indirectLight;
        public LightManager lightManager;
        public MaterialInstance[] materials;
        public Renderer renderer;
        public Scene scene;

        @Entity
        public int sunlight;
        public View view;
    }

    public static class ViewerOptions {
        public float cameraAperture = 16.0f;
        public float cameraSpeed = 125.0f;
        public float cameraISO = 100.0f;
        public float groundShadowStrength = 0.75f;
        public boolean groundPlaneEnabled = false;
        public boolean skyboxEnabled = true;
        public float cameraFocalLength = 28.0f;
        public float cameraFocusDistance = vr3.UNSET;
        public boolean autoScaleEnabled = true;
    }

    public AutomationEngine(@NonNull String str) {
        long jNCreateAutomationEngine = nCreateAutomationEngine(str);
        this.mNativeObject = jNCreateAutomationEngine;
        if (jNCreateAutomationEngine == 0) {
            throw new IllegalStateException("Couldn't create AutomationEngine");
        }
    }

    private static native void nApplySettings(long j, String str, long j2, long[] jArr, long j3, int i, int[] iArr, long j4, long j5, long j6);

    private static native long nCreateAutomationEngine(String str);

    private static native long nCreateDefaultAutomationEngine();

    private static native void nDestroy(long j);

    private static native long nGetColorGrading(long j, long j2);

    private static native void nGetViewerOptions(long j, Object obj);

    private static native void nSetOptions(long j, float f, int i, boolean z);

    private static native boolean nShouldClose(long j);

    private static native void nSignalBatchMode(long j);

    private static native void nStartBatchMode(long j);

    private static native void nStartRunning(long j);

    private static native void nStopRunning(long j);

    private static native void nTick(long j, long j2, long[] jArr, long j3, float f);

    public void applySettings(@NonNull String str, @NonNull ViewerContent viewerContent) {
        long[] jArr;
        if (viewerContent.view == null || viewerContent.renderer == null) {
            throw new IllegalStateException("Must provide a View and Renderer");
        }
        if (viewerContent.lightManager == null || viewerContent.scene == null) {
            throw new IllegalStateException("Must provide a LightManager and Scene");
        }
        MaterialInstance[] materialInstanceArr = viewerContent.materials;
        if (materialInstanceArr != null) {
            int length = materialInstanceArr.length;
            jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = viewerContent.materials[i].getNativeObject();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        long nativeObject = viewerContent.view.getNativeObject();
        IndirectLight indirectLight = viewerContent.indirectLight;
        nApplySettings(this.mNativeObject, str, nativeObject, jArr2, indirectLight == null ? 0L : indirectLight.getNativeObject(), viewerContent.sunlight, viewerContent.assetLights, viewerContent.lightManager.getNativeObject(), viewerContent.scene.getNativeObject(), viewerContent.renderer.getNativeObject());
    }

    public void finalize() throws Throwable {
        nDestroy(this.mNativeObject);
        super.finalize();
    }

    @NonNull
    public ColorGrading getColorGrading(@NonNull Engine engine) {
        long jNGetColorGrading = nGetColorGrading(this.mNativeObject, engine.getNativeObject());
        ColorGrading colorGrading = this.mColorGrading;
        if (colorGrading == null || colorGrading.getNativeObject() != jNGetColorGrading) {
            this.mColorGrading = jNGetColorGrading == 0 ? null : new ColorGrading(jNGetColorGrading);
        }
        return this.mColorGrading;
    }

    @NonNull
    public ViewerOptions getViewerOptions() {
        ViewerOptions viewerOptions = new ViewerOptions();
        nGetViewerOptions(this.mNativeObject, viewerOptions);
        return viewerOptions;
    }

    public void setOptions(@NonNull Options options) {
        nSetOptions(this.mNativeObject, options.sleepDuration, options.minFrameCount, options.verbose);
    }

    public boolean shouldClose() {
        return nShouldClose(this.mNativeObject);
    }

    public void signalBatchMode() {
        nSignalBatchMode(this.mNativeObject);
    }

    public void startBatchMode() {
        nStartBatchMode(this.mNativeObject);
    }

    public void startRunning() {
        nStartRunning(this.mNativeObject);
    }

    public void stopRunning() {
        nStopRunning(this.mNativeObject);
    }

    public void tick(@NonNull ViewerContent viewerContent, float f) {
        long[] jArr;
        if (viewerContent.view == null || viewerContent.renderer == null) {
            throw new IllegalStateException("Must provide a View and Renderer");
        }
        MaterialInstance[] materialInstanceArr = viewerContent.materials;
        if (materialInstanceArr != null) {
            int length = materialInstanceArr.length;
            jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = viewerContent.materials[i].getNativeObject();
            }
        } else {
            jArr = null;
        }
        long nativeObject = viewerContent.view.getNativeObject();
        long nativeObject2 = viewerContent.renderer.getNativeObject();
        nTick(this.mNativeObject, nativeObject, jArr, nativeObject2, f);
    }

    public AutomationEngine() {
        long jNCreateDefaultAutomationEngine = nCreateDefaultAutomationEngine();
        this.mNativeObject = jNCreateDefaultAutomationEngine;
        if (jNCreateDefaultAutomationEngine == 0) {
            throw new IllegalStateException("Couldn't create AutomationEngine");
        }
    }
}
