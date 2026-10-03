package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes12.dex */
public class egm {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f10923e = "OpenDeviceId library";
    public static boolean f = false;
    public Context a = null;
    public com.alipay.sdk.m.q0.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServiceConnection f10924c;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            egm.this.b = com.alipay.sdk.m.q0.a.AbstractBinderC0151a.a(iBinder);
            egm.c(egm.this);
            egm.this.g("Service onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            egm.this.b = null;
            egm.this.g("Service onServiceDisconnected");
        }
    }

    public interface b<T> {
    }

    public static /* synthetic */ b c(egm egmVar) {
        egmVar.getClass();
        return null;
    }

    public int a(Context context, b<String> bVar) {
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.a = context;
        this.f10924c = new a();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.a.bindService(intent, this.f10924c, 1)) {
            g("bindService Successful!");
            return 1;
        }
        g("bindService Failed!");
        return -1;
    }

    public final void e(String str) {
        if (f) {
            Log.e(f10923e, str);
        }
    }

    public String f() {
        if (this.a == null) {
            e("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            com.alipay.sdk.m.q0.a aVar = this.b;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        } catch (RemoteException e2) {
            e("getOAID error, RemoteException!");
            e2.printStackTrace();
            return null;
        }
    }

    public final void g(String str) {
        if (f) {
            Log.i(f10923e, str);
        }
    }

    public boolean h() {
        try {
            if (this.b == null) {
                return false;
            }
            g("Device support opendeviceid");
            return this.b.c();
        } catch (RemoteException unused) {
            e("isSupport error, RemoteException!");
            return false;
        }
    }
}
