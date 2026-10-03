package com.oplusos.vfxmodelviewer.utils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class Bookmark {
    private long mNativeObject;

    public Bookmark(long j) {
        this.mNativeObject = j;
    }

    private static native void nDestroyBookmark(long j);

    public void finalize() throws Throwable {
        nDestroyBookmark(this.mNativeObject);
        super.finalize();
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }
}
