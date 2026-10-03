package com.autonavi.base.ae.gmap.gloverlay;

import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes13.dex */
public abstract class GLOverlay {
    protected int mCode;
    protected int mEngineID;
    protected IAMapDelegate mGLMapView;
    protected boolean isNightStyle = false;
    boolean mIsInBundle = false;
    protected long mNativeInstance = 0;
    protected int mItemPriority = 0;

    public enum EAMapOverlayTpye {
        AMAPOVERLAY_ARROW(4),
        AMAPOVERLAY_VECTOR(5),
        AMAPROUTE_OVERLAY(16);

        private int id;

        EAMapOverlayTpye(int i) {
            this.id = i;
        }

        public final int getId() {
            return this.id;
        }
    }

    public GLOverlay(int i, IAMapDelegate iAMapDelegate, int i2) {
        this.mEngineID = i;
        this.mGLMapView = iAMapDelegate;
        this.mCode = i2;
    }

    private static native int nativeGetCount(long j2);

    private static native int nativeGetOverlayPriority(long j2);

    private static native int nativeGetSubType(long j2);

    private static native int nativeGetType(long j2);

    private static native boolean nativeIsClickable(long j2);

    private static native boolean nativeIsVisible(long j2);

    private static native void nativeRemoveAll(long j2);

    private static native void nativeRemoveItem(long j2, int i);

    private static native void nativeSetClickable(long j2, boolean z);

    private static native void nativeSetMaxDisplayLevel(long j2, float f);

    private static native void nativeSetMinDisplayLevel(long j2, float f);

    private static native void nativeSetOverlayOnTop(long j2, boolean z);

    private static native void nativeSetOverlayPriority(long j2, int i);

    private static native void nativeSetOverlayPriorityOnly(long j2, int i);

    public static native void nativeSetVisible(long j2, boolean z);

    public void clearFocus() {
    }

    public int getCode() {
        return this.mCode;
    }

    public boolean getIsInBundle() {
        return this.mIsInBundle;
    }

    public long getNativeInstatnce() {
        return this.mNativeInstance;
    }

    public int getOverlayPriority() {
        return nativeGetOverlayPriority(this.mNativeInstance);
    }

    public int getSize() {
        long j2 = this.mNativeInstance;
        if (j2 == 0) {
            return 0;
        }
        return nativeGetCount(j2);
    }

    public int getSubType() {
        long j2 = this.mNativeInstance;
        if (j2 == 0) {
            return -1;
        }
        return nativeGetSubType(j2);
    }

    public int getType() {
        long j2 = this.mNativeInstance;
        if (j2 == 0) {
            return -1;
        }
        return nativeGetType(j2);
    }

    public boolean isClickable() {
        long j2 = this.mNativeInstance;
        if (j2 == 0) {
            return false;
        }
        return nativeIsClickable(j2);
    }

    public boolean isVisible() {
        long j2 = this.mNativeInstance;
        if (j2 == 0) {
            return false;
        }
        return nativeIsVisible(j2);
    }

    public void releaseInstance() {
        if (this.mNativeInstance != 0) {
            this.mNativeInstance = 0L;
        }
    }

    public void removeAll() {
        long j2 = this.mNativeInstance;
        if (j2 == 0) {
            return;
        }
        nativeRemoveAll(j2);
    }

    public void removeItem(int i) {
        long j2 = this.mNativeInstance;
        if (j2 == 0) {
            return;
        }
        nativeRemoveItem(j2, i);
    }

    public void setClickable(boolean z) {
        long j2 = this.mNativeInstance;
        if (j2 == 0) {
            return;
        }
        nativeSetClickable(j2, z);
    }

    public void setMaxDisplayLevel(float f) {
        nativeSetMaxDisplayLevel(this.mNativeInstance, f);
    }

    public void setMinDisplayLevel(float f) {
        nativeSetMinDisplayLevel(this.mNativeInstance, f);
    }

    public void setOverlayItemPriority(int i) {
        this.mItemPriority = i;
    }

    public void setOverlayOnTop(boolean z) {
        nativeSetOverlayOnTop(this.mNativeInstance, z);
    }

    public void setOverlayPriority(int i) {
        GLOverlayBundle overlayBundle;
        nativeSetOverlayPriority(this.mNativeInstance, i);
        IAMapDelegate iAMapDelegate = this.mGLMapView;
        if (iAMapDelegate == null || iAMapDelegate.getGLMapEngine() == null || (overlayBundle = this.mGLMapView.getGLMapEngine().getOverlayBundle(this.mEngineID)) == null) {
            return;
        }
        overlayBundle.sortOverlay();
    }

    public void setOverlayPriorityOnly(int i) {
        long j2 = this.mNativeInstance;
        if (j2 == 0) {
            return;
        }
        nativeSetOverlayPriorityOnly(j2, i);
    }

    public void setVisible(boolean z) {
        long j2 = this.mNativeInstance;
        if (j2 == 0) {
            return;
        }
        nativeSetVisible(j2, z);
    }

    public void useNightStyle(boolean z) {
        this.isNightStyle = z;
    }
}
