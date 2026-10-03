package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Identifier;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_CameraUseCaseAdapter_CameraId extends CameraUseCaseAdapter.CameraId {
    private final Identifier cameraConfigId;
    private final String cameraIdString;

    public AutoValue_CameraUseCaseAdapter_CameraId(String str, Identifier identifier) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.cameraIdString = str;
        if (identifier == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.cameraConfigId = identifier;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraUseCaseAdapter.CameraId)) {
            return false;
        }
        CameraUseCaseAdapter.CameraId cameraId = (CameraUseCaseAdapter.CameraId) obj;
        return this.cameraIdString.equals(cameraId.getCameraIdString()) && this.cameraConfigId.equals(cameraId.getCameraConfigId());
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.CameraId
    @NonNull
    public Identifier getCameraConfigId() {
        return this.cameraConfigId;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.CameraId
    @NonNull
    public String getCameraIdString() {
        return this.cameraIdString;
    }

    public int hashCode() {
        return this.cameraConfigId.hashCode() ^ ((this.cameraIdString.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "CameraId{cameraIdString=" + this.cameraIdString + ", cameraConfigId=" + this.cameraConfigId + "}";
    }
}
