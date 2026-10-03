package com.heytap.nearx.tangramconfig.api;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J#\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&¢\u0006\u0002\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH&J)\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\u0012\u001a\u0002H\u0006H&¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/ICloudConfigCtrl;", "Lcom/heytap/nearx/tangramconfig/api/ExceptionHandler;", "Lcom/heytap/nearx/tangramconfig/api/StatHandler;", "debuggable", "", "getComponent", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "onConfigItemChecked", "", "configType", "", "configId", "", "version", "regComponent", "impl", "(Ljava/lang/Class;Ljava/lang/Object;)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ICloudConfigCtrl extends ExceptionHandler, StatHandler {
    boolean debuggable();

    @Nullable
    <T> T getComponent(@NotNull Class<T> clazz);

    void onConfigItemChecked(int configType, @NotNull String configId, int version);

    <T> void regComponent(@NotNull Class<T> clazz, T impl);
}
