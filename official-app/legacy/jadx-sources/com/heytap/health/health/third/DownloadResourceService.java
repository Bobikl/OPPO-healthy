package com.heytap.health.health.third;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.alibaba.android.arouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/health/third/DownloadResourceService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "resourceType", "", "isInstall", "", "projectType", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "e7", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/Observer;", "", "progress", "H7", "health_release"}, k = 1, mv = {1, 8, 0})
public interface DownloadResourceService extends IProvider {
    void H7(@NotNull LifecycleOwner owner, @NotNull Observer<Float> progress);

    void V(int resourceType, boolean isInstall, @Nullable String projectType);

    void e7(int resourceType);
}
