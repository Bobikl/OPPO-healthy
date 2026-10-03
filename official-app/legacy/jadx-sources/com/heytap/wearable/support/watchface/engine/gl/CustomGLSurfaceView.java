package com.heytap.wearable.support.watchface.engine.gl;

import android.content.Context;
import android.opengl.GLDebugHelper;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.heytap.mcssdk.constant.MessageConstant$CommandId;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import com.heytap.wearable.support.watchface.common.utils.AppExecutors;
import com.oplus.aiunit.vision.bc6;
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

/* JADX INFO: loaded from: classes2.dex */
public class CustomGLSurfaceView extends SurfaceView implements SurfaceHolder.Callback2 {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    private static final boolean LOG_ATTACH_DETACH = false;
    private static final boolean LOG_EGL = false;
    private static final boolean LOG_PAUSE_RESUME = false;
    private static final boolean LOG_RENDERER = false;
    private static final boolean LOG_RENDERER_DRAW_FRAME = false;
    private static final boolean LOG_SURFACE = false;
    private static final boolean LOG_THREADS = false;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    private static final String TAG = "CustomGLSurfaceView";
    private static final k sGLThreadManager = new k();
    private int mDebugFlags;
    private boolean mDetached;
    private f mEGLConfigChooser;
    private int mEGLContextClientVersion;
    private g mEGLContextFactory;
    private h mEGLWindowSurfaceFactory;
    private j mGLThread;
    private l mGLWrapper;
    private boolean mPreserveEGLContextOnPause;
    private n mRenderer;
    private final WeakReference<CustomGLSurfaceView> mThisWeakRef;

    public abstract class b implements f {
        public int[] a;

