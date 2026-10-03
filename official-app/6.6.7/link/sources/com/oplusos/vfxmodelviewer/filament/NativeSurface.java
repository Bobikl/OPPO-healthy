package com.oplusos.vfxmodelviewer.filament;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class NativeSurface {
    private final int mHeight;
    private final long mNativeObject;
    private final int mWidth;

    public NativeSurface(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mNativeObject = nCreateSurface(i, i2);
    }

    private static native long nCreateSurface(int i, int i2);

    private static native void nDestroySurface(long j);

    public void dispose() {
        nDestroySurface(this.mNativeObject);
    }

    public int getHeight() {
        return this.mHeight;
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    public int getWidth() {
        return this.mWidth;
    }
}
