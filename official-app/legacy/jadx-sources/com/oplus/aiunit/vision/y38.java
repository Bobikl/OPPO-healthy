package com.oplus.aiunit.vision;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes13.dex */
public class y38 implements GLSurfaceView.EGLConfigChooser {
    public static final int EGL_COVERAGE_BUFFERS_NV = 12512;
    public static final int EGL_COVERAGE_SAMPLES_NV = 12513;
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18856c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18857e;
    public int f;
    public int g;
    public int[] i = new int[1];
    public final int[] h = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

    public y38(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.f18856c = i3;
        this.d = i4;
        this.f18857e = i5;
        this.f = i6;
        this.g = i7;
    }

    public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr2 = eGLConfigArr;
        EGLConfig eGLConfig2 = null;
        EGLConfig eGLConfig3 = null;
        EGLConfig eGLConfig4 = null;
        int i = 0;
        for (int length = eGLConfigArr2.length; i < length; length = length) {
            EGLConfig eGLConfig5 = eGLConfigArr2[i];
            int iB = b(egl10, eGLDisplay, eGLConfig5, 12325, 0);
            int iB2 = b(egl10, eGLDisplay, eGLConfig5, 12326, 0);
            if (iB >= this.f18857e && iB2 >= this.f) {
                int iB3 = b(egl10, eGLDisplay, eGLConfig5, 12324, 0);
                int iB4 = b(egl10, eGLDisplay, eGLConfig5, 12323, 0);
                int iB5 = b(egl10, eGLDisplay, eGLConfig5, 12322, 0);
                int iB6 = b(egl10, eGLDisplay, eGLConfig5, 12321, 0);
                if (eGLConfig2 == null && iB3 == 5 && iB4 == 6 && iB5 == 5 && iB6 == 0) {
                    eGLConfig2 = eGLConfig5;
                }
                if (eGLConfig3 == null && iB3 == this.a && iB4 == this.b && iB5 == this.f18856c && iB6 == this.d) {
                    eGLConfig3 = eGLConfig5;
                    if (this.g == 0) {
                        break;
                    }
                }
                int iB7 = b(egl10, eGLDisplay, eGLConfig5, 12338, 0);
                EGLConfig eGLConfig6 = eGLConfig2;
                int iB8 = b(egl10, eGLDisplay, eGLConfig5, 12337, 0);
                if (eGLConfig4 == null && iB7 == 1 && iB8 >= this.g && iB3 == this.a && iB4 == this.b && iB5 == this.f18856c && iB6 == this.d) {
                    eGLConfig = eGLConfig3;
                } else {
                    eGLConfig = eGLConfig3;
                    int iB9 = b(egl10, eGLDisplay, eGLConfig5, EGL_COVERAGE_BUFFERS_NV, 0);
                    int iB10 = b(egl10, eGLDisplay, eGLConfig5, EGL_COVERAGE_SAMPLES_NV, 0);
                    if (eGLConfig4 == null && iB9 == 1 && iB10 >= this.g && iB3 == this.a && iB4 == this.b && iB5 == this.f18856c && iB6 == this.d) {
                    }
                    eGLConfig3 = eGLConfig;
                    eGLConfig2 = eGLConfig6;
                }
                eGLConfig4 = eGLConfig5;
                eGLConfig3 = eGLConfig;
                eGLConfig2 = eGLConfig6;
            }
            i++;
            eGLConfigArr2 = eGLConfigArr;
        }
        if (eGLConfig4 != null) {
            return eGLConfig4;
        }
        return eGLConfig3 != null ? eGLConfig3 : eGLConfig2;
    }

    public final int b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.i) ? this.i[0] : i2;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, this.h, null, 0, iArr);
        int i = iArr[0];
        if (i <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        egl10.eglChooseConfig(eGLDisplay, this.h, eGLConfigArr, i, iArr);
        return a(egl10, eGLDisplay, eGLConfigArr);
    }
}
