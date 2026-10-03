package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.UserHandle;
import com.oplus.deepthinker.platform.server.IDeepThinkerBridge;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes5.dex */
public class hf3 {
    public static final Object m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ReadWriteLock f12131n = new ReentrantReadWriteLock();
    public final Context a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f12132c;
    public boolean g;
    public UserHandle h;
    public volatile IDeepThinkerBridge i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile IBinder f12134j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CountDownLatch f12135l;
    public final WeakHashMap<rvg, Object> d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ServiceConnection f12133e = new a();
    public final IBinder.DeathRecipient f = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.ef3
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.a.s();
        }
    };
    public volatile int k = 0;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            StringBuilder sb = new StringBuilder();
            sb.append("onServiceConnected ");
            sb.append(iBinder != null);
            g5g.e("ClientConnection", sb.toString());
            if (iBinder == null) {
                return;
            }
            hf3.f12131n.writeLock().lock();
            try {
                hf3.this.f12134j = iBinder;
                hf3.this.i = IDeepThinkerBridge.Stub.asInterface(iBinder);
                iBinder.linkToDeath(hf3.this.f, 0);
            } catch (RemoteException e2) {
                g5g.d("ClientConnection", "onServiceConnected: ", e2);
            } finally {
                if (hf3.this.i != null) {
                    hf3.this.k = 2;
                } else {
                    hf3.this.k = 3;
                }
                hf3.f12131n.writeLock().unlock();
                if (hf3.this.f12135l != null) {
                    hf3.this.f12135l.countDown();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            g5g.e("ClientConnection", "onServiceDisconnected");
            hf3.this.v();
            hf3.this.w();
        }
    }

    public hf3(Context context, Executor executor, Handler handler) {
        this.a = context;
        this.b = executor;
        this.f12132c = handler;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        g5g.e("ClientConnection", "binderDied");
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.concurrent.locks.Lock] */
    public /* synthetic */ void t(CountDownLatch countDownLatch) {
        ReadWriteLock readWriteLock;
        g5g.a("ClientConnection", "tryConnect: start connect on async thread.");
        if (!r() && q()) {
            g5g.h("ClientConnection", "tryConnect: bind service on main thread, ignore ileagal usage.");
            return;
        }
        ReadWriteLock readWriteLock2 = f12131n;
        readWriteLock2.writeLock().lock();
        if (this.k == 2) {
            try {
                g5g.h("ClientConnection", "tryConnect: Already connected, do not reconnect again.");
                return;
            } finally {
                f12131n.writeLock().unlock();
            }
        }
        if (this.k == 1) {
            try {
                g5g.h("ClientConnection", "tryConnect: Already do connecting, do not reconnect again.");
                readWriteLock2.writeLock().unlock();
                CountDownLatch countDownLatch2 = this.f12135l;
                if (countDownLatch2 != null) {
                    try {
                        countDownLatch2.await(2L, TimeUnit.SECONDS);
                        return;
                    } catch (InterruptedException e2) {
                        g5g.d("ClientConnection", "tryConnect: wait to be connected error: ", e2);
                        return;
                    }
                }
                return;
            } catch (Throwable th) {
                f12131n.writeLock().unlock();
                throw th;
            }
        }
        try {
            this.k = 1;
            this.f12135l = new CountDownLatch(1);
            readWriteLock2.writeLock().unlock();
            g5g.a("ClientConnection", "tryConnect: start bind service");
            try {
                if (m()) {
                    try {
                        this.f12135l.await(2L, TimeUnit.SECONDS);
                        readWriteLock2.writeLock().lock();
                        try {
                            if (this.k != 2) {
                                this.k = 3;
                            }
                            this = readWriteLock.writeLock();
                            this.unlock();
                        } catch (Throwable th2) {
                            f12131n.writeLock().unlock();
                            throw th2;
                        }
                    } catch (InterruptedException e3) {
                        g5g.d("ClientConnection", "tryConnect: connectBinderPoolService error: ", e3);
                        readWriteLock = f12131n;
                        readWriteLock.writeLock().lock();
                        try {
                            if (this.k != 2) {
                                this.k = 3;
                            }
                        } catch (Throwable th3) {
                            f12131n.writeLock().unlock();
                            throw th3;
                        }
                    }
                } else {
                    readWriteLock2.writeLock().lock();
                    try {
                        this.k = 3;
                        readWriteLock2.writeLock().unlock();
                        CountDownLatch countDownLatch3 = this.f12135l;
                        if (countDownLatch3 != null) {
                            countDownLatch3.countDown();
                        }
                        g5g.h("ClientConnection", "tryConnect: Bind Algorithm Service Failed!");
                    } catch (Throwable th4) {
                        f12131n.writeLock().unlock();
                        throw th4;
                    }
                }
                g5g.a("ClientConnection", "tryConnect: end connect on async thread.");
                countDownLatch.countDown();
            } catch (Throwable th5) {
                f12131n.writeLock().lock();
                try {
                    if (this.k != 2) {
                        this.k = 3;
                    }
                    throw th5;
                } finally {
                    f12131n.writeLock().unlock();
                }
            }
        } catch (Throwable th6) {
            f12131n.writeLock().unlock();
            throw th6;
        }
    }

    public final boolean l(Intent intent, ServiceConnection serviceConnection) {
        if (!this.g) {
            return r() ? this.a.bindService(intent, 1, this.b, serviceConnection) : this.a.bindService(intent, serviceConnection, 1);
        }
        UserHandle userHandleMyUserHandle = this.h;
        if (userHandleMyUserHandle == null) {
            userHandleMyUserHandle = Process.myUserHandle();
        }
        try {
            Boolean bool = (Boolean) this.a.getClass().getMethod("bindServiceAsUser", Intent.class, ServiceConnection.class, Integer.TYPE, Handler.class, UserHandle.class).invoke(this.a, intent, serviceConnection, 1, this.f12132c, userHandleMyUserHandle);
            if (bool != null) {
                return bool.booleanValue();
            }
        } catch (Exception e2) {
            g5g.d("ClientConnection", "bindService: bindServiceAsUser", e2);
        }
        return true;
    }

    public final boolean m() {
        return l(au9.a(), this.f12133e);
    }

    public final void n() {
        rvg[] rvgVarArr = new rvg[0];
        synchronized (m) {
            try {
                rvgVarArr = (rvg[]) this.d.keySet().toArray(new rvg[0]);
            } catch (Throwable th) {
                g5g.d("ClientConnection", "deliveryOnServiceDied", th);
            }
        }
        for (rvg rvgVar : rvgVarArr) {
            if (rvgVar != null) {
                rvgVar.a();
            }
        }
    }

    public IDeepThinkerBridge o() {
        g5g.e("ClientConnection", "getDeepThinkerBridge start");
        if (this.i == null) {
            ReadWriteLock readWriteLock = f12131n;
            readWriteLock.readLock().lock();
            try {
                boolean z = this.k == 2 || this.k == 1;
                boolean z2 = this.i == null;
                readWriteLock.readLock().unlock();
                if (z2) {
                    if (z) {
                        try {
                            CountDownLatch countDownLatch = this.f12135l;
                            if (countDownLatch != null) {
                                countDownLatch.await(2L, TimeUnit.SECONDS);
                            }
                        } catch (Exception e2) {
                            g5g.h("ClientConnection", "tryConnect: " + e2);
                        }
                    } else {
                        x();
                    }
                }
            } catch (Throwable th) {
                f12131n.readLock().unlock();
                throw th;
            }
        }
        IDeepThinkerBridge iDeepThinkerBridge = this.i;
        g5g.e("ClientConnection", "getDeepThinkerBridge end");
        return iDeepThinkerBridge;
    }

    public final void p() {
        if (Process.myUid() == 1000) {
            this.g = true;
            return;
        }
        try {
            this.g = "android.uid.system".equals(this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).sharedUserId);
        } catch (Exception e2) {
            g5g.h("ClientConnection", "initIsSystemUser " + e2);
        }
    }

    public final boolean q() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public final boolean r() {
        return true;
    }

    public final void u() {
        if (q()) {
            this.b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.gf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.n();
                }
            });
        } else {
            n();
        }
    }

    public void v() {
        IBinder iBinder = this.f12134j;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.f, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    public final void w() {
        ReadWriteLock readWriteLock;
        ReadWriteLock readWriteLock2 = f12131n;
        readWriteLock2.writeLock().lock();
        if (this.k == 3) {
            try {
                g5g.e("ClientConnection", "serviceDied: already disconnected.");
                return;
            } finally {
                f12131n.writeLock().unlock();
            }
        }
        try {
            this.i.asBinder().unlinkToDeath(this.f, 0);
            this.k = 3;
            this.i = null;
        } catch (Exception e2) {
            g5g.d("ClientConnection", "serviceDied: ", e2);
            this.k = 3;
            this.i = null;
            readWriteLock = f12131n;
        } finally {
            this.k = 3;
            this.i = null;
            f12131n.writeLock().unlock();
            u();
        }
        Lock lockWriteLock = readWriteLock.writeLock();
    }

    public final void x() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.ff3
            @Override // java.lang.Runnable
            public final void run() {
                this.i.t(countDownLatch);
            }
        });
        boolean zQ = q();
        if (!r() && zQ) {
            g5g.h("ClientConnection", "tryConnect: end. On Main Thread, reutrn directly.");
            return;
        }
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            g5g.d("ClientConnection", "tryConnect: interrupted.", e2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("tryConnect: end. On ");
        sb.append(zQ ? "Main" : "Async");
        sb.append(" Thread, connect ");
        sb.append(this.k == 2 ? "success." : "timeout.");
        g5g.e("ClientConnection", sb.toString());
    }
}
