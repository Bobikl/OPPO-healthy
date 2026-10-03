package com.heytap.accessory.connectivity.bt.ipc.client;

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
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class a<T extends IInterface> {
    public static final Handler r = new Handler(Looper.getMainLooper());
    public final ThreadPoolExecutor a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<d> f2503c;
    public final f d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Intent f2504e;
    public final Context f;
    public final e<T> g;
    public final int h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f2505j;
    public CountDownLatch k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public T f2506l;
    public final IBinder.DeathRecipient m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2507n;
    public final ServiceConnection o;
    public final Runnable p;
    public int q;

    /* JADX INFO: renamed from: com.heytap.accessory.connectivity.bt.ipc.client.a$a, reason: collision with other inner class name */
    public class C0235a implements IBinder.DeathRecipient {
        public C0235a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            synchronized (a.this.f2505j) {
                if (a.this.f2506l != null) {
                    a.this.f2506l.asBinder().unlinkToDeath(this, 0);
                    a.this.f2506l = null;
                    if (a.this.k != null) {
                        a.this.k.countDown();
                    }
                    Iterator it = a.this.f2503c.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).a();
                    }
                }
            }
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.heytap.accessory.base.logging.a.c(a.this.b, "onServiceConnected: " + componentName);
            synchronized (a.this.f2505j) {
                try {
                    a aVar = a.this;
                    aVar.f2506l = (IInterface) aVar.g.a(iBinder);
                    a.this.f2506l.asBinder().linkToDeath(a.this.m, 0);
                    if (a.this.d != null) {
                        a.this.d.a(iBinder);
                    }
                } catch (RemoteException e2) {
                    com.heytap.accessory.base.logging.a.b(a.this.b, "onServiceConnected: linkToDeath exception " + e2.toString());
                }
                if (a.this.f2507n > 0) {
                    a.r.removeCallbacks(a.this.p);
                    a.r.postDelayed(a.this.p, a.this.f2507n);
                }
                if (a.this.k != null) {
                    a.this.k.countDown();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.heytap.accessory.base.logging.a.e(a.this.b, "onServiceDisconnected: " + componentName);
            synchronized (a.this.f2505j) {
                if (a.this.f2506l != null) {
                    try {
                        a.this.f2506l.asBinder().unlinkToDeath(a.this.m, 0);
                    } catch (Exception unused) {
                    }
                    a.this.f2506l = null;
                }
                if (a.this.k != null) {
                    a.this.k.countDown();
                }
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this.f2505j) {
                com.heytap.accessory.base.logging.a.c(a.this.b, "mApiTimeout: timeout unbind");
                a.this.f2506l = null;
                a.this.f.unbindService(a.this.o);
            }
        }
    }

    public interface d {
        void a();
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

    public a(String str, Context context, Intent intent, int i, int i2, e<T> eVar, f fVar) {
        this.f2503c = new HashSet();
        this.f2505j = new Object();
        this.k = null;
        this.m = new C0235a();
        this.o = new b();
        this.p = new c();
        this.q = 1;
        this.b = "Api-" + str;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f = context.getApplicationContext();
        this.f2504e = intent;
        this.g = eVar;
        this.h = i;
        this.i = i2;
        this.d = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IInterface e() throws Exception {
        T t;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = 0;
        while (true) {
            t = this.f2506l;
            if (t != null || i >= this.h) {
                break;
            }
            c();
            i++;
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            String str = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append("getApiSync: retryTime=");
            sb.append(i);
            sb.append(" delay=");
            sb.append(jUptimeMillis2);
            sb.append(" mApi=");
            sb.append(this.f2506l != null);
            com.heytap.accessory.base.logging.a.c(str, sb.toString());
        }
        return t;
    }

    public final boolean b() {
        return this.f.bindService(this.f2504e, this.o, 1);
    }

    public final void c() {
        this.k = new CountDownLatch(1);
        if (!b()) {
            this.k.countDown();
        }
        try {
            this.k.await(this.i, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            com.heytap.accessory.base.logging.a.b(this.b, "bindPartnerApiSync: await exception " + e2.toString());
        }
    }

    @Nullable
    public T d() {
        return (T) a(1);
    }

    @Nullable
    public T a(int i) {
        if (i != this.q) {
            synchronized (this.f2505j) {
                this.f2506l = null;
                this.f.unbindService(this.o);
            }
            this.q = i;
        }
        if (this.f2506l != null) {
            if (this.f2507n > 0) {
                Handler handler = r;
                handler.removeCallbacks(this.p);
                handler.postDelayed(this.p, this.f2507n);
            }
            return this.f2506l;
        }
        if (Looper.getMainLooper() == Looper.myLooper() && this.f2506l == null) {
            b();
            com.heytap.accessory.base.logging.a.b(this.b, "getApiSync: called main thread and api is null");
            return null;
        }
        synchronized (this) {
            T t = this.f2506l;
            if (t != null) {
                return t;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                com.heytap.accessory.base.logging.a.b(this.b, "getApiSync: can not run in main thread");
                this.f.bindService(this.f2504e, this.o, 1);
                return null;
            }
            Future futureSubmit = this.a.submit(new Callable() { // from class: com.oplus.aiunit.vision.h8m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.i.e();
                }
            });
            int i2 = (this.h + 1) * this.i;
            try {
                futureSubmit.get(i2, TimeUnit.SECONDS);
            } catch (Exception e2) {
                com.heytap.accessory.base.logging.a.b(this.b, "getApiSync: get exception timeout=" + i2 + " " + e2.toString());
            }
            return this.f2506l;
        }
    }

    public void a(d dVar) {
        this.f2503c.add(dVar);
    }
}
