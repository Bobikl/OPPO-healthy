package com.oplusos.vfxmodelviewer.filament;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.util.Log;
import android.view.Surface;

/* JADX INFO: loaded from: classes9.dex */
final class AndroidPlatform extends Platform {
    private static final String LOG_TAG = "Filament";
    public static final /* synthetic */ int a = 0;

    static {
        EGL14.eglGetDisplay(0);
    }

    @Override // com.oplusos.vfxmodelviewer.filament.Platform
    public long getSharedContextNativeHandle(Object obj) {
        return AndroidPlatform21.getSharedContextNativeHandle(obj);
    }

    @Override // com.oplusos.vfxmodelviewer.filament.Platform
    public void log(String str) {
        Log.d(LOG_TAG, str);
    }

    @Override // com.oplusos.vfxmodelviewer.filament.Platform
    public boolean validateSharedContext(Object obj) {
        return obj instanceof EGLContext;
    }

    @Override // com.oplusos.vfxmodelviewer.filament.Platform
    public boolean validateStreamSource(Object obj) {
        return obj instanceof SurfaceTexture;
    }

    @Override // com.oplusos.vfxmodelviewer.filament.Platform
    public boolean validateSurface(Object obj) {
        return obj instanceof Surface;
    }

    @Override // com.oplusos.vfxmodelviewer.filament.Platform
    public void warn(String str) {
        Log.w(LOG_TAG, str);
    }
}
