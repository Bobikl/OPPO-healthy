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

/* JADX INFO: loaded from: classes5.dex */
public abstract class y5 {
    public Looper a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile HashMap<ComponentName, a> f18868c = new HashMap<>();

    public final class a {
        public Context a;
        public ComponentName b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HandlerC0945a f18869c;
        public ServiceConnection d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile int f18870e = 1;
        public volatile IWearableListener f = null;
        public final List<ev9> g = new CopyOnWriteArrayList();

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.y5$a$a, reason: collision with other inner class name */
        public final class HandlerC0945a extends Handler {
            public HandlerC0945a(Looper looper) {
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
            if (this.f18869c == null) {
                this.f18869c = new HandlerC0945a(looper);
            }
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            return this.b.equals((ComponentName) obj);
        }

        public final synchronized void g(ComponentName componentName) {
            wil.a("WearableClientProxy", "bindProxyService: " + componentName.toShortString());
            this.f18870e = 2;
            if (this.d == null) {
                this.d = new b();
            }
            Intent intent = new Intent(WearableListenerService.BIND_INTENT_ACTION);
            intent.setComponent(componentName);
            intent.setPackage(y5.this.c());
            if (this.a.bindService(intent, this.d, 1)) {
                wil.a("WearableClientProxy", "set bind timeout");
                if (this.f18869c.hasMessages(100)) {
                    this.f18869c.removeMessages(100);
                }
                this.f18869c.sendMessageDelayed(this.f18869c.obtainMessage(100), 1000L);
            } else {
                k(-2);
            }
        }

        public final void h(ev9 ev9Var) {
            if (i()) {
                ev9Var.execute(this.f);
                if (this.f18869c.hasMessages(101)) {
                    this.f18869c.removeMessages(101);
                }
                this.f18869c.sendMessageDelayed(this.f18869c.obtainMessage(101), 5000L);
                return;
            }
            if (j()) {
                wil.d("WearableClientProxy", "handleTask state:ing add task");
                synchronized (this.g) {
                    this.g.add(ev9Var);
                }
                return;
            }
            wil.a("WearableClientProxy", "handleTask state:other add task");
            g(this.b);
            synchronized (this.g) {
                this.g.add(ev9Var);
            }
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public final boolean i() {
            return this.f18870e == 3;
        }

        public final boolean j() {
            return this.f18870e == 2;
        }

        public final void k(int i) {
            wil.b("WearableClientProxy", "onProxyConnectFailed error:" + i);
            this.f18870e = 5;
            if (i == -1) {
                return;
            }
            synchronized (this.g) {
                this.g.clear();
            }
        }

        public final void l(IWearableListener iWearableListener) {
            wil.a("WearableClientProxy", "onServiceConnected");
            this.f18870e = 3;
            this.f = iWearableListener;
            if (this.f18869c.hasMessages(100)) {
                this.f18869c.removeMessages(100);
            }
            synchronized (this.g) {
                for (int i = 0; i < this.g.size(); i++) {
                    ev9 ev9Var = this.g.get(i);
                    if (ev9Var != null) {
                        ev9Var.execute(iWearableListener);
                    }
                }
                this.g.clear();
            }
            this.f18869c.sendMessageDelayed(this.f18869c.obtainMessage(101), 5000L);
        }

        public final void m() {
            wil.a("WearableClientProxy", "onServiceDisconnected");
            this.f18870e = 4;
            this.f = null;
            if (this.f18869c.hasMessages(101)) {
                this.f18869c.removeMessages(101);
                wil.a("WearableClientProxy", "clear connection timeout");
            }
        }

        public final synchronized void n(ComponentName componentName) {
            wil.a("WearableClientProxy", "unbindProxyService:" + componentName.toShortString());
            this.f18870e = 1;
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
            a aVar = (a) y5.this.f18868c.get(componentName);
            if (iWearableListenerAsInterface == null || aVar == null) {
                return;
            }
            aVar.l(iWearableListenerAsInterface);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a aVar = (a) y5.this.f18868c.get(componentName);
            if (aVar != null) {
                aVar.m();
            }
        }

        public b() {
        }
    }

    public y5(Context context, Looper looper) {
        this.b = context;
        if (looper == null) {
            this.a = context.getMainLooper();
        } else {
            this.a = looper;
        }
    }

    public void b(ComponentName componentName) {
        if (componentName != null) {
            if (this.f18868c.containsKey(componentName)) {
                wil.a("WearableClientProxy", "addServiceComponent: duplicate add");
                return;
            }
            this.f18868c.put(componentName, new a(this.b, this.a, componentName));
            wil.a("WearableClientProxy", "addServiceComponent: " + componentName);
        }
    }

    public abstract String c();

    public final void d(DeviceInfo deviceInfo, int i) {
        if (k()) {
            sz3 sz3VarA = sz3.a(deviceInfo, i);
            Iterator<a> it = this.f18868c.values().iterator();
            while (it.hasNext()) {
                it.next().h(sz3VarA);
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
            rc7 rc7VarA = rc7.a(fileTransferTask);
            Iterator<a> it = this.f18868c.values().iterator();
            while (it.hasNext()) {
                it.next().h(rc7VarA);
            }
        }
    }

    public void h(FileTransferTask fileTransferTask) {
        if (k()) {
            uc7 uc7VarA = uc7.a(fileTransferTask);
            Iterator<a> it = this.f18868c.values().iterator();
            while (it.hasNext()) {
                it.next().h(uc7VarA);
            }
        }
    }

    public void i(FileTransferTask fileTransferTask) {
        if (k()) {
            wc7 wc7VarA = wc7.a(fileTransferTask);
            Iterator<a> it = this.f18868c.values().iterator();
            while (it.hasNext()) {
                it.next().h(wc7VarA);
            }
        }
    }

    public void j(String str, MessageEvent messageEvent) {
        if (k()) {
            ezb ezbVarA = ezb.a(str, messageEvent);
            for (a aVar : this.f18868c.values()) {
                wil.a("WearableClientProxy", "async dispatch: " + aVar.b);
                aVar.h(ezbVarA);
            }
        }
    }

    public abstract boolean k();
}
