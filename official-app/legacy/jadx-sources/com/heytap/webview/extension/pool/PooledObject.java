package com.heytap.webview.extension.pool;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\r\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0011"}, d2 = {"Lcom/heytap/webview/extension/pool/PooledObject;", ExifInterface.GPS_DIRECTION_TRUE, "", "getActiveTimeMillis", "", "getCreateTime", "getIdleTimeMillis", "getLastBorrowTime", "getLastReturnTime", "getLastUsedTime", "getObject", "()Ljava/lang/Object;", "getState", "", "reback", "", "use", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PooledObject<T> extends Comparable<PooledObject<T>> {
    long getActiveTimeMillis();

    long getCreateTime();

    long getIdleTimeMillis();

    long getLastBorrowTime();

    long getLastReturnTime();

    long getLastUsedTime();

    T getObject();

    @NotNull
    String getState();

    void reback();

    void use();
}
