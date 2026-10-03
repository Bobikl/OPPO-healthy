package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;

/* JADX INFO: loaded from: classes.dex */
public interface CameraConfigProvider {
    public static final CameraConfigProvider EMPTY = new CameraConfigProvider() { // from class: com.oplus.aiunit.vision.sv2
        @Override // androidx.camera.core.impl.CameraConfigProvider
        public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
            return CameraConfigProvider.lambda$static$0(cameraInfo, context);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ CameraConfig lambda$static$0(CameraInfo cameraInfo, Context context) {
        return null;
    }

    @Nullable
    CameraConfig getConfig(@NonNull CameraInfo cameraInfo, @NonNull Context context);
}
