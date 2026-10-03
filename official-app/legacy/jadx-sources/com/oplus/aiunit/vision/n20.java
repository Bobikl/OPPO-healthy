package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.opengl.GLSurfaceView;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20;
import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.GLVersion;
import com.badlogic.gdx.utils.GdxRuntimeException;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes13.dex */
public class n20 extends h6 implements GLSurfaceView.Renderer {
    public static volatile boolean I = false;
    public float A;
    public float B;
    public float C;
    public final u10 D;
    public Graphics.a E;
    public boolean F;
    public int[] G;
    public Object H;
    public final GLSurfaceView20 a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14303c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14304e;
    public int f;
    public int g;
    public t10 h;
    public k18 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l18 f14305j;
    public EGLContext k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GLVersion f14306l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f14307n;
    public float o;
    public long p;
    public long q;
    public int r;
    public int s;
    public volatile boolean t;
    public volatile boolean u;
    public volatile boolean v;
    public volatile boolean w;
    public volatile boolean x;
    public float y;
    public float z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n20.this.v) {
                n20.this.onDrawFrame(null);
            }
        }
    }

    public class b extends Graphics.b {
        public b(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4);
        }
    }

    public n20(t10 t10Var, u10 u10Var, com.badlogic.gdx.backends.android.surfaceview.b bVar) {
        this(t10Var, u10Var, bVar, true);
    }

    @TargetApi(28)
    public void A() {
        this.d = 0;
        this.f14304e = 0;
        this.g = 0;
        this.f = 0;
        try {
            DisplayCutout displayCutout = this.h.C().getDecorView().getRootWindowInsets().getDisplayCutout();
            if (displayCutout != null) {
                this.g = displayCutout.getSafeInsetRight();
                this.f = displayCutout.getSafeInsetBottom();
                this.f14304e = displayCutout.getSafeInsetTop();
                this.d = displayCutout.getSafeInsetLeft();
            }
        } catch (UnsupportedOperationException unused) {
            x38.app.c("AndroidGraphics", "Unable to get safe area insets");
        }
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean a(String str) {
        if (this.m == null) {
            this.m = x38.gl.q(k18.GL_EXTENSIONS);
        }
        return this.m.contains(str);
    }

    @Override // com.badlogic.gdx.Graphics
    public void b() {
        GLSurfaceView20 gLSurfaceView20 = this.a;
        if (gLSurfaceView20 != null) {
            gLSurfaceView20.requestRender();
        }
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean c() {
        return this.F;
    }

    @Override // com.badlogic.gdx.Graphics
    public int d() {
        return this.b;
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.a e() {
        return this.E;
    }

    @Override // com.badlogic.gdx.Graphics
    public int f() {
        return this.s;
    }

    @Override // com.badlogic.gdx.Graphics
    public float g() {
        return this.o;
    }

    @Override // com.badlogic.gdx.Graphics
    public int getHeight() {
        return this.f14303c;
    }

    @Override // com.badlogic.gdx.Graphics
    public int getWidth() {
        return this.b;
    }

    @Override // com.badlogic.gdx.Graphics
    public int h() {
        return this.f14303c;
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.b i() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display display = ((DisplayManager) this.h.getContext().getSystemService("display")).getDisplay(0);
        display.getRealMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int iO = onb.o(display.getRefreshRate());
        u10 u10Var = this.D;
        return new b(i, i2, iO, u10Var.a + u10Var.b + u10Var.f17242c + u10Var.d);
    }

    public boolean j() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344}, new EGLConfig[10], 10, iArr);
        egl10.eglTerminate(eGLDisplayEglGetDisplay);
        return iArr[0] > 0;
    }

    public void k() {
        Mesh.p(this.h);
        Texture.A(this.h);
        Cubemap.A(this.h);
        com.badlogic.gdx.graphics.c.z(this.h);
        wxg.n(this.h);
        o18.n(this.h);
        r();
    }

    public GLSurfaceView20 l(t10 t10Var, com.badlogic.gdx.backends.android.surfaceview.b bVar) {
        if (!j()) {
            throw new GdxRuntimeException("libGDX requires OpenGL ES 2.0");
        }
        GLSurfaceView.EGLConfigChooser eGLConfigChooserO = o();
        GLSurfaceView20 gLSurfaceView20 = new GLSurfaceView20(t10Var.getContext(), bVar, this.D.t ? 3 : 2);
        if (eGLConfigChooserO != null) {
            gLSurfaceView20.setEGLConfigChooser(eGLConfigChooserO);
        } else {
            u10 u10Var = this.D;
            gLSurfaceView20.setEGLConfigChooser(u10Var.a, u10Var.b, u10Var.f17242c, u10Var.d, u10Var.f17243e, u10Var.f);
        }
        gLSurfaceView20.setRenderer(this);
        return gLSurfaceView20;
    }

    public void m() {
        synchronized (this.H) {
            this.u = false;
            this.x = true;
            while (this.x) {
                try {
                    this.H.wait();
                } catch (InterruptedException unused) {
                    x38.app.c("AndroidGraphics", "waiting for destroy synchronization failed!");
                }
            }
        }
    }

    public final int n(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.G) ? this.G[0] : i2;
    }

    public GLSurfaceView.EGLConfigChooser o() {
        u10 u10Var = this.D;
        return new y38(u10Var.a, u10Var.b, u10Var.f17242c, u10Var.d, u10Var.f17243e, u10Var.f, u10Var.g);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long jNanoTime = System.nanoTime();
        if (this.w) {
            this.o = 0.0f;
        } else {
            this.o = (jNanoTime - this.f14307n) / 1.0E9f;
        }
        this.f14307n = jNanoTime;
        synchronized (this.H) {
            z = this.u;
            z2 = this.v;
            z3 = this.x;
            z4 = this.w;
            if (this.w) {
                this.w = false;
            }
            if (this.v) {
                this.v = false;
                this.H.notifyAll();
            }
            if (this.x) {
                this.x = false;
                this.H.notifyAll();
            }
        }
        if (z4) {
            zsh<cwa> zshVarA = this.h.A();
            synchronized (zshVarA) {
                cwa[] cwaVarArrO = zshVarA.o();
                int i = zshVarA.f18241j;
                for (int i2 = 0; i2 < i; i2++) {
                    cwaVarArrO[i2].resume();
                }
                zshVarA.p();
            }
            this.h.o().resume();
            x38.app.c("AndroidGraphics", "resumed");
        }
        if (z) {
            synchronized (this.h.G()) {
                this.h.g().clear();
                this.h.g().b(this.h.G());
                this.h.G().clear();
            }
            for (int i3 = 0; i3 < this.h.g().f18241j; i3++) {
                this.h.g().get(i3).run();
            }
            this.h.getInput().h5();
            this.q++;
            this.h.o().a();
        }
        if (z2) {
            zsh<cwa> zshVarA2 = this.h.A();
            synchronized (zshVarA2) {
                cwa[] cwaVarArrO2 = zshVarA2.o();
                int i4 = zshVarA2.f18241j;
                for (int i5 = 0; i5 < i4; i5++) {
                    cwaVarArrO2[i5].pause();
                }
            }
            this.h.o().pause();
            x38.app.c("AndroidGraphics", "paused");
        }
        if (z3) {
            zsh<cwa> zshVarA3 = this.h.A();
            synchronized (zshVarA3) {
                cwa[] cwaVarArrO3 = zshVarA3.o();
                int i6 = zshVarA3.f18241j;
                for (int i7 = 0; i7 < i6; i7++) {
                    cwaVarArrO3[i7].dispose();
                }
            }
            this.h.o().dispose();
            x38.app.c("AndroidGraphics", "destroyed");
        }
        if (jNanoTime - this.p > p6i.MILLI) {
            this.s = this.r;
            this.r = 0;
            this.p = jNanoTime;
        }
        this.r++;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.b = i;
        this.f14303c = i2;
        z();
        A();
        gl10.glViewport(0, 0, this.b, this.f14303c);
        if (!this.t) {
            this.h.o().create();
            this.t = true;
            synchronized (this) {
                this.u = true;
            }
        }
        this.h.o().resize(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.k = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        y(gl10);
        q(eGLConfig);
        z();
        A();
        Mesh.x(this.h);
        Texture.F(this.h);
        Cubemap.D(this.h);
        com.badlogic.gdx.graphics.c.A(this.h);
        wxg.B(this.h);
        o18.r(this.h);
        r();
        Display defaultDisplay = this.h.getWindowManager().getDefaultDisplay();
        this.b = defaultDisplay.getWidth();
        this.f14303c = defaultDisplay.getHeight();
        this.f14307n = System.nanoTime();
        gl10.glViewport(0, 0, this.b, this.f14303c);
    }

    public View p() {
        return this.a;
    }

    public void q(EGLConfig eGLConfig) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        int iN = n(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12324, 0);
        int iN2 = n(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12323, 0);
        int iN3 = n(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12322, 0);
        int iN4 = n(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12321, 0);
        int iN5 = n(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12325, 0);
        int iN6 = n(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12326, 0);
        int iMax = Math.max(n(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12337, 0), n(egl10, eGLDisplayEglGetDisplay, eGLConfig, y38.EGL_COVERAGE_SAMPLES_NV, 0));
        boolean z = n(egl10, eGLDisplayEglGetDisplay, eGLConfig, y38.EGL_COVERAGE_SAMPLES_NV, 0) != 0;
        x38.app.c("AndroidGraphics", "framebuffer: (" + iN + ", " + iN2 + ", " + iN3 + ", " + iN4 + ")");
        Application application = x38.app;
        StringBuilder sb = new StringBuilder();
        sb.append("depthbuffer: (");
        sb.append(iN5);
        sb.append(")");
        application.c("AndroidGraphics", sb.toString());
        x38.app.c("AndroidGraphics", "stencilbuffer: (" + iN6 + ")");
        x38.app.c("AndroidGraphics", "samples: (" + iMax + ")");
        x38.app.c("AndroidGraphics", "coverage sampling: (" + z + ")");
        this.E = new Graphics.a(iN, iN2, iN3, iN4, iN5, iN6, iMax, z);
    }

    public void r() {
        x38.app.c("AndroidGraphics", Mesh.t());
        x38.app.c("AndroidGraphics", Texture.C());
        x38.app.c("AndroidGraphics", Cubemap.C());
        x38.app.c("AndroidGraphics", wxg.A());
        x38.app.c("AndroidGraphics", o18.p());
    }

    public void s() {
        GLSurfaceView20 gLSurfaceView20 = this.a;
        if (gLSurfaceView20 != null) {
            gLSurfaceView20.onPause();
        }
    }

    public void t() {
        GLSurfaceView20 gLSurfaceView20 = this.a;
        if (gLSurfaceView20 != null) {
            gLSurfaceView20.onResume();
        }
    }

    public void u() {
        synchronized (this.H) {
            if (this.u) {
                this.u = false;
                this.v = true;
                this.a.queueEvent(new a());
                while (this.v) {
                    try {
                        this.H.wait(xx0.SCROLL_DELAYED);
                        if (this.v) {
                            x38.app.error("AndroidGraphics", "waiting for pause synchronization took too long; assuming deadlock and killing");
                            Process.killProcess(Process.myPid());
                        }
                    } catch (InterruptedException unused) {
                        x38.app.c("AndroidGraphics", "waiting for pause synchronization failed!");
                    }
                }
            }
        }
    }

    public void v() {
        this.a.setPreserveEGLContextOnPause(true);
    }

    public void w() {
        synchronized (this.H) {
            this.u = true;
            this.w = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void x(boolean z) {
        if (this.a != null) {
            ?? r2 = (I || z) ? 1 : 0;
            this.F = r2;
            this.a.setRenderMode(r2);
        }
    }

    public void y(GL10 gl10) {
        GLVersion gLVersion = new GLVersion(Application.ApplicationType.Android, gl10.glGetString(k18.GL_VERSION), gl10.glGetString(k18.GL_VENDOR), gl10.glGetString(k18.GL_RENDERER));
        this.f14306l = gLVersion;
        if (!this.D.t || gLVersion.b() <= 2) {
            if (this.i != null) {
                return;
            }
            l20 l20Var = new l20();
            this.i = l20Var;
            x38.gl = l20Var;
            x38.gl20 = l20Var;
        } else {
            if (this.f14305j != null) {
                return;
            }
            m20 m20Var = new m20();
            this.f14305j = m20Var;
            this.i = m20Var;
            x38.gl = m20Var;
            x38.gl20 = m20Var;
            x38.gl30 = m20Var;
        }
        x38.app.c("AndroidGraphics", "OGL renderer: " + gl10.glGetString(k18.GL_RENDERER));
        x38.app.c("AndroidGraphics", "OGL vendor: " + gl10.glGetString(k18.GL_VENDOR));
        x38.app.c("AndroidGraphics", "OGL version: " + gl10.glGetString(k18.GL_VERSION));
        x38.app.c("AndroidGraphics", "OGL extensions: " + gl10.glGetString(k18.GL_EXTENSIONS));
    }

    public void z() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.h.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.xdpi;
        this.y = f;
        float f2 = displayMetrics.ydpi;
        this.z = f2;
        this.A = f / 2.54f;
        this.B = f2 / 2.54f;
        this.C = displayMetrics.density;
    }

    public n20(t10 t10Var, u10 u10Var, com.badlogic.gdx.backends.android.surfaceview.b bVar, boolean z) {
        this.f14307n = System.nanoTime();
        this.o = 0.0f;
        this.p = System.nanoTime();
        this.q = -1L;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 1.0f;
        this.E = new Graphics.a(8, 8, 8, 0, 16, 0, 0, false);
        this.F = true;
        this.G = new int[1];
        this.H = new Object();
        this.D = u10Var;
        this.h = t10Var;
        GLSurfaceView20 gLSurfaceView20L = l(t10Var, bVar);
        this.a = gLSurfaceView20L;
        v();
        if (z) {
            gLSurfaceView20L.setFocusable(true);
            gLSurfaceView20L.setFocusableInTouchMode(true);
        }
    }
}
