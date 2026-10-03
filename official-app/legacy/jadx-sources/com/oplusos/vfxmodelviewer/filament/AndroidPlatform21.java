package com.oplusos.vfxmodelviewer.filament;

import android.opengl.EGLContext;

/* JADX INFO: loaded from: classes9.dex */
final class AndroidPlatform21 {
    public static long getSharedContextNativeHandle(Object obj) {
        return ((EGLContext) obj).getNativeHandle();
    }
}
