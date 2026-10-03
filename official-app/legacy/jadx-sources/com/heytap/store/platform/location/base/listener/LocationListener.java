package com.heytap.store.platform.location.base.listener;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/heytap/store/platform/location/base/listener/LocationListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "onFailed", "", "code", "", "message", "", "onSuccess", UTraceSQLiteHelperKt.COL_INFO, "(Ljava/lang/Object;)V", "location_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface LocationListener<T> {
    void onFailed(int code, @NotNull String message);

    void onSuccess(@Nullable T info);
}
