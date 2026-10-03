package com.heytap.store.homemodule.utils;

import androidx.exifinterface.media.ExifInterface;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H&J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/utils/OnResultCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "onFail", "", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "result", "fromCache", "", "(Ljava/lang/Object;Z)V", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface OnResultCallback<T> {
    void onFail(@NotNull Exception e2);

    void onSuccess(T result, boolean fromCache);
}
