package com.badlogic.gdx.backends.android;

import android.app.WallpaperColors;
import android.graphics.Color;
import android.os.Bundle;
import android.service.wallpaper.WallpaperService;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.badlogic.gdx.Application;
import com.oplus.aiunit.vision.mk3;
import com.oplus.aiunit.vision.s30;
import com.oplus.aiunit.vision.x38;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AndroidLiveWallpaperService extends WallpaperService {
    public static boolean t = false;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1193l;
    public int m;
    public volatile com.badlogic.gdx.backends.android.a i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceHolder.Callback f1192j = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1194n = 0;
    public int o = 0;
    public volatile a p = null;
    public volatile boolean q = false;
    public volatile boolean r = false;
    public volatile int[] s = new int[0];

    public class a extends WallpaperService.Engine {
        public boolean a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1195c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1196e;
        public int f;
        public int g;
        public boolean h;
        public float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1197j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1198l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1199n;

        /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$a$a, reason: collision with other inner class name */
        public class RunnableC0168a implements Runnable {
            public RunnableC0168a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar;
                boolean z;
                synchronized (AndroidLiveWallpaperService.this.s) {
                    a aVar2 = AndroidLiveWallpaperService.this.p;
                    aVar = a.this;
                    z = aVar2 == aVar;
                }
                if (z) {
                    s30 s30Var = (s30) AndroidLiveWallpaperService.this.i.f1204n;
                    a aVar3 = a.this;
                    s30Var.b(aVar3.f, aVar3.g);
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar;
                boolean z;
                synchronized (AndroidLiveWallpaperService.this.s) {
                    a aVar2 = AndroidLiveWallpaperService.this.p;
                    aVar = a.this;
                    z = aVar2 == aVar;
                }
                if (z) {
                    s30 s30Var = (s30) AndroidLiveWallpaperService.this.i.f1204n;
                    a aVar3 = a.this;
                    s30Var.a(aVar3.i, aVar3.f1197j, aVar3.k, aVar3.f1198l, aVar3.m, aVar3.f1199n);
                }
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ boolean i;

            public c(boolean z) {
                this.i = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                com.badlogic.gdx.backends.android.a aVar;
                synchronized (AndroidLiveWallpaperService.this.s) {
                    if (AndroidLiveWallpaperService.this.q && AndroidLiveWallpaperService.this.r == this.i) {
                        z = false;
                    } else {
                        AndroidLiveWallpaperService.this.r = this.i;
                        AndroidLiveWallpaperService.this.q = true;
                        z = true;
                    }
                }
                if (!z || (aVar = AndroidLiveWallpaperService.this.i) == null) {
                    return;
                }
                ((s30) aVar.f1204n).c(this.i);
            }
        }

        public a() {
            super(AndroidLiveWallpaperService.this);
            this.a = false;
            this.f1196e = true;
            this.h = true;
            this.i = 0.0f;
            this.f1197j = 0.0f;
            this.k = 0.0f;
            this.f1198l = 0.0f;
            this.m = 0;
            this.f1199n = 0;
            if (AndroidLiveWallpaperService.t) {
                Log.d("WallpaperService", " > AndroidWallpaperEngine() " + hashCode());
            }
        }

        public void a() {
            if (AndroidLiveWallpaperService.this.p == this && (AndroidLiveWallpaperService.this.i.f1204n instanceof s30) && !this.f1196e) {
                this.f1196e = true;
                AndroidLiveWallpaperService.this.i.H(new RunnableC0168a());
            }
        }

        public void b() {
            if (AndroidLiveWallpaperService.this.p == this && (AndroidLiveWallpaperService.this.i.f1204n instanceof s30) && !this.h) {
                this.h = true;
                AndroidLiveWallpaperService.this.i.H(new b());
            }
        }

        public void c() {
            if (AndroidLiveWallpaperService.this.p == this && (AndroidLiveWallpaperService.this.i.f1204n instanceof s30)) {
                AndroidLiveWallpaperService.this.i.H(new c(AndroidLiveWallpaperService.this.p.isPreview()));
            }
        }

        public final void d(int i, int i2, int i3, boolean z) {
            if (!z) {
                AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
                if (i == androidLiveWallpaperService.k && i2 == androidLiveWallpaperService.f1193l && i3 == androidLiveWallpaperService.m) {
                    if (AndroidLiveWallpaperService.t) {
                        Log.d("WallpaperService", " > surface is current, skipping surfaceChanged event");
                        return;
                    }
                    return;
                }
            }
            this.b = i;
            this.f1195c = i2;
            this.d = i3;
            if (AndroidLiveWallpaperService.this.p != this) {
                if (AndroidLiveWallpaperService.t) {
                    Log.d("WallpaperService", " > engine is not active, skipping surfaceChanged event");
                    return;
                }
                return;
            }
            AndroidLiveWallpaperService androidLiveWallpaperService2 = AndroidLiveWallpaperService.this;
            androidLiveWallpaperService2.k = this.b;
            androidLiveWallpaperService2.f1193l = this.f1195c;
            androidLiveWallpaperService2.m = this.d;
            SurfaceHolder.Callback callback = androidLiveWallpaperService2.f1192j;
            SurfaceHolder surfaceHolder = getSurfaceHolder();
            AndroidLiveWallpaperService androidLiveWallpaperService3 = AndroidLiveWallpaperService.this;
            callback.surfaceChanged(surfaceHolder, androidLiveWallpaperService3.k, androidLiveWallpaperService3.f1193l, androidLiveWallpaperService3.m);
        }

        public final void e(boolean z) {
            if (this.a == z) {
                if (AndroidLiveWallpaperService.t) {
                    Log.d("WallpaperService", " > visible state is current, skipping visibilityChanged event!");
                }
            } else {
                this.a = z;
                if (z) {
                    g();
                } else {
                    f();
                }
            }
        }

        public void f() {
            AndroidLiveWallpaperService.this.o--;
            if (AndroidLiveWallpaperService.t) {
                StringBuilder sb = new StringBuilder();
                sb.append(" > AndroidWallpaperEngine - onPause() ");
                sb.append(hashCode());
                sb.append(", running: ");
                sb.append(AndroidLiveWallpaperService.this.f1194n);
                sb.append(", linked: ");
                sb.append(AndroidLiveWallpaperService.this.p == this);
                sb.append(", visible: ");
                sb.append(AndroidLiveWallpaperService.this.o);
                Log.d("WallpaperService", sb.toString());
            }
            Log.i("WallpaperService", "engine paused");
            AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
            if (androidLiveWallpaperService.o >= androidLiveWallpaperService.f1194n) {
                Log.e("WallpaperService", "wallpaper lifecycle error, counted too many visible engines! repairing..");
                AndroidLiveWallpaperService androidLiveWallpaperService2 = AndroidLiveWallpaperService.this;
                androidLiveWallpaperService2.o = Math.max(androidLiveWallpaperService2.f1194n - 1, 0);
            }
            if (AndroidLiveWallpaperService.this.p != null) {
                AndroidLiveWallpaperService androidLiveWallpaperService3 = AndroidLiveWallpaperService.this;
                if (androidLiveWallpaperService3.o == 0) {
                    androidLiveWallpaperService3.i.e();
                }
            }
            if (AndroidLiveWallpaperService.t) {
                Log.d("WallpaperService", " > AndroidWallpaperEngine - onPause() done!");
            }
        }

        public void g() {
            AndroidLiveWallpaperService.this.o++;
            if (AndroidLiveWallpaperService.t) {
                StringBuilder sb = new StringBuilder();
                sb.append(" > AndroidWallpaperEngine - onResume() ");
                sb.append(hashCode());
                sb.append(", running: ");
                sb.append(AndroidLiveWallpaperService.this.f1194n);
                sb.append(", linked: ");
                sb.append(AndroidLiveWallpaperService.this.p == this);
                sb.append(", visible: ");
                sb.append(AndroidLiveWallpaperService.this.o);
                Log.d("WallpaperService", sb.toString());
            }
            Log.i("WallpaperService", "engine resumed");
            if (AndroidLiveWallpaperService.this.p != null) {
                if (AndroidLiveWallpaperService.this.p != this) {
                    AndroidLiveWallpaperService.this.d(this);
                    AndroidLiveWallpaperService.this.f1192j.surfaceDestroyed(getSurfaceHolder());
                    d(this.b, this.f1195c, this.d, false);
                    AndroidLiveWallpaperService.this.f1192j.surfaceCreated(getSurfaceHolder());
                } else {
                    d(this.b, this.f1195c, this.d, false);
                }
                AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
                if (androidLiveWallpaperService.o == 1) {
                    androidLiveWallpaperService.i.f();
                }
                c();
                b();
                if (x38.graphics.c()) {
                    return;
                }
                x38.graphics.b();
            }
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public Bundle onCommand(String str, int i, int i2, int i3, Bundle bundle, boolean z) {
            if (AndroidLiveWallpaperService.t) {
                StringBuilder sb = new StringBuilder();
                sb.append(" > AndroidWallpaperEngine - onCommand(");
                sb.append(str);
                sb.append(" ");
                sb.append(i);
                sb.append(" ");
                sb.append(i2);
                sb.append(" ");
                sb.append(i3);
                sb.append(" ");
                sb.append(bundle);
                sb.append(" ");
                sb.append(z);
                sb.append("), linked: ");
                sb.append(AndroidLiveWallpaperService.this.p == this);
                Log.d("WallpaperService", sb.toString());
            }
            if (str.equals("android.home.drop")) {
                this.f1196e = false;
                this.f = i;
                this.g = i2;
                a();
            }
            return super.onCommand(str, i, i2, i3, bundle, z);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public WallpaperColors onComputeColors() {
            mk3[] mk3VarArr;
            Application application = x38.app;
            if (!(application instanceof com.badlogic.gdx.backends.android.a) || (mk3VarArr = ((com.badlogic.gdx.backends.android.a) application).u) == null) {
                return super.onComputeColors();
            }
            mk3 mk3Var = mk3VarArr[0];
            Color colorValueOf = Color.valueOf(mk3Var.a, mk3Var.b, mk3Var.f14109c, mk3Var.d);
            mk3 mk3Var2 = mk3VarArr[1];
            Color colorValueOf2 = Color.valueOf(mk3Var2.a, mk3Var2.b, mk3Var2.f14109c, mk3Var2.d);
            mk3 mk3Var3 = mk3VarArr[2];
            return new WallpaperColors(colorValueOf, colorValueOf2, Color.valueOf(mk3Var3.a, mk3Var3.b, mk3Var3.f14109c, mk3Var3.d));
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onCreate(SurfaceHolder surfaceHolder) {
            if (AndroidLiveWallpaperService.t) {
                StringBuilder sb = new StringBuilder();
                sb.append(" > AndroidWallpaperEngine - onCreate() ");
                sb.append(hashCode());
                sb.append(" running: ");
                sb.append(AndroidLiveWallpaperService.this.f1194n);
                sb.append(", linked: ");
                sb.append(AndroidLiveWallpaperService.this.p == this);
                sb.append(", thread: ");
                sb.append(Thread.currentThread().toString());
                Log.d("WallpaperService", sb.toString());
            }
            super.onCreate(surfaceHolder);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onDestroy() {
            super.onDestroy();
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onOffsetsChanged(float f, float f2, float f3, float f4, int i, int i2) {
            this.h = false;
            this.i = f;
            this.f1197j = f2;
            this.k = f3;
            this.f1198l = f4;
            this.m = i;
            this.f1199n = i2;
            b();
            if (!x38.graphics.c()) {
                x38.graphics.b();
            }
            super.onOffsetsChanged(f, f2, f3, f4, i, i2);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (AndroidLiveWallpaperService.t) {
                StringBuilder sb = new StringBuilder();
                sb.append(" > AndroidWallpaperEngine - onSurfaceChanged() isPreview: ");
                sb.append(isPreview());
                sb.append(", ");
                sb.append(hashCode());
                sb.append(", running: ");
                sb.append(AndroidLiveWallpaperService.this.f1194n);
                sb.append(", linked: ");
                sb.append(AndroidLiveWallpaperService.this.p == this);
                sb.append(", sufcace valid: ");
                sb.append(getSurfaceHolder().getSurface().isValid());
                Log.d("WallpaperService", sb.toString());
            }
            Log.i("WallpaperService", "engine surface changed");
            super.onSurfaceChanged(surfaceHolder, i, i2, i3);
            d(i, i2, i3, true);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceCreated(SurfaceHolder surfaceHolder) {
            AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
            androidLiveWallpaperService.f1194n++;
            androidLiveWallpaperService.d(this);
            if (AndroidLiveWallpaperService.t) {
                StringBuilder sb = new StringBuilder();
                sb.append(" > AndroidWallpaperEngine - onSurfaceCreated() ");
                sb.append(hashCode());
                sb.append(", running: ");
                sb.append(AndroidLiveWallpaperService.this.f1194n);
                sb.append(", linked: ");
                sb.append(AndroidLiveWallpaperService.this.p == this);
                Log.d("WallpaperService", sb.toString());
            }
            Log.i("WallpaperService", "engine surface created");
            super.onSurfaceCreated(surfaceHolder);
            AndroidLiveWallpaperService androidLiveWallpaperService2 = AndroidLiveWallpaperService.this;
            int i = androidLiveWallpaperService2.f1194n;
            if (i == 1) {
                androidLiveWallpaperService2.o = 0;
            }
            if (i != 1 || androidLiveWallpaperService2.i != null) {
                AndroidLiveWallpaperService.this.i.getClass();
                throw null;
            }
            AndroidLiveWallpaperService androidLiveWallpaperService3 = AndroidLiveWallpaperService.this;
            androidLiveWallpaperService3.k = 0;
            androidLiveWallpaperService3.f1193l = 0;
            androidLiveWallpaperService3.m = 0;
            androidLiveWallpaperService3.i = new com.badlogic.gdx.backends.android.a(androidLiveWallpaperService3);
            AndroidLiveWallpaperService.this.b();
            AndroidLiveWallpaperService.this.i.getClass();
            throw new Error("You must override 'AndroidLiveWallpaperService.onCreateApplication' method and call 'initialize' from its body.");
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
            SurfaceHolder.Callback callback;
            AndroidLiveWallpaperService.this.f1194n--;
            if (AndroidLiveWallpaperService.t) {
                StringBuilder sb = new StringBuilder();
                sb.append(" > AndroidWallpaperEngine - onSurfaceDestroyed() ");
                sb.append(hashCode());
                sb.append(", running: ");
                sb.append(AndroidLiveWallpaperService.this.f1194n);
                sb.append(" ,linked: ");
                sb.append(AndroidLiveWallpaperService.this.p == this);
                sb.append(", isVisible: ");
                sb.append(this.a);
                Log.d("WallpaperService", sb.toString());
            }
            Log.i("WallpaperService", "engine surface destroyed");
            AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
            if (androidLiveWallpaperService.f1194n == 0) {
                androidLiveWallpaperService.c();
            }
            if (AndroidLiveWallpaperService.this.p == this && (callback = AndroidLiveWallpaperService.this.f1192j) != null) {
                callback.surfaceDestroyed(surfaceHolder);
            }
            this.b = 0;
            this.f1195c = 0;
            this.d = 0;
            AndroidLiveWallpaperService androidLiveWallpaperService2 = AndroidLiveWallpaperService.this;
            if (androidLiveWallpaperService2.f1194n == 0) {
                androidLiveWallpaperService2.p = null;
            }
            super.onSurfaceDestroyed(surfaceHolder);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onTouchEvent(MotionEvent motionEvent) {
            if (AndroidLiveWallpaperService.this.p == this) {
                AndroidLiveWallpaperService.this.i.f1202j.onTouch(null, motionEvent);
            }
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onVisibilityChanged(boolean z) {
            boolean zIsVisible = isVisible();
            if (AndroidLiveWallpaperService.t) {
                Log.d("WallpaperService", " > AndroidWallpaperEngine - onVisibilityChanged(paramVisible: " + z + " reportedVisible: " + zIsVisible + ") " + hashCode() + ", sufcace valid: " + getSurfaceHolder().getSurface().isValid());
            }
            super.onVisibilityChanged(z);
            if (zIsVisible || !z) {
                e(z);
            } else if (AndroidLiveWallpaperService.t) {
                Log.d("WallpaperService", " > fake visibilityChanged event! Android WallpaperService likes do that!");
            }
        }
    }

    public WindowManager a() {
        return (WindowManager) getSystemService("window");
    }

    public void b() {
        if (t) {
            Log.d("WallpaperService", " > AndroidLiveWallpaperService - onCreateApplication()");
        }
    }

    public void c() {
        if (t) {
            Log.d("WallpaperService", " > AndroidLiveWallpaperService - onDeepPauseApplication()");
        }
        if (this.i == null) {
            return;
        }
        this.i.getClass();
        throw null;
    }

    public void d(a aVar) {
        synchronized (this.s) {
            this.p = aVar;
        }
    }

    public void finalize() throws Throwable {
        Log.i("WallpaperService", "service finalized");
        super.finalize();
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public void onCreate() {
        if (t) {
            Log.d("WallpaperService", " > AndroidLiveWallpaperService - onCreate() " + hashCode());
        }
        Log.i("WallpaperService", "service created");
        super.onCreate();
    }

    @Override // android.service.wallpaper.WallpaperService
    public WallpaperService.Engine onCreateEngine() {
        if (t) {
            Log.d("WallpaperService", " > AndroidLiveWallpaperService - onCreateEngine()");
        }
        Log.i("WallpaperService", "engine created");
        return new a();
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public void onDestroy() {
        if (t) {
            Log.d("WallpaperService", " > AndroidLiveWallpaperService - onDestroy() " + hashCode());
        }
        Log.i("WallpaperService", "service destroyed");
        super.onDestroy();
        if (this.i != null) {
            this.i.d();
            this.i = null;
            this.f1192j = null;
        }
    }
}
