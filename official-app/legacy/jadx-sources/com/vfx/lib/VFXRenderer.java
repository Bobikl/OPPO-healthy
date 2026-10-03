package com.vfx.lib;

import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes10.dex */
public class VFXRenderer implements GLSurfaceView.Renderer {
    private static final long NANOSECONDSPERMICROSECOND = 1000000;
    private static final long NANOSECONDSPERSECOND = 1000000000;
    private static final String TAG = "VFXRenderer";
    private static long sAnimationInterval = 16666668;
    private long mLastTickInNanoSeconds;
    private int mScreenHeight;
    private int mScreenWidth;
    private a mVFXRenderListener;
    private int mVFXType;
    private boolean mNativeIspurged = false;
    private boolean mNativeInitCompleted = false;
    private int mVFXID = -1;

    public interface a {
    }

    @Deprecated
    public VFXRenderer() {
    }

    public static native void nativeEndVFX(int i);

    private static native void nativeInit(int i, int i2, int i3, long j2);

    private static native void nativeOnPause();

    private static native void nativeOnResume();

    private static native void nativeOnSurfaceChanged(int i, int i2);

    private static native void nativePointerDown(int i, float f, float f2);

    private static native void nativePostEventScreenSizeChanged(int i, int i2);

    public static native void nativePurgeVFX(int i);

    public static native void nativeRemoveVFX(int i);

    private static native void nativeRender(int i);

    public static native void nativeResetVFXID(int i);

    private static native void nativeShowFPS(boolean z);

    private static native void nativeTouchesBegin(int i, float f, float f2);

    private static native void nativeTouchesCancel(int[] iArr, float[] fArr, float[] fArr2);

    private static native void nativeTouchesEnd(int i, float f, float f2);

    private static native void nativeTouchesMove(int[] iArr, float[] fArr, float[] fArr2);

    public static void setAnimationInterval(float f) {
        sAnimationInterval = (long) (f * 1.0E9f);
    }

    public int getVFXType() {
        return this.mVFXType;
    }

    public void handleActionCancel(int[] iArr, float[] fArr, float[] fArr2) {
        nativeTouchesCancel(iArr, fArr, fArr2);
    }

    public void handleActionDown(int i, float f, float f2) {
        nativeTouchesBegin(i, f, f2);
    }

    public void handleActionMove(int[] iArr, float[] fArr, float[] fArr2) {
        nativeTouchesMove(iArr, fArr, fArr2);
    }

    public void handleActionPointerDown(int i, float f, float f2) {
        nativePointerDown(i, f, f2);
    }

    public void handleActionUp(int i, float f, float f2) {
        nativeTouchesEnd(i, f, f2);
    }

    public void handleEndVFX(int i) {
        nativeEndVFX(i);
    }

    public void handleOnPause() {
        if (this.mNativeInitCompleted) {
            Log.d("JAVA vfxViewRenderer", "Pause");
            nativeOnPause();
        }
    }

    public void handleOnResume() {
        Log.d("JAVA vfxViewRenderer", "Resume");
        nativeOnResume();
    }

    public void handleRemoveVFX(int i) {
        nativeRemoveVFX(i);
    }

    public void handleShowFPS(boolean z) {
        nativeShowFPS(z);
    }

    public void handleSurfaceChanged(int i, int i2) {
        nativeOnSurfaceChanged(i, i2);
    }

    public boolean isNativeInitCompleted() {
        return this.mNativeInitCompleted;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        long jNanoTime = System.nanoTime() - this.mLastTickInNanoSeconds;
        long j2 = sAnimationInterval;
        if (jNanoTime < j2) {
            try {
                Thread.sleep((j2 - jNanoTime) / 1000000);
            } catch (Exception unused) {
            }
        }
        this.mLastTickInNanoSeconds = System.nanoTime();
        nativeRender(this.mVFXID);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.mScreenWidth = i;
        this.mScreenHeight = i2;
        Log.d(TAG, "-------onSurfaceChanged W/H:" + this.mScreenWidth + "/" + this.mScreenHeight + "----");
        nativePostEventScreenSizeChanged(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.d(TAG, "VFX---------onSurfaceCreated W/H:" + this.mScreenWidth + "/" + this.mScreenHeight + "--------nativeInit, id: " + this.mVFXID);
        nativeInit(this.mScreenWidth, this.mScreenHeight, this.mVFXType, (long) this.mVFXID);
        this.mLastTickInNanoSeconds = System.nanoTime();
        this.mNativeInitCompleted = true;
    }

    public void removeListener() {
    }

    public void setScreenWidthAndHeight(int i, int i2) {
        this.mScreenWidth = i;
        this.mScreenHeight = i2;
    }

    public void setVFXID(int i) {
        Log.d(TAG, "VFX---------setVFXID vfxid:" + i);
        this.mVFXID = i;
    }

    public void setVFXType(int i) {
        this.mVFXType = i;
    }

    public VFXRenderer(int i) {
        this.mVFXType = i;
    }

    public VFXRenderer(a aVar) {
    }
}
