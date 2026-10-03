package com.heytap.webview.extension.pool;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\f"}, d2 = {"Lcom/heytap/webview/extension/pool/PooledObjectFactory;", ExifInterface.GPS_DIRECTION_TRUE, "", "activateObject", "", "pool", "Lcom/heytap/webview/extension/pool/PooledObject;", "destroyObject", "makeObject", "passivateObject", "validateObject", "", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PooledObjectFactory<T> {
    void activateObject(@NotNull PooledObject<T> pool);

    void destroyObject(@NotNull PooledObject<T> pool);

    @NotNull
    PooledObject<T> makeObject();

    void passivateObject(@NotNull PooledObject<T> pool);

    boolean validateObject(@NotNull PooledObject<T> pool);
}
