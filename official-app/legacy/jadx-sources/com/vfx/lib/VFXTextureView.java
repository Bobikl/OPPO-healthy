package com.vfx.lib;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import android.os.Process;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.TextureView;
import com.oplus.statistics.OplusTrack;
import com.oplusos.vfxmodelviewer.view.TrackConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes10.dex */
public class VFXTextureView extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final String G = "VFXTextureView";
    public boolean A;
    public boolean B;
    public ArrayList<Runnable> C;
    public ArrayList<Runnable> D;
    public ArrayList<Runnable> E;
    public m F;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20385j;
    public Context k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f20386l;
    public l m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20387n;
    public boolean o;
    public Runnable p;
    public VFXTextureView q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int[] w;
    public VFXRenderer x;
    public volatile boolean y;
    public boolean z;

    public enum EventType {
        Custom,
        Touch,
        TocuhMove,
        Exit
    }

    public class a implements Runnable {
        public final /* synthetic */ int[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float[] f20388j;
        public final /* synthetic */ float[] k;

        public a(int[] iArr, float[] fArr, float[] fArr2) {
            this.i = iArr;
            this.f20388j = fArr;
            this.k = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(VFXTextureView.G, "VFX--------------------ACTION_CANCEL--------------------idsCancel: " + this.i);
            VFXTextureView.this.x.handleActionCancel(this.i, this.f20388j, this.k);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float[] f20390j;
        public final /* synthetic */ float[] k;

        public b(int[] iArr, float[] fArr, float[] fArr2) {
            this.i = iArr;
            this.f20390j = fArr;
            this.k = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXTextureView.this.x.handleActionCancel(this.i, this.f20390j, this.k);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ boolean i;

        public c(boolean z) {
            this.i = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXTextureView.this.x.handleShowFPS(this.i);
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f20393j;
        public final /* synthetic */ float k;

        public d(int i, float f, float f2) {
            this.i = i;
            this.f20393j = f;
            this.k = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(VFXTextureView.G, "VFX--------------------ACTION_POINTER_DOWN--------------------idPointerDown: " + this.i);
            VFXTextureView.this.x.handleActionPointerDown(this.i, this.f20393j, this.k);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f20395j;
        public final /* synthetic */ float k;

        public e(int i, float f, float f2) {
            this.i = i;
            this.f20395j = f;
            this.k = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(VFXTextureView.G, "VFX--------------------ACTION_DOWN--------------------idDown: " + this.i);
            VFXTextureView.this.x.handleActionDown(this.i, this.f20395j, this.k);
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f20397j;
        public final /* synthetic */ float k;

        public f(int i, float f, float f2) {
            this.i = i;
            this.f20397j = f;
            this.k = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXTextureView.this.x.handleActionDown(this.i, this.f20397j, this.k);
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ int[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float[] f20399j;
        public final /* synthetic */ float[] k;

        public g(int[] iArr, float[] fArr, float[] fArr2) {
            this.i = iArr;
            this.f20399j = fArr;
            this.k = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXTextureView.this.x.handleActionMove(this.i, this.f20399j, this.k);
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ int[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float[] f20401j;
        public final /* synthetic */ float[] k;

        public h(int[] iArr, float[] fArr, float[] fArr2) {
            this.i = iArr;
            this.f20401j = fArr;
            this.k = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXTextureView.this.x.handleActionMove(this.i, this.f20401j, this.k);
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f20403j;
        public final /* synthetic */ float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f20404l;

        public i(int i, int i2, float f, float f2) {
            this.i = i;
            this.f20403j = i2;
            this.k = f;
            this.f20404l = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(VFXTextureView.G, "VFX--------------------ACTION_POINTER_UP--------------------indexPointUp: " + this.i);
            VFXTextureView.this.x.handleActionUp(this.f20403j, this.k, this.f20404l);
        }
    }

    public class j implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f20405j;
        public final /* synthetic */ float k;

        public j(int i, float f, float f2) {
            this.i = i;
            this.f20405j = f;
            this.k = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(VFXTextureView.G, "VFX--------------------ACTION_UP--------------------idUp: " + this.i);
            VFXTextureView.this.x.handleActionUp(this.i, this.f20405j, this.k);
        }
    }

    public class k implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f20407j;
        public final /* synthetic */ float k;

        public k(int i, float f, float f2) {
            this.i = i;
            this.f20407j = f;
            this.k = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXTextureView.this.x.handleActionUp(this.i, this.f20407j, this.k);
        }
    }

    public class l extends Thread {
        public Map<String, String> A;
        public Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f20409j;
        public volatile boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile int f20410l;
        public final SurfaceTexture m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public EGL10 f20411n;
        public EGLDisplay o;
        public EGLConfig p;
        public EGLContext q;
        public EGLSurface r;
        public GL10 s;
        public volatile boolean t;
        public boolean u;
        public long v;
        public int w;
        public Runnable x;
        public Runnable y;
        public Runnable z;

        public l(SurfaceTexture surfaceTexture) {
            super(VFXTextureView.this.f20386l);
            this.x = null;
            this.y = null;
            this.z = null;
            this.m = surfaceTexture;
            this.t = false;
            this.k = true;
            this.o = null;
            this.f20410l = -1;
            this.w = 0;
            this.u = true;
            this.i = new Object();
            this.f20409j = new Object();
        }

        public final void c() {
            try {
                this.i.wait();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public final void d() {
            if (this.q.equals(this.f20411n.eglGetCurrentContext()) && this.r.equals(this.f20411n.eglGetCurrentSurface(12377))) {
                return;
            }
            e();
            EGL10 egl10 = this.f20411n;
            EGLDisplay eGLDisplay = this.o;
            EGLSurface eGLSurface = this.r;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.q)) {
                e();
                return;
            }
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f20411n.eglGetError()));
        }

        public final void e() {
            int iEglGetError = this.f20411n.eglGetError();
            if (iEglGetError != 12288) {
                Log.e(VFXTextureView.G, "EGL error = 0x" + Integer.toHexString(iEglGetError));
            }
        }

        public final boolean f() {
            Log.d(VFXTextureView.G, "-----createSurface-------vfxid:" + this.f20410l);
            if (this.f20411n == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.o == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.p == null) {
                throw new RuntimeException("eglConfig not initialized");
            }
            g();
            try {
                EGLSurface eGLSurfaceEglCreateWindowSurface = this.f20411n.eglCreateWindowSurface(this.o, this.p, this.m, null);
                this.r = eGLSurfaceEglCreateWindowSurface;
                if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                    if (this.f20411n.eglGetError() == 12299) {
                        Log.e(VFXTextureView.G, "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                    }
                    return false;
                }
                if (this.f20411n.eglMakeCurrent(this.o, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.q)) {
                    return true;
                }
                Log.e(VFXTextureView.G, "eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f20411n.eglGetError()));
                return false;
            } catch (IllegalArgumentException e2) {
                Log.e(VFXTextureView.G, "eglCreateWindowSurface", e2);
                return false;
            }
        }

        public final void g() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.r;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f20411n.eglMakeCurrent(this.o, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f20411n.eglDestroySurface(this.o, this.r);
            this.r = null;
        }

        public final void h() {
            Log.d(VFXTextureView.G, "VFX------Thread exit " + this.f20410l + "--------" + VFXTextureView.this.getThreadInfo());
            this.f20411n.eglDestroyContext(this.o, this.q);
            this.f20411n.eglTerminate(this.o);
            this.f20411n.eglDestroySurface(this.o, this.r);
            this.o = null;
            this.q = null;
            this.r = null;
            VFXRenderer vFXRenderer = VFXTextureView.this.x;
            VFXRenderer.nativePurgeVFX(this.f20410l);
            VFXTextureView.this.m = null;
            Log.d(VFXTextureView.G, "VFX-----Thread-------finish" + VFXTextureView.this.getThreadInfo());
        }

        public final void i() {
            int i;
            this.f20410l = VFXTextureView.this.i;
            Log.d(VFXTextureView.G, "VFX-------initGL------vfxid:" + this.f20410l + VFXTextureView.this.getThreadInfo());
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f20411n = egl10;
            if (this.o == null) {
                this.o = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            }
            EGLDisplay eGLDisplay = this.o;
            if (eGLDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(this.f20411n.eglGetError()));
            }
            if (!this.f20411n.eglInitialize(eGLDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(this.f20411n.eglGetError()));
            }
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[][] iArr2 = new int[4][];
            int[] iArr3 = new int[19];
            iArr3[0] = 12324;
            iArr3[1] = VFXTextureView.this.w[0];
            iArr3[2] = 12323;
            iArr3[3] = VFXTextureView.this.w[1];
            iArr3[4] = 12322;
            iArr3[5] = VFXTextureView.this.w[2];
            iArr3[6] = 12321;
            iArr3[7] = VFXTextureView.this.w[3];
            iArr3[8] = 12325;
            iArr3[9] = VFXTextureView.this.w[4];
            iArr3[10] = 12326;
            iArr3[11] = VFXTextureView.this.w[5];
            iArr3[12] = 12338;
            iArr3[13] = VFXTextureView.this.w[6] > 0 ? 1 : 0;
            iArr3[14] = 12337;
            iArr3[15] = VFXTextureView.this.w[6];
            iArr3[16] = 12352;
            iArr3[17] = 64;
            int i2 = 12344;
            iArr3[18] = 12344;
            iArr2[0] = iArr3;
            int[] iArr4 = new int[19];
            iArr4[0] = 12324;
            iArr4[1] = VFXTextureView.this.w[0];
            iArr4[2] = 12323;
            iArr4[3] = VFXTextureView.this.w[1];
            iArr4[4] = 12322;
            iArr4[5] = VFXTextureView.this.w[2];
            iArr4[6] = 12321;
            iArr4[7] = VFXTextureView.this.w[3];
            iArr4[8] = 12325;
            iArr4[9] = VFXTextureView.this.w[4] >= 24 ? 16 : VFXTextureView.this.w[4];
            iArr4[10] = 12326;
            iArr4[11] = VFXTextureView.this.w[5];
            iArr4[12] = 12338;
            iArr4[13] = VFXTextureView.this.w[6] > 0 ? 1 : 0;
            iArr4[14] = 12337;
            iArr4[15] = VFXTextureView.this.w[6];
            iArr4[16] = 12352;
            iArr4[17] = 64;
            iArr4[18] = 12344;
            iArr2[1] = iArr4;
            int[] iArr5 = new int[19];
            iArr5[0] = 12324;
            iArr5[1] = VFXTextureView.this.w[0];
            iArr5[2] = 12323;
            iArr5[3] = VFXTextureView.this.w[1];
            iArr5[4] = 12322;
            iArr5[5] = VFXTextureView.this.w[2];
            iArr5[6] = 12321;
            iArr5[7] = VFXTextureView.this.w[3];
            iArr5[8] = 12325;
            iArr5[9] = VFXTextureView.this.w[4] >= 24 ? 16 : VFXTextureView.this.w[4];
            iArr5[10] = 12326;
            iArr5[11] = VFXTextureView.this.w[5];
            iArr5[12] = 12338;
            iArr5[13] = 0;
            iArr5[14] = 12337;
            iArr5[15] = 0;
            iArr5[16] = 12352;
            iArr5[17] = 64;
            iArr5[18] = 12344;
            iArr2[2] = iArr5;
            iArr2[3] = new int[]{12352, 64, 12344};
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= 4) {
                    i = i2;
                    break;
                }
                i = i2;
                if (this.f20411n.eglChooseConfig(this.o, iArr2[i3], eGLConfigArr, 1, iArr) && iArr[0] > 0) {
                    this.p = eGLConfigArr[0];
                    Log.d(VFXTextureView.G, "ChooseConfig: " + i4);
                    break;
                }
                i4++;
                i3++;
                i2 = i;
            }
            EGLConfig eGLConfig = this.p;
            if (eGLConfig == null) {
                throw new RuntimeException("eglChooseConfig failed: bad config!");
            }
            int[] iArr6 = {12440, 3, i};
            if (this.q == null) {
                this.q = this.f20411n.eglCreateContext(this.o, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr6);
                e();
            }
            this.r = this.f20411n.eglCreateWindowSurface(this.o, this.p, this.m, null);
            e();
            EGLSurface eGLSurface = this.r;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                int iEglGetError = this.f20411n.eglGetError();
                if (iEglGetError == 12299) {
                    Log.e(VFXTextureView.G, "eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                    return;
                }
                throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(iEglGetError));
            }
            if (this.f20411n.eglMakeCurrent(this.o, eGLSurface, eGLSurface, this.q)) {
                e();
                this.s = (GL10) this.q.getGL();
                e();
            } else {
                throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f20411n.eglGetError()));
            }
        }

        public synchronized void j(int i, int i2) {
            VFXTextureView vFXTextureView = VFXTextureView.this;
            if (!vFXTextureView.v) {
                vFXTextureView.s = i2;
                VFXTextureView.this.r = i;
            }
            this.t = true;
        }

        public boolean k(Runnable runnable, EventType eventType) {
            if (VFXTextureView.this.y && eventType != EventType.Exit) {
                return false;
            }
            if (runnable == null) {
                Log.e(VFXTextureView.G, "queueEvent error: r must not be null");
                return false;
            }
            synchronized (this.f20409j) {
                if (eventType == EventType.Custom) {
                    VFXTextureView.this.E.add(runnable);
                } else if (eventType == EventType.Touch) {
                    VFXTextureView.this.C.add(runnable);
                } else if (eventType == EventType.TocuhMove) {
                    VFXTextureView.this.D.add(runnable);
                } else {
                    VFXTextureView.this.E.add(runnable);
                }
            }
            return true;
        }

        public final void l(int i) {
            synchronized (this.i) {
                Log.d(VFXTextureView.G, "notify GlThread quit-VfxId:" + i);
                VFXTextureView.this.m.f20410l = i;
                this.k = false;
                m();
            }
        }

        public final void m() {
            synchronized (this.i) {
                this.i.notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Runnable runnable;
            Runnable runnable2;
            Log.d(VFXTextureView.G, "---------------RenderThread start run------" + VFXTextureView.this.getThreadInfo());
            Trace.beginSection("VFXGLRunInit");
            if (VFXTextureView.this.t > 0) {
                Trace.beginSection("VFXBindCPU");
                VFXTextureView vFXTextureView = VFXTextureView.this;
                vFXTextureView.nativeBindCPU(vFXTextureView.t);
                Trace.endSection();
            }
            VFXTextureView vFXTextureView2 = VFXTextureView.this;
            vFXTextureView2.nativeEnableUiFirst(vFXTextureView2.u);
            Trace.beginSection("VFXInitGL");
            i();
            Trace.endSection();
            VFXTextureView vFXTextureView3 = VFXTextureView.this;
            vFXTextureView3.x.setScreenWidthAndHeight(vFXTextureView3.r, VFXTextureView.this.s);
            Trace.beginSection("VFXRenderOnSurfaceCreated");
            VFXTextureView vFXTextureView4 = VFXTextureView.this;
            vFXTextureView4.x.setVFXID(vFXTextureView4.i);
            VFXTextureView.this.x.onSurfaceCreated(this.s, this.p);
            Trace.endSection();
            Trace.endSection();
            do {
                synchronized (this.i) {
                    while (this.k) {
                        try {
                            if (!VFXTextureView.this.y) {
                                VFXTextureView vFXTextureView5 = VFXTextureView.this;
                                if (!vFXTextureView5.z || vFXTextureView5.A) {
                                    break;
                                }
                            }
                            VFXTextureView.this.A = false;
                            c();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (this.k) {
                    d();
                    if (this.t && VFXTextureView.this.B) {
                        f();
                        VFXTextureView vFXTextureView6 = VFXTextureView.this;
                        vFXTextureView6.x.onSurfaceChanged(this.s, vFXTextureView6.r, VFXTextureView.this.s);
                        this.t = false;
                    }
                    if (!VFXTextureView.this.E.isEmpty()) {
                        synchronized (this.f20409j) {
                            runnable2 = (Runnable) VFXTextureView.this.E.remove(0);
                            this.x = runnable2;
                        }
                        if (runnable2 != null) {
                            runnable2.run();
                            this.x = null;
                        }
                    }
                    if (!VFXTextureView.this.D.isEmpty()) {
                        synchronized (this.f20409j) {
                            this.z = (Runnable) VFXTextureView.this.D.get(VFXTextureView.this.D.size() - 1);
                            VFXTextureView.this.D.clear();
                        }
                        Runnable runnable3 = this.z;
                        if (runnable3 != null) {
                            runnable3.run();
                            this.z = null;
                        }
                    }
                    if (!VFXTextureView.this.C.isEmpty()) {
                        synchronized (this.f20409j) {
                            runnable = (Runnable) VFXTextureView.this.C.remove(0);
                            this.y = runnable;
                        }
                        if (runnable != null) {
                            runnable.run();
                            this.y = null;
                        }
                    }
                    if (this.k) {
                        VFXTextureView vFXTextureView7 = VFXTextureView.this;
                        if (vFXTextureView7.f20385j == 2 && this.u) {
                            int i = this.w;
                            if (i > 60) {
                                this.u = false;
                                OplusTrack.init(vFXTextureView7.k);
                                this.A.put("CurTime", new SimpleDateFormat("MM/dd/HH:mm:ss:SSS").format(new Date(System.currentTimeMillis())));
                                OplusTrack.onCommon(VFXTextureView.this.k, TrackConfig.app_id, "display", "22010", this.A);
                                Log.i(VFXTextureView.G, "GLThread not destroyed");
                            } else if (i == 0) {
                                HashMap map = new HashMap();
                                this.A = map;
                                map.put("PID", String.valueOf(Process.myPid()));
                                this.A.put("TID", String.valueOf(Process.myTid()));
                                this.A.put("VfxID", String.valueOf(this.f20410l));
                                this.v = System.currentTimeMillis();
                                this.A.put("UIDestroyedTime", new SimpleDateFormat("MM/dd/HH:mm:ss:SSS").format(Long.valueOf(this.v)));
                                this.A.put("ThreadName", VFXTextureView.this.f20386l);
                                this.A.put("ContextName", VFXTextureView.this.k.getClass().getSimpleName());
                                this.w++;
                            } else {
                                this.w = i + 1;
                            }
                        }
                        VFXTextureView.this.x.onDrawFrame(this.s);
                    } else {
                        Log.d(VFXTextureView.G, "GlThread quitting---" + VFXTextureView.this.getThreadInfo());
                    }
                } else {
                    Log.d(VFXTextureView.G, "GlThread quitting" + VFXTextureView.this.getThreadInfo());
                }
                h();
                return;
            } while (this.f20411n.eglSwapBuffers(this.o, this.r));
            throw new RuntimeException("Cannot swap buffers");
        }
    }

    public interface m {
        void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2);

        boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture);

        void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2);

        void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);
    }

    public VFXTextureView(Context context) {
        super(context, null);
        this.i = -1;
        this.f20386l = "VFXGLThread";
        this.m = null;
        this.f20387n = true;
        this.o = false;
        this.p = null;
        this.w = new int[]{8, 8, 8, 8, 32, 8, 4};
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = null;
        p(context);
        Log.d(G, "Created by " + context.getClass().getSimpleName() + ", version: VFXEngine-1.2.11");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeBindCPU(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeEnableUiFirst(int i2);

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        if (this.m == null || !this.z) {
            return;
        }
        if (!this.y) {
            this.A = true;
            this.m.m();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }

    public VFXTextureView getInstance() {
        return this.q;
    }

    public String getThreadInfo() {
        return " TName:" + this.f20386l + " VfxID:" + this.i;
    }

    public void o() {
        Log.d(G, "VFX-----------VFXTextureView-----------disableChoreographer");
        this.z = false;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        Log.d(G, "VFX-----------VFXTextureView-----------onAttachedToWindow vfxID:" + this.i + " VFXEngine-1.2.11");
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Log.d(G, "VFX-----------VFXTextureView-----------onDetachedFromWindow vfxID:" + this.i + " VFXEngine-1.2.11");
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.m != null) {
            Log.d(G, "VFX--------------------onSurfaceTextureAvailable  GlThread has started W/H: " + i2 + "/" + i3 + getThreadInfo());
            this.r = i2;
            this.s = i3;
            this.m.j(i2, i3);
            return;
        }
        this.r = i2;
        this.s = i3;
        m mVar = this.F;
        if (mVar != null) {
            mVar.onSurfaceTextureAvailable(surfaceTexture, i2, i3);
        }
        this.f20385j = 1;
        l lVar = new l(surfaceTexture);
        this.m = lVar;
        lVar.start();
        Log.d(G, "VFX--------------------onSurfaceTextureAvailable  GlThread.start  W/H: " + i2 + "/" + i3 + getThreadInfo());
        Runnable runnable = this.p;
        if (runnable != null) {
            this.m.k(runnable, EventType.Custom);
        }
        if (this.z) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.d(G, "VFX-----onSurfaceTextureDestroyed -----VfxId:" + this.i);
        this.f20385j = 2;
        u(this.i);
        m mVar = this.F;
        if (mVar == null) {
            return false;
        }
        mVar.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        Log.d(G, "VFX-----onSurfaceTextureSizeChanged, W/H: " + i2 + "/" + i3 + getThreadInfo());
        this.m.j(i2, i3);
        m mVar = this.F;
        if (mVar != null) {
            mVar.onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        m mVar = this.F;
        if (mVar != null) {
            mVar.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2 = 0;
        if (!this.f20387n) {
            return false;
        }
        int pointerCount = motionEvent.getPointerCount();
        int[] iArr = new int[pointerCount];
        float[] fArr = new float[pointerCount];
        float[] fArr2 = new float[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            iArr[i3] = motionEvent.getPointerId(i3);
            fArr[i3] = motionEvent.getX(i3);
            fArr2[i3] = motionEvent.getY(i3);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            int pointerId = motionEvent.getPointerId(0);
            float f2 = fArr[0];
            float f3 = fArr2[0];
            if (this.o) {
                s(new f(pointerId, f2, f3));
            } else {
                while (i2 < pointerCount) {
                    if (iArr[i2] == 0) {
                        s(new e(pointerId, f2, f3));
                        break;
                    }
                    i2++;
                }
            }
        } else if (action == 1) {
            int pointerId2 = motionEvent.getPointerId(0);
            float f4 = fArr[0];
            float f5 = fArr2[0];
            if (this.o) {
                s(new k(pointerId2, f4, f5));
            } else {
                while (i2 < pointerCount) {
                    if (iArr[i2] == 0) {
                        t(new j(pointerId2, f4, f5));
                        break;
                    }
                    i2++;
                }
            }
        } else if (action != 2) {
            if (action != 3) {
                if (action == 5) {
                    int action2 = motionEvent.getAction() >> 8;
                    s(new d(motionEvent.getPointerId(action2), motionEvent.getX(action2), motionEvent.getY(action2)));
                } else if (action == 6) {
                    int action3 = motionEvent.getAction() >> 8;
                    if (this.o || action3 == 0) {
                        s(new i(action3, motionEvent.getPointerId(action3), motionEvent.getX(action3), motionEvent.getY(action3)));
                    }
                }
            } else if (this.o) {
                s(new b(iArr, fArr, fArr2));
            } else {
                for (int i4 = 0; i4 < pointerCount; i4++) {
                    if (iArr[i4] == 0) {
                        s(new a(new int[]{0}, new float[]{fArr[i4]}, new float[]{fArr2[i4]}));
                        break;
                    }
                }
            }
        } else if (this.o) {
            t(new h(iArr, fArr, fArr2));
        } else {
            for (int i5 = 0; i5 < pointerCount; i5++) {
                if (iArr[i5] == 0) {
                    t(new g(new int[]{0}, new float[]{fArr[i5]}, new float[]{fArr2[i5]}));
                    break;
                }
            }
        }
        return true;
    }

    public final void p(Context context) {
        setSurfaceTextureListener(this);
        this.i = -1;
        this.q = this;
        setOpaque(false);
        this.y = false;
        this.t = 6;
        this.u = 0;
        this.v = true;
        this.B = false;
        this.z = true;
        this.A = false;
        this.f20385j = 0;
        this.k = context;
    }

    public void q() {
        String str = G;
        Log.d(str, "Resume VfxId:" + this.i);
        l lVar = this.m;
        if (lVar == null) {
            Log.d(str, "mGlThread is null");
        } else {
            this.y = false;
            lVar.m();
        }
    }

    public boolean r(Runnable runnable) {
        l lVar = this.m;
        if (lVar != null) {
            return lVar.k(runnable, EventType.Custom);
        }
        Log.d(G, "queueEvent: GlThread is null");
        return false;
    }

    public boolean s(Runnable runnable) {
        l lVar = this.m;
        if (lVar != null) {
            return lVar.k(runnable, EventType.Touch);
        }
        Log.d(G, "queueTouchEvent: GlThread is null");
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f2) {
        super.setAlpha(f2);
    }

    public void setPreProcess(Runnable runnable) {
        this.p = runnable;
    }

    public void setTextureViewEngineControl(m mVar) {
        this.F = mVar;
    }

    public void setTouchEnable(boolean z) {
        Log.d(G, "setTouchEnable: " + z);
        this.f20387n = z;
    }

    public void setUiFirstFlag(int i2) {
        Log.d(G, "setUiFirstFlag: " + i2);
        this.u = i2;
    }

    public void setVFXID(int i2) {
        this.i = i2;
        Log.d(G, "setVFXID: " + i2 + getThreadInfo());
    }

    public synchronized void setVFXPaused(boolean z) {
        this.y = z;
        if (z) {
            Log.d(G, "Pause VfxId:" + this.i);
        } else {
            String str = G;
            Log.d(str, "Resume VfxId:" + this.i);
            l lVar = this.m;
            if (lVar != null) {
                lVar.m();
            } else {
                Log.d(str, "mGlThread not start");
            }
        }
    }

    public void setVFXRenderer(VFXRenderer vFXRenderer) {
        Log.d(G, "VFX--------------------setVFXRenderer--------------------" + getThreadInfo());
        this.x = vFXRenderer;
    }

    public boolean t(Runnable runnable) {
        l lVar = this.m;
        if (lVar != null) {
            return lVar.k(runnable, EventType.TocuhMove);
        }
        Log.d(G, "queueTouchMoveEvent: GlThread is null");
        return false;
    }

    public void u(int i2) {
        l lVar = this.m;
        if (lVar != null) {
            lVar.l(i2);
        }
    }

    public void v() {
        if (this.x != null) {
            Log.d(G, "VFX-----refreshSize-----handleSurfaceChanged, W/H: " + this.r + "/" + this.s);
            this.x.handleSurfaceChanged(this.r, this.s);
        }
    }

    public void w(boolean z) {
        r(new c(z));
    }

    public VFXTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = -1;
        this.f20386l = "VFXGLThread";
        this.m = null;
        this.f20387n = true;
        this.o = false;
        this.p = null;
        this.w = new int[]{8, 8, 8, 8, 32, 8, 4};
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = null;
        p(context);
    }

    public VFXTextureView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = -1;
        this.f20386l = "VFXGLThread";
        this.m = null;
        this.f20387n = true;
        this.o = false;
        this.p = null;
        this.w = new int[]{8, 8, 8, 8, 32, 8, 4};
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = null;
        p(context);
    }
}
