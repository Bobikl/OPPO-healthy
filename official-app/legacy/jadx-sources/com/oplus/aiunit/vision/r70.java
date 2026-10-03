package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public class r70<T extends IInterface> {
    public static final Handler t = new Handler(Looper.getMainLooper());
    public final String a;
    public final ExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f16097c;
    public CountDownLatch d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f16098e;
    public final Set<d> f;
    public final Intent g;
    public final Context h;
    public final e<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16099j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f16100l;
    public final f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f16101n;
    public int o;
    public int p;
    public final IBinder.DeathRecipient q;
    public final Runnable r;
    public final ServiceConnection s;

    public class a implements IBinder.DeathRecipient {
        public a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            String unused = r70.this.a;
            synchronized (r70.this.f16100l) {
                if (r70.this.f16098e != null) {
                    r70.this.f16098e.asBinder().unlinkToDeath(this, 0);
                    r70.this.f16098e = null;
                    if (r70.this.d != null) {
                        r70.this.d.countDown();
                    }
                    Iterator it = r70.this.f.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).onDead();
                    }
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (r70.this.f16100l) {
                a7b.f(r70.this.a, "mApiTimeout: timeout unbind");
                r70.this.f16098e = null;
                try {
                    r70.this.h.unbindService(r70.this.s);
                    r70.this.h.stopService(r70.this.g);
                } catch (Exception e2) {
                    a7b.f(r70.this.a, "mApiTimeout: timeout failed " + e2);
                }
            }
        }
    }

    public class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a7b.f(r70.this.a, "onServiceConnected: " + componentName);
            synchronized (r70.this.f16100l) {
                try {
                    r70 r70Var = r70.this;
                    r70Var.f16098e = (IInterface) r70Var.i.a(iBinder);
                    r70.this.f16098e.asBinder().linkToDeath(r70.this.q, 0);
                    if (r70.this.m != null) {
                        r70.this.m.a(iBinder);
                    }
                } catch (RemoteException e2) {
                    a7b.b(r70.this.a, "onServiceConnected: linkToDeath exception " + e2.toString());
                }
                if (r70.this.o > 0) {
                    r70.t.removeCallbacks(r70.this.r);
                    r70.t.postDelayed(r70.this.r, r70.this.o);
                }
                if (r70.this.d != null) {
                    r70.this.d.countDown();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a7b.m(r70.this.a, "onServiceDisconnected: " + componentName);
            synchronized (r70.this.f16100l) {
                if (r70.this.f16098e != null) {
                    try {
                        r70.this.f16098e.asBinder().unlinkToDeath(r70.this.q, 0);
                        if (r70.this.f16101n != null) {
                            r70.this.f16101n.onDisconnected();
                        }
                    } catch (Exception unused) {
                    }
                    r70.this.f16098e = null;
                }
                if (r70.this.d != null) {
                    r70.this.d.countDown();
                }
            }
        }
    }

    public interface d {
        void onDead();
    }

    public interface e<T> {
        T a(IBinder iBinder);
    }

    public interface f {
        void a(IBinder iBinder);
    }

    public interface g {
        void onDisconnected();
    }

    public r70(String str, Context context, Intent intent, e<T> eVar) {
        this(str, context, intent, 4, 500, eVar, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IInterface w(long j2) throws Exception {
        T t2;
        int i = 0;
        while (true) {
            t2 = this.f16098e;
            if (t2 != null || i >= this.f16099j) {
                break;
            }
            t();
            i++;
            long jUptimeMillis = SystemClock.uptimeMillis() - j2;
            String str = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("getApiSync: retryTime=");
            sb.append(i);
            sb.append(" delay=");
            sb.append(jUptimeMillis);
            sb.append(" mApi=");
            sb.append(this.f16098e != null);
            a7b.f(str, sb.toString());
        }
        return t2;
    }

    public void r(d dVar) {
        this.f.add(dVar);
    }

    public final boolean s() {
        try {
            return this.h.bindService(this.g, this.p, this.f16097c, this.s);
        } catch (Exception e2) {
            a7b.m(this.a, "bind: " + e2);
            return false;
        }
    }

    public final void t() {
        this.d = new CountDownLatch(1);
        if (!s()) {
            this.d.countDown();
        }
        try {
            this.d.await(this.k, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            a7b.b(this.a, "bindPartnerApiSync: await exception " + e2.toString());
        }
    }

    @Nullable
    public T u() {
        return (T) v(1);
    }

    @Nullable
    public T v(int i) {
        Throwable th;
        String str;
        String string;
        Throwable th2;
        Throwable th3 = null;
        if (i != this.p) {
            synchronized (this.f16100l) {
                this.f16098e = null;
                try {
                    this.h.unbindService(this.s);
                } catch (Exception unused) {
                }
            }
            this.p = i;
        }
        if (this.f16098e != null) {
            if (this.o > 0) {
                Handler handler = t;
                handler.removeCallbacks(this.r);
                handler.postDelayed(this.r, this.o);
            }
            return this.f16098e;
        }
        if (Looper.getMainLooper() == Looper.myLooper() && this.f16098e == null) {
            s();
            a7b.b(this.a, "getApiSync: called main thread and api is null");
            return null;
        }
        synchronized (this) {
            T t2 = this.f16098e;
            if (t2 != null) {
                return t2;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a7b.b(this.a, "getApiSync: can not run in main thread");
                s();
                return null;
            }
            final long jUptimeMillis = SystemClock.uptimeMillis();
            boolean z = true;
            try {
                this.b.submit(new Callable() { // from class: com.oplus.aiunit.vision.m70
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.i.w(jUptimeMillis);
                    }
                }).get((this.f16099j + 1) * this.k, TimeUnit.MILLISECONDS);
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (jUptimeMillis2 > xx0.SCROLL_DELAYED) {
                    th2 = new Throwable("called in main thread time out" + jUptimeMillis2);
                } else {
                    th2 = null;
                }
                str = this.a;
                StringBuilder sb = new StringBuilder();
                sb.append("getApiSync: delay=");
                sb.append(jUptimeMillis2);
                sb.append(" mApi=");
                if (this.f16098e == null) {
                    z = false;
                }
                sb.append(z);
                sb.append(" e=");
                sb.append((Object) null);
                sb.append(" caller=");
                sb.append(a7b.e(th2));
                string = sb.toString();
            } catch (Exception e2) {
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (jUptimeMillis3 > xx0.SCROLL_DELAYED) {
                    th3 = new Throwable("called in main thread time out" + jUptimeMillis3);
                }
                str = this.a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getApiSync: delay=");
                sb2.append(jUptimeMillis3);
                sb2.append(" mApi=");
                if (this.f16098e == null) {
                    z = false;
                }
                sb2.append(z);
                sb2.append(" e=");
                sb2.append(e2);
                sb2.append(" caller=");
                sb2.append(a7b.e(th3));
                string = sb2.toString();
            } catch (Throwable th4) {
                long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (jUptimeMillis4 > xx0.SCROLL_DELAYED) {
                    th = new Throwable("called in main thread time out" + jUptimeMillis4);
                } else {
                    th = null;
                }
                String str2 = this.a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getApiSync: delay=");
                sb3.append(jUptimeMillis4);
                sb3.append(" mApi=");
                if (this.f16098e == null) {
                    z = false;
                }
                sb3.append(z);
                sb3.append(" e=");
                sb3.append((Object) null);
                sb3.append(" caller=");
                sb3.append(a7b.e(th));
                a7b.f(str2, sb3.toString());
                throw th4;
            }
            a7b.f(str, string);
            return this.f16098e;
        }
    }

    public void x(int i) {
        if (this.o == 0) {
            t.removeCallbacks(this.r);
        } else {
            Handler handler = t;
            handler.removeCallbacks(this.r);
            handler.postDelayed(this.r, this.o);
        }
        this.o = i;
    }

    public void y() {
        Handler handler = t;
        handler.removeCallbacks(this.r);
        handler.post(this.r);
    }

    public r70(String str, Context context, Intent intent, e<T> eVar, f fVar, g gVar) {
        this(str, context, intent, 4, 500, eVar, fVar, gVar);
    }

    public r70(String str, Context context, Intent intent, int i, int i2, e<T> eVar, f fVar, g gVar) {
        this.d = null;
        this.f = new HashSet();
        this.f16100l = new Object();
        this.p = 1;
        this.q = new a();
        this.r = new b();
        this.s = new c();
        String str2 = "Api-" + str;
        this.a = str2;
        this.b = zq8.e(str2);
        this.f16097c = zq8.e(str2);
        this.h = context.getApplicationContext();
        this.g = intent;
        this.i = eVar;
        this.f16099j = i;
        this.k = i2;
        this.m = fVar;
        this.f16101n = gVar;
    }
}
