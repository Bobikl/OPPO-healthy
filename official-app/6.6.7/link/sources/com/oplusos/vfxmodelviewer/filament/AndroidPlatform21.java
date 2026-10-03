package com.oplusos.vfxmodelviewer.filament;

import android.opengl.EGLContext;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
final class AndroidPlatform21 {
    public static long getSharedContextNativeHandle(Object obj) {
        return ((EGLContext) obj).getNativeHandle();
    }
}
