package com.oplus.aiunit.vision;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import io.protostuff.MapSchema;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001c¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/cc6;", "", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "", MapSchema.FIELD_NAME_ENTRY, "f", "d", "Ljavax/microedition/khronos/egl/EGLConfig;", "a", "", "c", "Ljavax/microedition/khronos/egl/EGL10;", "egl", "Ljavax/microedition/khronos/egl/EGLDisplay;", "eglDisplay", "eglConfig", "Ljavax/microedition/khronos/egl/EGLContext;", "b", "Ljavax/microedition/khronos/egl/EGL10;", "Ljavax/microedition/khronos/egl/EGLDisplay;", "Ljavax/microedition/khronos/egl/EGLSurface;", "Ljavax/microedition/khronos/egl/EGLSurface;", "eglSurface", "Ljavax/microedition/khronos/egl/EGLContext;", "eglContext", "Ljavax/microedition/khronos/egl/EGLConfig;", "Landroid/view/Surface;", "Landroid/view/Surface;", "surface", "<init>", "()V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class cc6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public EGL10 egl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public EGLDisplay eglDisplay = EGL10.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public EGLContext eglContext = EGL10.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public EGLConfig eglConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Surface surface;

    public final EGLConfig a() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArrC = c();
        EGL10 egl10 = this.egl;
        if (egl10 == null || !egl10.eglChooseConfig(this.eglDisplay, iArrC, eGLConfigArr, 1, iArr)) {
            return null;
        }
        return eGLConfigArr[0];
    }

    public final EGLContext b(EGL10 egl, EGLDisplay eglDisplay, EGLConfig eglConfig) {
        int[] iArr = {12440, 2, 12344};
        if (egl != null) {
            return egl.eglCreateContext(eglDisplay, eglConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }
        return null;
    }

    public final int[] c() {
        return new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    }

    public final void d() {
        EGL10 egl10 = this.egl;
        if (egl10 != null) {
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
            egl10.eglDestroyContext(this.eglDisplay, this.eglContext);
            egl10.eglTerminate(this.eglDisplay);
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.surface = null;
        }
    }

    public final void e(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surfaceTexture");
        try {
            EGL egl = EGLContext.getEGL();
            if (egl == null) {
                throw new TypeCastException("null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            }
            EGL10 egl10 = (EGL10) egl;
            this.egl = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            int[] iArr = new int[2];
            EGL10 egl11 = this.egl;
            if (egl11 != null) {
                egl11.eglInitialize(eGLDisplayEglGetDisplay, iArr);
            }
            this.eglConfig = a();
            Surface surface = new Surface(surfaceTexture);
            this.surface = surface;
            EGL10 egl12 = this.egl;
            this.eglSurface = egl12 != null ? egl12.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surface, null) : null;
            this.eglContext = b(this.egl, this.eglDisplay, this.eglConfig);
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLSurface != null && !Intrinsics.areEqual(eGLSurface, EGL10.EGL_NO_SURFACE)) {
                EGL10 egl13 = this.egl;
                if (egl13 != null) {
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface2 = this.eglSurface;
                    if (egl13.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.eglContext)) {
                        return;
                    }
                    q0 q0Var = q0.INSTANCE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("make current error:");
                    EGL10 egl14 = this.egl;
                    sb.append(Integer.toHexString(egl14 != null ? egl14.eglGetError() : 0));
                    q0Var.b("AnimPlayer.EGLUtil", sb.toString());
                    return;
                }
                return;
            }
            q0 q0Var2 = q0.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("error:");
            EGL10 egl15 = this.egl;
            sb2.append(Integer.toHexString(egl15 != null ? egl15.eglGetError() : 0));
            q0Var2.b("AnimPlayer.EGLUtil", sb2.toString());
        } catch (Throwable th) {
            q0.INSTANCE.c("AnimPlayer.EGLUtil", "error:" + th, th);
        }
    }

    public final void f() {
        EGLSurface eGLSurface;
        EGL10 egl10;
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay == null || (eGLSurface = this.eglSurface) == null || (egl10 = this.egl) == null) {
            return;
        }
        egl10.eglSwapBuffers(eGLDisplay, eGLSurface);
    }
}
