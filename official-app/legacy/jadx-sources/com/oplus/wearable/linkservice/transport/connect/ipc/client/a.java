package com.oplus.wearable.linkservice.transport.connect.ipc.client;

import android.annotation.SuppressLint;
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
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.xx0;
import com.oplus.aiunit.vision.zq8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class a<T extends IInterface> {
    public static final Handler s = new Handler(Looper.getMainLooper());
    public final String a;
    public final ExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f20152c;
    public CountDownLatch d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f20153e;
    public final Set<d> f;
    public final Intent g;
    public final Context h;
    public final e<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f20154j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f20155l;
    public final f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20156n;
    public int o;
    public final IBinder.DeathRecipient p;
    public final Runnable q;
    public final ServiceConnection r;

    /* JADX INFO: renamed from: com.oplus.wearable.linkservice.transport.connect.ipc.client.a$a, reason: collision with other inner class name */
    public class C0985a implements IBinder.DeathRecipient {
        public C0985a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            synchronized (a.this.f20155l) {
                if (a.this.f20153e != null) {
                    a.this.f20153e.asBinder().unlinkToDeath(this, 0);
                    a.this.f20153e = null;
                    if (a.this.d != null) {
                        a.this.d.countDown();
                    }
                    Iterator it = a.this.f.iterator();
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
            synchronized (a.this.f20155l) {
                wil.d(a.this.a, "mApiTimeout: timeout unbind");
                a.this.f20153e = null;
                try {
                    a.this.h.unbindService(a.this.r);
                } catch (Exception e2) {
                    wil.d(a.this.a, "mApiTimeout: timeout failed " + e2);
                }
            }
        }
    }

    public class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            wil.d(a.this.a, "onServiceConnected: " + componentName);
            synchronized (a.this.f20155l) {
                try {
                    a aVar = a.this;
                    aVar.f20153e = (IInterface) aVar.i.a(iBinder);
                    a.this.f20153e.asBinder().linkToDeath(a.this.p, 0);
                    if (a.this.m != null) {
                        a.this.m.a(iBinder);
                    }
                } catch (RemoteException e2) {
                    wil.b(a.this.a, "onServiceConnected: linkToDeath exception " + e2.toString());
                }
                if (a.this.f20156n > 0) {
                    a.s.removeCallbacks(a.this.q);
                    a.s.postDelayed(a.this.q, a.this.f20156n);
                }
                if (a.this.d != null) {
                    a.this.d.countDown();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            wil.k(a.this.a, "onServiceDisconnected: " + componentName);
            synchronized (a.this.f20155l) {
                if (a.this.f20153e != null) {
                    try {
                        a.this.f20153e.asBinder().unlinkToDeath(a.this.p, 0);
                    } catch (Exception unused) {
                    }
                    a.this.f20153e = null;
                }
                if (a.this.d != null) {
                    a.this.d.countDown();
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

    public a(String str, Context context, Intent intent, e<T> eVar, f fVar) {
        this(str, context, intent, 4, 500, eVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IInterface u(long j2) throws Exception {
        T t;
        int i = 0;
        while (true) {
            t = this.f20153e;
            if (t != null || i >= this.f20154j) {
                break;
            }
            r();
            i++;
            long jUptimeMillis = SystemClock.uptimeMillis() - j2;
            String str = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("getApiSync: retryTime=");
            sb.append(i);
            sb.append(" delay=");
            sb.append(jUptimeMillis);
            sb.append(" mApi=");
            sb.append(this.f20153e != null);
            wil.d(str, sb.toString());
        }
        return t;
    }

    public void p(d dVar) {
        this.f.add(dVar);
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final boolean q() {
        try {
            return this.h.bindService(this.g, this.o, this.f20152c, this.r);
        } catch (Exception e2) {
            wil.k(this.a, "bind: " + e2);
            return false;
        }
    }

    public final void r() {
        this.d = new CountDownLatch(1);
        if (!q()) {
            this.d.countDown();
        }
        try {
            this.d.await(this.k, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            wil.b(this.a, "bindPartnerApiSync: await exception " + e2.toString());
        }
    }

    @Nullable
    public T s() {
        return (T) t(1);
    }

    @Nullable
    public T t(int i) {
        Throwable th;
        String str;
        String string;
        Throwable th2;
        Throwable th3 = null;
        if (i != this.o) {
            synchronized (this.f20155l) {
                this.f20153e = null;
                try {
                    this.h.unbindService(this.r);
                } catch (Exception unused) {
                }
            }
            this.o = i;
        }
        if (this.f20153e != null) {
            if (this.f20156n > 0) {
                Handler handler = s;
                handler.removeCallbacks(this.q);
                handler.postDelayed(this.q, this.f20156n);
            }
            return this.f20153e;
        }
        if (Looper.getMainLooper() == Looper.myLooper() && this.f20153e == null) {
            q();
            wil.b(this.a, "getApiSync: called main thread and api is null");
            return null;
        }
        synchronized (this) {
            T t = this.f20153e;
            if (t != null) {
                return t;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                wil.b(this.a, "getApiSync: can not run in main thread");
                q();
                return null;
            }
            final long jUptimeMillis = SystemClock.uptimeMillis();
            boolean z = true;
            try {
                this.b.submit(new Callable() { // from class: com.oplus.aiunit.vision.n70
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.i.u(jUptimeMillis);
                    }
                }).get((this.f20154j + 1) * this.k, TimeUnit.MILLISECONDS);
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
                if (this.f20153e == null) {
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
                if (this.f20153e == null) {
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
                if (this.f20153e == null) {
                    z = false;
                }
                sb3.append(z);
                sb3.append(" e=");
                sb3.append((Object) null);
                sb3.append(" caller=");
                sb3.append(a7b.e(th));
                wil.d(str2, sb3.toString());
                throw th4;
            }
            wil.d(str, string);
            return this.f20153e;
        }
    }

    public a(String str, Context context, Intent intent, int i, int i2, e<T> eVar, f fVar) {
        this.d = null;
        this.f = new HashSet();
        this.f20155l = new Object();
        this.o = 1;
        this.p = new C0985a();
        this.q = new b();
        this.r = new c();
        String str2 = "Api-" + str;
        this.a = str2;
        this.b = zq8.e(str2);
        this.f20152c = zq8.e(str2);
        this.h = context.getApplicationContext();
        this.g = intent;
        this.i = eVar;
        this.f20154j = i;
        this.k = i2;
        this.m = fVar;
    }
}
