package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class CameraConfigs {
    private static final CameraConfig DEFAULT_CAMERA_CONFIG = new DefaultCameraConfig();

    public static final class DefaultCameraConfig implements CameraConfig {
        private final Identifier mIdentifier = Identifier.create(new Object());

        @Override // androidx.camera.core.impl.CameraConfig
        @NonNull
        public Identifier getCompatibilityId() {
            return this.mIdentifier;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        @NonNull
        public Config getConfig() {
            return OptionsBundle.emptyBundle();
        }
    }

    private CameraConfigs() {
    }

    @NonNull
    public static CameraConfig defaultConfig() {
        return DEFAULT_CAMERA_CONFIG;
    }
}
