package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OutputConfigurationCompat {
    public static final int STREAM_USE_CASE_NONE = -1;
    public static final int SURFACE_GROUP_ID_NONE = -1;
    private final OutputConfigurationCompatImpl mImpl;

    public interface OutputConfigurationCompatImpl {
        void addSurface(@NonNull Surface surface);

        void enableSurfaceSharing();

        long getDynamicRangeProfile();

        int getMaxSharedSurfaceCount();

        int getMirrorMode();

        @Nullable
        Object getOutputConfiguration();

        @Nullable
        String getPhysicalCameraId();

        long getStreamUseCase();

        @Nullable
        Surface getSurface();

        int getSurfaceGroupId();

        List<Surface> getSurfaces();

        void removeSurface(@NonNull Surface surface);

        void setDynamicRangeProfile(long j2);

        void setMirrorMode(int i);

        void setPhysicalCameraId(@Nullable String str);

        void setStreamUseCase(long j2);
    }

    public OutputConfigurationCompat(@NonNull Surface surface) {
        this(-1, surface);
    }

    @Nullable
    public static OutputConfigurationCompat wrap(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        OutputConfigurationCompatImpl outputConfigurationCompatImplWrap = Build.VERSION.SDK_INT >= 33 ? OutputConfigurationCompatApi33Impl.wrap((OutputConfiguration) obj) : OutputConfigurationCompatApi28Impl.wrap((OutputConfiguration) obj);
        if (outputConfigurationCompatImplWrap == null) {
            return null;
        }
        return new OutputConfigurationCompat(outputConfigurationCompatImplWrap);
    }

    public void addSurface(@NonNull Surface surface) {
        this.mImpl.addSurface(surface);
    }

    public void enableSurfaceSharing() {
        this.mImpl.enableSurfaceSharing();
    }

    public boolean equals(Object obj) {
        if (obj instanceof OutputConfigurationCompat) {
            return this.mImpl.equals(((OutputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public long getDynamicRangeProfile() {
        return this.mImpl.getDynamicRangeProfile();
    }

    public int getMaxSharedSurfaceCount() {
        return this.mImpl.getMaxSharedSurfaceCount();
    }

    public int getMirrorMode() {
        return this.mImpl.getMirrorMode();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getPhysicalCameraId() {
        return this.mImpl.getPhysicalCameraId();
    }

    public long getStreamUseCase() {
        return this.mImpl.getStreamUseCase();
    }

    @Nullable
    public Surface getSurface() {
        return this.mImpl.getSurface();
    }

    public int getSurfaceGroupId() {
        return this.mImpl.getSurfaceGroupId();
    }

    @NonNull
    public List<Surface> getSurfaces() {
        return this.mImpl.getSurfaces();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public void removeSurface(@NonNull Surface surface) {
        this.mImpl.removeSurface(surface);
    }

    public void setDynamicRangeProfile(long j2) {
        this.mImpl.setDynamicRangeProfile(j2);
    }

    public void setMirrorMode(int i) {
        this.mImpl.setMirrorMode(i);
    }

    public void setPhysicalCameraId(@Nullable String str) {
        this.mImpl.setPhysicalCameraId(str);
    }

    public void setStreamUseCase(long j2) {
        this.mImpl.setStreamUseCase(j2);
    }

    @Nullable
    public Object unwrap() {
        return this.mImpl.getOutputConfiguration();
    }

    public OutputConfigurationCompat(int i, @NonNull Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mImpl = new OutputConfigurationCompatApi33Impl(i, surface);
        } else {
            this.mImpl = new OutputConfigurationCompatApi28Impl(i, surface);
        }
    }

    @RequiresApi(26)
    public <T> OutputConfigurationCompat(@NonNull Size size, @NonNull Class<T> cls) {
        OutputConfiguration outputConfigurationNewOutputConfiguration = ApiCompat.Api26Impl.newOutputConfiguration(size, cls);
        if (Build.VERSION.SDK_INT >= 33) {
            this.mImpl = OutputConfigurationCompatApi33Impl.wrap(outputConfigurationNewOutputConfiguration);
        } else {
            this.mImpl = OutputConfigurationCompatApi28Impl.wrap(outputConfigurationNewOutputConfiguration);
        }
    }

    @RequiresApi(33)
    public OutputConfigurationCompat(@NonNull OutputConfiguration outputConfiguration) {
        this.mImpl = OutputConfigurationCompatApi33Impl.wrap(outputConfiguration);
    }

    private OutputConfigurationCompat(@NonNull OutputConfigurationCompatImpl outputConfigurationCompatImpl) {
        this.mImpl = outputConfigurationCompatImpl;
    }
}
