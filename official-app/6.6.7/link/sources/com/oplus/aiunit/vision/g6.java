package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.WearableListenerService;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class g6 {
    public Looper a;
    public Context b;
    public volatile HashMap<ComponentName, a> c = new HashMap<>();

    public final class a {
        public Context a;
        public ComponentName b;
        public a c;
        public ServiceConnection d = null;
        public volatile int e = 1;
        public volatile IWearableListener f = null;
        public final List<lw9> g = new CopyOnWriteArrayList();

        public final class a extends Handler {
            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 100) {
                    a.this.k(-1);
                } else {
                    if (i != 101) {
                        return;
                    }
                    a aVar = a.this;
                    aVar.n(aVar.b);
                }
            }
        }

        public a(Context context, Looper looper, ComponentName componentName) {
            this.a = context;
            this.b = componentName;
            if (this.c == null) {
                this.c = new a(looper);
            }
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            return this.b.equals((ComponentName) obj);
        }

        public final synchronized void g(ComponentName componentName) {
            uml.a("WearableClientProxy", "bindProxyService: " + componentName.toShortString());
            this.e = 2;
            if (this.d == null) {
                this.d = new b();
            }
            Intent intent = new Intent(WearableListenerService.BIND_INTENT_ACTION);
            intent.setComponent(componentName);
            intent.setPackage(g6.this.c());
            if (this.a.bindService(intent, this.d, 1)) {
                uml.a("WearableClientProxy", "set bind timeout");
                if (this.c.hasMessages(100)) {
                    this.c.removeMessages(100);
                }
                this.c.sendMessageDelayed(this.c.obtainMessage(100), 1000L);
            } else {
                k(-2);
            }
        }

        public final void h(lw9 lw9Var) {
            if (i()) {
                lw9Var.execute(this.f);
                if (this.c.hasMessages(101)) {
                    this.c.removeMessages(101);
                }
                this.c.sendMessageDelayed(this.c.obtainMessage(101), 5000L);
                return;
            }
            if (j()) {
                uml.d("WearableClientProxy", "handleTask state:ing add task");
                synchronized (this.g) {
                    this.g.add(lw9Var);
                }
                return;
            }
            uml.a("WearableClientProxy", "handleTask state:other add task");
            g(this.b);
            synchronized (this.g) {
                this.g.add(lw9Var);
            }
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public final boolean i() {
            return this.e == 3;
        }

        public final boolean j() {
            return this.e == 2;
        }

        public final void k(int i) {
            uml.b("WearableClientProxy", "onProxyConnectFailed error:" + i);
            this.e = 5;
            if (i == -1) {
                return;
            }
            synchronized (this.g) {
                this.g.clear();
            }
        }

        public final void l(IWearableListener iWearableListener) {
            uml.a("WearableClientProxy", "onServiceConnected");
            this.e = 3;
            this.f = iWearableListener;
            if (this.c.hasMessages(100)) {
                this.c.removeMessages(100);
            }
            synchronized (this.g) {
                for (int i = 0; i < this.g.size(); i++) {
                    lw9 lw9Var = this.g.get(i);
                    if (lw9Var != null) {
                        lw9Var.execute(iWearableListener);
                    }
                }
                this.g.clear();
            }
            this.c.sendMessageDelayed(this.c.obtainMessage(101), 5000L);
        }

        public final void m() {
            uml.a("WearableClientProxy", "onServiceDisconnected");
            this.e = 4;
            this.f = null;
            if (this.c.hasMessages(101)) {
                this.c.removeMessages(101);
                uml.a("WearableClientProxy", "clear connection timeout");
            }
        }

        public final synchronized void n(ComponentName componentName) {
            uml.a("WearableClientProxy", "unbindProxyService:" + componentName.toShortString());
            this.e = 1;
            ServiceConnection serviceConnection = this.d;
            if (serviceConnection != null) {
                this.a.unbindService(serviceConnection);
            }
            this.f = null;
            this.d = null;
        }
    }

    public final class b implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IWearableListener iWearableListenerAsInterface = IWearableListener.Stub.asInterface(iBinder);
            a aVar = (a) g6.this.c.get(componentName);
            if (iWearableListenerAsInterface == null || aVar == null) {
                return;
            }
            aVar.l(iWearableListenerAsInterface);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a aVar = (a) g6.this.c.get(componentName);
            if (aVar != null) {
                aVar.m();
            }
        }

        public b() {
        }
    }

    public g6(Context context, Looper looper) {
        this.b = context;
        if (looper == null) {
            this.a = context.getMainLooper();
        } else {
            this.a = looper;
        }
    }

    public void b(ComponentName componentName) {
        if (componentName != null) {
            if (this.c.containsKey(componentName)) {
                uml.a("WearableClientProxy", "addServiceComponent: duplicate add");
                return;
            }
            this.c.put(componentName, new a(this.b, this.a, componentName));
            uml.a("WearableClientProxy", "addServiceComponent: " + componentName);
        }
    }

    public abstract String c();

    public final void d(DeviceInfo deviceInfo, int i) {
        if (k()) {
            f04 f04VarA = f04.a(deviceInfo, i);
            Iterator<a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().h(f04VarA);
            }
        }
    }

    public void e(DeviceInfo deviceInfo) {
        d(deviceInfo, 2);
    }

    public void f(DeviceInfo deviceInfo) {
        d(deviceInfo, 3);
    }

    public void g(FileTransferTask fileTransferTask) {
        if (k()) {
            td7 td7VarA = td7.a(fileTransferTask);
            Iterator<a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().h(td7VarA);
            }
        }
    }

    public void h(FileTransferTask fileTransferTask) {
        if (k()) {
            wd7 wd7VarA = wd7.a(fileTransferTask);
            Iterator<a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().h(wd7VarA);
            }
        }
    }

    public void i(FileTransferTask fileTransferTask) {
        if (k()) {
            yd7 yd7VarA = yd7.a(fileTransferTask);
            Iterator<a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().h(yd7VarA);
            }
        }
    }

    public void j(String str, MessageEvent messageEvent) {
        if (k()) {
            t0c t0cVarA = t0c.a(str, messageEvent);
            for (a aVar : this.c.values()) {
                uml.a("WearableClientProxy", "async dispatch: " + aVar.b);
                aVar.h(t0cVarA);
            }
        }
    }

    public abstract boolean k();
}
