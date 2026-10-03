package com.oplus.wearable.linkservice;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.oplus.aiunit.vision.wil;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes5.dex */
public class WearableServer extends Service {
    public WearableApiManager i;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static volatile a f20140c;
        public boolean a = false;
        public ServiceConnection b = new ServiceConnectionC0984a();

        /* JADX INFO: renamed from: com.oplus.wearable.linkservice.WearableServer$a$a, reason: collision with other inner class name */
        public class ServiceConnectionC0984a implements ServiceConnection {
            public ServiceConnectionC0984a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        public static a b() {
            if (f20140c == null) {
                synchronized (a.class) {
                    if (f20140c == null) {
                        f20140c = new a();
                    }
                }
            }
            return f20140c;
        }

        public final synchronized void a(Context context) {
            wil.a("WearableServerManager", "acquireL");
            if (!this.a) {
                Intent intent = new Intent("com.heytap.wearable.linkservice.action.WEARABLE");
                intent.setComponent(new ComponentName(context, (Class<?>) WearableServer.class));
                context.bindService(intent, this.b, 1);
                this.a = true;
            }
        }

        public final synchronized void c(Context context, String str) {
            wil.a("WearableServerManager", "releaseL:" + str);
            if (this.a) {
                try {
                    context.unbindService(this.b);
                } catch (RuntimeException e2) {
                    wil.l("WearableServerManager", "Exception when unbinding from local service", e2);
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
        wil.d("WearableServer", "onBind: " + intent);
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
        wil.k("WearableServer", "onDestroy: " + this);
        this.i.y();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        wil.k("WearableServer", "onLowMemory: ");
        System.gc();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        wil.d("WearableServer", "onUnbind: ");
        a.b().c(getApplicationContext(), com.heytap.health.settings.me.thirdpartbinding.wechat.a.key_unbind);
        return super.onUnbind(intent);
    }
}
