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
import com.heytap.accessory.sdp.service.protocol.ServiceDiscoveryUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a<T extends IInterface> {
    public static final Handler r = new Handler(Looper.getMainLooper());
    public final ThreadPoolExecutor a;
    public final String b;
    public final Set<d> c;
    public final f d;
    public final Intent e;
    public final Context f;
    public final e<T> g;
    public final int h;
    public final int i;
    public final Object j;
    public CountDownLatch k;
    public T l;
    public final IBinder.DeathRecipient m;
    public int n;
    public final ServiceConnection o;
    public final Runnable p;
    public int q;

    public class a implements IBinder.DeathRecipient {
        public a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            synchronized (a.this.j) {
                if (a.this.l != null) {
                    a.this.l.asBinder().unlinkToDeath(this, 0);
                    a.this.l = null;
                    if (a.this.k != null) {
                        a.this.k.countDown();
                    }
                    Iterator it = a.this.c.iterator();
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
            synchronized (a.this.j) {
                try {
                    a aVar = a.this;
                    aVar.l = (IInterface) aVar.g.a(iBinder);
                    a.this.l.asBinder().linkToDeath(a.this.m, 0);
                    if (a.this.d != null) {
                        a.this.d.a(iBinder);
                    }
                } catch (RemoteException e) {
                    com.heytap.accessory.base.logging.a.b(a.this.b, "onServiceConnected: linkToDeath exception " + e.toString());
                }
                if (a.this.n > 0) {
                    a.r.removeCallbacks(a.this.p);
                    a.r.postDelayed(a.this.p, a.this.n);
                }
                if (a.this.k != null) {
                    a.this.k.countDown();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.heytap.accessory.base.logging.a.e(a.this.b, "onServiceDisconnected: " + componentName);
            synchronized (a.this.j) {
                if (a.this.l != null) {
                    try {
                        a.this.l.asBinder().unlinkToDeath(a.this.m, 0);
                    } catch (Exception unused) {
                    }
                    a.this.l = null;
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
            synchronized (a.this.j) {
                com.heytap.accessory.base.logging.a.c(a.this.b, "mApiTimeout: timeout unbind");
                a.this.l = null;
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
        this(str, context, intent, 4, ServiceDiscoveryUtils.ATTEMPT_INTERVAL, eVar, fVar);
    }

    public a(String str, Context context, Intent intent, int i, int i2, e<T> eVar, f fVar) {
        this.c = new HashSet();
        this.j = new Object();
        this.k = null;
        this.m = new a();
        this.o = new b();
        this.p = new c();
        this.q = 1;
        this.b = "Api-" + str;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f = context.getApplicationContext();
        this.e = intent;
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
            t = this.l;
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
            sb.append(this.l != null);
            com.heytap.accessory.base.logging.a.c(str, sb.toString());
        }
        return t;
    }

    public final boolean b() {
        return this.f.bindService(this.e, this.o, 1);
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
            synchronized (this.j) {
                this.l = null;
                this.f.unbindService(this.o);
            }
            this.q = i;
        }
        if (this.l != null) {
            if (this.n > 0) {
                Handler handler = r;
                handler.removeCallbacks(this.p);
                handler.postDelayed(this.p, this.n);
            }
            return this.l;
        }
        if (Looper.getMainLooper() == Looper.myLooper() && this.l == null) {
            b();
            com.heytap.accessory.base.logging.a.b(this.b, "getApiSync: called main thread and api is null");
            return null;
        }
        synchronized (this) {
            T t = this.l;
            if (t != null) {
                return t;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                com.heytap.accessory.base.logging.a.b(this.b, "getApiSync: can not run in main thread");
                this.f.bindService(this.e, this.o, 1);
                return null;
            }
            Future futureSubmit = this.a.submit(new Callable() { // from class: com.oplus.aiunit.vision.fcm
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
            return this.l;
        }
    }

    public void a(d dVar) {
        this.c.add(dVar);
    }
}
