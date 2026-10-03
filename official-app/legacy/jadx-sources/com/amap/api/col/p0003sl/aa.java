package com.amap.api.col.p0003sl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.TextureView;
import com.amap.api.maps.MapsInitializer;
import com.heytap.mcssdk.constant.MessageConstant$CommandId;
import com.oplus.aiunit.vision.k18;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes12.dex */
@SuppressLint({"NewApi"})
public class aa extends TextureView implements TextureView.SurfaceTextureListener {
    public static final j s = new j(0);
    public final WeakReference<aa> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f644j;
    public GLSurfaceView.Renderer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f645l;
    public e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f646n;
    public g o;
    public int p;
    public int q;
    public boolean r;

    public abstract class a implements e {
        public int[] a;

        public a(int[] iArr) {
            this.a = b(iArr);
        }

        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public final int[] b(int[] iArr) {
            if (aa.this.q != 2 && aa.this.q != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (aa.this.q == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        @Override // com.amap.api.col.3sl.aa.e
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.a, eGLConfigArr, i, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig eGLConfigA = a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigA != null) {
                return eGLConfigA;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }

    public class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f647c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f648e;
        public int f;
        public int g;
        public int h;
        public int i;

        public b() {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 16, 12326, 0, 12344});
            this.f647c = new int[1];
            this.d = 8;
            this.f648e = 8;
            this.f = 8;
            this.g = 0;
            this.h = 16;
            this.i = 0;
        }

