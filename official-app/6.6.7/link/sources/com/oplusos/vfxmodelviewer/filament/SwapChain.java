package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SwapChain {
    public static final long CONFIG_DEFAULT = 0;
    public static final long CONFIG_ENABLE_XCB = 4;
    public static final long CONFIG_READABLE = 2;
    public static final long CONFIG_TRANSPARENT = 1;
    private long mNativeObject;
    private long mNativeWindow;
    private final Object mSurface;

    public SwapChain(long j, Object obj) {
        this.mNativeObject = j;
        this.mSurface = obj;
    }

    private static native void nSetFrameCompletedCallback(long j, Object obj, Runnable runnable);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public void destroyNativeWindow(Engine engine) {
        long j = this.mNativeWindow;
        if (j != 0) {
            engine.destroyNativeWindow(j);
            this.mNativeWindow = 0L;
        }
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed SwapChain");
    }

    public Object getNativeWindow() {
        return this.mSurface;
    }

    public void setFrameCompletedCallback(@NonNull Object obj, @NonNull Runnable runnable) {
        nSetFrameCompletedCallback(getNativeObject(), obj, runnable);
    }

    public SwapChain(long j, long j2, Object obj) {
        this.mNativeObject = j;
        this.mSurface = obj;
        this.mNativeWindow = j2;
    }
}