        public b(int[] iArr) {
            this.a = b(iArr);
        }

        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public final int[] b(int[] iArr) {
            if (CustomGLSurfaceView.this.mEGLContextClientVersion != 2 && CustomGLSurfaceView.this.mEGLContextClientVersion != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (CustomGLSurfaceView.this.mEGLContextClientVersion == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        @Override // com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView.f
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

    public class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f8435c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8436e;
        public int f;
        public int g;
        public int h;
        public int i;

        public c(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f8435c = new int[1];
            this.d = i;
            this.f8436e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = i6;
        }

        @Override // com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView.b
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iC = c(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int iC2 = c(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (iC >= this.h && iC2 >= this.i) {
                    int iC3 = c(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int iC4 = c(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int iC5 = c(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int iC6 = c(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (iC3 == this.d && iC4 == this.f8436e && iC5 == this.f && iC6 == this.g) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        public final int c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f8435c) ? this.f8435c[0] : i2;
        }
    }

    public class d implements g {
        public int a;

        public d() {
            this.a = 12440;
        }

        @Override // com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView.g
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.a, CustomGLSurfaceView.this.mEGLContextClientVersion, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (CustomGLSurfaceView.this.mEGLContextClientVersion == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView.g
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            i.k("eglDestroyContex", egl10.eglGetError());
        }
    }

    public static class e implements h {
        public e() {
        }

        @Override // com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView.h
        public void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        @Override // com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView.h
        public EGLSurface b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e2) {
                Log.e(CustomGLSurfaceView.TAG, "eglCreateWindowSurface", e2);
                return null;
            }
        }
    }

    public interface f {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface g {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface h {
        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);

        EGLSurface b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);
    }

    public static class i {
        public WeakReference<CustomGLSurfaceView> a;
        public EGL10 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EGLDisplay f8438c;
        public EGLSurface d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public EGLConfig f8439e;
        public EGLContext f;

        public i(WeakReference<CustomGLSurfaceView> weakReference) {
            this.a = weakReference;
        }

        public static String f(String str, int i) {
            return str + " failed: " + bc6.a(i);
        }

        public static void g(String str, String str2, int i) {
            Log.w(str, f(str2, i));
        }

        public static void k(String str, int i) {
            throw new RuntimeException(f(str, i));
        }

        public GL a() {
            GL gl = this.f.getGL();
            CustomGLSurfaceView customGLSurfaceView = this.a.get();
            if (customGLSurfaceView == null) {
                return gl;
            }
            CustomGLSurfaceView.access$600(customGLSurfaceView);
            if ((customGLSurfaceView.mDebugFlags & 3) != 0) {
                return GLDebugHelper.wrap(gl, (customGLSurfaceView.mDebugFlags & 1) == 0 ? 0 : 1, (customGLSurfaceView.mDebugFlags & 2) != 0 ? new m() : null);
            }
            return gl;
        }

        public boolean b() {
            if (this.b == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f8438c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.f8439e == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            d();
            CustomGLSurfaceView customGLSurfaceView = this.a.get();
            if (customGLSurfaceView != null) {
                this.d = customGLSurfaceView.mEGLWindowSurfaceFactory.b(this.b, this.f8438c, this.f8439e, customGLSurfaceView.getHolder());
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
            if (this.b.eglMakeCurrent(this.f8438c, eGLSurface, eGLSurface, this.f)) {
                return true;
            }
            g("EGLHelper", "eglMakeCurrent", this.b.eglGetError());
            return false;
        }

        public void c() {
            d();
        }

        public final void d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.b.eglMakeCurrent(this.f8438c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            CustomGLSurfaceView customGLSurfaceView = this.a.get();
            if (customGLSurfaceView != null) {
                customGLSurfaceView.mEGLWindowSurfaceFactory.a(this.b, this.f8438c, this.d);
            }
            this.d = null;
        }

        public void e() {
            if (this.f != null) {
                CustomGLSurfaceView customGLSurfaceView = this.a.get();
                if (customGLSurfaceView != null) {
                    customGLSurfaceView.mEGLContextFactory.destroyContext(this.b, this.f8438c, this.f);
                }
                this.f = null;
            }
            EGLDisplay eGLDisplay = this.f8438c;
            if (eGLDisplay != null) {
                this.b.eglTerminate(eGLDisplay);
                this.f8438c = null;
            }
        }

        public void h() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.b = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f8438c = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            CustomGLSurfaceView customGLSurfaceView = this.a.get();
            if (customGLSurfaceView == null) {
                this.f8439e = null;
                this.f = null;
            } else {
                this.f8439e = customGLSurfaceView.mEGLConfigChooser.chooseConfig(this.b, this.f8438c);
                this.f = customGLSurfaceView.mEGLContextFactory.createContext(this.b, this.f8438c, this.f8439e);
            }
            EGLContext eGLContext = this.f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f = null;
                j("createContext");
            }
            this.d = null;
        }

        public int i() {
            return !this.b.eglSwapBuffers(this.f8438c, this.d) ? this.b.eglGetError() : MessageConstant$CommandId.COMMAND_BASE;
        }

        public final void j(String str) {
            k(str, this.b.eglGetError());
        }
    }

    public static class j extends Thread {
        public i C;
        public WeakReference<CustomGLSurfaceView> D;
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f8440j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f8441l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f8442n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public boolean s;
        public boolean y;
        public ArrayList<Runnable> z = new ArrayList<>();
        public boolean A = true;
        public Runnable B = null;
        public int t = 0;
        public int u = 0;
        public boolean w = true;
        public int v = 1;
        public boolean x = false;

        public j(WeakReference<CustomGLSurfaceView> weakReference) {
            this.D = weakReference;
        }

        public boolean a() {
            return this.p && this.q && i();
        }

        public int c() {
            int i;
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                i = this.v;
            }
            return i;
        }

        /* JADX WARN: Code duplicated, block: B:111:0x0179 A[Catch: all -> 0x0243, TryCatch #3 {all -> 0x0243, blocks: (B:3:0x001f, B:4:0x0023, B:87:0x013b, B:90:0x0144, B:92:0x014c, B:93:0x0150, B:100:0x0160, B:101:0x0161, B:102:0x0165, B:109:0x0176, B:111:0x0179, B:113:0x0185, B:116:0x019f, B:118:0x01a4, B:119:0x01a7, B:122:0x01ab, B:125:0x01c1, B:127:0x01c6, B:128:0x01c9, B:130:0x01cb, B:136:0x01e7, B:140:0x01f0, B:144:0x01fe, B:145:0x020b, B:152:0x021a, B:138:0x01ec, B:139:0x01ef, B:163:0x0242, B:5:0x0024, B:7:0x0028, B:16:0x0036, B:18:0x003e, B:85:0x0138, B:19:0x004b, B:21:0x0051, B:23:0x005c, B:25:0x0060, B:27:0x006c, B:29:0x0075, B:31:0x0079, B:33:0x007e, B:35:0x0082, B:40:0x0094, B:38:0x008e, B:41:0x0097, B:43:0x009b, B:45:0x009f, B:47:0x00a3, B:48:0x00a6, B:49:0x00b3, B:51:0x00b7, B:53:0x00bb, B:55:0x00c7, B:56:0x00d5, B:58:0x00da, B:59:0x00dd, B:61:0x00e3, B:65:0x00eb, B:67:0x00f1, B:69:0x00fd, B:70:0x0104, B:71:0x0105, B:73:0x0109, B:75:0x010d, B:76:0x0113, B:78:0x0117, B:80:0x011b, B:82:0x012a, B:160:0x0236, B:159:0x022b, B:115:0x018f, B:104:0x0167, B:105:0x0172, B:124:0x01b5, B:147:0x020d, B:148:0x0216, B:132:0x01d5, B:134:0x01e3, B:95:0x0152, B:96:0x015b), top: B:178:0x001f, inners: #0, #1, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:113:0x0185 A[Catch: all -> 0x0243, TRY_LEAVE, TryCatch #3 {all -> 0x0243, blocks: (B:3:0x001f, B:4:0x0023, B:87:0x013b, B:90:0x0144, B:92:0x014c, B:93:0x0150, B:100:0x0160, B:101:0x0161, B:102:0x0165, B:109:0x0176, B:111:0x0179, B:113:0x0185, B:116:0x019f, B:118:0x01a4, B:119:0x01a7, B:122:0x01ab, B:125:0x01c1, B:127:0x01c6, B:128:0x01c9, B:130:0x01cb, B:136:0x01e7, B:140:0x01f0, B:144:0x01fe, B:145:0x020b, B:152:0x021a, B:138:0x01ec, B:139:0x01ef, B:163:0x0242, B:5:0x0024, B:7:0x0028, B:16:0x0036, B:18:0x003e, B:85:0x0138, B:19:0x004b, B:21:0x0051, B:23:0x005c, B:25:0x0060, B:27:0x006c, B:29:0x0075, B:31:0x0079, B:33:0x007e, B:35:0x0082, B:40:0x0094, B:38:0x008e, B:41:0x0097, B:43:0x009b, B:45:0x009f, B:47:0x00a3, B:48:0x00a6, B:49:0x00b3, B:51:0x00b7, B:53:0x00bb, B:55:0x00c7, B:56:0x00d5, B:58:0x00da, B:59:0x00dd, B:61:0x00e3, B:65:0x00eb, B:67:0x00f1, B:69:0x00fd, B:70:0x0104, B:71:0x0105, B:73:0x0109, B:75:0x010d, B:76:0x0113, B:78:0x0117, B:80:0x011b, B:82:0x012a, B:160:0x0236, B:159:0x022b, B:115:0x018f, B:104:0x0167, B:105:0x0172, B:124:0x01b5, B:147:0x020d, B:148:0x0216, B:132:0x01d5, B:134:0x01e3, B:95:0x0152, B:96:0x015b), top: B:178:0x001f, inners: #0, #1, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:122:0x01ab A[Catch: all -> 0x0243, TRY_LEAVE, TryCatch #3 {all -> 0x0243, blocks: (B:3:0x001f, B:4:0x0023, B:87:0x013b, B:90:0x0144, B:92:0x014c, B:93:0x0150, B:100:0x0160, B:101:0x0161, B:102:0x0165, B:109:0x0176, B:111:0x0179, B:113:0x0185, B:116:0x019f, B:118:0x01a4, B:119:0x01a7, B:122:0x01ab, B:125:0x01c1, B:127:0x01c6, B:128:0x01c9, B:130:0x01cb, B:136:0x01e7, B:140:0x01f0, B:144:0x01fe, B:145:0x020b, B:152:0x021a, B:138:0x01ec, B:139:0x01ef, B:163:0x0242, B:5:0x0024, B:7:0x0028, B:16:0x0036, B:18:0x003e, B:85:0x0138, B:19:0x004b, B:21:0x0051, B:23:0x005c, B:25:0x0060, B:27:0x006c, B:29:0x0075, B:31:0x0079, B:33:0x007e, B:35:0x0082, B:40:0x0094, B:38:0x008e, B:41:0x0097, B:43:0x009b, B:45:0x009f, B:47:0x00a3, B:48:0x00a6, B:49:0x00b3, B:51:0x00b7, B:53:0x00bb, B:55:0x00c7, B:56:0x00d5, B:58:0x00da, B:59:0x00dd, B:61:0x00e3, B:65:0x00eb, B:67:0x00f1, B:69:0x00fd, B:70:0x0104, B:71:0x0105, B:73:0x0109, B:75:0x010d, B:76:0x0113, B:78:0x0117, B:80:0x011b, B:82:0x012a, B:160:0x0236, B:159:0x022b, B:115:0x018f, B:104:0x0167, B:105:0x0172, B:124:0x01b5, B:147:0x020d, B:148:0x0216, B:132:0x01d5, B:134:0x01e3, B:95:0x0152, B:96:0x015b), top: B:178:0x001f, inners: #0, #1, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:134:0x01e3 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #7 {all -> 0x01eb, blocks: (B:132:0x01d5, B:134:0x01e3), top: B:185:0x01d5, outer: #3 }] */
        /* JADX WARN: Code duplicated, block: B:142:0x01fa  */
        /* JADX WARN: Code duplicated, block: B:144:0x01fe A[Catch: all -> 0x0243, TryCatch #3 {all -> 0x0243, blocks: (B:3:0x001f, B:4:0x0023, B:87:0x013b, B:90:0x0144, B:92:0x014c, B:93:0x0150, B:100:0x0160, B:101:0x0161, B:102:0x0165, B:109:0x0176, B:111:0x0179, B:113:0x0185, B:116:0x019f, B:118:0x01a4, B:119:0x01a7, B:122:0x01ab, B:125:0x01c1, B:127:0x01c6, B:128:0x01c9, B:130:0x01cb, B:136:0x01e7, B:140:0x01f0, B:144:0x01fe, B:145:0x020b, B:152:0x021a, B:138:0x01ec, B:139:0x01ef, B:163:0x0242, B:5:0x0024, B:7:0x0028, B:16:0x0036, B:18:0x003e, B:85:0x0138, B:19:0x004b, B:21:0x0051, B:23:0x005c, B:25:0x0060, B:27:0x006c, B:29:0x0075, B:31:0x0079, B:33:0x007e, B:35:0x0082, B:40:0x0094, B:38:0x008e, B:41:0x0097, B:43:0x009b, B:45:0x009f, B:47:0x00a3, B:48:0x00a6, B:49:0x00b3, B:51:0x00b7, B:53:0x00bb, B:55:0x00c7, B:56:0x00d5, B:58:0x00da, B:59:0x00dd, B:61:0x00e3, B:65:0x00eb, B:67:0x00f1, B:69:0x00fd, B:70:0x0104, B:71:0x0105, B:73:0x0109, B:75:0x010d, B:76:0x0113, B:78:0x0117, B:80:0x011b, B:82:0x012a, B:160:0x0236, B:159:0x022b, B:115:0x018f, B:104:0x0167, B:105:0x0172, B:124:0x01b5, B:147:0x020d, B:148:0x0216, B:132:0x01d5, B:134:0x01e3, B:95:0x0152, B:96:0x015b), top: B:178:0x001f, inners: #0, #1, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:146:0x020c  */
        /* JADX WARN: Code duplicated, block: B:153:0x021b  */
        /* JADX WARN: Code duplicated, block: B:154:0x021e  */
        /* JADX WARN: Code duplicated, block: B:157:0x0225  */
        /* JADX WARN: Code duplicated, block: B:174:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:181:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:185:0x01d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:187:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:196:0x013f A[SYNTHETIC] */
        public final void d() throws InterruptedException {
            Runnable runnable;
            CustomGLSurfaceView customGLSurfaceView;
            int i;
            boolean z;
            CustomGLSurfaceView customGLSurfaceView2;
            CustomGLSurfaceView customGLSurfaceView3;
            boolean z2;
            this.C = new i(this.D);
            this.p = false;
            this.q = false;
            this.x = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            int i2 = 0;
            int i3 = 0;
            Runnable runnable2 = null;
            GL10 gl10 = null;
            Runnable runnableRemove = null;
            while (true) {
                try {
                    synchronized (CustomGLSurfaceView.sGLThreadManager) {
                        while (true) {
                            if (this.i) {
                                synchronized (CustomGLSurfaceView.sGLThreadManager) {
                                    o();
                                }
                                return;
                            }
                            if (!this.z.isEmpty()) {
                                runnableRemove = this.z.remove(0);
                                runnable = null;
                                break;
                            }
                            boolean z11 = this.f8441l;
                            boolean z12 = this.k;
                            if (z11 != z12) {
                                this.f8441l = z12;
                                CustomGLSurfaceView.sGLThreadManager.notifyAll();
                            } else {
                                z12 = false;
                            }
                            if (this.s) {
                                o();
                                n();
                                this.s = false;
                                z5 = true;
                            }
                            if (z3) {
                                o();
                                n();
                                z3 = false;
                            }
                            if (z12 && this.q) {
                                o();
                            }
                            if (z12 && this.p) {
                                CustomGLSurfaceView customGLSurfaceView4 = this.D.get();
                                if (!(customGLSurfaceView4 == null ? false : customGLSurfaceView4.mPreserveEGLContextOnPause)) {
                                    n();
                                }
                            }
                            if (!this.m && !this.o) {
                                if (this.q) {
                                    o();
                                }
                                this.o = true;
                                this.f8442n = false;
                                CustomGLSurfaceView.sGLThreadManager.notifyAll();
                            }
                            if (this.m && this.o) {
                                this.o = false;
                                CustomGLSurfaceView.sGLThreadManager.notifyAll();
                            }
                            if (z4) {
                                this.x = false;
                                this.y = true;
                                CustomGLSurfaceView.sGLThreadManager.notifyAll();
                                z4 = false;
                            }
                            Runnable runnable3 = this.B;
                            runnable = null;
                            if (runnable3 != null) {
                                this.B = null;
                                runnable2 = runnable3;
                            }
                            if (i()) {
                                if (!this.p) {
                                    if (z5) {
                                        z5 = false;
                                    } else {
                                        try {
                                            this.C.h();
                                            this.p = true;
                                            CustomGLSurfaceView.sGLThreadManager.notifyAll();
                                            z6 = true;
                                        } catch (RuntimeException e2) {
                                            CustomGLSurfaceView.sGLThreadManager.a(this);
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
                                    if (this.A) {
                                        i2 = this.t;
                                        i3 = this.u;
                                        this.x = true;
                                        this.A = false;
                                        z2 = false;
                                        z7 = true;
                                        z9 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    this.w = z2;
                                    CustomGLSurfaceView.sGLThreadManager.notifyAll();
                                    if (!this.x) {
                                        break;
                                    }
                                    z10 = true;
                                    break;
                                }
                            } else if (runnable2 != null) {
                                Log.w(CustomGLSurfaceView.TAG, "Warning, !readyToDraw() but waiting for draw finished! Early reporting draw finished.");
                                runnable2.run();
                                runnable2 = null;
                            }
                            CustomGLSurfaceView.sGLThreadManager.wait();
                        }
                    }
                    if (runnableRemove != null) {
                        runnableRemove.run();
                        runnableRemove = runnable;
                    } else {
                        if (z7) {
                            if (this.C.b()) {
                                synchronized (CustomGLSurfaceView.sGLThreadManager) {
                                    this.r = true;
                                    CustomGLSurfaceView.sGLThreadManager.notifyAll();
                                }
                                z7 = false;
                                if (z8) {
                                    gl10 = (GL10) this.C.a();
                                    z8 = false;
                                }
                                if (z6) {
                                    customGLSurfaceView3 = this.D.get();
                                    if (customGLSurfaceView3 != null) {
                                        Trace.beginSection("onSurfaceCreated");
                                        customGLSurfaceView3.mRenderer.onSurfaceCreated(gl10, this.C.f8439e);
                                        Trace.endSection();
                                    }
                                    z6 = false;
                                }
                                if (z9) {
                                    customGLSurfaceView2 = this.D.get();
                                    if (customGLSurfaceView2 != null) {
                                        Trace.beginSection("onSurfaceChanged");
                                        customGLSurfaceView2.mRenderer.onSurfaceChanged(gl10, i2, i3);
                                        Trace.endSection();
                                    }
                                    z9 = false;
                                }
                                customGLSurfaceView = this.D.get();
                                if (customGLSurfaceView != null) {
                                    Trace.beginSection("onDrawFrame");
                                    customGLSurfaceView.mRenderer.onDrawFrame(gl10);
                                    if (runnable2 != null) {
                                        runnable2.run();
                                        runnable2 = runnable;
                                    }
                                    Trace.endSection();
                                }
                                i = this.C.i();
                                if (i != 12288) {
                                    if (i != 12302) {
                                        i.g("GLThread", "eglSwapBuffers", i);
                                        synchronized (CustomGLSurfaceView.sGLThreadManager) {
                                            z = true;
                                            this.f8442n = true;
                                            CustomGLSurfaceView.sGLThreadManager.notifyAll();
                                        }
                                    } else {
                                        z = true;
                                        z3 = true;
                                    }
                                    if (z10) {
                                        z4 = z;
                                        z10 = false;
                                    }
                                } else {
                                    z = true;
                                }
                                z3 = z3;
                                if (z10) {
                                    z4 = z;
                                    z10 = false;
                                }
                            } else {
                                synchronized (CustomGLSurfaceView.sGLThreadManager) {
                                    this.r = true;
                                    this.f8442n = true;
                                    CustomGLSurfaceView.sGLThreadManager.notifyAll();
                                }
                            }
                            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                                o();
                                throw th;
                            }
                        }
                        if (z8) {
                            gl10 = (GL10) this.C.a();
                            z8 = false;
                        }
                        if (z6) {
                            customGLSurfaceView3 = this.D.get();
                            if (customGLSurfaceView3 != null) {
                                try {
                                    Trace.beginSection("onSurfaceCreated");
                                    customGLSurfaceView3.mRenderer.onSurfaceCreated(gl10, this.C.f8439e);
                                    Trace.endSection();
                                } catch (Throwable th) {
                                    Trace.endSection();
                                    throw th;
                                }
                            }
                            z6 = false;
                        }
                        if (z9) {
                            customGLSurfaceView2 = this.D.get();
                            if (customGLSurfaceView2 != null) {
                                try {
                                    Trace.beginSection("onSurfaceChanged");
                                    customGLSurfaceView2.mRenderer.onSurfaceChanged(gl10, i2, i3);
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                            z9 = false;
                        }
                        customGLSurfaceView = this.D.get();
                        if (customGLSurfaceView != null) {
                            try {
                                Trace.beginSection("onDrawFrame");
                                customGLSurfaceView.mRenderer.onDrawFrame(gl10);
                                if (runnable2 != null) {
                                    runnable2.run();
                                    runnable2 = runnable;
                                }
                                Trace.endSection();
                            } catch (Throwable th3) {
                                Trace.endSection();
                                throw th3;
                            }
                        }
                        i = this.C.i();
                        if (i != 12288) {
                            if (i != 12302) {
                                i.g("GLThread", "eglSwapBuffers", i);
                                synchronized (CustomGLSurfaceView.sGLThreadManager) {
                                    z = true;
                                    this.f8442n = true;
                                    CustomGLSurfaceView.sGLThreadManager.notifyAll();
                                }
                            } else {
                                z = true;
                                z3 = true;
                            }
                            if (z10) {
                                z4 = z;
                                z10 = false;
                            }
                        } else {
                            z = true;
                        }
                        z3 = z3;
                        if (z10) {
                            z4 = z;
                            z10 = false;
                        }
                    }
                } catch (Throwable th4) {
                    synchronized (CustomGLSurfaceView.sGLThreadManager) {
                        o();
                        throw th4;
                    }
                }
            }
        }

        public void e() {
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                this.k = true;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
                while (!this.f8440j && !this.f8441l) {
                    try {
                        CustomGLSurfaceView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void f() {
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                this.k = false;
                this.w = true;
                this.y = false;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
                while (!this.f8440j && this.f8441l && !this.y) {
                    try {
                        CustomGLSurfaceView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void g(int i, int i2) {
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                this.t = i;
                this.u = i2;
                this.A = true;
                this.w = true;
                this.y = false;
                if (Thread.currentThread() == this) {
                    return;
                }
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
                while (!this.f8440j && !this.f8441l && !this.y && a()) {
                    try {
                        CustomGLSurfaceView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void h(Runnable runnable) {
            if (runnable == null) {
                throw new IllegalArgumentException("r must not be null");
            }
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                this.z.add(runnable);
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
        }

        public final boolean i() {
            return !this.f8441l && this.m && !this.f8442n && this.t > 0 && this.u > 0 && (this.w || this.v == 1);
        }

        public void j() {
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                this.i = true;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
                while (!this.f8440j) {
                    try {
                        m(1);
                        CustomGLSurfaceView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void k() {
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                this.w = true;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
        }

        public void l(Runnable runnable) {
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                if (Thread.currentThread() == this) {
                    return;
                }
                this.x = true;
                this.w = true;
                this.y = false;
                this.B = runnable;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
        }

        public void m(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                this.v = i;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
        }

        public final void n() {
            if (this.p) {
                this.C.e();
                this.p = false;
                CustomGLSurfaceView.sGLThreadManager.a(this);
            }
        }

        public final void o() {
            if (this.q) {
                this.q = false;
                this.C.c();
            }
        }

        public void p() {
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                this.m = true;
                this.r = false;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
                while (this.o && !this.r && !this.f8440j) {
                    try {
                        CustomGLSurfaceView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void q() {
            synchronized (CustomGLSurfaceView.sGLThreadManager) {
                this.m = false;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
                while (!this.o && !this.f8440j) {
                    try {
                        CustomGLSurfaceView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                d();
                CustomGLSurfaceView.sGLThreadManager.b(this);
                synchronized (CustomGLSurfaceView.sGLThreadManager) {
                    n();
                }
            } catch (InterruptedException unused) {
                CustomGLSurfaceView.sGLThreadManager.b(this);
                synchronized (CustomGLSurfaceView.sGLThreadManager) {
                    n();
                }
            } catch (Throwable th) {
                CustomGLSurfaceView.sGLThreadManager.b(this);
                synchronized (CustomGLSurfaceView.sGLThreadManager) {
                    n();
                    throw th;
                }
            }
        }
    }

    public static class k {
        public k() {
        }

        public void a(j jVar) {
            notifyAll();
        }

        public synchronized void b(j jVar) {
            jVar.f8440j = true;
            notifyAll();
        }
    }

    public interface l {
    }

    public static class m extends Writer {
        public StringBuilder i = new StringBuilder();

        public final void a() {
            if (this.i.length() > 0) {
                Log.v(CustomGLSurfaceView.TAG, this.i.toString());
                StringBuilder sb = this.i;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
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

    public interface n {
        void onDrawFrame(GL10 gl10);

        void onSurfaceChanged(GL10 gl10, int i, int i2);

        void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);
    }

    public class o extends c {
        public o(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public CustomGLSurfaceView(Context context) {
        super(context);
        this.mThisWeakRef = new WeakReference<>(this);
        init();
    }

    public static /* synthetic */ l access$600(CustomGLSurfaceView customGLSurfaceView) {
        customGLSurfaceView.getClass();
        return null;
    }

    private void checkRenderThreadState() {
        if (this.mGLThread != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    private void init() {
        getHolder().addCallback(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finalize$0() {
        j jVar = this.mGLThread;
        if (jVar != null) {
            jVar.j();
        }
    }

    public void finalize() throws Throwable {
        try {
            AppExecutors.getInstance().diskIO().execute(new Runnable() { // from class: com.oplus.aiunit.vision.lf4
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$finalize$0();
                }
            });
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.mDebugFlags;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.mPreserveEGLContextOnPause;
    }

    public int getRenderMode() {
        return this.mGLThread.c();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mDetached && this.mRenderer != null) {
            j jVar = this.mGLThread;
            int iC = jVar != null ? jVar.c() : 1;
            j jVar2 = new j(this.mThisWeakRef);
            this.mGLThread = jVar2;
            if (iC != 1) {
                jVar2.m(iC);
            }
            this.mGLThread.start();
        }
        this.mDetached = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        j jVar = this.mGLThread;
        if (jVar != null) {
            jVar.j();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }

    public void onPause() {
        this.mGLThread.e();
    }

    public void onResume() {
        this.mGLThread.f();
    }

    public void queueEvent(Runnable runnable) {
        this.mGLThread.h(runnable);
    }

    public void requestRender() {
        this.mGLThread.k();
    }

    public void setDebugFlags(int i2) {
        this.mDebugFlags = i2;
    }

    public void setEGLConfigChooser(f fVar) {
        checkRenderThreadState();
        this.mEGLConfigChooser = fVar;
    }

    public void setEGLContextClientVersion(int i2) {
        checkRenderThreadState();
        this.mEGLContextClientVersion = i2;
    }

    public void setEGLContextFactory(g gVar) {
        checkRenderThreadState();
        this.mEGLContextFactory = gVar;
    }

    public void setEGLWindowSurfaceFactory(h hVar) {
        checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = hVar;
    }

    public void setGLWrapper(l lVar) {
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.mPreserveEGLContextOnPause = z;
    }

    public void setRenderMode(int i2) {
        this.mGLThread.m(i2);
    }

    public void setRenderer(n nVar) {
        checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = new o(true);
        }
        if (this.mEGLContextFactory == null) {
            this.mEGLContextFactory = new d();
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = new e();
        }
        this.mRenderer = nVar;
        j jVar = new j(this.mThisWeakRef);
        this.mGLThread = jVar;
        jVar.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        this.mGLThread.g(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mGLThread.p();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.mGLThread.q();
    }

    @Override // android.view.SurfaceHolder.Callback2
    @Deprecated
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        j jVar = this.mGLThread;
        if (jVar != null) {
            jVar.l(runnable);
        }
    }

    public void windowStopped(boolean z) {
        SdkDebugLog.d(TAG, "[windowStopped] stopped=" + z);
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new o(z));
    }

    public CustomGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mThisWeakRef = new WeakReference<>(this);
        init();
    }

    public void setEGLConfigChooser(int i2, int i3, int i4, int i5, int i6, int i7) {
        setEGLConfigChooser(new c(i2, i3, i4, i5, i6, i7));
    }
}
