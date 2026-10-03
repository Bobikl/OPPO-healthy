package com.heytap.msp.ipc.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.msp.ipc.common.exception.IPCBridgeExecuteException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    public static final b b = new b();
    public final Map<String, C0717b> a = new ConcurrentHashMap();

    public class a implements ServiceConnection {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ CompatServiceClient.ServiceListener f7312j;
        public final /* synthetic */ CountDownLatch k;

        /* JADX INFO: renamed from: com.heytap.msp.ipc.client.b$a$a, reason: collision with other inner class name */
        public class C0716a implements IBinder.DeathRecipient {
            public final /* synthetic */ ComponentName a;

            public C0716a(ComponentName componentName) {
                this.a = componentName;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                h.g("BinderManager", "binderDied");
                C0717b c0717b = (C0717b) b.this.a.remove(a.this.i);
                if (c0717b != null) {
                    c0717b.c(this.a);
                }
            }
        }

        public a(String str, CompatServiceClient.ServiceListener serviceListener, CountDownLatch countDownLatch) {
            this.i = str;
            this.f7312j = serviceListener;
            this.k = countDownLatch;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            h.g("BinderManager", "onNullBinding:" + componentName);
            this.k.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h.g("COMPONENT", "service connected, component = " + componentName.toString());
            try {
                iBinder.linkToDeath(new C0716a(componentName), 0);
            } catch (RemoteException unused) {
            }
            C0717b c0717b = new C0717b(iBinder, this);
            c0717b.d(this.f7312j);
            if (b.this.a.put(this.i, c0717b) != null) {
                c0717b.b(componentName);
            }
            this.k.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            h.g("BinderManager", "onServiceDisconnected");
            C0717b c0717b = (C0717b) b.this.a.remove(this.i);
            if (c0717b != null) {
                c0717b.c(componentName);
            }
        }
    }

    /* JADX INFO: renamed from: com.heytap.msp.ipc.client.b$b, reason: collision with other inner class name */
    public static class C0717b {
        public IBinder a;
        public ServiceConnection b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<CompatServiceClient.ServiceListener> f7314c = new CopyOnWriteArrayList();

        public C0717b(IBinder iBinder, ServiceConnection serviceConnection) {
            this.a = iBinder;
            this.b = serviceConnection;
        }

        public boolean a() {
            return this.f7314c.size() > 0;
        }

        public void b(ComponentName componentName) {
            for (CompatServiceClient.ServiceListener serviceListener : this.f7314c) {
                if (serviceListener != null) {
                    serviceListener.onServiceConnected(componentName);
                }
            }
        }

        public void c(ComponentName componentName) {
            for (CompatServiceClient.ServiceListener serviceListener : this.f7314c) {
                if (serviceListener != null) {
                    serviceListener.onServiceDisconnected(componentName);
                }
            }
        }

        public void d(CompatServiceClient.ServiceListener serviceListener) {
            this.f7314c.add(serviceListener);
        }

        public void e(CompatServiceClient.ServiceListener serviceListener) {
            this.f7314c.remove(serviceListener);
        }
    }

    public static b d() {
        return b;
    }

    public synchronized void b(Context context, Intent intent, CompatServiceClient.ServiceListener serviceListener) {
        String str = intent.getPackage() + "/" + intent.getAction();
        h.a("BinderManager", "freeBinder, key = " + str);
        C0717b c0717b = this.a.get(str);
        if (c0717b != null) {
            c0717b.e(serviceListener);
            if (!c0717b.a()) {
                if (this.a.containsValue(c0717b)) {
                    this.a.remove(str);
                }
                h.d("COMPONENT", "service unbind, src = " + context.getPackageName() + ", dst = " + str);
                context.unbindService(c0717b.b);
            }
        }
    }

    public synchronized IBinder c(Context context, Intent intent, int i, CompatServiceClient.ServiceListener serviceListener) throws IPCBridgeExecuteException {
        C0717b c0717b;
        h.a("BinderManager", "getBinderSync");
        String str = intent.getPackage() + "/" + intent.getAction();
        h.g("BinderManager", "key:" + str);
        c0717b = this.a.get(str);
        if (c0717b == null || c0717b.a == null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            h.g("COMPONENT", "service bind, src = " + context.getPackageName() + ", dest = " + str);
            if (!context.bindService(intent, new a(str, serviceListener, countDownLatch), 1)) {
                h.b("BinderManager", "bindService failed");
                throw new IPCBridgeExecuteException("bindService failed", 101005);
            }
            try {
                h.g("BinderManager", "wait to connect");
                boolean zAwait = countDownLatch.await(i, TimeUnit.MILLISECONDS);
                h.g("BinderManager", "get iBinder from saved map");
                c0717b = this.a.get(str);
                if (c0717b == null && !zAwait) {
                    h.b("BinderManager", "service refused");
                    throw new IPCBridgeExecuteException("service refused", 101004);
                }
            } catch (InterruptedException e2) {
                h.b("BinderManager", "wait time out");
                throw new IPCBridgeExecuteException(e2, 101005);
            }
        } else {
            c0717b.f7314c.add(serviceListener);
        }
        return c0717b != null ? c0717b.a : null;
    }
}
