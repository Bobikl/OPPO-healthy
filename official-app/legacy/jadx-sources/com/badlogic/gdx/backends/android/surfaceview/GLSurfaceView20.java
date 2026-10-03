package com.badlogic.gdx.backends.android.surfaceview;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.badlogic.gdx.Input;
import com.oplus.aiunit.vision.r35;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes13.dex */
public class GLSurfaceView20 extends GLSurfaceView {
    public static String k = "GL2JNIView";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f1205l;
    public final com.badlogic.gdx.backends.android.surfaceview.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Input.OnscreenKeyboardType f1206j;

    public class a extends BaseInputConnection {
        public a(View view, boolean z) {
            super(view, z);
        }

        public final void a(int i) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            super.sendKeyEvent(new KeyEvent(jUptimeMillis, jUptimeMillis, 0, i, 0, 0, -1, 0, 6));
            super.sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), jUptimeMillis, 1, i, 0, 0, -1, 0, 6));
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            if (i != 1 || i2 != 0) {
                return super.deleteSurroundingText(i, i2);
            }
            a(67);
            return true;
        }
    }

    public static class b implements GLSurfaceView.EGLConfigChooser {
        public static int[] h = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1207c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1208e;
        public int f;
        public int[] g = new int[1];

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.f1207c = i3;
            this.d = i4;
            this.f1208e = i5;
            this.f = i6;
        }

        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iB = b(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int iB2 = b(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (iB >= this.f1208e && iB2 >= this.f) {
                    int iB3 = b(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int iB4 = b(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int iB5 = b(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int iB6 = b(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (iB3 == this.a && iB4 == this.b && iB5 == this.f1207c && iB6 == this.d) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        public final int b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.g) ? this.g[0] : i2;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            egl10.eglChooseConfig(eGLDisplay, h, null, 0, iArr);
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, h, eGLConfigArr, i, iArr);
            return a(egl10, eGLDisplay, eGLConfigArr);
        }
    }

    public static class c implements GLSurfaceView.EGLContextFactory {
        public static int a = 12440;

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            Log.w(GLSurfaceView20.k, "creating OpenGL ES " + GLSurfaceView20.f1205l + ".0 context");
            StringBuilder sb = new StringBuilder();
            sb.append("Before eglCreateContext ");
            sb.append(GLSurfaceView20.f1205l);
            GLSurfaceView20.a(sb.toString(), egl10);
            EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{a, GLSurfaceView20.f1205l, 12344});
            if ((!GLSurfaceView20.a("After eglCreateContext " + GLSurfaceView20.f1205l, egl10) || eGLContextEglCreateContext == null) && GLSurfaceView20.f1205l > 2) {
                Log.w(GLSurfaceView20.k, "Falling back to GLES 2");
                GLSurfaceView20.f1205l = 2;
                return createContext(egl10, eGLDisplay, eGLConfig);
            }
            Log.w(GLSurfaceView20.k, "Returning a GLES " + GLSurfaceView20.f1205l + " context");
            return eGLContextEglCreateContext;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    public GLSurfaceView20(Context context, com.badlogic.gdx.backends.android.surfaceview.b bVar, int i) {
        super(context);
        this.f1206j = Input.OnscreenKeyboardType.Default;
        f1205l = i;
        this.i = bVar;
        b(false, 16, 0);
    }

    public static boolean a(String str, EGL10 egl10) {
        boolean z = true;
        while (true) {
            int iEglGetError = egl10.eglGetError();
            if (iEglGetError == 12288) {
                return z;
            }
            Log.e(k, String.format("%s: EGL error: 0x%x", str, Integer.valueOf(iEglGetError)));
            z = false;
        }
    }

    public final void b(boolean z, int i, int i2) {
        if (z) {
            getHolder().setFormat(-3);
        }
        setEGLContextFactory(new c());
        setEGLConfigChooser(z ? new b(8, 8, 8, 8, i, i2) : new b(8, 8, 8, 0, i, i2));
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (editorInfo != null) {
            editorInfo.imeOptions |= 268435456;
            editorInfo.inputType = r35.n(this.f1206j);
        }
        return new a(this, false);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        com.badlogic.gdx.backends.android.surfaceview.b.a aVarA = this.i.a(i, i2);
        setMeasuredDimension(aVarA.a, aVarA.b);
    }
}
