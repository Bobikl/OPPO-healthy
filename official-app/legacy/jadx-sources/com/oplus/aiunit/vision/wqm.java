package com.oplus.aiunit.vision;

import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes12.dex */
public final class wqm {

    public static class a extends com.amap.api.col.p0003sl.n {
        public static int h = 4;
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18371c;
        public int[] g = new int[1];
        public int d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18372e = 16;
        public int f = 8;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.f18371c = i3;
        }

        public final int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.g)) {
                return this.g[0];
            }
            return 0;
        }

        public final c b(EGL10 egl10, EGLDisplay eGLDisplay) {
            c cVar = new c((byte) 0);
            int[] iArrD = d(true);
            cVar.a = iArrD;
            egl10.eglChooseConfig(eGLDisplay, iArrD, null, 0, cVar.b);
            if (cVar.b[0] <= 0) {
                int[] iArrD2 = d(false);
                cVar.a = iArrD2;
                egl10.eglChooseConfig(eGLDisplay, iArrD2, null, 0, cVar.b);
                if (cVar.b[0] <= 0) {
                    return null;
                }
            }
            return cVar;
        }

        public final EGLConfig c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iA = a(egl10, eGLDisplay, eGLConfig, 12325);
                int iA2 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (iA >= this.f18372e && iA2 >= this.f) {
                    int iA3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int iA4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int iA5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int iA6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (iA3 == this.a && iA4 == this.b && iA5 == this.f18371c && iA6 == this.d) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser, com.amap.api.col.3sl.aa.e
        public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr;
            int[] iArr2;
            c cVarB = b(egl10, eGLDisplay);
            if (cVarB == null || (iArr = cVarB.a) == null) {
                return null;
            }
            int[] iArr3 = cVarB.b;
            int i = iArr3[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, iArr3);
            EGLConfig eGLConfigC = c(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigC != null) {
                return eGLConfigC;
            }
            this.a = 8;
            this.b = 8;
            this.f18371c = 8;
            c cVarB2 = b(egl10, eGLDisplay);
            if (cVarB2 == null || (iArr2 = cVarB2.a) == null) {
                return eGLConfigC;
            }
            int[] iArr4 = cVarB2.b;
            int i2 = iArr4[0];
            EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
            egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr2, i2, iArr4);
            return c(egl10, eGLDisplay, eGLConfigArr2);
        }

        public final int[] d(boolean z) {
            return new int[]{12324, this.a, 12323, this.b, 12322, this.f18371c, 12321, this.d, 12325, this.f18372e, 12326, this.f, 12338, z ? 1 : 0, 12352, h, 12344};
        }
    }

    public static class b extends com.amap.api.col.p0003sl.q {
        @Override // android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.col.3sl.aa.f
        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            try {
                return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.col.3sl.aa.f
        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    public static void a(IGLSurfaceView iGLSurfaceView, int i, int i2, int i3) {
        iGLSurfaceView.setEGLContextFactory(new b());
        iGLSurfaceView.setEGLConfigChooser(new a(i, i2, i3));
    }

    public static class c {
        public int[] a;
        public int[] b;

        public c() {
            this.a = null;
            this.b = new int[1];
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }
}
