package com.heytap.webview.extension.pool;

import androidx.exifinterface.media.ExifInterface;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0006H&J\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/heytap/webview/extension/pool/ObjectPool;", ExifInterface.GPS_DIRECTION_TRUE, "", "borrowObject", "()Ljava/lang/Object;", "clear", "", "close", "getNumActive", "", "getNumAll", "getNumIdle", "invalidateObject", "obj", "(Ljava/lang/Object;)V", "returnAllObject", "returnObject", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ObjectPool<T> {
    T borrowObject();

    void clear();

    void close();

    int getNumActive();

    int getNumAll();

    int getNumIdle();

    void invalidateObject(T obj);

    void returnAllObject();

    void returnObject(T obj);
}
