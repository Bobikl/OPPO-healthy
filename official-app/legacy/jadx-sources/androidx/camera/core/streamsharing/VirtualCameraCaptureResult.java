package androidx.camera.core.streamsharing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;

/* JADX INFO: loaded from: classes.dex */
public class VirtualCameraCaptureResult implements CameraCaptureResult {
    private static final long INVALID_TIMESTAMP = -1;

    @Nullable
    private final CameraCaptureResult mBaseCameraCaptureResult;

    @NonNull
    private final TagBundle mTagBundle;
    private final long mTimestamp;

    public VirtualCameraCaptureResult(@NonNull TagBundle tagBundle, @Nullable CameraCaptureResult cameraCaptureResult) {
        this(cameraCaptureResult, tagBundle, -1L);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AeMode getAeMode() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeMode() : CameraCaptureMetaData.AeMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AeState getAeState() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeState() : CameraCaptureMetaData.AeState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AfMode getAfMode() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfMode() : CameraCaptureMetaData.AfMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AfState getAfState() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfState() : CameraCaptureMetaData.AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AwbMode getAwbMode() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbMode() : CameraCaptureMetaData.AwbMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AwbState getAwbState() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbState() : CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.FlashState getFlashState() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getFlashState() : CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public TagBundle getTagBundle() {
        return this.mTagBundle;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getTimestamp();
        }
        long j2 = this.mTimestamp;
        if (j2 != -1) {
            return j2;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    public VirtualCameraCaptureResult(@NonNull TagBundle tagBundle, long j2) {
        this(null, tagBundle, j2);
    }

    private VirtualCameraCaptureResult(@Nullable CameraCaptureResult cameraCaptureResult, @NonNull TagBundle tagBundle, long j2) {
        this.mBaseCameraCaptureResult = cameraCaptureResult;
        this.mTagBundle = tagBundle;
        this.mTimestamp = j2;
    }
}
