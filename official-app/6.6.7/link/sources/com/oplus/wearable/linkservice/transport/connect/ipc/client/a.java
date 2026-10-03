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
import com.oplus.aiunit.vision.cs8;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.uml;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class a<T extends IInterface> {
    public static final Handler s = new Handler(Looper.getMainLooper());
    public final String a;
    public final ExecutorService b;
    public final ExecutorService c;
    public CountDownLatch d;
    public T e;
    public final Set<d> f;
    public final Intent g;
    public final Context h;
    public final e<T> i;
    public final int j;
    public final int k;
    public final Object l;
    public final f m;
    public int n;
    public int o;
    public final IBinder.DeathRecipient p;
    public final Runnable q;
    public final ServiceConnection r;

    public class a implements IBinder.DeathRecipient {
        public a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            synchronized (a.this.l) {
                if (a.this.e != null) {
                    a.this.e.asBinder().unlinkToDeath(this, 0);
                    a.this.e = null;
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
            synchronized (a.this.l) {
                uml.d(a.this.a, "mApiTimeout: timeout unbind");
                a.this.e = null;
                try {
                    a.this.h.unbindService(a.this.r);
                } catch (Exception e) {
                    uml.d(a.this.a, "mApiTimeout: timeout failed " + e);
                }
            }
        }
    }

    public class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            uml.d(a.this.a, "onServiceConnected: " + componentName);
            synchronized (a.this.l) {
                try {
                    a aVar = a.this;
                    aVar.e = (IInterface) aVar.i.a(iBinder);
                    a.this.e.asBinder().linkToDeath(a.this.p, 0);
                    if (a.this.m != null) {
                        a.this.m.a(iBinder);
                    }
                } catch (RemoteException e) {
                    uml.b(a.this.a, "onServiceConnected: linkToDeath exception " + e.toString());
                }
                if (a.this.n > 0) {
                    a.s.removeCallbacks(a.this.q);
                    a.s.postDelayed(a.this.q, a.this.n);
                }
                if (a.this.d != null) {
                    a.this.d.countDown();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            uml.k(a.this.a, "onServiceDisconnected: " + componentName);
            synchronized (a.this.l) {
                if (a.this.e != null) {
                    try {
                        a.this.e.asBinder().unlinkToDeath(a.this.p, 0);
                    } catch (Exception unused) {
                    }
                    a.this.e = null;
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
    public /* synthetic */ IInterface u(long j) throws Exception {
        T t;
        int i = 0;
        while (true) {
            t = this.e;
            if (t != null || i >= this.j) {
                break;
            }
            r();
            i++;
            long jUptimeMillis = SystemClock.uptimeMillis() - j;
            String str = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("getApiSync: retryTime=");
            sb.append(i);
            sb.append(" delay=");
            sb.append(jUptimeMillis);
            sb.append(" mApi=");
            sb.append(this.e != null);
            uml.d(str, sb.toString());
        }
        return t;
    }

    public void p(d dVar) {
        this.f.add(dVar);
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final boolean q() {
        try {
            return this.h.bindService(this.g, this.o, this.c, this.r);
        } catch (Exception e2) {
            uml.k(this.a, "bind: " + e2);
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
            uml.b(this.a, "bindPartnerApiSync: await exception " + e2.toString());
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
            synchronized (this.l) {
                this.e = null;
                try {
                    this.h.unbindService(this.r);
                } catch (Exception unused) {
                }
            }
            this.o = i;
        }
        if (this.e != null) {
            if (this.n > 0) {
                Handler handler = s;
                handler.removeCallbacks(this.q);
                handler.postDelayed(this.q, this.n);
            }
            return this.e;
        }
        if (Looper.getMainLooper() == Looper.myLooper() && this.e == null) {
            q();
            uml.b(this.a, "getApiSync: called main thread and api is null");
            return null;
        }
        synchronized (this) {
            T t = this.e;
            if (t != null) {
                return t;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                uml.b(this.a, "getApiSync: can not run in main thread");
                q();
                return null;
            }
            final long jUptimeMillis = SystemClock.uptimeMillis();
            boolean z = true;
            try {
                this.b.submit(new Callable() { // from class: com.oplus.aiunit.vision.x70
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.i.u(jUptimeMillis);
                    }
                }).get((this.j + 1) * this.k, TimeUnit.MILLISECONDS);
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (jUptimeMillis2 > 4000) {
                    th2 = new Throwable("called in main thread time out" + jUptimeMillis2);
                } else {
                    th2 = null;
                }
                str = this.a;
                StringBuilder sb = new StringBuilder();
                sb.append("getApiSync: delay=");
                sb.append(jUptimeMillis2);
                sb.append(" mApi=");
                if (this.e == null) {
                    z = false;
                }
                sb.append(z);
                sb.append(" e=");
                sb.append((Object) null);
                sb.append(" caller=");
                sb.append(m8b.e(th2));
                string = sb.toString();
            } catch (Exception e2) {
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (jUptimeMillis3 > 4000) {
                    th3 = new Throwable("called in main thread time out" + jUptimeMillis3);
                }
                str = this.a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getApiSync: delay=");
                sb2.append(jUptimeMillis3);
                sb2.append(" mApi=");
                if (this.e == null) {
                    z = false;
                }
                sb2.append(z);
                sb2.append(" e=");
                sb2.append(e2);
                sb2.append(" caller=");
                sb2.append(m8b.e(th3));
                string = sb2.toString();
            } catch (Throwable th4) {
                long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (jUptimeMillis4 > 4000) {
                    th = new Throwable("called in main thread time out" + jUptimeMillis4);
                } else {
                    th = null;
                }
                String str2 = this.a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getApiSync: delay=");
                sb3.append(jUptimeMillis4);
                sb3.append(" mApi=");
                if (this.e == null) {
                    z = false;
                }
                sb3.append(z);
                sb3.append(" e=");
                sb3.append((Object) null);
                sb3.append(" caller=");
                sb3.append(m8b.e(th));
                uml.d(str2, sb3.toString());
                throw th4;
            }
            uml.d(str, string);
            return this.e;
        }
    }

    public a(String str, Context context, Intent intent, int i, int i2, e<T> eVar, f fVar) {
        this.d = null;
        this.f = new HashSet();
        this.l = new Object();
        this.o = 1;
        this.p = new a();
        this.q = new b();
        this.r = new c();
        String str2 = "Api-" + str;
        this.a = str2;
        this.b = cs8.e(str2);
        this.c = cs8.e(str2);
        this.h = context.getApplicationContext();
        this.g = intent;
        this.i = eVar;
        this.j = i;
        this.k = i2;
        this.m = fVar;
    }
}
