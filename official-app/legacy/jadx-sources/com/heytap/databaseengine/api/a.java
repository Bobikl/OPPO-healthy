package com.heytap.databaseengine.api;

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
import com.oplus.aiunit.vision.me8;
import com.oplus.aiunit.vision.xx0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class a<T extends IInterface> {
    public static final Handler r = new Handler(Looper.getMainLooper());
    public final String a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f2826e;
    public final Intent g;
    public final Context h;
    public final e<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2827j;
    public final int k;
    public int m;
    public CountDownLatch d = null;
    public final Set<d> f = new HashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f2828l = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2829n = 1;
    public final IBinder.DeathRecipient o = new C0273a();
    public final Runnable p = new b();
    public final ServiceConnection q = new c();
    public final ExecutorService b = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.oplus.aiunit.vision.p70
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return com.heytap.databaseengine.api.a.w(runnable);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f2825c = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.oplus.aiunit.vision.q70
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return com.heytap.databaseengine.api.a.x(runnable);
        }
    });

    /* JADX INFO: renamed from: com.heytap.databaseengine.api.a$a, reason: collision with other inner class name */
    public class C0273a implements IBinder.DeathRecipient {
        public C0273a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            me8.a(a.this.a, "binderDied");
            synchronized (a.this.f2828l) {
                if (a.this.f2826e != null) {
                    a.this.f2826e.asBinder().unlinkToDeath(this, 0);
                    a.this.f2826e = null;
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
            synchronized (a.this.f2828l) {
                me8.e(a.this.a, "mApiTimeout: timeout unbind");
                a.this.f2826e = null;
                try {
                    a.this.h.unbindService(a.this.q);
                } catch (Exception e2) {
                    me8.e(a.this.a, "mApiTimeout: timeout failed " + e2);
                }
            }
        }
    }

    public class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            me8.e(a.this.a, "onServiceConnected: " + componentName);
            synchronized (a.this.f2828l) {
                try {
                    a aVar = a.this;
                    aVar.f2826e = (IInterface) aVar.i.a(iBinder);
                    if (a.this.f2826e != null) {
                        a.this.f2826e.asBinder().linkToDeath(a.this.o, 0);
                        a.m(a.this);
                    }
                } catch (RemoteException e2) {
                    me8.b(a.this.a, "onServiceConnected: linkToDeath exception " + e2.toString());
                }
                if (a.this.m > 0) {
                    a.r.removeCallbacks(a.this.p);
                    a.r.postDelayed(a.this.p, a.this.m);
                }
                if (a.this.d != null) {
                    a.this.d.countDown();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            me8.i(a.this.a, "onServiceDisconnected: " + componentName);
            synchronized (a.this.f2828l) {
                if (a.this.f2826e != null) {
                    try {
                        a.this.f2826e.asBinder().unlinkToDeath(a.this.o, 0);
                    } catch (Exception unused) {
                    }
                    a.this.f2826e = null;
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
    }

    public a(String str, Context context, Intent intent, int i, int i2, e<T> eVar, f fVar) {
        this.a = "Api-" + str;
        this.h = context.getApplicationContext();
        this.g = intent;
        this.i = eVar;
        this.f2827j = i;
        this.k = i2;
    }

    public static /* bridge */ /* synthetic */ f m(a aVar) {
        aVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IInterface v(long j2) throws Exception {
        T t;
        int i = 0;
        while (true) {
            t = this.f2826e;
            if (t != null || i >= this.f2827j) {
                break;
            }
            s();
            i++;
            long jUptimeMillis = SystemClock.uptimeMillis() - j2;
            String str = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("getApiSync: retryTime=");
            sb.append(i);
            sb.append(" delay=");
            sb.append(jUptimeMillis);
            sb.append(" mApi=");
            sb.append(this.f2826e != null);
            me8.e(str, sb.toString());
        }
        return t;
    }

    public static /* synthetic */ Thread w(Runnable runnable) {
        return new Thread(runnable, "DataApi-E");
    }

    public static /* synthetic */ Thread x(Runnable runnable) {
        return new Thread(runnable, "DataApi-B");
    }

    public final boolean r() {
        try {
            return this.h.bindService(this.g, this.f2829n, this.f2825c, this.q);
        } catch (Exception e2) {
            me8.i(this.a, "bind: " + e2);
            return false;
        }
    }

    public final void s() {
        this.d = new CountDownLatch(1);
        if (!r()) {
            this.d.countDown();
        }
        try {
            this.d.await(this.k, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            me8.b(this.a, "bindPartnerApiSync: await exception " + e2.toString());
        }
    }

    @Nullable
    public T t() {
        return (T) u(1);
    }

    @Nullable
    public T u(int i) {
        Throwable th;
        String str;
        String string;
        Throwable th2;
        Throwable th3 = null;
        if (i != this.f2829n) {
            synchronized (this.f2828l) {
                this.f2826e = null;
                try {
                    this.h.unbindService(this.q);
                } catch (Exception e2) {
                    me8.b(this.a, "getApiSync unbindService e:" + e2.getMessage());
                }
            }
            this.f2829n = i;
        }
        if (this.f2826e != null) {
            if (this.m > 0) {
                Handler handler = r;
                handler.removeCallbacks(this.p);
                handler.postDelayed(this.p, this.m);
            }
            return this.f2826e;
        }
        if (Looper.getMainLooper() == Looper.myLooper() && this.f2826e == null) {
            r();
            me8.b(this.a, "getApiSync: called main thread and api is null");
            return null;
        }
        synchronized (this) {
            T t = this.f2826e;
            if (t != null) {
                return t;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                me8.b(this.a, "getApiSync: can not run in main thread");
                r();
                return null;
            }
            final long jUptimeMillis = SystemClock.uptimeMillis();
            boolean z = true;
            try {
                try {
                    this.b.submit(new Callable() { // from class: com.oplus.aiunit.vision.o70
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.i.v(jUptimeMillis);
                        }
                    }).get((this.f2827j + 1) * this.k, TimeUnit.MILLISECONDS);
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
                    if (this.f2826e == null) {
                        z = false;
                    }
                    sb.append(z);
                    sb.append(" e=");
                    sb.append((Object) null);
                    sb.append(" caller=");
                    sb.append(me8.d(th2));
                    string = sb.toString();
                } catch (Exception e3) {
                    long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
                    if (jUptimeMillis3 > xx0.SCROLL_DELAYED) {
                        th3 = new Throwable("called in main thread time out" + jUptimeMillis3);
                    }
                    str = this.a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getApiSync: delay=");
                    sb2.append(jUptimeMillis3);
                    sb2.append(" mApi=");
                    if (this.f2826e == null) {
                        z = false;
                    }
                    sb2.append(z);
                    sb2.append(" e=");
                    sb2.append(e3);
                    sb2.append(" caller=");
                    sb2.append(me8.d(th3));
                    string = sb2.toString();
                }
                me8.e(str, string);
                return this.f2826e;
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
                if (this.f2826e == null) {
                    z = false;
                }
                sb3.append(z);
                sb3.append(" e=");
                sb3.append((Object) null);
                sb3.append(" caller=");
                sb3.append(me8.d(th));
                me8.e(str2, sb3.toString());
                throw th4;
            }
        }
    }

    public void y(int i) {
        if (this.m == 0) {
            r.removeCallbacks(this.p);
        } else {
            Handler handler = r;
            handler.removeCallbacks(this.p);
            handler.postDelayed(this.p, this.m);
        }
        this.m = i;
    }
}
