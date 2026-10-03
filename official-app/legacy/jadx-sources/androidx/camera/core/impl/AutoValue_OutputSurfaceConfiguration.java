package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_OutputSurfaceConfiguration extends OutputSurfaceConfiguration {
    private final OutputSurface imageAnalysisOutputSurface;
    private final OutputSurface imageCaptureOutputSurface;
    private final OutputSurface postviewOutputSurface;
    private final OutputSurface previewOutputSurface;

    public AutoValue_OutputSurfaceConfiguration(OutputSurface outputSurface, OutputSurface outputSurface2, @Nullable OutputSurface outputSurface3, @Nullable OutputSurface outputSurface4) {
        if (outputSurface == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.previewOutputSurface = outputSurface;
        if (outputSurface2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.imageCaptureOutputSurface = outputSurface2;
        this.imageAnalysisOutputSurface = outputSurface3;
        this.postviewOutputSurface = outputSurface4;
    }

    public boolean equals(Object obj) {
        OutputSurface outputSurface;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurfaceConfiguration)) {
            return false;
        }
        OutputSurfaceConfiguration outputSurfaceConfiguration = (OutputSurfaceConfiguration) obj;
        if (this.previewOutputSurface.equals(outputSurfaceConfiguration.getPreviewOutputSurface()) && this.imageCaptureOutputSurface.equals(outputSurfaceConfiguration.getImageCaptureOutputSurface()) && ((outputSurface = this.imageAnalysisOutputSurface) != null ? outputSurface.equals(outputSurfaceConfiguration.getImageAnalysisOutputSurface()) : outputSurfaceConfiguration.getImageAnalysisOutputSurface() == null)) {
            OutputSurface outputSurface2 = this.postviewOutputSurface;
            if (outputSurface2 == null) {
                if (outputSurfaceConfiguration.getPostviewOutputSurface() == null) {
                    return true;
                }
            } else if (outputSurface2.equals(outputSurfaceConfiguration.getPostviewOutputSurface())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    @Nullable
    public OutputSurface getImageAnalysisOutputSurface() {
        return this.imageAnalysisOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    @NonNull
    public OutputSurface getImageCaptureOutputSurface() {
        return this.imageCaptureOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    @Nullable
    public OutputSurface getPostviewOutputSurface() {
        return this.postviewOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    @NonNull
    public OutputSurface getPreviewOutputSurface() {
        return this.previewOutputSurface;
    }

    public int hashCode() {
        int iHashCode = (((this.previewOutputSurface.hashCode() ^ 1000003) * 1000003) ^ this.imageCaptureOutputSurface.hashCode()) * 1000003;
        OutputSurface outputSurface = this.imageAnalysisOutputSurface;
        int iHashCode2 = (iHashCode ^ (outputSurface == null ? 0 : outputSurface.hashCode())) * 1000003;
        OutputSurface outputSurface2 = this.postviewOutputSurface;
        return iHashCode2 ^ (outputSurface2 != null ? outputSurface2.hashCode() : 0);
    }

    public String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.previewOutputSurface + ", imageCaptureOutputSurface=" + this.imageCaptureOutputSurface + ", imageAnalysisOutputSurface=" + this.imageAnalysisOutputSurface + ", postviewOutputSurface=" + this.postviewOutputSurface + "}";
    }
}
