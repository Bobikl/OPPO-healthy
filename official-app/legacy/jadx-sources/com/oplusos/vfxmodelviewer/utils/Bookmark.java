package com.oplusos.vfxmodelviewer.utils;

/* JADX INFO: loaded from: classes9.dex */
public class Bookmark {
    private long mNativeObject;

    public Bookmark(long j2) {
        this.mNativeObject = j2;
    }

    private static native void nDestroyBookmark(long j2);

    public void finalize() throws Throwable {
        nDestroyBookmark(this.mNativeObject);
        super.finalize();
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }
}