        @Override // com.amap.api.col.3sl.aa.a
        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iC = c(egl10, eGLDisplay, eGLConfig, 12325);
                int iC2 = c(egl10, eGLDisplay, eGLConfig, 12326);
                if (iC >= this.h && iC2 >= this.i) {
                    int iC3 = c(egl10, eGLDisplay, eGLConfig, 12324);
                    int iC4 = c(egl10, eGLDisplay, eGLConfig, 12323);
                    int iC5 = c(egl10, eGLDisplay, eGLConfig, 12322);
                    int iC6 = c(egl10, eGLDisplay, eGLConfig, 12321);
                    if (iC3 == this.d && iC4 == this.f648e && iC5 == this.f && iC6 == this.g) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        public final int c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f647c)) {
                return this.f647c[0];
            }
            return 0;
        }
    }

    public class c implements f {
        public c() {
        }

        @Override // com.amap.api.col.3sl.aa.f
        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {12440, aa.this.q, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (aa.this.q == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // com.amap.api.col.3sl.aa.f
        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            h.c("eglDestroyContex", egl10.eglGetError());
        }

        public /* synthetic */ c(aa aaVar, byte b) {
            this();
        }
    }

    public static class d implements g {
        public d() {
        }

        public /* synthetic */ d(byte b) {
            this();
        }

        @Override // com.amap.api.col.3sl.aa.g
        public final EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e2) {
                Log.e("GLSurfaceView", "eglCreateWindowSurface", e2);
                return null;
            }
        }

        @Override // com.amap.api.col.3sl.aa.g
        public final void b(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    public interface e {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface f {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface g {
        EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void b(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    public static class h {
        public WeakReference<aa> a;
        public EGL10 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EGLDisplay f650c;
        public EGLSurface d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public EGLConfig f651e;
        public EGLContext f;

        public h(WeakReference<aa> weakReference) {
            this.a = weakReference;
        }

        public static void c(String str, int i) {
            throw new RuntimeException(e(str, i));
        }

        public static void d(String str, String str2, int i) {
            Log.w(str, e(str2, i));
        }

        public static String e(String str, int i) {
            return str + " failed: " + i;
        }

        public final void a() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.b = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f650c = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            aa aaVar = this.a.get();
            if (aaVar == null) {
                this.f651e = null;
                this.f = null;
            } else {
                this.f651e = aaVar.m.chooseConfig(this.b, this.f650c);
                this.f = aaVar.f646n.createContext(this.b, this.f650c, this.f651e);
            }
            EGLContext eGLContext = this.f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f = null;
                b("createContext");
            }
            this.d = null;
        }

        public final void b(String str) {
            c(str, this.b.eglGetError());
        }

        public final boolean f() {
            if (this.b == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f650c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.f651e == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            k();
            aa aaVar = this.a.get();
            if (aaVar != null) {
                this.d = aaVar.o.a(this.b, this.f650c, this.f651e, aaVar.getSurfaceTexture());
            } else {
                this.d = null;
            }
            EGLSurface eGLSurface = this.d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.b.eglMakeCurrent(this.f650c, eGLSurface, eGLSurface, this.f)) {
                return true;
            }
            d("EGLHelper", "eglMakeCurrent", this.b.eglGetError());
            return false;
        }

        public final GL g() {
            GL gl = this.f.getGL();
            aa aaVar = this.a.get();
            if (aaVar == null) {
                return gl;
            }
            aa.k(aaVar);
            if ((aaVar.p & 3) != 0) {
                return GLDebugHelper.wrap(gl, (aaVar.p & 1) == 0 ? 0 : 1, (aaVar.p & 2) != 0 ? new l() : null);
            }
            return gl;
        }

        public final int h() {
            return !this.b.eglSwapBuffers(this.f650c, this.d) ? this.b.eglGetError() : MessageConstant$CommandId.COMMAND_BASE;
        }

        public final void i() {
            k();
        }

        public final void j() {
            if (this.f != null) {
                aa aaVar = this.a.get();
                if (aaVar != null) {
                    aaVar.f646n.destroyContext(this.b, this.f650c, this.f);
                }
                this.f = null;
            }
            EGLDisplay eGLDisplay = this.f650c;
            if (eGLDisplay != null) {
                this.b.eglTerminate(eGLDisplay);
                this.f650c = null;
            }
        }

        public final void k() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.b.eglMakeCurrent(this.f650c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            aa aaVar = this.a.get();
            if (aaVar != null) {
                aaVar.o.b(this.b, this.f650c, this.d);
            }
            this.d = null;
        }
    }

    public static class i extends Thread {
        public h A;
        public WeakReference<aa> B;
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f652j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f653l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f654n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public boolean s;
        public boolean x;
        public ArrayList<Runnable> y = new ArrayList<>();
        public boolean z = true;
        public int t = 0;
        public int u = 0;
        public boolean w = true;
        public int v = 1;

        public i(WeakReference<aa> weakReference) {
            this.B = weakReference;
        }

        public static /* synthetic */ boolean e(i iVar) {
            iVar.f652j = true;
            return true;
        }

        public final int a() {
            int i;
            synchronized (aa.s) {
                i = this.v;
            }
            return i;
        }

        public final void b(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (aa.s) {
                this.v = i;
                aa.s.notifyAll();
            }
        }

        public final void c(int i, int i2) {
            synchronized (aa.s) {
                this.t = i;
                this.u = i2;
                this.z = true;
                this.w = true;
                this.x = false;
                aa.s.notifyAll();
                while (!this.f652j && !this.f653l && !this.x && r()) {
                    try {
                        aa.s.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void d(Runnable runnable) {
            if (runnable == null) {
                throw new IllegalArgumentException("r must not be null");
            }
            synchronized (aa.s) {
                this.y.add(runnable);
                aa.s.notifyAll();
            }
        }

        public final void f() {
            synchronized (aa.s) {
                this.w = true;
                aa.s.notifyAll();
            }
        }

        public final void g() {
            synchronized (aa.s) {
                this.m = true;
                this.r = false;
                aa.s.notifyAll();
                while (this.o && !this.r && !this.f652j) {
                    try {
                        aa.s.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void h() {
            synchronized (aa.s) {
                this.m = false;
                aa.s.notifyAll();
                while (!this.o && !this.f652j) {
                    try {
                        if (MapsInitializer.getTextureViewDestorySync()) {
                            aa.s.wait();
                        } else {
                            aa.s.wait(2000L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void i() {
            synchronized (aa.s) {
                this.k = true;
                aa.s.notifyAll();
                while (!this.f652j && !this.f653l) {
                    try {
                        if (MapsInitializer.getTextureViewDestorySync()) {
                            aa.s.wait();
                        } else {
                            aa.s.wait(2000L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void j() {
            synchronized (aa.s) {
                this.k = false;
                this.w = true;
                this.x = false;
                aa.s.notifyAll();
                while (!this.f652j && this.f653l && !this.x) {
                    try {
                        aa.s.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void k() {
            synchronized (aa.s) {
                this.i = true;
                aa.s.notifyAll();
                while (!this.f652j) {
                    try {
                        aa.s.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void l() {
            this.s = true;
            aa.s.notifyAll();
        }

        public final int m() {
            int i;
            synchronized (aa.s) {
                i = this.t;
            }
            return i;
        }

        public final int n() {
            int i;
            synchronized (aa.s) {
                i = this.u;
            }
            return i;
        }

        public final void o() {
            if (this.q) {
                this.q = false;
                this.A.i();
            }
        }

        public final void p() {
            if (this.p) {
                this.A.j();
                this.p = false;
                aa.s.g(this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:170:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public final void q() throws InterruptedException {
            boolean z;
            boolean z2;
            this.A = new h(this.B);
            this.p = false;
            this.q = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i = 0;
            int i2 = 0;
            boolean z10 = false;
            GL10 gl10 = null;
            while (true) {
                Runnable runnableRemove = null;
                while (true) {
                    try {
                        synchronized (aa.s) {
                            while (true) {
                                if (this.i) {
                                    synchronized (aa.s) {
                                        o();
                                        p();
                                    }
                                    return;
                                }
                                if (!this.y.isEmpty()) {
                                    runnableRemove = this.y.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z11 = this.f653l;
                                boolean z12 = this.k;
                                if (z11 != z12) {
                                    this.f653l = z12;
                                    aa.s.notifyAll();
                                } else {
                                    z12 = false;
                                }
                                if (this.s) {
                                    o();
                                    p();
                                    this.s = false;
                                    z5 = true;
                                }
                                if (z3) {
                                    o();
                                    p();
                                    z3 = false;
                                }
                                if (z12 && this.q) {
                                    o();
                                }
                                if (z12 && this.p) {
                                    aa aaVar = this.B.get();
                                    if (!(aaVar == null ? false : aaVar.r) || aa.s.c()) {
                                        p();
                                    }
                                }
                                if (z12 && aa.s.d()) {
                                    this.A.j();
                                }
                                if (!this.m && !this.o) {
                                    if (this.q) {
                                        o();
                                    }
                                    this.o = true;
                                    this.f654n = false;
                                    aa.s.notifyAll();
                                }
                                if (this.m && this.o) {
                                    this.o = false;
                                    aa.s.notifyAll();
                                }
                                if (z4) {
                                    this.x = true;
                                    aa.s.notifyAll();
                                    z4 = false;
                                    z10 = false;
                                }
                                if (s()) {
                                    if (!this.p) {
                                        if (z5) {
                                            z5 = false;
                                        } else if (aa.s.e(this)) {
                                            try {
                                                this.A.a();
                                                this.p = true;
                                                aa.s.notifyAll();
                                                z6 = true;
                                            } catch (RuntimeException e2) {
                                                aa.s.g(this);
                                                throw e2;
                                            }
                                        }
                                    }
                                    if (this.p && !this.q) {
                                        this.q = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (this.q) {
                                        if (this.z) {
                                            int i3 = this.t;
                                            int i4 = this.u;
                                            this.z = false;
                                            i = i3;
                                            i2 = i4;
                                            z = false;
                                            z7 = true;
                                            z9 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.w = z;
                                        aa.s.notifyAll();
                                        break;
                                    }
                                }
                                aa.s.wait();
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z7) {
                            if (this.A.f()) {
                                synchronized (aa.s) {
                                    this.r = true;
                                    aa.s.notifyAll();
                                }
                                z7 = z;
                            } else {
                                synchronized (aa.s) {
                                    this.r = true;
                                    this.f654n = true;
                                    aa.s.notifyAll();
                                }
                            }
                            synchronized (aa.s) {
                                o();
                                p();
                                throw th;
                            }
                        }
                        if (z8) {
                            gl10 = (GL10) this.A.g();
                            aa.s.b(gl10);
                            z8 = z;
                        }
                        if (z6) {
                            aa aaVar2 = this.B.get();
                            if (aaVar2 != null) {
                                aaVar2.k.onSurfaceCreated(gl10, this.A.f651e);
                            }
                            z6 = z;
                        }
                        if (z9) {
                            aa aaVar3 = this.B.get();
                            if (aaVar3 != null) {
                                aaVar3.k.onSurfaceChanged(gl10, i, i2);
                            }
                            z9 = z;
                        }
                        aa aaVar4 = this.B.get();
                        if (aaVar4 != null) {
                            aaVar4.k.onDrawFrame(gl10);
                        }
                        int iH = this.A.h();
                        if (iH == 12288) {
                            z2 = true;
                        } else if (iH != 12302) {
                            h.d("GLThread", "eglSwapBuffers", iH);
                            synchronized (aa.s) {
                                z2 = true;
                                this.f654n = true;
                                aa.s.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z3 = true;
                        }
                        if (z10) {
                            z4 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (aa.s) {
                            o();
                            p();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        public final boolean r() {
            return this.p && this.q && s();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("GLThread " + getId());
            try {
                q();
            } catch (InterruptedException unused) {
            } finally {
                aa.s.a(this);
            }
        }

        public final boolean s() {
            if (this.f653l || !this.m || this.f654n || this.t <= 0 || this.u <= 0) {
                return false;
            }
            return this.w || this.v == 1;
        }
    }

    public static class j {
        public boolean a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f655c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f656e;
        public i f;

        public j() {
        }

        public /* synthetic */ j(byte b) {
            this();
        }

        public final synchronized void a(i iVar) {
            i.e(iVar);
            if (this.f == iVar) {
                this.f = null;
            }
            notifyAll();
        }

        public final synchronized void b(GL10 gl10) {
            if (!this.f655c && gl10 != null) {
                f();
                String strGlGetString = gl10.glGetString(k18.GL_RENDERER);
                if (this.b < 131072) {
                    this.d = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                    notifyAll();
                }
                this.f656e = this.d ? false : true;
                this.f655c = true;
            }
        }

        public final synchronized boolean c() {
            return this.f656e;
        }

        public final synchronized boolean d() {
            f();
            return !this.d;
        }

        public final boolean e(i iVar) {
            i iVar2 = this.f;
            if (iVar2 == iVar || iVar2 == null) {
                this.f = iVar;
                notifyAll();
                return true;
            }
            f();
            if (this.d) {
                return true;
            }
            i iVar3 = this.f;
            if (iVar3 == null) {
                return false;
            }
            iVar3.l();
            return false;
        }

        public final void f() {
            if (this.a) {
                return;
            }
            this.b = 131072;
            this.d = true;
            this.a = true;
        }

        public final void g(i iVar) {
            if (this.f == iVar) {
                this.f = null;
            }
            notifyAll();
        }
    }

    public interface k {
    }

    public static class l extends Writer {
        public StringBuilder i = new StringBuilder();

        public final void a() {
            if (this.i.length() > 0) {
                Log.v("GLSurfaceView", this.i.toString());
                StringBuilder sb = this.i;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            a();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c2 = cArr[i + i3];
                if (c2 == '\n') {
                    a();
                } else {
                    this.i.append(c2);
                }
            }
        }
    }

    public class m extends b {
        public m() {
            super();
        }
    }

    public aa(Context context) {
        super(context, null);
        this.i = new WeakReference<>(this);
        b();
    }

    public static /* synthetic */ k k(aa aaVar) {
        aaVar.getClass();
        return null;
    }

    public static boolean n() {
        return false;
    }

    public final void b() {
        setSurfaceTextureListener(this);
    }

    public final void c(e eVar) {
        l();
        this.m = eVar;
    }

    public final void d(f fVar) {
        l();
        this.f646n = fVar;
    }

    public void f() {
        this.f644j.i();
    }

    public void finalize() throws Throwable {
        try {
            i iVar = this.f644j;
            if (iVar != null) {
                iVar.k();
            }
        } finally {
            super.finalize();
        }
    }

    public int getRenderMode() {
        return this.f644j.a();
    }

    public void h() {
        this.f644j.j();
    }

    public final void l() {
        if (this.f644j != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f645l && this.k != null) {
            i iVar = this.f644j;
            int iA = iVar != null ? iVar.a() : 1;
            i iVar2 = new i(this.i);
            this.f644j = iVar2;
            if (iA != 1) {
                iVar2.b(iA);
            }
            this.f644j.start();
        }
        this.f645l = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        i iVar = this.f644j;
        if (iVar != null) {
            iVar.k();
        }
        this.f645l = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        onSurfaceTextureSizeChanged(getSurfaceTexture(), i4 - i2, i5 - i3);
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.f644j.g();
        if (n() || MapsInitializer.getTextureSizeChangedInvoked()) {
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        } else {
            if (this.f644j.m() == i2 && this.f644j.n() == i3) {
                return;
            }
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f644j.h();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.f644j.c(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void queueEvent(Runnable runnable) {
        this.f644j.d(runnable);
    }

    public void requestRender() {
        this.f644j.f();
    }

    public void setRenderMode(int i2) {
        this.f644j.b(i2);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        l();
        if (this.m == null) {
            this.m = new m();
        }
        byte b2 = 0;
        if (this.f646n == null) {
            this.f646n = new c(this, b2);
        }
        if (this.o == null) {
            this.o = new d(b2);
        }
        this.k = renderer;
        i iVar = new i(this.i);
        this.f644j = iVar;
        iVar.start();
    }
}
