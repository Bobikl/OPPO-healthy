package com.heytap.nearx.tangramconfig.kit.callback;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.tangramconfig.BuildConfig;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00060\tj\u0002`\nH&¨\u0006\u000b"}, d2 = {"Lcom/heytap/nearx/tangramconfig/kit/callback/IpcCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "callback", "", "result", "(Ljava/lang/Object;)V", "onFailed", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/Exception;", "Lkotlin/Exception;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IpcCallback<T> {
    void callback(@Nullable T result);

    void onFailed(@NotNull Exception e2);
}
