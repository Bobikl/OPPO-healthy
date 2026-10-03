package androidx.camera.core;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface CameraProvider {
    @NonNull
    List<CameraInfo> getAvailableCameraInfos();

    @NonNull
    @ExperimentalCameraInfo
    default CameraInfo getCameraInfo(@NonNull CameraSelector cameraSelector) {
        throw new UnsupportedOperationException("The camera provider is not implemented properly.");
    }

    boolean hasCamera(@NonNull CameraSelector cameraSelector) throws CameraInfoUnavailableException;
}
