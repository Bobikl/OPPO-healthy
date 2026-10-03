package com.oplus.wearable.linkservice;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.oplus.aiunit.vision.uml;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WearableServer extends Service {
    public WearableApiManager i;

    public static class a {
        public static volatile a c;
        public boolean a = false;
        public ServiceConnection b = new a();

        public class a implements ServiceConnection {
            public a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        public static a b() {
            if (c == null) {
                synchronized (a.class) {
                    if (c == null) {
                        c = new a();
                    }
                }
            }
            return c;
        }

        public final synchronized void a(Context context) {
            uml.a("WearableServerManager", "acquireL");
            if (!this.a) {
                Intent intent = new Intent("com.heytap.wearable.linkservice.action.WEARABLE");
                intent.setComponent(new ComponentName(context, (Class<?>) WearableServer.class));
                context.bindService(intent, this.b, 1);
                this.a = true;
            }
        }

        public final synchronized void c(Context context, String str) {
            uml.a("WearableServerManager", "releaseL:" + str);
            if (this.a) {
                try {
                    context.unbindService(this.b);
                } catch (RuntimeException e) {
                    uml.l("WearableServerManager", "Exception when unbinding from local service", e);
                }
                this.a = false;
            }
        }
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.i.q(printWriter, strArr);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        uml.d("WearableServer", "onBind: " + intent);
        a.b().a(getApplicationContext());
        return this.i.u().asBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        WearableApiManager wearableApiManagerV = WearableApiManager.v(getApplicationContext());
        this.i = wearableApiManagerV;
        wearableApiManagerV.w();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        uml.k("WearableServer", "onDestroy: " + this);
        this.i.y();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        uml.k("WearableServer", "onLowMemory: ");
        System.gc();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        uml.d("WearableServer", "onUnbind: ");
        a.b().c(getApplicationContext(), "unbind");
        return super.onUnbind(intent);
    }
}
