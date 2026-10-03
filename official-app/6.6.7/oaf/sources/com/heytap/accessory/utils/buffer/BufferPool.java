package com.heytap.accessory.utils.buffer;

import android.content.Context;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class BufferPool {
    private BufferPool() {
    }

    public static boolean clearCache(int i) {
        return BufferPoolImpl.clearCache(i);
    }

    public static String dump() {
        return BufferPoolImpl.dump();
    }

    public static void initialise(Context context) {
        BufferPoolImpl.initialise(context);
    }

    public static Buffer obtain(int i) {
        return BufferPoolImpl.obtain(i);
    }

    public static Buffer obtainExact(int i) {
        return BufferPoolImpl.obtainExact(i);
    }

    public static boolean recycle(byte[] bArr) {
        return BufferPoolImpl.recycle(bArr);
    }

    public static Buffer wrapPayload(int i, int i2, byte[] bArr, int i3) {
        return BufferPoolImpl.wrapPayload(i, i2, bArr, i3);
    }

    public static Buffer wrapPayloadInPlace(int i, int i2, byte[] bArr, int i3, int i4) {
        return BufferPoolImpl.wrapPayloadInPlace(bArr, i, i2, i3, i4);
    }

    public static Buffer wrapPayload(byte[] bArr, int i, int i2, int i3, int i4) {
        return BufferPoolImpl.wrapPayload(bArr, i, i2, i3, i4);
    }
}
